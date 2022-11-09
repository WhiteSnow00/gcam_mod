// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.eisutil;

import java.nio.ByteBuffer;

public final class FrameUtilNative
{
    static {
        krk.a(FrameUtilNative.class);
    }
    
    public static native int convertAYUVToNV12(final ByteBuffer p0, final ByteBuffer p1, final ByteBuffer p2, final int p3, final int p4);
    
    public static native void convertNV21ToNV12(final ByteBuffer p0, final int p1, final ByteBuffer p2, final int p3, final int p4, final int p5);
    
    public static native int convertNV21ToYUV24(final ByteBuffer p0, final int p1, final ByteBuffer p2, final int p3, final ByteBuffer p4, final int p5, final int p6, final int p7);
    
    public static native void mirrorYUV420888(final ByteBuffer p0, final int p1, final ByteBuffer p2, final int p3, final ByteBuffer p4, final int p5, final ByteBuffer p6, final int p7, final ByteBuffer p8, final int p9, final ByteBuffer p10, final int p11, final int p12, final int p13, final boolean p14);
}
