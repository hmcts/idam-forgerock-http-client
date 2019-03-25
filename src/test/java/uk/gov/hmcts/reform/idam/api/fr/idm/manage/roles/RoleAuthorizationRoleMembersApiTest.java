package uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAuthzMembers;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.model.RoleAuthzMembersQueryResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleAuthorizationRoleMembersApi
 */
public class RoleAuthorizationRoleMembersApiTest {

    private RoleAuthorizationRoleMembersApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RoleAuthorizationRoleMembersApi.class);
    }

    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void roleidAuthzmembersCreatePostTest() {
        String roleId = null;
        RoleAuthzMembers requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        // RoleAuthzMembers response = api.roleidAuthzmembersCreatePost(roleId, requestPayload, fields, prettyPrint);

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
    public void roleidAuthzmembersCreatePostTestQueryMap() {
        String roleId = null;
        RoleAuthzMembers requestPayload = null;
        RoleAuthorizationRoleMembersApi.RoleidAuthzmembersCreatePostQueryParams queryParams = new RoleAuthorizationRoleMembersApi.RoleidAuthzmembersCreatePostQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleAuthzMembers response = api.roleidAuthzmembersCreatePost(roleId, requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update or Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void roleidAuthzmembersIdCreatePutTest() {
        String roleId = null;
        String id = null;
        RoleAuthzMembers requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // RoleAuthzMembers response = api.roleidAuthzmembersIdCreatePut(roleId, id, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

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
    public void roleidAuthzmembersIdCreatePutTestQueryMap() {
        String roleId = null;
        String id = null;
        RoleAuthzMembers requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        RoleAuthorizationRoleMembersApi.RoleidAuthzmembersIdCreatePutQueryParams queryParams = new RoleAuthorizationRoleMembersApi.RoleidAuthzmembersIdCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleAuthzMembers response = api.roleidAuthzmembersIdCreatePut(roleId, id, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void roleidAuthzmembersIdDeleteTest() {
        String roleId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // RoleAuthzMembers response = api.roleidAuthzmembersIdDelete(roleId, id, fields, prettyPrint, ifMatch);

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
    public void roleidAuthzmembersIdDeleteTestQueryMap() {
        String roleId = null;
        String id = null;
        String ifMatch = null;
        RoleAuthorizationRoleMembersApi.RoleidAuthzmembersIdDeleteQueryParams queryParams = new RoleAuthorizationRoleMembersApi.RoleidAuthzmembersIdDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleAuthzMembers response = api.roleidAuthzmembersIdDelete(roleId, id, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void roleidAuthzmembersIdPatchTest() {
        String roleId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // RoleAuthzMembers response = api.roleidAuthzmembersIdPatch(roleId, id, requestPayload, fields, prettyPrint, ifMatch);

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
    public void roleidAuthzmembersIdPatchTestQueryMap() {
        String roleId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        RoleAuthorizationRoleMembersApi.RoleidAuthzmembersIdPatchQueryParams queryParams = new RoleAuthorizationRoleMembersApi.RoleidAuthzmembersIdPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // RoleAuthzMembers response = api.roleidAuthzmembersIdPatch(roleId, id, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void roleidAuthzmembersIdReadTest() {
        String roleId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // RoleAuthzMembers response = api.roleidAuthzmembersIdRead(roleId, id, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void roleidAuthzmembersIdReadTestQueryMap() {
        String roleId = null;
        String id = null;
        String ifNoneMatch = null;
        RoleAuthorizationRoleMembersApi.RoleidAuthzmembersIdReadQueryParams queryParams = new RoleAuthorizationRoleMembersApi.RoleidAuthzmembersIdReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // RoleAuthzMembers response = api.roleidAuthzmembersIdRead(roleId, id, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter or by Query ID
     *
     * 
     */
    @Test
    public void roleidAuthzmembersQueryFilterTest() {
        String roleId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        String queryId = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // RoleAuthzMembersQueryResult response = api.roleidAuthzmembersQueryFilter(roleId, fields, prettyPrint, queryFilter, queryId, pageSize, totalPagedResultsPolicy, sortKeys);

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
    public void roleidAuthzmembersQueryFilterTestQueryMap() {
        String roleId = null;
        RoleAuthorizationRoleMembersApi.RoleidAuthzmembersQueryFilterQueryParams queryParams = new RoleAuthorizationRoleMembersApi.RoleidAuthzmembersQueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .queryId(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // RoleAuthzMembersQueryResult response = api.roleidAuthzmembersQueryFilter(roleId, queryParams);

    // TODO: test validations
    }
    
}
