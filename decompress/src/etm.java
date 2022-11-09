import android.graphics.PointF;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etm implements etj
{
    private static final float[] a;
    private static final float[] b;
    private final ArrayList c;
    
    static {
        a = new float[] { -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f };
        b = new float[] { -0.5f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f };
    }
    
    public etm() {
        this.c = new ArrayList();
    }
    
    @Override
    public final void a(final float n, final ete ete, final float[] array, int i, int n2) {
        final float n3 = i / 2.0f;
        final float n4 = n2 / 2.0f;
        final float n5 = Math.min(n3, n4) * 0.95f;
        this.c.clear();
        float n6 = 1.3333334f;
        float n7;
        if (i > n2) {
            n7 = 1.0f;
        }
        else {
            n7 = 1.3333334f;
        }
        if (i <= n2) {
            n6 = 1.0f;
        }
        n2 = 0;
        for (i = 0; i < 9; ++i) {
            this.c.add(new PointF(etm.a[i] * n * n5 * n6 + n3, etm.b[i] * n * n5 * n7 + n4));
        }
        final ArrayList c = this.c;
        final etr g = ete.g;
        if (g != null) {
            if (ete.e != null) {
                g.c();
                ete.g.j(1.0f);
                i = n2;
                try {
                    while (i < c.size()) {
                        final PointF pointF = c.get(i);
                        final esc e = ete.e;
                        if (e != null) {
                            e.f(array, pointF.x, pointF.y, 0.4f);
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
