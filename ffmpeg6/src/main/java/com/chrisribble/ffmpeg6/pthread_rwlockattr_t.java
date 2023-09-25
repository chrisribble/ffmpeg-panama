// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union {
 *     char __size[8];
 *     long __align;
 * };
 * }
 */
public class pthread_rwlockattr_t {

    public static MemoryLayout $LAYOUT() {
        return constants$96.const$2;
    }
    public static MemorySegment __size$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle __align$VH() {
        return constants$96.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long __align;
     * }
     */
    public static long __align$get(MemorySegment seg) {
        return (long)constants$96.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long __align;
     * }
     */
    public static void __align$set(MemorySegment seg, long x) {
        constants$96.const$3.set(seg, x);
    }
    public static long __align$get(MemorySegment seg, long index) {
        return (long)constants$96.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, long x) {
        constants$96.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


