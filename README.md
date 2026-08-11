# ffmpeg-panama
FFmpeg Java (Panama) bindings

# Using

Published to Maven Central under `io.github.chrisribble`:

| Artifact | Contents |
| --- | --- |
| `ffm-ffmpeg-bindings` | jextract-generated bindings for the FFmpeg C API |
| `ffm-ffmpeg-core` | Contexts, frames, packets and resource scopes |
| `ffm-ffmpeg-analyzer` | Media file analysis |
| `ffm-ffmpeg-decoder` | Video frame decoding |

```groovy
dependencies {
	implementation 'io.github.chrisribble:ffm-ffmpeg-core:0.8.0'
	implementation 'io.github.chrisribble:ffm-ffmpeg-decoder:0.8.0'
}
```

Requirements:
* Java 25+
* FFmpeg 8.0.x shared libraries (`avcodec`, `avformat`, `avutil`, `swscale`) discoverable via
  `java.library.path`
* `--enable-native-access` for the modules that call into FFmpeg

See [RELEASING.md](RELEASING.md) for how releases are published.

# Building
- Download/install jextract 25 from https://jdk.java.net/jextract

# Generate FFmpeg bindings
## Run jextract on FFmpeg tarballs

** Assumes you've installed 25-jextract+2-4 at /usr/local/jextract/bin or elsewhere on your path **

```
./jextract.sh 8.0.3 bindings
```

Notes:
* For broader compatibility, generate bindings against MAJOR.0.PATCH releases like 8.0.x
* FFmpeg public ABI/API is stable across minor releases
