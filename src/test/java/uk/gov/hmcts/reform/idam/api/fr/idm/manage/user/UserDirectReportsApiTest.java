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

}
