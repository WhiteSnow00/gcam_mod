// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class InterleavedWriteViewU16
{
    protected transient boolean a;
    private transient long b;
    
    public InterleavedWriteViewU16() {
        this(GcamModuleJNI.new_InterleavedWriteViewU16__SWIG_0());
    }
    
    public InterleavedWriteViewU16(final long b) {
        this.a = true;
        this.b = b;
    }
    
    public static long a(final InterleavedWriteViewU16 interleavedWriteViewU16) {
        if (interleavedWriteViewU16 == null) {
            return 0L;
        }
        return interleavedWriteViewU16.b;
    }
    
    public final void b() {
        synchronized (this) {
            final long b = this.b;
            if (b != 0L) {
                if (this.a) {
                    this.a = false;
                    GcamModuleJNI.delete_InterleavedWriteViewU16(b);
                }
                this.b = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
