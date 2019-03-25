package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAuthzMembers;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAuthzMembersQueryResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.261Z")
public interface RoleAuthorizationRoleMembersApi extends ApiClient.Api {

  /**
   * Create with Client-Assigned ID
   *
   * @param roleId
   * @param authzRolesId
   * @param requestPayload
   * @param cookie
   * @return RoleAuthzMembers
   */
  default RoleAuthzMembers putCreate(String roleId, String authzMembersId, RoleAuthzMembers requestPayload, String cookie) {
    return putIfRevision(roleId, authzMembersId, requestPayload, null, cookie, "*", null);
  }

  /**
   * Update
   *
   * @param roleId
   * @param authzMembersId
   * @param requestPayload
   * @param cookie
   * @return RoleAuthzMembers
   */
  default RoleAuthzMembers putUpdate(String roleId, String authzMembersId, RoleAuthzMembers requestPayload, String cookie) {
    return putIfRevision(roleId, authzMembersId, requestPayload, null, cookie, null, "*");
  }

  /**
   * Patch
   *
   * @param roleId
   * @param authzMembersId
   * @param patchArray
   * @param cookie
   * @return RoleAuthzMembers
   */
  default RoleAuthzMembers patch(String roleId, String authzMembersId, PatchArray patchArray, String cookie) {
    return patchIfMatch(roleId, authzMembersId, patchArray, null, cookie, "*");
  }

  /**
   * Delete
   *
   * @param roleId
   * @param authzMembersId
   * @param cookie
   * @return RoleAuthzMembers
   */
  default RoleAuthzMembers delete(String roleId, String authzMembersId, String cookie) {
    return deleteIfMatch(roleId, authzMembersId, null, cookie, "*");
  }

  /**
   * Delete
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return RoleAuthzMembers
   */
  @RequestLine("DELETE /managed/role/{roleId}/authzMembers/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-Match: {ifMatch}"
  })
  RoleAuthzMembers deleteIfMatch(@Param("roleId") String roleId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Read
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return RoleAuthzMembers
   */
  @RequestLine("GET /managed/role/{roleId}/authzMembers/{id}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  RoleAuthzMembers get(@Param("roleId") String roleId, @Param("id") String id, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Update via Patch Operations
   * 
    * @param roleId  (required)
    * @param id  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @return RoleAuthzMembers
   */
  @RequestLine("PATCH /managed/role/{roleId}/authzMembers/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    "If-Match: {ifMatch}"
  })
  RoleAuthzMembers patchIfMatch(@Param("roleId") String roleId, @Param("id") String id, PatchArray requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifMatch") String ifMatch);

  /**
   * Create with Server-Assigned ID
   * 
    * @param roleId  (required)
    * @param requestPayload  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return RoleAuthzMembers
   */
  @RequestLine("POST /managed/role/{roleId}/authzMembers?_action=create&_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  RoleAuthzMembers post(@Param("roleId") String roleId, RoleAuthzMembers requestPayload, @Param("fields") String fields, @Param("cookie") String cookie);

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
   * @return RoleAuthzMembers
   */
  @RequestLine("PUT /managed/role/{roleId}/authzMembers/{id}?_fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "Cookie: {cookie}",
    
    "If-None-Match: {ifNoneMatch}",
    
    "If-Match: {ifMatch}"
  })
  RoleAuthzMembers putIfRevision(@Param("roleId") String roleId, @Param("id") String id, RoleAuthzMembers requestPayload, @Param("fields") String fields, @Param("cookie") String cookie, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch);

  /**
   * Query by Filter or by Query ID
   *
   * @param roleId  (required)
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
   * @return RoleAuthzMembersQueryResult
   */
  @RequestLine("GET /managed/role/{roleId}/authzMembers?_fields={fields}&_queryFilter={queryFilter}&_queryId={queryId}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  RoleAuthzMembersQueryResult queryFilter(@Param("roleId") String roleId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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