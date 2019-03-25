package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import feign.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

public interface LoginApi extends ApiClient.Api {

    default String getSessionJWT(String username, String password) {
        Response response = idmLogin(username, password);
        return response.headers().get(HttpHeaders.SET_COOKIE)
                .stream().findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED,
                        "invalid username or password"));
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
