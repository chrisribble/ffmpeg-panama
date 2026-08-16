# Summary
High-level Java library which exposes media analysis/decode capabilities
- Uses `libav` via Java's FFM API
- Absolutely no shelling out to `ffmpeg`/`ffprobe`
- Accepts single input files (`input.mp4`)
- Accepts multiple input files to feed `libav` `concat` input muxer, i.e. ISOBMFF parts (`init-stream0.m4s`,`chunk-stream0-00001.m4s`)

# Modules
## decoder
### Lazily/efficiently decode `Stream<BufferedImage>` from input(s)
`BufferedImageStream` has been carefully optimized for low latency. Decoding is done lazily (one frame at a time) as the `Stream` is consumed, avoiding extra memory/disk usage that would otherwise be required to dump the frames to disk. `BufferedImageStream` also supports processing every Nth frame (note: requires decoding intermediate frames) and limiting the number of frames to produce (note: decoding stops once the frame limit is reached, avoiding extra resource usage).

A typical use case is build the `Stream` with samples every Nth frame, stopping after M frame samples. Then use the `Stream` to lazily process each frame sample via a downstream computer vision library (i.e. [ONNX Java](https://github.com/microsoft/onnxruntime)).

Builder API makes configuring the `Stream` simple. See tests for examples.

The API exposed by this module should be considered stable.
## analyzer
### Read audio/video metadata from input(s)
This is still rudimentary and does not handle "edge" cases like multiple video tracks, multiple audio tracks, etc.

It also currently lacks support for various bits of interesting metadata that are available in the `libav` API and as such the exposed API should be considered unstable. It will likely receive API-breaking changes periodically until the structure of the most useful set of information emerges.

## Warranty/License

This library has no warranty (expressed or implied). It is [licensed under the terms of the LGPL version 2.1](LICENSE)

# Usage

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
