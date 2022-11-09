// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class GeometricCalibration
{
    public transient long a;
    protected transient boolean b;
    
    public GeometricCalibration() {
        final long new_GeometricCalibration = GcamModuleJNI.new_GeometricCalibration();
        this.b = true;
        this.a = new_GeometricCalibration;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_GeometricCalibration(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final float[] array) {
        GcamModuleJNI.GeometricCalibration_lens_distortion_set(this.a, this, array);
    }
    
    public final void c(final float[] array) {
        GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_set(this.a, this, array);
    }
    
    public final void d(final int n) {
        GcamModuleJNI.GeometricCalibration_quality_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
