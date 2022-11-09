// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class InterleavedImageF
{
    private transient long a;
    
    public InterleavedImageF() {
        this(GcamModuleJNI.new_InterleavedImageF());
    }
    
    public InterleavedImageF(final long a) {
        this.a = a;
    }
    
    public static long a(final InterleavedImageF interleavedImageF) {
        if (interleavedImageF == null) {
            return 0L;
        }
        return interleavedImageF.a;
    }
    
    public final void b() {
        synchronized (this) {
            if (this.a != 0L) {
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
