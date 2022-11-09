// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.facebeautification;

import java.nio.ByteBuffer;

public class FaceBeautificationNative
{
    static {
        krk.a(FaceBeautificationNative.class);
        init();
    }
    
    public static native long createHandle(final int p0, final int p1);
    
    public static native byte[] doFaceBeautification(final long p0, final int p1, final int p2, final int p3, final ByteBuffer p4, final int p5, final int p6, final ByteBuffer p7, final int p8, final int p9, final ByteBuffer p10, final int p11, final int p12, final FaceInfo[] p13, final int p14, final int p15);
    
    public static native void init();
    
    public static native void releaseHandle(final long p0);
}
