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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.022Z")
public interface ReconciliationApi extends ApiClient.Api {


  /**
   * Action: cancel
   * Cancels a running reconciliation
    * @param reconId Recon ID (required)
    * @param action  (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return ReconCancelResponse
   */
  @RequestLine("POST /recon/{reconId}?_fields={fields}&_action={action}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  ReconCancelResponse actionCancel(@Param("reconId") String reconId, @Param("action") String action, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Action: cancel
   * Cancels a running reconciliation
   * Note, this is equivalent to the other <code>actionCancel</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ActionCancelQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param reconId Recon ID (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return ReconCancelResponse
   */
  @RequestLine("POST /recon/{reconId}?_fields={fields}&_action={action}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  ReconCancelResponse actionCancel(@Param("reconId") String reconId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>actionCancel</code> method in a fluent style.
   */
  public static class ActionCancelQueryParams extends HashMap<String, Object> {
    public ActionCancelQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public ActionCancelQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Read
   * Read an individual reconciliation summary.
    * @param reconId Recon ID (required)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return ReconciliationServiceResource
   */
  @RequestLine("GET /recon/{reconId}?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  ReconciliationServiceResource get(@Param("reconId") String reconId, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Read
   * Read an individual reconciliation summary.
   * Note, this is equivalent to the other <code>get</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param reconId Recon ID (required)
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return ReconciliationServiceResource
   */
  @RequestLine("GET /recon/{reconId}?_fields={fields}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  ReconciliationServiceResource get(@Param("reconId") String reconId, @Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>get</code> method in a fluent style.
   */
  public static class GetQueryParams extends HashMap<String, Object> {
    public GetQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Read
   * Lists all reconciliation summaries.
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return ReconServiceResultSet
   */
  @RequestLine("GET /recon?_fields={fields}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  ReconServiceResultSet list(@Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Read
   * Lists all reconciliation summaries.
   * Note, this is equivalent to the other <code>list</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return ReconServiceResultSet
   */
  @RequestLine("GET /recon?_fields={fields}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  ReconServiceResultSet list(@Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>list</code> method in a fluent style.
   */
  public static class ListQueryParams extends HashMap<String, Object> {
    public ListQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Action: recon
   * Recon all available source identifiers.
    * @param mapping Mapping name (e.g., systemXmlfileAccounts_managedUser) (required)
    * @param action  (required)
    * @param waitForCompletion When true, request will block until reconciliation completes, and will respond immediately when false. (optional)
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
   * @return ReconStateResponse
   */
  @RequestLine("POST /recon?mapping={mapping}&waitForCompletion={waitForCompletion}&_fields={fields}&_action={action}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  ReconStateResponse recon(@Param("mapping") String mapping, @Param("action") String action, @Param("waitForCompletion") Boolean waitForCompletion, @Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Action: recon
   * Recon all available source identifiers.
   * Note, this is equivalent to the other <code>recon</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReconQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>mapping - Mapping name (e.g., systemXmlfileAccounts_managedUser) (required)</li>
   *   <li>waitForCompletion - When true, request will block until reconciliation completes, and will respond immediately when false. (optional)</li>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>action -  (required)</li>
   *   </ul>
   * @return ReconStateResponse
   */
  @RequestLine("POST /recon?mapping={mapping}&waitForCompletion={waitForCompletion}&_fields={fields}&_action={action}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  ReconStateResponse recon(@Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>recon</code> method in a fluent style.
   */
  public static class ReconQueryParams extends HashMap<String, Object> {
    public ReconQueryParams mapping(final String value) {
      put("mapping", EncodingUtils.encode(value));
      return this;
    }
    public ReconQueryParams waitForCompletion(final Boolean value) {
      put("waitForCompletion", EncodingUtils.encode(value));
      return this;
    }
    public ReconQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public ReconQueryParams action(final String value) {
      put("_action", EncodingUtils.encode(value));
      return this;
    }
  }
}
