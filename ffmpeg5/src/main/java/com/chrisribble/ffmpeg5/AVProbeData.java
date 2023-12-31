// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVProbeData {
 *     char* filename;
 *     unsigned char* buf;
 *     int buf_size;
 *     char* mime_type;
 * };
 * }
 */
public class AVProbeData {

    public static MemoryLayout $LAYOUT() {
        return constants$290.const$1;
    }
    public static VarHandle filename$VH() {
        return constants$290.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* filename;
     * }
     */
    public static MemorySegment filename$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$290.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* filename;
     * }
     */
    public static void filename$set(MemorySegment seg, MemorySegment x) {
        constants$290.const$2.set(seg, x);
    }
    public static MemorySegment filename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$290.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void filename$set(MemorySegment seg, long index, MemorySegment x) {
        constants$290.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buf$VH() {
        return constants$290.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* buf;
     * }
     */
    public static MemorySegment buf$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$290.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* buf;
     * }
     */
    public static void buf$set(MemorySegment seg, MemorySegment x) {
        constants$290.const$3.set(seg, x);
    }
    public static MemorySegment buf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$290.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void buf$set(MemorySegment seg, long index, MemorySegment x) {
        constants$290.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buf_size$VH() {
        return constants$290.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int buf_size;
     * }
     */
    public static int buf_size$get(MemorySegment seg) {
        return (int)constants$290.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int buf_size;
     * }
     */
    public static void buf_size$set(MemorySegment seg, int x) {
        constants$290.const$4.set(seg, x);
    }
    public static int buf_size$get(MemorySegment seg, long index) {
        return (int)constants$290.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void buf_size$set(MemorySegment seg, long index, int x) {
        constants$290.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mime_type$VH() {
        return constants$290.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* mime_type;
     * }
     */
    public static MemorySegment mime_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$290.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* mime_type;
     * }
     */
    public static void mime_type$set(MemorySegment seg, MemorySegment x) {
        constants$290.const$5.set(seg, x);
    }
    public static MemorySegment mime_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$290.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void mime_type$set(MemorySegment seg, long index, MemorySegment x) {
        constants$290.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


