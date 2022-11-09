import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idv
{
    public static final nsd a;
    public final int b;
    public final int c;
    public final String d;
    public EGLDisplay e;
    public EGLConfig f;
    public EGLConfig[] g;
    public EGLContext h;
    public EGLSurface i;
    public EGL10 j;
    public GL10 k;
    public idu l;
    
    static {
        a = nsd.g("com/google/android/apps/camera/timelapse/stabilization/warp/PixelBuffer");
    }
    
    public idv(final int c, final int b) {
        this.c = c;
        this.b = b;
        this.d = Thread.currentThread().getName();
    }
}
