package uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.AssignmentRoles;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.AssignmentRolesResultSet;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.146Z")
public interface AssignmentManagedRolesApi extends ApiClient.Api {

  /**
   * Create with Server-Assigned ID
   *
   * @param assignmentId  (required)
   * @param requestPayload  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return AssignmentRoles
   */
  @RequestLine("POST /managed/assignment/{assignmentId}/roles?_fields={fields}&_prettyPrint={prettyPrint}&_action=create")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AssignmentRoles post(@Param("assignmentId") String assignmentId, AssignmentRoles requestPayload, @QueryMap(encoded = true) Map<String, Object> queryParams);

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

  default AssignmentRoles putCreate(String assignmentID, String roleID, AssignmentRoles payload) {
    return putIfRevision(assignmentID, roleID, payload,
            "*", null, new PutIfRevisionParams());
  }
  
  default AssignmentRoles putUpdate(String assignmentID, String rolesId, AssignmentRoles payload) {
    return putIfRevision(assignmentID, rolesId, payload, null,
            "*", new PutIfRevisionParams());
  }
  
  /**
   * Update or Create with Client-Assigned ID
   *
   * @param assignmentId  (required)
   * @param id  (required)
   * @param requestPayload  (required)
   * @param ifNoneMatch Add on PUT Operations when Creating new Entities (optional)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return AssignmentRoles
   */
  @RequestLine("PUT /managed/assignment/{assignmentId}/roles/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "If-None-Match: {ifNoneMatch}",
      "If-Match: {ifMatch}"
  })
  AssignmentRoles putIfRevision(@Param("assignmentId") String assignmentId, @Param("id") String id, AssignmentRoles requestPayload, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>putIfRevision</code> method in a fluent style.
   */
  public static class PutIfRevisionParams extends HashMap<String, Object> {
    public PutIfRevisionParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public PutIfRevisionParams prettyPrint(final Boolean value) {
      put("_prettyPrint", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   *
   * @param assignmentId
   * @param roleid
   *
   * @return AssignmentRoles
   */
  default AssignmentRoles delete(String assignmentId, String roleid) {
    return deleteIfMatch(assignmentId, roleid,
            "*", new DeleteParams());
  }
  
  /**
   * Delete
   *
   * @param assignmentId  (required)
   * @param id  (required)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return AssignmentRoles
   */
  @RequestLine("DELETE /managed/assignment/{assignmentId}/roles/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Accept: application/json",
      "If-Match: {ifMatch}"
  })
  AssignmentRoles deleteIfMatch(@Param("assignmentId") String assignmentId, @Param("id") String id, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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

  default AssignmentRoles patch(String assignmentId, String rolesId, PatchArray patchOperations) {
    return patchIfMatch(assignmentId, rolesId, patchOperations,
            "*", new PatchParams());
  }

  /**
   * Update via Patch Operations
   *
   * @param assignmentId  (required)
   * @param id  (required)
   * @param requestPayload  (required)
   * @param ifMatch Add on PUT Operations when Updating Existing Entities (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   </ul>
   * @return AssignmentRoles
   */
  @RequestLine("PATCH /managed/assignment/{assignmentId}/roles/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
      "If-Match: {ifMatch}"
  })
  AssignmentRoles patchIfMatch(@Param("assignmentId") String assignmentId, @Param("id") String id, PatchArray requestPayload, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
   * @param assignmentId  (required)
   * @param id  (required)
   * @param ifNoneMatch Add on GET Operations (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>mimeType - Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)</li>
   *   </ul>
   * @return AssignmentRoles
   */
  @RequestLine("GET /managed/assignment/{assignmentId}/roles/{id}?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
  @Headers({
  "Accept: application/json"
  })
  AssignmentRoles get(@Param("assignmentId") String assignmentId, @Param("id") String id, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
   * @param assignmentId  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
   *   <li>queryFilter -  (optional)</li>
   *   <li>queryId -  (optional)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return AssignmentRolesResultSet
   */
  @RequestLine("GET /managed/assignment/{assignmentId}/roles?_fields={fields}&_prettyPrint={prettyPrint}&_queryFilter={queryFilter}&_queryId={queryId}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
  })
  AssignmentRolesResultSet queryFilter(@Param("assignmentId") String assignmentId, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
