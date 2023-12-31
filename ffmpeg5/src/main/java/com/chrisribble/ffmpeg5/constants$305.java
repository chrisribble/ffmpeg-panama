// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$305 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$305() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("index"),
        JAVA_INT.withName("id"),
        RuntimeHelper.POINTER.withName("priv_data"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("time_base"),
        JAVA_LONG.withName("start_time"),
        JAVA_LONG.withName("duration"),
        JAVA_LONG.withName("nb_frames"),
        JAVA_INT.withName("disposition"),
        JAVA_INT.withName("discard"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("sample_aspect_ratio"),
        RuntimeHelper.POINTER.withName("metadata"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("avg_frame_rate"),
        MemoryLayout.structLayout(
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
        ).withName("attached_pic"),
        RuntimeHelper.POINTER.withName("side_data"),
        JAVA_INT.withName("nb_side_data"),
        JAVA_INT.withName("event_flags"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("r_frame_rate"),
        RuntimeHelper.POINTER.withName("codecpar"),
        JAVA_INT.withName("pts_wrap_bits"),
        MemoryLayout.paddingLayout(4)
    ).withName("AVStream");
    static final VarHandle const$1 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("index"));
    static final VarHandle const$2 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("id"));
    static final VarHandle const$3 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("priv_data"));
    static final VarHandle const$4 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("start_time"));
    static final VarHandle const$5 = constants$305.const$0.varHandle(MemoryLayout.PathElement.groupElement("duration"));
}


