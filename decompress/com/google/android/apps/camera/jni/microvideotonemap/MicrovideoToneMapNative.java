// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.microvideotonemap;

import java.nio.ByteBuffer;
import android.graphics.Bitmap;

public class MicrovideoToneMapNative
{
    static {
        krk.a(MicrovideoToneMapNative.class);
    }
    
    public static native int argbToYuv(final Bitmap p0, final ByteBuffer p1, final ByteBuffer p2, final ByteBuffer p3);
    
    public static native byte[] extractMeanVarianceMappingNative(final int p0, final int p1, final ByteBuffer p2, final ByteBuffer p3, final ByteBuffer p4, final int p5, final int p6, final ByteBuffer p7, final ByteBuffer p8, final ByteBuffer p9, final int p10, final int p11);
}
