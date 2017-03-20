package io.cattle.platform.servicediscovery.api.service;

import io.cattle.platform.core.addon.ServiceRollback;
import io.cattle.platform.core.model.DeploymentUnit;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.Service;
import io.cattle.platform.core.model.ServiceIndex;
import io.cattle.platform.core.model.Stack;

import java.util.List;
import java.util.Map;

public interface ServiceDataManager {

    public static final String STANDALONE_UNIT_INDEX = "0";

    /**
     * DATA FOR SERVICE/STANDALONE DEPLOYMENT UNIT INSTANCE LAUNCH
     */
    Map<String, Object> getDeploymentUnitInstanceData(Stack stack, Service service, DeploymentUnit unit,
            String launchConfigName, ServiceIndex serviceIndex, String instanceName);

    Map<String, List<String>> getUsedBySidekicks(Service service);

    List<String> getServiceLaunchConfigNames(Service service);

    List<String> getLaunchConfigSidekickReferences(Service service, String launchConfigName);

    /**
     * STANDALONE INSTANCE UNIT LIFECYCLE
     */
    void joinDeploymentUnit(Instance instance);

    void leaveDeploymentUnit(Instance instance);

    Object convertToService(Instance instance, String serviceName, long stackId);

    Map<String, Object> getServiceDataForRollback(Service service, ServiceRollback rollback);
}
