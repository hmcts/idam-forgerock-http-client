package uk.gov.hmcts.reform.idam.api.fr.idm.login;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;

import uk.gov.hmcts.reform.idam.api.fr.idm.login.model.IdmUserInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-09T09:34:50.756+01:00")
public interface InformationApi extends ApiClient.Api {


  /**
   * Read
   * Provides authentication and authorization details, for the authenticated caller (e.g., User).
   * @param fields Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)
   * @param cookie  (optional)
   * @return IdmUserInfo
   */
  @RequestLine("GET /info/login?_fields={fields}")
  @Headers({
          "Accept: application/json",
          "Cookie: {cookie}"
  })
  IdmUserInfo read(@Param("fields") String fields, @Param("cookie") String cookie);

  /**
   * Read
   * Provides authentication and authorization details, for the authenticated caller (e.g., User).
   * Note, this is equivalent to the other <code>read</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReadQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param cookie  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>fields - Optional parameter containing a comma separated list of field references specifying which fields of the targeted JSON resource should be returned. (optional)</li>
   *   </ul>
   * @return IdmUserInfo
   */
  @RequestLine("GET /info/login?_fields={fields}")
  @Headers({
          "Accept: application/json",
          "Cookie: {cookie}"
  })
  IdmUserInfo read(@Param("cookie") String cookie, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>read</code> method in a fluent style.
   */
  public static class ReadQueryParams extends HashMap<String, Object> {
    public ReadQueryParams fields(final String value) {
      put("_fields", EncodingUtils.encode(value));
      return this;
    }
  }
}
