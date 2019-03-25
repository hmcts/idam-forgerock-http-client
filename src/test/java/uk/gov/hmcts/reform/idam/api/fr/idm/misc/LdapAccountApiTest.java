package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.model.AccountQueryResultSet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LdapAccountApi
 */
public class LdapAccountApiTest {

    private LdapAccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(LdapAccountApi.class);
    }

    
    /**
     * Query by Expression
     *
     * Query by filter of system ldap accounts
     */
    @Test
    public void accountQueryExpressionTest() {
        String fields = null;
        Boolean prettyPrint = null;
        String queryFilter = null;
        Integer pageSize = null;
        String pagedResultsCookie = null;
        String totalPagedResultsPolicy = null;
        String sortKeys = null;
        // AccountQueryResultSet response = api.accountQueryExpression(fields, prettyPrint, queryFilter, pageSize, pagedResultsCookie, totalPagedResultsPolicy, sortKeys);

        // TODO: test validations
    }

    /**
     * Query by Expression
     *
     * Query by filter of system ldap accounts
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void accountQueryExpressionTestQueryMap() {
        LdapAccountApi.AccountQueryExpressionQueryParams queryParams = new LdapAccountApi.AccountQueryExpressionQueryParams()
            .fields(null)
            .prettyPrint(null)
            .queryFilter(null)
            .pageSize(null)
            .pagedResultsCookie(null)
            .totalPagedResultsPolicy(null)
            .sortKeys(null);
        // AccountQueryResultSet response = api.accountQueryExpression(queryParams);

    // TODO: test validations
    }
    
}
