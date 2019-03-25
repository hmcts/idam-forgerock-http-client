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

}
