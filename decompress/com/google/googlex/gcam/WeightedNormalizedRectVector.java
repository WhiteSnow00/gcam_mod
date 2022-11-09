// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class WeightedNormalizedRectVector
{
    private transient long a;
    
    public WeightedNormalizedRectVector() {
        this(GcamModuleJNI.new_WeightedNormalizedRectVector__SWIG_0());
    }
    
    public WeightedNormalizedRectVector(final long a) {
        this.a = a;
    }
    
    public final long a() {
        return GcamModuleJNI.WeightedNormalizedRectVector_size(this.a, this);
    }
    
    public final void b(final WeightedNormalizedRect weightedNormalizedRect) {
        GcamModuleJNI.WeightedNormalizedRectVector_add(this.a, this, weightedNormalizedRect.a, weightedNormalizedRect);
    }
    
    public final void c() {
        synchronized (this) {
            if (this.a != 0L) {
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.c();
    }
}
