import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.EGLConfig;
import android.opengl.EGL14;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czu
{
    private static final nsd c;
    private static kre d;
    public final kre a;
    public final int b;
    private final Context e;
    
    static {
        c = nsd.g("com/google/android/apps/camera/data/GlideFilmstripManager");
    }
    
    public czu(final Context e, final cxl cxl) {
        this.e = e;
        final int intValue = (int)cxl.a(cxr.d).c();
        this.a = new kre(intValue, intValue);
        this.b = (int)cxl.a(cxr.e).c();
    }
    
    public static kre d(final kre kre, double min, final kre kre2) {
        final int a = kre.a;
        final int b = kre.b;
        if (a * b < min && a < kre2.a && b < kre2.b) {
            return kre;
        }
        final double n = (double)kre.b();
        Double.isNaN(n);
        min = Math.min(Math.sqrt(min / n), 1.0);
        final double n2 = kre.a;
        Double.isNaN(n2);
        final int n3 = (int)Math.round(n2 * min);
        final double n4 = kre.b;
        Double.isNaN(n4);
        final int n5 = (int)Math.round(n4 * min);
        final int a2 = kre2.a;
        if (n3 <= a2 && n5 <= kre2.b) {
            return new kre(n3, n5);
        }
        final double n6 = kre.a;
        min = a2;
        Double.isNaN(min);
        Double.isNaN(n6);
        min /= n6;
        final double n7 = kre2.b;
        final double n8 = kre.b;
        Double.isNaN(n7);
        Double.isNaN(n8);
        final double n9 = n7 / n8;
        if (min > n9) {
            min = n9;
        }
        Double.isNaN(n6);
        final int min2 = Math.min((int)Math.round(n6 * min), kre2.a);
        final double n10 = kre.b;
        Double.isNaN(n10);
        return new kre(min2, Math.min((int)Math.round(n10 * min), kre2.b));
    }
    
    public static kre e() {
        if (czu.d == null) {
            final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            final int[] array = new int[2];
            EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1);
            final EGLConfig[] array2 = { null };
            final int[] array3 = { 0 };
            EGL14.eglChooseConfig(eglGetDisplay, new int[] { 12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344 }, 0, array2, 0, 1, array3, 0);
            Integer value;
            if (array3[0] == 0) {
                a.l(czu.c.c(), "No EGL configurations found!", '\u0299');
                value = null;
            }
            else {
                final EGLConfig eglConfig = array2[0];
                final EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eglConfig, new int[] { 12375, 64, 12374, 64, 12344 }, 0);
                final EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eglConfig, EGL14.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
                EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                final int[] array4 = { 0 };
                GLES20.glGetIntegerv(3379, array4, 0);
                final int n = array4[0];
                EGL14.eglMakeCurrent(eglGetDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                value = n;
            }
            if (value == null) {
                czu.d = new kre(2048, 2048);
            }
            else if (value > 4096) {
                czu.d = new kre(4096, 4096);
            }
            else {
                czu.d = new kre(value, value);
            }
        }
        return czu.d;
    }
    
    public static final bho f() {
        return (bho)new bho().w(bex.a, 0L);
    }
    
    public final auw a() {
        return auf.c(this.e).b();
    }
    
    public final auw b() {
        return auf.c(this.e).c();
    }
    
    public final bho c(final awc awc, kre d) {
        d = d(d, this.b, e());
        return (bho)new bho().x(awc).G().p().t(d.a, d.b);
    }
}
