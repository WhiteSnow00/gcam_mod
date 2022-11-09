import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.Log;
import android.opengl.GLES30;
import android.opengl.EGLConfig;
import android.opengl.EGL14;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lyz implements Callable
{
    private final map a;
    private final lyc b;
    
    public lyz(final map a, final lyc b) {
        this.a = a;
        this.b = b;
    }
}
