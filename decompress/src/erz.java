import android.opengl.GLU;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class erz extends Exception
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/legacy/lightcycle/opengl/OpenGLException");
    }
    
    public erz(final String s) {
        super(s);
        a.n(erz.a.b(), "%s", s, '\u056f', this);
    }
    
    public erz(final String s, final String s2) {
        super(s);
        erz.a.b().h(this).E(1392).x("%s : %s", s, s2);
    }
    
    public static void a(final String s) {
        final int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        final String gluErrorString = GLU.gluErrorString(glGetError);
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(gluErrorString).length());
        sb.append(s);
        sb.append(": glError ");
        sb.append(gluErrorString);
        sb.append(" ");
        sb.append(glGetError);
        throw new erz(sb.toString());
    }
}
