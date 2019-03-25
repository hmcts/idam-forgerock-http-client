package uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.AssignmentRoles;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.AssignmentRolesResultSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssignmentManagedRolesApi
 */
public class AssignmentManagedRolesApiTest {

    private AssignmentManagedRolesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AssignmentManagedRolesApi.class);
    }

    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void assignmentidRolesCreatePostTest() {
        String assignmentId = null;
        AssignmentRoles requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        // AssignmentRoles response = api.assignmentidRolesCreatePost(assignmentId, requestPayload, fields, prettyPrint);

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
    public void assignmentidRolesCreatePostTestQueryMap() {
        String assignmentId = null;
        AssignmentRoles requestPayload = null;
        AssignmentManagedRolesApi.AssignmentidRolesCreatePostQueryParams queryParams = new AssignmentManagedRolesApi.AssignmentidRolesCreatePostQueryParams()
            .fields(null)
            .prettyPrint(null);
        // AssignmentRoles response = api.assignmentidRolesCreatePost(assignmentId, requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void assignmentidRolesIdCreatePutTest() {
        String assignmentId = null;
        String id = null;
        AssignmentRoles requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // AssignmentRoles response = api.assignmentidRolesIdCreatePut(assignmentId, id, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

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
    public void assignmentidRolesIdCreatePutTestQueryMap() {
        String assignmentId = null;
        String id = null;
        AssignmentRoles requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        AssignmentManagedRolesApi.AssignmentidRolesIdCreatePutQueryParams queryParams = new AssignmentManagedRolesApi.AssignmentidRolesIdCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // AssignmentRoles response = api.assignmentidRolesIdCreatePut(assignmentId, id, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void assignmentidRolesIdDeleteTest() {
        String assignmentId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // AssignmentRoles response = api.assignmentidRolesIdDelete(assignmentId, id, fields, prettyPrint, ifMatch);

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
    public void assignmentidRolesIdDeleteTestQueryMap() {
        String assignmentId = null;
        String id = null;
        String ifMatch = null;
        AssignmentManagedRolesApi.AssignmentidRolesIdDeleteQueryParams queryParams = new AssignmentManagedRolesApi.AssignmentidRolesIdDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // AssignmentRoles response = api.assignmentidRolesIdDelete(assignmentId, id, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void assignmentidRolesIdPatchTest() {
        String assignmentId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // AssignmentRoles response = api.assignmentidRolesIdPatch(assignmentId, id, requestPayload, fields, prettyPrint, ifMatch);

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
    public void assignmentidRolesIdPatchTestQueryMap() {
        String assignmentId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        AssignmentManagedRolesApi.AssignmentidRolesIdPatchQueryParams queryParams = new AssignmentManagedRolesApi.AssignmentidRolesIdPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // AssignmentRoles response = api.assignmentidRolesIdPatch(assignmentId, id, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void assignmentidRolesIdReadTest() {
        String assignmentId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // AssignmentRoles response = api.assignmentidRolesIdRead(assignmentId, id, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void assignmentidRolesIdReadTestQueryMap() {
        String assignmentId = null;
        String id = null;
        String ifNoneMatch = null;
        AssignmentManagedRolesApi.AssignmentidRolesIdReadQueryParams queryParams = new AssignmentManagedRolesApi.AssignmentidRolesIdReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // AssignmentRoles response = api.assignmentidRolesIdRead(assignmentId, id, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter
     *
     * 
     */
    @Test
    public void assignmentidRolesQueryFilterTest() {
        String assignmentId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        String queryId = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // AssignmentRolesResultSet response = api.assignmentidRolesQueryFilter(assignmentId, fields, prettyPrint, queryFilter, queryId, pageSize, totalPagedResultsPolicy, sortKeys);

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
    public void assignmentidRolesQueryFilterTestQueryMap() {
        String assignmentId = null;
        AssignmentManagedRolesApi.AssignmentidRolesQueryFilterQueryParams queryParams = new AssignmentManagedRolesApi.AssignmentidRolesQueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .queryId(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // AssignmentRolesResultSet response = api.assignmentidRolesQueryFilter(assignmentId, queryParams);

    // TODO: test validations
    }
    
}
