package uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.Assignment;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.model.AssignmentQueryResultSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssignmentApi
 */
public class AssignmentApiTest {

    private AssignmentApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AssignmentApi.class);
    }
}
