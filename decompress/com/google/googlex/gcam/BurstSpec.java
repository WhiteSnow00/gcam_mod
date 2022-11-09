// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class BurstSpec
{
    public transient long a;
    protected transient boolean b;
    
    public BurstSpec() {
        this(GcamModuleJNI.new_BurstSpec());
    }
    
    public BurstSpec(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final float a(final float n, final boolean b) {
        return GcamModuleJNI.BurstSpec_TotalCaptureTimeMs__SWIG_0(this.a, this, n, b);
    }
    
    public final FrameRequestVector b() {
        final long burstSpec_frame_requests_get = GcamModuleJNI.BurstSpec_frame_requests_get(this.a, this);
        if (burstSpec_frame_requests_get == 0L) {
            return null;
        }
        return new FrameRequestVector(burstSpec_frame_requests_get, false);
    }
    
    public final void c() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_BurstSpec(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.c();
    }
}
