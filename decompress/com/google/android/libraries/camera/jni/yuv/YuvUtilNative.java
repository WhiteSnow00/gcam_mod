// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.camera.jni.yuv;

import java.nio.ByteBuffer;
import java.util.List;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public class YuvUtilNative
{
    static {
        krk.b(YuvUtilNative.class, "yuv-jni");
    }
    
    public static Bitmap a(final lju lju) {
        final lha a = lha.a;
        final List h = lju.h();
        final ljt ljt = h.get(0);
        final ljt ljt2 = h.get(1);
        final ljt ljt3 = h.get(2);
        final ByteBuffer buffer = ljt.getBuffer();
        final ByteBuffer buffer2 = ljt2.getBuffer();
        final ByteBuffer buffer3 = ljt3.getBuffer();
        final int c = lju.c();
        final int b = lju.b();
        final int[] array = new int[c * b];
        Bitmap bitmap;
        if (!convertYUV420ToARGBNative(lju.c(), lju.b(), buffer, ljt.getPixelStride(), ljt.getRowStride(), buffer2, ljt2.getPixelStride(), ljt2.getRowStride(), buffer3, ljt3.getPixelStride(), ljt3.getRowStride(), array, a.i)) {
            bitmap = null;
        }
        else if (a.j) {
            bitmap = Bitmap.createBitmap(array, b, c, Bitmap$Config.ARGB_8888);
        }
        else {
            bitmap = Bitmap.createBitmap(array, c, b, Bitmap$Config.ARGB_8888);
        }
        return bitmap;
    }
    
    private static native boolean convertYUV420ToARGBNative(final int p0, final int p1, final ByteBuffer p2, final int p3, final int p4, final ByteBuffer p5, final int p6, final int p7, final ByteBuffer p8, final int p9, final int p10, final int[] p11, final int p12);
    
    public static native boolean copyYUV_420_888Native(final int p0, final int p1, final ByteBuffer p2, final ByteBuffer p3, final ByteBuffer p4, final int p5, final int p6, final int p7, final ByteBuffer p8, final ByteBuffer p9, final ByteBuffer p10, final int p11, final int p12, final int p13);
    
    public static native boolean downsampleYUV_420_888toNV21Native(final int p0, final int p1, final ByteBuffer p2, final int p3, final int p4, final ByteBuffer p5, final int p6, final int p7, final ByteBuffer p8, final int p9, final int p10, final ByteBuffer p11, final ByteBuffer p12, final int p13);
    
    private static native boolean generateCircleThumbnailNative(final ByteBuffer p0, final int p1, final int p2, final ByteBuffer p3, final int p4, final int p5, final ByteBuffer p6, final int p7, final int p8, final int p9, final int p10, final int p11, final int p12, final int p13, final int[] p14);
}
