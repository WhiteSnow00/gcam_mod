// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class GrayReadViewU8
{
    public transient long a;
    protected transient boolean b;
    
    public GrayReadViewU8() {
        this(GcamModuleJNI.new_GrayReadViewU8__SWIG_0());
    }
    
    public GrayReadViewU8(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final int a() {
        return GcamModuleJNI.GrayReadViewU8_x_stride(this.a, this);
    }
    
    public final int b() {
        return GcamModuleJNI.GrayReadViewU8_y_stride(this.a, this);
    }
    
    public final void c() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_GrayReadViewU8(a);
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
