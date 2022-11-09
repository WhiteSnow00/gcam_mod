import android.graphics.PointF;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eti implements etj
{
    final ArrayList a;
    final float[] b;
    final float[] c;
    final float[] d;
    
    public eti() {
        this.a = new ArrayList();
        this.b = new float[] { -0.893333f, -0.86f, -0.86f, -0.726667f, -0.706667f, -0.706667f, -0.66f, -0.66f, -0.403333f, -0.396667f, -0.396667f, -0.383333f, -0.383333f, -0.37f, -0.37f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.37f, 0.37f, 0.383333f, 0.383333f, 0.396667f, 0.396667f, 0.403333f, 0.66f, 0.66f, 0.706667f, 0.706667f, 0.726667f, 0.86f, 0.86f, 0.893333f, -0.893333f };
        this.c = new float[] { 0.0f, -0.366667f, 0.366667f, 0.0f, -0.38f, 0.38f, -0.663333f, 0.663333f, 0.0f, -0.393333f, 0.393333f, -0.71f, 0.71f, -0.863333f, 0.863333f, -0.943333f, -0.726667f, -0.403333f, 0.0f, 0.403333f, 0.726667f, 0.943333f, -0.863333f, 0.863333f, -0.71f, 0.71f, -0.393333f, 0.393333f, 0.0f, -0.663333f, 0.663333f, -0.38f, 0.38f, 0.0f, -0.366667f, 0.366667f, 0.0f, 0.0f };
        this.d = new float[] { 0.5f, 0.5f, 0.5f, 0.7f, 0.7f, 0.7f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f, 0.7f, 0.7f, 0.5f, 0.5f, 0.5f, 0.7f, 1.0f, 1.0f, 1.0f, 0.7f, 0.5f, 0.5f, 0.5f, 0.7f, 0.7f, 1.0f, 1.0f, 1.0f, 0.5f, 0.5f, 0.7f, 0.7f, 0.7f, 0.5f, 0.5f, 0.5f, 0.5f };
    }
    
    @Override
    public final void a(final float n, final ete ete, final float[] array, int i, final int n2) {
        final float n3 = i / 2.0f;
        final float n4 = n2 / 2.0f;
        final float n5 = Math.min(n3, n4) * 0.95f;
        this.a.clear();
        final PointF pointF = new PointF();
        final etq h = ete.h;
        i = 0;
        if (h != null) {
            h.c();
            ete.h.j(1.0f);
        }
        while (i < 38) {
            pointF.x = this.b[i] * n * n5 + n3;
            pointF.y = this.c[i] * n * n5 + n4;
            final float n6 = this.d[i];
            final esc e = ete.e;
            if (e != null && ete.h != null) {
                try {
                    e.f(array, pointF.x, pointF.y, n6 * 0.4f);
                }
                catch (final erz erz) {
                    erz.printStackTrace();
                }
            }
            ++i;
        }
    }
}
