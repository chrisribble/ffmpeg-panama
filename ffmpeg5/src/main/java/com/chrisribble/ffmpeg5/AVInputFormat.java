// Generated by jextract

package com.chrisribble.ffmpeg5;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct AVInputFormat {
 *     char* name;
 *     char* long_name;
 *     int flags;
 *     char* extensions;
 *     struct AVCodecTag** codec_tag;
 *     struct AVClass* priv_class;
 *     char* mime_type;
 *     int raw_codec_id;
 *     int priv_data_size;
 *     int flags_internal;
 *     int (*read_probe)(struct AVProbeData*);
 *     int (*read_header)(struct AVFormatContext*);
 *     int (*read_packet)(struct AVFormatContext*,struct AVPacket*);
 *     int (*read_close)(struct AVFormatContext*);
 *     int (*read_seek)(struct AVFormatContext*,int,long,int);
 *     long (*read_timestamp)(struct AVFormatContext*,int,long*,long);
 *     int (*read_play)(struct AVFormatContext*);
 *     int (*read_pause)(struct AVFormatContext*);
 *     int (*read_seek2)(struct AVFormatContext*,int,long,long,long,int);
 *     int (*get_device_list)(struct AVFormatContext*,struct AVDeviceInfoList*);
 * };
 * }
 */
public class AVInputFormat {

    public static MemoryLayout $LAYOUT() {
        return constants$298.const$5;
    }
    public static VarHandle name$VH() {
        return constants$299.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$299.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$299.const$0.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$299.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$299.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle long_name$VH() {
        return constants$299.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* long_name;
     * }
     */
    public static MemorySegment long_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$299.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* long_name;
     * }
     */
    public static void long_name$set(MemorySegment seg, MemorySegment x) {
        constants$299.const$1.set(seg, x);
    }
    public static MemorySegment long_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$299.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void long_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$299.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$299.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$299.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$299.const$2.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$299.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$299.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle extensions$VH() {
        return constants$299.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* extensions;
     * }
     */
    public static MemorySegment extensions$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$299.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* extensions;
     * }
     */
    public static void extensions$set(MemorySegment seg, MemorySegment x) {
        constants$299.const$3.set(seg, x);
    }
    public static MemorySegment extensions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$299.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void extensions$set(MemorySegment seg, long index, MemorySegment x) {
        constants$299.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle codec_tag$VH() {
        return constants$299.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVCodecTag** codec_tag;
     * }
     */
    public static MemorySegment codec_tag$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$299.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVCodecTag** codec_tag;
     * }
     */
    public static void codec_tag$set(MemorySegment seg, MemorySegment x) {
        constants$299.const$4.set(seg, x);
    }
    public static MemorySegment codec_tag$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$299.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void codec_tag$set(MemorySegment seg, long index, MemorySegment x) {
        constants$299.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle priv_class$VH() {
        return constants$299.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct AVClass* priv_class;
     * }
     */
    public static MemorySegment priv_class$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$299.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct AVClass* priv_class;
     * }
     */
    public static void priv_class$set(MemorySegment seg, MemorySegment x) {
        constants$299.const$5.set(seg, x);
    }
    public static MemorySegment priv_class$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$299.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void priv_class$set(MemorySegment seg, long index, MemorySegment x) {
        constants$299.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mime_type$VH() {
        return constants$300.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* mime_type;
     * }
     */
    public static MemorySegment mime_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$300.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* mime_type;
     * }
     */
    public static void mime_type$set(MemorySegment seg, MemorySegment x) {
        constants$300.const$0.set(seg, x);
    }
    public static MemorySegment mime_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$300.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void mime_type$set(MemorySegment seg, long index, MemorySegment x) {
        constants$300.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle raw_codec_id$VH() {
        return constants$300.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int raw_codec_id;
     * }
     */
    public static int raw_codec_id$get(MemorySegment seg) {
        return (int)constants$300.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int raw_codec_id;
     * }
     */
    public static void raw_codec_id$set(MemorySegment seg, int x) {
        constants$300.const$1.set(seg, x);
    }
    public static int raw_codec_id$get(MemorySegment seg, long index) {
        return (int)constants$300.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void raw_codec_id$set(MemorySegment seg, long index, int x) {
        constants$300.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle priv_data_size$VH() {
        return constants$300.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int priv_data_size;
     * }
     */
    public static int priv_data_size$get(MemorySegment seg) {
        return (int)constants$300.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int priv_data_size;
     * }
     */
    public static void priv_data_size$set(MemorySegment seg, int x) {
        constants$300.const$2.set(seg, x);
    }
    public static int priv_data_size$get(MemorySegment seg, long index) {
        return (int)constants$300.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void priv_data_size$set(MemorySegment seg, long index, int x) {
        constants$300.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags_internal$VH() {
        return constants$300.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags_internal;
     * }
     */
    public static int flags_internal$get(MemorySegment seg) {
        return (int)constants$300.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags_internal;
     * }
     */
    public static void flags_internal$set(MemorySegment seg, int x) {
        constants$300.const$3.set(seg, x);
    }
    public static int flags_internal$get(MemorySegment seg, long index) {
        return (int)constants$300.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flags_internal$set(MemorySegment seg, long index, int x) {
        constants$300.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * int (*read_probe)(struct AVProbeData*);
     * }
     */
    public interface read_probe {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(read_probe fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$300.const$4, fi, constants$0.const$3, scope);
        }
        static read_probe ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$142.const$4.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_probe$VH() {
        return constants$300.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_probe)(struct AVProbeData*);
     * }
     */
    public static MemorySegment read_probe$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$300.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_probe)(struct AVProbeData*);
     * }
     */
    public static void read_probe$set(MemorySegment seg, MemorySegment x) {
        constants$300.const$5.set(seg, x);
    }
    public static MemorySegment read_probe$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$300.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void read_probe$set(MemorySegment seg, long index, MemorySegment x) {
        constants$300.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_probe read_probe(MemorySegment segment, Arena scope) {
        return read_probe.ofAddress(read_probe$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*read_header)(struct AVFormatContext*);
     * }
     */
    public interface read_header {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(read_header fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$301.const$0, fi, constants$0.const$3, scope);
        }
        static read_header ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$142.const$4.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_header$VH() {
        return constants$301.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_header)(struct AVFormatContext*);
     * }
     */
    public static MemorySegment read_header$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$301.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_header)(struct AVFormatContext*);
     * }
     */
    public static void read_header$set(MemorySegment seg, MemorySegment x) {
        constants$301.const$1.set(seg, x);
    }
    public static MemorySegment read_header$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$301.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void read_header$set(MemorySegment seg, long index, MemorySegment x) {
        constants$301.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_header read_header(MemorySegment segment, Arena scope) {
        return read_header.ofAddress(read_header$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*read_packet)(struct AVFormatContext*,struct AVPacket*);
     * }
     */
    public interface read_packet {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(read_packet fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$301.const$2, fi, constants$66.const$1, scope);
        }
        static read_packet ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$112.const$3.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_packet$VH() {
        return constants$301.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_packet)(struct AVFormatContext*,struct AVPacket*);
     * }
     */
    public static MemorySegment read_packet$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$301.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_packet)(struct AVFormatContext*,struct AVPacket*);
     * }
     */
    public static void read_packet$set(MemorySegment seg, MemorySegment x) {
        constants$301.const$3.set(seg, x);
    }
    public static MemorySegment read_packet$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$301.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void read_packet$set(MemorySegment seg, long index, MemorySegment x) {
        constants$301.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_packet read_packet(MemorySegment segment, Arena scope) {
        return read_packet.ofAddress(read_packet$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*read_close)(struct AVFormatContext*);
     * }
     */
    public interface read_close {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(read_close fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$301.const$4, fi, constants$0.const$3, scope);
        }
        static read_close ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$142.const$4.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_close$VH() {
        return constants$301.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_close)(struct AVFormatContext*);
     * }
     */
    public static MemorySegment read_close$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$301.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_close)(struct AVFormatContext*);
     * }
     */
    public static void read_close$set(MemorySegment seg, MemorySegment x) {
        constants$301.const$5.set(seg, x);
    }
    public static MemorySegment read_close$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$301.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void read_close$set(MemorySegment seg, long index, MemorySegment x) {
        constants$301.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_close read_close(MemorySegment segment, Arena scope) {
        return read_close.ofAddress(read_close$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*read_seek)(struct AVFormatContext*,int,long,int);
     * }
     */
    public interface read_seek {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, long _x2, int _x3);
        static MemorySegment allocate(read_seek fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$302.const$1, fi, constants$302.const$0, scope);
        }
        static read_seek ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, long __x2, int __x3) -> {
                try {
                    return (int)constants$302.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_seek$VH() {
        return constants$302.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_seek)(struct AVFormatContext*,int,long,int);
     * }
     */
    public static MemorySegment read_seek$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$302.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_seek)(struct AVFormatContext*,int,long,int);
     * }
     */
    public static void read_seek$set(MemorySegment seg, MemorySegment x) {
        constants$302.const$3.set(seg, x);
    }
    public static MemorySegment read_seek$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$302.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void read_seek$set(MemorySegment seg, long index, MemorySegment x) {
        constants$302.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_seek read_seek(MemorySegment segment, Arena scope) {
        return read_seek.ofAddress(read_seek$get(segment), scope);
    }
    /**
     * {@snippet :
 * long (*read_timestamp)(struct AVFormatContext*,int,long*,long);
     * }
     */
    public interface read_timestamp {

        long apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, long _x3);
        static MemorySegment allocate(read_timestamp fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$302.const$5, fi, constants$302.const$4, scope);
        }
        static read_timestamp ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, long __x3) -> {
                try {
                    return (long)constants$303.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_timestamp$VH() {
        return constants$303.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long (*read_timestamp)(struct AVFormatContext*,int,long*,long);
     * }
     */
    public static MemorySegment read_timestamp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$303.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long (*read_timestamp)(struct AVFormatContext*,int,long*,long);
     * }
     */
    public static void read_timestamp$set(MemorySegment seg, MemorySegment x) {
        constants$303.const$1.set(seg, x);
    }
    public static MemorySegment read_timestamp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$303.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void read_timestamp$set(MemorySegment seg, long index, MemorySegment x) {
        constants$303.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_timestamp read_timestamp(MemorySegment segment, Arena scope) {
        return read_timestamp.ofAddress(read_timestamp$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*read_play)(struct AVFormatContext*);
     * }
     */
    public interface read_play {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(read_play fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$303.const$2, fi, constants$0.const$3, scope);
        }
        static read_play ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$142.const$4.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_play$VH() {
        return constants$303.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_play)(struct AVFormatContext*);
     * }
     */
    public static MemorySegment read_play$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$303.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_play)(struct AVFormatContext*);
     * }
     */
    public static void read_play$set(MemorySegment seg, MemorySegment x) {
        constants$303.const$3.set(seg, x);
    }
    public static MemorySegment read_play$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$303.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void read_play$set(MemorySegment seg, long index, MemorySegment x) {
        constants$303.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_play read_play(MemorySegment segment, Arena scope) {
        return read_play.ofAddress(read_play$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*read_pause)(struct AVFormatContext*);
     * }
     */
    public interface read_pause {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(read_pause fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$303.const$4, fi, constants$0.const$3, scope);
        }
        static read_pause ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)constants$142.const$4.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_pause$VH() {
        return constants$303.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_pause)(struct AVFormatContext*);
     * }
     */
    public static MemorySegment read_pause$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$303.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_pause)(struct AVFormatContext*);
     * }
     */
    public static void read_pause$set(MemorySegment seg, MemorySegment x) {
        constants$303.const$5.set(seg, x);
    }
    public static MemorySegment read_pause$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$303.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void read_pause$set(MemorySegment seg, long index, MemorySegment x) {
        constants$303.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_pause read_pause(MemorySegment segment, Arena scope) {
        return read_pause.ofAddress(read_pause$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*read_seek2)(struct AVFormatContext*,int,long,long,long,int);
     * }
     */
    public interface read_seek2 {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1, long _x2, long _x3, long _x4, int _x5);
        static MemorySegment allocate(read_seek2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$304.const$1, fi, constants$304.const$0, scope);
        }
        static read_seek2 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, long __x2, long __x3, long __x4, int __x5) -> {
                try {
                    return (int)constants$304.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_seek2$VH() {
        return constants$304.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*read_seek2)(struct AVFormatContext*,int,long,long,long,int);
     * }
     */
    public static MemorySegment read_seek2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$304.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*read_seek2)(struct AVFormatContext*,int,long,long,long,int);
     * }
     */
    public static void read_seek2$set(MemorySegment seg, MemorySegment x) {
        constants$304.const$3.set(seg, x);
    }
    public static MemorySegment read_seek2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$304.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void read_seek2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$304.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_seek2 read_seek2(MemorySegment segment, Arena scope) {
        return read_seek2.ofAddress(read_seek2$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*get_device_list)(struct AVFormatContext*,struct AVDeviceInfoList*);
     * }
     */
    public interface get_device_list {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(get_device_list fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$304.const$4, fi, constants$66.const$1, scope);
        }
        static get_device_list ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$112.const$3.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_device_list$VH() {
        return constants$304.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_device_list)(struct AVFormatContext*,struct AVDeviceInfoList*);
     * }
     */
    public static MemorySegment get_device_list$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$304.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_device_list)(struct AVFormatContext*,struct AVDeviceInfoList*);
     * }
     */
    public static void get_device_list$set(MemorySegment seg, MemorySegment x) {
        constants$304.const$5.set(seg, x);
    }
    public static MemorySegment get_device_list$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$304.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_device_list$set(MemorySegment seg, long index, MemorySegment x) {
        constants$304.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_device_list get_device_list(MemorySegment segment, Arena scope) {
        return get_device_list.ofAddress(get_device_list$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


