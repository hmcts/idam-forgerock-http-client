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

    
    /**
     * Action: recon
     *
     * Recon all available source identifiers.
     */
    @Test
    public void actionReconTest() {
        String mapping = null;
        String action = null;
        Boolean waitForCompletion = null;
        String fields = null;
        Boolean prettyPrint = null;
        // ReconStateResponse response = api.actionRecon(mapping, action, waitForCompletion, fields, prettyPrint);

        // TODO: test validations
    }

    /**
     * Action: recon
     *
     * Recon all available source identifiers.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void actionReconTestQueryMap() {
        ReconciliationApi.ActionReconQueryParams queryParams = new ReconciliationApi.ActionReconQueryParams()
            .mapping(null)
            .waitForCompletion(null)
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // ReconStateResponse response = api.actionRecon(queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * Lists all reconciliation summaries.
     */
    @Test
    public void readTest() {
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        // ReconServiceResultSet response = api.read(fields, prettyPrint, mimeType);

        // TODO: test validations
    }

    /**
     * Read
     *
     * Lists all reconciliation summaries.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void readTestQueryMap() {
        ReconciliationApi.ReadQueryParams queryParams = new ReconciliationApi.ReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // ReconServiceResultSet response = api.read(queryParams);

    // TODO: test validations
    }
    
    /**
     * Action: cancel
     *
     * Cancels a running reconciliation
     */
    @Test
    public void reconidActionCancelTest() {
        String reconId = null;
        String action = null;
        String fields = null;
        Boolean prettyPrint = null;
        // ReconCancelResponse response = api.reconidActionCancel(reconId, action, fields, prettyPrint);

        // TODO: test validations
    }

    /**
     * Action: cancel
     *
     * Cancels a running reconciliation
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void reconidActionCancelTestQueryMap() {
        String reconId = null;
        ReconciliationApi.ReconidActionCancelQueryParams queryParams = new ReconciliationApi.ReconidActionCancelQueryParams()
            .fields(null)
            .prettyPrint(null)
            .action(null);
        // ReconCancelResponse response = api.reconidActionCancel(reconId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Read
     *
     * Read an individual reconciliation summary.
     */
    @Test
    public void reconidReadTest() {
        String reconId = null;
        String fields = null;
        Boolean prettyPrint = null;
        String mimeType = null;
        String ifNoneMatch = null;
        // ReconciliationServiceResource response = api.reconidRead(reconId, fields, prettyPrint, mimeType, ifNoneMatch);

        // TODO: test validations
    }

    /**
     * Read
     *
     * Read an individual reconciliation summary.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void reconidReadTestQueryMap() {
        String reconId = null;
        String ifNoneMatch = null;
        ReconciliationApi.ReconidReadQueryParams queryParams = new ReconciliationApi.ReconidReadQueryParams()
            .fields(null)
            .prettyPrint(null)
            .mimeType(null);
        // ReconciliationServiceResource response = api.reconidRead(reconId, ifNoneMatch, queryParams);

    // TODO: test validations
    }
    
}
