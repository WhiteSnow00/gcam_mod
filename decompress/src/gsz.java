import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsz implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    private final pii i;
    private final pii j;
    private final pii k;
    private final pii l;
    private final pii m;
    private final pii n;
    private final pii o;
    private final pii p;
    private final pii q;
    private final pii r;
    
    public gsz(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i, final pii j, final pii k, final pii l, final pii m, final pii n, final pii o, final pii p18, final pii q, final pii r) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p18;
        this.q = q;
        this.r = r;
    }
    
    public static gsz b(final pii pii, final pii pii2, final pii pii3, final pii pii4, final pii pii5, final pii pii6, final pii pii7, final pii pii8, final pii pii9, final pii pii10, final pii pii11, final pii pii12, final pii pii13, final pii pii14, final pii pii15, final pii pii16, final pii pii17, final pii pii18) {
        return new gsz(pii, pii2, pii3, pii4, pii5, pii6, pii7, pii8, pii9, pii10, pii11, pii12, pii13, pii14, pii15, pii16, pii17, pii18);
    }
    
    public final gsr a() {
        final kjk kjk = (kjk)this.a.get();
        final kwd kwd = (kwd)this.b.get();
        final krr a = ((krp)this.c).a();
        final gep gep = (gep)this.d.get();
        final kjm kjm = (kjm)this.e.get();
        final klj klj = (klj)this.f.get();
        return new gsr(kjk, kwd, a, gep, kjm, (fwk)this.g.get(), (klj)this.h.get(), (klj)this.i.get(), (klj)this.j.get(), (klj)this.k.get(), (oey)this.l.get(), (Executor)this.m.get(), ((gdk)this.n).b(), (kkp)this.o.get(), (bjj)this.p.get(), (ggu)this.q.get(), (del)this.r.get());
    }
}
