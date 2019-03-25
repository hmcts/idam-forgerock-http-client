package uk.gov.hmcts.reform.idam.api.fr.am.agents;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentGetAllTypes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentGetCreatableTypes;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentNextDescendents;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.model.AmAgentsResultSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
