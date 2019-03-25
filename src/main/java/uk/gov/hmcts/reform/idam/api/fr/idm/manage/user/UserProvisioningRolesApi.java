package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserRoles;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserRolesQueryResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.299Z")
public interface UserProvisioningRolesApi extends ApiClient.Api {

    /**
     * Create with Server-Assigned ID
     * <p>
     * Note, this is equivalent to the other <code>post</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link PostParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param userId         (required)
     * @param requestPayload (required)
     * @param queryParams    Map of query parameters as name-value pairs
     *                       <p>The following elements may be specified in the query map:</p>
     *                       <ul>
     *                       <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                       <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                       </ul>
     * @return UserRoles
     */
    @RequestLine("POST /managed/user/{userId}/roles?_action=create&_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json",
    })
    UserRoles post(@Param("userId") String userId, UserRoles requestPayload, @QueryMap(encoded = true) Map<String, Object> queryParams);

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

    default UserRoles putCreate(String userId, String rolesId, UserRoles requestPayload) {
        return putIfRevision(userId, rolesId, requestPayload, "*",
                null, new PutParams());
    }

    default UserRoles putUpdate(String userId, String rolesId, UserRoles requestPayload) {
        return putIfRevision(userId, rolesId, requestPayload, null,
                "*", new PutParams());
    }

    /**
     * Update or Create with Client-Assigned ID
     * <p>
     * Note, this is equivalent to the other <code>putIfRevision</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link PutParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param userId         (required)
     * @param id             (required)
     * @param requestPayload (required)
     * @param ifNoneMatch    Add on PUT Operations when Creating new Entities (optional)
     * @param ifMatch        Add on PUT Operations when Updating Existing Entities (optional, default to *)
     * @param queryParams    Map of query parameters as name-value pairs
     *                       <p>The following elements may be specified in the query map:</p>
     *                       <ul>
     *                       <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                       <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                       </ul>
     * @return UserRoles
     */
    @RequestLine("PUT /managed/user/{userId}/roles/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json",
            "If-None-Match: {ifNoneMatch}",

            "If-Match: {ifMatch}"
    })
    UserRoles putIfRevision(@Param("userId") String userId, @Param("id") String id, UserRoles requestPayload, @Param("ifNoneMatch") String ifNoneMatch, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
     * @param rolesId
     *
     * @return UserRoles
     */
    default UserRoles delete(String userId, String rolesId) {
        return deleteIfMatch(userId, rolesId,
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
     * @param userId      (required)
     * @param id          (required)
     * @param ifMatch     Add on PUT Operations when Updating Existing Entities (optional, default to *)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    </ul>
     * @return UserRoles
     */
    @RequestLine("DELETE /managed/user/{userId}/roles/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Accept: application/json",
            "If-Match: {ifMatch}"
    })
    UserRoles deleteIfMatch(@Param("userId") String userId, @Param("id") String id, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
     * @param rolesId (required)
     * @param requestPayload (required)
     * @return UserRoles
     */
    default UserRoles patch(String userId, String rolesId, PatchArray requestPayload) {
        return patchIfMatch(userId, rolesId, requestPayload, "*", new PatchParams());
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
     * @param userId         (required)
     * @param id             (required)
     * @param requestPayload (required)
     * @param ifMatch        Add on PUT Operations when Updating Existing Entities (optional, default to *)
     * @param queryParams    Map of query parameters as name-value pairs
     *                       <p>The following elements may be specified in the query map:</p>
     *                       <ul>
     *                       <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                       <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                       </ul>
     * @return UserRoles
     */
    @RequestLine("PATCH /managed/user/{userId}/roles/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json",
            "If-Match: {ifMatch}"
    })
    UserRoles patchIfMatch(@Param("userId") String userId, @Param("id") String id, PatchArray requestPayload, @Param("ifMatch") String ifMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
     * <p>
     * Note, this is equivalent to the other <code>get</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GetParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param userId      (required)
     * @param id          (required)
     * @param ifNoneMatch Add on GET Operations (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>mimeType - Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)</li>
     *                    </ul>
     * @return UserRoles
     */
    @RequestLine("GET /managed/user/{userId}/roles/{id}?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
    @Headers({
            "Accept: application/json"
    })
    UserRoles get(@Param("userId") String userId, @Param("id") String id, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
     * <p>
     * Note, this is equivalent to the other <code>queryFilter</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link QueryFilterParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param userId      (required)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>queryFilter -  (optional)</li>
     *                    <li>pageSize -  (optional)</li>
     *                    <li>totalPagedResultsPolicy -  (optional)</li>
     *                    <li>sortKeys -  (optional)</li>
     *                    </ul>
     * @return UserRolesQueryResult
     */
    @RequestLine("GET /managed/user/{userId}/roles?_fields={fields}&_prettyPrint={prettyPrint}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
    @Headers({
            "Accept: application/json",
    })
    UserRolesQueryResult queryFilter(@Param("userId") String userId, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
