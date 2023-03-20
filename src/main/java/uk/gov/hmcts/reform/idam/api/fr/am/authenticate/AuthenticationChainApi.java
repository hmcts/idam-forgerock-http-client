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

@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-16T15:12:54.143+01:00")
public interface AuthenticationChainApi extends ApiClient.Api {

    /**
     * Authenticates a user or initiates an authentication flow if MFA is required
     * POST call to initiate authentication flow
     * @param myRealm Parameter specifying the realm. (required)
     * @param authIndexType Specifies the indexType, such as service (required)
     * @param authIndexValue Specifies the identity of the module we are calling, such as hotpChain (required)
     * @param xOriginIP Defines the user&#39;s original IP address (required)
     * @param xRedirectURI Defines the redirectUri for the policies check (required)
     * @param forceAuth Forces authentication even if an active session cookie is present. (optional)
     * @param xOpenAMCustUsername Defines the user&#39;s username (optional)
     * @param xOpenAMCustPassword Defines the user&#39;s password (optional)
     * @param idamSession Defines the user existing SSO token (optional)
     * @return AuthenticationChain
     */
    @RequestLine("POST /json/realms/{myRealm}/authenticate?authIndexType={authIndexType}&authIndexValue={authIndexValue}&ForceAuth={forceAuth}")
    @Headers({
            "Accept: application/json",
            "X-OpenAM-Cust-Username: {xOpenAMCustUsername}",

            "X-OpenAM-Cust-Password: {xOpenAMCustPassword}",

            "Idam.Session: {idamSession}",

            "X-Origin-IP: {xOriginIP}",

            "X-Redirect-URI: {xRedirectURI}"
    })
    AuthenticationChain authenticate(@Param("myRealm") String myRealm, @Param("authIndexType") String authIndexType, @Param("authIndexValue") String authIndexValue, @Param("xOriginIP") String xOriginIP, @Param("xRedirectURI") String xRedirectURI, @Param("forceAuth") String forceAuth, @Param("xOpenAMCustUsername") String xOpenAMCustUsername, @Param("xOpenAMCustPassword") String xOpenAMCustPassword, @Param("idamSession") String idamSession);

    /**
     * Authenticates a user or initiates an authentication flow if MFA is required
     * POST call to initiate authentication flow
     * Note, this is equivalent to the other <code>authenticate</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link AuthenticateQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param myRealm Parameter specifying the realm. (required)
     * @param xOriginIP Defines the user&#39;s original IP address (required)
     * @param xRedirectURI Defines the redirectUri for the policies check (required)
     * @param xOpenAMCustUsername Defines the user&#39;s username (optional)
     * @param xOpenAMCustPassword Defines the user&#39;s password (optional)
     * @param idamSession Defines the user existing SSO token (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>authIndexType - Specifies the indexType, such as service (required)</li>
     *   <li>authIndexValue - Specifies the identity of the module we are calling, such as hotpChain (required)</li>
     *   <li>forceAuth - Forces authentication even if an active session cookie is present. (optional)</li>
     *   </ul>
     * @return AuthenticationChain
     */
    @RequestLine("POST /json/realms/{myRealm}/authenticate?authIndexType={authIndexType}&authIndexValue={authIndexValue}&ForceAuth={forceAuth}")
    @Headers({
            "Accept: application/json",
            "X-OpenAM-Cust-Username: {xOpenAMCustUsername}",

            "X-OpenAM-Cust-Password: {xOpenAMCustPassword}",

            "Idam.Session: {idamSession}",

            "X-Origin-IP: {xOriginIP}",

            "X-Redirect-URI: {xRedirectURI}"
    })
    AuthenticationChain authenticate(@Param("myRealm") String myRealm, @Param("xOriginIP") String xOriginIP, @Param("xRedirectURI") String xRedirectURI, @Param("xOpenAMCustUsername") String xOpenAMCustUsername, @Param("xOpenAMCustPassword") String xOpenAMCustPassword, @Param("idamSession") String idamSession, @QueryMap(encoded=true) Map<String, Object> queryParams);

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
        public AuthenticateQueryParams forceAuth(final String value) {
            put("ForceAuth", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Completes the authentication flow when MFA is required
     * POST call to initiate authentication flow
     * @param realm Parameter specifying the realm. (required)
     * @param requestPayload  (required)
     * @return AuthenticationChain
     */
    @RequestLine("POST /json/realms/{realm}/authenticate")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json",
    })
    AuthenticationChain authenticateSupplyOtp(@Param("realm") String realm, AuthenticationChain requestPayload);
}
