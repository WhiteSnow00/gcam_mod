// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class QcColorCalibration$IlluminantData
{
    public transient long a;
    protected transient boolean b;
    
    public QcColorCalibration$IlluminantData() {
        final long new_QcColorCalibration_IlluminantData = GcamModuleJNI.new_QcColorCalibration_IlluminantData();
        this.b = true;
        this.a = new_QcColorCalibration_IlluminantData;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_QcColorCalibration_IlluminantData(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
