package uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

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
