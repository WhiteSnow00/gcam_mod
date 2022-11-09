// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.oliveoil.natives;

import java.nio.ByteBuffer;
import com.google.android.libraries.oliveoil.util.JniUtil;

public class NativeMemCopier implements mcx
{
    private final boolean a;
    
    public NativeMemCopier() {
        boolean a2;
        try {
            final int a = JniUtil.a;
            a2 = true;
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            a2 = false;
        }
        this.a = a2;
    }
    
    @Override
    public final boolean a(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        return this.a && byteBuffer.isDirect() && byteBuffer2.isDirect();
    }
    
    @Override
    public native void copyBytes(final ByteBuffer p0, final ByteBuffer p1, final int p2, final int p3, final int p4);
    
    @Override
    public native void copyBytes2D(final ByteBuffer p0, final ByteBuffer p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7);
    
    @Override
    public native void copyBytes2D(final ByteBuffer p0, final ByteBuffer p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9);
    
    @Override
    public final String toString() {
        return this.getClass().getSimpleName();
    }
}
