package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.IdmUser;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.IdmUserQueryResultSet;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.Status;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public interface UserApi extends ApiClient.Api {

  /**
   * Create with Client-Assigned ID
   *
   * @param userId
   * @param requestPayload
   * @param cookie
   * @return User
   */
  default IdmUser putCreate(String userId, IdmUser requestPayload, String cookie) {
    return putIfRevision(userId, requestPayload, null, cookie, "*", null);
  }

  /**
   * Update
   *
   * @param userId
   * @param requestPayload
   * @param cookie
   * @return User
   */
  default IdmUser putUpdate(String userId, IdmUser requestPayload, String cookie) {
    return putIfRevision(userId, requestPayload, null, cookie, null, "*");
  }

  /**
   * Patch
   *
   * @param userId
   * @param patchArray
   * @param cookie
   * @return User
   */
  default IdmUser patch(String userId, PatchArray patchArray, String cookie) {
    return patchIfMatch(userId, patchArray, null, cookie, "*");
  }

  /**
   * Delete
   *
   * @param userId
   * @param cookie
   * @return User
   */
  default IdmUser delete(String userId, String cookie) {
    return deleteIfMatch(userId, null, cookie, "*");
  }

  /**
   * Action: triggerSyncCheck
   * 
    * @param userId  (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return Status
   */
  @RequestLine("POST /managed/user/{userId}?_fields={fields}&_action=triggerSyncCheck")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  Status actionTriggerSyncCheck(@Param("userId") String userId, @Param("fields") String fields, @Param("cookie") String cookie);

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
  IdmUser deleteIfMatch(@Param("userId") String userId, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

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
  IdmUser get(@Param("userId") String userId, @Param("fields") String fields, @Param("cookie") String cookie);

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
  IdmUser patchIfMatch(@Param("userId") String userId, PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Create with Server-Assigned ID
   * 
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return User
   */
  @RequestLine("POST /managed/user?_action=create&_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  IdmUser post(IdmUser requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

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
  IdmUser putIfRevision(@Param("userId") String userId, IdmUser requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Query by Filter or by Query ID
   *
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
  IdmUserQueryResultSet queryFilter(@Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
    public QueryFilterParams queryId(final String value) {
      put("_queryId", EncodingUtils.encode(value));
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

  /**
   * Action: resetPassword
   * 
    * @param userId  (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return User
   */
  @RequestLine("POST /managed/user/{userId}?_fields={fields}&_action=resetPassword")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  IdmUser resetPassword(@Param("userId") String userId, @Param("fields") String fields, @Param("cookie") String cookie);
}
