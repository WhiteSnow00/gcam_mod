// 
// Decompiled by Procyon v0.6.0
// 

final class cdq implements bkx
{
    final /* synthetic */ bjz a;
    final /* synthetic */ cdr b;
    
    public cdq(final cdr b, final bjz a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final oey a() {
        return ofi.n(new kkz(this.a.a));
    }
    
    @Override
    public final oey b() {
        return ofi.n(bmo.d());
    }
    
    @Override
    public final oey c() {
        synchronized (this.b) {
            final ofn d = this.b.d;
            d.getClass();
            return d;
        }
    }
    
    @Override
    public final void d() {
        this.b.b();
        final cdr b = this.b;
        b.b.d.aR(true);
        b.a.i(bmo.a());
    }
    
    @Override
    public final void e() {
        final cdr b = this.b;
        b.b.d.aR(false);
        b.b.a.aR(0);
        b.a.k(true, true, false);
        final kwd a = b.a;
        final kvq a2 = a.a();
        a2.b(b.c.a());
        a.l(a2.a());
        b.b.g.aR(true);
    }
}
