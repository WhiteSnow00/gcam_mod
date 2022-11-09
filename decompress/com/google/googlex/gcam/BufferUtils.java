// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.Buffer;

public final class BufferUtils
{
    private BufferUtils() {
    }
    
    public static long a(final Buffer buffer) {
        buffer.getClass();
        return getDirectBufferAddressImpl(buffer);
    }
    
    public static ByteBuffer b(final long n, final int n2) {
        final boolean b = true;
        njo.e(n != 0L, "ptr must not be 0.");
        njo.g(n2 > 0 && b, "capacity must be positive, got: %s", n2);
        return byteBufferViewOfNativePointerImpl(n, n2).order(ByteOrder.nativeOrder());
    }
    
    private static native ByteBuffer byteBufferViewOfNativePointerImpl(final long p0, final int p1);
    
    private static native long getDirectBufferAddressImpl(final Buffer p0);
    
    private static native long getDirectBufferCapacityImpl(final Buffer p0);
    
    public static native void setFloatVectorImpl(final float[] p0, final long p1);
}
