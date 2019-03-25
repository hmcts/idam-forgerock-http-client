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
   * Action: submitRequirements
   * Submits requirements for stage.
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
   * @return SelfServiceRegistrationResponse
   */
  @RequestLine("POST /selfservice/registration?_fields={fields}&_action=submitRequirements")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SelfServiceRegistrationResponse submitRequirements(SubmitRequirementsRequest requestPayload, @Param("fields") String fields);
}
