package uk.gov.hmcts.reform.idam.api.fr.am.authenticate;

import feign.Client;
import feign.Request;
import feign.Response;
import org.junit.Before;
import org.junit.Test;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AuthenticationChainApiTest {

    private CapturingClient client;
    private AuthenticationChainApi api;

    @Before
    public void setup() {
        client = new CapturingClient();

        ApiClient apiClient = new ApiClient();
        apiClient.getFeignBuilder().client(client);
        api = apiClient.buildClient(AuthenticationChainApi.class);
    }

    @Test
    public void authenticateEncodesPasswordHeaderAsRfc2047Utf8Base64() {
        api.authenticate(
                "root",
                "service",
                "hotpChain",
                "127.0.0.1",
                "https://redirect.example",
                "test-user",
                "Welcome123 ",
                null
        );

        Collection<String> passwordHeaders = client.request.headers().get("X-OpenAM-Cust-Password");
        assertThat(passwordHeaders.size(), is(1));
        assertThat(passwordHeaders.iterator().next(), is("=?UTF-8?B?V2VsY29tZTEyMyA=?="));
    }

    private static class CapturingClient implements Client {
        private Request request;

        @Override
        public Response execute(Request request, Request.Options options) throws IOException {
            this.request = request;
            return Response.builder()
                    .status(200)
                    .reason("OK")
                    .headers(Collections.emptyMap())
                    .request(request)
                    .body("{}", StandardCharsets.UTF_8)
                    .build();
        }
    }
}
