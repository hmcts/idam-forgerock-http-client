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

    
    /**
     * Action: submitRequirements
     *
     * Submits requirements for stage.
     */
    @Test
    public void selfserviceRegistrationActionSubmitrequirementsTest() {
        SubmitRequirementsRequest requestPayload = null;
        String action = null;
        String fields = null;
        Boolean prettyPrint = null;
        // SelfServiceRegistrationResponse response = api.selfserviceRegistrationActionSubmitrequirements(requestPayload, action, fields, prettyPrint);

        // TODO: test validations
    }

    /**
     * Action: submitRequirements
     *
     * Submits requirements for stage.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void selfserviceRegistrationActionSubmitrequirementsTestQueryMap() {
        SubmitRequirementsRequest requestPayload = null;
        SelfServiceRegistrationApi.SelfserviceRegistrationActionSubmitrequirementsQueryParams queryParams = new SelfServiceRegistrationApi.SelfserviceRegistrationActionSubmitrequirementsQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // SelfServiceRegistrationResponse response = api.selfserviceRegistrationActionSubmitrequirements(requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * The initial requirements for a self service process.
     */
    @Test
    public void selfserviceRegistrationReadTest() {
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        // GetInitialRequirementsResponse response = api.selfserviceRegistrationRead(fields, prettyPrint, mimeType);

        // TODO: test validations
    }

    /**
     * Read
     *
     * The initial requirements for a self service process.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void selfserviceRegistrationReadTestQueryMap() {
        SelfServiceRegistrationApi.SelfserviceRegistrationReadQueryParams queryParams = new SelfServiceRegistrationApi.SelfserviceRegistrationReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // GetInitialRequirementsResponse response = api.selfserviceRegistrationRead(queryParams);

    // TODO: test validations
    }
    
}
