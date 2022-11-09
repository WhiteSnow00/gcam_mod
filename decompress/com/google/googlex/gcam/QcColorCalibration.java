// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class QcColorCalibration
{
    public transient long a;
    protected transient boolean b;
    
    public QcColorCalibration() {
        final long new_QcColorCalibration = GcamModuleJNI.new_QcColorCalibration();
        this.b = true;
        this.a = new_QcColorCalibration;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_QcColorCalibration(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final float n) {
        GcamModuleJNI.QcColorCalibration_grgb_ratio_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
