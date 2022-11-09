// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.imax.cyclops.processing;

import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;
import android.graphics.Bitmap;

public class NativeCaptureImpl implements edh
{
    public final int a;
    public final float b;
    private long nativeRef;
    
    static {
        System.loadLibrary("cyclops");
    }
    
    public NativeCaptureImpl() {
        this(512, 60.0f);
    }
    
    public NativeCaptureImpl(final int a, final float b) {
        this.nativeRef = 0L;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public native float getCaptureProgress();
    
    @Override
    public native Bitmap getPreview(final int p0);
    
    @Override
    public native Texture getPreviewAsTexture();
    
    @Override
    public native void getTrackerStats(final TrackerStats p0);
    
    public native void initialize(final int p0, final int p1, final int p2, final int p3, final int p4, final float p5);
    
    @Override
    public native void release();
    
    @Override
    public native void setMetaData(final float p0, final int p1, final boolean p2, final int p3, final boolean p4);
    
    @Override
    public native void startCapture();
    
    @Override
    public native int stopCapture(final String p0);
    
    @Override
    public native boolean trackTexture(final float[] p0, final float[] p1);
}
