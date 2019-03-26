package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

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
