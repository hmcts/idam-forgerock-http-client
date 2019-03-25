package uk.gov.hmcts.reform.idam.api.fr.am.agents;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentGetAllTypes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentGetCreatableTypes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentNextDescendents;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentsResultSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AggregatingAgentsApi
 */
public class AggregatingAgentsApiTest {

    private AggregatingAgentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AggregatingAgentsApi.class);
    }

    
    /**
     * Action: nextdescendents
     *
     * Obtain the collection of secondary configuration instances that have been added to the resource.
     */
    @Test
    public void actionNextdescendentsTest() {
        String realm = null;
        String action = null;
        String fields = null;
        Boolean prettyPrint = null;
        String cookie = null;
        // AmAgentNextDescendents response = api.actionNextdescendents(realm, action, fields, prettyPrint, cookie);

        // TODO: test validations
    }

    /**
     * Action: nextdescendents
     *
     * Obtain the collection of secondary configuration instances that have been added to the resource.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void actionNextdescendentsTestQueryMap() {
        String realm = null;
        String cookie = null;
        AggregatingAgentsApi.ActionNextdescendentsQueryParams queryParams = new AggregatingAgentsApi.ActionNextdescendentsQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // AmAgentNextDescendents response = api.actionNextdescendents(realm, cookie, queryParams);

    // TODO: test validations
    }
    
    /**
     * Post Action Get All Types
     *
     * Obtain the collection of all secondary configuration types related to the resource.
     */
    @Test
    public void postWithActionGetAllTypesTest() {
        String realm = null;
        String action = null;
        String fields = null;
        Boolean prettyPrint = null;
        String cookie = null;
        // AmAgentGetAllTypes response = api.postWithActionGetAllTypes(realm, action, fields, prettyPrint, cookie);

        // TODO: test validations
    }

    /**
     * Post Action Get All Types
     *
     * Obtain the collection of all secondary configuration types related to the resource.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void postWithActionGetAllTypesTestQueryMap() {
        String realm = null;
        String cookie = null;
        AggregatingAgentsApi.PostWithActionGetAllTypesQueryParams queryParams = new AggregatingAgentsApi.PostWithActionGetAllTypesQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // AmAgentGetAllTypes response = api.postWithActionGetAllTypes(realm, cookie, queryParams);

    // TODO: test validations
    }
    
    /**
     * Post Action Get Creatable Types
     *
     * Obtain the collection of secondary configuration types that have yet to be added to the resource.
     */
    @Test
    public void postWithActionGetCreatableTypesTest() {
        String realm = null;
        String action = null;
        String fields = null;
        Boolean prettyPrint = null;
        String cookie = null;
        // AmAgentGetCreatableTypes response = api.postWithActionGetCreatableTypes(realm, action, fields, prettyPrint, cookie);

        // TODO: test validations
    }

    /**
     * Post Action Get Creatable Types
     *
     * Obtain the collection of secondary configuration types that have yet to be added to the resource.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void postWithActionGetCreatableTypesTestQueryMap() {
        String realm = null;
        String cookie = null;
        AggregatingAgentsApi.PostWithActionGetCreatableTypesQueryParams queryParams = new AggregatingAgentsApi.PostWithActionGetCreatableTypesQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // AmAgentGetCreatableTypes response = api.postWithActionGetCreatableTypes(realm, cookie, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter
     *
     * Querying the aggregating agents
     */
    @Test
    public void queryFilterTest() {
        String realm = null;
        String queryFilter = null;
        String fields = null;
        Boolean prettyPrint = null;
        String cookie = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // AmAgentsResultSet response = api.queryFilter(realm, queryFilter, fields, prettyPrint, cookie, pageSize, totalPagedResultsPolicy, sortKeys);

        // TODO: test validations
    }

    /**
     * Query by Filter
     *
     * Querying the aggregating agents
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryFilterTestQueryMap() {
        String realm = null;
        String cookie = null;
        AggregatingAgentsApi.QueryFilterQueryParams queryParams = new AggregatingAgentsApi.QueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // AmAgentsResultSet response = api.queryFilter(realm, cookie, queryParams);

    // TODO: test validations
    }
    
}
