# Repository instructions

Plan code changes and summarise them for confirmation before applying them.

## Renovate workflow

Renovate dependency updates accumulate on the `renovate-latest` branch.

Before starting feature work:

1. Merge `renovate-latest` into `master`.
2. Run `./gradlew clean check` and resolve any dependency-update problems.
3. Create the feature branch from the updated `master` branch.

After feature changes are merged into `master`, reset `renovate-latest` to match `master` so Renovate continues from the current codebase.

When resolving conflicts, preserve deliberate dependency removals and structural changes from `master`. Do not reintroduce obsolete dependencies merely because they remain on an older `renovate-latest` history. Run `./gradlew clean check` after merging or rebasing.

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
