// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$204 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$204() {}
    static final VarHandle const$0 = constants$203.const$4.varHandle(MemoryLayout.PathElement.groupElement("size"));
    static final VarHandle const$1 = constants$203.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("buf"),
        JAVA_LONG.withName("pts"),
        JAVA_LONG.withName("dts"),
        RuntimeHelper.POINTER.withName("data"),
        JAVA_INT.withName("size"),
        JAVA_INT.withName("stream_index"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("side_data"),
        JAVA_INT.withName("side_data_elems"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("duration"),
        JAVA_LONG.withName("pos"),
        RuntimeHelper.POINTER.withName("opaque"),
        RuntimeHelper.POINTER.withName("opaque_ref"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("time_base")
    ).withName("AVPacket");
    static final VarHandle const$3 = constants$204.const$2.varHandle(MemoryLayout.PathElement.groupElement("buf"));
    static final VarHandle const$4 = constants$204.const$2.varHandle(MemoryLayout.PathElement.groupElement("pts"));
    static final VarHandle const$5 = constants$204.const$2.varHandle(MemoryLayout.PathElement.groupElement("dts"));
}


