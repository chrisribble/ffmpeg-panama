// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$179 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$179() {}
    static final VarHandle const$0 = constants$176.const$4.varHandle(MemoryLayout.PathElement.groupElement("height"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "av_hwdevice_find_type_by_name",
        constants$0.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "av_hwdevice_get_type_name",
        constants$0.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "av_hwdevice_iterate_types",
        constants$1.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "av_hwdevice_ctx_alloc",
        constants$0.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "av_hwdevice_ctx_init",
        constants$0.const$3
    );
}


