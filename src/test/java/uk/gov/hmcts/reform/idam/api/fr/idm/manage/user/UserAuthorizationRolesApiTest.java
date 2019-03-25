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

}
