package uk.gov.hmcts.reform.idam.api.fr.am.oidc;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.AmAuthenticateToken;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.AmToken;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.model.JsonWebKeySet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:58.839Z")
public interface OpenIdConnectApi extends ApiClient.Api {


  /**
   * Request Access Token
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
    * @param authorization  (required)
    * @param grantType The OAuth2 Grant Type (required)
    * @param realm  (optional)
    * @param code The (optional)
    * @param redirectUri The (optional)
    * @param clientId The (optional)
    * @param clientSecret The (optional)
    * @param scope The (optional)
    * @param username The (optional)
    * @param password The (optional)
   * @return AmToken
   */
  @RequestLine("POST /oauth2/access_token?realm={realm}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  AmToken accessToken(@Param("authorization") String authorization, @Param("grantType") String grantType, @Param("realm") String realm, @Param("code") String code, @Param("redirectUri") String redirectUri, @Param("clientId") String clientId, @Param("clientSecret") String clientSecret, @Param("scope") String scope, @Param("username") String username, @Param("password") String password);

  /**
   * Request Access Token
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
   * Note, this is equivalent to the other <code>accessToken</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AccessTokenQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param authorization  (required)
   * @param grantType The OAuth2 Grant Type (required)
   * @param code The (optional)
   * @param redirectUri The (optional)
   * @param clientId The (optional)
   * @param clientSecret The (optional)
   * @param scope The (optional)
   * @param username The (optional)
   * @param password The (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>realm -  (optional)</li>
   *   </ul>
   * @return AmToken
   */
  @RequestLine("POST /oauth2/access_token?realm={realm}")
  @Headers({
  "Content-Type: application/x-www-form-urlencoded",
  "Accept: application/json",
      "Authorization: {authorization}"
  })
  AmToken accessToken(@Param("authorization") String authorization, @Param("grantType") String grantType, @Param("code") String code, @Param("redirectUri") String redirectUri, @Param("clientId") String clientId, @Param("clientSecret") String clientSecret, @Param("scope") String scope, @Param("username") String username, @Param("password") String password, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>accessToken</code> method in a fluent style.
   */
  public static class AccessTokenQueryParams extends HashMap<String, Object> {
    public AccessTokenQueryParams realm(final String value) {
      put("realm", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Request Access Token For Realm
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
    * @param realm  (required)
    * @param authorization  (required)
    * @param grantType The OAuth2 Grant Type (required)
    * @param code The (optional)
    * @param redirectUri The (optional)
    * @param clientId The (optional)
    * @param clientSecret The (optional)
    * @param scope The (optional)
    * @param username The (optional)
    * @param password The (optional)
   * @return AmToken
   */
  @RequestLine("POST /oauth2/{realm}/access_token")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  AmToken accessTokenForRealm(@Param("realm") String realm, @Param("authorization") String authorization, @Param("grantType") String grantType, @Param("code") String code, @Param("redirectUri") String redirectUri, @Param("clientId") String clientId, @Param("clientSecret") String clientSecret, @Param("scope") String scope, @Param("username") String username, @Param("password") String password);

  /**
   * Access Token Info
   * Returns information about the supplied token
    * @param authorization  (required)
   * @return feign.Response
   */
  @RequestLine("GET /oauth2/tokeninfo")
  @Headers({
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  Response getAccessTokenInfo(@Param("authorization") String authorization);

  /**
   * Get JWKS
   * Retrieves the JSON Web Key Set
    * @param realm  (optional)
   * @return JsonWebKeySet
   */
  @RequestLine("GET /oauth2/connect/jwk_uri?realm={realm}")
  @Headers({
    "Accept: application/json",
  })
  JsonWebKeySet getJsonWebKeySet(@Param("realm") String realm);

  /**
   * Get JWKS
   * Retrieves the JSON Web Key Set
   * Note, this is equivalent to the other <code>getJsonWebKeySet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetJsonWebKeySetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>realm -  (optional)</li>
   *   </ul>
   * @return JsonWebKeySet
   */
  @RequestLine("GET /oauth2/connect/jwk_uri?realm={realm}")
  @Headers({
  "Accept: application/json",
  })
  JsonWebKeySet getJsonWebKeySet(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getJsonWebKeySet</code> method in a fluent style.
   */
  public static class GetJsonWebKeySetQueryParams extends HashMap<String, Object> {
    public GetJsonWebKeySetQueryParams realm(final String value) {
      put("realm", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Request ID Token Info
   * Partner makes a request to the id token info endpoint to get information about the token presented 
    * @param authorization  (required)
    * @param realm  (optional)
    * @param claims Claims required in the result (optional)
    * @param idToken The id token (optional)
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/idtokeninfo?realm={realm}&claims={claims}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  Response idTokenInfo(@Param("authorization") String authorization, @Param("realm") String realm, @Param("claims") String claims, @Param("idToken") String idToken);

  /**
   * Request ID Token Info
   * Partner makes a request to the id token info endpoint to get information about the token presented 
   * Note, this is equivalent to the other <code>idTokenInfo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link IdTokenInfoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param authorization  (required)
   * @param idToken The id token (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>realm -  (optional)</li>
   *   <li>claims - Claims required in the result (optional)</li>
   *   </ul>
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/idtokeninfo?realm={realm}&claims={claims}")
  @Headers({
  "Content-Type: application/x-www-form-urlencoded",
  "Accept: application/json",
      "Authorization: {authorization}"
  })
  Response idTokenInfo(@Param("authorization") String authorization, @Param("idToken") String idToken, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>idTokenInfo</code> method in a fluent style.
   */
  public static class IdTokenInfoQueryParams extends HashMap<String, Object> {
    public IdTokenInfoQueryParams realm(final String value) {
      put("realm", EncodingUtils.encode(value));
      return this;
    }
    public IdTokenInfoQueryParams claims(final String value) {
      put("claims", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Request ID Token Info
   * Partner makes a request to the id token info endpoint to get information about the token presented 
    * @param xOpenAMUsername The Username (required)
    * @param xOpenAMPassword The Password (required)
    * @param realm  (optional)
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
   * Request ID Token Info
   * Partner makes a request to the id token info endpoint to get information about the token presented 
   * Note, this is equivalent to the other <code>jsonAuthenticate</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JsonAuthenticateQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param xOpenAMUsername The Username (required)
   * @param xOpenAMPassword The Password (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>realm -  (optional)</li>
   *   </ul>
   * @return AmAuthenticateToken
   */
  @RequestLine("POST /json/authenticate?realm={realm}")
  @Headers({
  "Accept: application/json",
      "X-OpenAM-Username: {xOpenAMUsername}",
      
      "X-OpenAM-Password: {xOpenAMPassword}"
  })
  AmAuthenticateToken jsonAuthenticate(@Param("xOpenAMUsername") String xOpenAMUsername, @Param("xOpenAMPassword") String xOpenAMPassword, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>jsonAuthenticate</code> method in a fluent style.
   */
  public static class JsonAuthenticateQueryParams extends HashMap<String, Object> {
    public JsonAuthenticateQueryParams realm(final String value) {
      put("realm", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * OpenID Connect Authorize
   * Use token ID to get Authorization code
    * @param realm  (optional)
    * @param clientId  (optional)
    * @param redirectUri  (optional)
    * @param state  (optional)
    * @param responseType  (optional, default to code)
    * @param decision  (optional, default to Allow)
    * @param cookie  (optional)
    * @param csrf The ID of the token (optional)
    * @param scope The requred scopes (optional)
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/authorize?realm={realm}&client_id={clientId}&redirect_uri={redirectUri}&state={state}&response_type={responseType}&decision={decision}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  Response oauth2Authorize(@Param("realm") String realm, @Param("clientId") String clientId, @Param("redirectUri") String redirectUri, @Param("state") String state, @Param("responseType") String responseType, @Param("decision") String decision, @Param("cookie") String cookie, @Param("csrf") String csrf, @Param("scope") String scope);

  /**
   * OpenID Connect Authorize
   * Use token ID to get Authorization code
   * Note, this is equivalent to the other <code>oauth2Authorize</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Oauth2AuthorizeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param cookie  (optional)
   * @param csrf The ID of the token (optional)
   * @param scope The requred scopes (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>realm -  (optional)</li>
   *   <li>clientId -  (optional)</li>
   *   <li>redirectUri -  (optional)</li>
   *   <li>state -  (optional)</li>
   *   <li>responseType -  (optional, default to code)</li>
   *   <li>decision -  (optional, default to Allow)</li>
   *   </ul>
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/authorize?realm={realm}&client_id={clientId}&redirect_uri={redirectUri}&state={state}&response_type={responseType}&decision={decision}")
  @Headers({
  "Content-Type: application/x-www-form-urlencoded",
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  Response oauth2Authorize(@Param("cookie") String cookie, @Param("csrf") String csrf, @Param("scope") String scope, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>oauth2Authorize</code> method in a fluent style.
   */
  public static class Oauth2AuthorizeQueryParams extends HashMap<String, Object> {
    public Oauth2AuthorizeQueryParams realm(final String value) {
      put("realm", EncodingUtils.encode(value));
      return this;
    }
    public Oauth2AuthorizeQueryParams clientId(final String value) {
      put("client_id", EncodingUtils.encode(value));
      return this;
    }
    public Oauth2AuthorizeQueryParams redirectUri(final String value) {
      put("redirect_uri", EncodingUtils.encode(value));
      return this;
    }
    public Oauth2AuthorizeQueryParams state(final String value) {
      put("state", EncodingUtils.encode(value));
      return this;
    }
    public Oauth2AuthorizeQueryParams responseType(final String value) {
      put("response_type", EncodingUtils.encode(value));
      return this;
    }
    public Oauth2AuthorizeQueryParams decision(final String value) {
      put("decision", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Request Info For User of the Authorization token
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
    * @param authorization  (required)
    * @param realm  (optional)
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/userinfo?realm={realm}")
  @Headers({
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  Response userInfo(@Param("authorization") String authorization, @Param("realm") String realm);

  /**
   * Request Info For User of the Authorization token
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
   * Note, this is equivalent to the other <code>userInfo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserInfoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param authorization  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>realm -  (optional)</li>
   *   </ul>
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/userinfo?realm={realm}")
  @Headers({
  "Accept: application/json",
      "Authorization: {authorization}"
  })
  Response userInfo(@Param("authorization") String authorization, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>userInfo</code> method in a fluent style.
   */
  public static class UserInfoQueryParams extends HashMap<String, Object> {
    public UserInfoQueryParams realm(final String value) {
      put("realm", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Request Info For User of the Authorization token
   * Partner makes a request to the token endpoint by adding the following parameters describerd  below 
    * @param authorization  (required)
    * @param realm  (required)
   * @return feign.Response
   */
  @RequestLine("POST /oauth2/{realm}/userinfo")
  @Headers({
    "Accept: application/json",
    "Authorization: {authorization}"
  })
  Response userInfoForRealm(@Param("authorization") String authorization, @Param("realm") String realm);
}
