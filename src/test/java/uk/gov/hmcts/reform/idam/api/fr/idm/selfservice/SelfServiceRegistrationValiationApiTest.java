package uk.gov.hmcts.reform.idam.api.fr.idm.selfservice;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for SelfServiceRegistrationValiationApi
 */
public class SelfServiceRegistrationValiationApiTest {

    private SelfServiceRegistrationValiationApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SelfServiceRegistrationValiationApi.class);
    }


}
