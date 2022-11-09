import j$.util.Objects;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import android.opengl.EGLConfig;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.view.Surface;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class muf
{
    public EGLDisplay a;
    public EGLSurface b;
    private final Surface c;
    private EGLContext d;
    
    public muf() {
        this.c = null;
        final EGLDisplay e = e();
        this.a = e;
        final EGLConfig c = c(e, false, true);
        this.d = d(this.a, EGL14.EGL_NO_CONTEXT, c);
        this.b = EGL14.eglCreatePbufferSurface(this.a, c, new int[] { 12375, 1, 12374, 1, 12344 }, 0);
    }
    
    public muf(final EGLContext eglContext, final Surface c) {
        this.c = c;
        final EGLDisplay e = e();
        this.a = e;
        final EGLConfig c2 = c(e, true, false);
        final EGLDisplay a = this.a;
        EGLContext egl_NO_CONTEXT = eglContext;
        if (eglContext == null) {
            egl_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        }
        this.d = d(a, egl_NO_CONTEXT, c2);
        this.b = EGL14.eglCreateWindowSurface(this.a, c2, (Object)c, new int[] { 12344 }, 0);
    }
    
    private static EGLConfig c(final EGLDisplay eglDisplay, final boolean b, final boolean b2) {
        final ArrayList list = new ArrayList();
        final Integer value = 8;
        final Integer value2 = 1;
        list.addAll(Arrays.asList(12324, value, 12323, value, 12322, value, 12321, value, 12352, 4));
        if (b) {
            list.addAll(Arrays.asList(12610, value2));
        }
        if (b2) {
            list.addAll(Arrays.asList(12339, value2));
        }
        list.add(12344);
        final int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            array[i] = (int)list.get(i);
        }
        final EGLConfig[] array2 = { null };
        final int[] array3 = { 0 };
        EGL14.eglChooseConfig(eglDisplay, array, 0, array2, 0, 1, array3, 0);
        if (array3[0] != 0) {
            return array2[0];
        }
        throw new RuntimeException("Could not find a valid EGL configuration");
    }
    
    private static EGLContext d(final EGLDisplay eglDisplay, final EGLContext eglContext, final EGLConfig eglConfig) {
        return EGL14.eglCreateContext(eglDisplay, eglConfig, eglContext, new int[] { 12440, 2, 12344 }, 0);
    }
    
    private static EGLDisplay e() {
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (Objects.equals((Object)eglGetDisplay, (Object)EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        final int[] array = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
            return eglGetDisplay;
        }
        throw new RuntimeException("unable to initialize EGL14");
    }
    
    public final void a() {
        if (!Objects.equals((Object)this.a, (Object)EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglMakeCurrent(this.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.a, this.b);
            EGL14.eglDestroyContext(this.a, this.d);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.a);
        }
        this.a = EGL14.EGL_NO_DISPLAY;
        this.d = EGL14.EGL_NO_CONTEXT;
        this.b = EGL14.EGL_NO_SURFACE;
        final Surface c = this.c;
        if (c != null) {
            c.release();
        }
    }
    
    public final void b() {
        final EGLDisplay a = this.a;
        final EGLSurface b = this.b;
        EGL14.eglMakeCurrent(a, b, b, this.d);
    }
}
