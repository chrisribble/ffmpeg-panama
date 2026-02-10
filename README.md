# ffmpeg-panama
FFmpeg Java (Panama) bindings

# Building
- Download/install jextract 25 from https://jdk.java.net/jextract

# Generate FFmpeg bindings
## Run jextract on FFmpeg tarballs

** Assumes you've installed 25-jextract+2-4 at /usr/local/jextract/bin or elsewhere on your path **

```
./jextract.sh 7.0.3 ffmpeg7
```

```
./jextract.sh 8.0.1 ffmpeg8
```

Notes:
* For broader compatibility, generate bindings against MAJOR.0.PATCH releases like 7.0.3 or 8.0.1
* FFmpeg public ABI/API is stable across minor releases
