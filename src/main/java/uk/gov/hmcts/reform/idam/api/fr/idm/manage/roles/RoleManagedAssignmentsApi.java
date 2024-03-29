package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.IdmRoleAssignments;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.IdmRoleAssignmentsResult;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.261Z")
public interface RoleManagedAssignmentsApi extends ApiClient.Api {

  /**
   * Create with Client-Assigned ID
   *
   * @param roleId
   * @param assignmentsId
   * @param requestPayload
   * @param cookie
   * @return RoleAssignments
   */
  default IdmRoleAssignments putCreate(String roleId, String assignmentsId, IdmRoleAssignments requestPayload, String cookie) {
    return putIfRevision(roleId, assignmentsId, requestPayload, null, cookie, "*", null);
  }

  /**
   * Update
   *
   * @param roleId
   * @param assignmentsId
   * @param requestPayload
   * @param cookie
   * @return RoleAssignments
   */
  default IdmRoleAssignments putUpdate(String roleId, String assignmentsId, IdmRoleAssignments requestPayload, String cookie) {
    return putIfRevision(roleId, assignmentsId, requestPayload, null, cookie, null, "*");
  }

  /**
   * Patch
   *
   * @param roleId
   * @param assignmentsId
   * @param patchArray
   * @param cookie
   * @return RoleAssignments
   */
  default IdmRoleAssignments patch(String roleId, String assignmentsId, PatchArray patchArray, String cookie) {
    return patchIfMatch(roleId, assignmentsId, patchArray, null, cookie, "*");
  }

  /**
   * Delete
   *
   * @param roleId
   * @param assignmentsId
   * @param cookie
   * @return RoleAssignments
   */
  default IdmRoleAssignments delete(String roleId, String assignmentsId, String cookie) {
    return deleteIfMatch(roleId, assignmentsId, null, cookie, "*");
  }

  /**
   * Delete
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return RoleAssignments
   */
  @RequestLine("DELETE /managed/role/{roleId}/assignments/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  IdmRoleAssignments deleteIfMatch(@Param("roleId") String roleId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Read
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return RoleAssignments
   */
  @RequestLine("GET /managed/role/{roleId}/assignments/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  IdmRoleAssignments get(@Param("roleId") String roleId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update via Patch Operations
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return RoleAssignments
   */
  @RequestLine("PATCH /managed/role/{roleId}/assignments/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-Match: {ifMatch}"
  })
  IdmRoleAssignments patchIfMatch(@Param("roleId") String roleId, @Param("id") String id, PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Create with Server-Assigned ID
   * 
    * @param roleId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return RoleAssignments
   */
  @RequestLine("POST /managed/role/{roleId}/assignments?_action=create&_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  IdmRoleAssignments post(@Param("roleId") String roleId, IdmRoleAssignments requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update or Create with Client-Assigned ID
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return RoleAssignments
   */
  @RequestLine("PUT /managed/role/{roleId}/assignments/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-None-Match: {ifNoneMatch}",
    
    "If-Match: {ifMatch}"
  })
  IdmRoleAssignments putIfRevision(@Param("roleId") String roleId, @Param("id") String id, IdmRoleAssignments requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Query by Filter or by ID
   *
   * Note, this is equivalent to the other <code>queryFilter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryFilterParams} class that allows for
   * building up this map in a fluent style.
   * @param roleId  (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>queryFilter -  (optional)</li>
   *   <li>queryId -  (optional)</li>
   *   <li>pagedResultsOffset -  (optional)</li>
   *   <li>pagedResultsCookie -  (optional)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return RoleAssignmentsResult
   */
  @RequestLine("GET /managed/role/{roleId}/assignments?_fields={fields}&_queryFilter={queryFilter}&_queryId={queryId}&_pagedResultsOffset={pagedResultsOffset}&_pagedResultsCookie={pagedResultsCookie}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
          "Accept: application/json",
          "Cookie: {cookie}"
  })
  IdmRoleAssignmentsResult queryFilter(@Param("roleId") String roleId, @Param("cookie") String cookie, @QueryMap(encoded=true) Map<String, Object> queryParams);

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
    public QueryFilterParams pagedResultsOffset(final String value) {
      put("_pagedResultsOffset", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterParams pagedResultsCookie(final String value) {
      put("_pagedResultsCookie", EncodingUtils.encode(value));
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
