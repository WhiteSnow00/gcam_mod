// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.creativecamera.portraitmode;

import java.util.concurrent.atomic.AtomicBoolean;

public final class PortraitProcessorInterface implements AutoCloseable
{
    private static final AtomicBoolean b;
    public long a;
    
    static {
        b = new AtomicBoolean();
    }
    
    public PortraitProcessorInterface(final long n, final long n2) {
        this.a = 0L;
        if (PortraitProcessorInterface.b.compareAndSet(false, true)) {
            init();
        }
        this.a = this.create(n, n2);
    }
    
    private native long create(final long p0, final long p1);
    
    private native long createWithLevels(final long p0, final long p1, final int p2, final int p3, final boolean p4);
    
    private native void delete(final long p0);
    
    private static native void init();
    
    @Override
    public final void close() {
        this.delete(this.a);
        this.a = 0L;
    }
    
    public native boolean processImpl(final long p0, final long p1, final long p2, final long p3, final long p4, final long p5, final long p6, final int p7);
}
