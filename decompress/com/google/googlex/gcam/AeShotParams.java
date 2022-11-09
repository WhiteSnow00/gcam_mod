// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class AeShotParams
{
    public transient long a;
    protected transient boolean b;
    
    public AeShotParams() {
        this(GcamModuleJNI.new_AeShotParams__SWIG_0(), true);
    }
    
    public AeShotParams(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public static long a(final AeShotParams aeShotParams) {
        if (aeShotParams == null) {
            return 0L;
        }
        return aeShotParams.a;
    }
    
    public final NormalizedRect b() {
        final long aeShotParams_crop_get = GcamModuleJNI.AeShotParams_crop_get(this.a, this);
        if (aeShotParams_crop_get == 0L) {
            return null;
        }
        return new NormalizedRect(aeShotParams_crop_get, false);
    }
    
    public final NormalizedRect c() {
        final long aeShotParams_merged_crop_get = GcamModuleJNI.AeShotParams_merged_crop_get(this.a, this);
        if (aeShotParams_merged_crop_get == 0L) {
            return null;
        }
        return new NormalizedRect(aeShotParams_merged_crop_get, false);
    }
    
    public final WeightedNormalizedRectVector d() {
        final long aeShotParams_weighted_metering_areas_get = GcamModuleJNI.AeShotParams_weighted_metering_areas_get(this.a, this);
        if (aeShotParams_weighted_metering_areas_get == 0L) {
            return null;
        }
        return new WeightedNormalizedRectVector(aeShotParams_weighted_metering_areas_get);
    }
    
    public final void e() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_AeShotParams(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void f(final NormalizedRect normalizedRect) {
        GcamModuleJNI.AeShotParams_crop_set(this.a, this, NormalizedRect.a(normalizedRect), normalizedRect);
    }
    
    @Override
    protected final void finalize() {
        this.e();
    }
    
    public final void g(final float n) {
        GcamModuleJNI.AeShotParams_exposure_compensation_set(this.a, this, n);
    }
    
    public final void h(final NormalizedRect normalizedRect) {
        GcamModuleJNI.AeShotParams_merged_crop_set(this.a, this, NormalizedRect.a(normalizedRect), normalizedRect);
    }
    
    public final void i(final boolean b) {
        GcamModuleJNI.AeShotParams_relighting_expected_set(this.a, this, b);
    }
    
    public final void j(final int n) {
        GcamModuleJNI.AeShotParams_target_height_set(this.a, this, n);
    }
    
    public final void k(final int n) {
        GcamModuleJNI.AeShotParams_target_width_set(this.a, this, n);
    }
    
    public final void l(final int n) {
        GcamModuleJNI.AeShotParams_ux_mode_set(this.a, this, n);
    }
}
