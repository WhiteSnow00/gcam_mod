import java.util.concurrent.Executor;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

final class mac extends lzo
{
    final /* synthetic */ lzy e;
    final /* synthetic */ int f;
    final /* synthetic */ mde g;
    
    public mac(final map map, final EGLDisplay eglDisplay, final EGLSurface eglSurface, final EGLContext eglContext, final EGLConfig eglConfig, final int n, final lxx lxx, final lzy e, final int f, final mde g) {
        this.e = e;
        this.f = f;
        this.g = g;
        super(map, eglDisplay, eglSurface, eglContext, eglConfig, n, lxx);
    }
    
    public final lwk b() {
        try {
            this.e.i();
            mad.d(0);
            mad.c(this.f);
            return this.g.a();
        }
        finally {
            final Throwable t;
            return lwk.i(this.g.a().a(odx.a, lwt.l(t)));
        }
    }
}
