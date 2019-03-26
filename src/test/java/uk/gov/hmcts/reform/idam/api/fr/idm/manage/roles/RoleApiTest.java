package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for RoleApi
 */
public class RoleApiTest {

    private RoleApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RoleApi.class);
    }

}
