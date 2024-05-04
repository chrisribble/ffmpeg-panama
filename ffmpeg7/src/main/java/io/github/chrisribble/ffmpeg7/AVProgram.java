// Generated by jextract

package io.github.chrisribble.ffmpeg7;

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
 * struct AVProgram {
 *     int id;
 *     int flags;
 *     enum AVDiscard discard;
 *     unsigned int *stream_index;
 *     unsigned int nb_stream_indexes;
 *     AVDictionary *metadata;
 *     int program_num;
 *     int pmt_pid;
 *     int pcr_pid;
 *     int pmt_version;
 *     int64_t start_time;
 *     int64_t end_time;
 *     int64_t pts_wrap_reference;
 *     int pts_wrap_behavior;
 * }
 * }
 */
public class AVProgram {

    AVProgram() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_INT.withName("id"),
        FFmpeg.C_INT.withName("flags"),
        FFmpeg.C_INT.withName("discard"),
        MemoryLayout.paddingLayout(4),
        FFmpeg.C_POINTER.withName("stream_index"),
        FFmpeg.C_INT.withName("nb_stream_indexes"),
        MemoryLayout.paddingLayout(4),
        FFmpeg.C_POINTER.withName("metadata"),
        FFmpeg.C_INT.withName("program_num"),
        FFmpeg.C_INT.withName("pmt_pid"),
        FFmpeg.C_INT.withName("pcr_pid"),
        FFmpeg.C_INT.withName("pmt_version"),
        FFmpeg.C_LONG.withName("start_time"),
        FFmpeg.C_LONG.withName("end_time"),
        FFmpeg.C_LONG.withName("pts_wrap_reference"),
        FFmpeg.C_INT.withName("pts_wrap_behavior"),
        MemoryLayout.paddingLayout(4)
    ).withName("AVProgram");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long id$OFFSET = 0;

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

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
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

    private static final long discard$OFFSET = 8;

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

    private static final AddressLayout stream_index$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("stream_index"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int *stream_index
     * }
     */
    public static final AddressLayout stream_index$layout() {
        return stream_index$LAYOUT;
    }

    private static final long stream_index$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int *stream_index
     * }
     */
    public static final long stream_index$offset() {
        return stream_index$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int *stream_index
     * }
     */
    public static MemorySegment stream_index(MemorySegment struct) {
        return struct.get(stream_index$LAYOUT, stream_index$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int *stream_index
     * }
     */
    public static void stream_index(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(stream_index$LAYOUT, stream_index$OFFSET, fieldValue);
    }

    private static final OfInt nb_stream_indexes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nb_stream_indexes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int nb_stream_indexes
     * }
     */
    public static final OfInt nb_stream_indexes$layout() {
        return nb_stream_indexes$LAYOUT;
    }

    private static final long nb_stream_indexes$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int nb_stream_indexes
     * }
     */
    public static final long nb_stream_indexes$offset() {
        return nb_stream_indexes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int nb_stream_indexes
     * }
     */
    public static int nb_stream_indexes(MemorySegment struct) {
        return struct.get(nb_stream_indexes$LAYOUT, nb_stream_indexes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int nb_stream_indexes
     * }
     */
    public static void nb_stream_indexes(MemorySegment struct, int fieldValue) {
        struct.set(nb_stream_indexes$LAYOUT, nb_stream_indexes$OFFSET, fieldValue);
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

    private static final long metadata$OFFSET = 32;

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

    private static final OfInt program_num$LAYOUT = (OfInt)$LAYOUT.select(groupElement("program_num"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int program_num
     * }
     */
    public static final OfInt program_num$layout() {
        return program_num$LAYOUT;
    }

    private static final long program_num$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int program_num
     * }
     */
    public static final long program_num$offset() {
        return program_num$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int program_num
     * }
     */
    public static int program_num(MemorySegment struct) {
        return struct.get(program_num$LAYOUT, program_num$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int program_num
     * }
     */
    public static void program_num(MemorySegment struct, int fieldValue) {
        struct.set(program_num$LAYOUT, program_num$OFFSET, fieldValue);
    }

    private static final OfInt pmt_pid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pmt_pid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int pmt_pid
     * }
     */
    public static final OfInt pmt_pid$layout() {
        return pmt_pid$LAYOUT;
    }

    private static final long pmt_pid$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int pmt_pid
     * }
     */
    public static final long pmt_pid$offset() {
        return pmt_pid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int pmt_pid
     * }
     */
    public static int pmt_pid(MemorySegment struct) {
        return struct.get(pmt_pid$LAYOUT, pmt_pid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int pmt_pid
     * }
     */
    public static void pmt_pid(MemorySegment struct, int fieldValue) {
        struct.set(pmt_pid$LAYOUT, pmt_pid$OFFSET, fieldValue);
    }

    private static final OfInt pcr_pid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pcr_pid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int pcr_pid
     * }
     */
    public static final OfInt pcr_pid$layout() {
        return pcr_pid$LAYOUT;
    }

    private static final long pcr_pid$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int pcr_pid
     * }
     */
    public static final long pcr_pid$offset() {
        return pcr_pid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int pcr_pid
     * }
     */
    public static int pcr_pid(MemorySegment struct) {
        return struct.get(pcr_pid$LAYOUT, pcr_pid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int pcr_pid
     * }
     */
    public static void pcr_pid(MemorySegment struct, int fieldValue) {
        struct.set(pcr_pid$LAYOUT, pcr_pid$OFFSET, fieldValue);
    }

    private static final OfInt pmt_version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pmt_version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int pmt_version
     * }
     */
    public static final OfInt pmt_version$layout() {
        return pmt_version$LAYOUT;
    }

    private static final long pmt_version$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int pmt_version
     * }
     */
    public static final long pmt_version$offset() {
        return pmt_version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int pmt_version
     * }
     */
    public static int pmt_version(MemorySegment struct) {
        return struct.get(pmt_version$LAYOUT, pmt_version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int pmt_version
     * }
     */
    public static void pmt_version(MemorySegment struct, int fieldValue) {
        struct.set(pmt_version$LAYOUT, pmt_version$OFFSET, fieldValue);
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

    private static final long start_time$OFFSET = 56;

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

    private static final OfLong end_time$LAYOUT = (OfLong)$LAYOUT.select(groupElement("end_time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t end_time
     * }
     */
    public static final OfLong end_time$layout() {
        return end_time$LAYOUT;
    }

    private static final long end_time$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t end_time
     * }
     */
    public static final long end_time$offset() {
        return end_time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t end_time
     * }
     */
    public static long end_time(MemorySegment struct) {
        return struct.get(end_time$LAYOUT, end_time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t end_time
     * }
     */
    public static void end_time(MemorySegment struct, long fieldValue) {
        struct.set(end_time$LAYOUT, end_time$OFFSET, fieldValue);
    }

    private static final OfLong pts_wrap_reference$LAYOUT = (OfLong)$LAYOUT.select(groupElement("pts_wrap_reference"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t pts_wrap_reference
     * }
     */
    public static final OfLong pts_wrap_reference$layout() {
        return pts_wrap_reference$LAYOUT;
    }

    private static final long pts_wrap_reference$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t pts_wrap_reference
     * }
     */
    public static final long pts_wrap_reference$offset() {
        return pts_wrap_reference$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t pts_wrap_reference
     * }
     */
    public static long pts_wrap_reference(MemorySegment struct) {
        return struct.get(pts_wrap_reference$LAYOUT, pts_wrap_reference$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t pts_wrap_reference
     * }
     */
    public static void pts_wrap_reference(MemorySegment struct, long fieldValue) {
        struct.set(pts_wrap_reference$LAYOUT, pts_wrap_reference$OFFSET, fieldValue);
    }

    private static final OfInt pts_wrap_behavior$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pts_wrap_behavior"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int pts_wrap_behavior
     * }
     */
    public static final OfInt pts_wrap_behavior$layout() {
        return pts_wrap_behavior$LAYOUT;
    }

    private static final long pts_wrap_behavior$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int pts_wrap_behavior
     * }
     */
    public static final long pts_wrap_behavior$offset() {
        return pts_wrap_behavior$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int pts_wrap_behavior
     * }
     */
    public static int pts_wrap_behavior(MemorySegment struct) {
        return struct.get(pts_wrap_behavior$LAYOUT, pts_wrap_behavior$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int pts_wrap_behavior
     * }
     */
    public static void pts_wrap_behavior(MemorySegment struct, int fieldValue) {
        struct.set(pts_wrap_behavior$LAYOUT, pts_wrap_behavior$OFFSET, fieldValue);
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

