package uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for OAuth2ClientAgentsApi
 */
public class OAuth2ClientAgentsApiTest {

    private OAuth2ClientAgentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OAuth2ClientAgentsApi.class);
    }

}
