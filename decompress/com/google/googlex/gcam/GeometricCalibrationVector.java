// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class GeometricCalibrationVector
{
    public transient long a;
    protected transient boolean b;
    
    public GeometricCalibrationVector() {
        this(GcamModuleJNI.new_GeometricCalibrationVector__SWIG_0(), true);
    }
    
    public GeometricCalibrationVector(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final GeometricCalibration geometricCalibration) {
        GcamModuleJNI.GeometricCalibrationVector_add(this.a, this, geometricCalibration.a, geometricCalibration);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_GeometricCalibrationVector(a);
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
