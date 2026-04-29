# Generate test content
```
ffmpeg -y -f lavfi -i testsrc=duration=10:size=1920x1080 -pix_fmt yuv420p testsrc.mp4
```
