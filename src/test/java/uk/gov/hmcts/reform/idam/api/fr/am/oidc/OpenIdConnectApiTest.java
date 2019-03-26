package uk.gov.hmcts.reform.idam.api.fr.am.oidc;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for OpenIdConnectApi
 */
public class OpenIdConnectApiTest {

    private OpenIdConnectApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OpenIdConnectApi.class);
    }


    
}
