// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$293 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$293() {}
    static final VarHandle const$0 = constants$292.const$0.varHandle(MemoryLayout.PathElement.groupElement("priv_class"));
    static final VarHandle const$1 = constants$292.const$0.varHandle(MemoryLayout.PathElement.groupElement("mime_type"));
    static final VarHandle const$2 = constants$292.const$0.varHandle(MemoryLayout.PathElement.groupElement("raw_codec_id"));
    static final VarHandle const$3 = constants$292.const$0.varHandle(MemoryLayout.PathElement.groupElement("priv_data_size"));
    static final VarHandle const$4 = constants$292.const$0.varHandle(MemoryLayout.PathElement.groupElement("flags_internal"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(AVInputFormat.read_probe.class, "apply", constants$0.const$3);
}


