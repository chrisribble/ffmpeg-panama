// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$236 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$236() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(AVCodecContext.get_encode_buffer.class, "apply", constants$109.const$5);
    static final VarHandle const$1 = constants$208.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_encode_buffer"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("name"),
        JAVA_INT.withName("type"),
        JAVA_INT.withName("id"),
        JAVA_INT.withName("pix_fmt"),
        JAVA_INT.withName("capabilities"),
        RuntimeHelper.POINTER.withName("alloc_frame"),
        RuntimeHelper.POINTER.withName("start_frame"),
        RuntimeHelper.POINTER.withName("decode_params"),
        RuntimeHelper.POINTER.withName("decode_slice"),
        RuntimeHelper.POINTER.withName("end_frame"),
        JAVA_INT.withName("frame_priv_data_size"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("init"),
        RuntimeHelper.POINTER.withName("uninit"),
        JAVA_INT.withName("priv_data_size"),
        JAVA_INT.withName("caps_internal"),
        RuntimeHelper.POINTER.withName("frame_params")
    ).withName("AVHWAccel");
    static final VarHandle const$3 = constants$236.const$2.varHandle(MemoryLayout.PathElement.groupElement("name"));
    static final VarHandle const$4 = constants$236.const$2.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$5 = constants$236.const$2.varHandle(MemoryLayout.PathElement.groupElement("id"));
}

