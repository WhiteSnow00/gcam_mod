// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.microvideo.gcamuxer;

import java.nio.ByteBuffer;

public class AnnexBToAvcc
{
    static {
        System.loadLibrary("gcamuxer");
    }
    
    public static void a(final ByteBuffer byteBuffer) {
        njo.e(byteBuffer.isDirect(), "Conversion only works with direct ByteBuffers");
        processNative(byteBuffer, byteBuffer.limit());
    }
    
    private static native void processNative(final ByteBuffer p0, final int p1);
}
