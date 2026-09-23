package uk.gov.hmcts.reform.idam.api.fr;

import feign.Feign;
import org.junit.Test;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.AggregatingAgentsApi;
import uk.gov.hmcts.reform.idam.api.fr.am.agents.oauth2.OAuth2ClientAgentsApi;
import uk.gov.hmcts.reform.idam.api.fr.am.authenticate.AuthenticationChainApi;
import uk.gov.hmcts.reform.idam.api.fr.am.oidc.OpenIdConnectApi;
import uk.gov.hmcts.reform.idam.api.fr.am.policies.PoliciesV21Api;
import uk.gov.hmcts.reform.idam.api.fr.idm.login.InformationApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.AssignmentApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.assignment.AssignmentManagedRolesApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.RoleApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.RoleAuthorizationRoleMembersApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.RoleManagedAssignmentsApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.roles.RoleRoleMembersApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.UserApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.UserDirectReportsApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.UserProvisioningRolesApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.manage.user.model.es.SearchablesApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.LdapAccountApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.LoginApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.misc.ReconciliationApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.SelfServiceRegistrationApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.SelfServiceRegistrationValiationApi;
import uk.gov.hmcts.reform.idam.api.fr.idm.selfservice.SelfServiceResetApi;

import static org.junit.Assert.assertNotNull;

public class FeignEndpointInterfacesTest {

    private static final Class<?>[] ENDPOINT_INTERFACES = {
            AggregatingAgentsApi.class,
            OAuth2ClientAgentsApi.class,
            AuthenticationChainApi.class,
            OpenIdConnectApi.class,
            PoliciesV21Api.class,
            InformationApi.class,
            AssignmentApi.class,
            AssignmentManagedRolesApi.class,
            RoleApi.class,
            RoleAuthorizationRoleMembersApi.class,
            RoleManagedAssignmentsApi.class,
            RoleRoleMembersApi.class,
            UserApi.class,
            UserDirectReportsApi.class,
            UserProvisioningRolesApi.class,
            SearchablesApi.class,
            LdapAccountApi.class,
            LoginApi.class,
            ReconciliationApi.class,
            SelfServiceRegistrationApi.class,
            SelfServiceRegistrationValiationApi.class,
            SelfServiceResetApi.class
    };

    @Test
    public void allEndpointInterfacesCanBeTargetedDirectly() {
        for (Class<?> endpointInterface : ENDPOINT_INTERFACES) {
            assertNotNull(endpointInterface.getName(), Feign.builder().target(endpointInterface, "http://localhost"));
        }
    }
}
