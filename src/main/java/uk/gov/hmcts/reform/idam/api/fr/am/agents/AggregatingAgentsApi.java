package uk.gov.hmcts.reform.idam.api.fr.am.agents;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentGetAllTypes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentGetCreatableTypes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentNextDescendents;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentsResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.857Z")
public interface AggregatingAgentsApi extends ApiClient.Api {


  /**
   * Action: getAllTypes
   * Obtain the collection of all secondary configuration types related to the resource.
    * @param realm  (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return AmAgentGetAllTypes
   */
  @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents?_fields={fields}&_action={action}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  AmAgentGetAllTypes actionGetAllTypes(@Param("realm") String realm, @Param("action") String action, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Action: getAllTypes
   * Obtain the collection of all secondary configuration types related to the resource.
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
   * @return AmAgentGetAllTypes
   */
  @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents?_fields={fields}&_action={action}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  AmAgentGetAllTypes actionGetAllTypes(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
   * Action: getCreatableTypes
   * Obtain the collection of secondary configuration types that have yet to be added to the resource.
    * @param realm  (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return AmAgentGetCreatableTypes
   */
  @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents#_action_getcreatabletypes?_fields={fields}&_action={action}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  AmAgentGetCreatableTypes actionGetCreatableTypes(@Param("realm") String realm, @Param("action") String action, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Action: getCreatableTypes
   * Obtain the collection of secondary configuration types that have yet to be added to the resource.
   * Note, this is equivalent to the other <code>actionGetCreatableTypes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ActionGetCreatableTypesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realm  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return AmAgentGetCreatableTypes
   */
  @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents#_action_getcreatabletypes?_fields={fields}&_action={action}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  AmAgentGetCreatableTypes actionGetCreatableTypes(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>actionGetCreatableTypes</code> method in a fluent style.
   */
  public static class ActionGetCreatableTypesQueryParams extends HashMap<String, Object> {
    public ActionGetCreatableTypesQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public ActionGetCreatableTypesQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Action: nextdescendents
   * Obtain the collection of secondary configuration instances that have been added to the resource.
    * @param realm  (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return AmAgentNextDescendents
   */
  @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents#_action_nextdescendents?_fields={fields}&_action={action}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  AmAgentNextDescendents actionNextDescendents(@Param("realm") String realm, @Param("action") String action, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Action: nextdescendents
   * Obtain the collection of secondary configuration instances that have been added to the resource.
   * Note, this is equivalent to the other <code>actionNextDescendents</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ActionNextDescendentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realm  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return AmAgentNextDescendents
   */
  @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents#_action_nextdescendents?_fields={fields}&_action={action}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  AmAgentNextDescendents actionNextDescendents(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>actionNextDescendents</code> method in a fluent style.
   */
  public static class ActionNextDescendentsQueryParams extends HashMap<String, Object> {
    public ActionNextDescendentsQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public ActionNextDescendentsQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query by Filter
   * Querying the aggregating agents
    * @param realm  (required)
    * @param queryFilter  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param pageSize  (optional)
    * @param totalPagedResultsPolicy  (optional)
    * @param sortKeys  (optional)
   * @return AmAgentsResultSet
   */
  @RequestLine("GET /json/realms/root/realms/{realm}/realm-config/agents?_fields={fields}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  AmAgentsResultSet queryFilter(@Param("realm") String realm, @Param("queryFilter") String queryFilter, @Param("fields") String fields, @Param("cookie") String cookie, @Param("pageSize") Integer pageSize, @Param("totalPagedResultsPolicy") String totalPagedResultsPolicy, @Param("sortKeys") String sortKeys);

  /**
   * Query by Filter
   * Querying the aggregating agents
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
   *   <li>queryFilter -  (required)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return AmAgentsResultSet
   */
  @RequestLine("GET /json/realms/root/realms/{realm}/realm-config/agents?_fields={fields}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  AmAgentsResultSet queryFilter(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
