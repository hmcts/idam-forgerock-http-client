package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import feign.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

import java.util.Optional;

import static java.nio.charset.StandardCharsets.UTF_8;

public interface LoginApi extends ApiClient.Api {

    default String getSessionJWT(String username, String password) {
        Response response = idmLogin(username, password);
        HttpStatus responseStatus = HttpStatus.valueOf(response.status());
        if (responseStatus.is4xxClientError() && responseStatus != HttpStatus.UNAUTHORIZED) {
            throw HttpClientErrorException.create(response.reason(), responseStatus, response.reason(), HttpHeaders.EMPTY, null, UTF_8);
        } else if (responseStatus.is5xxServerError()) {
            throw HttpServerErrorException.create(response.reason(), responseStatus, response.reason(), HttpHeaders.EMPTY, null, UTF_8);
        }
        return Optional.ofNullable(response.headers().get(HttpHeaders.SET_COOKIE))
                .map(cookies -> String.join(" ", cookies))
                .orElseThrow(() ->
                        HttpClientErrorException.create(
                                "invalid username or password",
                                HttpStatus.UNAUTHORIZED,
                                HttpStatus.UNAUTHORIZED.getReasonPhrase(),
                                HttpHeaders.EMPTY,
                                null,
                                UTF_8));
    }

    /**
     * Send a login request to IDM
     *
     * @param xOpenIDMUsername The Username (required)
     * @param xOpenIDMPassword The Password (required)
     * @return Response
     */
    @RequestLine("GET /info/login")
    @Headers({
            "Accept: application/json",
            "X-OpenIDM-Username: {xOpenIDMUsername}",
            "X-OpenIDM-Password: {xOpenIDMPassword}"
    })
    Response idmLogin(@Param("xOpenIDMUsername") String xOpenIDMUsername, @Param("xOpenIDMPassword") String xOpenIDMPassword);
}
