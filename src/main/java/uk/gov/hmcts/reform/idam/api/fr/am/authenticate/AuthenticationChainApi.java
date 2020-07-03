package uk.gov.hmcts.reform.idam.api.fr.am.authenticate;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.shared.model.ApiError;
import uk.gov.hmcts.reform.idam.api.fr.am.authenticate.model.AuthenticationChain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-03T12:33:56.808+01:00")
public interface AuthenticationChainApi extends ApiClient.Api {


  /**
   * Authenticates a user or initiates an authentication flow when MFA is required
   * POST call to initiate authentication flow
   * @param myRealm Parameter specifying the realm. (required)
   * @param authIndexType Specifies the indexType, such as service (required)
   * @param authIndexValue Specifies the identity of the module we are calling, such as hotpChain (required)
   * @param xOpenAMCustUsername Defines the user&#39;s username (required)
   * @param xOpenAMCustPassword Defines the user&#39;s password (required)
   * @param xOriginIP Defines the user&#39;s original IP address (required)
   * @param xRedirectURI Defines the redirectUri for the policies check (required)
   * @param requestPayload  (optional)
   * @return AuthenticationChain
   */
  @RequestLine("POST /json/realms/{myRealm}/authenticate?authIndexType={authIndexType}&authIndexValue={authIndexValue}")
  @Headers({
          "Content-Type: application/json",
          "Accept: application/json",
          "X-OpenAM-Cust-Username: {xOpenAMCustUsername}",

          "X-OpenAM-Cust-Password: {xOpenAMCustPassword}",

          "X-Origin-IP: {xOriginIP}",

          "X-Redirect-URI: {xRedirectURI}"
  })
  AuthenticationChain authenticate(@Param("myRealm") String myRealm, @Param("authIndexType") String authIndexType, @Param("authIndexValue") String authIndexValue, @Param("xOpenAMCustUsername") String xOpenAMCustUsername, @Param("xOpenAMCustPassword") String xOpenAMCustPassword, @Param("xOriginIP") String xOriginIP, @Param("xRedirectURI") String xRedirectURI, AuthenticationChain requestPayload);

  /**
   * Authenticates a user or initiates an authentication flow when MFA is required
   * POST call to initiate authentication flow
   * Note, this is equivalent to the other <code>authenticate</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AuthenticateQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param myRealm Parameter specifying the realm. (required)
   * @param xOpenAMCustUsername Defines the user&#39;s username (required)
   * @param xOpenAMCustPassword Defines the user&#39;s password (required)
   * @param xOriginIP Defines the user&#39;s original IP address (required)
   * @param xRedirectURI Defines the redirectUri for the policies check (required)
   * @param requestPayload  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>authIndexType - Specifies the indexType, such as service (required)</li>
   *   <li>authIndexValue - Specifies the identity of the module we are calling, such as hotpChain (required)</li>
   *   </ul>
   * @return AuthenticationChain
   */
  @RequestLine("POST /json/realms/{myRealm}/authenticate?authIndexType={authIndexType}&authIndexValue={authIndexValue}")
  @Headers({
          "Content-Type: application/json",
          "Accept: application/json",
          "X-OpenAM-Cust-Username: {xOpenAMCustUsername}",

          "X-OpenAM-Cust-Password: {xOpenAMCustPassword}",

          "X-Origin-IP: {xOriginIP}",

          "X-Redirect-URI: {xRedirectURI}"
  })
  AuthenticationChain authenticate(@Param("myRealm") String myRealm, @Param("xOpenAMCustUsername") String xOpenAMCustUsername, @Param("xOpenAMCustPassword") String xOpenAMCustPassword, @Param("xOriginIP") String xOriginIP, @Param("xRedirectURI") String xRedirectURI, AuthenticationChain requestPayload, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>authenticate</code> method in a fluent style.
   */
  public static class AuthenticateQueryParams extends HashMap<String, Object> {
    public AuthenticateQueryParams authIndexType(final String value) {
      put("authIndexType", EncodingUtils.encode(value));
      return this;
    }
    public AuthenticateQueryParams authIndexValue(final String value) {
      put("authIndexValue", EncodingUtils.encode(value));
      return this;
    }
  }
}
