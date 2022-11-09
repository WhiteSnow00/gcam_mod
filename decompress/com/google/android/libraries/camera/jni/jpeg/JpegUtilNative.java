// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.camera.jni.jpeg;

import java.util.List;
import java.util.Locale;
import android.os.SystemClock;
import android.graphics.Rect;
import java.nio.ByteBuffer;

public class JpegUtilNative
{
    static {
        krk.b(JpegUtilNative.class, "jpeg-jni");
    }
    
    public static int a(final lju lju, final ByteBuffer byteBuffer, final Rect rect, final kra kra) {
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        njo.p(byteBuffer.isDirect(), "Output buffer must be direct");
        njo.r(rect.left < rect.right, "Invalid crop rectangle: %s", rect);
        njo.r(rect.top < rect.bottom, "Invalid crop rectangle: %s", rect);
        njo.q(lju.a() == 35, "Only ImageFormat.YUV_420_888 is supported, found %s", lju.a());
        final List h = lju.h();
        final ljt ljt = h.get(0);
        final ljt ljt2 = h.get(1);
        final ljt ljt3 = h.get(2);
        njo.o(ljt.getBuffer().isDirect());
        njo.o(ljt2.getBuffer().isDirect());
        njo.o(ljt3.getBuffer().isDirect());
        njo.p(ljt.getPixelStride() == 1, "Pixel stride for luma (Y) plane must be 1.");
        njo.p(ljt2.getPixelStride() == 2, "Pixel stride for chroma (U) plane must be 2.");
        njo.p(ljt3.getPixelStride() == 2, "Pixel stride for chroma (V) plane must be 2.");
        njo.p(ljt2.getRowStride() == ljt3.getRowStride(), "Row strides for chroma planes (UV) must match.");
        byteBuffer.clear();
        final int c = lju.c();
        final int b = lju.b();
        final int compressJpegFromYUV420spNative = compressJpegFromYUV420spNative(c, b, ljt.getBuffer(), ljt.getPixelStride(), ljt.getRowStride(), ljt2.getBuffer(), ljt2.getPixelStride(), ljt2.getRowStride(), ljt3.getBuffer(), ljt3.getPixelStride(), ljt3.getRowStride(), byteBuffer, 95, ofi.y(rect.left, 0, c - 1), ofi.y(rect.top, 0, b - 1), ofi.y(rect.right, 0, c), ofi.y(rect.bottom, 0, b), kra.e);
        if (compressJpegFromYUV420spNative < byteBuffer.limit()) {
            byteBuffer.limit(compressJpegFromYUV420spNative);
        }
        final Locale root = Locale.ROOT;
        final double n = (double)(SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
        Double.isNaN(n);
        String.format(root, "Compressed %d bytes in %.2fms", compressJpegFromYUV420spNative, n / 1000000.0);
        return compressJpegFromYUV420spNative;
    }
    
    private static native int compressJpegFromYUV420spNative(final int p0, final int p1, final Object p2, final int p3, final int p4, final Object p5, final int p6, final int p7, final Object p8, final int p9, final int p10, final Object p11, final int p12, final int p13, final int p14, final int p15, final int p16, final int p17);
}
