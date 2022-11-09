import javax.microedition.khronos.opengles.GL10;
import android.opengl.EGL14;
import javax.microedition.khronos.egl.EGL10;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsi implements Runnable
{
    final /* synthetic */ dsm a;
    private final /* synthetic */ int b;
    
    public dsi(final dsm a) {
        this.a = a;
    }
    
    public dsi(final dsm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final Object k = this.a.k;
                synchronized (k) {
                    final dsm a = this.a;
                    if (a.c != null && a.e != null) {
                        final dsl j = a.j;
                        final GL10 g = a.g;
                        final esv r = ((fol)j).r;
                        if (r != null) {
                            r.onDrawFrame(g);
                        }
                        final dsm a2 = this.a;
                        a2.f.eglSwapBuffers(a2.c, a2.e);
                        this.a.h = false;
                    }
                    this.a.k.notifyAll();
                    return;
                }
                break;
            }
            case 0: {
                final dsm a3 = this.a;
                a3.f.eglDestroySurface(a3.c, a3.e);
                final dsm a4 = this.a;
                a4.f.eglDestroyContext(a4.c, a4.d);
                final dsm a5 = this.a;
                a5.f.eglMakeCurrent(a5.c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                final dsm a6 = this.a;
                a6.e = null;
                a6.d = null;
                a6.c = null;
                EGL14.eglReleaseThread();
            }
        }
    }
}
