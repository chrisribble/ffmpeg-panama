// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$178 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$178() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_frame_apply_cropping",
        constants$85.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_frame_side_data_name",
        constants$0.const$1
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("av_class"),
        RuntimeHelper.POINTER.withName("internal"),
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hwctx"),
        RuntimeHelper.POINTER.withName("free"),
        RuntimeHelper.POINTER.withName("user_opaque")
    ).withName("AVHWDeviceContext");
    static final VarHandle const$3 = constants$178.const$2.varHandle(MemoryLayout.PathElement.groupElement("av_class"));
    static final VarHandle const$4 = constants$178.const$2.varHandle(MemoryLayout.PathElement.groupElement("internal"));
    static final VarHandle const$5 = constants$178.const$2.varHandle(MemoryLayout.PathElement.groupElement("type"));
}


