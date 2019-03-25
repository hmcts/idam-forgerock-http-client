package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAssignments;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAssignmentsResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleManagedAssignmentsApi
 */
public class RoleManagedAssignmentsApiTest {

    private RoleManagedAssignmentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RoleManagedAssignmentsApi.class);
    }

    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void roleidAssignmentsCreatePostTest() {
        String roleId = null;
        RoleAssignments requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        // RoleAssignments response = api.roleidAssignmentsCreatePost(roleId, requestPayload, fields, prettyPrint);

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
    public void roleidAssignmentsCreatePostTestQueryMap() {
        String roleId = null;
        RoleAssignments requestPayload = null;
        RoleManagedAssignmentsApi.RoleidAssignmentsCreatePostQueryParams queryParams = new RoleManagedAssignmentsApi.RoleidAssignmentsCreatePostQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleAssignments response = api.roleidAssignmentsCreatePost(roleId, requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update or Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void roleidAssignmentsIdCreatePutTest() {
        String roleId = null;
        String id = null;
        RoleAssignments requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // RoleAssignments response = api.roleidAssignmentsIdCreatePut(roleId, id, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

        // TODO: test validations
    }

    /**
     * Update or Create with Client-Assigned ID
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void roleidAssignmentsIdCreatePutTestQueryMap() {
        String roleId = null;
        String id = null;
        RoleAssignments requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        RoleManagedAssignmentsApi.RoleidAssignmentsIdCreatePutQueryParams queryParams = new RoleManagedAssignmentsApi.RoleidAssignmentsIdCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleAssignments response = api.roleidAssignmentsIdCreatePut(roleId, id, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void roleidAssignmentsIdDeleteTest() {
        String roleId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // RoleAssignments response = api.roleidAssignmentsIdDelete(roleId, id, fields, prettyPrint, ifMatch);

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
    public void roleidAssignmentsIdDeleteTestQueryMap() {
        String roleId = null;
        String id = null;
        String ifMatch = null;
        RoleManagedAssignmentsApi.RoleidAssignmentsIdDeleteQueryParams queryParams = new RoleManagedAssignmentsApi.RoleidAssignmentsIdDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleAssignments response = api.roleidAssignmentsIdDelete(roleId, id, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void roleidAssignmentsIdPatchTest() {
        String roleId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // RoleAssignments response = api.roleidAssignmentsIdPatch(roleId, id, requestPayload, fields, prettyPrint, ifMatch);

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
    public void roleidAssignmentsIdPatchTestQueryMap() {
        String roleId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        RoleManagedAssignmentsApi.RoleidAssignmentsIdPatchQueryParams queryParams = new RoleManagedAssignmentsApi.RoleidAssignmentsIdPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleAssignments response = api.roleidAssignmentsIdPatch(roleId, id, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void roleidAssignmentsIdReadTest() {
        String roleId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // RoleAssignments response = api.roleidAssignmentsIdRead(roleId, id, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void roleidAssignmentsIdReadTestQueryMap() {
        String roleId = null;
        String id = null;
        String ifNoneMatch = null;
        RoleManagedAssignmentsApi.RoleidAssignmentsIdReadQueryParams queryParams = new RoleManagedAssignmentsApi.RoleidAssignmentsIdReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // RoleAssignments response = api.roleidAssignmentsIdRead(roleId, id, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter or by ID
     *
     * 
     */
    @Test
    public void roleidAssignmentsQueryFilterTest() {
        String roleId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        String queryId = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // RoleAssignmentsResult response = api.roleidAssignmentsQueryFilter(roleId, fields, prettyPrint, queryFilter, queryId, pageSize, totalPagedResultsPolicy, sortKeys);

        // TODO: test validations
    }

    /**
     * Query by Filter or by ID
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void roleidAssignmentsQueryFilterTestQueryMap() {
        String roleId = null;
        RoleManagedAssignmentsApi.RoleidAssignmentsQueryFilterQueryParams queryParams = new RoleManagedAssignmentsApi.RoleidAssignmentsQueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .queryId(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // RoleAssignmentsResult response = api.roleidAssignmentsQueryFilter(roleId, queryParams);

    // TODO: test validations
    }
    
}
