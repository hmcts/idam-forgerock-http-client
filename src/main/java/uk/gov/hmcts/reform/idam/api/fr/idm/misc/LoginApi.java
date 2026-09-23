package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import feign.Response;

public interface LoginApi {

    // Session-cookie extraction and error mapping intentionally belong to consumers.
    // Call idmLogin directly and apply application-specific response and exception policies.

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
