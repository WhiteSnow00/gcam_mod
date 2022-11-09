// 
// Decompiled by Procyon v0.6.0
// 

final class pdn implements oxg, oxp
{
    final oxg a;
    long b;
    oxp c;
    
    public pdn(final oxg a) {
        this.a = a;
        this.b = 1L;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void bU() {
        this.a.bU();
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
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final Object o) {
        final long b = this.b;
        if (b != 0L) {
            this.b = b - 1L;
            return;
        }
        this.a.e(o);
    }
}
