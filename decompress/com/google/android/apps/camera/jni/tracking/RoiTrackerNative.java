// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.tracking;

import android.hardware.HardwareBuffer;
import java.nio.ByteBuffer;
import android.content.Context;

public final class RoiTrackerNative
{
    static {
        krk.a(RoiTrackerNative.class);
    }
    
    public static native long createHandle(final Context p0, final String p1, final int p2);
    
    public static native int getCurrentTrackerIndex(final long p0);
    
    public static native boolean getIsRefresherCalled(final long p0);
    
    public static native void releaseHandle(final long p0);
    
    public static native int startTracking(final long p0, final boolean p1, final int p2, final int p3, final float p4, final int p5, final int p6, final ByteBuffer p7, final int p8, final int p9, final ByteBuffer p10, final int p11, final int p12, final ByteBuffer p13, final int p14, final int p15, final HardwareBuffer p16, final float[] p17);
    
    public static native void stopTracking(final long p0);
    
    public static native int updateRoi(final long p0, final int p1, final float p2, final int p3, final int p4, final ByteBuffer p5, final int p6, final int p7, final ByteBuffer p8, final int p9, final int p10, final ByteBuffer p11, final int p12, final int p13, final float[] p14, final HardwareBuffer p15, final float[] p16);
}
