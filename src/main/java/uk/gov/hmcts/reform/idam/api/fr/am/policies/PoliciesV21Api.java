package uk.gov.hmcts.reform.idam.api.fr.am.policies;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.EvaluateRequest;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.EvaluateResponse;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-24T15:44:32.442+01:00")
public interface PoliciesV21Api extends ApiClient.Api {


  /**
   * Policies: Action: evaluate
   * Request policy decisions for specific resources
    * @param requestPayload  (required)
    * @param action  (required)
    * @param acceptAPIVersion  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param prettyPrint Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)
    * @param realm Optional parameter specifying the realm. (optional)
    * @param cookie  (optional)
   * @return EvaluateResponse
   */
  @RequestLine("POST /json/policies?_fields={fields}&_prettyPrint={prettyPrint}&realm={realm}&_action={action}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "Accept-API-Version: {acceptAPIVersion}"
  })
  EvaluateResponse evaluate(EvaluateRequest requestPayload, @Param("action") String action, @Param("acceptAPIVersion") String acceptAPIVersion, @Param("fields") String fields, @Param("prettyPrint") Boolean prettyPrint, @Param("realm") String realm, @Param("cookie") String cookie);

  /**
   * Policies: Action: evaluate
   * Request policy decisions for specific resources
   * Note, this is equivalent to the other <code>evaluate</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link EvaluateQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param requestPayload  (required)
   * @param acceptAPIVersion  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>realm - Optional parameter specifying the realm. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return EvaluateResponse
   */
  @RequestLine("POST /json/policies?_fields={fields}&_prettyPrint={prettyPrint}&realm={realm}&_action={action}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}",
      
      "Accept-API-Version: {acceptAPIVersion}"
  })
  EvaluateResponse evaluate(EvaluateRequest requestPayload, @Param("acceptAPIVersion") String acceptAPIVersion, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>evaluate</code> method in a fluent style.
   */
  public static class EvaluateQueryParams extends HashMap<String, Object> {
    public EvaluateQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public EvaluateQueryParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
    public EvaluateQueryParams realm(final String value) {
      put("realm", EncodingUtils.encode(value));
      return this;
    }
    public EvaluateQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }
}
