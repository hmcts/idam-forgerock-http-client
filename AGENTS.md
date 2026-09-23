# Repository instructions

Plan code changes and summarise them for confirmation before applying them.

## Release validation

Before tagging a new version, manually verify the proposed library changes against `idam-api`.

1. From this repository, build, test, and publish the development snapshot to the local Maven repository:

   ```shell
   ./gradlew clean check publishToMavenLocal
   ```

2. In the `idam-api` repository:
   - Ensure `mavenLocal()` is the first Maven repository.
   - Temporarily set the `idam-forgerock-http-client` dependency version to `DEV-SNAPSHOT`.
   - Run the relevant build and tests.

3. Revert the temporary `idam-api` repository and dependency-version changes.

Do not create or push a release tag unless the manual `idam-api` validation passes.
