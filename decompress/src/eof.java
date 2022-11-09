// 
// Decompiled by Procyon v0.6.0
// 

final class eof extends ivr
{
    final /* synthetic */ duq a;
    final /* synthetic */ fmm b;
    final /* synthetic */ fbb c;
    final /* synthetic */ fah d;
    final /* synthetic */ cxl e;
    final /* synthetic */ ezv f;
    final /* synthetic */ eok g;
    final /* synthetic */ gzc h;
    
    public eof(final eok g, final duq a, final fmm b, final fbb c, final fah d, final cxl e, final gzc h, final ezv f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.h = h;
        this.f = f;
    }
    
    @Override
    public final void onShutterButtonClick() {
        final flv t = this.g.T;
        if (t == null) {
            return;
        }
        if ((boolean)((kkz)t.h().g).d && this.a.n()) {
            if (this.a.o()) {
                this.b.b();
                this.c.b();
                this.d.c();
                return;
            }
            this.b.b();
            this.c.a();
            this.d.c();
            if (this.e.k(cxs.A)) {
                this.h.e();
            }
        }
        else {
            this.f.d();
            eok.H(this.g);
            this.g.N.f();
            final eok g = this.g;
            if (g.p.c()) {
                g.u();
                return;
            }
            final int g2 = ((hjg)g.q.aQ()).g;
            if (g2 > 0) {
                g.D(g2);
                return;
            }
            g.F();
        }
    }
    
    @Override
    public final void onShutterTouchStart() {
        this.g.N.e();
    }
}
