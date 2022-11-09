import android.opengl.EGLDisplay;
import android.opengl.EGL15;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import android.opengl.EGLSync;
import android.opengl.EGL14;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public class lza
{
    public static lyp a(final lyp lyp) {
        return new lzk(lyp);
    }
    
    public static lys b(final lvy lvy) {
        return new lyy(lvy, lvy);
    }
    
    public static void c(final lyp lyp) {
        lyp.f(ftm.f, iey.k);
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        final EGLSync eglSync = (EGLSync)ofi.v(ofi.q(new lyw(eglGetDisplay), lyp));
        EGL15.eglClientWaitSync(eglGetDisplay, eglSync, 1, -1L);
        EGL15.eglDestroySync(eglGetDisplay, eglSync);
    }
    
    public static lyc d() {
        return new lyc(new lxy(lvl.d(1, 1)));
    }
    
    public static lxx e(lxx b, final lvl lvl) {
        try {
            b = b.b(lvl);
            return b;
        }
        catch (final ClassCastException ex) {
            throw new AssertionError((Object)"Resizable layout returns wrong type!");
        }
    }
}
