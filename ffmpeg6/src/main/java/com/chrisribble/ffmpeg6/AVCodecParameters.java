// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct AVCodecParameters {
 *     enum AVMediaType codec_type;
 *     enum AVCodecID codec_id;
 *     uint32_t codec_tag;
 *     uint8_t *extradata;
 *     int extradata_size;
 *     int format;
 *     int64_t bit_rate;
 *     int bits_per_coded_sample;
 *     int bits_per_raw_sample;
 *     int profile;
 *     int level;
 *     int width;
 *     int height;
 *     AVRational sample_aspect_ratio;
 *     enum AVFieldOrder field_order;
 *     enum AVColorRange color_range;
 *     enum AVColorPrimaries color_primaries;
 *     enum AVColorTransferCharacteristic color_trc;
 *     enum AVColorSpace color_space;
 *     enum AVChromaLocation chroma_location;
 *     int video_delay;
 *     uint64_t channel_layout;
 *     int channels;
 *     int sample_rate;
 *     int block_align;
 *     int frame_size;
 *     int initial_padding;
 *     int trailing_padding;
 *     int seek_preroll;
 *     AVChannelLayout ch_layout;
 * }
 * }
 */
public class AVCodecParameters {

    AVCodecParameters() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_INT.withName("codec_type"),
        FFmpeg.C_INT.withName("codec_id"),
        FFmpeg.C_INT.withName("codec_tag"),
        MemoryLayout.paddingLayout(4),
        FFmpeg.C_POINTER.withName("extradata"),
        FFmpeg.C_INT.withName("extradata_size"),
        FFmpeg.C_INT.withName("format"),
        FFmpeg.C_LONG.withName("bit_rate"),
        FFmpeg.C_INT.withName("bits_per_coded_sample"),
        FFmpeg.C_INT.withName("bits_per_raw_sample"),
        FFmpeg.C_INT.withName("profile"),
        FFmpeg.C_INT.withName("level"),
        FFmpeg.C_INT.withName("width"),
        FFmpeg.C_INT.withName("height"),
        AVRational.layout().withName("sample_aspect_ratio"),
        FFmpeg.C_INT.withName("field_order"),
        FFmpeg.C_INT.withName("color_range"),
        FFmpeg.C_INT.withName("color_primaries"),
        FFmpeg.C_INT.withName("color_trc"),
        FFmpeg.C_INT.withName("color_space"),
        FFmpeg.C_INT.withName("chroma_location"),
        FFmpeg.C_INT.withName("video_delay"),
        MemoryLayout.paddingLayout(4),
        FFmpeg.C_LONG.withName("channel_layout"),
        FFmpeg.C_INT.withName("channels"),
        FFmpeg.C_INT.withName("sample_rate"),
        FFmpeg.C_INT.withName("block_align"),
        FFmpeg.C_INT.withName("frame_size"),
        FFmpeg.C_INT.withName("initial_padding"),
        FFmpeg.C_INT.withName("trailing_padding"),
        FFmpeg.C_INT.withName("seek_preroll"),
        MemoryLayout.paddingLayout(4),
        AVChannelLayout.layout().withName("ch_layout")
    ).withName("AVCodecParameters");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt codec_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("codec_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVMediaType codec_type
     * }
     */
    public static final OfInt codec_type$layout() {
        return codec_type$LAYOUT;
    }

    private static final long codec_type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVMediaType codec_type
     * }
     */
    public static final long codec_type$offset() {
        return codec_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVMediaType codec_type
     * }
     */
    public static int codec_type(MemorySegment struct) {
        return struct.get(codec_type$LAYOUT, codec_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVMediaType codec_type
     * }
     */
    public static void codec_type(MemorySegment struct, int fieldValue) {
        struct.set(codec_type$LAYOUT, codec_type$OFFSET, fieldValue);
    }

    private static final OfInt codec_id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("codec_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVCodecID codec_id
     * }
     */
    public static final OfInt codec_id$layout() {
        return codec_id$LAYOUT;
    }

    private static final long codec_id$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVCodecID codec_id
     * }
     */
    public static final long codec_id$offset() {
        return codec_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVCodecID codec_id
     * }
     */
    public static int codec_id(MemorySegment struct) {
        return struct.get(codec_id$LAYOUT, codec_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVCodecID codec_id
     * }
     */
    public static void codec_id(MemorySegment struct, int fieldValue) {
        struct.set(codec_id$LAYOUT, codec_id$OFFSET, fieldValue);
    }

    private static final OfInt codec_tag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("codec_tag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t codec_tag
     * }
     */
    public static final OfInt codec_tag$layout() {
        return codec_tag$LAYOUT;
    }

    private static final long codec_tag$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t codec_tag
     * }
     */
    public static final long codec_tag$offset() {
        return codec_tag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t codec_tag
     * }
     */
    public static int codec_tag(MemorySegment struct) {
        return struct.get(codec_tag$LAYOUT, codec_tag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t codec_tag
     * }
     */
    public static void codec_tag(MemorySegment struct, int fieldValue) {
        struct.set(codec_tag$LAYOUT, codec_tag$OFFSET, fieldValue);
    }

    private static final AddressLayout extradata$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("extradata"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t *extradata
     * }
     */
    public static final AddressLayout extradata$layout() {
        return extradata$LAYOUT;
    }

    private static final long extradata$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t *extradata
     * }
     */
    public static final long extradata$offset() {
        return extradata$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t *extradata
     * }
     */
    public static MemorySegment extradata(MemorySegment struct) {
        return struct.get(extradata$LAYOUT, extradata$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t *extradata
     * }
     */
    public static void extradata(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(extradata$LAYOUT, extradata$OFFSET, fieldValue);
    }

    private static final OfInt extradata_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("extradata_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int extradata_size
     * }
     */
    public static final OfInt extradata_size$layout() {
        return extradata_size$LAYOUT;
    }

    private static final long extradata_size$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int extradata_size
     * }
     */
    public static final long extradata_size$offset() {
        return extradata_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int extradata_size
     * }
     */
    public static int extradata_size(MemorySegment struct) {
        return struct.get(extradata_size$LAYOUT, extradata_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int extradata_size
     * }
     */
    public static void extradata_size(MemorySegment struct, int fieldValue) {
        struct.set(extradata_size$LAYOUT, extradata_size$OFFSET, fieldValue);
    }

    private static final OfInt format$LAYOUT = (OfInt)$LAYOUT.select(groupElement("format"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static final OfInt format$layout() {
        return format$LAYOUT;
    }

    private static final long format$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static final long format$offset() {
        return format$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static int format(MemorySegment struct) {
        return struct.get(format$LAYOUT, format$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static void format(MemorySegment struct, int fieldValue) {
        struct.set(format$LAYOUT, format$OFFSET, fieldValue);
    }

    private static final OfLong bit_rate$LAYOUT = (OfLong)$LAYOUT.select(groupElement("bit_rate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t bit_rate
     * }
     */
    public static final OfLong bit_rate$layout() {
        return bit_rate$LAYOUT;
    }

    private static final long bit_rate$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t bit_rate
     * }
     */
    public static final long bit_rate$offset() {
        return bit_rate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t bit_rate
     * }
     */
    public static long bit_rate(MemorySegment struct) {
        return struct.get(bit_rate$LAYOUT, bit_rate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t bit_rate
     * }
     */
    public static void bit_rate(MemorySegment struct, long fieldValue) {
        struct.set(bit_rate$LAYOUT, bit_rate$OFFSET, fieldValue);
    }

    private static final OfInt bits_per_coded_sample$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bits_per_coded_sample"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int bits_per_coded_sample
     * }
     */
    public static final OfInt bits_per_coded_sample$layout() {
        return bits_per_coded_sample$LAYOUT;
    }

    private static final long bits_per_coded_sample$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int bits_per_coded_sample
     * }
     */
    public static final long bits_per_coded_sample$offset() {
        return bits_per_coded_sample$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int bits_per_coded_sample
     * }
     */
    public static int bits_per_coded_sample(MemorySegment struct) {
        return struct.get(bits_per_coded_sample$LAYOUT, bits_per_coded_sample$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int bits_per_coded_sample
     * }
     */
    public static void bits_per_coded_sample(MemorySegment struct, int fieldValue) {
        struct.set(bits_per_coded_sample$LAYOUT, bits_per_coded_sample$OFFSET, fieldValue);
    }

    private static final OfInt bits_per_raw_sample$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bits_per_raw_sample"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int bits_per_raw_sample
     * }
     */
    public static final OfInt bits_per_raw_sample$layout() {
        return bits_per_raw_sample$LAYOUT;
    }

    private static final long bits_per_raw_sample$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int bits_per_raw_sample
     * }
     */
    public static final long bits_per_raw_sample$offset() {
        return bits_per_raw_sample$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int bits_per_raw_sample
     * }
     */
    public static int bits_per_raw_sample(MemorySegment struct) {
        return struct.get(bits_per_raw_sample$LAYOUT, bits_per_raw_sample$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int bits_per_raw_sample
     * }
     */
    public static void bits_per_raw_sample(MemorySegment struct, int fieldValue) {
        struct.set(bits_per_raw_sample$LAYOUT, bits_per_raw_sample$OFFSET, fieldValue);
    }

    private static final OfInt profile$LAYOUT = (OfInt)$LAYOUT.select(groupElement("profile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int profile
     * }
     */
    public static final OfInt profile$layout() {
        return profile$LAYOUT;
    }

    private static final long profile$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int profile
     * }
     */
    public static final long profile$offset() {
        return profile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int profile
     * }
     */
    public static int profile(MemorySegment struct) {
        return struct.get(profile$LAYOUT, profile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int profile
     * }
     */
    public static void profile(MemorySegment struct, int fieldValue) {
        struct.set(profile$LAYOUT, profile$OFFSET, fieldValue);
    }

    private static final OfInt level$LAYOUT = (OfInt)$LAYOUT.select(groupElement("level"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int level
     * }
     */
    public static final OfInt level$layout() {
        return level$LAYOUT;
    }

    private static final long level$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int level
     * }
     */
    public static final long level$offset() {
        return level$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int level
     * }
     */
    public static int level(MemorySegment struct) {
        return struct.get(level$LAYOUT, level$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int level
     * }
     */
    public static void level(MemorySegment struct, int fieldValue) {
        struct.set(level$LAYOUT, level$OFFSET, fieldValue);
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final GroupLayout sample_aspect_ratio$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("sample_aspect_ratio"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVRational sample_aspect_ratio
     * }
     */
    public static final GroupLayout sample_aspect_ratio$layout() {
        return sample_aspect_ratio$LAYOUT;
    }

    private static final long sample_aspect_ratio$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVRational sample_aspect_ratio
     * }
     */
    public static final long sample_aspect_ratio$offset() {
        return sample_aspect_ratio$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVRational sample_aspect_ratio
     * }
     */
    public static MemorySegment sample_aspect_ratio(MemorySegment struct) {
        return struct.asSlice(sample_aspect_ratio$OFFSET, sample_aspect_ratio$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVRational sample_aspect_ratio
     * }
     */
    public static void sample_aspect_ratio(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sample_aspect_ratio$OFFSET, sample_aspect_ratio$LAYOUT.byteSize());
    }

    private static final OfInt field_order$LAYOUT = (OfInt)$LAYOUT.select(groupElement("field_order"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVFieldOrder field_order
     * }
     */
    public static final OfInt field_order$layout() {
        return field_order$LAYOUT;
    }

    private static final long field_order$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVFieldOrder field_order
     * }
     */
    public static final long field_order$offset() {
        return field_order$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVFieldOrder field_order
     * }
     */
    public static int field_order(MemorySegment struct) {
        return struct.get(field_order$LAYOUT, field_order$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVFieldOrder field_order
     * }
     */
    public static void field_order(MemorySegment struct, int fieldValue) {
        struct.set(field_order$LAYOUT, field_order$OFFSET, fieldValue);
    }

    private static final OfInt color_range$LAYOUT = (OfInt)$LAYOUT.select(groupElement("color_range"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVColorRange color_range
     * }
     */
    public static final OfInt color_range$layout() {
        return color_range$LAYOUT;
    }

    private static final long color_range$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVColorRange color_range
     * }
     */
    public static final long color_range$offset() {
        return color_range$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVColorRange color_range
     * }
     */
    public static int color_range(MemorySegment struct) {
        return struct.get(color_range$LAYOUT, color_range$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVColorRange color_range
     * }
     */
    public static void color_range(MemorySegment struct, int fieldValue) {
        struct.set(color_range$LAYOUT, color_range$OFFSET, fieldValue);
    }

    private static final OfInt color_primaries$LAYOUT = (OfInt)$LAYOUT.select(groupElement("color_primaries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVColorPrimaries color_primaries
     * }
     */
    public static final OfInt color_primaries$layout() {
        return color_primaries$LAYOUT;
    }

    private static final long color_primaries$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVColorPrimaries color_primaries
     * }
     */
    public static final long color_primaries$offset() {
        return color_primaries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVColorPrimaries color_primaries
     * }
     */
    public static int color_primaries(MemorySegment struct) {
        return struct.get(color_primaries$LAYOUT, color_primaries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVColorPrimaries color_primaries
     * }
     */
    public static void color_primaries(MemorySegment struct, int fieldValue) {
        struct.set(color_primaries$LAYOUT, color_primaries$OFFSET, fieldValue);
    }

    private static final OfInt color_trc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("color_trc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVColorTransferCharacteristic color_trc
     * }
     */
    public static final OfInt color_trc$layout() {
        return color_trc$LAYOUT;
    }

    private static final long color_trc$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVColorTransferCharacteristic color_trc
     * }
     */
    public static final long color_trc$offset() {
        return color_trc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVColorTransferCharacteristic color_trc
     * }
     */
    public static int color_trc(MemorySegment struct) {
        return struct.get(color_trc$LAYOUT, color_trc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVColorTransferCharacteristic color_trc
     * }
     */
    public static void color_trc(MemorySegment struct, int fieldValue) {
        struct.set(color_trc$LAYOUT, color_trc$OFFSET, fieldValue);
    }

    private static final OfInt color_space$LAYOUT = (OfInt)$LAYOUT.select(groupElement("color_space"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVColorSpace color_space
     * }
     */
    public static final OfInt color_space$layout() {
        return color_space$LAYOUT;
    }

    private static final long color_space$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVColorSpace color_space
     * }
     */
    public static final long color_space$offset() {
        return color_space$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVColorSpace color_space
     * }
     */
    public static int color_space(MemorySegment struct) {
        return struct.get(color_space$LAYOUT, color_space$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVColorSpace color_space
     * }
     */
    public static void color_space(MemorySegment struct, int fieldValue) {
        struct.set(color_space$LAYOUT, color_space$OFFSET, fieldValue);
    }

    private static final OfInt chroma_location$LAYOUT = (OfInt)$LAYOUT.select(groupElement("chroma_location"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVChromaLocation chroma_location
     * }
     */
    public static final OfInt chroma_location$layout() {
        return chroma_location$LAYOUT;
    }

    private static final long chroma_location$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVChromaLocation chroma_location
     * }
     */
    public static final long chroma_location$offset() {
        return chroma_location$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVChromaLocation chroma_location
     * }
     */
    public static int chroma_location(MemorySegment struct) {
        return struct.get(chroma_location$LAYOUT, chroma_location$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVChromaLocation chroma_location
     * }
     */
    public static void chroma_location(MemorySegment struct, int fieldValue) {
        struct.set(chroma_location$LAYOUT, chroma_location$OFFSET, fieldValue);
    }

    private static final OfInt video_delay$LAYOUT = (OfInt)$LAYOUT.select(groupElement("video_delay"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int video_delay
     * }
     */
    public static final OfInt video_delay$layout() {
        return video_delay$LAYOUT;
    }

    private static final long video_delay$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int video_delay
     * }
     */
    public static final long video_delay$offset() {
        return video_delay$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int video_delay
     * }
     */
    public static int video_delay(MemorySegment struct) {
        return struct.get(video_delay$LAYOUT, video_delay$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int video_delay
     * }
     */
    public static void video_delay(MemorySegment struct, int fieldValue) {
        struct.set(video_delay$LAYOUT, video_delay$OFFSET, fieldValue);
    }

    private static final OfLong channel_layout$LAYOUT = (OfLong)$LAYOUT.select(groupElement("channel_layout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t channel_layout
     * }
     */
    public static final OfLong channel_layout$layout() {
        return channel_layout$LAYOUT;
    }

    private static final long channel_layout$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t channel_layout
     * }
     */
    public static final long channel_layout$offset() {
        return channel_layout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t channel_layout
     * }
     */
    public static long channel_layout(MemorySegment struct) {
        return struct.get(channel_layout$LAYOUT, channel_layout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t channel_layout
     * }
     */
    public static void channel_layout(MemorySegment struct, long fieldValue) {
        struct.set(channel_layout$LAYOUT, channel_layout$OFFSET, fieldValue);
    }

    private static final OfInt channels$LAYOUT = (OfInt)$LAYOUT.select(groupElement("channels"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int channels
     * }
     */
    public static final OfInt channels$layout() {
        return channels$LAYOUT;
    }

    private static final long channels$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int channels
     * }
     */
    public static final long channels$offset() {
        return channels$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int channels
     * }
     */
    public static int channels(MemorySegment struct) {
        return struct.get(channels$LAYOUT, channels$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int channels
     * }
     */
    public static void channels(MemorySegment struct, int fieldValue) {
        struct.set(channels$LAYOUT, channels$OFFSET, fieldValue);
    }

    private static final OfInt sample_rate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sample_rate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int sample_rate
     * }
     */
    public static final OfInt sample_rate$layout() {
        return sample_rate$LAYOUT;
    }

    private static final long sample_rate$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int sample_rate
     * }
     */
    public static final long sample_rate$offset() {
        return sample_rate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int sample_rate
     * }
     */
    public static int sample_rate(MemorySegment struct) {
        return struct.get(sample_rate$LAYOUT, sample_rate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int sample_rate
     * }
     */
    public static void sample_rate(MemorySegment struct, int fieldValue) {
        struct.set(sample_rate$LAYOUT, sample_rate$OFFSET, fieldValue);
    }

    private static final OfInt block_align$LAYOUT = (OfInt)$LAYOUT.select(groupElement("block_align"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int block_align
     * }
     */
    public static final OfInt block_align$layout() {
        return block_align$LAYOUT;
    }

    private static final long block_align$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int block_align
     * }
     */
    public static final long block_align$offset() {
        return block_align$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int block_align
     * }
     */
    public static int block_align(MemorySegment struct) {
        return struct.get(block_align$LAYOUT, block_align$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int block_align
     * }
     */
    public static void block_align(MemorySegment struct, int fieldValue) {
        struct.set(block_align$LAYOUT, block_align$OFFSET, fieldValue);
    }

    private static final OfInt frame_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("frame_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int frame_size
     * }
     */
    public static final OfInt frame_size$layout() {
        return frame_size$LAYOUT;
    }

    private static final long frame_size$OFFSET = 124;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int frame_size
     * }
     */
    public static final long frame_size$offset() {
        return frame_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int frame_size
     * }
     */
    public static int frame_size(MemorySegment struct) {
        return struct.get(frame_size$LAYOUT, frame_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int frame_size
     * }
     */
    public static void frame_size(MemorySegment struct, int fieldValue) {
        struct.set(frame_size$LAYOUT, frame_size$OFFSET, fieldValue);
    }

    private static final OfInt initial_padding$LAYOUT = (OfInt)$LAYOUT.select(groupElement("initial_padding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int initial_padding
     * }
     */
    public static final OfInt initial_padding$layout() {
        return initial_padding$LAYOUT;
    }

    private static final long initial_padding$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int initial_padding
     * }
     */
    public static final long initial_padding$offset() {
        return initial_padding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int initial_padding
     * }
     */
    public static int initial_padding(MemorySegment struct) {
        return struct.get(initial_padding$LAYOUT, initial_padding$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int initial_padding
     * }
     */
    public static void initial_padding(MemorySegment struct, int fieldValue) {
        struct.set(initial_padding$LAYOUT, initial_padding$OFFSET, fieldValue);
    }

    private static final OfInt trailing_padding$LAYOUT = (OfInt)$LAYOUT.select(groupElement("trailing_padding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int trailing_padding
     * }
     */
    public static final OfInt trailing_padding$layout() {
        return trailing_padding$LAYOUT;
    }

    private static final long trailing_padding$OFFSET = 132;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int trailing_padding
     * }
     */
    public static final long trailing_padding$offset() {
        return trailing_padding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int trailing_padding
     * }
     */
    public static int trailing_padding(MemorySegment struct) {
        return struct.get(trailing_padding$LAYOUT, trailing_padding$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int trailing_padding
     * }
     */
    public static void trailing_padding(MemorySegment struct, int fieldValue) {
        struct.set(trailing_padding$LAYOUT, trailing_padding$OFFSET, fieldValue);
    }

    private static final OfInt seek_preroll$LAYOUT = (OfInt)$LAYOUT.select(groupElement("seek_preroll"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int seek_preroll
     * }
     */
    public static final OfInt seek_preroll$layout() {
        return seek_preroll$LAYOUT;
    }

    private static final long seek_preroll$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int seek_preroll
     * }
     */
    public static final long seek_preroll$offset() {
        return seek_preroll$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int seek_preroll
     * }
     */
    public static int seek_preroll(MemorySegment struct) {
        return struct.get(seek_preroll$LAYOUT, seek_preroll$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int seek_preroll
     * }
     */
    public static void seek_preroll(MemorySegment struct, int fieldValue) {
        struct.set(seek_preroll$LAYOUT, seek_preroll$OFFSET, fieldValue);
    }

    private static final GroupLayout ch_layout$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ch_layout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVChannelLayout ch_layout
     * }
     */
    public static final GroupLayout ch_layout$layout() {
        return ch_layout$LAYOUT;
    }

    private static final long ch_layout$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVChannelLayout ch_layout
     * }
     */
    public static final long ch_layout$offset() {
        return ch_layout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVChannelLayout ch_layout
     * }
     */
    public static MemorySegment ch_layout(MemorySegment struct) {
        return struct.asSlice(ch_layout$OFFSET, ch_layout$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVChannelLayout ch_layout
     * }
     */
    public static void ch_layout(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ch_layout$OFFSET, ch_layout$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

