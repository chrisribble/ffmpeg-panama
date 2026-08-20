# Releasing

Releases are cut manually from a local machine using
[vanniktech/gradle-maven-publish-plugin](https://vanniktech.github.io/gradle-maven-publish-plugin/).
All four modules (`bindings`, `core`, `analyzer`, `decoder`) go out together as a single
Central Portal deployment.

## One-time setup

1. A [Central Portal](https://central.sonatype.com/) account with the `io.github.chrisribble`
   namespace verified.
2. A **user token** generated from the portal (Account → Generate User Token). The portal login
   credentials themselves will not work for publishing.
3. A GPG key whose public half has been pushed to a keyserver, e.g.:

   ```
   gpg --keyserver keyserver.ubuntu.com --send-keys <key id>
   ```

4. Portal credentials in `~/.gradle/gradle.properties` — **never** in this repository:

   ```properties
   mavenCentralUsername=<token username>
   mavenCentralPassword=<token password>
   ```

## Signing

`publish.gradle` supports two signatories. Locally, nothing beyond a working GPG install is
needed; `signingInMemoryKey` exists for CI and takes precedence when set.

### Local releases: the gpg agent (default)

With no `signingInMemoryKey` property present, `publish.gradle` calls Gradle's `useGpgCmd()`, so
signing goes through the `gpg` binary and your own keyring. The private key never has to be
copied into a file. Requirements:

- GnuPG 2.x on `PATH` as `gpg2`. Gradle's default `signing.gnupg.executable` is `gpg2` (it is
  only `gpg` when `signing.gnupg.useLegacyGpg=true`). Most distributions and Homebrew install
  GnuPG 2.x as plain `gpg` with no `gpg2` symlink, so this is usually needed:

  ```properties
  signing.gnupg.executable=gpg
  ```

- `signing.gnupg.keyName=<key id>` if the keyring holds more than one secret key; otherwise
  GnuPG's default key is used.
- The passphrase comes from `gpg-agent` via pinentry. If the agent cannot prompt (a headless
  shell, for instance), either prime it by signing something once by hand — `echo test | gpg
  --clearsign` — or set `signing.gnupg.passphrase`.

### CI: in-memory key

Setting `signingInMemoryKey` switches the plugin to its own in-memory signatory and the
`useGpgCmd()` fallback is skipped:

```properties
signingInMemoryKey=<single-line armored key body>
signingInMemoryKeyId=<last 8 characters of the key id>
signingInMemoryKeyPassword=<key passphrase>
```

Export the key with:

```
gpg --export-secret-keys --armor <key id> | grep -v '^-----' | grep -v '^=' | tr -d '\n'
```

The plugin wants the armored body only: the `-----BEGIN-----`/`-----END-----` lines, the trailing
`=CRC` checksum line and every line break must all be removed. A `.properties` file cannot hold a
multi-line value — it silently truncates at the first newline — so the key has to be one line.
Via environment variables (`ORG_GRADLE_PROJECT_signingInMemoryKey`) the multi-line armored key
can be passed verbatim instead.

`signingInMemoryKeyId` may be omitted when the export contains a single key. Supplying an id that
does not match a signing-capable subkey fails with "did not contain a key with id" rather than
falling back.

### If signing fails

`signAllPublications()` registers the `sign*Publication` tasks unconditionally but only wires a
signatory when `signingInMemoryKey` is set — hence the `useGpgCmd()` fallback. If neither
signatory resolves, the build fails with *"Cannot perform signing task ... because it has no
configured signatory"*. Because the version is not a `-SNAPSHOT`, signing is **required** and this
is a hard error rather than a skip.

## Cutting a release

1. Bump `version` in the root `build.gradle`.
2. `./gradlew clean build`
3. `./gradlew publishAndReleaseToMavenCentral`
4. Tag and push:

   ```
   git tag -a <version>
   git push origin master --tags
   ```

To inspect a deployment before it goes live, run `./gradlew publishToMavenCentral` instead and
release it from the portal UI. `mavenCentralAutomaticPublishing` is intentionally left unset so
this stays an option.

## Installing locally

Signing is enabled by default via `signAllPublications=true` in `gradle.properties`. To install to
`~/.m2` without a GPG key:

```
./gradlew publishToMavenLocal -PsignAllPublications=false
```
