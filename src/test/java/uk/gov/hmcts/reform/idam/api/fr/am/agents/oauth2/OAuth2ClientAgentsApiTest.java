package uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2.model.OAuth2ClientsResultSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
