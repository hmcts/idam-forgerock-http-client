package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserRoles;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserRolesQueryResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public interface UserProvisioningRolesApi extends ApiClient.Api {


  /**
   * Delete
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserRoles
   */
  @RequestLine("DELETE /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  UserRoles deleteIfMatch(@Param("userId") String userId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Delete
   * 
   * Note, this is equivalent to the other <code>deleteIfMatch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteIfMatchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param id  (required)
   * @param cookie  (optional)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return UserRoles
   */
  @RequestLine("DELETE /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}",
      
      "If-Match: {ifMatch}"
  })
  UserRoles deleteIfMatch(@Param("userId") String userId, @Param("id") String id, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteIfMatch</code> method in a fluent style.
   */
  public static class DeleteIfMatchQueryParams extends HashMap<String, Object> {
    public DeleteIfMatchQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Read
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return UserRoles
   */
  @RequestLine("GET /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  UserRoles get(@Param("userId") String userId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Read
   * 
   * Note, this is equivalent to the other <code>get</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param id  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return UserRoles
   */
  @RequestLine("GET /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  UserRoles get(@Param("userId") String userId, @Param("id") String id, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
   * Update via Patch Operations
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserRoles
   */
  @RequestLine("PATCH /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  UserRoles patchIfMatch(@Param("userId") String userId, @Param("id") String id, uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Update via Patch Operations
   * 
   * Note, this is equivalent to the other <code>patchIfMatch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PatchIfMatchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param id  (required)
   * @param requestPayload  (required)
   * @param cookie  (optional)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return UserRoles
   */
  @RequestLine("PATCH /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}",
      
      "If-Match: {ifMatch}"
  })
  UserRoles patchIfMatch(@Param("userId") String userId, @Param("id") String id, uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>patchIfMatch</code> method in a fluent style.
   */
  public static class PatchIfMatchQueryParams extends HashMap<String, Object> {
    public PatchIfMatchQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create with Server-Assigned ID
   * 
    * @param userId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return UserRoles
   */
  @RequestLine("POST /managed/user/{userId}/roles?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  UserRoles post(@Param("userId") String userId, UserRoles requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Create with Server-Assigned ID
   * 
   * Note, this is equivalent to the other <code>post</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param requestPayload  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return UserRoles
   */
  @RequestLine("POST /managed/user/{userId}/roles?_fields={fields}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  UserRoles post(@Param("userId") String userId, UserRoles requestPayload, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>post</code> method in a fluent style.
   */
  public static class PostQueryParams extends HashMap<String, Object> {
    public PostQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update or Create with Client-Assigned ID
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserRoles
   */
  @RequestLine("PUT /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-None-Match: {ifNoneMatch}",
    
    "If-Match: {ifMatch}"
  })
  UserRoles putIfRevision(@Param("userId") String userId, @Param("id") String id, UserRoles requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Update or Create with Client-Assigned ID
   * 
   * Note, this is equivalent to the other <code>putIfRevision</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PutIfRevisionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param id  (required)
   * @param requestPayload  (required)
   * @param cookie  (optional)
   * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return UserRoles
   */
  @RequestLine("PUT /managed/user/{userId}/roles/{id}?_fields={fields}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}",
      
      "If-None-Match: {ifNoneMatch}",
      
      "If-Match: {ifMatch}"
  })
  UserRoles putIfRevision(@Param("userId") String userId, @Param("id") String id, UserRoles requestPayload, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>putIfRevision</code> method in a fluent style.
   */
  public static class PutIfRevisionQueryParams extends HashMap<String, Object> {
    public PutIfRevisionQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query by Filter
   * 
    * @param userId  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param queryFilter  (optional)
    * @param pageSize  (optional)
    * @param totalPagedResultsPolicy  (optional)
    * @param sortKeys  (optional)
   * @return UserRolesQueryResult
   */
  @RequestLine("GET /managed/user/{userId}/roles?_fields={fields}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  UserRolesQueryResult queryFilter(@Param("userId") String userId, @Param("fields") String fields, @Param("cookie") String cookie, @Param("queryFilter") String queryFilter, @Param("pageSize") Integer pageSize, @Param("totalPagedResultsPolicy") String totalPagedResultsPolicy, @Param("sortKeys") String sortKeys);

  /**
   * Query by Filter
   * 
   * Note, this is equivalent to the other <code>queryFilter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryFilterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
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
   * @return UserRolesQueryResult
   */
  @RequestLine("GET /managed/user/{userId}/roles?_fields={fields}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  UserRolesQueryResult queryFilter(@Param("userId") String userId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
