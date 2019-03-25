package uk.gov.hmcts.reform.idam.api.fr.am.oidc;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.AmAuthenticateToken;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.AmToken;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.JsonWebKeySet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
