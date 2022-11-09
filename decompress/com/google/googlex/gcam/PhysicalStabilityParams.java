// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class PhysicalStabilityParams
{
    public transient long a;
    
    public PhysicalStabilityParams() {
        this(GcamModuleJNI.new_PhysicalStabilityParams());
    }
    
    public PhysicalStabilityParams(final long a) {
        this.a = a;
    }
    
    public final PhysicalStabilityThresholds a() {
        final long physicalStabilityParams_thresholds_get = GcamModuleJNI.PhysicalStabilityParams_thresholds_get(this.a, this);
        if (physicalStabilityParams_thresholds_get == 0L) {
            return null;
        }
        return new PhysicalStabilityThresholds(physicalStabilityParams_thresholds_get);
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
