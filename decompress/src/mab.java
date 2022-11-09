import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

final class mab extends lzo
{
    final /* synthetic */ lzy e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    
    public mab(final map map, final EGLDisplay eglDisplay, final EGLSurface eglSurface, final EGLContext eglContext, final EGLConfig eglConfig, final int n, final lxy lxy, final lzy e, final int f, final int g) {
        this.e = e;
        this.f = f;
        this.g = g;
        super(map, eglDisplay, eglSurface, eglContext, eglConfig, n, lxy);
    }
    
    public final lwk b() {
        this.e.i();
        mad.d(this.f);
        mad.c(this.g);
        return lwj.a;
    }
}
