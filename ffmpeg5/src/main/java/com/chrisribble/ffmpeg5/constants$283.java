// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$283 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$283() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "avio_put_str16le",
        constants$66.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "avio_put_str16be",
        constants$66.const$1
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "avio_write_marker",
        constants$283.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "avio_seek",
        constants$273.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "avio_skip",
        constants$122.const$4
    );
}


