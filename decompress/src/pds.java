// 
// Decompiled by Procyon v0.6.0
// 

final class pds implements oxg, oxp
{
    final oxg a;
    boolean b;
    oxp c;
    long d;
    
    public pds(final oxg a) {
        this.a = a;
        this.d = 1L;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b) {
            pip.g(t);
            return;
        }
        this.b = true;
        this.c.bX();
        this.a.b(t);
    }
    
    @Override
    public final void bU() {
        if (!this.b) {
            this.b = true;
            this.c.bX();
            this.a.bU();
        }
    }
    
    @Override
    public final void bV(final oxp c) {
        if (oyj.f(this.c, c)) {
            this.c = c;
            if (this.d == 0L) {
                this.b = true;
                c.bX();
                oyk.e(this.a);
                return;
            }
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
        if (!this.b) {
            final long d = this.d;
            final long d2 = -1L + d;
            this.d = d2;
            if (d > 0L) {
                this.a.e(o);
                if (d2 == 0L) {
                    this.bU();
                }
            }
        }
    }
}
