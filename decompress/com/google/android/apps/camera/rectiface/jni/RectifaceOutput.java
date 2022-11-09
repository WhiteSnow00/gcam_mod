// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.rectiface.jni;

public final class RectifaceOutput
{
    public long a;
    
    static {
        hbk.a();
    }
    
    public RectifaceOutput() {
        this.a = initializeImpl();
    }
    
    private static native int getCameraFovInDegreeImpl(final long p0);
    
    private static native float getFaceConformalityAfterShapeCorrectionImpl(final long p0, final int p1);
    
    private static native int getFaceConformalityAfterShapeCorrectionSizeImpl(final long p0);
    
    private static native float getFaceConformalityBeforeShapeCorrectionImpl(final long p0, final int p1);
    
    private static native int getFaceConformalityBeforeShapeCorrectionSizeImpl(final long p0);
    
    private static native int getFaceDistortionCorrectionProcessingTimeMsImpl(final long p0);
    
    private static native int getPortraitRelightingTimeMsImpl(final long p0);
    
    private static native int getShapeCorrectionModeImpl(final long p0);
    
    private static native long initializeImpl();
    
    private static native void releaseImpl(final long p0);
    
    public final float a(final int n) {
        return getFaceConformalityAfterShapeCorrectionImpl(this.a, n);
    }
    
    public final float b(final int n) {
        return getFaceConformalityBeforeShapeCorrectionImpl(this.a, n);
    }
    
    public final int c() {
        return getCameraFovInDegreeImpl(this.a);
    }
    
    public final int d() {
        return getFaceConformalityAfterShapeCorrectionSizeImpl(this.a);
    }
    
    public final int e() {
        return getFaceConformalityBeforeShapeCorrectionSizeImpl(this.a);
    }
    
    public final int f() {
        return getFaceDistortionCorrectionProcessingTimeMsImpl(this.a);
    }
    
    public final int g() {
        return getPortraitRelightingTimeMsImpl(this.a);
    }
    
    public final int h() {
        return getCameraFovInDegreeImpl(this.a);
    }
    
    public final int i() {
        return getShapeCorrectionModeImpl(this.a);
    }
    
    public final void j() {
        releaseImpl(this.a);
    }
}
