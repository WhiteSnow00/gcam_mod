// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.facebeautification;

import android.hardware.HardwareBuffer;

public class GpuRetoucherNative
{
    static {
        krk.a(GpuRetoucherNative.class);
        init();
    }
    
    public static native long createRetoucher(final boolean p0);
    
    public static native void init();
    
    public static native boolean process(final long p0, final HardwareBuffer p1, final boolean p2, final HardwareBuffer p3, final boolean p4, final int p5, final int p6, final Object[] p7, final float p8, final int p9);
    
    public static native void releaseRetoucher(final long p0);
}
