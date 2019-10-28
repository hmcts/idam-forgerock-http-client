package uk.gov.hmcts.reform.idam.api.fr.am.authenticate;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.am.authenticate.model.AuthenticationChain;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-28T12:12:27.878Z")
public interface AuthenticationChainApi extends ApiClient.Api {


  /**
   * Submits an authentication chain to AM
   * POST an authentication chain back to AM
    * @param realm Parameter specifying the realm. (required)
    * @param authIndexType Specifies the indexType, such as service (required)
    * @param authIndexValue Specifies the identity of the module we are calling, such as hotpChain (required)
    * @param cookie  (optional)
    * @param requestPayload  (optional)
   * @return AuthenticationChain
   */
  @RequestLine("POST /json/realms/{realm}/authenticate?authIndexType={authIndexType}&authIndexValue={authIndexValue}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  AuthenticationChain authenticate(@Param("realm") String realm,
                                   @Param("authIndexType") String authIndexType,
                                   @Param("authIndexValue") String authIndexValue,
                                   @Param("cookie") String cookie,
                                   AuthenticationChain requestPayload);

  /**
   * Submits an authentication chain to AM
   * POST an authentication chain back to AM
   * Note, this is equivalent to the other <code>authenticate</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AuthenticateQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realm Parameter specifying the realm. (required)
   * @param cookie  (optional)
   * @param requestPayload  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>authIndexType - Specifies the indexType, such as service (required)</li>
   *   <li>authIndexValue - Specifies the identity of the module we are calling, such as hotpChain (required)</li>
   *   </ul>
   * @return AuthenticationChain
   */
  @RequestLine("POST /json/realms/{realm}/authenticate?authIndexType={authIndexType}&authIndexValue={authIndexValue}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  AuthenticationChain authenticate(@Param("realm") String realm,
                                   @Param("cookie") String cookie,
                                   AuthenticationChain requestPayload,
                                   @QueryMap(encoded = true) Map<String, Object> queryParams);

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

  /**
   * Initiates an authentication chain with an empty body request
   * POST call to initiate authentication flow
    * @param myRealm Parameter specifying the realm. (required)
    * @param authIndexType Specifies the indexType, such as service (required)
    * @param authIndexValue Specifies the identity of the module we are calling, such as hotpChain (required)
    * @param cookie  (optional)
   * @return AuthenticationChain
   */
  @RequestLine("POST /json/realms/{myRealm}/authenticate?authIndexType={authIndexType}&authIndexValue={authIndexValue}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  AuthenticationChain authenticateEmptyBody(@Param("myRealm") String myRealm,
                                            @Param("authIndexType") String authIndexType,
                                            @Param("authIndexValue") String authIndexValue,
                                            @Param("cookie") String cookie);

  /**
   * Initiates an authentication chain with an empty body request
   * POST call to initiate authentication flow
   * Note, this is equivalent to the other <code>authenticateEmptyBody</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AuthenticateEmptyBodyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param myRealm Parameter specifying the realm. (required)
   * @param cookie  (optional)
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
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  AuthenticationChain authenticateEmptyBody(@Param("myRealm") String myRealm,
                                            @Param("cookie") String cookie,
                                            @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>authenticateEmptyBody</code> method in a fluent style.
   */
  public static class AuthenticateEmptyBodyQueryParams extends HashMap<String, Object> {
    public AuthenticateEmptyBodyQueryParams authIndexType(final String value) {
      put("authIndexType", EncodingUtils.encode(value));
      return this;
    }
    public AuthenticateEmptyBodyQueryParams authIndexValue(final String value) {
      put("authIndexValue", EncodingUtils.encode(value));
      return this;
    }
  }
}
