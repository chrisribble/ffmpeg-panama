// Generated by jextract

package com.chrisribble.ffmpeg6;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVIOContext {
 *     const AVClass* av_class;
 *     unsigned char* buffer;
 *     int buffer_size;
 *     unsigned char* buf_ptr;
 *     unsigned char* buf_end;
 *     void* opaque;
 *     int (*read_packet)(void*,uint8_t*,int);
 *     int (*write_packet)(void*,uint8_t*,int);
 *     int64_t (*seek)(void*,int64_t,int);
 *     int64_t pos;
 *     int eof_reached;
 *     int error;
 *     int write_flag;
 *     int max_packet_size;
 *     int min_packet_size;
 *     unsigned long checksum;
 *     unsigned char* checksum_ptr;
 *     unsigned long (*update_checksum)(unsigned long,const uint8_t*,unsigned int);
 *     int (*read_pause)(void*,int);
 *     int64_t (*read_seek)(void*,int,int64_t,int);
 *     int seekable;
 *     int direct;
 *     char* protocol_whitelist;
 *     char* protocol_blacklist;
 *     int (*write_data_type)(void*,uint8_t*,int,enum AVIODataMarkerType,int64_t);
 *     int ignore_boundary_point;
 *     unsigned char* buf_ptr_max;
 *     int64_t bytes_read;
 *     int64_t bytes_written;
 * };
 * }
 */
public class AVIOContext {

    public static MemoryLayout $LAYOUT() {
        return constants$273.const$5;
    }
    public static VarHandle av_class$VH() {
        return constants$274.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const AVClass* av_class;
     * }
     */
    public static MemorySegment av_class$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$274.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const AVClass* av_class;
     * }
     */
    public static void av_class$set(MemorySegment seg, MemorySegment x) {
        constants$274.const$0.set(seg, x);
    }
    public static MemorySegment av_class$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$274.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void av_class$set(MemorySegment seg, long index, MemorySegment x) {
        constants$274.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buffer$VH() {
        return constants$274.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* buffer;
     * }
     */
    public static MemorySegment buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$274.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* buffer;
     * }
     */
    public static void buffer$set(MemorySegment seg, MemorySegment x) {
        constants$274.const$1.set(seg, x);
    }
    public static MemorySegment buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$274.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void buffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$274.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buffer_size$VH() {
        return constants$274.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int buffer_size;
     * }
     */
    public static int buffer_size$get(MemorySegment seg) {
        return (int)constants$274.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int buffer_size;
     * }
     */
    public static void buffer_size$set(MemorySegment seg, int x) {
        constants$274.const$2.set(seg, x);
    }
    public static int buffer_size$get(MemorySegment seg, long index) {
        return (int)constants$274.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void buffer_size$set(MemorySegment seg, long index, int x) {
        constants$274.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buf_ptr$VH() {
        return constants$274.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* buf_ptr;
     * }
     */
    public static MemorySegment buf_ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$274.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* buf_ptr;
     * }
     */
    public static void buf_ptr$set(MemorySegment seg, MemorySegment x) {
        constants$274.const$3.set(seg, x);
    }
    public static MemorySegment buf_ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$274.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void buf_ptr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$274.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buf_end$VH() {
        return constants$274.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* buf_end;
     * }
     */
    public static MemorySegment buf_end$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$274.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* buf_end;
     * }
     */
    public static void buf_end$set(MemorySegment seg, MemorySegment x) {
        constants$274.const$4.set(seg, x);
    }
    public static MemorySegment buf_end$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$274.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void buf_end$set(MemorySegment seg, long index, MemorySegment x) {
        constants$274.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle opaque$VH() {
        return constants$274.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* opaque;
     * }
     */
    public static MemorySegment opaque$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$274.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* opaque;
     * }
     */
    public static void opaque$set(MemorySegment seg, MemorySegment x) {
        constants$274.const$5.set(seg, x);
    }
    public static MemorySegment opaque$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$274.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void opaque$set(MemorySegment seg, long index, MemorySegment x) {
        constants$274.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * int (*read_packet)(void*,uint8_t*,int);
     * }
     */
    public interface read_packet {

        int apply(java.lang.foreign.MemorySegment __cookie, java.lang.foreign.MemorySegment __pos, int __w);
        static MemorySegment allocate(read_packet fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$275.const$0, fi, constants$66.const$0, scope);
        }
        static read_packet ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment ___cookie, java.lang.foreign.MemorySegment ___pos, int ___w) -> {
                try {
                    return (int)constants$66.const$2.invokeExact(symbol, ___cookie, ___pos, ___w);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_packet$VH() {
        return constants$275.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_packet)(void*,uint8_t*,int);
     * }
     */
    public static MemorySegment read_packet$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$275.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_packet)(void*,uint8_t*,int);
     * }
     */
    public static void read_packet$set(MemorySegment seg, MemorySegment x) {
        constants$275.const$1.set(seg, x);
    }
    public static MemorySegment read_packet$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$275.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void read_packet$set(MemorySegment seg, long index, MemorySegment x) {
        constants$275.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_packet read_packet(MemorySegment segment, Arena scope) {
        return read_packet.ofAddress(read_packet$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*write_packet)(void*,uint8_t*,int);
     * }
     */
    public interface write_packet {

        int apply(java.lang.foreign.MemorySegment __cookie, java.lang.foreign.MemorySegment __pos, int __w);
        static MemorySegment allocate(write_packet fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$275.const$2, fi, constants$66.const$0, scope);
        }
        static write_packet ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment ___cookie, java.lang.foreign.MemorySegment ___pos, int ___w) -> {
                try {
                    return (int)constants$66.const$2.invokeExact(symbol, ___cookie, ___pos, ___w);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle write_packet$VH() {
        return constants$275.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*write_packet)(void*,uint8_t*,int);
     * }
     */
    public static MemorySegment write_packet$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$275.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*write_packet)(void*,uint8_t*,int);
     * }
     */
    public static void write_packet$set(MemorySegment seg, MemorySegment x) {
        constants$275.const$3.set(seg, x);
    }
    public static MemorySegment write_packet$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$275.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void write_packet$set(MemorySegment seg, long index, MemorySegment x) {
        constants$275.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static write_packet write_packet(MemorySegment segment, Arena scope) {
        return write_packet.ofAddress(write_packet$get(segment), scope);
    }
    /**
     * {@snippet :
 * int64_t (*seek)(void*,int64_t,int);
     * }
     */
    public interface seek {

        long apply(java.lang.foreign.MemorySegment _x0, long _x1, int _x2);
        static MemorySegment allocate(seek fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$275.const$5, fi, constants$275.const$4, scope);
        }
        static seek ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, long __x1, int __x2) -> {
                try {
                    return (long)constants$276.const$0.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle seek$VH() {
        return constants$276.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t (*seek)(void*,int64_t,int);
     * }
     */
    public static MemorySegment seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$276.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t (*seek)(void*,int64_t,int);
     * }
     */
    public static void seek$set(MemorySegment seg, MemorySegment x) {
        constants$276.const$1.set(seg, x);
    }
    public static MemorySegment seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$276.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void seek$set(MemorySegment seg, long index, MemorySegment x) {
        constants$276.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static seek seek(MemorySegment segment, Arena scope) {
        return seek.ofAddress(seek$get(segment), scope);
    }
    public static VarHandle pos$VH() {
        return constants$276.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t pos;
     * }
     */
    public static long pos$get(MemorySegment seg) {
        return (long)constants$276.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t pos;
     * }
     */
    public static void pos$set(MemorySegment seg, long x) {
        constants$276.const$2.set(seg, x);
    }
    public static long pos$get(MemorySegment seg, long index) {
        return (long)constants$276.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pos$set(MemorySegment seg, long index, long x) {
        constants$276.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle eof_reached$VH() {
        return constants$276.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int eof_reached;
     * }
     */
    public static int eof_reached$get(MemorySegment seg) {
        return (int)constants$276.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int eof_reached;
     * }
     */
    public static void eof_reached$set(MemorySegment seg, int x) {
        constants$276.const$3.set(seg, x);
    }
    public static int eof_reached$get(MemorySegment seg, long index) {
        return (int)constants$276.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void eof_reached$set(MemorySegment seg, long index, int x) {
        constants$276.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle error$VH() {
        return constants$276.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int error;
     * }
     */
    public static int error$get(MemorySegment seg) {
        return (int)constants$276.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int error;
     * }
     */
    public static void error$set(MemorySegment seg, int x) {
        constants$276.const$4.set(seg, x);
    }
    public static int error$get(MemorySegment seg, long index) {
        return (int)constants$276.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void error$set(MemorySegment seg, long index, int x) {
        constants$276.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle write_flag$VH() {
        return constants$276.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int write_flag;
     * }
     */
    public static int write_flag$get(MemorySegment seg) {
        return (int)constants$276.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int write_flag;
     * }
     */
    public static void write_flag$set(MemorySegment seg, int x) {
        constants$276.const$5.set(seg, x);
    }
    public static int write_flag$get(MemorySegment seg, long index) {
        return (int)constants$276.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void write_flag$set(MemorySegment seg, long index, int x) {
        constants$276.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_packet_size$VH() {
        return constants$277.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int max_packet_size;
     * }
     */
    public static int max_packet_size$get(MemorySegment seg) {
        return (int)constants$277.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int max_packet_size;
     * }
     */
    public static void max_packet_size$set(MemorySegment seg, int x) {
        constants$277.const$0.set(seg, x);
    }
    public static int max_packet_size$get(MemorySegment seg, long index) {
        return (int)constants$277.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void max_packet_size$set(MemorySegment seg, long index, int x) {
        constants$277.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle min_packet_size$VH() {
        return constants$277.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int min_packet_size;
     * }
     */
    public static int min_packet_size$get(MemorySegment seg) {
        return (int)constants$277.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int min_packet_size;
     * }
     */
    public static void min_packet_size$set(MemorySegment seg, int x) {
        constants$277.const$1.set(seg, x);
    }
    public static int min_packet_size$get(MemorySegment seg, long index) {
        return (int)constants$277.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void min_packet_size$set(MemorySegment seg, long index, int x) {
        constants$277.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle checksum$VH() {
        return constants$277.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long checksum;
     * }
     */
    public static long checksum$get(MemorySegment seg) {
        return (long)constants$277.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long checksum;
     * }
     */
    public static void checksum$set(MemorySegment seg, long x) {
        constants$277.const$2.set(seg, x);
    }
    public static long checksum$get(MemorySegment seg, long index) {
        return (long)constants$277.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void checksum$set(MemorySegment seg, long index, long x) {
        constants$277.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle checksum_ptr$VH() {
        return constants$277.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* checksum_ptr;
     * }
     */
    public static MemorySegment checksum_ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$277.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* checksum_ptr;
     * }
     */
    public static void checksum_ptr$set(MemorySegment seg, MemorySegment x) {
        constants$277.const$3.set(seg, x);
    }
    public static MemorySegment checksum_ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$277.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void checksum_ptr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$277.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * unsigned long (*update_checksum)(unsigned long,const uint8_t*,unsigned int);
     * }
     */
    public interface update_checksum {

        long apply(long _x0, java.lang.foreign.MemorySegment _x1, int _x2);
        static MemorySegment allocate(update_checksum fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$277.const$5, fi, constants$277.const$4, scope);
        }
        static update_checksum ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (long __x0, java.lang.foreign.MemorySegment __x1, int __x2) -> {
                try {
                    return (long)constants$278.const$0.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle update_checksum$VH() {
        return constants$278.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long (*update_checksum)(unsigned long,const uint8_t*,unsigned int);
     * }
     */
    public static MemorySegment update_checksum$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$278.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long (*update_checksum)(unsigned long,const uint8_t*,unsigned int);
     * }
     */
    public static void update_checksum$set(MemorySegment seg, MemorySegment x) {
        constants$278.const$1.set(seg, x);
    }
    public static MemorySegment update_checksum$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$278.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void update_checksum$set(MemorySegment seg, long index, MemorySegment x) {
        constants$278.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static update_checksum update_checksum(MemorySegment segment, Arena scope) {
        return update_checksum.ofAddress(update_checksum$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*read_pause)(void*,int);
     * }
     */
    public interface read_pause {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(read_pause fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$278.const$2, fi, constants$85.const$5, scope);
        }
        static read_pause ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)constants$278.const$3.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_pause$VH() {
        return constants$278.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_pause)(void*,int);
     * }
     */
    public static MemorySegment read_pause$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$278.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_pause)(void*,int);
     * }
     */
    public static void read_pause$set(MemorySegment seg, MemorySegment x) {
        constants$278.const$4.set(seg, x);
    }
    public static MemorySegment read_pause$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$278.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void read_pause$set(MemorySegment seg, long index, MemorySegment x) {
        constants$278.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_pause read_pause(MemorySegment segment, Arena scope) {
        return read_pause.ofAddress(read_pause$get(segment), scope);
    }
    /**
     * {@snippet :
 * int64_t (*read_seek)(void*,int,int64_t,int);
     * }
     */
    public interface read_seek {

        long apply(java.lang.foreign.MemorySegment _x0, int _x1, long _x2, int _x3);
        static MemorySegment allocate(read_seek fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$279.const$0, fi, constants$278.const$5, scope);
        }
        static read_seek ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, long __x2, int __x3) -> {
                try {
                    return (long)constants$279.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_seek$VH() {
        return constants$279.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t (*read_seek)(void*,int,int64_t,int);
     * }
     */
    public static MemorySegment read_seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$279.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t (*read_seek)(void*,int,int64_t,int);
     * }
     */
    public static void read_seek$set(MemorySegment seg, MemorySegment x) {
        constants$279.const$2.set(seg, x);
    }
    public static MemorySegment read_seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$279.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void read_seek$set(MemorySegment seg, long index, MemorySegment x) {
        constants$279.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_seek read_seek(MemorySegment segment, Arena scope) {
        return read_seek.ofAddress(read_seek$get(segment), scope);
    }
    public static VarHandle seekable$VH() {
        return constants$279.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int seekable;
     * }
     */
    public static int seekable$get(MemorySegment seg) {
        return (int)constants$279.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int seekable;
     * }
     */
    public static void seekable$set(MemorySegment seg, int x) {
        constants$279.const$3.set(seg, x);
    }
    public static int seekable$get(MemorySegment seg, long index) {
        return (int)constants$279.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void seekable$set(MemorySegment seg, long index, int x) {
        constants$279.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle direct$VH() {
        return constants$279.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int direct;
     * }
     */
    public static int direct$get(MemorySegment seg) {
        return (int)constants$279.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int direct;
     * }
     */
    public static void direct$set(MemorySegment seg, int x) {
        constants$279.const$4.set(seg, x);
    }
    public static int direct$get(MemorySegment seg, long index) {
        return (int)constants$279.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void direct$set(MemorySegment seg, long index, int x) {
        constants$279.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle protocol_whitelist$VH() {
        return constants$279.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* protocol_whitelist;
     * }
     */
    public static MemorySegment protocol_whitelist$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$279.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* protocol_whitelist;
     * }
     */
    public static void protocol_whitelist$set(MemorySegment seg, MemorySegment x) {
        constants$279.const$5.set(seg, x);
    }
    public static MemorySegment protocol_whitelist$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$279.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void protocol_whitelist$set(MemorySegment seg, long index, MemorySegment x) {
        constants$279.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle protocol_blacklist$VH() {
        return constants$280.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* protocol_blacklist;
     * }
     */
    public static MemorySegment protocol_blacklist$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$280.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* protocol_blacklist;
     * }
     */
    public static void protocol_blacklist$set(MemorySegment seg, MemorySegment x) {
        constants$280.const$0.set(seg, x);
    }
    public static MemorySegment protocol_blacklist$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$280.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void protocol_blacklist$set(MemorySegment seg, long index, MemorySegment x) {
        constants$280.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * int (*write_data_type)(void*,uint8_t*,int,enum AVIODataMarkerType,int64_t);
     * }
     */
    public interface write_data_type {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, long _x4);
        static MemorySegment allocate(write_data_type fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$280.const$2, fi, constants$280.const$1, scope);
        }
        static write_data_type ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, long __x4) -> {
                try {
                    return (int)constants$280.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle write_data_type$VH() {
        return constants$280.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*write_data_type)(void*,uint8_t*,int,enum AVIODataMarkerType,int64_t);
     * }
     */
    public static MemorySegment write_data_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$280.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*write_data_type)(void*,uint8_t*,int,enum AVIODataMarkerType,int64_t);
     * }
     */
    public static void write_data_type$set(MemorySegment seg, MemorySegment x) {
        constants$280.const$4.set(seg, x);
    }
    public static MemorySegment write_data_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$280.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void write_data_type$set(MemorySegment seg, long index, MemorySegment x) {
        constants$280.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static write_data_type write_data_type(MemorySegment segment, Arena scope) {
        return write_data_type.ofAddress(write_data_type$get(segment), scope);
    }
    public static VarHandle ignore_boundary_point$VH() {
        return constants$280.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int ignore_boundary_point;
     * }
     */
    public static int ignore_boundary_point$get(MemorySegment seg) {
        return (int)constants$280.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int ignore_boundary_point;
     * }
     */
    public static void ignore_boundary_point$set(MemorySegment seg, int x) {
        constants$280.const$5.set(seg, x);
    }
    public static int ignore_boundary_point$get(MemorySegment seg, long index) {
        return (int)constants$280.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ignore_boundary_point$set(MemorySegment seg, long index, int x) {
        constants$280.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buf_ptr_max$VH() {
        return constants$281.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* buf_ptr_max;
     * }
     */
    public static MemorySegment buf_ptr_max$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$281.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* buf_ptr_max;
     * }
     */
    public static void buf_ptr_max$set(MemorySegment seg, MemorySegment x) {
        constants$281.const$0.set(seg, x);
    }
    public static MemorySegment buf_ptr_max$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$281.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void buf_ptr_max$set(MemorySegment seg, long index, MemorySegment x) {
        constants$281.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bytes_read$VH() {
        return constants$281.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t bytes_read;
     * }
     */
    public static long bytes_read$get(MemorySegment seg) {
        return (long)constants$281.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t bytes_read;
     * }
     */
    public static void bytes_read$set(MemorySegment seg, long x) {
        constants$281.const$1.set(seg, x);
    }
    public static long bytes_read$get(MemorySegment seg, long index) {
        return (long)constants$281.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bytes_read$set(MemorySegment seg, long index, long x) {
        constants$281.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bytes_written$VH() {
        return constants$281.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int64_t bytes_written;
     * }
     */
    public static long bytes_written$get(MemorySegment seg) {
        return (long)constants$281.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int64_t bytes_written;
     * }
     */
    public static void bytes_written$set(MemorySegment seg, long x) {
        constants$281.const$2.set(seg, x);
    }
    public static long bytes_written$get(MemorySegment seg, long index) {
        return (long)constants$281.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void bytes_written$set(MemorySegment seg, long index, long x) {
        constants$281.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


