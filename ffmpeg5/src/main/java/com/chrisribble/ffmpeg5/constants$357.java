// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$357 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$357() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "sws_normalizeVec",
        constants$356.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "sws_freeVec",
        constants$70.const$2
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "sws_getDefaultFilter",
        constants$357.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "sws_freeFilter",
        constants$70.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "sws_getCachedContext",
        constants$357.const$5
    );
}


