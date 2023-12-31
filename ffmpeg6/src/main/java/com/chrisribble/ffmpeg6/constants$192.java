// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$192 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$192() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("codec_type"),
        JAVA_INT.withName("codec_id"),
        JAVA_INT.withName("codec_tag"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("extradata"),
        JAVA_INT.withName("extradata_size"),
        JAVA_INT.withName("format"),
        JAVA_LONG.withName("bit_rate"),
        JAVA_INT.withName("bits_per_coded_sample"),
        JAVA_INT.withName("bits_per_raw_sample"),
        JAVA_INT.withName("profile"),
        JAVA_INT.withName("level"),
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("num"),
            JAVA_INT.withName("den")
        ).withName("sample_aspect_ratio"),
        JAVA_INT.withName("field_order"),
        JAVA_INT.withName("color_range"),
        JAVA_INT.withName("color_primaries"),
        JAVA_INT.withName("color_trc"),
        JAVA_INT.withName("color_space"),
        JAVA_INT.withName("chroma_location"),
        JAVA_INT.withName("video_delay"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("channel_layout"),
        JAVA_INT.withName("channels"),
        JAVA_INT.withName("sample_rate"),
        JAVA_INT.withName("block_align"),
        JAVA_INT.withName("frame_size"),
        JAVA_INT.withName("initial_padding"),
        JAVA_INT.withName("trailing_padding"),
        JAVA_INT.withName("seek_preroll"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_INT.withName("order"),
            JAVA_INT.withName("nb_channels"),
            MemoryLayout.unionLayout(
                JAVA_LONG.withName("mask"),
                RuntimeHelper.POINTER.withName("map")
            ).withName("u"),
            RuntimeHelper.POINTER.withName("opaque")
        ).withName("ch_layout")
    ).withName("AVCodecParameters");
    static final VarHandle const$1 = constants$192.const$0.varHandle(MemoryLayout.PathElement.groupElement("codec_type"));
    static final VarHandle const$2 = constants$192.const$0.varHandle(MemoryLayout.PathElement.groupElement("codec_id"));
    static final VarHandle const$3 = constants$192.const$0.varHandle(MemoryLayout.PathElement.groupElement("codec_tag"));
    static final VarHandle const$4 = constants$192.const$0.varHandle(MemoryLayout.PathElement.groupElement("extradata"));
    static final VarHandle const$5 = constants$192.const$0.varHandle(MemoryLayout.PathElement.groupElement("extradata_size"));
}


