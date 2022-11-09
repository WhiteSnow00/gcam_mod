// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.lensoffset;

public final class LensOffsetQueueNative
{
    static {
        krk.a(LensOffsetQueueNative.class);
    }
    
    public static native long createHandle(final int p0, final int p1, final int p2);
    
    public static native boolean getLensOffsetAtTime(final long p0, final long p1, final float[] p2);
    
    public static native boolean processAndEnqueueLensOffset(final long p0, final long p1, final float p2, final float p3);
    
    public static native void releaseHandle(final long p0);
}
