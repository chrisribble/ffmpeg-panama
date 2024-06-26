// Generated by jextract

package io.github.chrisribble.ffmpeg6;

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
 * struct AVPacketList {
 *     AVPacket pkt;
 *     struct AVPacketList *next;
 * }
 * }
 */
public class AVPacketList {

    AVPacketList() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        AVPacket.layout().withName("pkt"),
        FFmpeg.C_POINTER.withName("next")
    ).withName("AVPacketList");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout pkt$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pkt"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * AVPacket pkt
     * }
     */
    public static final GroupLayout pkt$layout() {
        return pkt$LAYOUT;
    }

    private static final long pkt$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * AVPacket pkt
     * }
     */
    public static final long pkt$offset() {
        return pkt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * AVPacket pkt
     * }
     */
    public static MemorySegment pkt(MemorySegment struct) {
        return struct.asSlice(pkt$OFFSET, pkt$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * AVPacket pkt
     * }
     */
    public static void pkt(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pkt$OFFSET, pkt$LAYOUT.byteSize());
    }

    private static final AddressLayout next$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("next"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct AVPacketList *next
     * }
     */
    public static final AddressLayout next$layout() {
        return next$LAYOUT;
    }

    private static final long next$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct AVPacketList *next
     * }
     */
    public static final long next$offset() {
        return next$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct AVPacketList *next
     * }
     */
    public static MemorySegment next(MemorySegment struct) {
        return struct.get(next$LAYOUT, next$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct AVPacketList *next
     * }
     */
    public static void next(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(next$LAYOUT, next$OFFSET, fieldValue);
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

