# idam-forgerock-http-client

Feign endpoint interfaces and data-transfer objects for the ForgeRock AM and IDM APIs used by HMCTS IDAM.

## Development

The Java sources in `src/main/java` are the maintained source of truth. Although many classes originated from Swagger Codegen, this repository no longer runs a code generator: the old specifications did not reproduce the hand-maintained API accurately and generated infrastructure that consumers do not need.

Make contract changes directly and preserve the published package names, endpoint signatures, Feign annotations, JSON mappings, and query-encoding behaviour unless a breaking change is intentional.

The library does not provide an HTTP client builder, authentication, codecs, retry policy, logging, or transport configuration. Applications target the endpoint interfaces with their own Feign configuration, for example:

```java
UserApi userApi = Feign.builder()
        .client(client)
        .encoder(encoder)
        .decoder(decoder)
        .target(UserApi.class, forgeRockUrl);
```

The former generated `ApiClient` and authentication helpers were removed as a breaking API change. Consumers must supply this application-owned configuration directly.

The library has no Spring or Spring Boot dependency. Response parsing and HTTP exception policies belong to consuming applications.

DTOs depend only on the shared `com.fasterxml.jackson.annotation` API used by both Jackson 2 and Jackson 3. Object mapper, databind, Java-time modules, and decoding configuration belong to consuming applications.

The project uses a Java 21 toolchain and emits Java 21 bytecode.

Run the verification suite with:

```shell
./gradlew clean check
```

`verifyDependencyBaseline` locks the direct dependency set so dependency cleanup is explicit and reviewable. Update that baseline only when a dependency change is intentional.

## Publishing

Artifacts are built from the committed sources and published with:

```shell
./gradlew publish
```

`RELEASE_VERSION` supplies the publication version. Without it, the local version is `DEV-SNAPSHOT`.
