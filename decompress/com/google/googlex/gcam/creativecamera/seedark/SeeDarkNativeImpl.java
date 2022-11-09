// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.creativecamera.seedark;

import android.hardware.HardwareBuffer;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SeeDarkNativeImpl implements ogz
{
    private static final AtomicBoolean a;
    
    static {
        System.loadLibrary("SeeDarkJni");
        a = new AtomicBoolean();
    }
    
    public SeeDarkNativeImpl() {
        if (SeeDarkNativeImpl.a.compareAndSet(false, true)) {
            init();
        }
    }
    
    private static native void init();
    
    public native void abortCapture(final long p0);
    
    @Override
    public native long create(final long p0, final String p1, final String p2);
    
    @Override
    public native void delete(final long p0);
    
    @Override
    public native void finishCapture(final long p0);
    
    @Override
    public native void notifySurfaceChanged(final long p0, final Surface p1);
    
    @Override
    public native void processAndCloseFrame(final long p0, final long p1, final HardwareBuffer p2, final Runnable p3, final long p4, final long p5);
    
    @Override
    public native void startCapture(final long p0, final long p1, final String p2, final Runnable p3, final Runnable p4, final Runnable p5);
}
