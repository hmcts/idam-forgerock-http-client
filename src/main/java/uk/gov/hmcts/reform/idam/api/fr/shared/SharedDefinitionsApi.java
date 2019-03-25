package uk.gov.hmcts.reform.idam.api.fr.shared;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.EncodingUtils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-25T13:48:57.386Z")
public interface SharedDefinitionsApi extends ApiClient.Api {


  /**
   * Placeholder for Generation Purposes
   * 
    * @param nothingDontCallThisEndpoint  (required)
   * @return String
   */
  @RequestLine("GET /shared/definitions?_nothing_dont_call_this_endpoint={nothingDontCallThisEndpoint}")
  @Headers({
    "Accept: application/json",
  })
  String notARealEndpoint(@Param("nothingDontCallThisEndpoint") Integer nothingDontCallThisEndpoint);

  /**
   * Placeholder for Generation Purposes
   * 
   * Note, this is equivalent to the other <code>notARealEndpoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NotARealEndpointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>nothingDontCallThisEndpoint -  (required)</li>
   *   </ul>
   * @return String
   */
  @RequestLine("GET /shared/definitions?_nothing_dont_call_this_endpoint={nothingDontCallThisEndpoint}")
  @Headers({
  "Accept: application/json",
  })
  String notARealEndpoint(@QueryMap(encoded = true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>notARealEndpoint</code> method in a fluent style.
   */
  public static class NotARealEndpointQueryParams extends HashMap<String, Object> {
    public NotARealEndpointQueryParams nothingDontCallThisEndpoint(final Integer value) {
      put("_nothing_dont_call_this_endpoint", EncodingUtils.encode(value));
      return this;
    }
  }
}
