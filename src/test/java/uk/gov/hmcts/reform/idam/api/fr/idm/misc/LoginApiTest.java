package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import feign.Response;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class LoginApiTest {

    @Mock
    LoginApi underTest;

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    Response response;

    @Before
    public void setup() {
        given(underTest.getSessionJWT(any(), any())).willCallRealMethod();
        given(underTest.idmLogin(any(), any())).willReturn(response);
    }

    @Test
    public void testGetSessionJWT_oneSessionCookie() {
        given(response.status()).willReturn(HttpStatus.SC_OK);
        given(response.headers().get(HttpHeaders.SET_COOKIE)).willReturn(Collections.singletonList("session-jwt=cookie1"));

        assertThat(underTest.getSessionJWT("test-user", "test-pass"), is("session-jwt=cookie1"));
    }

    @Test
    public void testGetSessionJWT_twoCookiesWithOneSession() {
        given(response.status()).willReturn(HttpStatus.SC_OK);
        given(response.headers().get(HttpHeaders.SET_COOKIE)).willReturn(Arrays.asList("cookie1", "session-jwt=cookie2"));

        assertThat(underTest.getSessionJWT("test-user", "test-pass"), is("session-jwt=cookie2"));
    }

    @Test
    public void testGetSessionJWT_twoCookiesWithTwoSessions() {
        given(response.status()).willReturn(HttpStatus.SC_OK);
        given(response.headers().get(HttpHeaders.SET_COOKIE)).willReturn(Arrays.asList("session-jwt=cookie1", "session-jwt=cookie2"));

        assertThat(underTest.getSessionJWT("test-user", "test-pass"), is("session-jwt=cookie1"));
    }

    @Test
    public void testGetSessionJWT_twoCookiesWithoutSession() {
        given(response.status()).willReturn(HttpStatus.SC_OK);
        given(response.headers().get(HttpHeaders.SET_COOKIE)).willReturn(Arrays.asList("cookie1", "cookie2"));
        try {
            underTest.getSessionJWT("test-user", "test-pass");
            fail();
        } catch (HttpClientErrorException hcee) {
            assertThat(hcee.getRawStatusCode(), is(HttpStatus.SC_UNAUTHORIZED));
            assertThat(hcee.getMessage(), is("invalid username or password"));
        }
    }

    @Test
    public void testGetSessionJWT_test4xxErrorHandling() {
        given(response.status()).willReturn(HttpStatus.SC_FORBIDDEN);
        try {
            underTest.getSessionJWT("test-user", "test-pass");
            fail();
        } catch (HttpClientErrorException hcee) {
            assertThat(hcee.getRawStatusCode(), is(HttpStatus.SC_FORBIDDEN));
        }
    }

    @Test
    public void testGetSessionJWT_test401ErrorHandling() {
        given(response.status()).willReturn(HttpStatus.SC_UNAUTHORIZED);
        given(response.headers().get(HttpHeaders.SET_COOKIE)).willReturn(null);
        try {
            underTest.getSessionJWT("test-user", "test-pass");
            fail();
        } catch (HttpClientErrorException hcee) {
            assertThat(hcee.getRawStatusCode(), is(HttpStatus.SC_UNAUTHORIZED));
            assertThat(hcee.getMessage(), is("invalid username or password"));
        }
    }

    @Test
    public void testGetSessionJWT_test5xxErrorHandling() {
        given(response.status()).willReturn(HttpStatus.SC_BAD_GATEWAY);
        try {
            underTest.getSessionJWT("test-user", "test-pass");
            fail();
        } catch (HttpServerErrorException hsee) {
            assertThat(hsee.getRawStatusCode(), is(HttpStatus.SC_BAD_GATEWAY));
        }
    }

}
