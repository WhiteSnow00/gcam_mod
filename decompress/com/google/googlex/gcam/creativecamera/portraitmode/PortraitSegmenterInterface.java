// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.creativecamera.portraitmode;

import java.util.concurrent.atomic.AtomicBoolean;

public final class PortraitSegmenterInterface
{
    private static final AtomicBoolean a;
    
    static {
        a = new AtomicBoolean();
    }
    
    public PortraitSegmenterInterface() {
        if (PortraitSegmenterInterface.a.compareAndSet(false, true)) {
            init();
        }
    }
    
    private static native void init();
    
    public native boolean dummyImageProducesReasonableMask();
    
    public native long getSegmenterHandle();
    
    public native boolean initSegmenter(final long p0, final long p1, final String p2, final String p3, final boolean p4, final boolean p5, final boolean p6, final boolean p7, final boolean p8);
    
    public native void release();
}
