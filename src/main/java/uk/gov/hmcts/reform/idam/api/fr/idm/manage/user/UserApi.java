package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.User;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserQueryResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public interface UserApi extends ApiClient.Api {


  /**
   * Action: triggerSyncCheck
   * 
    * @param userId  (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return uk.gov.hmcts.reform.idam.api.fr.shared.model.Status
   */
  @RequestLine("POST /managed/user/{userId}#_action_triggersynccheck?_fields={fields}&_action={action}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  uk.gov.hmcts.reform.idam.api.fr.shared.model.Status actionTriggerSyncCheck(@Param("userId") String userId, @Param("action") String action, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Action: triggerSyncCheck
   * 
   * Note, this is equivalent to the other <code>actionTriggerSyncCheck</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ActionTriggerSyncCheckQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return uk.gov.hmcts.reform.idam.api.fr.shared.model.Status
   */
  @RequestLine("POST /managed/user/{userId}#_action_triggersynccheck?_fields={fields}&_action={action}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  uk.gov.hmcts.reform.idam.api.fr.shared.model.Status actionTriggerSyncCheck(@Param("userId") String userId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>actionTriggerSyncCheck</code> method in a fluent style.
   */
  public static class ActionTriggerSyncCheckQueryParams extends HashMap<String, Object> {
    public ActionTriggerSyncCheckQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public ActionTriggerSyncCheckQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * 
    * @param userId  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return User
   */
  @RequestLine("DELETE /managed/user/{userId}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  User deleteIfMatch(@Param("userId") String userId, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Delete
   * 
   * Note, this is equivalent to the other <code>deleteIfMatch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteIfMatchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param cookie  (optional)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return User
   */
  @RequestLine("DELETE /managed/user/{userId}?_fields={fields}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}",
      
      "If-Match: {ifMatch}"
  })
  User deleteIfMatch(@Param("userId") String userId, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return User
   */
  @RequestLine("GET /managed/user/{userId}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  User get(@Param("userId") String userId, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Read
   * 
   * Note, this is equivalent to the other <code>get</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return User
   */
  @RequestLine("GET /managed/user/{userId}?_fields={fields}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  User get(@Param("userId") String userId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return User
   */
  @RequestLine("PATCH /managed/user/{userId}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  User patchIfMatch(@Param("userId") String userId, uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Update via Patch Operations
   * 
   * Note, this is equivalent to the other <code>patchIfMatch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PatchIfMatchQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param requestPayload  (required)
   * @param cookie  (optional)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return User
   */
  @RequestLine("PATCH /managed/user/{userId}?_fields={fields}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}",
      
      "If-Match: {ifMatch}"
  })
  User patchIfMatch(@Param("userId") String userId, uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return User
   */
  @RequestLine("POST /managed/user?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  User post(User requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Create with Server-Assigned ID
   * 
   * Note, this is equivalent to the other <code>post</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param requestPayload  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return User
   */
  @RequestLine("POST /managed/user?_fields={fields}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  User post(User requestPayload, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return User
   */
  @RequestLine("PUT /managed/user/{userId}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-None-Match: {ifNoneMatch}",
    
    "If-Match: {ifMatch}"
  })
  User putIfRevision(@Param("userId") String userId, User requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Update or Create with Client-Assigned ID
   * 
   * Note, this is equivalent to the other <code>putIfRevision</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PutIfRevisionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param requestPayload  (required)
   * @param cookie  (optional)
   * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return User
   */
  @RequestLine("PUT /managed/user/{userId}?_fields={fields}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "Cookie: {cookie}",
      
      "If-None-Match: {ifNoneMatch}",
      
      "If-Match: {ifMatch}"
  })
  User putIfRevision(@Param("userId") String userId, User requestPayload, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
   * Query by Filter or by Query ID
   * 
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param queryFilter  (optional)
    * @param queryId  (optional)
    * @param pageSize  (optional)
    * @param totalPagedResultsPolicy  (optional)
    * @param sortKeys  (optional)
   * @return UserQueryResultSet
   */
  @RequestLine("GET /managed/user?_fields={fields}&_queryFilter={queryFilter}&_queryId={queryId}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  UserQueryResultSet queryFilter(@Param("fields") String fields, @Param("cookie") String cookie, @Param("queryFilter") String queryFilter, @Param("queryId") String queryId, @Param("pageSize") Integer pageSize, @Param("totalPagedResultsPolicy") String totalPagedResultsPolicy, @Param("sortKeys") String sortKeys);

  /**
   * Query by Filter or by Query ID
   * 
   * Note, this is equivalent to the other <code>queryFilter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryFilterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>queryFilter -  (optional)</li>
   *   <li>queryId -  (optional)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return UserQueryResultSet
   */
  @RequestLine("GET /managed/user?_fields={fields}&_queryFilter={queryFilter}&_queryId={queryId}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  UserQueryResultSet queryFilter(@Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
    public QueryFilterQueryParams queryId(final String value) {
      put("_queryId", EncodingUtils.encode(value));
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

  /**
   * Action: resetPassword
   * 
    * @param userId  (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return User
   */
  @RequestLine("POST /managed/user/{userId}?_fields={fields}&_action={action}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  User resetPassword(@Param("userId") String userId, @Param("action") String action, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Action: resetPassword
   * 
   * Note, this is equivalent to the other <code>resetPassword</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResetPasswordQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return User
   */
  @RequestLine("POST /managed/user/{userId}?_fields={fields}&_action={action}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  User resetPassword(@Param("userId") String userId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>resetPassword</code> method in a fluent style.
   */
  public static class ResetPasswordQueryParams extends HashMap<String, Object> {
    public ResetPasswordQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public ResetPasswordQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }
}
