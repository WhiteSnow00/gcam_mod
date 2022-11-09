import android.opengl.GLUtils;
import android.opengl.EGL14;
import android.opengl.GLES30;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mad
{
    public static final int[] a;
    
    static {
        a = new int[2];
    }
    
    public static int a() {
        final int[] array = { 0 };
        GLES30.glGenFramebuffers(1, array, 0);
        return array[0];
    }
    
    public static String b() {
        return GLUtils.getEGLErrorString(EGL14.eglGetError());
    }
    
    public static void c(final int n) {
        GLES30.glDeleteFramebuffers(1, new int[] { n }, 0);
    }
    
    public static void d(final int n) {
        GLES30.glDeleteRenderbuffers(1, new int[] { n }, 0);
    }
}
