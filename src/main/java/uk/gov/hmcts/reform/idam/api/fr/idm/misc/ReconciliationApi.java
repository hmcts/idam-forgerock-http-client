package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.ReconCancelResponse;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.ReconServiceResultSet;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.ReconStateResponse;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.ReconciliationServiceResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-21T15:18:23.581Z")
public interface ReconciliationApi extends ApiClient.Api {

    /**
     * Action: recon
     * Recon all available source identifiers.
     * Note, this is equivalent to the other <code>actionRecon</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link ActionReconParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>mapping - Mapping name (e.g., systemXmlfileAccounts_managedUser) (required)</li>
     *                    <li>waitForCompletion - When true, request will block until reconciliation completes, and will respond immediately when false. (optional)</li>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>action -  (required)</li>
     *                    </ul>
     * @return ReconStateResponse
     */
    @RequestLine("POST /recon?mapping={mapping}&waitForCompletion={waitForCompletion}&_fields={fields}&_prettyPrint={prettyPrint}&_action={action}")
    @Headers({
            "Accept: application/json",
    })
    ReconStateResponse actionRecon(@QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>actionRecon</code> method in a fluent style.
     */
    public static class ActionReconParams extends HashMap<String, Object> {
        public ActionReconParams mapping(final String value) {
            put("mapping", EncodingUtils.encode(value));
            return this;
        }

        public ActionReconParams waitForCompletion(final Boolean value) {
            put("waitForCompletion", EncodingUtils.encode(value));
            return this;
        }

        public ActionReconParams fields(final String value) {
            put("_fields", EncodingUtils.encode(value));
            return this;
        }

        public ActionReconParams prettyPrint(final Boolean value) {
            put("_prettyPrint", EncodingUtils.encode(value));
            return this;
        }

        public ActionReconParams action(final String value) {
            put("_action", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Read
     * Lists all reconciliation summaries.
     * Note, this is equivalent to the other <code>read</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link ReadParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>mimeType - Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)</li>
     *                    </ul>
     * @return ReconServiceResultSet
     */
    @RequestLine("GET /recon?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
    @Headers({
            "Accept: application/json",
    })
    ReconServiceResultSet read(@QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>read</code> method in a fluent style.
     */
    public static class ReadParams extends HashMap<String, Object> {
        public ReadParams fields(final String value) {
            put("_fields", EncodingUtils.encode(value));
            return this;
        }

        public ReadParams prettyPrint(final Boolean value) {
            put("_prettyPrint", EncodingUtils.encode(value));
            return this;
        }

        public ReadParams mimeType(final String value) {
            put("_mimeType", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Action: cancel
     * Cancels a running reconciliation
     * Note, this is equivalent to the other <code>reconidActionCancel</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link ReconActionCancelParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param reconId     Recon ID (required)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>action -  (required)</li>
     *                    </ul>
     * @return ReconCancelResponse
     */
    @RequestLine("POST /recon/{reconId}?_fields={fields}&_prettyPrint={prettyPrint}&_action={action}")
    @Headers({
            "Accept: application/json",
    })
    ReconCancelResponse reconActionCancel(@Param("reconId") String reconId, @QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>reconActionCancel</code> method in a fluent style.
     */
    public static class ReconActionCancelParams extends HashMap<String, Object> {
        public ReconActionCancelParams fields(final String value) {
            put("_fields", EncodingUtils.encode(value));
            return this;
        }

        public ReconActionCancelParams prettyPrint(final Boolean value) {
            put("_prettyPrint", EncodingUtils.encode(value));
            return this;
        }

        public ReconActionCancelParams action(final String value) {
            put("_action", EncodingUtils.encode(value));
            return this;
        }
    }

    /**
     * Read
     * Read an individual reconciliation summary.
     * Note, this is equivalent to the other <code>reconidRead</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link GETReconciliationParams} class that allows for
     * building up this map in a fluent style.
     *
     * @param reconId     Recon ID (required)
     * @param ifNoneMatch Add on GET Operations (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *                    <p>The following elements may be specified in the query map:</p>
     *                    <ul>
     *                    <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
     *                    <li>prettyPrint - Optional parameter requesting that the returned JSON resource content should be formatted to be more human readable. (optional)</li>
     *                    <li>mimeType - Optional parameter requesting that the response have the given MIME-Type. Use of this parameter requires a _fields parameter with a single field specified. (optional)</li>
     *                    </ul>
     * @return ReconciliationServiceResource
     */
    @RequestLine("GET /recon/{reconId}?_fields={fields}&_prettyPrint={prettyPrint}&_mimeType={mimeType}")
    @Headers({
            "Accept: application/json",
            "If-None-Match: {ifNoneMatch}"
    })
    ReconciliationServiceResource getReconciliation(@Param("reconId") String reconId, @Param("ifNoneMatch") String ifNoneMatch, @QueryMap(encoded = true) Map<String, Object> queryParams);

    /**
     * A convenience class for generating query parameters for the
     * <code>getReconciliation</code> method in a fluent style.
     */
    public static class GETReconciliationParams extends HashMap<String, Object> {
        public GETReconciliationParams fields(final String value) {
            put("_fields", EncodingUtils.encode(value));
            return this;
        }

        public GETReconciliationParams prettyPrint(final Boolean value) {
            put("_prettyPrint", EncodingUtils.encode(value));
            return this;
        }

        public GETReconciliationParams mimeType(final String value) {
            put("_mimeType", EncodingUtils.encode(value));
            return this;
        }
    }
}
