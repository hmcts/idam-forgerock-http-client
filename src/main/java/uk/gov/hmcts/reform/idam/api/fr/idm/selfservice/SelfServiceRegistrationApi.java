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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.636Z")
public interface SelfServiceRegistrationApi extends ApiClient.Api {


  /**
   * Read
   * The initial requirements for a self service process.
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
   * @return GetInitialRequirementsResponse
   */
  @RequestLine("GET /selfservice/registration?_fields={fields}")
  @Headers({
    "Accept: application/json",
  })
  GetInitialRequirementsResponse getInitialRequirements(@Param("fields") String fields);

  /**
   * Read
   * The initial requirements for a self service process.
   * Note, this is equivalent to the other <code>getInitialRequirements</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetInitialRequirementsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return GetInitialRequirementsResponse
   */
  @RequestLine("GET /selfservice/registration?_fields={fields}")
  @Headers({
  "Accept: application/json",
  })
  GetInitialRequirementsResponse getInitialRequirements(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getInitialRequirements</code> method in a fluent style.
   */
  public static class GetInitialRequirementsQueryParams extends HashMap<String, Object> {
    public GetInitialRequirementsQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Action: submitRequirements
   * Submits requirements for stage.
    * @param requestPayload  (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
   * @return SelfServiceRegistrationResponse
   */
  @RequestLine("POST /selfservice/registration?_fields={fields}&_action={action}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SelfServiceRegistrationResponse submitRequirements(SubmitRequirementsRequest requestPayload, @Param("action") String action, @Param("fields") String fields);

  /**
   * Action: submitRequirements
   * Submits requirements for stage.
   * Note, this is equivalent to the other <code>submitRequirements</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SubmitRequirementsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param requestPayload  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return SelfServiceRegistrationResponse
   */
  @RequestLine("POST /selfservice/registration?_fields={fields}&_action={action}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SelfServiceRegistrationResponse submitRequirements(SubmitRequirementsRequest requestPayload, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>submitRequirements</code> method in a fluent style.
   */
  public static class SubmitRequirementsQueryParams extends HashMap<String, Object> {
    public SubmitRequirementsQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public SubmitRequirementsQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }
}
