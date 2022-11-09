// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class FrameRequest
{
    public transient long a;
    
    public FrameRequest() {
        this(GcamModuleJNI.new_FrameRequest());
    }
    
    public FrameRequest(final long a) {
        this.a = a;
    }
    
    public final float a() {
        return GcamModuleJNI.FrameRequest_desired_analog_gain_get(this.a, this);
    }
    
    public final float b() {
        return GcamModuleJNI.FrameRequest_desired_digital_gain_get(this.a, this);
    }
    
    public final float c() {
        return GcamModuleJNI.FrameRequest_desired_exposure_time_ms_get(this.a, this);
    }
    
    public final void d() {
        synchronized (this) {
            if (this.a != 0L) {
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.d();
    }
}
