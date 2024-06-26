// Generated by jextract

package io.github.chrisribble.ffmpeg5;

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
 * struct AVStream {
 *     int index;
 *     int id;
 *     void *priv_data;
 *     AVRational time_base;
 *     int64_t start_time;
 *     int64_t duration;
 *     int64_t nb_frames;
 *     int disposition;
 *     enum AVDiscard discard;
 *     AVRational sample_aspect_ratio;
 *     AVDictionary *metadata;
 *     AVRational avg_frame_rate;
 *     AVPacket attached_pic;
 *     AVPacketSideData *side_data;
 *     int nb_side_data;
 *     int event_flags;
 *     AVRational r_frame_rate;
 *     AVCodecParameters *codecpar;
 *     int pts_wrap_bits;
 * }
 * }
 */
public class AVStream {

    AVStream() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_INT.withName("index"),
        FFmpeg.C_INT.withName("id"),
        FFmpeg.C_POINTER.withName("priv_data"),
        AVRational.layout().withName("time_base"),
        FFmpeg.C_LONG.withName("start_time"),
        FFmpeg.C_LONG.withName("duration"),
        FFmpeg.C_LONG.withName("nb_frames"),
        FFmpeg.C_INT.withName("disposition"),
        FFmpeg.C_INT.withName("discard"),
        AVRational.layout().withName("sample_aspect_ratio"),
        FFmpeg.C_POINTER.withName("metadata"),
        AVRational.layout().withName("avg_frame_rate"),
        AVPacket.layout().withName("attached_pic"),
        FFmpeg.C_POINTER.withName("side_data"),
        FFmpeg.C_INT.withName("nb_side_data"),
        FFmpeg.C_INT.withName("event_flags"),
        AVRational.layout().withName("r_frame_rate"),
        FFmpeg.C_POINTER.withName("codecpar"),
        FFmpeg.C_INT.withName("pts_wrap_bits"),
        MemoryLayout.paddingLayout(4)
    ).withName("AVStream");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt index$LAYOUT = (OfInt)$LAYOUT.select(groupElement("index"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int index
     * }
     */
    public static final OfInt index$layout() {
        return index$LAYOUT;
    }

    private static final long index$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int index
     * }
     */
    public static final long index$offset() {
        return index$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int index
     * }
     */
    public static int index(MemorySegment struct) {
        return struct.get(index$LAYOUT, index$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int index
     * }
     */
    public static void index(MemorySegment struct, int fieldValue) {
        struct.set(index$LAYOUT, index$OFFSET, fieldValue);
    }

    private static final OfInt id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int id
     * }
     */
    public static final OfInt id$layout() {
        return id$LAYOUT;
    }

    private static final long id$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int id
     * }
     */
    public static final long id$offset() {
        return id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int id
     * }
     */
    public static int id(MemorySegment struct) {
        return struct.get(id$LAYOUT, id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int id
     * }
     */
    public static void id(MemorySegment struct, int fieldValue) {
        struct.set(id$LAYOUT, id$OFFSET, fieldValue);
    }

    private static final AddressLayout priv_data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("priv_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *priv_data
     * }
     */
    public static final AddressLayout priv_data$layout() {
        return priv_data$LAYOUT;
    }

    private static final long priv_data$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *priv_data
     * }
     */
    public static final long priv_data$offset() {
        return priv_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *priv_data
     * }
     */
    public static MemorySegment priv_data(MemorySegment struct) {
        return struct.get(priv_data$LAYOUT, priv_data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *priv_data
     * }
     */
    public static void priv_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(priv_data$LAYOUT, priv_data$OFFSET, fieldValue);
    }

    private static final GroupLayout time_base$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("time_base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVRational time_base
     * }
     */
    public static final GroupLayout time_base$layout() {
        return time_base$LAYOUT;
    }

    private static final long time_base$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVRational time_base
     * }
     */
    public static final long time_base$offset() {
        return time_base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVRational time_base
     * }
     */
    public static MemorySegment time_base(MemorySegment struct) {
        return struct.asSlice(time_base$OFFSET, time_base$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVRational time_base
     * }
     */
    public static void time_base(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, time_base$OFFSET, time_base$LAYOUT.byteSize());
    }

    private static final OfLong start_time$LAYOUT = (OfLong)$LAYOUT.select(groupElement("start_time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t start_time
     * }
     */
    public static final OfLong start_time$layout() {
        return start_time$LAYOUT;
    }

    private static final long start_time$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t start_time
     * }
     */
    public static final long start_time$offset() {
        return start_time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t start_time
     * }
     */
    public static long start_time(MemorySegment struct) {
        return struct.get(start_time$LAYOUT, start_time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t start_time
     * }
     */
    public static void start_time(MemorySegment struct, long fieldValue) {
        struct.set(start_time$LAYOUT, start_time$OFFSET, fieldValue);
    }

    private static final OfLong duration$LAYOUT = (OfLong)$LAYOUT.select(groupElement("duration"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t duration
     * }
     */
    public static final OfLong duration$layout() {
        return duration$LAYOUT;
    }

    private static final long duration$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t duration
     * }
     */
    public static final long duration$offset() {
        return duration$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t duration
     * }
     */
    public static long duration(MemorySegment struct) {
        return struct.get(duration$LAYOUT, duration$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t duration
     * }
     */
    public static void duration(MemorySegment struct, long fieldValue) {
        struct.set(duration$LAYOUT, duration$OFFSET, fieldValue);
    }

    private static final OfLong nb_frames$LAYOUT = (OfLong)$LAYOUT.select(groupElement("nb_frames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t nb_frames
     * }
     */
    public static final OfLong nb_frames$layout() {
        return nb_frames$LAYOUT;
    }

    private static final long nb_frames$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t nb_frames
     * }
     */
    public static final long nb_frames$offset() {
        return nb_frames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t nb_frames
     * }
     */
    public static long nb_frames(MemorySegment struct) {
        return struct.get(nb_frames$LAYOUT, nb_frames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t nb_frames
     * }
     */
    public static void nb_frames(MemorySegment struct, long fieldValue) {
        struct.set(nb_frames$LAYOUT, nb_frames$OFFSET, fieldValue);
    }

    private static final OfInt disposition$LAYOUT = (OfInt)$LAYOUT.select(groupElement("disposition"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int disposition
     * }
     */
    public static final OfInt disposition$layout() {
        return disposition$LAYOUT;
    }

    private static final long disposition$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int disposition
     * }
     */
    public static final long disposition$offset() {
        return disposition$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int disposition
     * }
     */
    public static int disposition(MemorySegment struct) {
        return struct.get(disposition$LAYOUT, disposition$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int disposition
     * }
     */
    public static void disposition(MemorySegment struct, int fieldValue) {
        struct.set(disposition$LAYOUT, disposition$OFFSET, fieldValue);
    }

    private static final OfInt discard$LAYOUT = (OfInt)$LAYOUT.select(groupElement("discard"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVDiscard discard
     * }
     */
    public static final OfInt discard$layout() {
        return discard$LAYOUT;
    }

    private static final long discard$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVDiscard discard
     * }
     */
    public static final long discard$offset() {
        return discard$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVDiscard discard
     * }
     */
    public static int discard(MemorySegment struct) {
        return struct.get(discard$LAYOUT, discard$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVDiscard discard
     * }
     */
    public static void discard(MemorySegment struct, int fieldValue) {
        struct.set(discard$LAYOUT, discard$OFFSET, fieldValue);
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

    private static final long sample_aspect_ratio$OFFSET = 56;

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

    private static final AddressLayout metadata$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("metadata"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVDictionary *metadata
     * }
     */
    public static final AddressLayout metadata$layout() {
        return metadata$LAYOUT;
    }

    private static final long metadata$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVDictionary *metadata
     * }
     */
    public static final long metadata$offset() {
        return metadata$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVDictionary *metadata
     * }
     */
    public static MemorySegment metadata(MemorySegment struct) {
        return struct.get(metadata$LAYOUT, metadata$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVDictionary *metadata
     * }
     */
    public static void metadata(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(metadata$LAYOUT, metadata$OFFSET, fieldValue);
    }

    private static final GroupLayout avg_frame_rate$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("avg_frame_rate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVRational avg_frame_rate
     * }
     */
    public static final GroupLayout avg_frame_rate$layout() {
        return avg_frame_rate$LAYOUT;
    }

    private static final long avg_frame_rate$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVRational avg_frame_rate
     * }
     */
    public static final long avg_frame_rate$offset() {
        return avg_frame_rate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVRational avg_frame_rate
     * }
     */
    public static MemorySegment avg_frame_rate(MemorySegment struct) {
        return struct.asSlice(avg_frame_rate$OFFSET, avg_frame_rate$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVRational avg_frame_rate
     * }
     */
    public static void avg_frame_rate(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, avg_frame_rate$OFFSET, avg_frame_rate$LAYOUT.byteSize());
    }

    private static final GroupLayout attached_pic$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("attached_pic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVPacket attached_pic
     * }
     */
    public static final GroupLayout attached_pic$layout() {
        return attached_pic$LAYOUT;
    }

    private static final long attached_pic$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVPacket attached_pic
     * }
     */
    public static final long attached_pic$offset() {
        return attached_pic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVPacket attached_pic
     * }
     */
    public static MemorySegment attached_pic(MemorySegment struct) {
        return struct.asSlice(attached_pic$OFFSET, attached_pic$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVPacket attached_pic
     * }
     */
    public static void attached_pic(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, attached_pic$OFFSET, attached_pic$LAYOUT.byteSize());
    }

    private static final AddressLayout side_data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("side_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVPacketSideData *side_data
     * }
     */
    public static final AddressLayout side_data$layout() {
        return side_data$LAYOUT;
    }

    private static final long side_data$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVPacketSideData *side_data
     * }
     */
    public static final long side_data$offset() {
        return side_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVPacketSideData *side_data
     * }
     */
    public static MemorySegment side_data(MemorySegment struct) {
        return struct.get(side_data$LAYOUT, side_data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVPacketSideData *side_data
     * }
     */
    public static void side_data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(side_data$LAYOUT, side_data$OFFSET, fieldValue);
    }

    private static final OfInt nb_side_data$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nb_side_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int nb_side_data
     * }
     */
    public static final OfInt nb_side_data$layout() {
        return nb_side_data$LAYOUT;
    }

    private static final long nb_side_data$OFFSET = 192;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int nb_side_data
     * }
     */
    public static final long nb_side_data$offset() {
        return nb_side_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int nb_side_data
     * }
     */
    public static int nb_side_data(MemorySegment struct) {
        return struct.get(nb_side_data$LAYOUT, nb_side_data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int nb_side_data
     * }
     */
    public static void nb_side_data(MemorySegment struct, int fieldValue) {
        struct.set(nb_side_data$LAYOUT, nb_side_data$OFFSET, fieldValue);
    }

    private static final OfInt event_flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("event_flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int event_flags
     * }
     */
    public static final OfInt event_flags$layout() {
        return event_flags$LAYOUT;
    }

    private static final long event_flags$OFFSET = 196;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int event_flags
     * }
     */
    public static final long event_flags$offset() {
        return event_flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int event_flags
     * }
     */
    public static int event_flags(MemorySegment struct) {
        return struct.get(event_flags$LAYOUT, event_flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int event_flags
     * }
     */
    public static void event_flags(MemorySegment struct, int fieldValue) {
        struct.set(event_flags$LAYOUT, event_flags$OFFSET, fieldValue);
    }

    private static final GroupLayout r_frame_rate$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("r_frame_rate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVRational r_frame_rate
     * }
     */
    public static final GroupLayout r_frame_rate$layout() {
        return r_frame_rate$LAYOUT;
    }

    private static final long r_frame_rate$OFFSET = 200;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVRational r_frame_rate
     * }
     */
    public static final long r_frame_rate$offset() {
        return r_frame_rate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVRational r_frame_rate
     * }
     */
    public static MemorySegment r_frame_rate(MemorySegment struct) {
        return struct.asSlice(r_frame_rate$OFFSET, r_frame_rate$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVRational r_frame_rate
     * }
     */
    public static void r_frame_rate(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, r_frame_rate$OFFSET, r_frame_rate$LAYOUT.byteSize());
    }

    private static final AddressLayout codecpar$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("codecpar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVCodecParameters *codecpar
     * }
     */
    public static final AddressLayout codecpar$layout() {
        return codecpar$LAYOUT;
    }

    private static final long codecpar$OFFSET = 208;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVCodecParameters *codecpar
     * }
     */
    public static final long codecpar$offset() {
        return codecpar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVCodecParameters *codecpar
     * }
     */
    public static MemorySegment codecpar(MemorySegment struct) {
        return struct.get(codecpar$LAYOUT, codecpar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVCodecParameters *codecpar
     * }
     */
    public static void codecpar(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(codecpar$LAYOUT, codecpar$OFFSET, fieldValue);
    }

    private static final OfInt pts_wrap_bits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pts_wrap_bits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int pts_wrap_bits
     * }
     */
    public static final OfInt pts_wrap_bits$layout() {
        return pts_wrap_bits$LAYOUT;
    }

    private static final long pts_wrap_bits$OFFSET = 216;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int pts_wrap_bits
     * }
     */
    public static final long pts_wrap_bits$offset() {
        return pts_wrap_bits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int pts_wrap_bits
     * }
     */
    public static int pts_wrap_bits(MemorySegment struct) {
        return struct.get(pts_wrap_bits$LAYOUT, pts_wrap_bits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int pts_wrap_bits
     * }
     */
    public static void pts_wrap_bits(MemorySegment struct, int fieldValue) {
        struct.set(pts_wrap_bits$LAYOUT, pts_wrap_bits$OFFSET, fieldValue);
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
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

