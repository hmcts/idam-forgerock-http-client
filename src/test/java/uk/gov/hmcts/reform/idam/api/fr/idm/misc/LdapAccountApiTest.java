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

}
