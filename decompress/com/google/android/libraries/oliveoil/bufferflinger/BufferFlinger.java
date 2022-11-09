// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.oliveoil.bufferflinger;

import java.util.Iterator;
import android.graphics.Rect;
import android.util.Log;
import java.util.concurrent.Semaphore;
import android.hardware.HardwareBuffer;
import java.util.LinkedList;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.view.Surface;
import java.util.Queue;
import java.util.concurrent.Executor;

public class BufferFlinger implements lvi
{
    public static final int NATIVE_WINDOW_TRANSFORM_FLIP_H = 1;
    public static final int NATIVE_WINDOW_TRANSFORM_FLIP_V = 2;
    public static final int NATIVE_WINDOW_TRANSFORM_INVERSE_DISPLAY = 8;
    public static final int NATIVE_WINDOW_TRANSFORM_ROT_180 = 3;
    public static final int NATIVE_WINDOW_TRANSFORM_ROT_270 = 7;
    public static final int NATIVE_WINDOW_TRANSFORM_ROT_90 = 4;
    private static final int NUM_BUFFERS_TO_KEEP_BEFORE_CLOSING = 3;
    private static final String TAG;
    private final Object buffeFlingerHandleLock;
    private long bufferFlingerHandle;
    private final Executor displayExecutor;
    private final Queue onBufferReleasedListenerQueue;
    
    static {
        krk.b(BufferFlinger.class, "bufferflinger");
        nativeInit();
        TAG = BufferFlinger.class.getSimpleName();
    }
    
    public BufferFlinger(final Surface surface) {
        this.displayExecutor = Executors.newSingleThreadExecutor(BufferFlinger$$ExternalSyntheticLambda2.INSTANCE);
        this.buffeFlingerHandleLock = new Object();
        this.onBufferReleasedListenerQueue = new LinkedList();
        this.bufferFlingerHandle = nativeCreateBufferFlinger(surface, "buffer-flinger");
    }
    
    private static native long nativeCreateBufferFlinger(final Surface p0, final String p1);
    
    private static native void nativeDisplayBuffer(final long p0, final HardwareBuffer p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10);
    
    private static native void nativeInit();
    
    private static native void nativeReleaseBufferFlinger(final long p0);
    
    @Override
    public void close() {
        Object buffeFlingerHandleLock = this.buffeFlingerHandleLock;
        synchronized (buffeFlingerHandleLock) {
            if (this.bufferFlingerHandle != 0L) {
                monitorexit(buffeFlingerHandleLock);
                buffeFlingerHandleLock = new Semaphore(0);
                this.displayExecutor.execute(new BufferFlinger$$ExternalSyntheticLambda1(this, (Semaphore)buffeFlingerHandleLock));
                try {
                    ((Semaphore)buffeFlingerHandleLock).acquire();
                    return;
                }
                catch (final InterruptedException buffeFlingerHandleLock) {
                    Log.e(BufferFlinger.TAG, "Interrupted while waiting for nativeReleaseBufferFlinger.");
                    return;
                }
            }
            throw new IllegalStateException("Calling close on an already closed BufferFlinger.");
        }
    }
    
    public void displayBuffer(final HardwareBuffer hardwareBuffer, final Rect rect, final Rect rect2, final int n, final BufferFlinger$OnBufferReleasedListener bufferFlinger$OnBufferReleasedListener) {
        if (hardwareBuffer == null) {
            Log.e(BufferFlinger.TAG, "HardwareBuffer passed to displayBuffer was null.");
            bufferFlinger$OnBufferReleasedListener.onBufferReleased();
            return;
        }
        this.displayExecutor.execute(new BufferFlinger$$ExternalSyntheticLambda0(this, bufferFlinger$OnBufferReleasedListener, hardwareBuffer, rect, rect2, n));
    }
}
