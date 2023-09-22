// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVChapter {
 *     long id;
 *     struct AVRational time_base;
 *     long start;
 *     long end;
 *     struct AVDictionary* metadata;
 * };
 * }
 */
public class AVChapter {

    public static MemoryLayout $LAYOUT() {
        return constants$311.const$2;
    }
    public static VarHandle id$VH() {
        return constants$311.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long id;
     * }
     */
    public static long id$get(MemorySegment seg) {
        return (long)constants$311.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long id;
     * }
     */
    public static void id$set(MemorySegment seg, long x) {
        constants$311.const$3.set(seg, x);
    }
    public static long id$get(MemorySegment seg, long index) {
        return (long)constants$311.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, long x) {
        constants$311.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment time_base$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static VarHandle start$VH() {
        return constants$311.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long start;
     * }
     */
    public static long start$get(MemorySegment seg) {
        return (long)constants$311.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long start;
     * }
     */
    public static void start$set(MemorySegment seg, long x) {
        constants$311.const$4.set(seg, x);
    }
    public static long start$get(MemorySegment seg, long index) {
        return (long)constants$311.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void start$set(MemorySegment seg, long index, long x) {
        constants$311.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle end$VH() {
        return constants$311.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long end;
     * }
     */
    public static long end$get(MemorySegment seg) {
        return (long)constants$311.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long end;
     * }
     */
    public static void end$set(MemorySegment seg, long x) {
        constants$311.const$5.set(seg, x);
    }
    public static long end$get(MemorySegment seg, long index) {
        return (long)constants$311.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void end$set(MemorySegment seg, long index, long x) {
        constants$311.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle metadata$VH() {
        return constants$312.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVDictionary* metadata;
     * }
     */
    public static MemorySegment metadata$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$312.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVDictionary* metadata;
     * }
     */
    public static void metadata$set(MemorySegment seg, MemorySegment x) {
        constants$312.const$0.set(seg, x);
    }
    public static MemorySegment metadata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$312.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void metadata$set(MemorySegment seg, long index, MemorySegment x) {
        constants$312.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


