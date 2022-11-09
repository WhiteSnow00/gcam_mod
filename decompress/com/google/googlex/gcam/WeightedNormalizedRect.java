// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class WeightedNormalizedRect
{
    public transient long a;
    protected transient boolean b;
    
    public WeightedNormalizedRect() {
        final long new_WeightedNormalizedRect = GcamModuleJNI.new_WeightedNormalizedRect();
        this.b = true;
        this.a = new_WeightedNormalizedRect;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_WeightedNormalizedRect(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final float n) {
        GcamModuleJNI.WeightedNormalizedRect_weight_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
