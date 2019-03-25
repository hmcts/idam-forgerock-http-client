package uk.gov.hmcts.reform.idam.api.fr.am.agents;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentGetAllTypes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentGetCreatableTypes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentNextDescendents;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentsResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:22.399Z")
public interface AggregatingAgentsApi extends ApiClient.Api {

    /**
     * Action: nextdescendents
     * Obtain the collection of secondary configuration instances that have been added to the resource
     *
     * @param realm       (required)
     * @param cookie      (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>action -  (required)</li>
     *                    </ul>
     * @return AmAgentNextDescendents
     */
    @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents?_fields={fields}&_prettyPrint={prettyPrint}&_action={action}")
    @Headers({
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    AmAgentNextDescendents postActionNextDescendents(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>postActionNextDescendents</code> method in a fluent style.
     */
    public static class ActionNextDescendentsParams extends HashMap<String, Object> {
        public ActionNextDescendentsParams fields(final String value) {
            put("_fields", EncodingUtils.encode(value));
            return this;
        }

        public ActionNextDescendentsParams prettyPrint(final Boolean value) {
            put("_prettyPrint", EncodingUtils.encode(value));
            return this;
        }

        public ActionNextDescendentsParams action(final String value) {
            put("_action", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Post Action Get All Types
     * Obtain the collection of all secondary configuration types related to the resource
     *
     * @param realm       (required)
     * @param cookie      (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>action -  (required)</li>
     *                    </ul>
     * @return AmAgentGetAllTypes
     */
    @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents?_fields={fields}&_prettyPrint={prettyPrint}&_action={action}")
    @Headers({
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    AmAgentGetAllTypes postActionGetAllTypes(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>postActionGetAllTypes</code> method in a fluent style.
     */
    public static class ActionGetAllTypesParams extends HashMap<String, Object> {
        public ActionGetAllTypesParams fields(final String value) {
            put("_fields", EncodingUtils.encode(value));
            return this;
        }

        public ActionGetAllTypesParams prettyPrint(final Boolean value) {
            put("_prettyPrint", EncodingUtils.encode(value));
            return this;
        }

        public ActionGetAllTypesParams action(final String value) {
            put("_action", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Post Action Get Creatable Types
     * Obtain the collection of secondary configuration types that have yet to be added to the resource.
     *
     * @param realm       (required)
     * @param cookie      (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>action -  (required)</li>
     *                    </ul>
     * @return AmAgentGetCreatableTypes
     */
    @RequestLine("POST /json/realms/root/realms/{realm}/realm-config/agents?_fields={fields}&_prettyPrint={prettyPrint}&_action={action}")
    @Headers({
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    AmAgentGetCreatableTypes postActionGetCreatableTypes(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>postActionGetCreatableTypes</code> method in a fluent style.
     */
    public static class ActionGetCreatableTypesParams extends HashMap<String, Object> {
        public ActionGetCreatableTypesParams fields(final String value) {
            put("_fields", EncodingUtils.encode(value));
            return this;
        }

        public ActionGetCreatableTypesParams prettyPrint(final Boolean value) {
            put("_prettyPrint", EncodingUtils.encode(value));
            return this;
        }

        public ActionGetCreatableTypesParams action(final String value) {
            put("_action", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Query by Filter
     * Querying the aggregating agents
     *
     * @param realm       (required)
     * @param cookie      (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>queryFilter -  (required)</li>
     *                    <li>pageSize -  (optional)</li>
     *                    <li>totalPagedResultsPolicy -  (optional)</li>
     *                    <li>sortKeys -  (optional)</li>
     *                    </ul>
     * @return AmAgentsResultSet
     */
    @RequestLine("GET /json/realms/root/realms/{realm}/realm-config/agents?_fields={fields}&_prettyPrint={prettyPrint}&_queryFilter={queryFilter}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
    @Headers({
            "Accept: application/json",
            "Cookie: {cookie}"
    })
    AmAgentsResultSet queryFilter(@Param("realm") String realm, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
