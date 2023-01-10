package uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.AssignmentRoles;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.AssignmentRolesQueryResult;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.251Z")
public interface AssignmentManagedRolesApi extends ApiClient.Api {

  /**
   * Create with Client-Assigned ID
   *
   * @param assignmentId
   * @param rolesId
   * @param requestPayload
   * @param cookie
   * @return AssignmentRoles
   */
  default AssignmentRoles putCreate(String assignmentId, String rolesId, AssignmentRoles requestPayload, String cookie) {
    return putIfRevision(assignmentId, rolesId, requestPayload, null, cookie, "*", null);
  }

  /**
   * Update
   *
   * @param assignmentId
   * @param rolesId
   * @param requestPayload
   * @param cookie
   * @return AssignmentRoles
   */
  default AssignmentRoles putUpdate(String assignmentId, String rolesId, AssignmentRoles requestPayload, String cookie) {
    return putIfRevision(assignmentId, rolesId, requestPayload, null, cookie, null, "*");
  }

  /**
   * Patch
   *
   * @param assignmentId
   * @param rolesId
   * @param patchArray
   * @param cookie
   * @return AssignmentRoles
   */
  default AssignmentRoles patch(String assignmentId, String rolesId, PatchArray patchArray, String cookie) {
    return patchIfMatch(assignmentId, rolesId, patchArray, null, cookie, "*");
  }

  /**
   * Delete
   *
   * @param assignmentId
   * @param rolesId
   * @param cookie
   * @return AssignmentRoles
   */
  default AssignmentRoles delete(String assignmentId, String rolesId, String cookie) {
    return deleteIfMatch(assignmentId, rolesId, null, cookie, "*");
  }

  /**
   * Delete
   * 
    * @param assignmentId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return AssignmentRoles
   */
  @RequestLine("DELETE /managed/assignment/{assignmentId}/roles/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  AssignmentRoles deleteIfMatch(@Param("assignmentId") String assignmentId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Read
   * 
    * @param assignmentId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return AssignmentRoles
   */
  @RequestLine("GET /managed/assignment/{assignmentId}/roles/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  AssignmentRoles get(@Param("assignmentId") String assignmentId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update via Patch Operations
   * 
    * @param assignmentId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return AssignmentRoles
   */
  @RequestLine("PATCH /managed/assignment/{assignmentId}/roles/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-Match: {ifMatch}"
  })
  AssignmentRoles patchIfMatch(@Param("assignmentId") String assignmentId, @Param("id") String id, PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Create with Server-Assigned ID
   * 
    * @param assignmentId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return AssignmentRoles
   */
  @RequestLine("POST /managed/assignment/{assignmentId}/roles?_action=create&_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  AssignmentRoles post(@Param("assignmentId") String assignmentId, AssignmentRoles requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update or Create with Client-Assigned ID
   * 
    * @param assignmentId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return AssignmentRoles
   */
  @RequestLine("PUT /managed/assignment/{assignmentId}/roles/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-None-Match: {ifNoneMatch}",
    "If-Match: {ifMatch}"
  })
  AssignmentRoles putIfRevision(@Param("assignmentId") String assignmentId, @Param("id") String id, AssignmentRoles requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Query by Filter
   *
   * @param assignmentId  (required)
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
   * @return AssignmentRolesQueryResult
   */
  @RequestLine("GET /managed/assignment/{assignmentId}/roles?_fields={fields}&_queryFilter={queryFilter}&_queryId={queryId}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  AssignmentRolesQueryResult queryFilter(@Param("assignmentId") String assignmentId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
