// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ViewfinderResults
{
    protected transient boolean a;
    private transient long b;
    
    public ViewfinderResults() {
        this(GcamModuleJNI.new_ViewfinderResults());
    }
    
    public ViewfinderResults(final long b) {
        this.a = true;
        this.b = b;
    }
    
    public final float a() {
        return GcamModuleJNI.ViewfinderResults_gyro_speed_rad_per_sec_get(this.b, this);
    }
    
    public final void b() {
        synchronized (this) {
            final long b = this.b;
            if (b != 0L) {
                if (this.a) {
                    this.a = false;
                    GcamModuleJNI.delete_ViewfinderResults(b);
                }
                this.b = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
