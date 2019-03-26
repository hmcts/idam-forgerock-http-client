package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private UserApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(UserApi.class);
    }

    
}
