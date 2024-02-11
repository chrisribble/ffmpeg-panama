// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVSubtitle {
 *     uint16_t format;
 *     uint32_t start_display_time;
 *     uint32_t end_display_time;
 *     unsigned int num_rects;
 *     AVSubtitleRect** rects;
 *     int64_t pts;
 * };
 * }
 */
public class AVSubtitle {

    public static MemoryLayout $LAYOUT() {
        return constants$244.const$5;
    }
    public static VarHandle format$VH() {
        return constants$245.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t format;
     * }
     */
    public static short format$get(MemorySegment seg) {
        return (short)constants$245.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t format;
     * }
     */
    public static void format$set(MemorySegment seg, short x) {
        constants$245.const$0.set(seg, x);
    }
    public static short format$get(MemorySegment seg, long index) {
        return (short)constants$245.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, short x) {
        constants$245.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle start_display_time$VH() {
        return constants$245.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t start_display_time;
     * }
     */
    public static int start_display_time$get(MemorySegment seg) {
        return (int)constants$245.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t start_display_time;
     * }
     */
    public static void start_display_time$set(MemorySegment seg, int x) {
        constants$245.const$1.set(seg, x);
    }
    public static int start_display_time$get(MemorySegment seg, long index) {
        return (int)constants$245.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void start_display_time$set(MemorySegment seg, long index, int x) {
        constants$245.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle end_display_time$VH() {
        return constants$245.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t end_display_time;
     * }
     */
    public static int end_display_time$get(MemorySegment seg) {
        return (int)constants$245.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t end_display_time;
     * }
     */
    public static void end_display_time$set(MemorySegment seg, int x) {
        constants$245.const$2.set(seg, x);
    }
    public static int end_display_time$get(MemorySegment seg, long index) {
        return (int)constants$245.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void end_display_time$set(MemorySegment seg, long index, int x) {
        constants$245.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle num_rects$VH() {
        return constants$245.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int num_rects;
     * }
     */
    public static int num_rects$get(MemorySegment seg) {
        return (int)constants$245.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int num_rects;
     * }
     */
    public static void num_rects$set(MemorySegment seg, int x) {
        constants$245.const$3.set(seg, x);
    }
    public static int num_rects$get(MemorySegment seg, long index) {
        return (int)constants$245.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void num_rects$set(MemorySegment seg, long index, int x) {
        constants$245.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rects$VH() {
        return constants$245.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AVSubtitleRect** rects;
     * }
     */
    public static MemorySegment rects$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$245.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AVSubtitleRect** rects;
     * }
     */
    public static void rects$set(MemorySegment seg, MemorySegment x) {
        constants$245.const$4.set(seg, x);
    }
    public static MemorySegment rects$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$245.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void rects$set(MemorySegment seg, long index, MemorySegment x) {
        constants$245.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pts$VH() {
        return constants$245.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static long pts$get(MemorySegment seg) {
        return (long)constants$245.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static void pts$set(MemorySegment seg, long x) {
        constants$245.const$5.set(seg, x);
    }
    public static long pts$get(MemorySegment seg, long index) {
        return (long)constants$245.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pts$set(MemorySegment seg, long index, long x) {
        constants$245.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


