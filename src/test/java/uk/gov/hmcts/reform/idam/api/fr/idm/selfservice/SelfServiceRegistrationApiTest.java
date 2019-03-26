package uk.gov.hmcts.reform.idam.api.fr.idm.selfservice;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for SelfServiceRegistrationApi
 */
public class SelfServiceRegistrationApiTest {

    private SelfServiceRegistrationApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SelfServiceRegistrationApi.class);
    }

}
