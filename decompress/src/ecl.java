import android.opengl.Matrix;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecl implements eca
{
    private final float[] a;
    private final float[] b;
    private eez c;
    private final ecb d;
    
    public ecl(final ecb d) {
        this.a = new float[16];
        this.b = new float[] { 1.0f, 1.0f, 1.0f, 1.0f };
        this.d = d;
        this.c = new eez();
    }
    
    @Override
    public final void a() {
        final eez c = this.c;
        if (c != null) {
            final muh f = c.f;
            if (f != null) {
                f.d();
                c.f = null;
            }
            this.c = null;
        }
    }
    
    @Override
    public final void b() {
        if (this.c != null && this.d.n) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            final float[] i = this.d.i;
            final float n = i[0];
            final float n2 = i[1];
            final float n3 = i[2];
            final float[] b = this.b;
            b[0] = n;
            b[1] = n2;
            b[2] = n3;
            Matrix.setIdentityM(this.a, 0);
            final float[] a = this.a;
            final ecb d = this.d;
            Matrix.translateM(a, 0, d.b, d.c, 0.0f);
            final float[] a2 = this.a;
            Matrix.multiplyMM(a2, 0, a2, 0, this.d.f, 0);
            final eez c = this.c;
            c.getClass();
            final ecb d2 = this.d;
            final float d3 = d2.d;
            final float n4 = -d3 / 2.0f;
            final float e = d2.e;
            final float n5 = e / 2.0f;
            final float n6 = d3 / 2.0f;
            final float n7 = -e / 2.0f;
            final float n8 = n4 + 0.01f;
            final float n9 = n5 - 0.01f;
            final float n10 = -0.01f + n6;
            final float n11 = 0.01f + n7;
            eez.a[0] = n4;
            eez.a[1] = n5;
            eez.a[2] = n4;
            eez.a[3] = n9;
            eez.a[4] = n6;
            eez.a[5] = n9;
            eez.a[6] = n4;
            eez.a[7] = n5;
            eez.a[8] = n6;
            eez.a[9] = n9;
            eez.a[10] = n6;
            eez.a[11] = n5;
            eez.a[12] = n4;
            eez.a[13] = n9;
            eez.a[14] = n4;
            eez.a[15] = n11;
            eez.a[16] = n8;
            eez.a[17] = n9;
            eez.a[18] = n8;
            eez.a[19] = n9;
            eez.a[20] = n4;
            eez.a[21] = n11;
            eez.a[22] = n8;
            eez.a[23] = n11;
            eez.a[24] = n10;
            eez.a[25] = n9;
            eez.a[26] = n10;
            eez.a[27] = n11;
            eez.a[28] = n6;
            eez.a[29] = n9;
            eez.a[30] = n6;
            eez.a[31] = n9;
            eez.a[32] = n10;
            eez.a[33] = n11;
            eez.a[34] = n6;
            eez.a[35] = n11;
            eez.a[36] = n4;
            eez.a[37] = n11;
            eez.a[38] = n4;
            eez.a[39] = n7;
            eez.a[40] = n6;
            eez.a[41] = n7;
            eez.a[42] = n4;
            eez.a[43] = n11;
            eez.a[44] = n6;
            eez.a[45] = n7;
            eez.a[46] = n6;
            eez.a[47] = n11;
            c.b = mug.a(eez.a);
            final eez c2 = this.c;
            c2.getClass();
            System.arraycopy(this.a, 0, c2.c, 0, 16);
            final eez c3 = this.c;
            c3.getClass();
            System.arraycopy(this.b, 0, c3.e, 0, 4);
            final eez c4 = this.c;
            c4.getClass();
            if (c4.f == null) {
                c4.f = new muh("attribute vec2 vertexAttrib;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;uniform vec4 fillColor;void main() {  gl_FragColor = fillColor;}");
                c4.g = c4.f.b("vertexTransform");
                c4.h = c4.f.b("projectionMatrix");
                c4.i = c4.f.b("fillColor");
                c4.j = c4.f.a("vertexAttrib");
            }
            final muh f = c4.f;
            f.getClass();
            f.c();
            c4.j.b();
            c4.j.c(c4.b, 2);
            c4.g.a(c4.c);
            c4.h.a(c4.d);
            c4.i.b(c4.e);
            GLES20.glDrawArrays(4, 0, c4.b.capacity() / 2);
            c4.j.a();
            f.e();
        }
    }
    
    @Override
    public final void c(final int n, final int n2) {
        final eez c = this.c;
        if (c != null) {
            final float n3 = n / (float)n2;
            Matrix.orthoM(c.d, 0, -n3, n3, -1.0f, 1.0f, -1.0f, 1.0f);
        }
    }
}
