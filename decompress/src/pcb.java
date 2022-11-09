// 
// Decompiled by Procyon v0.6.0
// 

final class pcb implements oxa, oxp
{
    final oxa a;
    final oyf b;
    oxp c;
    
    public pcb(final oxa a, final oyf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(Object a) {
        try {
            a = this.b.a(a);
            this.a.a(a);
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.a.b(t);
        }
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
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
        final oxp c = this.c;
        this.c = oyj.a;
        c.bX();
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e() {
        this.a.e();
    }
}
