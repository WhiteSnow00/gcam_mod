// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class FloatDeque
{
    public transient long a;
    protected transient boolean b;
    
    public FloatDeque() {
        this(GcamModuleJNI.new_FloatDeque__SWIG_0(), true);
    }
    
    public FloatDeque(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_FloatDeque(a);
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
