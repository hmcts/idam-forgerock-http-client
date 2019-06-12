package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.IdmUserReports;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.IdmUserReportsQueryResult;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public interface UserDirectReportsApi extends ApiClient.Api {

  /**
   * Create with Client-Assigned ID
   *
   * @param userId
   * @param reportsId
   * @param requestPayload
   * @param cookie
   * @return UserReports
   */
  default IdmUserReports putCreate(String userId, String reportsId, IdmUserReports requestPayload, String cookie) {
    return putIfRevision(userId, reportsId, requestPayload, null, cookie, "*", null);
  }

  /**
   * Update
   *
   * @param userId
   * @param reportsId
   * @param requestPayload
   * @param cookie
   * @return UserReports
   */
  default IdmUserReports putUpdate(String userId, String reportsId, IdmUserReports requestPayload, String cookie) {
    return putIfRevision(userId, reportsId, requestPayload, null, cookie, null, "*");
  }

  /**
   * Patch
   *
   * @param userId
   * @param reportsId
   * @param patchArray
   * @param cookie
   * @return UserReports
   */
  default IdmUserReports patch(String userId, String reportsId, PatchArray patchArray, String cookie) {
    return patchIfMatch(userId, reportsId, patchArray, null, cookie, "*");
  }

  /**
   * Delete
   *
   * @param userId
   * @param reportsId
   * @param cookie
   * @return UserReports
   */
  default IdmUserReports delete(String userId, String reportsId, String cookie) {
    return deleteIfMatch(userId, reportsId, null, cookie, "*");
  }

  /**
   * Delete
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserReports
   */
  @RequestLine("DELETE /managed/user/{userId}/reports/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-Match: {ifMatch}"
  })
  IdmUserReports deleteIfMatch(@Param("userId") String userId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Read
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return UserReports
   */
  @RequestLine("GET /managed/user/{userId}/reports/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  IdmUserReports get(@Param("userId") String userId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update via Patch Operations
   * 
    * @param userId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return UserReports
   */
  @RequestLine("PATCH /managed/user/{userId}/reports/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  IdmUserReports patchIfMatch(@Param("userId") String userId, @Param("id") String id, PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Create with Server-Assigned ID
   * 
    * @param userId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return UserReports
   */
  @RequestLine("POST /managed/user/{userId}/reports?_action=create&_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  IdmUserReports post(@Param("userId") String userId, IdmUserReports requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

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
   * @return UserReports
   */
  @RequestLine("PUT /managed/user/{userId}/reports/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-None-Match: {ifNoneMatch}",
    
    "If-Match: {ifMatch}"
  })
  IdmUserReports putIfRevision(@Param("userId") String userId, @Param("id") String id, IdmUserReports requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

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
   *   <li>pagedResultsCookie -  (optional)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return UserReportsQueryResult
   */
  @RequestLine("GET /managed/user/{userId}/reports?_fields={fields}&_queryFilter={queryFilter}&_pagedResultsCookie={pagedResultsCookie}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
          "Accept: application/json",
          "Cookie: {cookie}"
  })
  IdmUserReportsQueryResult queryFilter(@Param("userId") String userId, @Param("cookie") String cookie, @QueryMap(encoded=true) Map<String, Object> queryParams);

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
    public QueryFilterQueryParams pagedResultsCookie(final String value) {
      put("_pagedResultsCookie", EncodingUtils.encode(value));
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
