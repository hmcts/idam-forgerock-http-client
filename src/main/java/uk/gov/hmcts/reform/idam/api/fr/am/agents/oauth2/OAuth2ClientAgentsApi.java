package uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2.model.OAuth2ClientsResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

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
  @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client?_fields={fields}&_action={action}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  Object actionGetAllTypes(@Param("action") String action, @Param("realm") String realm, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Action: getAllTypes
   * Call the endpoint with various actions
   * Note, this is equivalent to the other <code>actionGetAllTypes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ActionGetAllTypesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realm  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return Object
   */
  @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client?_fields={fields}&_action={action}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  Object actionGetAllTypes(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>actionGetAllTypes</code> method in a fluent style.
   */
  public static class ActionGetAllTypesQueryParams extends HashMap<String, Object> {
    public ActionGetAllTypesQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public ActionGetAllTypesQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }

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
  uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent delete(@Param("id") String id, @Param("realm") String realm, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Delete
   * 
   * Note, this is equivalent to the other <code>delete</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id  (required)
   * @param realm  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent
   */
  @RequestLine("DELETE /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client/{id}?_fields={fields}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent delete(@Param("id") String id, @Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>delete</code> method in a fluent style.
   */
  public static class DeleteQueryParams extends HashMap<String, Object> {
    public DeleteQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

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
  uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent get(@Param("id") String id, @Param("realm") String realm, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Read
   * 
   * Note, this is equivalent to the other <code>get</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id  (required)
   * @param realm  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent
   */
  @RequestLine("GET /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client/{id}?_fields={fields}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent get(@Param("id") String id, @Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>get</code> method in a fluent style.
   */
  public static class GetQueryParams extends HashMap<String, Object> {
    public GetQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

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
  uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent put(@Param("id") String id, @Param("realm") String realm, uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update or Create with Client-Assigned ID
   * 
   * Note, this is equivalent to the other <code>put</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PutQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id  (required)
   * @param realm  (required)
   * @param requestPayload  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent
   */
  @RequestLine("PUT /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client/{id}?_fields={fields}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent put(@Param("id") String id, @Param("realm") String realm, uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent requestPayload, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>put</code> method in a fluent style.
   */
  public static class PutQueryParams extends HashMap<String, Object> {
    public PutQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query by Filter
   * Querying the agents of a specific type
    * @param realm  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param queryFilter  (optional)
    * @param cookie  (optional)
    * @param pageSize  (optional)
    * @param totalPagedResultsPolicy  (optional)
    * @param sortKeys  (optional)
   * @return OAuth2ClientsResultSet
   */
  @RequestLine("GET /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client?_fields={fields}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  OAuth2ClientsResultSet queryFilter(@Param("realm") String realm, @Param("fields") String fields, @Param("queryFilter") String queryFilter, @Param("cookie") String cookie, @Param("pageSize") Integer pageSize, @Param("totalPagedResultsPolicy") String totalPagedResultsPolicy, @Param("sortKeys") String sortKeys);

  /**
   * Query by Filter
   * Querying the agents of a specific type
   * Note, this is equivalent to the other <code>queryFilter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryFilterQueryParams} class that allows for
   * building up this map in a fluent style.
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
  public static class QueryFilterQueryParams extends HashMap<String, Object> {
    public QueryFilterQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterQueryParams queryFilter(final String value) {
      put("_queryFilter", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterQueryParams pageSize(final Integer value) {
      put("_pageSize", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterQueryParams totalPagedResultsPolicy(final String value) {
      put("_totalPagedResultsPolicy", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterQueryParams sortKeys(final String value) {
      put("_sortKeys", EncodingUtils.encode(value));
      return this;
    }
  }
}
