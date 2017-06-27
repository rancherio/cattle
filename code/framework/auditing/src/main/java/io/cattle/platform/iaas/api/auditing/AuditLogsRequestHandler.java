package io.cattle.platform.iaas.api.auditing;

import io.cattle.platform.api.auth.Policy;
import io.github.ibuildthecloud.gdapi.context.ApiContext;
import io.github.ibuildthecloud.gdapi.model.Schema;
import io.github.ibuildthecloud.gdapi.request.ApiRequest;
import io.github.ibuildthecloud.gdapi.request.handler.ApiRequestHandler;

import java.io.IOException;

public class AuditLogsRequestHandler implements ApiRequestHandler {

    AuditService auditService;

    public AuditLogsRequestHandler(AuditService auditService) {
        super();
        this.auditService = auditService;
    }

    @Override
    public void handle(ApiRequest request) throws IOException {
        if (!Schema.Method.GET.isMethod(request.getMethod())){
            request.setAttribute("requestEndTime", System.currentTimeMillis());
            Policy policy = (Policy) ApiContext.getContext().getPolicy();
            auditService.logRequest(request, policy);
        }
    }
}
