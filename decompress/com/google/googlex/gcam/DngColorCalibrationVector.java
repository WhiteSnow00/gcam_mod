// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class DngColorCalibrationVector
{
    public transient long a;
    protected transient boolean b;
    
    public DngColorCalibrationVector() {
        final long new_DngColorCalibrationVector__SWIG_0 = GcamModuleJNI.new_DngColorCalibrationVector__SWIG_0();
        this.b = true;
        this.a = new_DngColorCalibrationVector__SWIG_0;
    }
    
    public final void a(final DngColorCalibration dngColorCalibration) {
        GcamModuleJNI.DngColorCalibrationVector_add(this.a, this, dngColorCalibration.a, dngColorCalibration);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_DngColorCalibrationVector(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
