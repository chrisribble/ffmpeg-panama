// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$264 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$264() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "ctime_r",
        constants$67.const$4
    );
    static final SequenceLayout const$1 = MemoryLayout.sequenceLayout(2, RuntimeHelper.POINTER);
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("__tzname", constants$264.const$1);
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("__daylight", JAVA_INT);
    static final VarHandle const$4 = JAVA_LONG.varHandle();
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("__timezone", JAVA_LONG);
}


