import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efa
{
    public FloatBuffer a;
    public Texture b;
    public int c;
    public boolean d;
    public final float[] e;
    private final float[] f;
    private FloatBuffer g;
    private final float[] h;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private muh l;
    private muj m;
    private muj n;
    private muj o;
    private muj p;
    private muj q;
    private muj r;
    private mue s;
    private mue t;
    
    public efa() {
        final float[] array;
        final float[] f = array = new float[8];
        array[0] = -1.0f;
        array[1] = 1.0f;
        array[3] = (array[2] = -1.0f);
        array[4] = 1.0f;
        array[6] = (array[5] = 1.0f);
        array[7] = -1.0f;
        this.f = f;
        this.g = mug.a(f);
        final float[] array2;
        final float[] h = array2 = new float[8];
        array2[0] = 0.0f;
        array2[1] = 1.0f;
        array2[3] = (array2[2] = 0.0f);
        array2[4] = 1.0f;
        array2[6] = (array2[5] = 1.0f);
        array2[7] = 0.0f;
        this.h = h;
        this.a = mug.a(h);
        this.b = null;
        final float[] i = new float[16];
        this.i = i;
        final float[] j = new float[16];
        this.j = j;
        final float[] k = new float[16];
        this.k = k;
        this.c = 33071;
        this.d = false;
        this.e = new float[] { 1.0f, 1.0f, 1.0f, 1.0f };
        Matrix.setIdentityM(i, 0);
        Matrix.setIdentityM(j, 0);
        Matrix.setIdentityM(k, 0);
    }
    
    public final void a() {
        final muh l = this.l;
        if (l != null) {
            l.d();
            this.l = null;
        }
    }
    
    public final void b() {
        final Texture b = this.b;
        if (b == null) {
            return;
        }
        if (this.l == null) {
            String s;
            if (b.getType() == 36197) {
                s = "#extension GL_OES_EGL_image_external : require \nprecision mediump float;uniform samplerExternalOES texture;uniform bool overrideColorActive;uniform vec4 overrideColor;varying vec2 texCoord;void main() {  vec4 texColor = texture2D(texture, texCoord);  gl_FragColor = (overrideColorActive && texColor.a > 0.01) ? overrideColor : texColor;}";
            }
            else {
                s = "precision mediump float;uniform sampler2D texture;uniform bool overrideColorActive;uniform vec4 overrideColor;varying vec2 texCoord;void main() {  vec4 texColor = texture2D(texture, texCoord);  gl_FragColor = (overrideColorActive && texColor.a > 0.01) ? overrideColor : texColor;}";
            }
            final muh l = new muh("attribute vec2 vertexAttrib;attribute vec2 texCoordAttrib;varying vec2 texCoord;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;uniform mat4 textureTransform;void main() {  texCoord = (textureTransform * vec4(texCoordAttrib, 0., 1.)).xy;  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", s);
            this.l = l;
            this.o = l.b("texture");
            this.m = this.l.b("vertexTransform");
            this.n = this.l.b("textureTransform");
            this.p = this.l.b("projectionMatrix");
            this.q = this.l.b("overrideColor");
            this.r = this.l.b("overrideColorActive");
            this.s = this.l.a("vertexAttrib");
            this.t = this.l.a("texCoordAttrib");
        }
        final muh i = this.l;
        i.getClass();
        i.c();
        this.s.b();
        this.s.c(this.g, 2);
        this.t.b();
        this.t.c(this.a, 2);
        final muj o = this.o;
        final Texture b2 = this.b;
        b2.getClass();
        o.c(b2);
        this.m.a(this.i);
        this.p.a(this.k);
        this.n.a(this.j);
        GLES20.glUniform1i(this.r.a, (int)(this.d ? 1 : 0));
        this.q.b(this.e);
        GLES20.glTexParameteri(3553, 10242, this.c);
        GLES20.glTexParameteri(3553, 10243, this.c);
        GLES20.glDrawArrays(5, 0, this.g.capacity() / 2);
        this.t.a();
        this.s.a();
        i.e();
    }
    
    public final void c(float n, final float n2) {
        n /= n2;
        Matrix.orthoM(this.k, 0, -n, n, -1.0f, 1.0f, -1.0f, 1.0f);
    }
    
    public final void d(float n, float n2) {
        n /= 2.0f;
        n2 /= 2.0f;
        final float[] f = this.f;
        final float n3 = -n;
        f[0] = n3;
        f[1] = n2;
        f[2] = n3;
        final float n4 = -n2;
        f[3] = n4;
        f[4] = n;
        f[5] = n2;
        f[6] = n;
        f[7] = n4;
        this.g = mug.a(f);
    }
    
    public final void e(final float[] array) {
        System.arraycopy(array, 0, this.j, 0, 16);
    }
    
    public final void f(final float[] array) {
        System.arraycopy(array, 0, this.i, 0, 16);
    }
}
