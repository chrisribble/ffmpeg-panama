// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$256 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$256() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(AVCodecParser.parser_init.class, "apply", constants$0.const$3);
    static final VarHandle const$1 = constants$255.const$4.varHandle(MemoryLayout.PathElement.groupElement("parser_init"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(AVCodecParser.parser_parse.class, "apply", constants$256.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$256.const$2
    );
    static final VarHandle const$5 = constants$255.const$4.varHandle(MemoryLayout.PathElement.groupElement("parser_parse"));
}


