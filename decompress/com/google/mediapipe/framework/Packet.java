// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public class Packet
{
    public long a;
    
    public Packet(final long a) {
        this.a = a;
    }
    
    public static Packet create(final long n) {
        return new Packet(n);
    }
    
    private native long nativeGetTimestamp(final long p0);
    
    private native void nativeReleasePacket(final long p0);
    
    public final long a() {
        return this.nativeGetTimestamp(this.a);
    }
    
    public long getNativeHandle() {
        return this.a;
    }
    
    public native long nativeCopyPacket(final long p0);
    
    public void release() {
        final long a = this.a;
        if (a != 0L) {
            this.nativeReleasePacket(a);
            this.a = 0L;
        }
    }
}
