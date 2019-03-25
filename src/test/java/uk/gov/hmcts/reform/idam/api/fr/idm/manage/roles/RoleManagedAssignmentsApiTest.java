package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAssignments;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAssignmentsResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleManagedAssignmentsApi
 */
public class RoleManagedAssignmentsApiTest {

    private RoleManagedAssignmentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RoleManagedAssignmentsApi.class);
    }


}
