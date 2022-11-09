// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.dirtylens;

import java.util.concurrent.atomic.AtomicBoolean;

public final class DirtyLens
{
    private static final AtomicBoolean a;
    
    static {
        a = new AtomicBoolean();
    }
    
    public DirtyLens() {
        if (DirtyLens.a.compareAndSet(false, true)) {
            init();
        }
    }
    
    public static native boolean getDirtyLensRawScore(final long p0, final float[] p1);
    
    private static native void init();
}
