// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class BuildPayloadBurstSpecOptions
{
    public transient long a;
    protected transient boolean b;
    
    public BuildPayloadBurstSpecOptions() {
        this(GcamModuleJNI.new_BuildPayloadBurstSpecOptions__SWIG_0());
    }
    
    public BuildPayloadBurstSpecOptions(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public BuildPayloadBurstSpecOptions(final BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions) {
        this(GcamModuleJNI.new_BuildPayloadBurstSpecOptions__SWIG_1(buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions));
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_BuildPayloadBurstSpecOptions(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final float n) {
        GcamModuleJNI.BuildPayloadBurstSpecOptions_max_exposure_time_ms_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
