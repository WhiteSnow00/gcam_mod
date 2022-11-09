// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class GyroSampleVector
{
    public transient long a;
    protected transient boolean b;
    
    public GyroSampleVector() {
        final long new_GyroSampleVector__SWIG_0 = GcamModuleJNI.new_GyroSampleVector__SWIG_0();
        this.b = true;
        this.a = new_GyroSampleVector__SWIG_0;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_GyroSampleVector(a);
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
