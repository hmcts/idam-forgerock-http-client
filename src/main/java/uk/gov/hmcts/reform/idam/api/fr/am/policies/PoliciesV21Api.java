package uk.gov.hmcts.reform.idam.api.fr.am.policies;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.DeleteResponse;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.EvaluateRequest;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.EvaluateResponse;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.GetResponse;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.PostRequest;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.PostResponse;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.PutRequest;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.PutResponse;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.model.QueryResponse;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-04T13:43:51.856Z")
public interface PoliciesV21Api extends ApiClient.Api {


  /**
   * Delete
   * Delete policy
    * @param realm Parameter specifying the realm. (required)
    * @param resourceId The unique identifier of the policy (required)
    * @param acceptAPIVersion  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param prettyPrint Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)
    * @param cookie  (optional)
   * @return DeleteResponse
   */
  @RequestLine("DELETE /json/realms/{realm}/policies/{resourceId}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
    "Accept: application/json",
    "Accept-API-Version: {acceptAPIVersion}",
    
    "Cookie: {cookie}"
  })
  DeleteResponse delete(@Param("realm") String realm,
                        @Param("resourceId") String resourceId,
                        @Param("acceptAPIVersion") String acceptAPIVersion,
                        @Param("fields") String fields,
                        @Param("prettyPrint") Boolean prettyPrint,
                        @Param("cookie") String cookie);

  /**
   * Delete
   * Delete policy
   * Note, this is equivalent to the other <code>delete</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realm Parameter specifying the realm. (required)
   * @param resourceId The unique identifier of the policy (required)
   * @param acceptAPIVersion  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return DeleteResponse
   */
  @RequestLine("DELETE /json/realms/{realm}/policies/{resourceId}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Accept: application/json",
      "Accept-API-Version: {acceptAPIVersion}",

      "Cookie: {cookie}"
  })
  DeleteResponse delete(@Param("realm") String realm,
                        @Param("resourceId") String resourceId,
                        @Param("acceptAPIVersion") String acceptAPIVersion,
                        @Param("cookie") String cookie,
                        @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>delete</code> method in a fluent style.
   */
  public static class DeleteQueryParams extends HashMap<String, Object> {
    public DeleteQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public DeleteQueryParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Policies: Action: evaluate
   * Request policy decisions for specific resources
    * @param requestPayload  (required)
    * @param action  (required)
    * @param acceptAPIVersion  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param prettyPrint Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)
    * @param realm Optional parameter specifying the realm. (optional)
    * @param cookie  (optional)
   * @return EvaluateResponse
   */
  @RequestLine("POST /json/policies?_fields={fields}&_prettyPrint={prettyPrint}&realm={realm}&_action={action}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",

    "Accept-API-Version: {acceptAPIVersion}"
  })
  EvaluateResponse evaluate(EvaluateRequest requestPayload,
                            @Param("action") String action,
                            @Param("acceptAPIVersion") String acceptAPIVersion,
                            @Param("fields") String fields,
                            @Param("prettyPrint") Boolean prettyPrint,
                            @Param("realm") String realm,
                            @Param("cookie") String cookie);

  /**
   * Policies: Action: evaluate
   * Request policy decisions for specific resources
   * Note, this is equivalent to the other <code>evaluate</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link EvaluateQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param requestPayload  (required)
   * @param acceptAPIVersion  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>realm - Optional parameter specifying the realm. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return EvaluateResponse
   */
  @RequestLine("POST /json/policies?_fields={fields}&_prettyPrint={prettyPrint}&realm={realm}&_action={action}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}",

      "Accept-API-Version: {acceptAPIVersion}"
  })
  EvaluateResponse evaluate(EvaluateRequest requestPayload,
                            @Param("acceptAPIVersion") String acceptAPIVersion,
                            @Param("cookie") String cookie,
                            @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>evaluate</code> method in a fluent style.
   */
  public static class EvaluateQueryParams extends HashMap<String, Object> {
    public EvaluateQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public EvaluateQueryParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
    public EvaluateQueryParams realm(final String value) {
      put("realm", EncodingUtils.encode(value));
      return this;
    }
    public EvaluateQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Read
   * Read policy
    * @param realm Parameter specifying the realm. (required)
    * @param resourceId The unique identifier of the policy (required)
    * @param acceptAPIVersion  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param prettyPrint Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)
    * @param mimeType Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)
    * @param cookie  (optional)
   * @return GetResponse
   */
  @RequestLine("GET /json/realms/{realm}/policies/{resourceId}?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
  @Headers({
    "Accept: application/json",
    "Accept-API-Version: {acceptAPIVersion}",

    "Cookie: {cookie}"
  })
  GetResponse get(@Param("realm") String realm,
                  @Param("resourceId") String resourceId,
                  @Param("acceptAPIVersion") String acceptAPIVersion,
                  @Param("fields") String fields,
                  @Param("prettyPrint") Boolean prettyPrint,
                  @Param("mimeType") String mimeType,
                  @Param("cookie") String cookie);

  /**
   * Read
   * Read policy
   * Note, this is equivalent to the other <code>get</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realm Parameter specifying the realm. (required)
   * @param resourceId The unique identifier of the policy (required)
   * @param acceptAPIVersion  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>mimeType - Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)</li>
   *   </ul>
   * @return GetResponse
   */
  @RequestLine("GET /json/realms/{realm}/policies/{resourceId}?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
  @Headers({
  "Accept: application/json",
      "Accept-API-Version: {acceptAPIVersion}",

      "Cookie: {cookie}"
  })
  GetResponse get(@Param("realm") String realm,
                  @Param("resourceId") String resourceId,
                  @Param("acceptAPIVersion") String acceptAPIVersion,
                  @Param("cookie") String cookie,
                  @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>get</code> method in a fluent style.
   */
  public static class GetQueryParams extends HashMap<String, Object> {
    public GetQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public GetQueryParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
    public GetQueryParams mimeType(final String value) {
      put("_mimeType", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create with Server-Assigned ID
   * Create new policy
    * @param realm Parameter specifying the realm. (required)
    * @param acceptAPIVersion  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param prettyPrint Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)
    * @param cookie  (optional)
   * @return PostResponse
   */
  @RequestLine("POST /json/realms/{realm}/policies?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Accept-API-Version: {acceptAPIVersion}",

    "Cookie: {cookie}"
  })
  PostResponse post(@Param("realm") String realm,
                    @Param("acceptAPIVersion") String acceptAPIVersion,
                    PostRequest requestPayload,
                    @Param("fields") String fields,
                    @Param("prettyPrint") Boolean prettyPrint,
                    @Param("cookie") String cookie);

  /**
   * Create with Server-Assigned ID
   * Create new policy
   * Note, this is equivalent to the other <code>post</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realm Parameter specifying the realm. (required)
   * @param acceptAPIVersion  (required)
   * @param requestPayload  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return PostResponse
   */
  @RequestLine("POST /json/realms/{realm}/policies?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Accept-API-Version: {acceptAPIVersion}",

      "Cookie: {cookie}"
  })
  PostResponse post(@Param("realm") String realm,
                    @Param("acceptAPIVersion") String acceptAPIVersion,
                    PostRequest requestPayload,
                    @Param("cookie") String cookie,
                    @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>post</code> method in a fluent style.
   */
  public static class PostQueryParams extends HashMap<String, Object> {
    public PostQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public PostQueryParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create Policy with Client-Assigned ID
   * Create or update policy
    * @param realm Parameter specifying the realm. (required)
    * @param resourceId The unique identifier of the policy (required)
    * @param acceptAPIVersion  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param prettyPrint Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)
    * @param cookie  (optional)
   * @return PutResponse
   */
  @RequestLine("PUT /json/realms/{realm}/policies/{resourceId}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Accept-API-Version: {acceptAPIVersion}",

    "Cookie: {cookie}"
  })
  PutResponse put(@Param("realm") String realm,
                  @Param("resourceId") String resourceId,
                  @Param("acceptAPIVersion") String acceptAPIVersion,
                  PutRequest requestPayload,
                  @Param("fields") String fields,
                  @Param("prettyPrint") Boolean prettyPrint,
                  @Param("cookie") String cookie);

  /**
   * Create Policy with Client-Assigned ID
   * Create or update policy
   * Note, this is equivalent to the other <code>put</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PutQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realm Parameter specifying the realm. (required)
   * @param resourceId The unique identifier of the policy (required)
   * @param acceptAPIVersion  (required)
   * @param requestPayload  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return PutResponse
   */
  @RequestLine("PUT /json/realms/{realm}/policies/{resourceId}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Accept-API-Version: {acceptAPIVersion}",

      "Cookie: {cookie}"
  })
  PutResponse put(@Param("realm") String realm,
                  @Param("resourceId") String resourceId,
                  @Param("acceptAPIVersion") String acceptAPIVersion,
                  PutRequest requestPayload,
                  @Param("cookie") String cookie,
                  @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>put</code> method in a fluent style.
   */
  public static class PutQueryParams extends HashMap<String, Object> {
    public PutQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public PutQueryParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query by Filter
   * Query the stored policies
    * @param realm Parameter specifying the realm. (required)
    * @param queryFilter  (required)
    * @param acceptAPIVersion  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param prettyPrint Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)
    * @param pageSize  (optional)
    * @param totalPagedResultsPolicy  (optional)
    * @param sortKeys  (optional)
    * @param cookie  (optional)
   * @return QueryResponse
   */
  @RequestLine("GET /json/realms/{realm}/policies?_fields={fields}&_prettyPrint={prettyPrint}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
    "Accept: application/json",
    "Accept-API-Version: {acceptAPIVersion}",

    "Cookie: {cookie}"
  })
  QueryResponse query(@Param("realm") String realm,
                      @Param("queryFilter") String queryFilter,
                      @Param("acceptAPIVersion") String acceptAPIVersion,
                      @Param("fields") String fields,
                      @Param("prettyPrint") Boolean prettyPrint,
                      @Param("pageSize") Integer pageSize,
                      @Param("totalPagedResultsPolicy") String totalPagedResultsPolicy,
                      @Param("sortKeys") String sortKeys,
                      @Param("cookie") String cookie);

  /**
   * Query by Filter
   * Query the stored policies
   * Note, this is equivalent to the other <code>query</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realm Parameter specifying the realm. (required)
   * @param acceptAPIVersion  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>queryFilter -  (required)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return QueryResponse
   */
  @RequestLine("GET /json/realms/{realm}/policies?_fields={fields}&_prettyPrint={prettyPrint}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Accept-API-Version: {acceptAPIVersion}",

      "Cookie: {cookie}"
  })
  QueryResponse query(@Param("realm") String realm,
                      @Param("acceptAPIVersion") String acceptAPIVersion,
                      @Param("cookie") String cookie,
                      @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>query</code> method in a fluent style.
   */
  public static class QueryQueryParams extends HashMap<String, Object> {
    public QueryQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public QueryQueryParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
    public QueryQueryParams queryFilter(final String value) {
      put("_queryFilter", EncodingUtils.encode(value));
      return this;
    }
    public QueryQueryParams pageSize(final Integer value) {
      put("_pageSize", EncodingUtils.encode(value));
      return this;
    }
    public QueryQueryParams totalPagedResultsPolicy(final String value) {
      put("_totalPagedResultsPolicy", EncodingUtils.encode(value));
      return this;
    }
    public QueryQueryParams sortKeys(final String value) {
      put("_sortKeys", EncodingUtils.encode(value));
      return this;
    }
  }
}
