// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$104 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$104() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "seed48_r",
        constants$66.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "lcong48_r",
        constants$66.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "arc4random",
        constants$3.const$4
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "arc4random_buf",
        constants$104.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "arc4random_uniform",
        constants$1.const$0
    );
}


