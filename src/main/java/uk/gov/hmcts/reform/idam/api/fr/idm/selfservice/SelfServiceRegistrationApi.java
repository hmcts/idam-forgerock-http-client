package uk.gov.hmcts.reform.idam.api.fr.idm.selfservice;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.GetInitialRequirementsResponse;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.SelfServiceRegistrationResponse;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.SubmitRequirementsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.943Z")
public interface SelfServiceRegistrationApi extends ApiClient.Api {

  /**
   * Action: submitRequirements
   * Submits requirements for stage.
   * @param requestPayload  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return SelfServiceRegistrationResponse
   */
  @RequestLine("POST /selfservice/registration?_fields={fields}&_prettyPrint={prettyPrint}&_action={action}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SelfServiceRegistrationResponse selfserviceRegistration(SubmitRequirementsRequest requestPayload, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>selfserviceRegistrationActionSubmitrequirements</code> method in a fluent style.
   */
  public static class SelfserviceRegistrationParams extends HashMap<String, Object> {
    public SelfserviceRegistrationParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public SelfserviceRegistrationParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
    public SelfserviceRegistrationParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Read
   * The initial requirements for a self service process.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>mimeType - Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)</li>
   *   </ul>
   * @return GetInitialRequirementsResponse
   */
  @RequestLine("GET /selfservice/registration?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
  @Headers({
  "Accept: application/json",
  })
  GetInitialRequirementsResponse getInitialRequirements(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>selfserviceRegistrationRead</code> method in a fluent style.
   */
  public static class GetInitialRequirementParams extends HashMap<String, Object> {
    public GetInitialRequirementParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public GetInitialRequirementParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
    public GetInitialRequirementParams mimeType(final String value) {
      put("_mimeType", EncodingUtils.encode(value));
      return this;
    }
  }
}
