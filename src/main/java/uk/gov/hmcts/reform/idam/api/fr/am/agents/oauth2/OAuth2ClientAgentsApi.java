package uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.Request;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2.model.OAuth2ClientsResultSet;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.013Z")
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
  AmAgent delete(@Param("id") String id, @Param("realm") String realm, @Param("fields") String fields, @Param("cookie") String cookie);

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
 AmAgent get(@Param("id") String id, @Param("realm") String realm, @Param("fields") String fields, @Param("cookie") String cookie);

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
  AmAgent put(@Param("id") String id, @Param("realm") String realm, AmAgent requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Query by Filter
   * Querying the agents of a specific type
   *
   * @param realm  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>queryFilter -  (optional)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return OAuth2ClientsResultSet
   */
  @RequestLine("GET /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client?_fields={fields}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  OAuth2ClientsResultSet queryFilter(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryFilter</code> method in a fluent style.
   */
  public static class QueryFilterParams extends HashMap<String, Object> {
    public QueryFilterParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams queryFilter(final String value) {
      put("_queryFilter", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams pageSize(final Integer value) {
      put("_pageSize", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams totalPagedResultsPolicy(final String value) {
      put("_totalPagedResultsPolicy", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams sortKeys(final String value) {
      put("_sortKeys", EncodingUtils.encode(value));
      return this;
    }
  }
}
