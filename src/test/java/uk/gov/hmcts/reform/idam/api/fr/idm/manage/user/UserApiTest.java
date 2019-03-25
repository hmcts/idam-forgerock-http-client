package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.User;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserQueryResultSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private UserApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(UserApi.class);
    }

    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void createPostTest() {
        User requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String action = null;
        // User response = api.createPost(requestPayload, fields, prettyPrint, action);

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
        User requestPayload = null;
        UserApi.CreatePostQueryParams queryParams = new UserApi.CreatePostQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // User response = api.createPost(requestPayload, queryParams);

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
        // UserQueryResultSet response = api.queryFilter(fields, prettyPrint, queryFilter, queryId, pageSize, totalPagedResultsPolicy, sortKeys);

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
        UserApi.QueryFilterQueryParams queryParams = new UserApi.QueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .queryId(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // UserQueryResultSet response = api.queryFilter(queryParams);

    // TODO: test validations
    }
    
    /**
     * Action: resetPassword
     *
     * 
     */
    @Test
    public void useridActionResetpasswordTest() {
        String userId = null;
        String action = null;
        String fields = null;
        Boolean prettyPrint = null;
        // User response = api.useridActionResetpassword(userId, action, fields, prettyPrint);

        // TODO: test validations
    }

    /**
     * Action: resetPassword
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void useridActionResetpasswordTestQueryMap() {
        String userId = null;
        UserApi.UseridActionResetpasswordQueryParams queryParams = new UserApi.UseridActionResetpasswordQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // User response = api.useridActionResetpassword(userId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Action: triggerSyncCheck
     *
     * 
     */
    @Test
    public void useridActionTriggersynccheckTest() {
        String userId = null;
        String action = null;
        String fields = null;
        Boolean prettyPrint = null;
        // uk.gov.hmcts.reform.idam.api.fr.shared.model.Status response = api.useridActionTriggersynccheck(userId, action, fields, prettyPrint);

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
    public void useridActionTriggersynccheckTestQueryMap() {
        String userId = null;
        UserApi.UseridActionTriggersynccheckQueryParams queryParams = new UserApi.UseridActionTriggersynccheckQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // uk.gov.hmcts.reform.idam.api.fr.shared.model.Status response = api.useridActionTriggersynccheck(userId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update or Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void useridCreatePutTest() {
        String userId = null;
        User requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // User response = api.useridCreatePut(userId, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

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
    public void useridCreatePutTestQueryMap() {
        String userId = null;
        User requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        UserApi.UseridCreatePutQueryParams queryParams = new UserApi.UseridCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // User response = api.useridCreatePut(userId, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void useridDeleteTest() {
        String userId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // User response = api.useridDelete(userId, fields, prettyPrint, ifMatch);

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
    public void useridDeleteTestQueryMap() {
        String userId = null;
        String ifMatch = null;
        UserApi.UseridDeleteQueryParams queryParams = new UserApi.UseridDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // User response = api.useridDelete(userId, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void useridPatchTest() {
        String userId = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // User response = api.useridPatch(userId, requestPayload, fields, prettyPrint, ifMatch);

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
    public void useridPatchTestQueryMap() {
        String userId = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        UserApi.UseridPatchQueryParams queryParams = new UserApi.UseridPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // User response = api.useridPatch(userId, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void useridReadTest() {
        String userId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // User response = api.useridRead(userId, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void useridReadTestQueryMap() {
        String userId = null;
        String ifNoneMatch = null;
        UserApi.UseridReadQueryParams queryParams = new UserApi.UseridReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // User response = api.useridRead(userId, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
}
