// 
// Decompiled by Procyon v0.6.0
// 

final class pcf implements oxa, oxp
{
    final oxl a;
    final Object b;
    oxp c;
    
    public pcf(final oxl a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Object o) {
        this.c = oyj.a;
        this.a.d(o);
    }
    
    @Override
    public final void b(final Throwable t) {
        this.c = oyj.a;
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
        this.c.bX();
        this.c = oyj.a;
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e() {
        this.c = oyj.a;
        this.a.d(this.b);
    }
}
