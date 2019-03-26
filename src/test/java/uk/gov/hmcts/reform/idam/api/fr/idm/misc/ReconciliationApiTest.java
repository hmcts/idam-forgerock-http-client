package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for ReconciliationApi
 */
public class ReconciliationApiTest {

    private ReconciliationApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ReconciliationApi.class);
    }

}
