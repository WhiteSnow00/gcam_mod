// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class BoolVector
{
    public transient long a;
    
    public BoolVector() {
        this(GcamModuleJNI.new_BoolVector__SWIG_0());
    }
    
    public BoolVector(final long a) {
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            if (this.a != 0L) {
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
