package io.cattle.platform.host.service.impl;

import io.cattle.platform.archaius.util.ArchaiusUtil;
import io.cattle.platform.core.constants.CommonStatesConstants;
import io.cattle.platform.core.constants.HostConstants;
import io.cattle.platform.core.constants.IpAddressConstants;
import io.cattle.platform.core.model.Host;
import io.cattle.platform.core.model.IpAddress;
import io.cattle.platform.host.model.HostApiAccess;
import io.cattle.platform.host.service.HostApiRSAKeyProvider;
import io.cattle.platform.host.service.HostApiService;
import io.cattle.platform.object.ObjectManager;
import io.cattle.platform.object.util.DataAccessor;
import io.cattle.platform.token.TokenService;
import io.github.ibuildthecloud.gdapi.context.ApiContext;
import io.github.ibuildthecloud.gdapi.exception.ClientVisibleException;
import io.github.ibuildthecloud.gdapi.util.ResponseCodes;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import com.netflix.config.DynamicStringProperty;

public class HostApiServiceImpl implements HostApiService {

    private static final String HOST_UUID = "hostUuid";
    private static final String IP_ADDRESS = "ipAddress";
    private static final String PORT = "port";

    private static final DynamicStringProperty HEADER_AUTH = ArchaiusUtil.getString("host.api.auth.header");
    private static final DynamicStringProperty HEADER_AUTH_VALUE = ArchaiusUtil.getString("host.api.auth.header.value");

    ObjectManager objectManager;
    TokenService tokenService;
    HostApiRSAKeyProvider keyProvider;

    @Override
    public HostApiAccess getAccess(Long hostId, int port, Map<String, Object> data) {
        Host host = objectManager.loadResource(Host.class, hostId);
        if (host == null) {
            return null;
        }

        IpAddress ip = getIpAddress(host);
        if (ip == null || ip.getAddress() == null) {
            return null;
        }

        String token = getToken(ip, port, host, data);
        if (token == null) {
            return null;
        }

        Map<String, String> values = new HashMap<String, String>();
        values.put(HEADER_AUTH.get(), String.format(HEADER_AUTH_VALUE.get(), token));

        return new HostApiAccess(getHostAddress(host), token, values);
    }

    protected String getHostAddress(Host host) {
        // TODO Can we drop support for FIELD_API_PROXY?
        // String proxy = DataAccessor.fieldString(host, HostConstants.FIELD_API_PROXY);

        // TODO Implement HA-aware proxy lookup
        if (ApiContext.getContext() == null || ApiContext.getContext().getApiRequest() == null) {
            throw new ClientVisibleException(ResponseCodes.INTERNAL_SERVER_ERROR, "CantConstructUrl");
        }

        String responseBaseUrl = ApiContext.getContext().getApiRequest().getResponseUrlBase();
        try {
            URL url = new URL(responseBaseUrl);
            return String.format("%s:%d", url.getHost(), url.getPort());
        } catch (MalformedURLException e) {
            throw new ClientVisibleException(ResponseCodes.INTERNAL_SERVER_ERROR, "CantConstructUrl");
        }
    }

    @Override
    public Map<String, PublicKey> getPublicKeys() {
        return keyProvider.getPublicKeys();
    }

    protected String getToken(IpAddress ip, int port, Host host, Map<String, Object> inputData) {
        // TODO Figure out if we really need to put the ip and port into the token
        Map<String, Object> data = new HashMap<String, Object>(inputData);
        String uuid = DataAccessor.fields(host).withKey(HostConstants.FIELD_REPORTED_UUID).as(String.class);
        if (uuid != null) {
            data.put(HOST_UUID, uuid);
        } else {
            data.put(HOST_UUID, host.getUuid());
        }

        data.put(IP_ADDRESS, ip.getAddress());
        if (port > 0) {
            data.put(PORT, port);
        }

        return tokenService.generateToken(data);
    }

    protected IpAddress getIpAddress(Host host) {
        IpAddress choice = null;

        for (IpAddress ip : objectManager.mappedChildren(host, IpAddress.class)) {
            if (ip.getAddress() == null || !CommonStatesConstants.ACTIVE.equals(ip.getState())) {
                continue;
            }

            if (IpAddressConstants.ROLE_PRIMARY.equals(ip.getRole())) {
                choice = ip;
                break;
            } else if (choice == null || choice.getCreated() == null) {
                choice = ip;
            } else if (ip.getCreated() != null && ip.getCreated().before(choice.getCreated())) {
                choice = ip;
            }
        }

        return choice;
    }

    public ObjectManager getObjectManager() {
        return objectManager;
    }

    @Inject
    public void setObjectManager(ObjectManager objectManager) {
        this.objectManager = objectManager;
    }

    public TokenService getTokenService() {
        return tokenService;
    }

    @Inject
    public void setTokenService(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    public HostApiRSAKeyProvider getKeyProvider() {
        return keyProvider;
    }

    @Inject
    public void setKeyProvider(HostApiRSAKeyProvider keyProvider) {
        this.keyProvider = keyProvider;
    }

}
