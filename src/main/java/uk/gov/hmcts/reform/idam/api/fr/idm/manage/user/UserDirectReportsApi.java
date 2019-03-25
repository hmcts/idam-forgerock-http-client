package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserReports;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserReportsQueryResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.299Z")
public interface UserDirectReportsApi extends ApiClient.Api {

  /**
   * Create with Server-Assigned ID
   * 
   * Note, this is equivalent to the other <code>post</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PostParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param requestPayload  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return UserReports
   */
  @RequestLine("POST /managed/user/{userId}/reports?_action=create&_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserReports post(@Param("userId") String userId, UserReports requestPayload, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>post</code> method in a fluent style.
   */
  public static class PostParams extends HashMap<String, Object> {
    public PostParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public PostParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
  }

  default UserReports putCreate(String userId, String reportsId, UserReports requestPayload) {
    return putIfRevision(userId, reportsId, requestPayload, "*",
            null, new PutParams());
  }

  default UserReports putUpdate(String userId, String reportsId, UserReports requestPayload) {
    return putIfRevision(userId, reportsId, requestPayload, null,
            "*", new PutParams());
  }
  
  /**
   * Update or Create with Client-Assigned ID
   * 
   * @param userId  (required)
   * @param id  (required)
   * @param requestPayload  (required)
   * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional, default to *)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return UserReports
   */
  @RequestLine("PUT /managed/user/{userId}/reports/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "If-None-Match: {ifNoneMatch}",
      "If-Match: {ifMatch}"
  })
  UserReports putIfRevision(@Param("userId") String userId, @Param("id") String id, UserReports requestPayload, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>putIfRevision</code> method in a fluent style.
   */
  public static class PutParams extends HashMap<String, Object> {
    public PutParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public PutParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   *
   * @param userId
   * @param reportsId
   *
   * @return UserReports
   */
  default UserReports delete(String userId, String reportsId) {
    return deleteIfMatch(userId, reportsId,
            "*", new DeleteParams());
  }

  /**
   * Delete
   * 
   * @param userId  (required)
   * @param id  (required)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional, default to *)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return UserReports
   */
  @RequestLine("DELETE /managed/user/{userId}/reports/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Accept: application/json",
      "If-Match: {ifMatch}"
  })
  UserReports deleteIfMatch(@Param("userId") String userId, @Param("id") String id, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>deleteIfMatch</code> method in a fluent style.
   */
  public static class DeleteParams extends HashMap<String, Object> {
    public DeleteParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public DeleteParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Update via Patch Operations
   *
   * @param userId (required)
   * @param reportsId (required)
   * @param requestPayload (required)
   * @return UserReports
   */
  default UserReports patch(String userId, String reportsId, PatchArray requestPayload) {
    return patchIfMatch(userId, reportsId, requestPayload, "*", new PatchParams());
  }

  /**
   * Update via Patch Operations
   * 
   * @param userId  (required)
   * @param id  (required)
   * @param requestPayload  (required)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional, default to *)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return UserReports
   */
  @RequestLine("PATCH /managed/user/{userId}/reports/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "If-Match: {ifMatch}"
  })
  UserReports patchIfMatch(@Param("userId") String userId, @Param("id") String id, uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>patchIfMatch</code> method in a fluent style.
   */
  public static class PatchParams extends HashMap<String, Object> {
    public PatchParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public PatchParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Read
   * 
   * Note, this is equivalent to the other <code>get</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetParams} class that allows for
   * building up this map in a fluent style.
   * @param userId  (required)
   * @param id  (required)
   * @param ifNoneMatch Add on GET Operations (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>mimeType - Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)</li>
   *   </ul>
   * @return UserReports
   */
  @RequestLine("GET /managed/user/{userId}/reports/{id}?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
  @Headers({
  "Accept: application/json"
  })
  UserReports get(@Param("userId") String userId, @Param("id") String id, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>get</code> method in a fluent style.
   */
  public static class GetParams extends HashMap<String, Object> {
    public GetParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public GetParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
    public GetParams mimeType(final String value) {
      put("_mimeType", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query by Filter
   * 
   * @param userId  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>queryFilter -  (optional)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return UserReportsQueryResult
   */
  @RequestLine("GET /managed/user/{userId}/reports?_fields={fields}&_prettyPrint={prettyPrint}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
  })
  UserReportsQueryResult queryFilter(@Param("userId") String userId, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryFilter</code> method in a fluent style.
   */
  public static class QueryFilterParams extends HashMap<String, Object> {
    public QueryFilterParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
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
