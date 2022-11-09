import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

final class fny implements Runnable
{
    final /* synthetic */ ofn a;
    final /* synthetic */ fol b;
    
    public fny(final fol b, final ofn a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final esv r = this.b.r;
        if (r != null) {
            final int n = 0;
            r.m = false;
            final eta c = r.c;
            if (c != null) {
                for (int i = 0; i < c.g.size(); ++i) {
                    final ery j = c.g.get(i).i;
                    if (j != null) {
                        j.c();
                    }
                    final ery k = c.g.get(i).j;
                    if (k != null) {
                        k.c();
                    }
                }
                c.g.clear();
                c.f.b();
            }
            GLES20.glDeleteTextures(2, new int[] { r.p, r.o }, 0);
            final esy b = r.b;
            ery ery;
            if (b.d.size() > 0) {
                ery = b.d.get(0);
            }
            else {
                ery = null;
            }
            if (ery != null) {
                ery.c();
            }
            final esa h = r.H;
            if (h != null) {
                h.d();
            }
            final esa l = r.I;
            if (l != null) {
                l.d();
            }
            final ets m = r.i;
            if (m != null) {
                m.d();
            }
            final esb j2 = r.j;
            if (j2 != null) {
                j2.d();
            }
            final etq k2 = r.k;
            if (k2 != null) {
                k2.d();
            }
            final erx a = r.a;
            if (a != null) {
                ((esw)a).f.d();
            }
            final etc h2 = r.h;
            if (h2 != null) {
                for (int n2 = n; n2 < h2.a.size(); ++n2) {
                    if (h2.a.get(n2) != null) {
                        ((esc)h2.a.get(n2)).e();
                    }
                }
                final etq d = h2.d;
                if (d != null) {
                    d.d();
                }
            }
            final erw f = r.f;
            if (f != null) {
                f.e();
            }
            if (r.g != null) {
                r.f.e();
            }
            final ete d2 = r.d;
            final etr g = d2.g;
            if (g != null) {
                g.d();
            }
            final etq h3 = d2.h;
            if (h3 != null) {
                h3.d();
            }
            final esc e = d2.e;
            if (e != null) {
                e.e();
            }
            final esc f2 = d2.f;
            if (f2 != null) {
                f2.e();
            }
            r.b.b();
            this.b.r = null;
            this.a.o(null);
        }
    }
}
