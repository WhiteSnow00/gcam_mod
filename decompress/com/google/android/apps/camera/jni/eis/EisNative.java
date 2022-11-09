// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.eis;

public final class EisNative
{
    static {
        krk.a(EisNative.class);
    }
    
    public static native long createHandle(final int p0, final int p1, final int p2, final float p3, final boolean p4, final int p5);
    
    public static native int getNumOfFramesToLookAhead(final long p0);
    
    public static native int getNumStrips(final long p0);
    
    public static native boolean isTripodMode(final long p0);
    
    public static native long processFrame(final long p0, final byte[] p1, final int p2, final int p3, final long p4, final long p5, final long p6, final long p7, final float p8, final float p9, final float p10, final boolean p11, final long p12, final float[] p13, final float[] p14, final float[] p15);
    
    public static native boolean processGyro(final long p0, final float p1, final float p2, final float p3, final long p4);
    
    public static native boolean processLensOffset(final long p0, final float p1, final float p2, final long p3);
    
    public static native void releaseHandle(final long p0);
    
    public static native void setActiveArraySize(final long p0, final int p1, final int p2);
    
    public static native void setCropWindowSize(final long p0, final int p1, final int p2);
    
    public static native void setStabilizationStrength(final long p0, final float p1);
}
