package uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.Assignment;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.AssignmentQueryResultSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssignmentApi
 */
public class AssignmentApiTest {

    private AssignmentApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AssignmentApi.class);
    }

    
    /**
     * Post with Action
     *
     * 
     */
    @Test
    public void assignmentidActionTriggersynccheckTest() {
        String assignmentId = null;
        String action = null;
        String fields = null;
        Boolean prettyPrint = null;
        // uk.gov.hmcts.reform.idam.api.fr.shared.model.Status response = api.assignmentidActionTriggersynccheck(assignmentId, action, fields, prettyPrint);

        // TODO: test validations
    }

    /**
     * Post with Action
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void assignmentidActionTriggersynccheckTestQueryMap() {
        String assignmentId = null;
        AssignmentApi.AssignmentidActionTriggersynccheckQueryParams queryParams = new AssignmentApi.AssignmentidActionTriggersynccheckQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // uk.gov.hmcts.reform.idam.api.fr.shared.model.Status response = api.assignmentidActionTriggersynccheck(assignmentId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void assignmentidCreatePutTest() {
        String assignmentId = null;
        Assignment requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // Assignment response = api.assignmentidCreatePut(assignmentId, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

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
    public void assignmentidCreatePutTestQueryMap() {
        String assignmentId = null;
        Assignment requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        AssignmentApi.AssignmentidCreatePutQueryParams queryParams = new AssignmentApi.AssignmentidCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // Assignment response = api.assignmentidCreatePut(assignmentId, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void assignmentidDeleteTest() {
        String assignmentId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // Assignment response = api.assignmentidDelete(assignmentId, fields, prettyPrint, ifMatch);

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
    public void assignmentidDeleteTestQueryMap() {
        String assignmentId = null;
        String ifMatch = null;
        AssignmentApi.AssignmentidDeleteQueryParams queryParams = new AssignmentApi.AssignmentidDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // Assignment response = api.assignmentidDelete(assignmentId, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void assignmentidPatchTest() {
        String assignmentId = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // Assignment response = api.assignmentidPatch(assignmentId, requestPayload, fields, prettyPrint, ifMatch);

        // TODO: test validations
    }

    /**
     * Update via Patch Operations
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void assignmentidPatchTestQueryMap() {
        String assignmentId = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        AssignmentApi.AssignmentidPatchQueryParams queryParams = new AssignmentApi.AssignmentidPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // Assignment response = api.assignmentidPatch(assignmentId, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void assignmentidReadTest() {
        String assignmentId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // Assignment response = api.assignmentidRead(assignmentId, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void assignmentidReadTestQueryMap() {
        String assignmentId = null;
        String ifNoneMatch = null;
        AssignmentApi.AssignmentidReadQueryParams queryParams = new AssignmentApi.AssignmentidReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // Assignment response = api.assignmentidRead(assignmentId, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void createPostTest() {
        Assignment requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        // Assignment response = api.createPost(requestPayload, fields, prettyPrint);

        // TODO: test validations
    }

    /**
     * Create with Server-Assigned ID
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void createPostTestQueryMap() {
        Assignment requestPayload = null;
        AssignmentApi.CreatePostQueryParams queryParams = new AssignmentApi.CreatePostQueryParams()
            .fields(null)
            .prettyPrint(null);
        // Assignment response = api.createPost(requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter
     *
     * 
     */
    @Test
    public void queryFilterTest() {
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        String queryId = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // AssignmentQueryResultSet response = api.queryFilter(fields, prettyPrint, queryFilter, queryId, pageSize, totalPagedResultsPolicy, sortKeys);

        // TODO: test validations
    }

    /**
     * Query by Filter
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryFilterTestQueryMap() {
        AssignmentApi.QueryFilterQueryParams queryParams = new AssignmentApi.QueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .queryId(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // AssignmentQueryResultSet response = api.queryFilter(queryParams);

    // TODO: test validations
    }
    
}
