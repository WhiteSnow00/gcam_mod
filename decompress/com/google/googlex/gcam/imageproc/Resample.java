// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.imageproc;

public final class Resample
{
    private Resample() {
    }
    
    public static native boolean downsampleImpl(final long p0, final int p1, final long p2);
    
    public static native boolean resampleLanczosYuvImpl(final long p0, final float p1, final long p2);
    
    public static native boolean rotateImpl(final long p0, final int p1, final long p2);
}
