// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int64_t (*avio_alloc_context$seek)(void*,int64_t,int);
 * }
 */
public interface avio_alloc_context$seek {

    long apply(java.lang.foreign.MemorySegment _x0, long _x1, int _x2);
    static MemorySegment allocate(avio_alloc_context$seek fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$282.const$5, fi, constants$275.const$4, scope);
    }
    static avio_alloc_context$seek ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment __x0, long __x1, int __x2) -> {
            try {
                return (long)constants$276.const$0.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


