import java.util.concurrent.Executor;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

final class maa extends lzo
{
    final /* synthetic */ lzy e;
    final /* synthetic */ mde f;
    
    public maa(final map map, final EGLDisplay eglDisplay, final EGLSurface eglSurface, final EGLContext eglContext, final EGLConfig eglConfig, final lxx lxx, final lzy e, final mde f) {
        this.e = e;
        this.f = f;
        super(map, eglDisplay, eglSurface, eglContext, eglConfig, 0, lxx);
    }
    
    public final lwk b() {
        try {
            this.e.i();
            return this.f.a();
        }
        finally {
            final Throwable t;
            return lwk.i(this.f.a().a(odx.a, lwt.l(t)));
        }
    }
}
