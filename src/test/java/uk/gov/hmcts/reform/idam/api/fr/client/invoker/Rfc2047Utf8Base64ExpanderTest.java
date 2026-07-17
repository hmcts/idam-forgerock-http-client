package uk.gov.hmcts.reform.idam.api.fr.client.invoker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Rfc2047Utf8Base64ExpanderTest {

    private final Rfc2047Utf8Base64Expander underTest = new Rfc2047Utf8Base64Expander();

    @Test
    public void encodesPasswordWithTrailingSpace() {
        assertThat(underTest.expand("Welcome123 "), is("=?UTF-8?B?V2VsY29tZTEyMyA=?="));
    }

    @Test
    public void encodesUtf8Value() {
        assertThat(underTest.expand("ɗëɱø"), is("=?UTF-8?B?yZfDq8mxw7g=?="));
    }
}
