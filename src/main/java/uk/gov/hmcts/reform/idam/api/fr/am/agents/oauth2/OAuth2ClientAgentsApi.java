package uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import feign.Response;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2.model.OAuth2ClientsResultSet;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.026Z")
public interface OAuth2ClientAgentsApi extends ApiClient.Api {

    /**
     * Update or Create with Client-Assigned ID
     *
     * @param id             (required)
     * @param realm          (required)
     * @param requestPayload (required)
     * @param cookie         (optional)
     * @param queryParams    Map of query parameters as name-value pairs
     *                       <p>The following elements may be specified in the query map:</p>
     *                       <ul>
     *                       <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                       <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                       </ul>
     * @return AmAgent
     */
    @RequestLine("PUT /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    AmAgent put(@Param("id") String id, @Param("realm") String realm, AmAgent requestPayload, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>put</code> method in a fluent style.
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
     * @param id          (required)
     * @param realm       (required)
     * @param cookie      (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    </ul>
     * @return AmAgent
     */
    @RequestLine("DELETE /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client/{id}?_fields={fields}&_prettyPrint={prettyPrint}")
    @Headers({
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    AmAgent delete(@Param("id") String id, @Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>delete</code> method in a fluent style.
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
     * Read
     *
     * @param id          (required)
     * @param realm       (required)
     * @param cookie      (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>mimeType - Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)</li>
     *                    </ul>
     * @return AmAgent
     */
    @RequestLine("GET /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client/{id}?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
    @Headers({
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    AmAgent get(@Param("id") String id, @Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
     * Post with Action
     * Call the endpoint with various actions
     *
     * @param realm          (required)
     * @param requestPayload (required)
     * @param cookie         (optional)
     * @param queryParams    Map of query parameters as name-value pairs
     *                       <p>The following elements may be specified in the query map:</p>
     *                       <ul>
     *                       <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                       <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                       <li>action -  (required)</li>
     *                       </ul>
     */
    @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client?_fields={fields}&_prettyPrint={prettyPrint}&_action={action}")
    @Headers({
            "Content-Type: application/json",
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    Response postWithAction(@Param("realm") String realm, AmAgent requestPayload, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>postWithAction</code> method in a fluent style.
     */
    public static class PostWithActionParams extends HashMap<String, Object> {
        public PostWithActionParams fields(final String value) {
            put("_fields", EncodingUtils.encode(value));
            return this;
        }

        public PostWithActionParams prettyPrint(final Boolean value) {
            put("_prettyPrint", EncodingUtils.encode(value));
            return this;
        }

        public PostWithActionParams action(final String value) {
            put("_action", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Query by Filter
     * Querying the agents of a specific type
     *
     * @param realm       (required)
     * @param cookie      (optional)
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
     * @return OAuth2ClientsResultSet
     */
    @RequestLine("GET /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client?_fields={fields}&_prettyPrint={prettyPrint}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
    @Headers({
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    OAuth2ClientsResultSet queryFilter(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
