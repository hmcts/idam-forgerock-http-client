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

    
    /**
     * Request Access Token
     *
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
     */
    @Test
    public void accessTokenTest() {
        String authorization = null;
        String grantType = null;
        String realm = null;
        String code = null;
        String redirectUri = null;
        String clientId = null;
        String clientSecret = null;
        String scope = null;
        String username = null;
        String password = null;
        // AmToken response = api.accessToken(authorization, grantType, realm, code, redirectUri, clientId, clientSecret, scope, username, password);

        // TODO: test validations
    }

    /**
     * Request Access Token
     *
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void accessTokenTestQueryMap() {
        String authorization = null;
        String grantType = null;
        String code = null;
        String redirectUri = null;
        String clientId = null;
        String clientSecret = null;
        String scope = null;
        String username = null;
        String password = null;
        OpenIdConnectApi.AccessTokenQueryParams queryParams = new OpenIdConnectApi.AccessTokenQueryParams()
            .realm(null);
        // AmToken response = api.accessToken(authorization, grantType, code, redirectUri, clientId, clientSecret, scope, username, password, queryParams);

    // TODO: test validations
    }
    
    /**
     * Request Access Token For Realm
     *
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
     */
    @Test
    public void accessTokenForRealmTest() {
        String realm = null;
        String authorization = null;
        String grantType = null;
        String code = null;
        String redirectUri = null;
        String clientId = null;
        String clientSecret = null;
        String scope = null;
        String username = null;
        String password = null;
        // AmToken response = api.accessTokenForRealm(realm, authorization, grantType, code, redirectUri, clientId, clientSecret, scope, username, password);

        // TODO: test validations
    }

    
    /**
     * Access Token Info
     *
     * Returns information about the supplied token
     */
    @Test
    public void getAccessTokenInfoTest() {
        String authorization = null;
        // feign.Response response = api.getAccessTokenInfo(authorization);

        // TODO: test validations
    }

    
    /**
     * Get JWKS
     *
     * Retrieves the JSON Web Key Set
     */
    @Test
    public void getJsonWebKeySetTest() {
        String realm = null;
        // JsonWebKeySet response = api.getJsonWebKeySet(realm);

        // TODO: test validations
    }

    /**
     * Get JWKS
     *
     * Retrieves the JSON Web Key Set
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getJsonWebKeySetTestQueryMap() {
        OpenIdConnectApi.GetJsonWebKeySetQueryParams queryParams = new OpenIdConnectApi.GetJsonWebKeySetQueryParams()
            .realm(null);
        // JsonWebKeySet response = api.getJsonWebKeySet(queryParams);

    // TODO: test validations
    }
    
    /**
     * Request ID Token Info
     *
     * Partner makes a request to the id token info endpoint to get information about the token presented 
     */
    @Test
    public void idTokenInfoTest() {
        String authorization = null;
        String realm = null;
        String claims = null;
        String idToken = null;
        // feign.Response response = api.idTokenInfo(authorization, realm, claims, idToken);

        // TODO: test validations
    }

    /**
     * Request ID Token Info
     *
     * Partner makes a request to the id token info endpoint to get information about the token presented 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void idTokenInfoTestQueryMap() {
        String authorization = null;
        String idToken = null;
        OpenIdConnectApi.IdTokenInfoQueryParams queryParams = new OpenIdConnectApi.IdTokenInfoQueryParams()
            .realm(null)
            .claims(null);
        // feign.Response response = api.idTokenInfo(authorization, idToken, queryParams);

    // TODO: test validations
    }
    
    /**
     * Request ID Token Info
     *
     * Partner makes a request to the id token info endpoint to get information about the token presented 
     */
    @Test
    public void jsonAuthenticateTest() {
        String xOpenAMUsername = null;
        String xOpenAMPassword = null;
        String realm = null;
        // AmAuthenticateToken response = api.jsonAuthenticate(xOpenAMUsername, xOpenAMPassword, realm);

        // TODO: test validations
    }

    /**
     * Request ID Token Info
     *
     * Partner makes a request to the id token info endpoint to get information about the token presented 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void jsonAuthenticateTestQueryMap() {
        String xOpenAMUsername = null;
        String xOpenAMPassword = null;
        OpenIdConnectApi.JsonAuthenticateQueryParams queryParams = new OpenIdConnectApi.JsonAuthenticateQueryParams()
            .realm(null);
        // AmAuthenticateToken response = api.jsonAuthenticate(xOpenAMUsername, xOpenAMPassword, queryParams);

    // TODO: test validations
    }
    
    /**
     * OpenID Connect Authorize
     *
     * Use token ID to get Authorization code
     */
    @Test
    public void oauth2AuthorizeTest() {
        String realm = null;
        String clientId = null;
        String redirectUri = null;
        String state = null;
        String responseType = null;
        String decision = null;
        String cookie = null;
        String csrf = null;
        String scope = null;
        // feign.Response response = api.oauth2Authorize(realm, clientId, redirectUri, state, responseType, decision, cookie, csrf, scope);

        // TODO: test validations
    }

    /**
     * OpenID Connect Authorize
     *
     * Use token ID to get Authorization code
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void oauth2AuthorizeTestQueryMap() {
        String cookie = null;
        String csrf = null;
        String scope = null;
        OpenIdConnectApi.Oauth2AuthorizeQueryParams queryParams = new OpenIdConnectApi.Oauth2AuthorizeQueryParams()
            .realm(null)
            .clientId(null)
            .redirectUri(null)
            .state(null)
            .responseType(null)
            .decision(null);
        // feign.Response response = api.oauth2Authorize(cookie, csrf, scope, queryParams);

    // TODO: test validations
    }
    
    /**
     * Request Info For User of the Authorization token
     *
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
     */
    @Test
    public void userInfoTest() {
        String authorization = null;
        String realm = null;
        // feign.Response response = api.userInfo(authorization, realm);

        // TODO: test validations
    }

    /**
     * Request Info For User of the Authorization token
     *
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void userInfoTestQueryMap() {
        String authorization = null;
        OpenIdConnectApi.UserInfoQueryParams queryParams = new OpenIdConnectApi.UserInfoQueryParams()
            .realm(null);
        // feign.Response response = api.userInfo(authorization, queryParams);

    // TODO: test validations
    }
    
    /**
     * Request Info For User of the Authorization token
     *
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
     */
    @Test
    public void userInfoForRealmTest() {
        String authorization = null;
        String realm = null;
        // feign.Response response = api.userInfoForRealm(authorization, realm);

        // TODO: test validations
    }

    
}
