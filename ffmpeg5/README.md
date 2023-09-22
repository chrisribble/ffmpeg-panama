The source files in this project are generated (currently using system ffmpeg libraries).

To regenerate them with different ffmpeg headers, run jextract.sh.

As of 2023-09-22, doing this with jextract targetting JDK21 requires building jextract from source.

Building `jextract` on Gentoo Linux:
```
cd ..
git clone https://github.com/openjdk/jextract.git
git checkout jdk21
mkdir -p build/jextract_jmod_libs
LD_LIBRARY_PATH=/usr/lib/llvm/16/lib64 sh ./gradlew -Pjdk21_home=/usr/local/jdk-21 -Pllvm_home=/usr verify
```

Running `jextract.sh` with jextract built from source:
```
PATH="../../jextract/build/jextract/bin:${PATH}" LD_LIBRARY_PATH=/usr/lib/llvm/16/lib64 ./jextract.sh
```

TODO: Move this process into Docker
