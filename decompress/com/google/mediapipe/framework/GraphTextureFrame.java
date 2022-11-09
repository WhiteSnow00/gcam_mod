// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public class GraphTextureFrame implements TextureFrame
{
    public int a;
    public int b;
    public int c;
    public long d;
    private long e;
    
    public GraphTextureFrame(final long e, final long d) {
        this.d = Long.MIN_VALUE;
        this.e = e;
        this.a = this.nativeGetTextureName(e);
        this.b = this.nativeGetWidth(this.e);
        this.c = this.nativeGetHeight(this.e);
        this.d = d;
    }
    
    private native int nativeGetHeight(final long p0);
    
    private native int nativeGetTextureName(final long p0);
    
    private native int nativeGetWidth(final long p0);
    
    private native void nativeReleaseBuffer(final long p0);
    
    @Override
    public final int getHeight() {
        return this.c;
    }
    
    @Override
    public final int getTextureName() {
        return this.a;
    }
    
    @Override
    public final long getTimestamp() {
        return this.d;
    }
    
    @Override
    public final int getWidth() {
        return this.b;
    }
    
    @Override
    public final void release() {
        final long e = this.e;
        if (e != 0L) {
            this.nativeReleaseBuffer(e);
            this.e = 0L;
        }
    }
    
    @Override
    public final void release(final GlSyncToken glSyncToken) {
        glSyncToken.release();
        this.release();
    }
}
