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
 * struct AVIODirEntry {
 *     char *name;
 *     int type;
 *     int utf8;
 *     int64_t size;
 *     int64_t modification_timestamp;
 *     int64_t access_timestamp;
 *     int64_t status_change_timestamp;
 *     int64_t user_id;
 *     int64_t group_id;
 *     int64_t filemode;
 * }
 * }
 */
public class AVIODirEntry {

    AVIODirEntry() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_POINTER.withName("name"),
        FFmpeg.C_INT.withName("type"),
        FFmpeg.C_INT.withName("utf8"),
        FFmpeg.C_LONG.withName("size"),
        FFmpeg.C_LONG.withName("modification_timestamp"),
        FFmpeg.C_LONG.withName("access_timestamp"),
        FFmpeg.C_LONG.withName("status_change_timestamp"),
        FFmpeg.C_LONG.withName("user_id"),
        FFmpeg.C_LONG.withName("group_id"),
        FFmpeg.C_LONG.withName("filemode")
    ).withName("AVIODirEntry");

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
     * char *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfInt utf8$LAYOUT = (OfInt)$LAYOUT.select(groupElement("utf8"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int utf8
     * }
     */
    public static final OfInt utf8$layout() {
        return utf8$LAYOUT;
    }

    private static final long utf8$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int utf8
     * }
     */
    public static final long utf8$offset() {
        return utf8$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int utf8
     * }
     */
    public static int utf8(MemorySegment struct) {
        return struct.get(utf8$LAYOUT, utf8$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int utf8
     * }
     */
    public static void utf8(MemorySegment struct, int fieldValue) {
        struct.set(utf8$LAYOUT, utf8$OFFSET, fieldValue);
    }

    private static final OfLong size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t size
     * }
     */
    public static final OfLong size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t size
     * }
     */
    public static long size(MemorySegment struct) {
        return struct.get(size$LAYOUT, size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t size
     * }
     */
    public static void size(MemorySegment struct, long fieldValue) {
        struct.set(size$LAYOUT, size$OFFSET, fieldValue);
    }

    private static final OfLong modification_timestamp$LAYOUT = (OfLong)$LAYOUT.select(groupElement("modification_timestamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t modification_timestamp
     * }
     */
    public static final OfLong modification_timestamp$layout() {
        return modification_timestamp$LAYOUT;
    }

    private static final long modification_timestamp$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t modification_timestamp
     * }
     */
    public static final long modification_timestamp$offset() {
        return modification_timestamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t modification_timestamp
     * }
     */
    public static long modification_timestamp(MemorySegment struct) {
        return struct.get(modification_timestamp$LAYOUT, modification_timestamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t modification_timestamp
     * }
     */
    public static void modification_timestamp(MemorySegment struct, long fieldValue) {
        struct.set(modification_timestamp$LAYOUT, modification_timestamp$OFFSET, fieldValue);
    }

    private static final OfLong access_timestamp$LAYOUT = (OfLong)$LAYOUT.select(groupElement("access_timestamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t access_timestamp
     * }
     */
    public static final OfLong access_timestamp$layout() {
        return access_timestamp$LAYOUT;
    }

    private static final long access_timestamp$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t access_timestamp
     * }
     */
    public static final long access_timestamp$offset() {
        return access_timestamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t access_timestamp
     * }
     */
    public static long access_timestamp(MemorySegment struct) {
        return struct.get(access_timestamp$LAYOUT, access_timestamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t access_timestamp
     * }
     */
    public static void access_timestamp(MemorySegment struct, long fieldValue) {
        struct.set(access_timestamp$LAYOUT, access_timestamp$OFFSET, fieldValue);
    }

    private static final OfLong status_change_timestamp$LAYOUT = (OfLong)$LAYOUT.select(groupElement("status_change_timestamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t status_change_timestamp
     * }
     */
    public static final OfLong status_change_timestamp$layout() {
        return status_change_timestamp$LAYOUT;
    }

    private static final long status_change_timestamp$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t status_change_timestamp
     * }
     */
    public static final long status_change_timestamp$offset() {
        return status_change_timestamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t status_change_timestamp
     * }
     */
    public static long status_change_timestamp(MemorySegment struct) {
        return struct.get(status_change_timestamp$LAYOUT, status_change_timestamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t status_change_timestamp
     * }
     */
    public static void status_change_timestamp(MemorySegment struct, long fieldValue) {
        struct.set(status_change_timestamp$LAYOUT, status_change_timestamp$OFFSET, fieldValue);
    }

    private static final OfLong user_id$LAYOUT = (OfLong)$LAYOUT.select(groupElement("user_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t user_id
     * }
     */
    public static final OfLong user_id$layout() {
        return user_id$LAYOUT;
    }

    private static final long user_id$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t user_id
     * }
     */
    public static final long user_id$offset() {
        return user_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t user_id
     * }
     */
    public static long user_id(MemorySegment struct) {
        return struct.get(user_id$LAYOUT, user_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t user_id
     * }
     */
    public static void user_id(MemorySegment struct, long fieldValue) {
        struct.set(user_id$LAYOUT, user_id$OFFSET, fieldValue);
    }

    private static final OfLong group_id$LAYOUT = (OfLong)$LAYOUT.select(groupElement("group_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t group_id
     * }
     */
    public static final OfLong group_id$layout() {
        return group_id$LAYOUT;
    }

    private static final long group_id$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t group_id
     * }
     */
    public static final long group_id$offset() {
        return group_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t group_id
     * }
     */
    public static long group_id(MemorySegment struct) {
        return struct.get(group_id$LAYOUT, group_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t group_id
     * }
     */
    public static void group_id(MemorySegment struct, long fieldValue) {
        struct.set(group_id$LAYOUT, group_id$OFFSET, fieldValue);
    }

    private static final OfLong filemode$LAYOUT = (OfLong)$LAYOUT.select(groupElement("filemode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t filemode
     * }
     */
    public static final OfLong filemode$layout() {
        return filemode$LAYOUT;
    }

    private static final long filemode$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t filemode
     * }
     */
    public static final long filemode$offset() {
        return filemode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t filemode
     * }
     */
    public static long filemode(MemorySegment struct) {
        return struct.get(filemode$LAYOUT, filemode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t filemode
     * }
     */
    public static void filemode(MemorySegment struct, long fieldValue) {
        struct.set(filemode$LAYOUT, filemode$OFFSET, fieldValue);
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

