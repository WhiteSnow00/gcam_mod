// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.vision.smartcapture;

import java.nio.ByteBuffer;
import java.io.Closeable;

public final class BurstCurator implements Closeable
{
    public final okm a;
    public final long b;
    public boolean c;
    
    static {
        try {
            System.loadLibrary("smartcapture_native");
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            if (!"Dalvik".equals(njl.j.a())) {
                return;
            }
            throw unsatisfiedLinkError;
        }
    }
    
    public BurstCurator(final long b) {
        if (b != 0L) {
            this.b = b;
            this.c = false;
            final okm c = okm.c();
            this.a = c;
            final okk j = oqc.j;
            c.b.put(new okl(j.a, j.a()), j);
            return;
        }
        throw new IllegalStateException("Could not initialize BurstCurator.");
    }
    
    private native void nativeClose(final long p0);
    
    public static native long nativeCreateFromOptions(final byte[] p0);
    
    @Override
    public final void close() {
        if (!this.c) {
            this.nativeClose(this.b);
            this.c = true;
        }
    }
    
    @Override
    protected final void finalize() {
        try {
            this.close();
        }
        finally {
            super.finalize();
        }
    }
    
    public native byte[] nativeProcessMetadata(final long p0, final byte[] p1);
    
    public native byte[] nativeProcessYUV(final long p0, final ByteBuffer p1, final int p2, final int p3, final ByteBuffer p4, final int p5, final int p6, final ByteBuffer p7, final int p8, final int p9, final int p10, final int p11, final byte[] p12);
}
