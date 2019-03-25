package uk.gov.hmcts.reform.idam.api.fr.idm.manage.user;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserReports;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.UserReportsQueryResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserDirectReportsApi
 */
public class UserDirectReportsApiTest {

    private UserDirectReportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(UserDirectReportsApi.class);
    }

    
    /**
     * Create with Server-Assigned ID
     *
     * 
     */
    @Test
    public void useridReportsCreatePostTest() {
        String userId = null;
        UserReports requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        // UserReports response = api.useridReportsCreatePost(userId, requestPayload, fields, prettyPrint);

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
    public void useridReportsCreatePostTestQueryMap() {
        String userId = null;
        UserReports requestPayload = null;
        UserDirectReportsApi.UseridReportsCreatePostQueryParams queryParams = new UserDirectReportsApi.UseridReportsCreatePostQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserReports response = api.useridReportsCreatePost(userId, requestPayload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update or Create with Client-Assigned ID
     *
     * 
     */
    @Test
    public void useridReportsIdCreatePutTest() {
        String userId = null;
        String id = null;
        UserReports requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        // UserReports response = api.useridReportsIdCreatePut(userId, id, requestPayload, fields, prettyPrint, ifNoneMatch, ifMatch);

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
    public void useridReportsIdCreatePutTestQueryMap() {
        String userId = null;
        String id = null;
        UserReports requestPayload = null;
        String ifNoneMatch = null;
        String ifMatch = null;
        UserDirectReportsApi.UseridReportsIdCreatePutQueryParams queryParams = new UserDirectReportsApi.UseridReportsIdCreatePutQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserReports response = api.useridReportsIdCreatePut(userId, id, requestPayload, ifNoneMatch, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Delete
     *
     * 
     */
    @Test
    public void useridReportsIdDeleteTest() {
        String userId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // UserReports response = api.useridReportsIdDelete(userId, id, fields, prettyPrint, ifMatch);

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
    public void useridReportsIdDeleteTestQueryMap() {
        String userId = null;
        String id = null;
        String ifMatch = null;
        UserDirectReportsApi.UseridReportsIdDeleteQueryParams queryParams = new UserDirectReportsApi.UseridReportsIdDeleteQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserReports response = api.useridReportsIdDelete(userId, id, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Update via Patch Operations
     *
     * 
     */
    @Test
    public void useridReportsIdPatchTest() {
        String userId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String fields = null;
        Boolean prettyPrint = null;
        String ifMatch = null;
        // UserReports response = api.useridReportsIdPatch(userId, id, requestPayload, fields, prettyPrint, ifMatch);

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
    public void useridReportsIdPatchTestQueryMap() {
        String userId = null;
        String id = null;
        uk.gov.hmcts.reform.idam.api.fr.shared.model.PatchArray requestPayload = null;
        String ifMatch = null;
        UserDirectReportsApi.UseridReportsIdPatchQueryParams queryParams = new UserDirectReportsApi.UseridReportsIdPatchQueryParams()
            .fields(null)
            .prettyPrint(null);
        // UserReports response = api.useridReportsIdPatch(userId, id, requestPayload, ifMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * 
     */
    @Test
    public void useridReportsIdReadTest() {
        String userId = null;
        String id = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // UserReports response = api.useridReportsIdRead(userId, id, fields, prettyPrint, mimeType, ifNoneMatch);

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
    public void useridReportsIdReadTestQueryMap() {
        String userId = null;
        String id = null;
        String ifNoneMatch = null;
        UserDirectReportsApi.UseridReportsIdReadQueryParams queryParams = new UserDirectReportsApi.UseridReportsIdReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // UserReports response = api.useridReportsIdRead(userId, id, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
    /**
     * Query by Filter
     *
     * 
     */
    @Test
    public void useridReportsQueryFilterTest() {
        String userId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        Integer pageSize = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // UserReportsQueryResult response = api.useridReportsQueryFilter(userId, fields, prettyPrint, queryFilter, pageSize, totalPagedResultsPolicy, sortKeys);

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
    public void useridReportsQueryFilterTestQueryMap() {
        String userId = null;
        UserDirectReportsApi.UseridReportsQueryFilterQueryParams queryParams = new UserDirectReportsApi.UseridReportsQueryFilterQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .pageSize(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // UserReportsQueryResult response = api.useridReportsQueryFilter(userId, queryParams);

    // TODO: test validations
    }
    
}
