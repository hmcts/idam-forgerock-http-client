package uk.gov.hmcts.reform.idam.api.fr.idm.selfservice;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.ValidateObjectResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.943Z")
public interface SelfServiceRegistrationValiationApi extends ApiClient.Api {

  /**
   * Action: validateObject
   * Submits requirements for stage.
   *
   * @param requestPayload (required)
   * @param action         (required)
   * @return ValidateObjectResponse
   */
  @RequestLine("POST /policy/selfservice/registration?_action={action}")
  @Headers({
          "Content-Type: application/json",
          "Accept: application/json",
  })
  ValidateObjectResponse policySelfserviceRegistrationValidation(Object requestPayload, @Param("action") String action);
}
