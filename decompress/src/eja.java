import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eja implements gfg
{
    public final kkz a;
    private final gfg b;
    private final klj c;
    private final eji d;
    
    public eja(final gue gue, final klj klj, final kjk kjk, final niz niz, final eiv eiv, final klj klj2, final gfg b) {
        njo.d(niz.g());
        this.b = b;
        this.d = (eji)niz.c();
        final kvw f = gue.f();
        final kkz a = new kkz(0);
        this.a = a;
        f.k(new eiy(this, f));
        kjk.c(klj.a(new eix(this), odx.a));
        this.c = klq.d(b.a(), new eiz(a), klj2);
        f.k(eiv);
        kjk.c(new eiw(f, eiv));
    }
    
    @Override
    public final klj a() {
        return this.c;
    }
    
    @Override
    public final klj b() {
        return this.b.b();
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        final nsx a = ntf.a;
        gen.c.b().c(2);
        this.d.a();
        this.b.c(gqe.b, gen);
        gff.close();
    }
}
