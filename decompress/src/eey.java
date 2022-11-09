import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eey
{
    public final float[] a;
    private final float[] b;
    private FloatBuffer c;
    private final float[] d;
    private FloatBuffer e;
    private final float[] f;
    private muh g;
    private muj h;
    private muj i;
    private mue j;
    private mue k;
    
    public eey() {
        final float[] array;
        final float[] b = array = new float[8];
        array[0] = -1.0f;
        array[1] = 1.0f;
        array[3] = (array[2] = -1.0f);
        array[4] = 1.0f;
        array[6] = (array[5] = 1.0f);
        array[7] = -1.0f;
        this.b = b;
        this.c = mug.a(b);
        final float[] array2;
        final float[] d = array2 = new float[16];
        array2[0] = 0.0f;
        array2[2] = (array2[1] = 0.0f);
        array2[3] = 0.5f;
        array2[4] = 0.0f;
        array2[6] = (array2[5] = 0.0f);
        array2[7] = 0.5f;
        array2[8] = 0.0f;
        array2[10] = (array2[9] = 0.0f);
        array2[11] = 0.5f;
        array2[12] = 0.0f;
        array2[14] = (array2[13] = 0.0f);
        array2[15] = 0.5f;
        this.d = d;
        this.e = mug.a(d);
        final float[] a = new float[16];
        this.a = a;
        this.f = new float[16];
        Matrix.setIdentityM(a, 0);
    }
    
    public final void a() {
        final muh g = this.g;
        if (g != null) {
            g.d();
            this.g = null;
        }
    }
    
    public final void b() {
        if (this.g == null) {
            final muh g = new muh("attribute vec2 vertexAttrib;attribute vec4 vertexColorAttrib;varying vec4 vertexColor;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  vertexColor = vertexColorAttrib;  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;varying vec4 vertexColor;void main() {  gl_FragColor = vertexColor;}");
            this.g = g;
            this.h = g.b("vertexTransform");
            this.i = this.g.b("projectionMatrix");
            this.j = this.g.a("vertexAttrib");
            this.k = this.g.a("vertexColorAttrib");
        }
        final muh g2 = this.g;
        g2.getClass();
        g2.c();
        this.j.b();
        this.j.c(this.c, 2);
        this.k.b();
        this.k.c(this.e, 4);
        this.h.a(this.a);
        this.i.a(this.f);
        GLES20.glDrawArrays(5, 0, this.c.capacity() / 2);
        this.k.a();
        this.j.a();
        g2.e();
    }
    
    public final void c(float n, final float n2) {
        n /= n2;
        Matrix.orthoM(this.f, 0, -n, n, -1.0f, 1.0f, -1.0f, 1.0f);
    }
    
    public final void d(final float n, final float n2, final float n3, final float n4) {
        final float[] b = this.b;
        b[0] = n;
        b[1] = n2;
        b[2] = n;
        b[3] = n4;
        b[4] = n3;
        b[5] = n2;
        b[6] = n3;
        b[7] = n4;
        this.c = mug.a(b);
    }
    
    public final void e(final float[] array) {
        this.e = mug.a(array);
    }
}
