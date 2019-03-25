package uk.gov.hmcts.reform.idam.api.fr.idm.selfservice;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.ValidateObjectResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.636Z")
public interface SelfServiceRegistrationValiationApi extends ApiClient.Api {


  /**
   * Action: validateObject
   * Submits requirements for stage.
    * @param requestPayload  (required)
    * @param action  (required)
   * @return ValidateObjectResponse
   */
  @RequestLine("POST /policy/selfservice/registration?_action={action}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ValidateObjectResponse selfserviceRegistrationValidation(Object requestPayload, @Param("action") String action);

  /**
   * Action: validateObject
   * Submits requirements for stage.
   * Note, this is equivalent to the other <code>selfserviceRegistrationValidation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SelfserviceRegistrationValidationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param requestPayload  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return ValidateObjectResponse
   */
  @RequestLine("POST /policy/selfservice/registration?_action={action}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ValidateObjectResponse selfserviceRegistrationValidation(Object requestPayload, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>selfserviceRegistrationValidation</code> method in a fluent style.
   */
  public static class SelfserviceRegistrationValidationQueryParams extends HashMap<String, Object> {
    public SelfserviceRegistrationValidationQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }
}
