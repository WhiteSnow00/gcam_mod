// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.autotimer.analysis.jni;

import java.nio.ByteBuffer;

class AnalysisImage$Plane implements ljt
{
    private final ljt a;
    
    public AnalysisImage$Plane(final ljt a) {
        this.a = a;
    }
    
    @Override
    public ByteBuffer getBuffer() {
        return this.a.getBuffer();
    }
    
    @Override
    public int getPixelStride() {
        return this.a.getPixelStride();
    }
    
    @Override
    public int getRowStride() {
        return this.a.getRowStride();
    }
}
