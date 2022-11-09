// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.autotimer.analysis.jni;

public class Curator implements BaseCurator
{
    private long pointer;
    
    public Curator(final oqf oqf) {
        krk.b(Curator.class, "smartcapture_native");
        this.nativeAllocate();
        this.nativeInitialize(oqf.g());
    }
    
    private native void nativeAllocate();
    
    private native void nativeDispose();
    
    private native void nativeInitialize(final byte[] p0);
    
    private native byte[] nativeProcessImage(final AnalysisImage p0, final byte[] p1);
    
    private native void nativeReset();
    
    private native void nativeSetSaveAllowed(final boolean p0);
    
    private native void nativeTriggerCapture();
    
    private native void nativeUpdateCaptureTriggers(final byte[] p0);
    
    private native void nativeUpdateIndividualCaptureTrigger(final int p0);
    
    @Override
    public final oqu a(final lju lju, final opw opw) {
        return (oqu)oky.q(oqu.e, this.nativeProcessImage(new AnalysisImage(lju), opw.g()));
    }
    
    @Override
    public final void b(final boolean b) {
        this.nativeSetSaveAllowed(b);
    }
    
    @Override
    public final void close() {
        this.nativeDispose();
    }
    
    public native void nativeSetCaptureEnabled(final boolean p0);
}
