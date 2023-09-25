// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVCodecParserContext {
 *     void* priv_data;
 *     struct AVCodecParser* parser;
 *     int64_t frame_offset;
 *     int64_t cur_offset;
 *     int64_t next_frame_offset;
 *     int pict_type;
 *     int repeat_pict;
 *     int64_t pts;
 *     int64_t dts;
 *     int64_t last_pts;
 *     int64_t last_dts;
 *     int fetch_timestamp;
 *     int cur_frame_start_index;
 *     int64_t cur_frame_offset[4];
 *     int64_t cur_frame_pts[4];
 *     int64_t cur_frame_dts[4];
 *     int flags;
 *     int64_t offset;
 *     int64_t cur_frame_end[4];
 *     int key_frame;
 *     int dts_sync_point;
 *     int dts_ref_dts_delta;
 *     int pts_dts_delta;
 *     int64_t cur_frame_pos[4];
 *     int64_t pos;
 *     int64_t last_pos;
 *     int duration;
 *     enum AVFieldOrder field_order;
 *     enum AVPictureStructure picture_structure;
 *     int output_picture_number;
 *     int width;
 *     int height;
 *     int coded_width;
 *     int coded_height;
 *     int format;
 * };
 * }
 */
public class AVCodecParserContext {

    public static MemoryLayout $LAYOUT() {
        return constants$248.const$0;
    }
    public static VarHandle priv_data$VH() {
        return constants$248.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* priv_data;
     * }
     */
    public static MemorySegment priv_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$248.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* priv_data;
     * }
     */
    public static void priv_data$set(MemorySegment seg, MemorySegment x) {
        constants$248.const$1.set(seg, x);
    }
    public static MemorySegment priv_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$248.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void priv_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$248.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle parser$VH() {
        return constants$248.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVCodecParser* parser;
     * }
     */
    public static MemorySegment parser$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$248.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVCodecParser* parser;
     * }
     */
    public static void parser$set(MemorySegment seg, MemorySegment x) {
        constants$248.const$2.set(seg, x);
    }
    public static MemorySegment parser$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$248.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void parser$set(MemorySegment seg, long index, MemorySegment x) {
        constants$248.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle frame_offset$VH() {
        return constants$248.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t frame_offset;
     * }
     */
    public static long frame_offset$get(MemorySegment seg) {
        return (long)constants$248.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t frame_offset;
     * }
     */
    public static void frame_offset$set(MemorySegment seg, long x) {
        constants$248.const$3.set(seg, x);
    }
    public static long frame_offset$get(MemorySegment seg, long index) {
        return (long)constants$248.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void frame_offset$set(MemorySegment seg, long index, long x) {
        constants$248.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cur_offset$VH() {
        return constants$248.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t cur_offset;
     * }
     */
    public static long cur_offset$get(MemorySegment seg) {
        return (long)constants$248.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t cur_offset;
     * }
     */
    public static void cur_offset$set(MemorySegment seg, long x) {
        constants$248.const$4.set(seg, x);
    }
    public static long cur_offset$get(MemorySegment seg, long index) {
        return (long)constants$248.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cur_offset$set(MemorySegment seg, long index, long x) {
        constants$248.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle next_frame_offset$VH() {
        return constants$248.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t next_frame_offset;
     * }
     */
    public static long next_frame_offset$get(MemorySegment seg) {
        return (long)constants$248.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t next_frame_offset;
     * }
     */
    public static void next_frame_offset$set(MemorySegment seg, long x) {
        constants$248.const$5.set(seg, x);
    }
    public static long next_frame_offset$get(MemorySegment seg, long index) {
        return (long)constants$248.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void next_frame_offset$set(MemorySegment seg, long index, long x) {
        constants$248.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pict_type$VH() {
        return constants$249.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pict_type;
     * }
     */
    public static int pict_type$get(MemorySegment seg) {
        return (int)constants$249.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pict_type;
     * }
     */
    public static void pict_type$set(MemorySegment seg, int x) {
        constants$249.const$0.set(seg, x);
    }
    public static int pict_type$get(MemorySegment seg, long index) {
        return (int)constants$249.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pict_type$set(MemorySegment seg, long index, int x) {
        constants$249.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle repeat_pict$VH() {
        return constants$249.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int repeat_pict;
     * }
     */
    public static int repeat_pict$get(MemorySegment seg) {
        return (int)constants$249.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int repeat_pict;
     * }
     */
    public static void repeat_pict$set(MemorySegment seg, int x) {
        constants$249.const$1.set(seg, x);
    }
    public static int repeat_pict$get(MemorySegment seg, long index) {
        return (int)constants$249.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void repeat_pict$set(MemorySegment seg, long index, int x) {
        constants$249.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pts$VH() {
        return constants$249.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static long pts$get(MemorySegment seg) {
        return (long)constants$249.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t pts;
     * }
     */
    public static void pts$set(MemorySegment seg, long x) {
        constants$249.const$2.set(seg, x);
    }
    public static long pts$get(MemorySegment seg, long index) {
        return (long)constants$249.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pts$set(MemorySegment seg, long index, long x) {
        constants$249.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dts$VH() {
        return constants$249.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t dts;
     * }
     */
    public static long dts$get(MemorySegment seg) {
        return (long)constants$249.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t dts;
     * }
     */
    public static void dts$set(MemorySegment seg, long x) {
        constants$249.const$3.set(seg, x);
    }
    public static long dts$get(MemorySegment seg, long index) {
        return (long)constants$249.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dts$set(MemorySegment seg, long index, long x) {
        constants$249.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle last_pts$VH() {
        return constants$249.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t last_pts;
     * }
     */
    public static long last_pts$get(MemorySegment seg) {
        return (long)constants$249.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t last_pts;
     * }
     */
    public static void last_pts$set(MemorySegment seg, long x) {
        constants$249.const$4.set(seg, x);
    }
    public static long last_pts$get(MemorySegment seg, long index) {
        return (long)constants$249.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void last_pts$set(MemorySegment seg, long index, long x) {
        constants$249.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle last_dts$VH() {
        return constants$249.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t last_dts;
     * }
     */
    public static long last_dts$get(MemorySegment seg) {
        return (long)constants$249.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t last_dts;
     * }
     */
    public static void last_dts$set(MemorySegment seg, long x) {
        constants$249.const$5.set(seg, x);
    }
    public static long last_dts$get(MemorySegment seg, long index) {
        return (long)constants$249.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void last_dts$set(MemorySegment seg, long index, long x) {
        constants$249.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fetch_timestamp$VH() {
        return constants$250.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int fetch_timestamp;
     * }
     */
    public static int fetch_timestamp$get(MemorySegment seg) {
        return (int)constants$250.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int fetch_timestamp;
     * }
     */
    public static void fetch_timestamp$set(MemorySegment seg, int x) {
        constants$250.const$0.set(seg, x);
    }
    public static int fetch_timestamp$get(MemorySegment seg, long index) {
        return (int)constants$250.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void fetch_timestamp$set(MemorySegment seg, long index, int x) {
        constants$250.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cur_frame_start_index$VH() {
        return constants$250.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cur_frame_start_index;
     * }
     */
    public static int cur_frame_start_index$get(MemorySegment seg) {
        return (int)constants$250.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cur_frame_start_index;
     * }
     */
    public static void cur_frame_start_index$set(MemorySegment seg, int x) {
        constants$250.const$1.set(seg, x);
    }
    public static int cur_frame_start_index$get(MemorySegment seg, long index) {
        return (int)constants$250.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cur_frame_start_index$set(MemorySegment seg, long index, int x) {
        constants$250.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cur_frame_offset$slice(MemorySegment seg) {
        return seg.asSlice(88, 32);
    }
    public static MemorySegment cur_frame_pts$slice(MemorySegment seg) {
        return seg.asSlice(120, 32);
    }
    public static MemorySegment cur_frame_dts$slice(MemorySegment seg) {
        return seg.asSlice(152, 32);
    }
    public static VarHandle flags$VH() {
        return constants$250.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$250.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$250.const$2.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$250.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$250.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle offset$VH() {
        return constants$250.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t offset;
     * }
     */
    public static long offset$get(MemorySegment seg) {
        return (long)constants$250.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t offset;
     * }
     */
    public static void offset$set(MemorySegment seg, long x) {
        constants$250.const$3.set(seg, x);
    }
    public static long offset$get(MemorySegment seg, long index) {
        return (long)constants$250.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, long x) {
        constants$250.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cur_frame_end$slice(MemorySegment seg) {
        return seg.asSlice(200, 32);
    }
    public static VarHandle key_frame$VH() {
        return constants$250.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int key_frame;
     * }
     */
    public static int key_frame$get(MemorySegment seg) {
        return (int)constants$250.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int key_frame;
     * }
     */
    public static void key_frame$set(MemorySegment seg, int x) {
        constants$250.const$4.set(seg, x);
    }
    public static int key_frame$get(MemorySegment seg, long index) {
        return (int)constants$250.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void key_frame$set(MemorySegment seg, long index, int x) {
        constants$250.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dts_sync_point$VH() {
        return constants$250.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dts_sync_point;
     * }
     */
    public static int dts_sync_point$get(MemorySegment seg) {
        return (int)constants$250.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dts_sync_point;
     * }
     */
    public static void dts_sync_point$set(MemorySegment seg, int x) {
        constants$250.const$5.set(seg, x);
    }
    public static int dts_sync_point$get(MemorySegment seg, long index) {
        return (int)constants$250.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dts_sync_point$set(MemorySegment seg, long index, int x) {
        constants$250.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dts_ref_dts_delta$VH() {
        return constants$251.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dts_ref_dts_delta;
     * }
     */
    public static int dts_ref_dts_delta$get(MemorySegment seg) {
        return (int)constants$251.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dts_ref_dts_delta;
     * }
     */
    public static void dts_ref_dts_delta$set(MemorySegment seg, int x) {
        constants$251.const$0.set(seg, x);
    }
    public static int dts_ref_dts_delta$get(MemorySegment seg, long index) {
        return (int)constants$251.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dts_ref_dts_delta$set(MemorySegment seg, long index, int x) {
        constants$251.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pts_dts_delta$VH() {
        return constants$251.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pts_dts_delta;
     * }
     */
    public static int pts_dts_delta$get(MemorySegment seg) {
        return (int)constants$251.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pts_dts_delta;
     * }
     */
    public static void pts_dts_delta$set(MemorySegment seg, int x) {
        constants$251.const$1.set(seg, x);
    }
    public static int pts_dts_delta$get(MemorySegment seg, long index) {
        return (int)constants$251.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pts_dts_delta$set(MemorySegment seg, long index, int x) {
        constants$251.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cur_frame_pos$slice(MemorySegment seg) {
        return seg.asSlice(248, 32);
    }
    public static VarHandle pos$VH() {
        return constants$251.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t pos;
     * }
     */
    public static long pos$get(MemorySegment seg) {
        return (long)constants$251.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t pos;
     * }
     */
    public static void pos$set(MemorySegment seg, long x) {
        constants$251.const$2.set(seg, x);
    }
    public static long pos$get(MemorySegment seg, long index) {
        return (long)constants$251.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pos$set(MemorySegment seg, long index, long x) {
        constants$251.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle last_pos$VH() {
        return constants$251.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t last_pos;
     * }
     */
    public static long last_pos$get(MemorySegment seg) {
        return (long)constants$251.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t last_pos;
     * }
     */
    public static void last_pos$set(MemorySegment seg, long x) {
        constants$251.const$3.set(seg, x);
    }
    public static long last_pos$get(MemorySegment seg, long index) {
        return (long)constants$251.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void last_pos$set(MemorySegment seg, long index, long x) {
        constants$251.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle duration$VH() {
        return constants$251.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int duration;
     * }
     */
    public static int duration$get(MemorySegment seg) {
        return (int)constants$251.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int duration;
     * }
     */
    public static void duration$set(MemorySegment seg, int x) {
        constants$251.const$4.set(seg, x);
    }
    public static int duration$get(MemorySegment seg, long index) {
        return (int)constants$251.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void duration$set(MemorySegment seg, long index, int x) {
        constants$251.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle field_order$VH() {
        return constants$251.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVFieldOrder field_order;
     * }
     */
    public static int field_order$get(MemorySegment seg) {
        return (int)constants$251.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVFieldOrder field_order;
     * }
     */
    public static void field_order$set(MemorySegment seg, int x) {
        constants$251.const$5.set(seg, x);
    }
    public static int field_order$get(MemorySegment seg, long index) {
        return (int)constants$251.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void field_order$set(MemorySegment seg, long index, int x) {
        constants$251.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle picture_structure$VH() {
        return constants$252.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum AVPictureStructure picture_structure;
     * }
     */
    public static int picture_structure$get(MemorySegment seg) {
        return (int)constants$252.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum AVPictureStructure picture_structure;
     * }
     */
    public static void picture_structure$set(MemorySegment seg, int x) {
        constants$252.const$0.set(seg, x);
    }
    public static int picture_structure$get(MemorySegment seg, long index) {
        return (int)constants$252.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void picture_structure$set(MemorySegment seg, long index, int x) {
        constants$252.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle output_picture_number$VH() {
        return constants$252.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int output_picture_number;
     * }
     */
    public static int output_picture_number$get(MemorySegment seg) {
        return (int)constants$252.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int output_picture_number;
     * }
     */
    public static void output_picture_number$set(MemorySegment seg, int x) {
        constants$252.const$1.set(seg, x);
    }
    public static int output_picture_number$get(MemorySegment seg, long index) {
        return (int)constants$252.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void output_picture_number$set(MemorySegment seg, long index, int x) {
        constants$252.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle width$VH() {
        return constants$252.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)constants$252.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        constants$252.const$2.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)constants$252.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        constants$252.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle height$VH() {
        return constants$252.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)constants$252.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        constants$252.const$3.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)constants$252.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        constants$252.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle coded_width$VH() {
        return constants$252.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int coded_width;
     * }
     */
    public static int coded_width$get(MemorySegment seg) {
        return (int)constants$252.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int coded_width;
     * }
     */
    public static void coded_width$set(MemorySegment seg, int x) {
        constants$252.const$4.set(seg, x);
    }
    public static int coded_width$get(MemorySegment seg, long index) {
        return (int)constants$252.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void coded_width$set(MemorySegment seg, long index, int x) {
        constants$252.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle coded_height$VH() {
        return constants$252.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int coded_height;
     * }
     */
    public static int coded_height$get(MemorySegment seg) {
        return (int)constants$252.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int coded_height;
     * }
     */
    public static void coded_height$set(MemorySegment seg, int x) {
        constants$252.const$5.set(seg, x);
    }
    public static int coded_height$get(MemorySegment seg, long index) {
        return (int)constants$252.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void coded_height$set(MemorySegment seg, long index, int x) {
        constants$252.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle format$VH() {
        return constants$253.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int format;
     * }
     */
    public static int format$get(MemorySegment seg) {
        return (int)constants$253.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int format;
     * }
     */
    public static void format$set(MemorySegment seg, int x) {
        constants$253.const$0.set(seg, x);
    }
    public static int format$get(MemorySegment seg, long index) {
        return (int)constants$253.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void format$set(MemorySegment seg, long index, int x) {
        constants$253.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


