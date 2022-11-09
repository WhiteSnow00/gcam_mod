// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class OisPositionVector
{
    public transient long a;
    
    public OisPositionVector() {
        this(GcamModuleJNI.new_OisPositionVector__SWIG_0());
    }
    
    public OisPositionVector(final long a) {
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
