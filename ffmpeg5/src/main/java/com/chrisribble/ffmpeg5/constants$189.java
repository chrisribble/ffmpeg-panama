// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$189 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$189() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "av_codec_is_decoder",
        constants$0.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_get_profile_name",
        constants$120.const$4
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("pix_fmt"),
        JAVA_INT.withName("methods"),
        JAVA_INT.withName("device_type")
    ).withName("AVCodecHWConfig");
    static final VarHandle const$3 = constants$189.const$2.varHandle(MemoryLayout.PathElement.groupElement("pix_fmt"));
    static final VarHandle const$4 = constants$189.const$2.varHandle(MemoryLayout.PathElement.groupElement("methods"));
    static final VarHandle const$5 = constants$189.const$2.varHandle(MemoryLayout.PathElement.groupElement("device_type"));
}


