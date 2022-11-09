// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.camera.jni.graphics;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import android.hardware.HardwareBuffer;

public class HardwarePixels implements krc
{
    public final HardwareBuffer a;
    public final long b;
    public final AtomicBoolean c;
    
    public HardwarePixels(final HardwareBuffer hardwareBuffer) {
        this.c = new AtomicBoolean(false);
        this.a = HardwareBuffers.fork(hardwareBuffer);
        this.b = nativeLockPlanes(hardwareBuffer, 3L);
    }
    
    public static native ByteBuffer nativeGetData(final long p0, final int p1, final int p2, final int p3);
    
    private static native long nativeLockPlanes(final HardwareBuffer p0, final long p1);
    
    public static native int nativePixelStride(final long p0, final int p1);
    
    public static native int nativePlaneCount(final long p0);
    
    public static native int nativeRowStride(final long p0, final int p1);
    
    private static native void nativeUnlockBuffer(final HardwareBuffer p0);
    
    @Override
    public final void close() {
        if (this.c.compareAndSet(false, true)) {
            nativeUnlockBuffer(this.a);
            this.a.close();
        }
    }
}
