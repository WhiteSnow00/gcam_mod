import android.opengl.Matrix;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecj implements eca
{
    public efa a;
    public final ecb b;
    private final float[] c;
    
    public ecj(final ecb b) {
        this.c = new float[16];
        this.b = b;
    }
    
    @Override
    public final void a() {
        final efa a = this.a;
        if (a != null) {
            a.a();
            this.a = null;
        }
    }
    
    @Override
    public final void b() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        if (this.b.n) {
            Matrix.setIdentityM(this.c, 0);
            final ecb b = this.b;
            b.getClass();
            final boolean h = b.h;
            float n = 0.9f;
            float n2;
            if (h) {
                Matrix.rotateM(this.c, 0, 90.0f, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(this.c, 0, 0.05f, 0.0f, 0.0f);
                final ecb b2 = this.b;
                if (!b2.m) {
                    Matrix.translateM(this.c, 0, 0.0f, b2.g, 0.0f);
                }
                final ecb b3 = this.b;
                final float g = b3.g;
                final float q = b3.q;
                n2 = g + q * Math.max(1.0f, 2.0f - g / q);
            }
            else {
                Matrix.translateM(this.c, 0, 0.0f, 0.05f, 0.0f);
                final ecb b4 = this.b;
                if (!b4.m) {
                    Matrix.translateM(this.c, 0, -b4.g, 0.0f, 0.0f);
                }
                final ecb b5 = this.b;
                final float g2 = b5.g;
                final float p = b5.p;
                n = g2 + p * Math.max(1.0f, 2.0f - g2 / p);
                n2 = 0.9f;
            }
            Matrix.scaleM(this.c, 0, n, n2, 1.0f);
            final ecb b6 = this.b;
            if (b6.h) {
                Matrix.translateM(this.c, 0, 0.0f, -0.75f - Math.min(1.0f, b6.g / b6.q) * 0.25f, 0.0f);
            }
            else {
                Matrix.translateM(this.c, 0, Math.min(1.0f, b6.g / b6.p) * 0.25f - 0.25f, 0.0f, 0.0f);
            }
            final efa a = this.a;
            a.getClass();
            a.e(this.c);
            final ecb b7 = this.b;
            if (b7.h) {
                final efa a2 = this.a;
                a2.getClass();
                a2.d(b7.d, 2.0f);
            }
            else {
                final efa a3 = this.a;
                a3.getClass();
                final float a4 = b7.a;
                a3.d(a4 + a4, b7.e);
            }
            final efa a5 = this.a;
            nov.z(a5);
            a5.b();
            this.b.o.unbind();
        }
    }
    
    @Override
    public final void c(final int n, final int n2) {
    }
}
