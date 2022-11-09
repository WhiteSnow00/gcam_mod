// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.dynamicdepth;

import android.hardware.camera2.CaptureResult;

public class DynamicDepthResult implements krc
{
    public long a;
    
    public DynamicDepthResult(final int n, final int n2, final boolean b) {
        dew.a();
        this.a = alloc(n, n2, 0, false, b, null, null);
    }
    
    public DynamicDepthResult(final kre kre, final int n, final boolean b, final boolean b2, final ljm ljm) {
        float[] array2;
        float[] array3;
        if (ljm != null) {
            final float[] array = (float[])ljm.d(CaptureResult.LENS_INTRINSIC_CALIBRATION);
            array2 = (float[])ljm.d(CaptureResult.LENS_DISTORTION);
            array3 = array;
        }
        else {
            array3 = (array2 = null);
        }
        this.a = alloc(kre.a, kre.b, n, b, b2, array3, array2);
    }
    
    private static native long alloc(final int p0, final int p1, final int p2, final boolean p3, final boolean p4, final float[] p5, final float[] p6);
    
    private static native void dealloc(final long p0);
    
    @Override
    public final void close() {
        dealloc(this.a);
        this.a = 0L;
    }
}
