// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVComponentDescriptor {
 *     int plane;
 *     int step;
 *     int offset;
 *     int shift;
 *     int depth;
 * };
 * }
 */
public class AVComponentDescriptor {

    public static MemoryLayout $LAYOUT() {
        return constants$334.const$0;
    }
    public static VarHandle plane$VH() {
        return constants$334.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int plane;
     * }
     */
    public static int plane$get(MemorySegment seg) {
        return (int)constants$334.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int plane;
     * }
     */
    public static void plane$set(MemorySegment seg, int x) {
        constants$334.const$1.set(seg, x);
    }
    public static int plane$get(MemorySegment seg, long index) {
        return (int)constants$334.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void plane$set(MemorySegment seg, long index, int x) {
        constants$334.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle step$VH() {
        return constants$334.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int step;
     * }
     */
    public static int step$get(MemorySegment seg) {
        return (int)constants$334.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int step;
     * }
     */
    public static void step$set(MemorySegment seg, int x) {
        constants$334.const$2.set(seg, x);
    }
    public static int step$get(MemorySegment seg, long index) {
        return (int)constants$334.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void step$set(MemorySegment seg, long index, int x) {
        constants$334.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle offset$VH() {
        return constants$334.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int offset;
     * }
     */
    public static int offset$get(MemorySegment seg) {
        return (int)constants$334.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int offset;
     * }
     */
    public static void offset$set(MemorySegment seg, int x) {
        constants$334.const$3.set(seg, x);
    }
    public static int offset$get(MemorySegment seg, long index) {
        return (int)constants$334.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, int x) {
        constants$334.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle shift$VH() {
        return constants$334.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int shift;
     * }
     */
    public static int shift$get(MemorySegment seg) {
        return (int)constants$334.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int shift;
     * }
     */
    public static void shift$set(MemorySegment seg, int x) {
        constants$334.const$4.set(seg, x);
    }
    public static int shift$get(MemorySegment seg, long index) {
        return (int)constants$334.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void shift$set(MemorySegment seg, long index, int x) {
        constants$334.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle depth$VH() {
        return constants$334.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int depth;
     * }
     */
    public static int depth$get(MemorySegment seg) {
        return (int)constants$334.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int depth;
     * }
     */
    public static void depth$set(MemorySegment seg, int x) {
        constants$334.const$5.set(seg, x);
    }
    public static int depth$get(MemorySegment seg, long index) {
        return (int)constants$334.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void depth$set(MemorySegment seg, long index, int x) {
        constants$334.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


