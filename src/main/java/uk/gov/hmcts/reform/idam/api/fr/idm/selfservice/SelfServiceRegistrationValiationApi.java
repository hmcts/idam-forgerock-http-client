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
   * @return ValidateObjectResponse
   */
  @RequestLine("POST /policy/selfservice/registration?_action=validateObject")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ValidateObjectResponse selfserviceRegistrationValidation(Object requestPayload);

}
