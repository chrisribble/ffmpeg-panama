// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$100 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$100() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "rand_r",
        constants$0.const$3
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_DOUBLE);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "drand48",
        constants$100.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "erand48",
        constants$21.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "lrand48",
        constants$83.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "nrand48",
        constants$79.const$0
    );
}


