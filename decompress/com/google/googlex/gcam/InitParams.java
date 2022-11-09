// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class InitParams
{
    public transient long a;
    protected transient boolean b;
    
    public InitParams() {
        final long new_InitParams = GcamModuleJNI.new_InitParams();
        this.b = true;
        this.a = new_InitParams;
    }
    
    public final int a() {
        return GcamModuleJNI.InitParams_execute_finish_on_get(this.a, this);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_InitParams(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void c(final int n) {
        GcamModuleJNI.InitParams_execute_finish_on_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
