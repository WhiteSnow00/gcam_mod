import java.nio.Buffer;
import android.opengl.GLES30;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class lzo extends lvh implements lzy
{
    public final map a;
    public final EGLDisplay b;
    public final EGLSurface c;
    public final EGLContext d;
    private final EGLConfig e;
    private final int f;
    private final lxx g;
    
    public lzo(final map a, final EGLDisplay b, final EGLSurface c, final EGLContext d, final EGLConfig e, final int f, final lxx g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void bG() {
        lwt.f(this.b());
    }
    
    @Override
    public final EGLConfig d() {
        return this.e;
    }
    
    @Override
    public final EGLContext e() {
        return this.d;
    }
    
    @Override
    public final EGLDisplay f() {
        return this.b;
    }
    
    @Override
    public final EGLSurface g() {
        return this.c;
    }
    
    @Override
    public final map h() {
        return this.a;
    }
    
    @Override
    public final void i() {
        final EGLDisplay b = this.b;
        final EGLSurface c = this.c;
        if (EGL14.eglMakeCurrent(b, c, c, this.d)) {
            GLES30.glBindFramebuffer(36160, this.f);
            GLES30.glViewport(0, 0, this.g.a.b(), this.g.a.a());
        }
    }
    
    @Override
    public final void j(final Buffer buffer) {
        lzp.a();
        if (this.a.b(map.a)) {
            GLES30.glReadBuffer(36064);
        }
        final lvk a = this.g.a;
        GLES30.glReadPixels(0, 0, a.b(), a.a(), 6408, 5121, buffer);
    }
    
    @Override
    public final void k() {
        if (this.f == 0) {
            EGL14.eglSwapBuffers(this.b, this.c);
        }
    }
    
    @Override
    public final lxx l() {
        return this.g;
    }
}
