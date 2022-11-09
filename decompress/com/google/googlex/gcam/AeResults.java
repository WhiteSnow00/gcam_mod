// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class AeResults
{
    public transient long a;
    protected transient boolean b;
    
    public AeResults() {
        this(GcamModuleJNI.new_AeResults(), true);
    }
    
    public AeResults(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public static long b(final AeResults aeResults) {
        if (aeResults == null) {
            return 0L;
        }
        return aeResults.a;
    }
    
    public final float a(final int n) {
        return GcamModuleJNI.AeResults_FinalTet(this.a, this, n);
    }
    
    public final void c() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_AeResults(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.c();
    }
}
