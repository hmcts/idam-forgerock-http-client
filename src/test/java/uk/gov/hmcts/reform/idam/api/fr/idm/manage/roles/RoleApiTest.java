package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.Role;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleQueryResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleApi
 */
public class RoleApiTest {

    private RoleApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RoleApi.class);
    }

    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void createPostTest() {
        Role requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        // Role response = api.createPost(requestPayload, fields, prettyPrint);

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
        Role requestPayload = null;
        RoleApi.CreatePostQueryParams queryParams = new RoleApi.CreatePostQueryParams()
            .fields(null)
            .prettyPrint(null);
        // Role response = api.createPost(requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter or by Query ID
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
        // RoleQueryResult response = api.queryFilter(fields, prettyPrint, queryFilter, queryId, pageSize, totalPagedResultsPolicy, sortKeys);

        // TODO: test validations
    }

    /**
     * Query by Filter or by Query ID
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void queryFilterTestQueryMap() {
        RoleApi.QueryFilterQueryParams queryParams = new RoleApi.QueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .queryId(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // RoleQueryResult response = api.queryFilter(queryParams);

    // TODO: test validations
    }
    
    /**
     * Action: triggerSyncCheck
     *
     * 
     */
    @Test
    public void roleidActionTriggersynccheckTest() {
        String roleId = null;
        String action = null;
        String fields = null;
        Boolean prettyPrint = null;
        // uk.gov.hmcts.reform.idam.api.fr.shared.model.Status response = api.roleidActionTriggersynccheck(roleId, action, fields, prettyPrint);

        // TODO: test validations
    }

    /**
     * Action: triggerSyncCheck
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void roleidActionTriggersynccheckTestQueryMap() {
        String roleId = null;
        RoleApi.RoleidActionTriggersynccheckQueryParams queryParams = new RoleApi.RoleidActionTriggersynccheckQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // uk.gov.hmcts.reform.idam.api.fr.shared.model.Status response = api.roleidActionTriggersynccheck(roleId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update or Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void roleidCreatePutTest() {
        String roleId = null;
        Role requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // Role response = api.roleidCreatePut(roleId, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

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
    public void roleidCreatePutTestQueryMap() {
        String roleId = null;
        Role requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        RoleApi.RoleidCreatePutQueryParams queryParams = new RoleApi.RoleidCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // Role response = api.roleidCreatePut(roleId, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void roleidDeleteTest() {
        String roleId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // Role response = api.roleidDelete(roleId, fields, prettyPrint, ifMatch);

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
    public void roleidDeleteTestQueryMap() {
        String roleId = null;
        String ifMatch = null;
        RoleApi.RoleidDeleteQueryParams queryParams = new RoleApi.RoleidDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // Role response = api.roleidDelete(roleId, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void roleidPatchTest() {
        String roleId = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // Role response = api.roleidPatch(roleId, requestPayload, fields, prettyPrint, ifMatch);

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
    public void roleidPatchTestQueryMap() {
        String roleId = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        RoleApi.RoleidPatchQueryParams queryParams = new RoleApi.RoleidPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // Role response = api.roleidPatch(roleId, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void roleidReadTest() {
        String roleId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // Role response = api.roleidRead(roleId, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void roleidReadTestQueryMap() {
        String roleId = null;
        String ifNoneMatch = null;
        RoleApi.RoleidReadQueryParams queryParams = new RoleApi.RoleidReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // Role response = api.roleidRead(roleId, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
}
