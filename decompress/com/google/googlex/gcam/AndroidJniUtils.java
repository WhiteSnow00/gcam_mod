// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

import android.view.Surface;
import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;

public final class AndroidJniUtils
{
    private AndroidJniUtils() {
    }
    
    public static native long getAHardwareBufferPtr(final HardwareBuffer p0);
    
    public static native long lockBitmap(final Bitmap p0);
    
    static native long lockSurface(final Surface p0);
    
    public static native void unlockBitmap(final Bitmap p0);
    
    static native void unlockSurface(final long p0);
}
