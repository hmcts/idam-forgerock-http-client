package uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.Assignment;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.AssignmentQueryResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.Status;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.251Z")
public interface AssignmentApi extends ApiClient.Api {

  /**
   * Create with Client-Assigned ID
   *
   * @param assignmentId
   * @param requestPayload
   * @param cookie
   * @return Assignment
   */
  default Assignment putCreate(String assignmentId, Assignment requestPayload, String cookie) {
    return putIfRevision(assignmentId, requestPayload, null, cookie, "*", null);
  }

  /**
   * Update
   *
   * @param assignmentId
   * @param requestPayload
   * @param cookie
   * @return Assignment
   */
  default Assignment putUpdate(String assignmentId, Assignment requestPayload, String cookie) {
    return putIfRevision(assignmentId, requestPayload, null, cookie, null, "*");
  }

  /**
   * Patch
   *
   * @param assignmentId
   * @param patchArray
   * @param cookie
   * @return Assignment
   */
  default Assignment patch(String assignmentId, PatchArray patchArray, String cookie) {
    return patchIfMatch(assignmentId, patchArray, null, cookie, "*");
  }

  /**
   * Delete
   *
   * @param assignmentId
   * @param cookie
   * @return Assignment
   */
  default Assignment delete(String assignmentId, String cookie) {
    return deleteIfMatch(assignmentId, null, cookie, "*");
  }

  /**
   * Action: triggerSyncCheck
   * 
    * @param assignmentId  (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
   * @return uk.gov.hmcts.reform.idam.api.fr.shared.model.Status
   */
  @RequestLine("POST /managed/assignment/{assignmentId}?_fields={fields}&_action=triggerSyncCheck")
  @Headers({
    "Accept: application/json",
  })
  Status actionTriggerSyncCheck(@Param("assignmentId") String assignmentId, @Param("fields") String fields);

  /**
   * Delete
   * 
    * @param assignmentId  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return Assignment
   */
  @RequestLine("DELETE /managed/assignment/{assignmentId}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-Match: {ifMatch}"
  })
  Assignment deleteIfMatch(@Param("assignmentId") String assignmentId, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Read
   * 
    * @param assignmentId  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return Assignment
   */
  @RequestLine("GET /managed/assignment/{assignmentId}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  Assignment get(@Param("assignmentId") String assignmentId, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update via Patch Operations
   * 
    * @param assignmentId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return Assignment
   */
  @RequestLine("PATCH /managed/assignment/{assignmentId}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-Match: {ifMatch}"
  })
  Assignment patchIfMatch(@Param("assignmentId") String assignmentId, PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Create with Server-Assigned ID
   * 
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return Assignment
   */
  @RequestLine("POST /managed/assignment?_action=create&_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  Assignment post(Assignment requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update or Create with Client-Assigned ID
   * 
    * @param assignmentId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return Assignment
   */
  @RequestLine("PUT /managed/assignment/{assignmentId}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-None-Match: {ifNoneMatch}",
    "If-Match: {ifMatch}"
  })
  Assignment putIfRevision(@Param("assignmentId") String assignmentId, Assignment requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Query by Filter
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
   * @return AssignmentQueryResultSet
   */
  @RequestLine("GET /managed/assignment?_fields={fields}&_queryFilter={queryFilter}&_queryId={queryId}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  AssignmentQueryResultSet queryFilter(@Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
}
