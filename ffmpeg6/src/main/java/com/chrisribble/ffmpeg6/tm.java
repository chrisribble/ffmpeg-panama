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
 * struct tm {
 *     int tm_sec;
 *     int tm_min;
 *     int tm_hour;
 *     int tm_mday;
 *     int tm_mon;
 *     int tm_year;
 *     int tm_wday;
 *     int tm_yday;
 *     int tm_isdst;
 *     long tm_gmtoff;
 *     const char *tm_zone;
 * }
 * }
 */
public class tm {

    tm() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_INT.withName("tm_sec"),
        FFmpeg.C_INT.withName("tm_min"),
        FFmpeg.C_INT.withName("tm_hour"),
        FFmpeg.C_INT.withName("tm_mday"),
        FFmpeg.C_INT.withName("tm_mon"),
        FFmpeg.C_INT.withName("tm_year"),
        FFmpeg.C_INT.withName("tm_wday"),
        FFmpeg.C_INT.withName("tm_yday"),
        FFmpeg.C_INT.withName("tm_isdst"),
        MemoryLayout.paddingLayout(4),
        FFmpeg.C_LONG.withName("tm_gmtoff"),
        FFmpeg.C_POINTER.withName("tm_zone")
    ).withName("tm");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt tm_sec$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tm_sec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tm_sec
     * }
     */
    public static final OfInt tm_sec$layout() {
        return tm_sec$LAYOUT;
    }

    private static final long tm_sec$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tm_sec
     * }
     */
    public static final long tm_sec$offset() {
        return tm_sec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tm_sec
     * }
     */
    public static int tm_sec(MemorySegment struct) {
        return struct.get(tm_sec$LAYOUT, tm_sec$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tm_sec
     * }
     */
    public static void tm_sec(MemorySegment struct, int fieldValue) {
        struct.set(tm_sec$LAYOUT, tm_sec$OFFSET, fieldValue);
    }

    private static final OfInt tm_min$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tm_min"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tm_min
     * }
     */
    public static final OfInt tm_min$layout() {
        return tm_min$LAYOUT;
    }

    private static final long tm_min$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tm_min
     * }
     */
    public static final long tm_min$offset() {
        return tm_min$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tm_min
     * }
     */
    public static int tm_min(MemorySegment struct) {
        return struct.get(tm_min$LAYOUT, tm_min$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tm_min
     * }
     */
    public static void tm_min(MemorySegment struct, int fieldValue) {
        struct.set(tm_min$LAYOUT, tm_min$OFFSET, fieldValue);
    }

    private static final OfInt tm_hour$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tm_hour"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tm_hour
     * }
     */
    public static final OfInt tm_hour$layout() {
        return tm_hour$LAYOUT;
    }

    private static final long tm_hour$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tm_hour
     * }
     */
    public static final long tm_hour$offset() {
        return tm_hour$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tm_hour
     * }
     */
    public static int tm_hour(MemorySegment struct) {
        return struct.get(tm_hour$LAYOUT, tm_hour$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tm_hour
     * }
     */
    public static void tm_hour(MemorySegment struct, int fieldValue) {
        struct.set(tm_hour$LAYOUT, tm_hour$OFFSET, fieldValue);
    }

    private static final OfInt tm_mday$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tm_mday"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tm_mday
     * }
     */
    public static final OfInt tm_mday$layout() {
        return tm_mday$LAYOUT;
    }

    private static final long tm_mday$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tm_mday
     * }
     */
    public static final long tm_mday$offset() {
        return tm_mday$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tm_mday
     * }
     */
    public static int tm_mday(MemorySegment struct) {
        return struct.get(tm_mday$LAYOUT, tm_mday$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tm_mday
     * }
     */
    public static void tm_mday(MemorySegment struct, int fieldValue) {
        struct.set(tm_mday$LAYOUT, tm_mday$OFFSET, fieldValue);
    }

    private static final OfInt tm_mon$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tm_mon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tm_mon
     * }
     */
    public static final OfInt tm_mon$layout() {
        return tm_mon$LAYOUT;
    }

    private static final long tm_mon$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tm_mon
     * }
     */
    public static final long tm_mon$offset() {
        return tm_mon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tm_mon
     * }
     */
    public static int tm_mon(MemorySegment struct) {
        return struct.get(tm_mon$LAYOUT, tm_mon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tm_mon
     * }
     */
    public static void tm_mon(MemorySegment struct, int fieldValue) {
        struct.set(tm_mon$LAYOUT, tm_mon$OFFSET, fieldValue);
    }

    private static final OfInt tm_year$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tm_year"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tm_year
     * }
     */
    public static final OfInt tm_year$layout() {
        return tm_year$LAYOUT;
    }

    private static final long tm_year$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tm_year
     * }
     */
    public static final long tm_year$offset() {
        return tm_year$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tm_year
     * }
     */
    public static int tm_year(MemorySegment struct) {
        return struct.get(tm_year$LAYOUT, tm_year$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tm_year
     * }
     */
    public static void tm_year(MemorySegment struct, int fieldValue) {
        struct.set(tm_year$LAYOUT, tm_year$OFFSET, fieldValue);
    }

    private static final OfInt tm_wday$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tm_wday"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tm_wday
     * }
     */
    public static final OfInt tm_wday$layout() {
        return tm_wday$LAYOUT;
    }

    private static final long tm_wday$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tm_wday
     * }
     */
    public static final long tm_wday$offset() {
        return tm_wday$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tm_wday
     * }
     */
    public static int tm_wday(MemorySegment struct) {
        return struct.get(tm_wday$LAYOUT, tm_wday$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tm_wday
     * }
     */
    public static void tm_wday(MemorySegment struct, int fieldValue) {
        struct.set(tm_wday$LAYOUT, tm_wday$OFFSET, fieldValue);
    }

    private static final OfInt tm_yday$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tm_yday"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tm_yday
     * }
     */
    public static final OfInt tm_yday$layout() {
        return tm_yday$LAYOUT;
    }

    private static final long tm_yday$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tm_yday
     * }
     */
    public static final long tm_yday$offset() {
        return tm_yday$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tm_yday
     * }
     */
    public static int tm_yday(MemorySegment struct) {
        return struct.get(tm_yday$LAYOUT, tm_yday$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tm_yday
     * }
     */
    public static void tm_yday(MemorySegment struct, int fieldValue) {
        struct.set(tm_yday$LAYOUT, tm_yday$OFFSET, fieldValue);
    }

    private static final OfInt tm_isdst$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tm_isdst"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tm_isdst
     * }
     */
    public static final OfInt tm_isdst$layout() {
        return tm_isdst$LAYOUT;
    }

    private static final long tm_isdst$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tm_isdst
     * }
     */
    public static final long tm_isdst$offset() {
        return tm_isdst$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tm_isdst
     * }
     */
    public static int tm_isdst(MemorySegment struct) {
        return struct.get(tm_isdst$LAYOUT, tm_isdst$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tm_isdst
     * }
     */
    public static void tm_isdst(MemorySegment struct, int fieldValue) {
        struct.set(tm_isdst$LAYOUT, tm_isdst$OFFSET, fieldValue);
    }

    private static final OfLong tm_gmtoff$LAYOUT = (OfLong)$LAYOUT.select(groupElement("tm_gmtoff"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long tm_gmtoff
     * }
     */
    public static final OfLong tm_gmtoff$layout() {
        return tm_gmtoff$LAYOUT;
    }

    private static final long tm_gmtoff$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long tm_gmtoff
     * }
     */
    public static final long tm_gmtoff$offset() {
        return tm_gmtoff$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long tm_gmtoff
     * }
     */
    public static long tm_gmtoff(MemorySegment struct) {
        return struct.get(tm_gmtoff$LAYOUT, tm_gmtoff$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long tm_gmtoff
     * }
     */
    public static void tm_gmtoff(MemorySegment struct, long fieldValue) {
        struct.set(tm_gmtoff$LAYOUT, tm_gmtoff$OFFSET, fieldValue);
    }

    private static final AddressLayout tm_zone$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("tm_zone"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *tm_zone
     * }
     */
    public static final AddressLayout tm_zone$layout() {
        return tm_zone$LAYOUT;
    }

    private static final long tm_zone$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *tm_zone
     * }
     */
    public static final long tm_zone$offset() {
        return tm_zone$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *tm_zone
     * }
     */
    public static MemorySegment tm_zone(MemorySegment struct) {
        return struct.get(tm_zone$LAYOUT, tm_zone$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *tm_zone
     * }
     */
    public static void tm_zone(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(tm_zone$LAYOUT, tm_zone$OFFSET, fieldValue);
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

