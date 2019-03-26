package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for RoleRoleMembersApi
 */
public class RoleRoleMembersApiTest {

    private RoleRoleMembersApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RoleRoleMembersApi.class);
    }

}
