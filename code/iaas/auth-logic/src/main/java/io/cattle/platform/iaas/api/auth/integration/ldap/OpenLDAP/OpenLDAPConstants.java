package io.cattle.platform.iaas.api.auth.integration.ldap.OpenLDAP;

import io.cattle.platform.archaius.util.ArchaiusUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.netflix.config.DynamicBooleanProperty;
import com.netflix.config.DynamicIntProperty;
import com.netflix.config.DynamicStringProperty;

public class OpenLDAPConstants {

    public static final String NAME = "openldap";
    public static final String USER_SCOPE = NAME + "_user";
    public static final String GROUP_SCOPE = NAME + "_group";

    public static final String ACCESSMODE = "accessMode";
    public static final String CONFIG = NAME + "config";
    public static final String DOMAIN = "domain";
    public static final String LDAP_ACCESS_TOKEN = NAME + "AccessToken";
    public static final String LDAP_JWT = NAME + "Jwt";
    public static final String LOGIN_DOMAIN = "loginDomain";
    public static final String PORT = "port";
    public static final String SERVER = "server";
    public static final String SERVICE_ACCOUNT_PASSWORD_FIELD = "serviceAccountPassword";
    public static final String SERVICE_ACCOUNT_USERNAME_FIELD = "serviceAccountUsername";
    public static final String TLS = "tls";
    public static final String TOKEN = "token";


    //Names for Settings in cattle.
    public static final String SETTING_BASE = "api.auth.ldap.openldap.";
    public static final String ACCESS_MODE_SETTING = SETTING_BASE + "access.mode";
    public static final String DOMAIN_SETTING = SETTING_BASE + "domain";
    public static final String LOGIN_DOMAIN_SETTING = SETTING_BASE + "login.domain";
    public static final String PORT_SETTING = SETTING_BASE + "port";
    public static final String USER_SEARCH_FIELD_SETTING = SETTING_BASE + "user.search.field";
    public static final String SERVICE_ACCOUNT_USERNAME_SETTING = SETTING_BASE + "service.account.user";
    public static final String GROUP_SEARCH_FIELD_SETTING = SETTING_BASE + "group.search.field";
    public static final String USER_OBJECT_CLASS_SETTING = SETTING_BASE + "user.object.class";
    public static final String USER_NAME_FIELD_SETTING = SETTING_BASE + "user.name.field";
    public static final String GROUP_OBJECT_CLASS_SETTING = SETTING_BASE + "group.object.class";
    public static final String USER_LOGIN_FIELD_SETTING = SETTING_BASE + "user.login.field";
    public static final String USER_DISABLED_BIT_MASK_SETTING = SETTING_BASE + "user.enabled.mask.bit";
    public static final String SERVER_SETTING = SETTING_BASE + "server";
    public static final String SERVICE_ACCOUNT_PASSWORD_SETTING = SETTING_BASE + "service.account.password";
    public static final String USER_ENABLED_ATTRIBUTE_SETTING = SETTING_BASE + "user.enabled.attribute";
    public static final String GROUP_NAME_FIELD_SETTING = SETTING_BASE + "group.name.field";
    public static final String USER_MEMBER_ATTRIBUTE_SETTING = SETTING_BASE + "user.member.attribute";
    public static final String GROUP_USER_MAPPING_ATTRIBUTE_SETTING = SETTING_BASE + "group.member.mapping.attribute";
    public static final String TLS_SETTING = SETTING_BASE + "tls";

    public static final Set<String> SCOPES = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(
                    USER_SCOPE,
                    GROUP_SCOPE
            )));

    public static final DynamicStringProperty ACCESS_MODE = ArchaiusUtil.getString(ACCESS_MODE_SETTING);
    public static final DynamicStringProperty LDAP_DOMAIN = ArchaiusUtil.getString(DOMAIN_SETTING);
    public static final DynamicStringProperty LDAP_LOGIN_DOMAIN = ArchaiusUtil.getString(LOGIN_DOMAIN_SETTING);
    public static final DynamicIntProperty LDAP_PORT = ArchaiusUtil.getInt(PORT_SETTING);
    public static final DynamicStringProperty LDAP_SERVER = ArchaiusUtil.getString(SERVER_SETTING);
    public static final DynamicStringProperty SERVICE_ACCOUNT_PASSWORD = ArchaiusUtil.getString(SERVICE_ACCOUNT_PASSWORD_SETTING);
    public static final DynamicStringProperty SERVICE_ACCOUNT_USER = ArchaiusUtil.getString(SERVICE_ACCOUNT_USERNAME_SETTING);

    public static final String TOKEN_CREATOR = NAME + "TokenCreator";
    public static final DynamicBooleanProperty TLS_ENABLED = ArchaiusUtil.getBoolean(TLS_SETTING);
    public static final DynamicStringProperty USER_SEARCH_FIELD = ArchaiusUtil.getString(USER_SEARCH_FIELD_SETTING);
    public static final DynamicStringProperty USER_LOGIN_FIELD = ArchaiusUtil.getString(USER_LOGIN_FIELD_SETTING);
    public static final DynamicStringProperty GROUP_SEARCH_FIELD = ArchaiusUtil.getString(GROUP_SEARCH_FIELD_SETTING);
    public static final DynamicStringProperty GROUP_MEMBER_MAPPING_ATTRIBUTE = ArchaiusUtil.getString(GROUP_USER_MAPPING_ATTRIBUTE_SETTING);
    public static final DynamicStringProperty USER_OBJECT_CLASS = ArchaiusUtil.getString(USER_OBJECT_CLASS_SETTING);
    public static final DynamicIntProperty USER_DISABLED_BIT_MASK = ArchaiusUtil.getInt(USER_DISABLED_BIT_MASK_SETTING);
    public static final DynamicStringProperty USER_ENABLED_ATTRIBUTE = ArchaiusUtil.getString(USER_ENABLED_ATTRIBUTE_SETTING);
    public static final String USER_SEARCH_FIELD_FIELD = "userSearchField";
    public static final String USER_LOGIN_FIELD_FIELD = "userLoginField";
    public static final String USER_OBJECT_CLASS_FIELD = "userObjectClass";
    public static final String USER_DISABLED_MASK_BIT = "userDisabledBitMask";
    public static final String USER_NAME_FIELD_FIELD = "userNameField";
    public static final String USER_MEMBER_ATTRIBUTE_FIELD = "userMemberAttribute";
    public static final String USER_ENABLED_ATTRIBUTE_FIELD = "userEnabledAttribute";
    public static final String GROUP_SEARCH_FIELD_FIELD = "groupSearchField";
    public static final String GROUP_OBJECT_CLASS_FIELD = "groupObjectClass";
    public static final String GROUP_NAME_FIELD_FIELD = "groupNameField";
    public static final String GROUP_MEMBER_MAPPING_FIELD_FIELD = "groupMemberMappingAttribute";
    public static final String MANAGER = NAME + "Manager";


    /* * All of these
           * Fields Should be configurable. Make them configurable in ldap config. and used in appropriate places.
           * Add the member attributes and memberOf attributes. Make Comma separated list of ous that are allowed as setting.
           * This setting will be iterated on every login request/ search for results. We only support direct membership currently.
        * */
    public static final DynamicStringProperty USER_NAME_FIELD = ArchaiusUtil.getString(USER_NAME_FIELD_SETTING);
    public static final DynamicStringProperty GROUP_NAME_FIELD = ArchaiusUtil.getString(GROUP_NAME_FIELD_SETTING);
    public static final String OBJECT_CLASS = "objectClass";
    public static final DynamicStringProperty GROUP_OBJECT_CLASS = ArchaiusUtil.getString(GROUP_OBJECT_CLASS_SETTING);

    public static final DynamicStringProperty USER_MEMBER_ATTRIBUTE = ArchaiusUtil.getString(USER_MEMBER_ATTRIBUTE_SETTING);
}
