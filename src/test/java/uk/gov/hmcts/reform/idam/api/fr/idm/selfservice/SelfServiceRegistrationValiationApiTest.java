package uk.gov.hmcts.reform.idam.api.fr.idm.selfservice;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.model.ValidateObjectResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfServiceRegistrationValiationApi
 */
public class SelfServiceRegistrationValiationApiTest {

    private SelfServiceRegistrationValiationApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SelfServiceRegistrationValiationApi.class);
    }

    
    /**
     * Action: validateObject
     *
     * Submits requirements for stage.
     */
    @Test
    public void policySelfserviceRegistrationValidationTest() {
        Object requestPayload = null;
        String action = null;
        // ValidateObjectResponse response = api.policySelfserviceRegistrationValidation(requestPayload, action);

        // TODO: test validations
    }

    /**
     * Action: validateObject
     *
     * Submits requirements for stage.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void policySelfserviceRegistrationValidationTestQueryMap() {
        Object requestPayload = null;
        SelfServiceRegistrationValiationApi.PolicySelfserviceRegistrationValidationQueryParams queryParams = new SelfServiceRegistrationValiationApi.PolicySelfserviceRegistrationValidationQueryParams()
            .action(null);
        // ValidateObjectResponse response = api.policySelfserviceRegistrationValidation(requestPayload, queryParams);

    // TODO: test validations
    }
    
}
