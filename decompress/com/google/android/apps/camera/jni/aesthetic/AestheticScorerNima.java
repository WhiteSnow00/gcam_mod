// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.aesthetic;

import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AestheticScorerNima implements egu
{
    private long a;
    private final AtomicBoolean b;
    
    static {
        try {
            System.loadLibrary("aesthetic_scorer_nima_jni");
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            if (!"Dalvik".equals(System.getProperty("java.vm.name"))) {
                return;
            }
            throw unsatisfiedLinkError;
        }
    }
    
    public AestheticScorerNima() {
        this.b = new AtomicBoolean(true);
    }
    
    private native void nativeClose(final long p0);
    
    private static native long nativeLoad(final Boolean p0);
    
    private native float nativeScoreYUV(final long p0, final int p1, final int p2, final Buffer p3, final int p4, final int p5, final Buffer p6, final int p7, final int p8, final Buffer p9, final int p10, final int p11, final float[] p12);
    
    @Override
    public final float a(final int n, final int n2, final Buffer buffer, final int n3, final int n4, final Buffer buffer2, final int n5, final int n6, final Buffer buffer3, final int n7, final int n8, final float[] array) {
        if (!this.b.get()) {
            return this.nativeScoreYUV(this.a, n, n2, buffer, n3, n4, buffer2, n5, n6, buffer3, n7, n8, array);
        }
        return 0.0f;
    }
    
    @Override
    public final void b() {
        if (!this.b.getAndSet(true)) {
            this.nativeClose(this.a);
        }
    }
    
    @Override
    public final void c(final boolean b) {
        if (this.b.getAndSet(false)) {
            this.a = nativeLoad(b);
        }
    }
    
    @Override
    protected final void finalize() {
        try {
            this.b();
        }
        finally {
            super.finalize();
        }
    }
}
