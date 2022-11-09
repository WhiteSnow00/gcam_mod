// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class InterleavedReadViewU8
{
    public transient long a;
    protected transient boolean b;
    
    public InterleavedReadViewU8() {
        this(GcamModuleJNI.new_InterleavedReadViewU8__SWIG_0());
    }
    
    public InterleavedReadViewU8(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final int a() {
        return GcamModuleJNI.InterleavedReadViewU8_c_stride(this.a, this);
    }
    
    public final int b() {
        return GcamModuleJNI.InterleavedReadViewU8_channels(this.a, this);
    }
    
    public final int c() {
        return GcamModuleJNI.InterleavedReadViewU8_height(this.a, this);
    }
    
    public final int d() {
        return GcamModuleJNI.InterleavedReadViewU8_width(this.a, this);
    }
    
    public final int e() {
        return GcamModuleJNI.InterleavedReadViewU8_x_stride(this.a, this);
    }
    
    public final int f() {
        return GcamModuleJNI.InterleavedReadViewU8_y_stride(this.a, this);
    }
    
    @Override
    protected final void finalize() {
        this.h();
    }
    
    public final ogn g() {
        final long interleavedReadViewU8_data = GcamModuleJNI.InterleavedReadViewU8_data(this.a, this);
        if (interleavedReadViewU8_data == 0L) {
            return null;
        }
        return new ogn(interleavedReadViewU8_data);
    }
    
    public final void h() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_InterleavedReadViewU8(a);
                }
                this.a = 0L;
            }
        }
    }
}
