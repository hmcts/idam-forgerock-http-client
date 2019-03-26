package uk.gov.hmcts.reform.idam.api.fr.idm.misc;

import org.junit.Before;
import uk.gov.hmcts.reform.idam.api.fr.client.invoker.ApiClient;

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
