// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct drand48_data {
 *     unsigned short __x[3];
 *     unsigned short __old_x[3];
 *     unsigned short __c;
 *     unsigned short __init;
 *     unsigned long long __a;
 * };
 * }
 */
public class drand48_data {

    public static MemoryLayout $LAYOUT() {
        return constants$105.const$0;
    }
    public static MemorySegment __x$slice(MemorySegment seg) {
        return seg.asSlice(0, 6);
    }
    public static MemorySegment __old_x$slice(MemorySegment seg) {
        return seg.asSlice(6, 6);
    }
    public static VarHandle __c$VH() {
        return constants$105.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short __c;
     * }
     */
    public static short __c$get(MemorySegment seg) {
        return (short)constants$105.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short __c;
     * }
     */
    public static void __c$set(MemorySegment seg, short x) {
        constants$105.const$1.set(seg, x);
    }
    public static short __c$get(MemorySegment seg, long index) {
        return (short)constants$105.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void __c$set(MemorySegment seg, long index, short x) {
        constants$105.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __init$VH() {
        return constants$105.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short __init;
     * }
     */
    public static short __init$get(MemorySegment seg) {
        return (short)constants$105.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short __init;
     * }
     */
    public static void __init$set(MemorySegment seg, short x) {
        constants$105.const$2.set(seg, x);
    }
    public static short __init$get(MemorySegment seg, long index) {
        return (short)constants$105.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void __init$set(MemorySegment seg, long index, short x) {
        constants$105.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __a$VH() {
        return constants$105.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long __a;
     * }
     */
    public static long __a$get(MemorySegment seg) {
        return (long)constants$105.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long __a;
     * }
     */
    public static void __a$set(MemorySegment seg, long x) {
        constants$105.const$3.set(seg, x);
    }
    public static long __a$get(MemorySegment seg, long index) {
        return (long)constants$105.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void __a$set(MemorySegment seg, long index, long x) {
        constants$105.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


