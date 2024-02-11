// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVSubtitleRect {
 *     int x;
 *     int y;
 *     int w;
 *     int h;
 *     int nb_colors;
 *     uint8_t* data[4];
 *     int linesize[4];
 *     enum AVSubtitleType type;
 *     char* text;
 *     char* ass;
 *     int flags;
 * };
 * }
 */
public class AVSubtitleRect {

    public static MemoryLayout $LAYOUT() {
        return constants$244.const$0;
    }
    public static VarHandle x$VH() {
        return constants$244.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)constants$244.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        constants$244.const$1.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)constants$244.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        constants$244.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$244.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)constants$244.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        constants$244.const$2.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)constants$244.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        constants$244.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle w$VH() {
        return constants$244.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int w;
     * }
     */
    public static int w$get(MemorySegment seg) {
        return (int)constants$244.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int w;
     * }
     */
    public static void w$set(MemorySegment seg, int x) {
        constants$244.const$3.set(seg, x);
    }
    public static int w$get(MemorySegment seg, long index) {
        return (int)constants$244.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void w$set(MemorySegment seg, long index, int x) {
        constants$244.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle h$VH() {
        return constants$244.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int h;
     * }
     */
    public static int h$get(MemorySegment seg) {
        return (int)constants$244.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int h;
     * }
     */
    public static void h$set(MemorySegment seg, int x) {
        constants$244.const$4.set(seg, x);
    }
    public static int h$get(MemorySegment seg, long index) {
        return (int)constants$244.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void h$set(MemorySegment seg, long index, int x) {
        constants$244.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nb_colors$VH() {
        return constants$244.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nb_colors;
     * }
     */
    public static int nb_colors$get(MemorySegment seg) {
        return (int)constants$244.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nb_colors;
     * }
     */
    public static void nb_colors$set(MemorySegment seg, int x) {
        constants$244.const$5.set(seg, x);
    }
    public static int nb_colors$get(MemorySegment seg, long index) {
        return (int)constants$244.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void nb_colors$set(MemorySegment seg, long index, int x) {
        constants$244.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(24, 32);
    }
    public static MemorySegment linesize$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static VarHandle type$VH() {
        return constants$245.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVSubtitleType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$245.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVSubtitleType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$245.const$0.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$245.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$245.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle text$VH() {
        return constants$245.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* text;
     * }
     */
    public static MemorySegment text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$245.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* text;
     * }
     */
    public static void text$set(MemorySegment seg, MemorySegment x) {
        constants$245.const$1.set(seg, x);
    }
    public static MemorySegment text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$245.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$245.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ass$VH() {
        return constants$245.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* ass;
     * }
     */
    public static MemorySegment ass$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$245.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* ass;
     * }
     */
    public static void ass$set(MemorySegment seg, MemorySegment x) {
        constants$245.const$2.set(seg, x);
    }
    public static MemorySegment ass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$245.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ass$set(MemorySegment seg, long index, MemorySegment x) {
        constants$245.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$245.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$245.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$245.const$3.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$245.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$245.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


