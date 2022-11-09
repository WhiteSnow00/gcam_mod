// 
// Decompiled by Procyon v0.6.0
// 

final class pcp implements oxg, oxp
{
    final oxg a;
    final oye b;
    final oye c;
    oxp d;
    boolean e;
    
    public pcp(final oxg a, final oye b, final oye c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.e) {
            pip.g(t);
            return;
        }
        this.e = true;
        oxw oxw = null;
        try {
            this.c.a(t);
        }
        finally {
            final Throwable t2;
            psn.e(t2);
            oxw = new oxw(new Throwable[] { t, t2 });
        }
        this.a.b(oxw);
    }
    
    @Override
    public final void bU() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.bU();
    }
    
    @Override
    public final void bV(final oxp d) {
        if (oyj.f(this.d, d)) {
            this.d = d;
            this.a.bV(this);
        }
    }
    
    @Override
    public final void bX() {
        this.d.bX();
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final Object o) {
        if (this.e) {
            return;
        }
        try {
            this.b.a(o);
            this.a.e(o);
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.d.bX();
            this.b(t);
        }
    }
}
