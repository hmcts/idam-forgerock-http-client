package uk.gov.hmcts.reform.idam.api.fr.client.invoker;

import feign.Param;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Encodes header values as an RFC 2047 UTF-8 encoded-word.
 */
public class Rfc2047Utf8Base64Expander implements Param.Expander {

  @Override
  public String expand(Object value) {
    String encoded = Base64.getEncoder().encodeToString(value.toString().getBytes(StandardCharsets.UTF_8));
    return "=?UTF-8?B?" + encoded + "?=";
  }
}
