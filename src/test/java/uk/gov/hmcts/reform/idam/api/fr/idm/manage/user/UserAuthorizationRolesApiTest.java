package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserAuthzRoles;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserAuthzRolesQueryResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserAuthorizationRolesApi
 */
public class UserAuthorizationRolesApiTest {

    private UserAuthorizationRolesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(UserAuthorizationRolesApi.class);
    }

    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void useridAuthzrolesCreatePostTest() {
        String userId = null;
        UserAuthzRoles requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        // UserAuthzRoles response = api.useridAuthzrolesCreatePost(userId, requestPayload, fields, prettyPrint);

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
    public void useridAuthzrolesCreatePostTestQueryMap() {
        String userId = null;
        UserAuthzRoles requestPayload = null;
        UserAuthorizationRolesApi.UseridAuthzrolesCreatePostQueryParams queryParams = new UserAuthorizationRolesApi.UseridAuthzrolesCreatePostQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserAuthzRoles response = api.useridAuthzrolesCreatePost(userId, requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update or Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void useridAuthzrolesIdCreatePutTest() {
        String userId = null;
        String id = null;
        UserAuthzRoles requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // UserAuthzRoles response = api.useridAuthzrolesIdCreatePut(userId, id, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

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
    public void useridAuthzrolesIdCreatePutTestQueryMap() {
        String userId = null;
        String id = null;
        UserAuthzRoles requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        UserAuthorizationRolesApi.UseridAuthzrolesIdCreatePutQueryParams queryParams = new UserAuthorizationRolesApi.UseridAuthzrolesIdCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserAuthzRoles response = api.useridAuthzrolesIdCreatePut(userId, id, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void useridAuthzrolesIdDeleteTest() {
        String userId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // UserAuthzRoles response = api.useridAuthzrolesIdDelete(userId, id, fields, prettyPrint, ifMatch);

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
    public void useridAuthzrolesIdDeleteTestQueryMap() {
        String userId = null;
        String id = null;
        String ifMatch = null;
        UserAuthorizationRolesApi.UseridAuthzrolesIdDeleteQueryParams queryParams = new UserAuthorizationRolesApi.UseridAuthzrolesIdDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserAuthzRoles response = api.useridAuthzrolesIdDelete(userId, id, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void useridAuthzrolesIdPatchTest() {
        String userId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // UserAuthzRoles response = api.useridAuthzrolesIdPatch(userId, id, requestPayload, fields, prettyPrint, ifMatch);

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
    public void useridAuthzrolesIdPatchTestQueryMap() {
        String userId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        UserAuthorizationRolesApi.UseridAuthzrolesIdPatchQueryParams queryParams = new UserAuthorizationRolesApi.UseridAuthzrolesIdPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserAuthzRoles response = api.useridAuthzrolesIdPatch(userId, id, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void useridAuthzrolesIdReadTest() {
        String userId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // UserAuthzRoles response = api.useridAuthzrolesIdRead(userId, id, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void useridAuthzrolesIdReadTestQueryMap() {
        String userId = null;
        String id = null;
        String ifNoneMatch = null;
        UserAuthorizationRolesApi.UseridAuthzrolesIdReadQueryParams queryParams = new UserAuthorizationRolesApi.UseridAuthzrolesIdReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // UserAuthzRoles response = api.useridAuthzrolesIdRead(userId, id, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter
     *
     * 
     */
    @Test
    public void useridAuthzrolesQueryFilterTest() {
        String userId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        String queryId = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // UserAuthzRolesQueryResult response = api.useridAuthzrolesQueryFilter(userId, fields, prettyPrint, queryFilter, queryId, pageSize, totalPagedResultsPolicy, sortKeys);

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
    public void useridAuthzrolesQueryFilterTestQueryMap() {
        String userId = null;
        UserAuthorizationRolesApi.UseridAuthzrolesQueryFilterQueryParams queryParams = new UserAuthorizationRolesApi.UseridAuthzrolesQueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .queryId(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // UserAuthzRolesQueryResult response = api.useridAuthzrolesQueryFilter(userId, queryParams);

    // TODO: test validations
    }
    
}
