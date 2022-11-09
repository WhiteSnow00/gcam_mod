import java.util.concurrent.Executor;
import com.google.android.apps.camera.evcomp.EvCompView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izt implements jap, exn, exj
{
    public final fvt a;
    public final dgn b;
    public final cxl c;
    public final iru d;
    private final fwd e;
    private final dgm f;
    private final kjm g;
    private final klj h;
    private final niz i;
    private final klv j;
    private final klv k;
    private final klv l;
    private final pii m;
    private final efm n;
    private final klv o;
    private final bmz p;
    private final ewy q;
    
    public izt(final dgn b, final pii m, final fvt a, final fwd e, final dgm f, final bmz p18, final kjm g, final cxl c, final klv j, final klv o, final klv k, final klv l, final gha gha, final niz i, final efm n, final iru d, final klj klj, final ewy q) {
        this.b = b;
        this.m = m;
        this.a = a;
        this.e = e;
        this.f = f;
        this.p = p18;
        this.g = g;
        this.c = c;
        this.j = j;
        this.i = i;
        this.n = n;
        this.d = d;
        this.k = k;
        this.l = l;
        this.o = o;
        this.q = q;
        this.h = klq.j(klq.b(gha, o, klj), new izs(c));
    }
    
    @Override
    public final void a() {
        final EvCompView evCompView = (EvCompView)((ixw)this.m.get()).c.c(2131427586);
        final dgn b = this.b;
        final klv j = this.j;
        final fvt a = this.a;
        b.q(evCompView, j, a.b, a.c, a.d, this.e.a, this.k, this.l, this.f, this.i, this.n, this.d);
        this.p.i().c(this.f.a.a(new izr(this, 2), odx.a));
        this.p.i().c(this.a.e.a(new izr(this), this.g));
        this.p.i().c(this.f.c.a(new izr(this, 3), odx.a));
        this.p.i().c(this.h.a(new izr(this, 1), this.g));
        this.q.c(this);
    }
    
    @Override
    public final void bj() {
        ((grn)((njd)this.i).a).k(this.p, this.o, this.h);
    }
}
