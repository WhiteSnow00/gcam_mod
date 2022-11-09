import android.opengl.Matrix;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etl implements etj
{
    private boolean a;
    private final ArrayList b;
    private final float[] c;
    
    public etl(final boolean a) {
        this.a = true;
        this.b = new ArrayList();
        final float[] c = new float[16];
        this.c = c;
        this.a = a;
        Matrix.setIdentityM(c, 0);
    }
    
    @Override
    public final void a(float n, final ete ete, final float[] array, int i, int n2) {
        final ArrayList b = this.b;
        b.clear();
        final boolean a = this.a;
        float n3 = 0.0f;
        float n4;
        if (!a) {
            n4 = 0.0f;
        }
        else {
            n4 = 1.0f;
        }
        if (!a) {
            n3 = 1.0f;
        }
        i = -2;
        n2 = 0;
        while (i <= 2) {
            if (i != 0) {
                final float[] array2 = new float[16];
                Matrix.setIdentityM(array2, 0);
                Matrix.rotateM(array2, 0, 20.0f * n * i, n3, n4, 0.0f);
                final int n5 = n2 + 1;
                b.add(n2, array2);
                n2 = n5;
            }
            ++i;
        }
        final float[] c = this.c;
        final ArrayList b2 = this.b;
        final etr g = ete.g;
        if (g != null) {
            if (ete.e != null) {
                g.c();
                ete.g.j(1.0f);
                i = 0;
                try {
                    while (i < b2.size()) {
                        final float[] array3 = b2.get(i);
                        final esc e = ete.e;
                        Matrix.multiplyMM(ete.k, 0, c, 0, array3, 0);
                        Matrix.multiplyMV(ete.j, 0, ete.k, 0, ete.i, 0);
                        ete.c(ete.j);
                        final float[] j = ete.j;
                        final float n6 = j[0];
                        final float m = ete.m;
                        final float n7 = j[1];
                        n = ete.n;
                        if (e != null) {
                            e.f(array, n6 * m + m, n7 * n + n, 0.4f);
                        }
                        ++i;
                    }
                }
                catch (final erz erz) {
                    erz.printStackTrace();
                }
            }
        }
    }
}
