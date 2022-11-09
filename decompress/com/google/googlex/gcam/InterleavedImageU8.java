// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class InterleavedImageU8
{
    public transient long a;
    protected transient boolean b;
    
    public InterleavedImageU8() {
        this(GcamModuleJNI.new_InterleavedImageU8__SWIG_0());
    }
    
    public InterleavedImageU8(final int n, final int n2, final int n3) {
        this(GcamModuleJNI.new_InterleavedImageU8__SWIG_1(n, n2, n3));
    }
    
    public InterleavedImageU8(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final int a() {
        return GcamModuleJNI.InterleavedImageU8_height(this.a, this);
    }
    
    public final int b() {
        return GcamModuleJNI.InterleavedImageU8_width(this.a, this);
    }
    
    public final InterleavedReadViewU8 c() {
        return new InterleavedReadViewU8(GcamModuleJNI.InterleavedImageU8_read_view(this.a, this));
    }
    
    public final InterleavedWriteViewU8 d() {
        return new InterleavedWriteViewU8(GcamModuleJNI.InterleavedImageU8_write_view(this.a, this));
    }
    
    public final void e() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_InterleavedImageU8(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final boolean f() {
        return GcamModuleJNI.InterleavedImageU8_empty(this.a, this);
    }
    
    @Override
    protected final void finalize() {
        this.e();
    }
}
