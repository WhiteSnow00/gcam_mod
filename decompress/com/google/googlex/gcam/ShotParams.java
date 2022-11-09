// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ShotParams
{
    public transient long a;
    protected transient boolean b;
    
    public ShotParams() {
        this(GcamModuleJNI.new_ShotParams__SWIG_0());
    }
    
    public ShotParams(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final AeShotParams a() {
        final long shotParams_ae_get = GcamModuleJNI.ShotParams_ae_get(this.a, this);
        if (shotParams_ae_get == 0L) {
            return null;
        }
        return new AeShotParams(shotParams_ae_get, false);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_ShotParams(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void c(final AwbInfo awbInfo) {
        GcamModuleJNI.ShotParams_force_wb_set(this.a, this, AwbInfo.a(awbInfo), awbInfo);
    }
    
    public final void d(final int n) {
        GcamModuleJNI.ShotParams_image_rotation_set(this.a, this, n);
    }
    
    public final void e(final boolean b) {
        GcamModuleJNI.ShotParams_manually_rotate_final_jpg_set(this.a, this, b);
    }
    
    public final void f(final boolean b) {
        GcamModuleJNI.ShotParams_recompute_wb_on_base_frame_set(this.a, this, b);
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
    
    public final void g(final boolean b) {
        GcamModuleJNI.ShotParams_shasta_enabled_set(this.a, this, b);
    }
    
    public final void h(final float n) {
        GcamModuleJNI.ShotParams_tripod_max_exposure_time_ms_set(this.a, this, n);
    }
    
    public final void i(final float n) {
        GcamModuleJNI.ShotParams_tripod_max_total_capture_time_ms_set(this.a, this, n);
    }
}
