// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$190 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$190() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "avcodec_get_hw_config",
        constants$120.const$4
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("id"),
        JAVA_INT.withName("type"),
        RuntimeHelper.POINTER.withName("name"),
        RuntimeHelper.POINTER.withName("long_name"),
        JAVA_INT.withName("props"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("mime_types"),
        RuntimeHelper.POINTER.withName("profiles")
    ).withName("AVCodecDescriptor");
    static final VarHandle const$2 = constants$190.const$1.varHandle(MemoryLayout.PathElement.groupElement("id"));
    static final VarHandle const$3 = constants$190.const$1.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$4 = constants$190.const$1.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final VarHandle const$5 = constants$190.const$1.varHandle(MemoryLayout.PathElement.groupElement("long_name"));
}


