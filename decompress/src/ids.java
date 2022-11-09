import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import android.opengl.GLES30;
import java.nio.ShortBuffer;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ids
{
    public final FloatBuffer a;
    public final int b;
    public final int c;
    public final int d;
    public final ShortBuffer e;
    public int[] f;
    public int[] g;
    public int h;
    public final jvh i;
    private int j;
    
    public ids(final jvh i, int j, int k, final byte[] array, final byte[] array2) {
        this.f = new int[1];
        this.g = new int[2];
        this.h = 0;
        this.i = i;
        this.c = j;
        this.b = k;
        final int b = b(35633, "      attribute vec4 a_vertex;\n      varying vec2 o_texture;\n      void main() {\n        // Scale the position to [-1, 1]\n        gl_Position.xy = a_vertex.xy * 2.0 - 1.0;\n        gl_Position.z = 0.0;\n        gl_Position.w = 1.0;\n        o_texture = a_vertex.zw;\n      }");
        final int b2 = b(35632, "      uniform sampler2D texture;\n      varying vec2 o_texture;\n      void main() {\n        vec3 val = texture2D(texture, o_texture).rgb;\n        gl_FragColor = vec4(val, 1.0);\n      }");
        GLES30.glAttachShader(this.j = GLES30.glCreateProgram(), b);
        GLES30.glAttachShader(this.j, b2);
        GLES30.glLinkProgram(this.j);
        GLES30.glUseProgram(this.j);
        GLES30.glGenBuffers(2, this.g, 0);
        GLES30.glBindBuffer(35051, this.g[0]);
        j = j * 4 * k;
        GLES30.glBufferData(35051, j, (Buffer)null, 35045);
        GLES30.glBindBuffer(35051, this.g[1]);
        GLES30.glBufferData(35051, j, (Buffer)null, 35045);
        GLES30.glBindBuffer(35051, 0);
        GLES30.glGenTextures(1, this.f, 0);
        GLES30.glActiveTexture(33984);
        GLES30.glBindTexture(3553, this.f[0]);
        GLES30.glTexParameterf(3553, 10242, 33071.0f);
        GLES30.glTexParameterf(3553, 10243, 33071.0f);
        GLES30.glTexParameterf(3553, 10241, 9729.0f);
        GLES30.glTexParameterf(3553, 10240, 9729.0f);
        this.d = GLES30.glGetAttribLocation(this.j, "a_vertex");
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1452);
        allocateDirect.order(ByteOrder.nativeOrder());
        final ShortBuffer shortBuffer = allocateDirect.asShortBuffer();
        int n;
        short n2;
        int n3;
        short n4;
        for (j = 0; j < 11; ++j) {
            for (k = 0; k < 11; ++k) {
                n = j * 12 + k;
                n2 = (short)(n + 1);
                n3 = (j + 1) * 12 + k;
                n4 = (short)n3;
                shortBuffer.put((short)n);
                shortBuffer.put(n2);
                shortBuffer.put(n4);
                shortBuffer.put(n2);
                shortBuffer.put((short)(n3 + 1));
                shortBuffer.put(n4);
            }
        }
        shortBuffer.position(0);
        this.e = shortBuffer;
        final ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(2304);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.a = allocateDirect2.asFloatBuffer();
    }
    
    private static int b(int glCreateShader, final String s) {
        glCreateShader = GLES30.glCreateShader(glCreateShader);
        GLES30.glShaderSource(glCreateShader, s);
        GLES30.glCompileShader(glCreateShader);
        return glCreateShader;
    }
    
    public final int a() {
        return 1 - this.h;
    }
}
