package uk.gov.hmcts.reform.idam.api.fr.am.agents;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

/**
 * API tests for AggregatingAgentsApi
 */
public class AggregatingAgentsApiTest {

    private AggregatingAgentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AggregatingAgentsApi.class);
    }

}
