package uk.gov.hmcts.reform.idam.api.fr.idm.selfservice;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.GetInitialRequirementsResponse;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.SubmitRequirementsResetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-13T13:49:38.439+01:00")
public interface SelfServiceResetApi extends ApiClient.Api {


  /**
   * Action: submitRequirements
   * Submits requirements for stage.
   * @param requestPayload  (required)
   * @param action  (required)
   * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
   * @return SubmitRequirementsResetResponse
   */
  @RequestLine("POST /selfservice/reset?_fields={fields}&_action={action}")
  @Headers({
          "Content-Type: application/json",
          "Accept: application/json",
  })
  SubmitRequirementsResetResponse selfserviceResetActionSubmitrequirements(uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.SubmitRequirementsRequest requestPayload, @Param("action") String action, @Param("fields") String fields);

  /**
   * Action: submitRequirements
   * Submits requirements for stage.
   * Note, this is equivalent to the other <code>selfserviceResetActionSubmitrequirements</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SelfserviceResetActionSubmitrequirementsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param requestPayload  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return SubmitRequirementsResetResponse
   */
  @RequestLine("POST /selfservice/reset?_fields={fields}&_action={action}")
  @Headers({
          "Content-Type: application/json",
          "Accept: application/json",
  })
  SubmitRequirementsResetResponse selfserviceResetActionSubmitrequirements(uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.SubmitRequirementsRequest requestPayload, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>selfserviceResetActionSubmitrequirements</code> method in a fluent style.
   */
  public static class SelfserviceResetActionSubmitrequirementsQueryParams extends HashMap<String, Object> {
    public SelfserviceResetActionSubmitrequirementsQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public SelfserviceResetActionSubmitrequirementsQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Read
   * The initial requirements for a self service process.
   * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
   * @return GetInitialRequirementsResponse
   */
  @RequestLine("GET /selfservice/reset?_fields={fields}")
  @Headers({
          "Accept: application/json",
  })
  GetInitialRequirementsResponse selfserviceResetRead(@Param("fields") String fields);

  /**
   * Read
   * The initial requirements for a self service process.
   * Note, this is equivalent to the other <code>selfserviceResetRead</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SelfserviceResetReadQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return GetInitialRequirementsResponse
   */
  @RequestLine("GET /selfservice/reset?_fields={fields}")
  @Headers({
          "Accept: application/json",
  })
  GetInitialRequirementsResponse selfserviceResetRead(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>selfserviceResetRead</code> method in a fluent style.
   */
  public static class SelfserviceResetReadQueryParams extends HashMap<String, Object> {
    public SelfserviceResetReadQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }
}
