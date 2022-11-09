// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.oliveoil.gl;

import android.opengl.EGL14;
import com.google.android.libraries.oliveoil.util.JniUtil;
import android.hardware.HardwareBuffer;

public class EGLImage implements lvi
{
    public final long a;
    private final HardwareBuffer b;
    
    public EGLImage(final HardwareBuffer b) {
        final int a = JniUtil.a;
        this.b = b;
        final long image = createImage(b);
        this.a = image;
        if (image < 0L && image >= -15L) {
            String s;
            if (image != -1L) {
                if (image != -2L) {
                    if (image == -3L) {
                        s = "eglCreateImageKHR failed";
                    }
                    else {
                        s = "unknown error";
                    }
                }
                else {
                    s = "eglGetNativeClientBufferANDROID failed";
                }
            }
            else {
                s = "unsupported Android version";
            }
            throw new RuntimeException(String.format("Could not create EGLImage: %s (EGL error %d).", s, EGL14.eglGetError()));
        }
    }
    
    public static native void attachToRbo(final long p0);
    
    public static native void attachToTexture(final long p0);
    
    private static native void close(final long p0);
    
    private static native long createImage(final HardwareBuffer p0);
    
    public final int a() {
        return this.b.getFormat();
    }
    
    public final lvk b() {
        return lvl.d(this.b.getWidth(), this.b.getHeight());
    }
    
    @Override
    public final void close() {
        close(this.a);
    }
}
