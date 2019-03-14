# idam-forgerock-http-client
OpenAPI (fka Swagger) specification for Forgerock IDM and AM

## Introduction

This project is an adaptation of the forgerock am and idm swagger generated
json spec to OpenApi 2.0 yaml.

Throw in the swagger-codegen plugin, with the feign library, and you 
have a 'mostly' working http client. At the very least the models are generally accurate.

## Getting started

* Rip the JSON from your desired endpoint by adding *?_api* to the url

``http://forgerock-idm/openidm/managed/role?_api``
``http://localhost:8080/openam/json/realm-config/agents/OAuth2Client?_api``

Now you have some json:

``"{swagger":"2.0","info":{"version":"1.0","title":"OpenAM"},"host":"....``

* Dump it into the swagger hub editor: https://app.swaggerhub.com/apis/

Now you have some yaml:

```yaml
swagger: '2.0'
info:
  version: 5.5.0
  title: ForgeRock AM Agents API
```

* Make a file in src/main/resources with the yaml and checkout the section
titled **Fixing the yaml** below

* Add the file to the build.gradle task *generateApi*

```groovy
generateCodeFromSwagger('src/main/resources/forgerock-am-authentication.yaml', 'am.oidc', [
        'Response'  : 'feign.Response'
])
```

the inputs are `path to file`, `package`, `Object mappings`

Object mappings are basically if you want to reference a definition like 
``'#/definitions/MySpecialObject'``  but `MySpecialObject` is not
defined specifically within the same yaml spec or will not be in the same package.

Eg: You want the feign client to return a `feign.Response` instead of 
deserialize the result into some model, you can reference `#/definitions/Response`
and map the class to the definition like shown above. 

## Fixing the yaml

*Aka: using find-replace like a pro* 

* **Oh no! The definition names are stupid!**

`#/definitions/urn:jsonschema:org:forgerock:openidm:managed:api:Role:assignments:items`

Read this as Object *Role* has *assignments* and it's a list, each item is defined with the above definition

Find Replace :

`urn:jsonschema:org:forgerock:openidm:managed:api:Role:assignments:items`

To:

`RoleAssignments`

Which makes sense, and will make a Java class called RoleAssignments.java

 * **Oh no! The definition names are random garbage!**

`#/definitions/urn:uuid:f891dcb6-928e-4e64-9d0e-4767870a7a34`

`urn:uuid:f891dcb6-928e-4e64-9d0e-4767870a7a34` references a generated definition of a 
parameterized `ResultSet` object, like:
```json
    {
        "result": [
            { "INSERT ANY" : "OBJECT HERE" }
        ],
        "resultCount": 1,
        "pagedResultsCookie": null,
        "totalPagedResultsPolicy": "NONE",
        "totalPagedResults": -1,
        "remainingPagedResults": -1
    }
```

Figure out what the object is, and rename the definition to `RolesQueryResultSet` or whatever

*keep in mind there may be multiple generated versions of the same result set, delete the duplicates 
and fix the definition pointers*

 * **Oh no! The paths seem broken! Hashes everywhere!**

`"/realm-config/agents/OAuth2Client#_action_getcreatabletypes"`

This means if you post to this endpoint with **_action** set to **_getCreatableTypes** it will return
a different result, or possibly the same result but basically it's handled by a different method so
it shows up as a different endpoint.

* **Delete this endpoint from the spec, make sure that `_action` in the base post:**

```yaml
  /json/realms/root/realms/{realm}/realm-config/agents/OAuth2Client:
    post:
      summary: 'Action: getAllTypes'
      operationId: _action_getalltypes
      parameters:
        - $ref: '#/parameters/_action'
      responses:
        '200':
          description: Success
          schema:
            type: '#/definitions/Response'
      description: Call the endpoint with various actions
      tags:
        - OAuth2 Client Agents
```

Has all the required actions in its enum:

```yaml
  _action:
    name: _action
    in: query
    required: true
    type: string
    enum:
      - getAllTypes
      - getCreatableTypes
      - nextdescendents
      - schema
      - template
```

and if you want to use this endpoint for one of these actions..
```java
    new ObjectMapper().readValue(response.body().asInputStream(), <Whatever>.class);
```

Cast it to whatever the result will be from that action, I guess.. I dunno honestly good luck

## How to use

* Define the Client bean with your configuration classes 6y:


    @Bean
    public ApiClient idmApiClient(ErrorDecoder errorDecoder,
                                  Client httpClient, Encoder encoder) {
        ApiClient client =  new ApiClient();
        client.getFeignBuilder().errorDecoder(errorDecoder)
            .requestInterceptors(idmInterceptors)
            .client(httpClient).encoder(encoder);
        return client;
    }

* Build your clients :


    @Bean
    public RoleApi roleApi(@Qualifier("idmApiClient") ApiClient client) {
        return buildFeignClient(client, RoleApi.class);
    }
    
    private <T> T buildFeignClient(ApiClient client, Class<T> clazz) {
        return client.getFeignBuilder()
            .logger(new Slf4jLogger(clazz))
            .target(clazz, <Target AM/FR URL>);
    }
    
## Work Around

#### • Feign doesnt remove headers that are `null`

Instead they will show up like this:
`Authorization: {authorization}`

The following method in a *feign.RequestInterceptor* will solve the problem :

    class HeaderSanitizingInterceptor implements RequestInterceptor {
        @Override public void apply(RequestTemplate template) {
            Map<String, Collection<String>> headers = template.headers();
            Map<String, Collection<String>> sanitizedHeaders = Maps.newConcurrentMap();
            headers.entrySet().stream()
                .filter(e -> e.getValue().stream().noneMatch(s -> s.matches("\\{.*\\}")))
                .forEach(e -> sanitizedHeaders.put(e.getKey(), e.getValue()));
            template.headers(null);
            template.headers(sanitizedHeaders);
        }
    }

Doing it like this makes it thread safe, using the single 
replace cannot be done whilst iterating over the collection

#### • Swagger generator makes snake_case form parameters into camelCase

The following method in a *feign.RequestInterceptor* will solve the problem :

    class AccessTokenRequestInterceptor implements RequestInterceptor {
        @Override public void apply(RequestTemplate template) {
            if (template.url().contains("access_token")) {
                String newBody = new String(template.body());
                newBody = newBody.replace("grantType", "grant_type");
                newBody = newBody.replace("redirectUri", "redirect_uri");
                newBody = newBody.replace("clientId", "client_id");
                newBody = newBody.replace("clientSecret", "client_secret");
                template.body(newBody.getBytes(), UTF_8);
            }
            if (template.url().contains("idtokeninfo")) {
                String newBody = new String(template.body());
                newBody = newBody.replace("idToken", "id_token");
                template.body(newBody.getBytes(), UTF_8);
            }
        }
    }

Basically just replace them, this is due to how the Api is generated.

There is no better work around as far as I know.

#### • Feign doesnt handle *3xx* HTTP Responses

* **feign.Responses to the rescue**

If the call might return a 3xx response like say the OAuth2 Code request, make the 
return feign.Response and then you can handle it instead of Feign throwing exceptions

```java
            Response feignResponse = openIdConnectApi.oauth2Authorize(IPLANET_COOKIE_NAME+"="+token.getTokenId(),
                token.getTokenId(), "scope1 scope2",
                new OpenIdConnectApi.Oauth2AuthorizeQueryParams()
                    .clientId("test_client")
                    .responseType("code")
                    .realm("realm")
                    .decision("Allow")
                    .redirectUri("http://www.test_client.com"));

            String code = UriComponentsBuilder.fromUriString(feignResponse.headers().get(HttpHeaders.LOCATION)
                .stream().findFirst().orElse("")).build()
                .getQueryParams().getFirst("code");
```

