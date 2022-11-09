// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class FrameRequestVector
{
    public transient long a;
    protected transient boolean b;
    
    public FrameRequestVector() {
        this(GcamModuleJNI.new_FrameRequestVector__SWIG_0(), true);
    }
    
    public FrameRequestVector(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final long a() {
        return GcamModuleJNI.FrameRequestVector_size(this.a, this);
    }
    
    public final FrameRequest b(final int n) {
        return new FrameRequest(GcamModuleJNI.FrameRequestVector_get(this.a, this, n));
    }
    
    public final void c() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_FrameRequestVector(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final boolean d() {
        return GcamModuleJNI.FrameRequestVector_isEmpty(this.a, this);
    }
    
    @Override
    protected final void finalize() {
        this.c();
    }
}
