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
 * struct AVCodec {
 *     const char *name;
 *     const char *long_name;
 *     enum AVMediaType type;
 *     enum AVCodecID id;
 *     int capabilities;
 *     uint8_t max_lowres;
 *     const AVRational *supported_framerates;
 *     const enum AVPixelFormat *pix_fmts;
 *     const int *supported_samplerates;
 *     const enum AVSampleFormat *sample_fmts;
 *     const uint64_t *channel_layouts;
 *     const AVClass *priv_class;
 *     const AVProfile *profiles;
 *     const char *wrapper_name;
 *     const AVChannelLayout *ch_layouts;
 * }
 * }
 */
public class AVCodec {

    AVCodec() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_POINTER.withName("name"),
        FFmpeg.C_POINTER.withName("long_name"),
        FFmpeg.C_INT.withName("type"),
        FFmpeg.C_INT.withName("id"),
        FFmpeg.C_INT.withName("capabilities"),
        FFmpeg.C_CHAR.withName("max_lowres"),
        MemoryLayout.paddingLayout(3),
        FFmpeg.C_POINTER.withName("supported_framerates"),
        FFmpeg.C_POINTER.withName("pix_fmts"),
        FFmpeg.C_POINTER.withName("supported_samplerates"),
        FFmpeg.C_POINTER.withName("sample_fmts"),
        FFmpeg.C_POINTER.withName("channel_layouts"),
        FFmpeg.C_POINTER.withName("priv_class"),
        FFmpeg.C_POINTER.withName("profiles"),
        FFmpeg.C_POINTER.withName("wrapper_name"),
        FFmpeg.C_POINTER.withName("ch_layouts")
    ).withName("AVCodec");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final AddressLayout long_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("long_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *long_name
     * }
     */
    public static final AddressLayout long_name$layout() {
        return long_name$LAYOUT;
    }

    private static final long long_name$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *long_name
     * }
     */
    public static final long long_name$offset() {
        return long_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *long_name
     * }
     */
    public static MemorySegment long_name(MemorySegment struct) {
        return struct.get(long_name$LAYOUT, long_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *long_name
     * }
     */
    public static void long_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(long_name$LAYOUT, long_name$OFFSET, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVMediaType type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVMediaType type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVMediaType type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVMediaType type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfInt id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVCodecID id
     * }
     */
    public static final OfInt id$layout() {
        return id$LAYOUT;
    }

    private static final long id$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVCodecID id
     * }
     */
    public static final long id$offset() {
        return id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVCodecID id
     * }
     */
    public static int id(MemorySegment struct) {
        return struct.get(id$LAYOUT, id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVCodecID id
     * }
     */
    public static void id(MemorySegment struct, int fieldValue) {
        struct.set(id$LAYOUT, id$OFFSET, fieldValue);
    }

    private static final OfInt capabilities$LAYOUT = (OfInt)$LAYOUT.select(groupElement("capabilities"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int capabilities
     * }
     */
    public static final OfInt capabilities$layout() {
        return capabilities$LAYOUT;
    }

    private static final long capabilities$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int capabilities
     * }
     */
    public static final long capabilities$offset() {
        return capabilities$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int capabilities
     * }
     */
    public static int capabilities(MemorySegment struct) {
        return struct.get(capabilities$LAYOUT, capabilities$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int capabilities
     * }
     */
    public static void capabilities(MemorySegment struct, int fieldValue) {
        struct.set(capabilities$LAYOUT, capabilities$OFFSET, fieldValue);
    }

    private static final OfByte max_lowres$LAYOUT = (OfByte)$LAYOUT.select(groupElement("max_lowres"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t max_lowres
     * }
     */
    public static final OfByte max_lowres$layout() {
        return max_lowres$LAYOUT;
    }

    private static final long max_lowres$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t max_lowres
     * }
     */
    public static final long max_lowres$offset() {
        return max_lowres$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t max_lowres
     * }
     */
    public static byte max_lowres(MemorySegment struct) {
        return struct.get(max_lowres$LAYOUT, max_lowres$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t max_lowres
     * }
     */
    public static void max_lowres(MemorySegment struct, byte fieldValue) {
        struct.set(max_lowres$LAYOUT, max_lowres$OFFSET, fieldValue);
    }

    private static final AddressLayout supported_framerates$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("supported_framerates"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const AVRational *supported_framerates
     * }
     */
    public static final AddressLayout supported_framerates$layout() {
        return supported_framerates$LAYOUT;
    }

    private static final long supported_framerates$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const AVRational *supported_framerates
     * }
     */
    public static final long supported_framerates$offset() {
        return supported_framerates$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const AVRational *supported_framerates
     * }
     */
    public static MemorySegment supported_framerates(MemorySegment struct) {
        return struct.get(supported_framerates$LAYOUT, supported_framerates$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const AVRational *supported_framerates
     * }
     */
    public static void supported_framerates(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(supported_framerates$LAYOUT, supported_framerates$OFFSET, fieldValue);
    }

    private static final AddressLayout pix_fmts$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pix_fmts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const enum AVPixelFormat *pix_fmts
     * }
     */
    public static final AddressLayout pix_fmts$layout() {
        return pix_fmts$LAYOUT;
    }

    private static final long pix_fmts$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const enum AVPixelFormat *pix_fmts
     * }
     */
    public static final long pix_fmts$offset() {
        return pix_fmts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const enum AVPixelFormat *pix_fmts
     * }
     */
    public static MemorySegment pix_fmts(MemorySegment struct) {
        return struct.get(pix_fmts$LAYOUT, pix_fmts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const enum AVPixelFormat *pix_fmts
     * }
     */
    public static void pix_fmts(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pix_fmts$LAYOUT, pix_fmts$OFFSET, fieldValue);
    }

    private static final AddressLayout supported_samplerates$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("supported_samplerates"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const int *supported_samplerates
     * }
     */
    public static final AddressLayout supported_samplerates$layout() {
        return supported_samplerates$LAYOUT;
    }

    private static final long supported_samplerates$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const int *supported_samplerates
     * }
     */
    public static final long supported_samplerates$offset() {
        return supported_samplerates$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const int *supported_samplerates
     * }
     */
    public static MemorySegment supported_samplerates(MemorySegment struct) {
        return struct.get(supported_samplerates$LAYOUT, supported_samplerates$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const int *supported_samplerates
     * }
     */
    public static void supported_samplerates(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(supported_samplerates$LAYOUT, supported_samplerates$OFFSET, fieldValue);
    }

    private static final AddressLayout sample_fmts$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("sample_fmts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const enum AVSampleFormat *sample_fmts
     * }
     */
    public static final AddressLayout sample_fmts$layout() {
        return sample_fmts$LAYOUT;
    }

    private static final long sample_fmts$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const enum AVSampleFormat *sample_fmts
     * }
     */
    public static final long sample_fmts$offset() {
        return sample_fmts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const enum AVSampleFormat *sample_fmts
     * }
     */
    public static MemorySegment sample_fmts(MemorySegment struct) {
        return struct.get(sample_fmts$LAYOUT, sample_fmts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const enum AVSampleFormat *sample_fmts
     * }
     */
    public static void sample_fmts(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(sample_fmts$LAYOUT, sample_fmts$OFFSET, fieldValue);
    }

    private static final AddressLayout channel_layouts$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("channel_layouts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const uint64_t *channel_layouts
     * }
     */
    public static final AddressLayout channel_layouts$layout() {
        return channel_layouts$LAYOUT;
    }

    private static final long channel_layouts$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const uint64_t *channel_layouts
     * }
     */
    public static final long channel_layouts$offset() {
        return channel_layouts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const uint64_t *channel_layouts
     * }
     */
    public static MemorySegment channel_layouts(MemorySegment struct) {
        return struct.get(channel_layouts$LAYOUT, channel_layouts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const uint64_t *channel_layouts
     * }
     */
    public static void channel_layouts(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(channel_layouts$LAYOUT, channel_layouts$OFFSET, fieldValue);
    }

    private static final AddressLayout priv_class$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("priv_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const AVClass *priv_class
     * }
     */
    public static final AddressLayout priv_class$layout() {
        return priv_class$LAYOUT;
    }

    private static final long priv_class$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const AVClass *priv_class
     * }
     */
    public static final long priv_class$offset() {
        return priv_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const AVClass *priv_class
     * }
     */
    public static MemorySegment priv_class(MemorySegment struct) {
        return struct.get(priv_class$LAYOUT, priv_class$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const AVClass *priv_class
     * }
     */
    public static void priv_class(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(priv_class$LAYOUT, priv_class$OFFSET, fieldValue);
    }

    private static final AddressLayout profiles$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("profiles"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const AVProfile *profiles
     * }
     */
    public static final AddressLayout profiles$layout() {
        return profiles$LAYOUT;
    }

    private static final long profiles$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const AVProfile *profiles
     * }
     */
    public static final long profiles$offset() {
        return profiles$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const AVProfile *profiles
     * }
     */
    public static MemorySegment profiles(MemorySegment struct) {
        return struct.get(profiles$LAYOUT, profiles$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const AVProfile *profiles
     * }
     */
    public static void profiles(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(profiles$LAYOUT, profiles$OFFSET, fieldValue);
    }

    private static final AddressLayout wrapper_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("wrapper_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *wrapper_name
     * }
     */
    public static final AddressLayout wrapper_name$layout() {
        return wrapper_name$LAYOUT;
    }

    private static final long wrapper_name$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *wrapper_name
     * }
     */
    public static final long wrapper_name$offset() {
        return wrapper_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *wrapper_name
     * }
     */
    public static MemorySegment wrapper_name(MemorySegment struct) {
        return struct.get(wrapper_name$LAYOUT, wrapper_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *wrapper_name
     * }
     */
    public static void wrapper_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(wrapper_name$LAYOUT, wrapper_name$OFFSET, fieldValue);
    }

    private static final AddressLayout ch_layouts$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ch_layouts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const AVChannelLayout *ch_layouts
     * }
     */
    public static final AddressLayout ch_layouts$layout() {
        return ch_layouts$LAYOUT;
    }

    private static final long ch_layouts$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const AVChannelLayout *ch_layouts
     * }
     */
    public static final long ch_layouts$offset() {
        return ch_layouts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const AVChannelLayout *ch_layouts
     * }
     */
    public static MemorySegment ch_layouts(MemorySegment struct) {
        return struct.get(ch_layouts$LAYOUT, ch_layouts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const AVChannelLayout *ch_layouts
     * }
     */
    public static void ch_layouts(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ch_layouts$LAYOUT, ch_layouts$OFFSET, fieldValue);
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

