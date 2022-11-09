// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class WeightedPixelRect
{
    public transient long a;
    protected transient boolean b;
    
    public WeightedPixelRect() {
        final long new_WeightedPixelRect = GcamModuleJNI.new_WeightedPixelRect();
        this.b = true;
        this.a = new_WeightedPixelRect;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_WeightedPixelRect(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
