// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class Gcam
{
    public transient long a;
    protected transient boolean b;
    
    public Gcam(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public static long a(final Gcam gcam) {
        if (gcam == null) {
            return 0L;
        }
        return gcam.a;
    }
    
    public final StaticMetadata b(final int n) {
        return new StaticMetadata(GcamModuleJNI.Gcam_GetStaticMetadata(this.a, this, n), false);
    }
    
    public final Tuning c(final int n) {
        return new Tuning(GcamModuleJNI.Gcam_GetTuning(this.a, this, n));
    }
    
    public final void d(final ViewfinderProcessingOptions viewfinderProcessingOptions) {
        GcamModuleJNI.Gcam_ConfigureViewfinderProcessing(this.a, this, viewfinderProcessingOptions.a, viewfinderProcessingOptions);
    }
    
    public final void e() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_Gcam(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final boolean f() {
        return GcamModuleJNI.Gcam_AllSensorIdsUnique(this.a, this);
    }
    
    @Override
    protected final void finalize() {
        this.e();
    }
}
