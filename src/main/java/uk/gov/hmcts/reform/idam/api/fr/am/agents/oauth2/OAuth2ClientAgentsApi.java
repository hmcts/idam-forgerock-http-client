package uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2;

import feign.Headers;
import feign.Param;
import feign.Request;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2.model.OAuth2Client;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.013Z")
public interface OAuth2ClientAgentsApi extends ApiClient.Api {

  /**
   * Action: getAllTypes
   * Call the endpoint with various actions
    * @param action  (required)
    * @param realm  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return Object
   */
  @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client?_fields={fields}&_action=getAllTypes")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  Request actionGetAllTypes(@Param("realm") String realm, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Delete
   * 
    * @param id  (required)
    * @param realm  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent
   */
  @RequestLine("DELETE /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  OAuth2Client delete(@Param("id") String id, @Param("realm") String realm, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Read
   * 
    * @param id  (required)
    * @param realm  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent
   */
  @RequestLine("GET /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  OAuth2Client get(@Param("id") String id, @Param("realm") String realm, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update or Create with Client-Assigned ID
   * 
    * @param id  (required)
    * @param realm  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent
   */
  @RequestLine("PUT /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  OAuth2Client put(@Param("id") String id, @Param("realm") String realm, OAuth2Client requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

}
