// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class AeModeResult
{
    public transient long a;
    protected transient boolean b;
    
    public AeModeResult() {
        final long new_AeModeResult = GcamModuleJNI.new_AeModeResult();
        this.b = true;
        this.a = new_AeModeResult;
    }
    
    public static long a(final AeModeResult aeModeResult) {
        if (aeModeResult == null) {
            return 0L;
        }
        return aeModeResult.a;
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_AeModeResult(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void c(final float n) {
        GcamModuleJNI.AeModeResult_final_tet_set(this.a, this, n);
    }
    
    public final void d(final float n) {
        GcamModuleJNI.AeModeResult_ideal_tet_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
