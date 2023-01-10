package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.es;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.IdmUser;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.IdmUserQueryResultSet;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray;
import uk.gov.hmcts.reform.idam.api.fr.shared.model.Status;

import java.util.HashMap;
import java.util.Map;

@javax.annotation.processing.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:59.475Z")
public interface SearchablesApi extends ApiClient.Api {

  /**
   * Get a total count of all users
   *
   * @return UserQueryResultSet
   */
  @RequestLine("GET /managed/user?_queryId=query-all-count")
  @Headers({
          "Accept: application/json",
          "Cookie: {cookie}"
  })
  SearchableQueryResult<TotalCount> countAllUsers(@Param("cookie") String cookie);

  /**
   * Query by Filter or by Query ID
   *
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
   * @return UserQueryResultSet
   */
  @RequestLine("GET /managed/user?_fields={fields}&_queryFilter={queryFilter}&_queryId={queryId}&_pagedResultsOffset={pagedResultsOffset}&_pagedResultsCookie={pagedResultsCookie}&_pageSize={pageSize}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
          "Accept: application/json",
          "Cookie: {cookie}"
  })
  SearchableQueryResult<IdmESUser> queryFilter(@Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

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
