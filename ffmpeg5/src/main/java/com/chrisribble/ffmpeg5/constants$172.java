// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$172 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$172() {}
    static final VarHandle const$0 = constants$164.const$4.varHandle(MemoryLayout.PathElement.groupElement("private_ref"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_get_colorspace_name",
        constants$0.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_frame_alloc",
        constants$4.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_frame_free",
        constants$70.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_frame_ref",
        constants$66.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_frame_clone",
        constants$67.const$1
    );
}


