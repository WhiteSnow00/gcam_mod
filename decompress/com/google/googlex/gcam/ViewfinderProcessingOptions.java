// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ViewfinderProcessingOptions
{
    public transient long a;
    protected transient boolean b;
    
    public ViewfinderProcessingOptions() {
        this(GcamModuleJNI.new_ViewfinderProcessingOptions__SWIG_0());
    }
    
    public ViewfinderProcessingOptions(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_ViewfinderProcessingOptions(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final boolean b) {
        GcamModuleJNI.ViewfinderProcessingOptions_process_motion_set(this.a, this, b);
    }
    
    public final void c(final boolean b) {
        GcamModuleJNI.ViewfinderProcessingOptions_save_motion_trace_set(this.a, this, b);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
