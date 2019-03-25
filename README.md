# idam-forgerock-http-client
OpenAPI (fka Swagger) specification for Forgerock IDM and AM

## Introduction

This project is an adaptation of the Forgerock am and idm swagger generated
json spec to OpenApi 2.0 yaml.

Throw in the swagger-codegen plugin, with the feign library, and you 
have a 'mostly' working http client. At the very least the models are generally accurate.

## Getting started

* Rip the JSON from your desired endpoint by adding *?_api* to the url

``http://forgerock-idm/openidm/managed/role?_api``
``http://localhost:8080/openam/json/realm-config/agents/OAuth2Client?_api``

Now you have some json:

```json 
    "{swagger":"2.0","info":{"version":"1.0","title":"OpenAM"},"host":"....
```

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

```javascript
    generateCodeFromSwagger('src/main/resources/forgerock-am-authentication.yaml', 'am.oidc', [
            'Response'  : 'feign.Response'
    ])
```

the inputs are `path to file`, `package`, `Object mappings`

Object mappings are basically if you want to reference a definition like 
``'#/definitions/MySpecialObject'``  but `MySpecialObject` is not
defined specifically within the same yaml spec or will not be in the same package.

--------
Eg. You want the feign client to return a `IdmUser` object, but you have already
defined `IdmUser` in *forgerock-idm-user-management.yaml* so it will be built into
the package:

`org.forgerock.idm.user.management.IdmUser`

And the yaml *forgerock-idm-user-role-management.yaml* would build another version of
the same object into a different directory like:

`org.forgerock.idm.user.role.management.IdmUser`

You can just exclude the definition from *forgerock-idm-user-role-management.yaml* and
add a mapping of:
```javascript
    generateCodeFromSwagger('src/main/resources/forgerock-idm-user-role-management.yaml', 'idm.user.role', [
            'IdmUser' : 'org.forgerock.idm.user.management.IdmUser'
    ])
```
so it knows how to map the object return from the API method

--------

Eg: You want the feign client to return a `feign.Response` instead of 
deserialize the result into some model, you can reference `#/definitions/Response`
and map the class to the definition like shown above. 

## Fixing the yaml

*Aka: using find-replace* 

* **The definition names make no sense**

`#/definitions/urn:jsonschema:org:forgerock:openidm:managed:api:Role:assignments:items`

Read this as Object *Role* has *assignments* and it's a list, each item is defined with the above definition

Find Replace :

`urn:jsonschema:org:forgerock:openidm:managed:api:Role:assignments:items`

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>

```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




