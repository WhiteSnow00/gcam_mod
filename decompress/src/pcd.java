// 
// Decompiled by Procyon v0.6.0
// 

final class pcd implements oxa, oxp
{
    final oxa a;
    final pce b;
    oxp c;
    
    public pcd(final oxa a, final pce b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Object o) {
        if (this.c == oyj.a) {
            return;
        }
        this.c = oyj.a;
        this.a.a(o);
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.c != oyj.a) {
            oxw oxw = null;
            try {
                this.b.b.a(t);
            }
            finally {
                final Throwable t2;
                psn.e(t2);
                oxw = new oxw(new Throwable[] { t, t2 });
            }
            this.c = oyj.a;
            this.a.b(oxw);
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void bV(final oxp c) {
        if (oyj.f(this.c, c)) {
            this.c = c;
            this.a.bV(this);
        }
    }
    
    @Override
    public final void bX() {
        this.c.bX();
        this.c = oyj.a;
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e() {
        if (this.c == oyj.a) {
            return;
        }
        this.c = oyj.a;
        this.a.e();
    }
}
