// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class InterleavedWriteViewU8
{
    public transient long a;
    protected transient boolean b;
    
    public InterleavedWriteViewU8() {
        this(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_0());
    }
    
    public InterleavedWriteViewU8(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public static long a(final InterleavedWriteViewU8 interleavedWriteViewU8) {
        if (interleavedWriteViewU8 == null) {
            return 0L;
        }
        return interleavedWriteViewU8.a;
    }
    
    public final InterleavedReadViewU8 b() {
        return new InterleavedReadViewU8(GcamModuleJNI.InterleavedWriteViewU8_read_view(this.a, this));
    }
    
    public final void c() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_InterleavedWriteViewU8(a);
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
