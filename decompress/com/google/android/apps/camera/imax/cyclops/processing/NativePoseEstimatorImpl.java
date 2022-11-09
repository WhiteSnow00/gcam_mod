// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.imax.cyclops.processing;

import com.google.geo.lightfield.processing.ProgressCallback;

public class NativePoseEstimatorImpl implements edl
{
    static {
        System.loadLibrary("cyclops");
    }
    
    @Override
    public native boolean computePose(final String p0, final ProgressCallback p1);
}
