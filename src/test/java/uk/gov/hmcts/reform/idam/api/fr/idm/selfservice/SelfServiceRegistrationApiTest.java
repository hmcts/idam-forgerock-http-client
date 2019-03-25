package uk.gov.hmcts.reform.idam.api.fr.idm.selfservice;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.GetInitialRequirementsResponse;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.SelfServiceRegistrationResponse;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.SubmitRequirementsRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfServiceRegistrationApi
 */
public class SelfServiceRegistrationApiTest {

    private SelfServiceRegistrationApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SelfServiceRegistrationApi.class);
    }

}
