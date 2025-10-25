# ffmpeg-panama
FFmpeg Java (Panama) bindings

# Building
- Download/install jextract 25 from https://jdk.java.net/jextract

# Generate FFmpeg bindings
## Run jextract on FFmpeg tarballs
```
# Assumes you've installed 25-jextract+1-1 at /usr/local/jextract/bin or elsewhere on your path
./jextract.sh 7.1.1 ffmpeg7
./jextract.sh 8.0 ffmpeg8
```
