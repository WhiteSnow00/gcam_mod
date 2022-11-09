import android.opengl.GLES20;
import com.google.android.libraries.vision.opengl.Texture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edd implements eca
{
    public final efa a;
    private final ecb b;
    private final eey c;
    private final eex d;
    private final float[] e;
    private final float[] f;
    
    public edd(final Texture b, final ecb b2) {
        this.e = new float[] { 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f };
        this.f = new float[8];
        this.b = b2;
        final efa a = new efa();
        this.a = a;
        a.b = b;
        a.c = 33069;
        this.c = new eey();
        this.d = new eex();
    }
    
    @Override
    public final void a() {
        this.a.a();
        this.c.a();
        this.d.a();
    }
    
    @Override
    public final void b() {
        final ecb b = this.b;
        GLES20.glViewport(0, 0, b.j, b.k);
        GLES20.glClear(16384);
        this.a.b();
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        this.c.e(this.e);
        final eey c = this.c;
        final float a = this.b.a;
        c.d(-a, 1.0f, a, -1.0f);
        this.c.b();
        GLES20.glDisable(3042);
        final ecb b2 = this.b;
        if (!b2.n) {
            final int j = b2.j;
            final int k = b2.k;
            GLES20.glViewport(j / 4, k / 4, j / 2, k / 2);
            final ecb b3 = this.b;
            if (b3.h) {
                final int i = b3.j;
                b3.getClass();
                final int l = b3.k;
                b3.getClass();
                GLES20.glScissor((int)(i / 4 * 1.1f), l / 4, (int)(i / 2 * 0.9f), l / 2);
            }
            else {
                final int m = b3.j;
                final int k2 = b3.k;
                b3.getClass();
                b3.getClass();
                GLES20.glScissor(m / 4, (int)(k2 / 4 * 1.1f), m / 2, (int)(k2 / 2 * 0.9f));
            }
            GLES20.glEnable(3089);
            this.a.b();
            GLES20.glDisable(3089);
        }
        final ecb b4 = this.b;
        GLES20.glViewport(0, 0, b4.j, b4.k);
        final ecb b5 = this.b;
        if (b5.h) {
            final float n = b5.d / 2.0f;
            final float[] f = this.f;
            final float n2 = -n;
            f[0] = n2;
            f[1] = 1.0f;
            f[2] = n2;
            f[3] = -1.0f;
            f[4] = n;
            f[5] = 1.0f;
            f[6] = n;
            f[7] = -1.0f;
        }
        else {
            final float n3 = b5.e / 2.0f;
            final float[] f2 = this.f;
            final float a2 = b5.a;
            final float n4 = -a2;
            f2[0] = n4;
            f2[1] = n3;
            f2[2] = a2;
            f2[3] = n3;
            f2[4] = n4;
            final float n5 = -n3;
            f2[5] = n5;
            f2[6] = a2;
            f2[7] = n5;
        }
        this.d.c(this.f, 2.0f);
        this.d.b();
    }
    
    @Override
    public final void c(final int n, final int n2) {
        final float n3 = (float)n;
        final float n4 = (float)n2;
        this.c.c(n3, n4);
        this.d.d(n3, n4);
    }
}
