package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.ReconCancelResponse;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.ReconServiceResultSet;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.ReconStateResponse;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.ReconciliationServiceResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
