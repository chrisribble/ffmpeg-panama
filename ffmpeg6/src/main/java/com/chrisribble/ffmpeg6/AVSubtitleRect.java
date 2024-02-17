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
 * struct AVSubtitleRect {
 *     int x;
 *     int y;
 *     int w;
 *     int h;
 *     int nb_colors;
 *     uint8_t *data[4];
 *     int linesize[4];
 *     enum AVSubtitleType type;
 *     char *text;
 *     char *ass;
 *     int flags;
 * }
 * }
 */
public class AVSubtitleRect {

    AVSubtitleRect() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        FFmpeg.C_INT.withName("x"),
        FFmpeg.C_INT.withName("y"),
        FFmpeg.C_INT.withName("w"),
        FFmpeg.C_INT.withName("h"),
        FFmpeg.C_INT.withName("nb_colors"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(4, FFmpeg.C_POINTER).withName("data"),
        MemoryLayout.sequenceLayout(4, FFmpeg.C_INT).withName("linesize"),
        FFmpeg.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        FFmpeg.C_POINTER.withName("text"),
        FFmpeg.C_POINTER.withName("ass"),
        FFmpeg.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("AVSubtitleRect");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt w$LAYOUT = (OfInt)$LAYOUT.select(groupElement("w"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int w
     * }
     */
    public static final OfInt w$layout() {
        return w$LAYOUT;
    }

    private static final long w$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int w
     * }
     */
    public static final long w$offset() {
        return w$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int w
     * }
     */
    public static int w(MemorySegment struct) {
        return struct.get(w$LAYOUT, w$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int w
     * }
     */
    public static void w(MemorySegment struct, int fieldValue) {
        struct.set(w$LAYOUT, w$OFFSET, fieldValue);
    }

    private static final OfInt h$LAYOUT = (OfInt)$LAYOUT.select(groupElement("h"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int h
     * }
     */
    public static final OfInt h$layout() {
        return h$LAYOUT;
    }

    private static final long h$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int h
     * }
     */
    public static final long h$offset() {
        return h$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int h
     * }
     */
    public static int h(MemorySegment struct) {
        return struct.get(h$LAYOUT, h$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int h
     * }
     */
    public static void h(MemorySegment struct, int fieldValue) {
        struct.set(h$LAYOUT, h$OFFSET, fieldValue);
    }

    private static final OfInt nb_colors$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nb_colors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int nb_colors
     * }
     */
    public static final OfInt nb_colors$layout() {
        return nb_colors$LAYOUT;
    }

    private static final long nb_colors$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int nb_colors
     * }
     */
    public static final long nb_colors$offset() {
        return nb_colors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int nb_colors
     * }
     */
    public static int nb_colors(MemorySegment struct) {
        return struct.get(nb_colors$LAYOUT, nb_colors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int nb_colors
     * }
     */
    public static void nb_colors(MemorySegment struct, int fieldValue) {
        struct.set(nb_colors$LAYOUT, nb_colors$OFFSET, fieldValue);
    }

    private static final SequenceLayout data$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint8_t *data[4]
     * }
     */
    public static final SequenceLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint8_t *data[4]
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint8_t *data[4]
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.asSlice(data$OFFSET, data$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint8_t *data[4]
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, data$OFFSET, data$LAYOUT.byteSize());
    }

    private static long[] data$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint8_t *data[4]
     * }
     */
    public static long[] data$dimensions() {
        return data$DIMS;
    }
    private static final VarHandle data$ELEM_HANDLE = data$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint8_t *data[4]
     * }
     */
    public static MemorySegment data(MemorySegment struct, long index0) {
        return (MemorySegment)data$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint8_t *data[4]
     * }
     */
    public static void data(MemorySegment struct, long index0, MemorySegment fieldValue) {
        data$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout linesize$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("linesize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int linesize[4]
     * }
     */
    public static final SequenceLayout linesize$layout() {
        return linesize$LAYOUT;
    }

    private static final long linesize$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int linesize[4]
     * }
     */
    public static final long linesize$offset() {
        return linesize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int linesize[4]
     * }
     */
    public static MemorySegment linesize(MemorySegment struct) {
        return struct.asSlice(linesize$OFFSET, linesize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int linesize[4]
     * }
     */
    public static void linesize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, linesize$OFFSET, linesize$LAYOUT.byteSize());
    }

    private static long[] linesize$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * int linesize[4]
     * }
     */
    public static long[] linesize$dimensions() {
        return linesize$DIMS;
    }
    private static final VarHandle linesize$ELEM_HANDLE = linesize$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * int linesize[4]
     * }
     */
    public static int linesize(MemorySegment struct, long index0) {
        return (int)linesize$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * int linesize[4]
     * }
     */
    public static void linesize(MemorySegment struct, long index0, int fieldValue) {
        linesize$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum AVSubtitleType type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum AVSubtitleType type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum AVSubtitleType type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum AVSubtitleType type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final AddressLayout text$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("text"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *text
     * }
     */
    public static final AddressLayout text$layout() {
        return text$LAYOUT;
    }

    private static final long text$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *text
     * }
     */
    public static final long text$offset() {
        return text$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *text
     * }
     */
    public static MemorySegment text(MemorySegment struct) {
        return struct.get(text$LAYOUT, text$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *text
     * }
     */
    public static void text(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(text$LAYOUT, text$OFFSET, fieldValue);
    }

    private static final AddressLayout ass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *ass
     * }
     */
    public static final AddressLayout ass$layout() {
        return ass$LAYOUT;
    }

    private static final long ass$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *ass
     * }
     */
    public static final long ass$offset() {
        return ass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *ass
     * }
     */
    public static MemorySegment ass(MemorySegment struct) {
        return struct.get(ass$LAYOUT, ass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *ass
     * }
     */
    public static void ass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ass$LAYOUT, ass$OFFSET, fieldValue);
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

    private static final long flags$OFFSET = 96;

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

