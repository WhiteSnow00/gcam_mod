// 
// Decompiled by Procyon v0.6.0
// 

final class pah implements owy, oxp
{
    final oxl a;
    final oyc b;
    final Object c;
    pss d;
    boolean e;
    
    public pah(final oxl a, final Object c, final oyc b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void bX() {
        this.d.a();
        this.d = phe.a;
    }
    
    @Override
    public final void bY(final pss d) {
        if (phe.h(this.d, d)) {
            this.d = d;
            this.a.bV(this);
            d.cb(Long.MAX_VALUE);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void cc() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d = phe.a;
        this.a.d(this.c);
    }
    
    @Override
    public final void cd(final Throwable t) {
        if (this.e) {
            pip.g(t);
            return;
        }
        this.e = true;
        this.d = phe.a;
        this.a.b(t);
    }
    
    @Override
    public final void ce(final Object o) {
        if (this.e) {
            return;
        }
        try {
            this.b.a(this.c, o);
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.d.a();
            this.cd(t);
        }
    }
}
