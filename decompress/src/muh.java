import android.util.Log;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class muh
{
    private static final String a;
    private int b;
    private int c;
    private int d;
    
    static {
        a = muh.class.getSimpleName();
    }
    
    public muh(final String s, final String s2) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.b = f(35633, s);
        this.c = f(35632, s2);
        GLES20.glAttachShader(this.d = GLES20.glCreateProgram(), this.b);
        GLES20.glAttachShader(this.d, this.c);
        GLES20.glLinkProgram(this.d);
    }
    
    private static int f(int glCreateShader, String s) {
        glCreateShader = GLES20.glCreateShader(glCreateShader);
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        final int[] array = { 0 };
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] == 0) {
            s = GLES20.glGetShaderInfoLog(glCreateShader);
            Log.e(muh.a, s);
            GLES20.glDeleteShader(glCreateShader);
            s = String.valueOf(s);
            if (s.length() != 0) {
                s = "Shader compilation failed: ".concat(s);
            }
            else {
                s = new String("Shader compilation failed: ");
            }
            throw new IllegalArgumentException(s);
        }
        return glCreateShader;
    }
    
    public final mue a(String concat) {
        final int glGetAttribLocation = GLES20.glGetAttribLocation(this.d, concat);
        if (glGetAttribLocation < 0) {
            final String a = muh.a;
            if (concat.length() != 0) {
                concat = "Could not find attribute named ".concat(concat);
            }
            else {
                concat = new String("Could not find attribute named ");
            }
            Log.e(a, concat);
            return null;
        }
        return new mue(glGetAttribLocation);
    }
    
    public final muj b(String concat) {
        final int glGetUniformLocation = GLES20.glGetUniformLocation(this.d, concat);
        if (glGetUniformLocation < 0) {
            final String a = muh.a;
            if (concat.length() != 0) {
                concat = "Could not find uniform named ".concat(concat);
            }
            else {
                concat = new String("Could not find uniform named ");
            }
            Log.e(a, concat);
            return null;
        }
        return new muj(glGetUniformLocation);
    }
    
    public final void c() {
        GLES20.glUseProgram(this.d);
    }
    
    public final void d() {
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
        GLES20.glDeleteProgram(this.d);
    }
    
    public final void e() {
        GLES20.glUseProgram(0);
    }
}
