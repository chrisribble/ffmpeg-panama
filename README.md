# ffmpeg-panama
FFmpeg Java (Panama) bindings

# Building
- Download/install jextract 22 from https://jdk.java.net/jextract

# Generate FFmpeg bindings
## Run jextract on FFmpeg tarballs
```
# Assumes you've installed 22-jextract+6-47 at /usr/local/jextract
./jextract.sh 7.1.1 ffmpeg7
./jextract.sh 8.0 ffmpeg8
```
