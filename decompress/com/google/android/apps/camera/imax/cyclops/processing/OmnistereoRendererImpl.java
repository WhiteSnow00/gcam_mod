// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.imax.cyclops.processing;

import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;

public class OmnistereoRendererImpl implements edj
{
    public int a;
    public boolean b;
    private long exposureScalesRef;
    private long modelRef;
    private long rendererRef;
    
    static {
        System.loadLibrary("cyclops");
    }
    
    public OmnistereoRendererImpl(final String s) {
        this.rendererRef = 0L;
        this.modelRef = 0L;
        this.exposureScalesRef = 0L;
        this.a = 0;
        this.b = false;
        this.b = this.nativeInitialize(s, 0);
    }
    
    private native boolean nativeInitialize(final String p0, final int p1);
    
    public final void finalize() {
        super.finalize();
        this.nativeRelease();
    }
    
    @Override
    public native StereoPanorama getResult(final boolean p0);
    
    public native void nativeApplyTexture(final int p0, final int p1, final int p2, final int p3);
    
    public native void nativeRelease();
}
