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
 * struct AVPixFmtDescriptor {
 *     const char *name;
 *     uint8_t nb_components;
 *     uint8_t log2_chroma_w;
 *     uint8_t log2_chroma_h;
 *     uint64_t flags;
 *     AVComponentDescriptor comp[4];
 *     const char *alias;
 * }
 * }
 */
public class AVPixFmtDescriptor {

    AVPixFmtDescriptor() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_POINTER.withName("name"),
        FFmpeg.C_CHAR.withName("nb_components"),
        FFmpeg.C_CHAR.withName("log2_chroma_w"),
        FFmpeg.C_CHAR.withName("log2_chroma_h"),
        MemoryLayout.paddingLayout(5),
        FFmpeg.C_LONG.withName("flags"),
        MemoryLayout.sequenceLayout(4, AVComponentDescriptor.layout()).withName("comp"),
        FFmpeg.C_POINTER.withName("alias")
    ).withName("AVPixFmtDescriptor");

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

    private static final OfByte nb_components$LAYOUT = (OfByte)$LAYOUT.select(groupElement("nb_components"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t nb_components
     * }
     */
    public static final OfByte nb_components$layout() {
        return nb_components$LAYOUT;
    }

    private static final long nb_components$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t nb_components
     * }
     */
    public static final long nb_components$offset() {
        return nb_components$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t nb_components
     * }
     */
    public static byte nb_components(MemorySegment struct) {
        return struct.get(nb_components$LAYOUT, nb_components$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t nb_components
     * }
     */
    public static void nb_components(MemorySegment struct, byte fieldValue) {
        struct.set(nb_components$LAYOUT, nb_components$OFFSET, fieldValue);
    }

    private static final OfByte log2_chroma_w$LAYOUT = (OfByte)$LAYOUT.select(groupElement("log2_chroma_w"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t log2_chroma_w
     * }
     */
    public static final OfByte log2_chroma_w$layout() {
        return log2_chroma_w$LAYOUT;
    }

    private static final long log2_chroma_w$OFFSET = 9;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t log2_chroma_w
     * }
     */
    public static final long log2_chroma_w$offset() {
        return log2_chroma_w$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t log2_chroma_w
     * }
     */
    public static byte log2_chroma_w(MemorySegment struct) {
        return struct.get(log2_chroma_w$LAYOUT, log2_chroma_w$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t log2_chroma_w
     * }
     */
    public static void log2_chroma_w(MemorySegment struct, byte fieldValue) {
        struct.set(log2_chroma_w$LAYOUT, log2_chroma_w$OFFSET, fieldValue);
    }

    private static final OfByte log2_chroma_h$LAYOUT = (OfByte)$LAYOUT.select(groupElement("log2_chroma_h"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t log2_chroma_h
     * }
     */
    public static final OfByte log2_chroma_h$layout() {
        return log2_chroma_h$LAYOUT;
    }

    private static final long log2_chroma_h$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t log2_chroma_h
     * }
     */
    public static final long log2_chroma_h$offset() {
        return log2_chroma_h$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t log2_chroma_h
     * }
     */
    public static byte log2_chroma_h(MemorySegment struct) {
        return struct.get(log2_chroma_h$LAYOUT, log2_chroma_h$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t log2_chroma_h
     * }
     */
    public static void log2_chroma_h(MemorySegment struct, byte fieldValue) {
        struct.set(log2_chroma_h$LAYOUT, log2_chroma_h$OFFSET, fieldValue);
    }

    private static final OfLong flags$LAYOUT = (OfLong)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t flags
     * }
     */
    public static final OfLong flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t flags
     * }
     */
    public static long flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t flags
     * }
     */
    public static void flags(MemorySegment struct, long fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final SequenceLayout comp$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("comp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVComponentDescriptor comp[4]
     * }
     */
    public static final SequenceLayout comp$layout() {
        return comp$LAYOUT;
    }

    private static final long comp$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVComponentDescriptor comp[4]
     * }
     */
    public static final long comp$offset() {
        return comp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVComponentDescriptor comp[4]
     * }
     */
    public static MemorySegment comp(MemorySegment struct) {
        return struct.asSlice(comp$OFFSET, comp$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVComponentDescriptor comp[4]
     * }
     */
    public static void comp(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, comp$OFFSET, comp$LAYOUT.byteSize());
    }

    private static long[] comp$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * AVComponentDescriptor comp[4]
     * }
     */
    public static long[] comp$dimensions() {
        return comp$DIMS;
    }
    private static final MethodHandle comp$ELEM_HANDLE = comp$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * AVComponentDescriptor comp[4]
     * }
     */
    public static MemorySegment comp(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)comp$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * AVComponentDescriptor comp[4]
     * }
     */
    public static void comp(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, comp(struct, index0), 0L, AVComponentDescriptor.layout().byteSize());
    }

    private static final AddressLayout alias$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("alias"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *alias
     * }
     */
    public static final AddressLayout alias$layout() {
        return alias$LAYOUT;
    }

    private static final long alias$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *alias
     * }
     */
    public static final long alias$offset() {
        return alias$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *alias
     * }
     */
    public static MemorySegment alias(MemorySegment struct) {
        return struct.get(alias$LAYOUT, alias$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *alias
     * }
     */
    public static void alias(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(alias$LAYOUT, alias$OFFSET, fieldValue);
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

