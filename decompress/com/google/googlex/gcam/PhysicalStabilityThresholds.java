// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class PhysicalStabilityThresholds
{
    public transient long a;
    
    public PhysicalStabilityThresholds() {
        this(GcamModuleJNI.new_PhysicalStabilityThresholds());
    }
    
    public PhysicalStabilityThresholds(final long a) {
        this.a = a;
    }
    
    public final float a() {
        return GcamModuleJNI.PhysicalStabilityThresholds_tripod_speed_rad_per_sec_get(this.a, this);
    }
    
    public final void b() {
        synchronized (this) {
            if (this.a != 0L) {
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
