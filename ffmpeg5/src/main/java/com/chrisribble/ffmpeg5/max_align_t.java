// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct max_align_t {
 *     long long __clang_max_align_nonce1;
 *     long double __clang_max_align_nonce2;
 * };
 * }
 */
public class max_align_t {

    public static MemoryLayout $LAYOUT() {
        return constants$133.const$3;
    }
    public static VarHandle __clang_max_align_nonce1$VH() {
        return constants$133.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long __clang_max_align_nonce1;
     * }
     */
    public static long __clang_max_align_nonce1$get(MemorySegment seg) {
        return (long)constants$133.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long __clang_max_align_nonce1;
     * }
     */
    public static void __clang_max_align_nonce1$set(MemorySegment seg, long x) {
        constants$133.const$4.set(seg, x);
    }
    public static long __clang_max_align_nonce1$get(MemorySegment seg, long index) {
        return (long)constants$133.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void __clang_max_align_nonce1$set(MemorySegment seg, long index, long x) {
        constants$133.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


