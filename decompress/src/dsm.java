import android.graphics.SurfaceTexture;
import android.os.Handler;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsm
{
    public static final int[] a;
    public EGLConfig b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public EGL10 f;
    public GL10 g;
    public volatile boolean h;
    public final Handler i;
    public final dsl j;
    public final Object k;
    public final Runnable l;
    
    static {
        a = new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344 };
    }
    
    public dsm(SurfaceTexture surfaceTexture, final Handler i, final dsl j) {
        this.h = false;
        this.k = new Object();
        this.l = new dsi(this, 1);
        this.i = i;
        this.j = j;
        i.post((Runnable)new dsj(this, surfaceTexture));
        surfaceTexture = (SurfaceTexture)new Object();
        synchronized (surfaceTexture) {
            i.post((Runnable)new dsk(surfaceTexture));
            try {
                surfaceTexture.wait();
            }
            catch (final InterruptedException ex) {}
        }
    }
}
