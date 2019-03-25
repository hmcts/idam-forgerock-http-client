package uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2.model.OAuth2ClientsResultSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuth2ClientAgentsApi
 */
public class OAuth2ClientAgentsApiTest {

    private OAuth2ClientAgentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(OAuth2ClientAgentsApi.class);
    }

    
    /**
     * Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void idCreatePutTest() {
        String id = null;
        String realm = null;
        uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String cookie = null;
        // uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent response = api.idCreatePut(id, realm, requestPayload, fields, prettyPrint, cookie);

        // TODO: test validations
    }

    /**
     * Create with Client-Assigned ID
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void idCreatePutTestQueryMap() {
        String id = null;
        String realm = null;
        uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent requestPayload = null;
        String cookie = null;
        OAuth2ClientAgentsApi.IdCreatePutQueryParams queryParams = new OAuth2ClientAgentsApi.IdCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent response = api.idCreatePut(id, realm, requestPayload, cookie, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void idDeleteTest() {
        String id = null;
        String realm = null;
        String fields = null;
        Boolean prettyPrint = null;
        String cookie = null;
        // uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent response = api.idDelete(id, realm, fields, prettyPrint, cookie);

        // TODO: test validations
    }

    /**
     * Delete
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void idDeleteTestQueryMap() {
        String id = null;
        String realm = null;
        String cookie = null;
        OAuth2ClientAgentsApi.IdDeleteQueryParams queryParams = new OAuth2ClientAgentsApi.IdDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent response = api.idDelete(id, realm, cookie, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void idReadTest() {
        String id = null;
        String realm = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String cookie = null;
        // uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent response = api.idRead(id, realm, fields, prettyPrint, mimeType, cookie);

        // TODO: test validations
    }

    /**
     * Read
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void idReadTestQueryMap() {
        String id = null;
        String realm = null;
        String cookie = null;
        OAuth2ClientAgentsApi.IdReadQueryParams queryParams = new OAuth2ClientAgentsApi.IdReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent response = api.idRead(id, realm, cookie, queryParams);

    // TODO: test validations
    }
    
    /**
     * Post with Action
     *
     * Call the endpoint with various actions
     */
    @Test
    public void postWithActionTest() {
        String action = null;
        String realm = null;
        uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String cookie = null;
        // api.postWithAction(action, realm, requestPayload, fields, prettyPrint, cookie);

        // TODO: test validations
    }

    /**
     * Post with Action
     *
     * Call the endpoint with various actions
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void postWithActionTestQueryMap() {
        String realm = null;
        uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgent requestPayload = null;
        String cookie = null;
        OAuth2ClientAgentsApi.PostWithActionQueryParams queryParams = new OAuth2ClientAgentsApi.PostWithActionQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // api.postWithAction(realm, requestPayload, cookie, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter
     *
     * Querying the agents of a specific type
     */
    @Test
    public void queryFilterTest() {
        String realm = null;
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        String cookie = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // OAuth2ClientsResultSet response = api.queryFilter(realm, fields, prettyPrint, queryFilter, cookie, pageSize, totalPagedResultsPolicy, sortKeys);

        // TODO: test validations
    }

    /**
     * Query by Filter
     *
     * Querying the agents of a specific type
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryFilterTestQueryMap() {
        String realm = null;
        String cookie = null;
        OAuth2ClientAgentsApi.QueryFilterQueryParams queryParams = new OAuth2ClientAgentsApi.QueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // OAuth2ClientsResultSet response = api.queryFilter(realm, cookie, queryParams);

    // TODO: test validations
    }
    
}
