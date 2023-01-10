package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.IdmRoleMembers;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.IdmRoleMembersQueryResult;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.261Z")
public interface RoleRoleMembersApi extends ApiClient.Api {

  /**
   * Create with Client-Assigned ID
   *
   * @param roleId
   * @param membersId
   * @param requestPayload
   * @param cookie
   * @return RoleMembers
   */
  default IdmRoleMembers putCreate(String roleId, String membersId, IdmRoleMembers requestPayload, String cookie) {
    return putIfRevision(roleId, membersId, requestPayload, null, cookie, "*", null);
  }

  /**
   * Update
   *
   * @param roleId
   * @param membersId
   * @param requestPayload
   * @param cookie
   * @return RoleMembers
   */
  default IdmRoleMembers putUpdate(String roleId, String membersId, IdmRoleMembers requestPayload, String cookie) {
    return putIfRevision(roleId, membersId, requestPayload, null, cookie, null, "*");
  }

  /**
   * Patch
   *
   * @param roleId
   * @param membersId
   * @param patchArray
   * @param cookie
   * @return RoleMembers
   */
  default IdmRoleMembers patch(String roleId, String membersId, PatchArray patchArray, String cookie) {
    return patchIfMatch(roleId, membersId, patchArray, null, cookie, "*");
  }

  /**
   * Delete
   *
   * @param roleId
   * @param membersId
   * @param cookie
   * @return RoleMembers
   */
  default IdmRoleMembers delete(String roleId, String membersId, String cookie) {
    return deleteIfMatch(roleId, membersId, null, cookie, "*");
  }

  /**
   * Delete
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return RoleMembers
   */
  @RequestLine("DELETE /managed/role/{roleId}/members/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-Match: {ifMatch}"
  })
  IdmRoleMembers deleteIfMatch(@Param("roleId") String roleId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Read
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return RoleMembers
   */
  @RequestLine("GET /managed/role/{roleId}/members/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  IdmRoleMembers get(@Param("roleId") String roleId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update via Patch Operations
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return RoleMembers
   */
  @RequestLine("PATCH /managed/role/{roleId}/members/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-Match: {ifMatch}"
  })
  IdmRoleMembers patchIfMatch(@Param("roleId") String roleId, @Param("id") String id, PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Create with Server-Assigned ID
   * 
    * @param roleId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return RoleMembers
   */
  @RequestLine("POST /managed/role/{roleId}/members?_action=create&_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  IdmRoleMembers post(@Param("roleId") String roleId, IdmRoleMembers requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

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
   * @return RoleMembers
   */
  @RequestLine("PUT /managed/role/{roleId}/members/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-None-Match: {ifNoneMatch}",
    
    "If-Match: {ifMatch}"
  })
  IdmRoleMembers putIfRevision(@Param("roleId") String roleId, @Param("id") String id, IdmRoleMembers requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Query by Filter or by Query ID
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
   * @return RoleMembersQueryResult
   */
  @RequestLine("GET /managed/role/{roleId}/members?_fields={fields}&_queryFilter={queryFilter}&_queryId={queryId}&_pagedResultsOffset={pagedResultsOffset}&_pagedResultsCookie={pagedResultsCookie}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
          "Accept: application/json",
          "Cookie: {cookie}"
  })
  IdmRoleMembersQueryResult queryFilter(@Param("roleId") String roleId, @Param("cookie") String cookie, @QueryMap(encoded=true) Map<String, Object> queryParams);

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
