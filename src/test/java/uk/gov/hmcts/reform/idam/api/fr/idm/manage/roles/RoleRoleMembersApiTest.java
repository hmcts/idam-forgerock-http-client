package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleMembers;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleMembersQueryResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleRoleMembersApi
 */
public class RoleRoleMembersApiTest {

    private RoleRoleMembersApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RoleRoleMembersApi.class);
    }

    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void roleidMembersCreatePostTest() {
        String roleId = null;
        RoleMembers requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        // RoleMembers response = api.roleidMembersCreatePost(roleId, requestPayload, fields, prettyPrint);

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
    public void roleidMembersCreatePostTestQueryMap() {
        String roleId = null;
        RoleMembers requestPayload = null;
        RoleRoleMembersApi.RoleidMembersCreatePostQueryParams queryParams = new RoleRoleMembersApi.RoleidMembersCreatePostQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleMembers response = api.roleidMembersCreatePost(roleId, requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update or Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void roleidMembersIdCreatePutTest() {
        String roleId = null;
        String id = null;
        RoleMembers requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // RoleMembers response = api.roleidMembersIdCreatePut(roleId, id, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

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
    public void roleidMembersIdCreatePutTestQueryMap() {
        String roleId = null;
        String id = null;
        RoleMembers requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        RoleRoleMembersApi.RoleidMembersIdCreatePutQueryParams queryParams = new RoleRoleMembersApi.RoleidMembersIdCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleMembers response = api.roleidMembersIdCreatePut(roleId, id, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void roleidMembersIdDeleteTest() {
        String roleId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // RoleMembers response = api.roleidMembersIdDelete(roleId, id, fields, prettyPrint, ifMatch);

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
    public void roleidMembersIdDeleteTestQueryMap() {
        String roleId = null;
        String id = null;
        String ifMatch = null;
        RoleRoleMembersApi.RoleidMembersIdDeleteQueryParams queryParams = new RoleRoleMembersApi.RoleidMembersIdDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleMembers response = api.roleidMembersIdDelete(roleId, id, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void roleidMembersIdPatchTest() {
        String roleId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // RoleMembers response = api.roleidMembersIdPatch(roleId, id, requestPayload, fields, prettyPrint, ifMatch);

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
    public void roleidMembersIdPatchTestQueryMap() {
        String roleId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        RoleRoleMembersApi.RoleidMembersIdPatchQueryParams queryParams = new RoleRoleMembersApi.RoleidMembersIdPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleMembers response = api.roleidMembersIdPatch(roleId, id, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void roleidMembersIdReadTest() {
        String roleId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // RoleMembers response = api.roleidMembersIdRead(roleId, id, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void roleidMembersIdReadTestQueryMap() {
        String roleId = null;
        String id = null;
        String ifNoneMatch = null;
        RoleRoleMembersApi.RoleidMembersIdReadQueryParams queryParams = new RoleRoleMembersApi.RoleidMembersIdReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // RoleMembers response = api.roleidMembersIdRead(roleId, id, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter or by Query ID
     *
     * 
     */
    @Test
    public void roleidMembersQueryFilterTest() {
        String roleId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        String queryId = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // RoleMembersQueryResult response = api.roleidMembersQueryFilter(roleId, fields, prettyPrint, queryFilter, queryId, pageSize, totalPagedResultsPolicy, sortKeys);

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
    public void roleidMembersQueryFilterTestQueryMap() {
        String roleId = null;
        RoleRoleMembersApi.RoleidMembersQueryFilterQueryParams queryParams = new RoleRoleMembersApi.RoleidMembersQueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .queryId(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // RoleMembersQueryResult response = api.roleidMembersQueryFilter(roleId, queryParams);

    // TODO: test validations
    }
    
}
