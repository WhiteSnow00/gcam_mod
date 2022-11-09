// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.lasagna;

import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.concurrent.atomic.AtomicBoolean;

public class LasagnaNativeProcessorJni
{
    private static final AtomicBoolean a;
    
    static {
        a = new AtomicBoolean();
    }
    
    public LasagnaNativeProcessorJni() {
        if (!LasagnaNativeProcessorJni.a.getAndSet(true)) {
            init();
        }
    }
    
    private static native void init();
    
    public native void addViewfinderFrame(final long p0, final long p1, final long p2, final Runnable p3);
    
    public native void beginShot(final long p0, final int p1, final int p2, final boolean p3);
    
    public native long create(final int p0, final int p1, final float p2, final float p3, final float p4, final int p5, final int p6, final String p7, final InterleavedU8ClientAllocator p8, final LasagnaCallbacks p9);
    
    public native void delete(final long p0);
    
    public native void endShot(final long p0, final int p1);
    
    public native void printDiagnosticsToLog(final long p0);
    
    public native void processPslFrame(final long p0, final int p1, final long p2, final long p3, final long p4, final Runnable p5);
    
    public native void processZslBurst(final long p0, final int p1, final long p2, final long p3);
}
