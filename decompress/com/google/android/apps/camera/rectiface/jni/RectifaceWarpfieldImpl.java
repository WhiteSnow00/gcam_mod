// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.rectiface.jni;

public final class RectifaceWarpfieldImpl implements hbj, krc
{
    public static final nsd a;
    public long b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/rectiface/jni/RectifaceWarpfieldImpl");
        hbk.a();
    }
    
    public RectifaceWarpfieldImpl() {
        this.b = 0L;
    }
    
    public static native long initializeImpl();
    
    private static native void releaseImpl(final long p0);
    
    @Override
    public final long a() {
        return this.b;
    }
    
    @Override
    public final void close() {
        final long b = this.b;
        if (b != 0L) {
            releaseImpl(b);
            this.b = 0L;
        }
    }
}
