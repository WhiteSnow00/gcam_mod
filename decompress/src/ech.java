import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ech implements eca
{
    private final float[] a;
    private eex b;
    private final float[] c;
    private int d;
    private float[] e;
    private final eba f;
    private final ecb g;
    private final hkc h;
    private inp i;
    
    public ech(final ecb g, final eba f, final hkc h) {
        final float[] array;
        final float[] a = array = new float[4];
        array[1] = (array[0] = 1.0f);
        array[3] = (array[2] = 1.0f);
        this.a = a;
        this.c = new float[3];
        this.i = inp.a;
        this.f = f;
        this.g = g;
        this.h = h;
        final eex b = new eex();
        this.b = b;
        System.arraycopy(a, 0, b.a, 0, 4);
    }
    
    @Override
    public final void a() {
        final eex b = this.b;
        if (b != null) {
            b.a();
            this.b = null;
        }
    }
    
    @Override
    public final void b() {
        final inp a = inp.a((int)this.h.c(hjq.c));
        final inp i = this.i;
        int j = 0;
        final int n = 0;
        Label_0178: {
            if (i != a) {
                this.i = a;
                switch (a.ordinal()) {
                    case 3: {
                        this.d = 2;
                        final float[] c = this.c;
                        c[0] = 0.38196602f;
                        c[1] = 0.618034f;
                        break;
                    }
                    case 2: {
                        this.d = 3;
                        final float[] c2 = this.c;
                        c2[0] = 0.25f;
                        c2[1] = 0.5f;
                        c2[2] = 0.75f;
                        break;
                    }
                    case 1: {
                        this.d = 2;
                        final float[] c3 = this.c;
                        c3[0] = 0.33333334f;
                        c3[1] = 0.6666667f;
                        break;
                    }
                    case 0: {
                        this.d = 0;
                        break Label_0178;
                    }
                }
                this.e = new float[this.d * 8];
            }
        }
        if (this.b != null && this.d != 0 && this.f.b()) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            final ecb g = this.g;
            if (g.h) {
                int n2 = 0;
                for (int k = n; k < this.d; ++k) {
                    final float d = this.g.d;
                    final float n3 = d / 2.0f;
                    final float[] c4 = this.c;
                    final float n4 = n3 - c4[k] * d;
                    final float[] e = this.e;
                    final int n5 = n2 + 1;
                    e[n2] = n4;
                    final int n6 = n5 + 1;
                    e[n5] = 1.0f;
                    final int n7 = n6 + 1;
                    e[n6] = n4;
                    final int n8 = n7 + 1;
                    e[n7] = -1.0f;
                    final float n9 = c4[k];
                    final float n10 = n9 + n9 - 1.0f;
                    final int n11 = n8 + 1;
                    e[n8] = -d / 2.0f;
                    final int n12 = n11 + 1;
                    e[n11] = n10;
                    final int n13 = n12 + 1;
                    e[n12] = n3;
                    n2 = n13 + 1;
                    e[n13] = n10;
                }
            }
            else {
                final float a2 = g.a;
                final float n14 = -a2;
                int n15 = 0;
                while (j < this.d) {
                    final float[] c5 = this.c;
                    final float n16 = c5[j] * (a2 - n14) + n14;
                    final float[] e2 = this.e;
                    final int n17 = n15 + 1;
                    e2[n15] = n16;
                    final int n18 = n17 + 1;
                    final float e3 = this.g.e;
                    final float n19 = e3 / 2.0f;
                    e2[n17] = n19;
                    final int n20 = n18 + 1;
                    e2[n18] = n16;
                    final int n21 = n20 + 1;
                    e2[n20] = -e3 / 2.0f;
                    final float n22 = n19 - e3 * c5[j];
                    final int n23 = n21 + 1;
                    e2[n21] = n14;
                    final int n24 = n23 + 1;
                    e2[n23] = n22;
                    final int n25 = n24 + 1;
                    e2[n24] = a2;
                    n15 = n25 + 1;
                    e2[n25] = n22;
                    ++j;
                }
            }
            final eex b = this.b;
            b.getClass();
            b.c(this.e, 1.0f);
            final eex b2 = this.b;
            b2.getClass();
            b2.b();
        }
    }
    
    @Override
    public final void c(final int n, final int n2) {
        final eex b = this.b;
        if (b != null) {
            b.d((float)n, (float)n2);
        }
    }
}
