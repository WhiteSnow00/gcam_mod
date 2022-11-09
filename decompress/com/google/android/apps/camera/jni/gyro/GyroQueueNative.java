// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.gyro;

public final class GyroQueueNative
{
    static {
        krk.a(GyroQueueNative.class);
    }
    
    public static native long createHandle(final int[] p0, final int[] p1);
    
    public static native boolean getProjectionMatrix(final long p0, final long p1, final float p2, final float p3, final float p4, final long p5, final float[] p6);
    
    public static native boolean getTransformBetweenTime(final long p0, final long p1, final float p2, final float p3, final float p4, final long p5, final float p6, final float p7, final float p8, final long p9, final float[] p10);
    
    public static native boolean processAndEnqueueGyro(final long p0, final float p1, final float p2, final float p3, final long p4);
    
    public static native void releaseHandle(final long p0);
}
