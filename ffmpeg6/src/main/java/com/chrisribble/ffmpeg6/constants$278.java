// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$278 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$278() {}
    static final VarHandle const$0 = constants$270.const$5.varHandle(MemoryLayout.PathElement.groupElement("buf_ptr_max"));
    static final VarHandle const$1 = constants$270.const$5.varHandle(MemoryLayout.PathElement.groupElement("bytes_read"));
    static final VarHandle const$2 = constants$270.const$5.varHandle(MemoryLayout.PathElement.groupElement("bytes_written"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "avio_find_protocol_name",
        constants$67.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "avio_check",
        constants$82.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "avio_open_dir",
        constants$71.const$1
    );
}


