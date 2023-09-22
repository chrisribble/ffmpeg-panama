// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVStream {
 *     int index;
 *     int id;
 *     void* priv_data;
 *     struct AVRational time_base;
 *     long start_time;
 *     long duration;
 *     long nb_frames;
 *     int disposition;
 *     enum AVDiscard discard;
 *     struct AVRational sample_aspect_ratio;
 *     struct AVDictionary* metadata;
 *     struct AVRational avg_frame_rate;
 *     struct AVPacket attached_pic;
 *     struct AVPacketSideData* side_data;
 *     int nb_side_data;
 *     int event_flags;
 *     struct AVRational r_frame_rate;
 *     struct AVCodecParameters* codecpar;
 *     int pts_wrap_bits;
 * };
 * }
 */
public class AVStream {

    public static MemoryLayout $LAYOUT() {
        return constants$306.const$0;
    }
    public static VarHandle index$VH() {
        return constants$306.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int index;
     * }
     */
    public static int index$get(MemorySegment seg) {
        return (int)constants$306.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int index;
     * }
     */
    public static void index$set(MemorySegment seg, int x) {
        constants$306.const$1.set(seg, x);
    }
    public static int index$get(MemorySegment seg, long index) {
        return (int)constants$306.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void index$set(MemorySegment seg, long index, int x) {
        constants$306.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle id$VH() {
        return constants$306.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int id;
     * }
     */
    public static int id$get(MemorySegment seg) {
        return (int)constants$306.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int id;
     * }
     */
    public static void id$set(MemorySegment seg, int x) {
        constants$306.const$2.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)constants$306.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        constants$306.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle priv_data$VH() {
        return constants$306.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* priv_data;
     * }
     */
    public static MemorySegment priv_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$306.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* priv_data;
     * }
     */
    public static void priv_data$set(MemorySegment seg, MemorySegment x) {
        constants$306.const$3.set(seg, x);
    }
    public static MemorySegment priv_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$306.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void priv_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$306.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment time_base$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static VarHandle start_time$VH() {
        return constants$306.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long start_time;
     * }
     */
    public static long start_time$get(MemorySegment seg) {
        return (long)constants$306.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long start_time;
     * }
     */
    public static void start_time$set(MemorySegment seg, long x) {
        constants$306.const$4.set(seg, x);
    }
    public static long start_time$get(MemorySegment seg, long index) {
        return (long)constants$306.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void start_time$set(MemorySegment seg, long index, long x) {
        constants$306.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle duration$VH() {
        return constants$306.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long duration;
     * }
     */
    public static long duration$get(MemorySegment seg) {
        return (long)constants$306.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long duration;
     * }
     */
    public static void duration$set(MemorySegment seg, long x) {
        constants$306.const$5.set(seg, x);
    }
    public static long duration$get(MemorySegment seg, long index) {
        return (long)constants$306.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void duration$set(MemorySegment seg, long index, long x) {
        constants$306.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nb_frames$VH() {
        return constants$307.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long nb_frames;
     * }
     */
    public static long nb_frames$get(MemorySegment seg) {
        return (long)constants$307.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long nb_frames;
     * }
     */
    public static void nb_frames$set(MemorySegment seg, long x) {
        constants$307.const$0.set(seg, x);
    }
    public static long nb_frames$get(MemorySegment seg, long index) {
        return (long)constants$307.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void nb_frames$set(MemorySegment seg, long index, long x) {
        constants$307.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle disposition$VH() {
        return constants$307.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int disposition;
     * }
     */
    public static int disposition$get(MemorySegment seg) {
        return (int)constants$307.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int disposition;
     * }
     */
    public static void disposition$set(MemorySegment seg, int x) {
        constants$307.const$1.set(seg, x);
    }
    public static int disposition$get(MemorySegment seg, long index) {
        return (int)constants$307.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void disposition$set(MemorySegment seg, long index, int x) {
        constants$307.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle discard$VH() {
        return constants$307.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVDiscard discard;
     * }
     */
    public static int discard$get(MemorySegment seg) {
        return (int)constants$307.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVDiscard discard;
     * }
     */
    public static void discard$set(MemorySegment seg, int x) {
        constants$307.const$2.set(seg, x);
    }
    public static int discard$get(MemorySegment seg, long index) {
        return (int)constants$307.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void discard$set(MemorySegment seg, long index, int x) {
        constants$307.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment sample_aspect_ratio$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    public static VarHandle metadata$VH() {
        return constants$307.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVDictionary* metadata;
     * }
     */
    public static MemorySegment metadata$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$307.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVDictionary* metadata;
     * }
     */
    public static void metadata$set(MemorySegment seg, MemorySegment x) {
        constants$307.const$3.set(seg, x);
    }
    public static MemorySegment metadata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$307.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void metadata$set(MemorySegment seg, long index, MemorySegment x) {
        constants$307.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment avg_frame_rate$slice(MemorySegment seg) {
        return seg.asSlice(72, 8);
    }
    public static MemorySegment attached_pic$slice(MemorySegment seg) {
        return seg.asSlice(80, 104);
    }
    public static VarHandle side_data$VH() {
        return constants$307.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVPacketSideData* side_data;
     * }
     */
    public static MemorySegment side_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$307.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVPacketSideData* side_data;
     * }
     */
    public static void side_data$set(MemorySegment seg, MemorySegment x) {
        constants$307.const$4.set(seg, x);
    }
    public static MemorySegment side_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$307.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void side_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$307.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nb_side_data$VH() {
        return constants$307.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nb_side_data;
     * }
     */
    public static int nb_side_data$get(MemorySegment seg) {
        return (int)constants$307.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nb_side_data;
     * }
     */
    public static void nb_side_data$set(MemorySegment seg, int x) {
        constants$307.const$5.set(seg, x);
    }
    public static int nb_side_data$get(MemorySegment seg, long index) {
        return (int)constants$307.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void nb_side_data$set(MemorySegment seg, long index, int x) {
        constants$307.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle event_flags$VH() {
        return constants$308.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int event_flags;
     * }
     */
    public static int event_flags$get(MemorySegment seg) {
        return (int)constants$308.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int event_flags;
     * }
     */
    public static void event_flags$set(MemorySegment seg, int x) {
        constants$308.const$0.set(seg, x);
    }
    public static int event_flags$get(MemorySegment seg, long index) {
        return (int)constants$308.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void event_flags$set(MemorySegment seg, long index, int x) {
        constants$308.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment r_frame_rate$slice(MemorySegment seg) {
        return seg.asSlice(200, 8);
    }
    public static VarHandle codecpar$VH() {
        return constants$308.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVCodecParameters* codecpar;
     * }
     */
    public static MemorySegment codecpar$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$308.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVCodecParameters* codecpar;
     * }
     */
    public static void codecpar$set(MemorySegment seg, MemorySegment x) {
        constants$308.const$1.set(seg, x);
    }
    public static MemorySegment codecpar$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$308.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void codecpar$set(MemorySegment seg, long index, MemorySegment x) {
        constants$308.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pts_wrap_bits$VH() {
        return constants$308.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pts_wrap_bits;
     * }
     */
    public static int pts_wrap_bits$get(MemorySegment seg) {
        return (int)constants$308.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pts_wrap_bits;
     * }
     */
    public static void pts_wrap_bits$set(MemorySegment seg, int x) {
        constants$308.const$2.set(seg, x);
    }
    public static int pts_wrap_bits$get(MemorySegment seg, long index) {
        return (int)constants$308.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pts_wrap_bits$set(MemorySegment seg, long index, int x) {
        constants$308.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


