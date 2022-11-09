// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class InterleavedReadViewU16
{
    public transient long a;
    protected transient boolean b;
    
    public InterleavedReadViewU16() {
        this(GcamModuleJNI.new_InterleavedReadViewU16__SWIG_0());
    }
    
    public InterleavedReadViewU16(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_InterleavedReadViewU16(a);
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
