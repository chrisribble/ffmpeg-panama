// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVProgram {
 *     int id;
 *     int flags;
 *     enum AVDiscard discard;
 *     unsigned int* stream_index;
 *     unsigned int nb_stream_indexes;
 *     struct AVDictionary* metadata;
 *     int program_num;
 *     int pmt_pid;
 *     int pcr_pid;
 *     int pmt_version;
 *     long start_time;
 *     long end_time;
 *     long pts_wrap_reference;
 *     int pts_wrap_behavior;
 * };
 * }
 */
public class AVProgram {

    public static MemoryLayout $LAYOUT() {
        return constants$308.const$5;
    }
    public static VarHandle id$VH() {
        return constants$309.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int id;
     * }
     */
    public static int id$get(MemorySegment seg) {
        return (int)constants$309.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int id;
     * }
     */
    public static void id$set(MemorySegment seg, int x) {
        constants$309.const$0.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)constants$309.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        constants$309.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$309.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$309.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$309.const$1.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$309.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$309.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle discard$VH() {
        return constants$309.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVDiscard discard;
     * }
     */
    public static int discard$get(MemorySegment seg) {
        return (int)constants$309.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVDiscard discard;
     * }
     */
    public static void discard$set(MemorySegment seg, int x) {
        constants$309.const$2.set(seg, x);
    }
    public static int discard$get(MemorySegment seg, long index) {
        return (int)constants$309.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void discard$set(MemorySegment seg, long index, int x) {
        constants$309.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle stream_index$VH() {
        return constants$309.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int* stream_index;
     * }
     */
    public static MemorySegment stream_index$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$309.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int* stream_index;
     * }
     */
    public static void stream_index$set(MemorySegment seg, MemorySegment x) {
        constants$309.const$3.set(seg, x);
    }
    public static MemorySegment stream_index$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$309.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void stream_index$set(MemorySegment seg, long index, MemorySegment x) {
        constants$309.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nb_stream_indexes$VH() {
        return constants$309.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int nb_stream_indexes;
     * }
     */
    public static int nb_stream_indexes$get(MemorySegment seg) {
        return (int)constants$309.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int nb_stream_indexes;
     * }
     */
    public static void nb_stream_indexes$set(MemorySegment seg, int x) {
        constants$309.const$4.set(seg, x);
    }
    public static int nb_stream_indexes$get(MemorySegment seg, long index) {
        return (int)constants$309.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void nb_stream_indexes$set(MemorySegment seg, long index, int x) {
        constants$309.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle metadata$VH() {
        return constants$309.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVDictionary* metadata;
     * }
     */
    public static MemorySegment metadata$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$309.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVDictionary* metadata;
     * }
     */
    public static void metadata$set(MemorySegment seg, MemorySegment x) {
        constants$309.const$5.set(seg, x);
    }
    public static MemorySegment metadata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$309.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void metadata$set(MemorySegment seg, long index, MemorySegment x) {
        constants$309.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle program_num$VH() {
        return constants$310.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int program_num;
     * }
     */
    public static int program_num$get(MemorySegment seg) {
        return (int)constants$310.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int program_num;
     * }
     */
    public static void program_num$set(MemorySegment seg, int x) {
        constants$310.const$0.set(seg, x);
    }
    public static int program_num$get(MemorySegment seg, long index) {
        return (int)constants$310.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void program_num$set(MemorySegment seg, long index, int x) {
        constants$310.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pmt_pid$VH() {
        return constants$310.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pmt_pid;
     * }
     */
    public static int pmt_pid$get(MemorySegment seg) {
        return (int)constants$310.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pmt_pid;
     * }
     */
    public static void pmt_pid$set(MemorySegment seg, int x) {
        constants$310.const$1.set(seg, x);
    }
    public static int pmt_pid$get(MemorySegment seg, long index) {
        return (int)constants$310.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pmt_pid$set(MemorySegment seg, long index, int x) {
        constants$310.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pcr_pid$VH() {
        return constants$310.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pcr_pid;
     * }
     */
    public static int pcr_pid$get(MemorySegment seg) {
        return (int)constants$310.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pcr_pid;
     * }
     */
    public static void pcr_pid$set(MemorySegment seg, int x) {
        constants$310.const$2.set(seg, x);
    }
    public static int pcr_pid$get(MemorySegment seg, long index) {
        return (int)constants$310.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pcr_pid$set(MemorySegment seg, long index, int x) {
        constants$310.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pmt_version$VH() {
        return constants$310.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pmt_version;
     * }
     */
    public static int pmt_version$get(MemorySegment seg) {
        return (int)constants$310.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pmt_version;
     * }
     */
    public static void pmt_version$set(MemorySegment seg, int x) {
        constants$310.const$3.set(seg, x);
    }
    public static int pmt_version$get(MemorySegment seg, long index) {
        return (int)constants$310.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pmt_version$set(MemorySegment seg, long index, int x) {
        constants$310.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle start_time$VH() {
        return constants$310.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long start_time;
     * }
     */
    public static long start_time$get(MemorySegment seg) {
        return (long)constants$310.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long start_time;
     * }
     */
    public static void start_time$set(MemorySegment seg, long x) {
        constants$310.const$4.set(seg, x);
    }
    public static long start_time$get(MemorySegment seg, long index) {
        return (long)constants$310.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void start_time$set(MemorySegment seg, long index, long x) {
        constants$310.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle end_time$VH() {
        return constants$310.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long end_time;
     * }
     */
    public static long end_time$get(MemorySegment seg) {
        return (long)constants$310.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long end_time;
     * }
     */
    public static void end_time$set(MemorySegment seg, long x) {
        constants$310.const$5.set(seg, x);
    }
    public static long end_time$get(MemorySegment seg, long index) {
        return (long)constants$310.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void end_time$set(MemorySegment seg, long index, long x) {
        constants$310.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pts_wrap_reference$VH() {
        return constants$311.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long pts_wrap_reference;
     * }
     */
    public static long pts_wrap_reference$get(MemorySegment seg) {
        return (long)constants$311.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long pts_wrap_reference;
     * }
     */
    public static void pts_wrap_reference$set(MemorySegment seg, long x) {
        constants$311.const$0.set(seg, x);
    }
    public static long pts_wrap_reference$get(MemorySegment seg, long index) {
        return (long)constants$311.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pts_wrap_reference$set(MemorySegment seg, long index, long x) {
        constants$311.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pts_wrap_behavior$VH() {
        return constants$311.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pts_wrap_behavior;
     * }
     */
    public static int pts_wrap_behavior$get(MemorySegment seg) {
        return (int)constants$311.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pts_wrap_behavior;
     * }
     */
    public static void pts_wrap_behavior$set(MemorySegment seg, int x) {
        constants$311.const$1.set(seg, x);
    }
    public static int pts_wrap_behavior$get(MemorySegment seg, long index) {
        return (int)constants$311.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pts_wrap_behavior$set(MemorySegment seg, long index, int x) {
        constants$311.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


