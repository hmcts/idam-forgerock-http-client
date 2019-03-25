package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserRoles;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserRolesQueryResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserProvisioningRolesApi
 */
public class UserProvisioningRolesApiTest {

    private UserProvisioningRolesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(UserProvisioningRolesApi.class);
    }

    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void useridRolesCreatePostTest() {
        String userId = null;
        UserRoles requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        // UserRoles response = api.useridRolesCreatePost(userId, requestPayload, fields, prettyPrint);

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
    public void useridRolesCreatePostTestQueryMap() {
        String userId = null;
        UserRoles requestPayload = null;
        UserProvisioningRolesApi.UseridRolesCreatePostQueryParams queryParams = new UserProvisioningRolesApi.UseridRolesCreatePostQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserRoles response = api.useridRolesCreatePost(userId, requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update or Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void useridRolesIdCreatePutTest() {
        String userId = null;
        String id = null;
        UserRoles requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // UserRoles response = api.useridRolesIdCreatePut(userId, id, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

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
    public void useridRolesIdCreatePutTestQueryMap() {
        String userId = null;
        String id = null;
        UserRoles requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        UserProvisioningRolesApi.UseridRolesIdCreatePutQueryParams queryParams = new UserProvisioningRolesApi.UseridRolesIdCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserRoles response = api.useridRolesIdCreatePut(userId, id, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void useridRolesIdDeleteTest() {
        String userId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // UserRoles response = api.useridRolesIdDelete(userId, id, fields, prettyPrint, ifMatch);

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
    public void useridRolesIdDeleteTestQueryMap() {
        String userId = null;
        String id = null;
        String ifMatch = null;
        UserProvisioningRolesApi.UseridRolesIdDeleteQueryParams queryParams = new UserProvisioningRolesApi.UseridRolesIdDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserRoles response = api.useridRolesIdDelete(userId, id, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void useridRolesIdPatchTest() {
        String userId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // UserRoles response = api.useridRolesIdPatch(userId, id, requestPayload, fields, prettyPrint, ifMatch);

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
    public void useridRolesIdPatchTestQueryMap() {
        String userId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        UserProvisioningRolesApi.UseridRolesIdPatchQueryParams queryParams = new UserProvisioningRolesApi.UseridRolesIdPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserRoles response = api.useridRolesIdPatch(userId, id, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void useridRolesIdReadTest() {
        String userId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // UserRoles response = api.useridRolesIdRead(userId, id, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void useridRolesIdReadTestQueryMap() {
        String userId = null;
        String id = null;
        String ifNoneMatch = null;
        UserProvisioningRolesApi.UseridRolesIdReadQueryParams queryParams = new UserProvisioningRolesApi.UseridRolesIdReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // UserRoles response = api.useridRolesIdRead(userId, id, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter
     *
     * 
     */
    @Test
    public void useridRolesQueryFilterTest() {
        String userId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // UserRolesQueryResult response = api.useridRolesQueryFilter(userId, fields, prettyPrint, queryFilter, pageSize, totalPagedResultsPolicy, sortKeys);

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
    public void useridRolesQueryFilterTestQueryMap() {
        String userId = null;
        UserProvisioningRolesApi.UseridRolesQueryFilterQueryParams queryParams = new UserProvisioningRolesApi.UseridRolesQueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // UserRolesQueryResult response = api.useridRolesQueryFilter(userId, queryParams);

    // TODO: test validations
    }
    
}
