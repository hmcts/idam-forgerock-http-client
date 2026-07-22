package uk.gov.hmcts.reform.idam.api.fr.client.invoker;

import feign.Param;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Encodes header values with leading or trailing whitespace as an RFC 2047 UTF-8 encoded-word.
 */
public class Rfc2047Utf8Base64Expander implements Param.Expander {

  @Override
  public String expand(Object value) {
    String stringValue = value.toString();
    if (!hasBoundaryWhitespace(stringValue)) {
      return stringValue;
    }

    String encoded = Base64.getEncoder().encodeToString(stringValue.getBytes(StandardCharsets.UTF_8));
    return "=?UTF-8?B?" + encoded + "?=";
  }

  private boolean hasBoundaryWhitespace(String value) {
    if (value.isEmpty()) {
      return false;
    }
    return isWhitespace(value.codePointAt(0)) || isWhitespace(value.codePointBefore(value.length()));
  }

  private boolean isWhitespace(int codePoint) {
    return Character.isWhitespace(codePoint) || Character.isSpaceChar(codePoint);
  }
}
