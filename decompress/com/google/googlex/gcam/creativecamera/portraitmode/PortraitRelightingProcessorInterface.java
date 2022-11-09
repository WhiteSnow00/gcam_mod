// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.creativecamera.portraitmode;

import java.util.concurrent.atomic.AtomicBoolean;

public final class PortraitRelightingProcessorInterface
{
    private static final AtomicBoolean a;
    
    static {
        a = new AtomicBoolean();
    }
    
    public PortraitRelightingProcessorInterface() {
        if (PortraitRelightingProcessorInterface.a.compareAndSet(false, true)) {
            init();
        }
    }
    
    private static native void init();
    
    public native long getPortraitRelightingProcessorHandle();
    
    public native boolean initPortraitRelightingProcessor(final String p0, final boolean p1, final long p2, final long p3, final long p4, final long p5, final long p6, final long p7, final long p8, final long p9, final long p10, final long p11, final long p12, final long p13);
    
    public native void release();
}
