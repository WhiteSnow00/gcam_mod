import java.nio.Buffer;
import java.nio.FloatBuffer;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public class esa
{
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    
    public esa() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }
    
    public esa(final byte[] array) {
        this();
        final int a = a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord );  \n}                                                   \n");
        this.d = a;
        this.a = h(a, "aPosition");
        this.b = h(this.d, "aTextureCoord");
        this.c = i(this.d, "uMvpMatrix");
    }
    
    public esa(final char[] array) {
        this();
        final int a = a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = 0.85;                                \n  if (texcolor.r < .0001) texcolor.a = 0.0;         \n  gl_FragColor = texcolor;                          \n}                                                   \n");
        this.d = a;
        this.a = h(a, "aPosition");
        this.b = h(this.d, "aTextureCoord");
        this.c = i(this.d, "uMvpMatrix");
    }
    
    public static int a(final String s, final String s2) {
        final int b = b(35633, s);
        final int b2 = b(35632, s2);
        final int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            throw new erz("Unable to create program");
        }
        GLES20.glAttachShader(glCreateProgram, b);
        erz.a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, b2);
        erz.a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        final int[] array = { 0 };
        GLES20.glGetProgramiv(glCreateProgram, 35714, array, 0);
        if (array[0] == 1) {
            GLES20.glDeleteShader(b);
            GLES20.glDeleteShader(b2);
            return glCreateProgram;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        throw new erz("Could not link program", GLES20.glGetProgramInfoLog(glCreateProgram));
    }
    
    protected static int b(final int n, final String s) {
        final int glCreateShader = GLES20.glCreateShader(n);
        if (glCreateShader == 0) {
            throw new erz("Unable to create shader");
        }
        GLES20.glShaderSource(glCreateShader, s);
        GLES20.glCompileShader(glCreateShader);
        final int[] array = { 0 };
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] != 0) {
            return glCreateShader;
        }
        final String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        final StringBuilder sb = new StringBuilder(36);
        sb.append("Unable to compile shader ");
        sb.append(n);
        throw new erz(sb.toString(), glGetShaderInfoLog);
    }
    
    protected static final int h(int glGetAttribLocation, String concat) {
        glGetAttribLocation = GLES20.glGetAttribLocation(glGetAttribLocation, concat);
        if (glGetAttribLocation != -1) {
            if (concat.length() != 0) {
                concat = "glGetAttribLocation ".concat(concat);
            }
            else {
                concat = new String("glGetAttribLocation ");
            }
            erz.a(concat);
            return glGetAttribLocation;
        }
        final StringBuilder sb = new StringBuilder(concat.length() + 25);
        sb.append("Unable to find ");
        sb.append(concat);
        sb.append(" in shader");
        throw new erz(sb.toString());
    }
    
    protected static final int i(int glGetUniformLocation, String concat) {
        glGetUniformLocation = GLES20.glGetUniformLocation(glGetUniformLocation, concat);
        if (glGetUniformLocation != -1) {
            if (concat.length() != 0) {
                concat = "glGetUniformLocation ".concat(concat);
            }
            else {
                concat = new String("glGetUniformLocation ");
            }
            erz.a(concat);
            return glGetUniformLocation;
        }
        final StringBuilder sb = new StringBuilder(concat.length() + 25);
        sb.append("Unable to find ");
        sb.append(concat);
        sb.append(" in shader");
        throw new erz(sb.toString());
    }
    
    public final void c() {
        GLES20.glUseProgram(this.d);
    }
    
    public final void d() {
        GLES20.glDeleteProgram(this.d);
    }
    
    public final void e(final FloatBuffer floatBuffer) {
        final int b = this.b;
        if (b < 0) {
            return;
        }
        GLES20.glVertexAttribPointer(b, 2, 5126, false, 0, (Buffer)floatBuffer);
        GLES20.glEnableVertexAttribArray(this.b);
    }
    
    public final void f(final float[] array) {
        final int c = this.c;
        if (c < 0) {
            return;
        }
        GLES20.glUniformMatrix4fv(c, 1, false, array, 0);
    }
    
    public final void g(final FloatBuffer floatBuffer) {
        final int a = this.a;
        if (a < 0) {
            return;
        }
        GLES20.glVertexAttribPointer(a, 3, 5126, false, 12, (Buffer)floatBuffer);
        GLES20.glEnableVertexAttribArray(this.a);
    }
}
