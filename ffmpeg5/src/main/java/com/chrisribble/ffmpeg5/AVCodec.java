// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVCodec {
 *     char* name;
 *     char* long_name;
 *     enum AVMediaType type;
 *     enum AVCodecID id;
 *     int capabilities;
 *     unsigned char max_lowres;
 *     struct AVRational* supported_framerates;
 *     enum AVPixelFormat* pix_fmts;
 *     int* supported_samplerates;
 *     enum AVSampleFormat* sample_fmts;
 *     unsigned long* channel_layouts;
 *     struct AVClass* priv_class;
 *     struct AVProfile* profiles;
 *     char* wrapper_name;
 *     struct AVChannelLayout* ch_layouts;
 * };
 * }
 */
public class AVCodec {

    public static MemoryLayout $LAYOUT() {
        return constants$186.const$2;
    }
    public static VarHandle name$VH() {
        return constants$186.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$186.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$186.const$3.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$186.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$186.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle long_name$VH() {
        return constants$186.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* long_name;
     * }
     */
    public static MemorySegment long_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$186.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* long_name;
     * }
     */
    public static void long_name$set(MemorySegment seg, MemorySegment x) {
        constants$186.const$4.set(seg, x);
    }
    public static MemorySegment long_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$186.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void long_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$186.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle type$VH() {
        return constants$186.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVMediaType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$186.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVMediaType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$186.const$5.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$186.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$186.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle id$VH() {
        return constants$187.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVCodecID id;
     * }
     */
    public static int id$get(MemorySegment seg) {
        return (int)constants$187.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVCodecID id;
     * }
     */
    public static void id$set(MemorySegment seg, int x) {
        constants$187.const$0.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)constants$187.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        constants$187.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle capabilities$VH() {
        return constants$187.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int capabilities;
     * }
     */
    public static int capabilities$get(MemorySegment seg) {
        return (int)constants$187.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int capabilities;
     * }
     */
    public static void capabilities$set(MemorySegment seg, int x) {
        constants$187.const$1.set(seg, x);
    }
    public static int capabilities$get(MemorySegment seg, long index) {
        return (int)constants$187.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void capabilities$set(MemorySegment seg, long index, int x) {
        constants$187.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_lowres$VH() {
        return constants$187.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char max_lowres;
     * }
     */
    public static byte max_lowres$get(MemorySegment seg) {
        return (byte)constants$187.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char max_lowres;
     * }
     */
    public static void max_lowres$set(MemorySegment seg, byte x) {
        constants$187.const$2.set(seg, x);
    }
    public static byte max_lowres$get(MemorySegment seg, long index) {
        return (byte)constants$187.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void max_lowres$set(MemorySegment seg, long index, byte x) {
        constants$187.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle supported_framerates$VH() {
        return constants$187.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVRational* supported_framerates;
     * }
     */
    public static MemorySegment supported_framerates$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$187.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVRational* supported_framerates;
     * }
     */
    public static void supported_framerates$set(MemorySegment seg, MemorySegment x) {
        constants$187.const$3.set(seg, x);
    }
    public static MemorySegment supported_framerates$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$187.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void supported_framerates$set(MemorySegment seg, long index, MemorySegment x) {
        constants$187.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pix_fmts$VH() {
        return constants$187.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPixelFormat* pix_fmts;
     * }
     */
    public static MemorySegment pix_fmts$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$187.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPixelFormat* pix_fmts;
     * }
     */
    public static void pix_fmts$set(MemorySegment seg, MemorySegment x) {
        constants$187.const$4.set(seg, x);
    }
    public static MemorySegment pix_fmts$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$187.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pix_fmts$set(MemorySegment seg, long index, MemorySegment x) {
        constants$187.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle supported_samplerates$VH() {
        return constants$187.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int* supported_samplerates;
     * }
     */
    public static MemorySegment supported_samplerates$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$187.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int* supported_samplerates;
     * }
     */
    public static void supported_samplerates$set(MemorySegment seg, MemorySegment x) {
        constants$187.const$5.set(seg, x);
    }
    public static MemorySegment supported_samplerates$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$187.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void supported_samplerates$set(MemorySegment seg, long index, MemorySegment x) {
        constants$187.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle sample_fmts$VH() {
        return constants$188.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVSampleFormat* sample_fmts;
     * }
     */
    public static MemorySegment sample_fmts$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$188.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVSampleFormat* sample_fmts;
     * }
     */
    public static void sample_fmts$set(MemorySegment seg, MemorySegment x) {
        constants$188.const$0.set(seg, x);
    }
    public static MemorySegment sample_fmts$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$188.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void sample_fmts$set(MemorySegment seg, long index, MemorySegment x) {
        constants$188.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle channel_layouts$VH() {
        return constants$188.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long* channel_layouts;
     * }
     */
    public static MemorySegment channel_layouts$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$188.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long* channel_layouts;
     * }
     */
    public static void channel_layouts$set(MemorySegment seg, MemorySegment x) {
        constants$188.const$1.set(seg, x);
    }
    public static MemorySegment channel_layouts$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$188.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void channel_layouts$set(MemorySegment seg, long index, MemorySegment x) {
        constants$188.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle priv_class$VH() {
        return constants$188.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVClass* priv_class;
     * }
     */
    public static MemorySegment priv_class$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$188.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVClass* priv_class;
     * }
     */
    public static void priv_class$set(MemorySegment seg, MemorySegment x) {
        constants$188.const$2.set(seg, x);
    }
    public static MemorySegment priv_class$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$188.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void priv_class$set(MemorySegment seg, long index, MemorySegment x) {
        constants$188.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle profiles$VH() {
        return constants$188.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVProfile* profiles;
     * }
     */
    public static MemorySegment profiles$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$188.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVProfile* profiles;
     * }
     */
    public static void profiles$set(MemorySegment seg, MemorySegment x) {
        constants$188.const$3.set(seg, x);
    }
    public static MemorySegment profiles$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$188.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void profiles$set(MemorySegment seg, long index, MemorySegment x) {
        constants$188.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wrapper_name$VH() {
        return constants$188.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* wrapper_name;
     * }
     */
    public static MemorySegment wrapper_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$188.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* wrapper_name;
     * }
     */
    public static void wrapper_name$set(MemorySegment seg, MemorySegment x) {
        constants$188.const$4.set(seg, x);
    }
    public static MemorySegment wrapper_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$188.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void wrapper_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$188.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ch_layouts$VH() {
        return constants$188.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVChannelLayout* ch_layouts;
     * }
     */
    public static MemorySegment ch_layouts$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$188.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVChannelLayout* ch_layouts;
     * }
     */
    public static void ch_layouts$set(MemorySegment seg, MemorySegment x) {
        constants$188.const$5.set(seg, x);
    }
    public static MemorySegment ch_layouts$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$188.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ch_layouts$set(MemorySegment seg, long index, MemorySegment x) {
        constants$188.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


