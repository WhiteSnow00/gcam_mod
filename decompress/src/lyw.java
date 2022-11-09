import android.opengl.EGL15;
import android.opengl.EGLDisplay;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class lyw implements Callable
{
    final /* synthetic */ EGLDisplay a;
    
    public lyw(final EGLDisplay a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        return "eglWait";
    }
}
