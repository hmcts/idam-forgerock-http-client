package uk.gov.hmcts.reform.idam.api.fr.shared;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SharedDefinitionsApi
 */
public class SharedDefinitionsApiTest {

    private SharedDefinitionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(SharedDefinitionsApi.class);
    }

    
    /**
     * Placeholder for Generation Purposes
     *
     * 
     */
    @Test
    public void sharedDefinitionsTest() {
        Integer nothingDontCallThisEndpoint = null;
        // String response = api.sharedDefinitions(nothingDontCallThisEndpoint);

        // TODO: test validations
    }

    /**
     * Placeholder for Generation Purposes
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void sharedDefinitionsTestQueryMap() {
        SharedDefinitionsApi.SharedDefinitionsQueryParams queryParams = new SharedDefinitionsApi.SharedDefinitionsQueryParams()
            .nothingDontCallThisEndpoint(null);
        // String response = api.sharedDefinitions(queryParams);

    // TODO: test validations
    }
    
}
