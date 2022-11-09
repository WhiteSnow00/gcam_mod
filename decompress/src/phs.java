// 
// Decompiled by Procyon v0.6.0
// 

final class phs extends pgy
{
    private static final long serialVersionUID = -4896760517184205454L;
    final /* synthetic */ pht a;
    
    public phs(final pht a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        if (this.a.g) {
            return;
        }
        this.a.g = true;
        this.a.m();
        final pht a = this.a;
        if (!a.k && a.i.getAndIncrement() == 0) {
            this.a.b.bZ();
            this.a.f.lazySet(null);
        }
    }
    
    @Override
    public final Object bW() {
        return this.a.b.bW();
    }
    
    @Override
    public final void bZ() {
        this.a.b.bZ();
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            phn.b(this.a.j, n);
            this.a.n();
        }
    }
    
    @Override
    public final boolean i() {
        return this.a.b.i();
    }
    
    @Override
    public final int k() {
        this.a.k = true;
        return 2;
    }
}
