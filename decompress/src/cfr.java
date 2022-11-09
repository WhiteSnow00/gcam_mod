import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfr implements krc
{
    public final gkw a;
    public final kkz b;
    public final kkz c;
    public final Object d;
    public boolean e;
    private final klj f;
    private kjk g;
    private final liq h;
    
    public cfr(final klj f, final gkw a) {
        this.b = new kkz(0);
        this.c = new kkz(kra.a);
        this.d = new Object();
        this.e = false;
        this.h = new cfq(this);
        this.f = f;
        this.a = a;
    }
    
    public final Integer a(final kra kra) {
        final klj f = this.f;
        f.getClass();
        final csd csd = (csd)f.aQ();
        csd.a();
        return boa.a(csd.a.f(), kra.e, csd.b());
    }
    
    public final void b() {
        synchronized (this.d) {
            final kjk g = this.g;
            if (g == null || g.a()) {
                final kjk g2 = new kjk();
                this.b.aR(this.a(this.a.c()));
                this.c.aR(kra.b(this.a(this.a.c())));
                this.a.g(this.h);
                g2.c(this.f.a(new cfp(this), odx.a));
                this.g = g2;
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.d) {
            final kjk g = this.g;
            if (g != null && !g.a()) {
                this.a.h(this.h);
                g.close();
                this.g = null;
            }
        }
    }
}
