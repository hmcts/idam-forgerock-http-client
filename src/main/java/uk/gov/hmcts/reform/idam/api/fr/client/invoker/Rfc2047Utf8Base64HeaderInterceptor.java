package uk.gov.hmcts.reform.idam.api.fr.client.invoker;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.List;

/**
 * Encodes password headers with leading or trailing whitespace as an RFC 2047 UTF-8 encoded-word.
 */
public class Rfc2047Utf8Base64HeaderInterceptor implements RequestInterceptor {

  private static final String PASSWORD_HEADER = "X-OpenAM-Cust-Password";

  @Override
  public void apply(RequestTemplate template) {
    Collection<String> passwordHeaders = template.headers().get(PASSWORD_HEADER);
    if (passwordHeaders == null || passwordHeaders.isEmpty()) {
      return;
    }

    List<String> encodedPasswordHeaders = new ArrayList<>();
    for (String passwordHeader : passwordHeaders) {
      encodedPasswordHeaders.add(encodeIfBoundaryWhitespace(passwordHeader));
    }

    template.removeHeader(PASSWORD_HEADER);
    template.header(PASSWORD_HEADER, encodedPasswordHeaders);
  }

  static String encodeIfBoundaryWhitespace(String value) {
    if (value == null || !hasBoundaryWhitespace(value)) {
      return value;
    }

    String encoded = Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
    return "=?UTF-8?B?" + encoded + "?=";
  }

  private static boolean hasBoundaryWhitespace(String value) {
    if (value.isEmpty()) {
      return false;
    }
    return isWhitespace(value.codePointAt(0)) || isWhitespace(value.codePointBefore(value.length()));
  }

  private static boolean isWhitespace(int codePoint) {
    return Character.isWhitespace(codePoint) || Character.isSpaceChar(codePoint);
  }
}
