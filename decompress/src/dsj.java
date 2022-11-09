import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;
import android.graphics.SurfaceTexture;

// 
// Decompiled by Procyon v0.6.0
// 

final class dsj implements Runnable
{
    final /* synthetic */ SurfaceTexture a;
    final /* synthetic */ dsm b;
    
    public dsj(final dsm b, final SurfaceTexture a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.f = (EGL10)EGLContext.getEGL();
        final dsm b = this.b;
        b.c = b.f.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.b.c == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        final int[] array = new int[2];
        final dsm b2 = this.b;
        if (!b2.f.eglInitialize(b2.c, array)) {
            throw new RuntimeException("eglInitialize failed");
        }
        final dsm b3 = this.b;
        final EGL10 f = b3.f;
        final EGLDisplay c = b3.c;
        final int[] array2 = { 0 };
        if (!f.eglChooseConfig(c, dsm.a, (EGLConfig[])null, 0, array2)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        final int n = array2[0];
        if (n <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        final EGLConfig[] array3 = new EGLConfig[n];
        if (!f.eglChooseConfig(c, dsm.a, array3, n, array2)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        b3.b = array3[0];
        final dsm b4 = this.b;
        b4.d = b4.f.eglCreateContext(b4.c, b4.b, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
        final EGLContext d = this.b.d;
        if (d == null || d == EGL10.EGL_NO_CONTEXT) {
            throw new RuntimeException("failed to createContext");
        }
        final dsm b5 = this.b;
        b5.e = b5.f.eglCreateWindowSurface(b5.c, b5.b, (Object)this.a, (int[])null);
        final EGLSurface e = this.b.e;
        if (e == null || e == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("failed to createWindowSurface");
        }
        final dsm b6 = this.b;
        final EGL10 f2 = b6.f;
        final EGLDisplay c2 = b6.c;
        final EGLSurface e2 = b6.e;
        if (f2.eglMakeCurrent(c2, e2, e2, b6.d)) {
            final dsm b7 = this.b;
            b7.g = (GL10)b7.d.getGL();
            return;
        }
        throw new RuntimeException("failed to eglMakeCurrent");
    }
}
