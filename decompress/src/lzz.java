import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

final class lzz extends lzo
{
    final /* synthetic */ EGLDisplay e;
    
    public lzz(final map map, final EGLDisplay eglDisplay, final EGLSurface eglSurface, final EGLContext eglContext, final EGLConfig eglConfig, final lxx lxx, final EGLDisplay e) {
        this.e = e;
        super(map, eglDisplay, eglSurface, eglContext, eglConfig, 0, lxx);
    }
    
    public final lwk b() {
        EGL14.eglMakeCurrent(this.e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroyContext(super.b, super.d);
        EGL14.eglDestroySurface(super.b, super.c);
        return lwj.a;
    }
}
