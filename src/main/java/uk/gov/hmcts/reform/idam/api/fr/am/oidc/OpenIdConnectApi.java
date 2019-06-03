package uk.gov.hmcts.reform.idam.api.fr.am.oidc;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import feign.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.AmAuthenticateToken;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.AmToken;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.AmWellKnownConfig;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.JsonWebKeySet;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:58.839Z")
public interface OpenIdConnectApi extends ApiClient.Api {

    /**
     * Call OAuth2Authorize specifically to get the authorization code
     *
     * @param params
     * @return The Auth Code
     */
    default String getAuthorizationCode(GetAuthorizationCodeParams params) {
        Response feignResponse = oauth2Authorize(params.get("realm"),
                params.get("client_id"), params.get("redirect_uri"),
                null, null, "code", "Allow",
                null, params.get("cookie"), params.get("token_id"), params.get("scope"));

        HttpStatus responseStatus = HttpStatus.valueOf(feignResponse.status());

        if (responseStatus.is4xxClientError() || responseStatus.is5xxServerError()) {
            throw new ResponseStatusException(HttpStatus.valueOf(feignResponse.status()));
        }

        return UriComponentsBuilder.fromUriString(feignResponse.headers()
                .get(HttpHeaders.LOCATION)
                .stream().findFirst().orElse(""))
                .build()
                .getQueryParams().getFirst("code");
    }


    /**
     * A convenience class for generating query parameters for the
     * <code>getAuthorizationCode</code> method in a fluent style.
     */
    public static class GetAuthorizationCodeParams extends HashMap<String, String> {
        public GetAuthorizationCodeParams cookie(final String value) {
            put("cookie", value);
            return this;
        }

        public GetAuthorizationCodeParams clientId(final String value) {
            put("client_id", value);
            return this;
        }

        public GetAuthorizationCodeParams redirectUri(final String value) {
            put("redirect_uri", value);
            return this;
        }

        public GetAuthorizationCodeParams tokenId(final String value) {
            put("token_id", value);
            return this;
        }

        public GetAuthorizationCodeParams realm(final String value) {
            put("realm", value);
            return this;
        }

        public GetAuthorizationCodeParams scope(final String value) {
            put("scope", value);
            return this;
        }
    }

    /**
     * Request Access Token
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below
     *
     * @param authorization (required)
     * @param grantType     The OAuth2 Grant Type (required)
     * @param refreshToken  A previously issued refresh token (optional)
     * @param realm         (optional)
     * @param code          The (optional)
     * @param redirectUri   The (optional)
     * @param clientId      The (optional)
     * @param clientSecret  The (optional)
     * @param scope         The (optional)
     * @param username      The (optional)
     * @param password      The (optional)
     * @return AmToken
     */
    @RequestLine("POST /oauth2/access_token?realm={realm}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json",
            "Authorization: {authorization}"
    })
    AmToken accessToken(@Param("authorization") String authorization, @Param("grant_type") String grantType, @Param("refresh_token") String refreshToken, @Param("realm") String realm, @Param("code") String code, @Param("redirect_uri") String redirectUri, @Param("client_id") String clientId, @Param("client_secret") String clientSecret, @Param("scope") String scope, @Param("username") String username, @Param("password") String password);

    /**
     * Request Access Token For Realm
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below
     *
     * @param realm         (required)
     * @param authorization (required)
     * @param grantType     The OAuth2 Grant Type (required)
     * @param refreshToken  A previously issued refresh token (optional)
     * @param code          The (optional)
     * @param redirectUri   The (optional)
     * @param clientId      The (optional)
     * @param clientSecret  The (optional)
     * @param scope         The (optional)
     * @param username      The (optional)
     * @param password      The (optional)
     * @return AmToken
     */
    @RequestLine("POST /oauth2/{realm}/access_token")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json",
            "Authorization: {authorization}"
    })
    AmToken accessTokenForRealm(@Param("realm") String realm, @Param("authorization") String authorization, @Param("grant_type") String grantType, @Param("refresh_token") String refreshToken, @Param("code") String code, @Param("redirect_uri") String redirectUri, @Param("client_id") String clientId, @Param("client_secret") String clientSecret, @Param("scope") String scope, @Param("username") String username, @Param("password") String password);

    /**
     * Access Token Info
     * Returns information about the supplied token
     *
     * @param authorization (required)
     * @return feign.Response
     */
    @RequestLine("GET /oauth2/tokeninfo")
    @Headers({
            "Accept: application/json",
            "Authorization: {authorization}"
    })
    Map<String, Object> getAccessTokenInfo(@Param("authorization") String authorization);

    /**
     * Get JWKS
     * Retrieves the JSON Web Key Set
     *
     * @param realm (optional)
     * @return JsonWebKeySet
     */
    @RequestLine("GET /oauth2/connect/jwk_uri?realm={realm}")
    @Headers({
            "Accept: application/json",
    })
    JsonWebKeySet getJsonWebKeySet(@Param("realm") String realm);

    /**
     * Request ID Token Info
     * Partner makes a request to the id token info endpoint to get information about the token presented
     *
     * @param authorization (required)
     * @param realm         (optional)
     * @param claims        Claims required in the result (optional)
     * @param idToken       The id token (optional)
     * @return feign.Response
     */
    @RequestLine("POST /oauth2/idtokeninfo?realm={realm}&claims={claims}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json",
            "Authorization: {authorization}"
    })
    Map<String, Object> idTokenInfo(@Param("authorization") String authorization, @Param("realm") String realm, @Param("claims") String claims, @Param("id_token") String idToken);

    /**
     * Request ID Token Info
     * Partner makes a request to the id token info endpoint to get information about the token presented
     *
     * @param xOpenAMUsername The Username (required)
     * @param xOpenAMPassword The Password (required)
     * @param realm           (optional)
     * @return AmAuthenticateToken
     */
    @RequestLine("POST /json/authenticate?realm={realm}")
    @Headers({
            "Accept: application/json",
            "X-OpenAM-Username: {xOpenAMUsername}",
            "X-OpenAM-Password: {xOpenAMPassword}"
    })
    AmAuthenticateToken jsonAuthenticate(@Param("xOpenAMUsername") String xOpenAMUsername, @Param("xOpenAMPassword") String xOpenAMPassword, @Param("realm") String realm);


    /**
     * OpenID Connect Authorize
     * Request redirect to login page
     *
     * @param realm        (required)
     * @param clientId     OAuth2 client id of the service initiating the OAuth2 flow. (optional)
     * @param redirectUri  URI to redirect the user to after successful authentication. This URL must match one of the registered URLs for the OAuth2 application linked to the service initiating the authentication flow.  (optional)
     * @param state        Optional state to be sent back to the initiating service after successful authentication. (optional)
     * @param nonce        Optional parameter required for openid hybrid flow requests. (optional)
     * @param responseType Response type to use for this request (optional, default to code)
     * @param scope        Optional scopes to request. (optional)
     * @param responseMode Informs Authorization server of the mechanism to be used for returning parameters. Use is not recommended.  (optional)
     * @param display      ASCII string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User.  (optional)
     * @param prompt       Space delimited, case sensitive list of ASCII string values that specifies whether the Authorization Server prompts the End-User for reauthentication and consent.  (optional)
     * @param maxAge       Maximum Authentication Age (optional)
     * @param acrValues    Requested Authentication Context Class Reference values (optional)
     * @param idTokenHint  Token previously issued by the Authorization Server being passed as a hint about the End-User&#39;s current or past authenticated session with the Client.  (optional)
     * @param loginHint    Hint to the Authorization Server about the login identifier the End-User might use to log in (if necessary). This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier) and then wants to pass that value as a hint to the discovered authorization service.  (optional)
     * @return feign.Response
     */
    @RequestLine("GET /oauth2/{realm}/authorize?client_id={clientId}&redirect_uri={redirectUri}&state={state}&nonce={nonce}&response_type={responseType}&scope={scope}&response_mode={responseMode}&display={display}&prompt={prompt}&max_age={maxAge}&acr_values={acrValues}&id_token_hint={idTokenHint}&login_hint={loginHint}")
    @Headers({
            "Accept: application/json",
    })
    feign.Response getOauth2Authorize(@Param("realm") String realm, @Param("clientId") String clientId, @Param("redirectUri") String redirectUri, @Param("state") String state, @Param("nonce") String nonce, @Param("responseType") String responseType, @Param("scope") String scope, @Param("responseMode") String responseMode, @Param("display") String display, @Param("prompt") String prompt, @Param("maxAge") String maxAge, @Param("acrValues") String acrValues, @Param("idTokenHint") String idTokenHint, @Param("loginHint") String loginHint);

    /**
     * OpenID Connect Authorize
     * Use token ID to get Authorization code
     *
     * @param realm        (required)
     * @param clientId     (optional)
     * @param redirectUri  (optional)
     * @param state        (optional)
     * @param nonce        (optional)
     * @param responseType (optional, default to code)
     * @param decision     (optional, default to Allow)
     * @param saveConsent  (optional)
     * @param cookie       (optional)
     * @param csrf         The ID of the token (optional)
     * @param scope        The requred scopes (optional)
     * @return feign.Response
     */
    @RequestLine("POST /oauth2/{realm}/authorize")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    feign.Response oauth2Authorize(@Param("realm") String realm, @Param("client_id") String clientId, @Param("redirect_uri") String redirectUri, @Param("state") String state, @Param("nonce") String nonce, @Param("response_type") String responseType, @Param("decision") String decision, @Param("save_consent") String saveConsent, @Param("cookie") String cookie, @Param("csrf") String csrf, @Param("scope") String scope);

    /**
     * Request Info For User of the Authorization token
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below
     *
     * @param authorization (required)
     * @param realm         (optional)
     * @param claims        (optional)
     * @return feign.Response
     */
    @RequestLine("POST /oauth2/userinfo?realm={realm}")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json",
            "Authorization: {authorization}"
    })
    Map<String, Object> userInfo(@Param("authorization") String authorization, @Param("realm") String realm, @Param("claims") String claims);

    /**
     * Request Info For User of the Authorization token
     * Partner makes a request to the token endpoint by adding the following parameters describerd  below
     *
     * @param authorization (required)
     * @param realm         (required)
     * @param claims        (optional)
     * @return feign.Response
     */
    @RequestLine("POST /oauth2/{realm}/userinfo")
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Accept: application/json",
            "Authorization: {authorization}"
    })
    Map<String, Object> userInfoForRealm(@Param("authorization") String authorization, @Param("realm") String realm, @Param("claims") String claims);

    /**
     * Well Known OpenID Config
     * Returns information required for oidc discovery
     *
     * @param realm (required)
     * @return WellKnownConfig
     */
    @RequestLine("GET /oauth2/{realm}/.well-known/openid-configuration")
    @Headers({
            "Accept: application/json",
    })
    AmWellKnownConfig wellKnownOpenidConfiguration(@Param("realm") String realm);

    /**
     * OpenID Connect check_session_iframe
     * Returns an iframe that the RP can use to check the session state
     *
     * @param realm (required)
     * @return feign.Response
     */
    @RequestLine("GET /oauth2/{realm}/connect/checkSession")
    @Headers({
            "Accept: application/json",
    })
    feign.Response checkSession(@Param("realm") String realm);

    /**
     * OpenID Connect end_session
     * Ends the session of the user
     *
     * @param realm                 (required)
     * @param idTokenHint           Users id token to help OP link the session (optional)
     * @param postLogoutRedirectUri Optional uri to redirect the user to after logout (optional)
     * @param state                 Optional application state parameter (optional)
     * @return feign.Response
     */
    @RequestLine("GET /oauth2/{realm}/connect/endSession?id_token_hint={idTokenHint}&post_logout_redirect_uri={postLogoutRedirectUri}&state={state}")
    @Headers({
            "Accept: application/json",
    })
    feign.Response endSession(@Param("realm") String realm, @Param("idTokenHint") String idTokenHint, @Param("postLogoutRedirectUri") String postLogoutRedirectUri, @Param("state") String state);
}
