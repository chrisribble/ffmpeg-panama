// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$282 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$282() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "avio_wl16",
        constants$159.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "avio_wb16",
        constants$159.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "avio_put_str",
        constants$66.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "avio_put_str16le",
        constants$66.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "avio_put_str16be",
        constants$66.const$1
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "avio_write_marker",
        constants$282.const$5
    );
}


