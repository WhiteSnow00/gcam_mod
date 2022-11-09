// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class DngColorCalibration
{
    public transient long a;
    protected transient boolean b;
    
    public DngColorCalibration() {
        final long new_DngColorCalibration = GcamModuleJNI.new_DngColorCalibration();
        this.b = true;
        this.a = new_DngColorCalibration;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_DngColorCalibration(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final int n) {
        GcamModuleJNI.DngColorCalibration_illuminant_set(this.a, this, n);
    }
    
    public final void c(final float[] array) {
        GcamModuleJNI.DngColorCalibration_model_rgb_to_device_rgb_set(this.a, this, array);
    }
    
    public final void d(final float[] array) {
        GcamModuleJNI.DngColorCalibration_xyz_to_model_rgb_set(this.a, this, array);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
