package uk.gov.hmcts.reform.idam.api.fr.client.invoker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Rfc2047Utf8Base64HeaderInterceptorTest {

    @Test
    public void encodesPasswordWithTrailingSpace() {
        assertThat(Rfc2047Utf8Base64HeaderInterceptor.encodeIfBoundaryWhitespace("Welcome123 "), is("=?UTF-8?B?V2VsY29tZTEyMyA=?="));
    }

    @Test
    public void encodesPasswordWithLeadingSpace() {
        assertThat(Rfc2047Utf8Base64HeaderInterceptor.encodeIfBoundaryWhitespace(" Welcome123"), is("=?UTF-8?B?IFdlbGNvbWUxMjM=?="));
    }

    @Test
    public void encodesWhitespaceOnlyPassword() {
        assertThat(Rfc2047Utf8Base64HeaderInterceptor.encodeIfBoundaryWhitespace(" "), is("=?UTF-8?B?IA==?="));
    }

    @Test
    public void returnsRawPasswordWithoutBoundaryWhitespace() {
        assertThat(Rfc2047Utf8Base64HeaderInterceptor.encodeIfBoundaryWhitespace("Welcome123"), is("Welcome123"));
    }

    @Test
    public void returnsRawUtf8ValueWithoutBoundaryWhitespace() {
        assertThat(Rfc2047Utf8Base64HeaderInterceptor.encodeIfBoundaryWhitespace("ɗëɱø"), is("ɗëɱø"));
    }
}
