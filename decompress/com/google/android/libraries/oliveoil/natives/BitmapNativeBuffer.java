// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.oliveoil.natives;

import com.google.android.libraries.oliveoil.util.JniUtil;
import android.graphics.Bitmap$Config;
import java.nio.ByteBuffer;
import android.graphics.Bitmap;

public class BitmapNativeBuffer extends mda
{
    private final Bitmap b;
    private int c;
    private ByteBuffer d;
    
    public BitmapNativeBuffer(final Bitmap b) {
        super(new lxy(lvl.d(b.getWidth(), b.getHeight()), b.getRowBytes() * 8));
        boolean b2 = false;
        this.c = 0;
        if (b.getConfig() == Bitmap$Config.ARGB_8888) {
            b2 = true;
        }
        njo.d(b2);
        this.b = b;
        final int a = JniUtil.a;
    }
    
    private static native ByteBuffer lockBitmapPixels(final Bitmap p0);
    
    private static native void unlockBitmapPixels(final Bitmap p0);
    
    public final ByteBuffer a() {
        synchronized (this) {
            if (this.c++ == 0) {
                this.d = lockBitmapPixels(this.b);
            }
            final ByteBuffer d = this.d;
            if (d != null) {
                return d;
            }
            --this.c;
            throw new RuntimeException("Could not lock bitmap pixels!");
        }
    }
    
    public final void b() {
        synchronized (this) {
            njo.o(this.d != null);
            final int c = this.c - 1;
            this.c = c;
            if (c == 0) {
                unlockBitmapPixels(this.b);
                this.d = null;
            }
        }
    }
    
    @Override
    public final mde c() {
        return new mct(this);
    }
    
    @Override
    public final void close() {
    }
}
