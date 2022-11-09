// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class PostviewParams
{
    public transient long a;
    protected transient boolean b;
    
    public PostviewParams() {
        final long new_PostviewParams = GcamModuleJNI.new_PostviewParams();
        this.b = true;
        this.a = new_PostviewParams;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_PostviewParams(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final int n) {
        GcamModuleJNI.PostviewParams_pixel_format_set(this.a, this, n);
    }
    
    public final void c(final int n) {
        GcamModuleJNI.PostviewParams_target_height_set(this.a, this, n);
    }
    
    public final void d(final int n) {
        GcamModuleJNI.PostviewParams_target_width_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
