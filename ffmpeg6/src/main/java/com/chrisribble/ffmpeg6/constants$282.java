// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$282 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$282() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "avio_read_dir",
        constants$68.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "avio_close_dir",
        constants$0.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "avio_free_directory_entry",
        constants$72.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(avio_alloc_context$read_packet.class, "apply", constants$66.const$0);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(avio_alloc_context$write_packet.class, "apply", constants$66.const$0);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(avio_alloc_context$seek.class, "apply", constants$275.const$4);
}


