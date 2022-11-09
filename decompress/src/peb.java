import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class peb extends AtomicReference implements owy
{
    private static final long serialVersionUID = 8410034718427740355L;
    final ped a;
    final int b;
    final int c;
    long d;
    volatile ozc e;
    
    public peb(final ped a, final int b) {
        this.a = a;
        this.b = b;
        this.c = b - (b >> 2);
    }
    
    @Override
    public final void bY(final pss pss) {
        final long n = this.b;
        if (phe.f(this, pss)) {
            pss.cb(n);
        }
    }
    
    @Override
    public final void cc() {
        this.a.e();
    }
    
    @Override
    public final void cd(final Throwable t) {
        this.a.f(t);
    }
    
    @Override
    public final void ce(final Object o) {
        this.a.g(this, o);
    }
    
    final ozc d() {
        ozc e;
        if ((e = this.e) == null) {
            e = new pfs(this.b);
            this.e = e;
        }
        return e;
    }
}
