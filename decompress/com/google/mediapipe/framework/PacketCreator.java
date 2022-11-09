// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public class PacketCreator
{
    public Graph a;
    
    public PacketCreator(final Graph a) {
        this.a = a;
    }
    
    private void releaseWithSyncToken(final long n, final TextureReleaseCallback textureReleaseCallback) {
        textureReleaseCallback.release(new GraphGlSyncToken(n));
    }
    
    public native long nativeCreateGpuBuffer(final long p0, final int p1, final int p2, final int p3, final TextureReleaseCallback p4);
    
    public native long nativeCreateInt32(final long p0, final int p1);
    
    public native long nativeCreateProto(final long p0, final ProtoUtil$SerializedMessage p1);
}
