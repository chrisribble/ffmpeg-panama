// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$254 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$254() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(AVCodecParser.parser_parse.class, "apply", constants$253.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$253.const$5
    );
    static final VarHandle const$2 = constants$253.const$1.varHandle(MemoryLayout.PathElement.groupElement("parser_parse"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(AVCodecParser.parser_close.class, "apply", constants$70.const$2);
    static final VarHandle const$4 = constants$253.const$1.varHandle(MemoryLayout.PathElement.groupElement("parser_close"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(AVCodecParser.split.class, "apply", constants$109.const$5);
}


