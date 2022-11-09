// 
// Decompiled by Procyon v0.6.0
// 

final class ozz implements owu, oxp
{
    final owu a;
    oxp b;
    final /* synthetic */ paa c;
    
    public ozz(final paa c, final owu a) {
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b == oyj.a) {
            pip.g(t);
            return;
        }
        oxw oxw = null;
        try {
            this.c.b.a(t);
        }
        finally {
            final Throwable t2;
            psn.e(t2);
            oxw = new oxw(new Throwable[] { t, t2 });
        }
        this.a.b(oxw);
    }
    
    @Override
    public final void bV(final oxp b) {
        if (oyj.f(this.b, b)) {
            this.b = b;
            this.a.bV(this);
        }
    }
    
    @Override
    public final void bX() {
        this.b.bX();
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e() {
        if (this.b == oyj.a) {
            return;
        }
        try {
            this.c.c.a();
            this.a.e();
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.a.b(t);
        }
    }
}
