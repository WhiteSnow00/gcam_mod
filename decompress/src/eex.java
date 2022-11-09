import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eex
{
    private static final nsd b;
    public final float[] a;
    private FloatBuffer c;
    private final float[] d;
    private final float[] e;
    private muh f;
    private muj g;
    private muj h;
    private muj i;
    private mue j;
    private float k;
    
    static {
        b = nsd.g("com/google/android/apps/camera/imax/rendering/shaders/LineShader");
    }
    
    public eex() {
        this.c = null;
        final float[] d = new float[16];
        this.d = d;
        this.e = new float[16];
        this.a = new float[] { 1.0f, 1.0f, 1.0f, 1.0f };
        this.k = 1.0f;
        Matrix.setIdentityM(d, 0);
    }
    
    public final void a() {
        final muh f = this.f;
        if (f != null) {
            f.d();
            this.f = null;
        }
    }
    
    public final void b() {
        if (this.f == null) {
            final muh f = new muh("attribute vec2 vertexAttrib;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;uniform vec4 fillColor;void main() {  gl_FragColor = fillColor;}");
            this.f = f;
            this.g = f.b("vertexTransform");
            this.h = this.f.b("projectionMatrix");
            this.i = this.f.b("fillColor");
            this.j = this.f.a("vertexAttrib");
        }
        if (this.c == null) {
            return;
        }
        final muh f2 = this.f;
        f2.getClass();
        f2.c();
        this.j.b();
        this.j.c(this.c, 2);
        this.g.a(this.d);
        this.h.a(this.e);
        this.i.b(this.a);
        GLES20.glLineWidth(this.k);
        GLES20.glDrawArrays(1, 0, this.c.capacity() / 2);
        this.j.a();
        f2.e();
    }
    
    public final void c(final float[] array, final float k) {
        if (array != null && (array.length & 0x3) == 0x0) {
            this.k = k;
            this.c = mug.a(array);
            return;
        }
        eex.b.b().E(1173).p("Tried to draw a set of lines with %d floats", array.length);
        this.c = null;
    }
    
    public final void d(float n, final float n2) {
        n /= n2;
        Matrix.orthoM(this.e, 0, -n, n, -1.0f, 1.0f, -1.0f, 1.0f);
    }
}
