package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.AccountQueryResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:49:00.022Z")
public interface LdapAccountApi extends ApiClient.Api {


  /**
   * Query by Expression
   * Query by filter of system ldap accounts
    * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
    * @param cookie  (optional)
    * @param queryFilter  (optional)
    * @param pageSize  (optional)
    * @param pagedResultsCookie  (optional)
    * @param totalPagedResultsPolicy  (optional)
    * @param sortKeys  (optional)
   * @return AccountQueryResultSet
   */
  @RequestLine("GET /system/ldap/account?_fields={fields}&_queryFilter={queryFilter}&_pageSize={pageSize}&_pagedResultsCookie={pagedResultsCookie}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
    "Accept: application/json",
    "Cookie: {cookie}"
  })
  AccountQueryResultSet queryFilter(@Param("fields") String fields, @Param("cookie") String cookie, @Param("queryFilter") String queryFilter, @Param("pageSize") Integer pageSize, @Param("pagedResultsCookie") String pagedResultsCookie, @Param("totalPagedResultsPolicy") String totalPagedResultsPolicy, @Param("sortKeys") String sortKeys);

  /**
   * Query by Expression
   * Query by filter of system ldap accounts
   * Note, this is equivalent to the other <code>queryFilter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryFilterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   <li>queryFilter -  (optional)</li>
   *   <li>pageSize -  (optional)</li>
   *   <li>pagedResultsCookie -  (optional)</li>
   *   <li>totalPagedResultsPolicy -  (optional)</li>
   *   <li>sortKeys -  (optional)</li>
   *   </ul>
   * @return AccountQueryResultSet
   */
  @RequestLine("GET /system/ldap/account?_fields={fields}&_queryFilter={queryFilter}&_pageSize={pageSize}&_pagedResultsCookie={pagedResultsCookie}&_totalPagedResultsPolicy={totalPagedResultsPolicy}&_sortKeys={sortKeys}")
  @Headers({
  "Accept: application/json",
      "Cookie: {cookie}"
  })
  AccountQueryResultSet queryFilter(@Param("cookie") String cookie, @QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>queryFilter</code> method in a fluent style.
   */
  public static class QueryFilterQueryParams extends HashMap<String, Object> {
    public QueryFilterQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterQueryParams queryFilter(final String value) {
      put("_queryFilter", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterQueryParams pageSize(final Integer value) {
      put("_pageSize", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterQueryParams pagedResultsCookie(final String value) {
      put("_pagedResultsCookie", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterQueryParams totalPagedResultsPolicy(final String value) {
      put("_totalPagedResultsPolicy", EncodingUtils.encode(value));
      return this;
    }
    public QueryFilterQueryParams sortKeys(final String value) {
      put("_sortKeys", EncodingUtils.encode(value));
      return this;
    }
  }
}
