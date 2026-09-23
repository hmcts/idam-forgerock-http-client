package uk.gov.hmcts.reform.idam.api.fr.client.invoker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EncodingUtilsTest {

    @Test
    public void encodesQueryValuesAsUtf8FormData() {
        assertEquals("a+b%2Bc%2F%C3%BC", EncodingUtils.encode("a b+c/ü"));
        assertEquals("42", EncodingUtils.encode(42));
        assertNull(EncodingUtils.encode(null));
    }
}
