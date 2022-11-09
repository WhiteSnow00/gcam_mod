// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class FloatVector
{
    public transient long a;
    protected transient boolean b;
    
    public FloatVector() {
        this(GcamModuleJNI.new_FloatVector__SWIG_0(), true);
    }
    
    public FloatVector(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final float a(final int n) {
        return GcamModuleJNI.FloatVector_get(this.a, this, n);
    }
    
    public final long b() {
        return GcamModuleJNI.FloatVector_size(this.a, this);
    }
    
    public final void c(final float n) {
        GcamModuleJNI.FloatVector_add(this.a, this, n);
    }
    
    public final void d() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_FloatVector(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.d();
    }
}
