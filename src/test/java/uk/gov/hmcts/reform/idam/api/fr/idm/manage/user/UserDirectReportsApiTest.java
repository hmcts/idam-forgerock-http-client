package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for UserDirectReportsApi
 */
public class UserDirectReportsApiTest {

    private UserDirectReportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(UserDirectReportsApi.class);
    }

}
