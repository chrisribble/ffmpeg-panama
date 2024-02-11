// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVCPBProperties {
 *     int64_t max_bitrate;
 *     int64_t min_bitrate;
 *     int64_t avg_bitrate;
 *     int64_t buffer_size;
 *     uint64_t vbv_delay;
 * };
 * }
 */
public class AVCPBProperties {

    public static MemoryLayout $LAYOUT() {
        return constants$201.const$5;
    }
    public static VarHandle max_bitrate$VH() {
        return constants$202.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t max_bitrate;
     * }
     */
    public static long max_bitrate$get(MemorySegment seg) {
        return (long)constants$202.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t max_bitrate;
     * }
     */
    public static void max_bitrate$set(MemorySegment seg, long x) {
        constants$202.const$0.set(seg, x);
    }
    public static long max_bitrate$get(MemorySegment seg, long index) {
        return (long)constants$202.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void max_bitrate$set(MemorySegment seg, long index, long x) {
        constants$202.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle min_bitrate$VH() {
        return constants$202.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t min_bitrate;
     * }
     */
    public static long min_bitrate$get(MemorySegment seg) {
        return (long)constants$202.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t min_bitrate;
     * }
     */
    public static void min_bitrate$set(MemorySegment seg, long x) {
        constants$202.const$1.set(seg, x);
    }
    public static long min_bitrate$get(MemorySegment seg, long index) {
        return (long)constants$202.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void min_bitrate$set(MemorySegment seg, long index, long x) {
        constants$202.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle avg_bitrate$VH() {
        return constants$202.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t avg_bitrate;
     * }
     */
    public static long avg_bitrate$get(MemorySegment seg) {
        return (long)constants$202.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t avg_bitrate;
     * }
     */
    public static void avg_bitrate$set(MemorySegment seg, long x) {
        constants$202.const$2.set(seg, x);
    }
    public static long avg_bitrate$get(MemorySegment seg, long index) {
        return (long)constants$202.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void avg_bitrate$set(MemorySegment seg, long index, long x) {
        constants$202.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buffer_size$VH() {
        return constants$202.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t buffer_size;
     * }
     */
    public static long buffer_size$get(MemorySegment seg) {
        return (long)constants$202.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t buffer_size;
     * }
     */
    public static void buffer_size$set(MemorySegment seg, long x) {
        constants$202.const$3.set(seg, x);
    }
    public static long buffer_size$get(MemorySegment seg, long index) {
        return (long)constants$202.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void buffer_size$set(MemorySegment seg, long index, long x) {
        constants$202.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle vbv_delay$VH() {
        return constants$202.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint64_t vbv_delay;
     * }
     */
    public static long vbv_delay$get(MemorySegment seg) {
        return (long)constants$202.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint64_t vbv_delay;
     * }
     */
    public static void vbv_delay$set(MemorySegment seg, long x) {
        constants$202.const$4.set(seg, x);
    }
    public static long vbv_delay$get(MemorySegment seg, long index) {
        return (long)constants$202.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void vbv_delay$set(MemorySegment seg, long index, long x) {
        constants$202.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


