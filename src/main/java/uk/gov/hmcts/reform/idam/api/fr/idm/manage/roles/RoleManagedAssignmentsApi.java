package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAssignments;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAssignmentsResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.755Z")
public interface RoleManagedAssignmentsApi extends ApiClient.Api {

    /**
     * Create with Server-Assigned ID
     *
     * @param roleId         (required)
     * @param requestPayload (required)
     * @param queryParams    Map of query parameters as name-value pairs
     *                       <p>The following elements may be specified in the query map:</p>
     *                       <ul>
     *                       <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                       <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                       </ul>
     * @return RoleAssignments
     */
    @RequestLine("POST /managed/role/{roleId}/assignments?_action=create&_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json",
    })
    RoleAssignments post(@Param("roleId") String roleId, RoleAssignments requestPayload, @QueryMap(encoded = true) Map<String, Object> queryParams);

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

    default RoleAssignments putCreate(String userId, String roleAssignmentsId, RoleAssignments requestPayload) {
        return putIfRevision(userId, roleAssignmentsId, requestPayload, "*",
                null, new PutParams());
    }

    default RoleAssignments putUpdate(String userId, String roleAssignmentsId, RoleAssignments requestPayload) {
        return putIfRevision(userId, roleAssignmentsId, requestPayload, null,
                "*", new PutParams());
    }

    /**
     * Update or Create with Client-Assigned ID
     *
     * @param roleId         (required)
     * @param id             (required)
     * @param requestPayload (required)
     * @param ifNoneMatch    Add on PUT Operations when Creating new Entities (optional)
     * @param ifMatch        Add on PUT Operations when Updating Existing Entities (optional)
     * @param queryParams    Map of query parameters as name-value pairs
     *                       <p>The following elements may be specified in the query map:</p>
     *                       <ul>
     *                       <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                       <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                       </ul>
     * @return RoleAssignments
     */
    @RequestLine("PUT /managed/role/{roleId}/assignments/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json",
            "If-None-Match: {ifNoneMatch}",
            "If-Match: {ifMatch}"
    })
    RoleAssignments putIfRevision(@Param("roleId") String roleId, @Param("id") String id, RoleAssignments requestPayload, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
     * @param roleId
     * @param assignmentsId
     *
     * @return RoleAssignments
     */
    default RoleAssignments delete(String roleId, String assignmentsId) {
        return deleteIfMatch(roleId, assignmentsId,
                "*", new DeleteParams());
    }

    /**
     * Delete
     * <p>
     * Note, this is equivalent to the other <code>deleteIfMatch</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link DeleteParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param roleId      (required)
     * @param id          (required)
     * @param ifMatch     Add on PUT Operations when Updating Existing Entities (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    </ul>
     * @return RoleAssignments
     */
    @RequestLine("DELETE /managed/role/{roleId}/assignments/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Accept: application/json",
            "If-Match: {ifMatch}"
    })
    RoleAssignments deleteIfMatch(@Param("roleId") String roleId, @Param("id") String id, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
     * @param roleId (required)
     * @param roleAssignmentsId (required)
     * @param requestPayload (required)
     * @return RoleAssignments
     */
    default RoleAssignments patch(String roleId, String roleAssignmentsId, PatchArray requestPayload) {
        return patchIfMatch(roleId, roleAssignmentsId, requestPayload, "*", new PatchParams());
    }

    /**
     * Update via Patch Operations
     * <p>
     * Note, this is equivalent to the other <code>patchIfMatch</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link PatchParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param roleId         (required)
     * @param id             (required)
     * @param requestPayload (required)
     * @param ifMatch        Add on PUT Operations when Updating Existing Entities (optional)
     * @param queryParams    Map of query parameters as name-value pairs
     *                       <p>The following elements may be specified in the query map:</p>
     *                       <ul>
     *                       <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                       <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                       </ul>
     * @return RoleAssignments
     */
    @RequestLine("PATCH /managed/role/{roleId}/assignments/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json",
            "If-Match: {ifMatch}"
    })
    RoleAssignments patchIfMatch(@Param("roleId") String roleId, @Param("id") String id, PatchArray requestPayload, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
     * @param roleId      (required)
     * @param id          (required)
     * @param ifNoneMatch Add on GET Operations (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>mimeType - Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)</li>
     *                    </ul>
     * @return RoleAssignments
     */
    @RequestLine("GET /managed/role/{roleId}/assignments/{id}?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
    @Headers({
            "Accept: application/json"
    })
    RoleAssignments get(@Param("roleId") String roleId, @Param("id") String id, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
     * Query by Filter or by ID
     *
     * @param roleId      (required)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>queryFilter -  (optional)</li>
     *                    <li>queryId -  (optional)</li>
     *                    <li>pageSize -  (optional)</li>
     *                    <li>totalPagedResultsPolicy -  (optional)</li>
     *                    <li>sortKeys -  (optional)</li>
     *                    </ul>
     * @return RoleAssignmentsResult
     */
    @RequestLine("GET /managed/role/{roleId}/assignments?_fields={fields}&_prettyPrint={prettyPrint}&_queryFilter={queryFilter}&_queryId={queryId}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
    @Headers({
            "Accept: application/json",
    })
    RoleAssignmentsResult queryFilter(@Param("roleId") String roleId, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
