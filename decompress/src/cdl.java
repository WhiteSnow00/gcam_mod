// 
// Decompiled by Procyon v0.6.0
// 

final class cdl implements bkx
{
    final /* synthetic */ ofn a;
    final /* synthetic */ bjz b;
    final /* synthetic */ cdm c;
    
    public cdl(final cdm c, final ofn a, final bjz b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final oey a() {
        return ofi.n(new kkz(this.b.a));
    }
    
    @Override
    public final oey b() {
        return ofi.n(bmo.d());
    }
    
    @Override
    public final oey c() {
        return this.a;
    }
    
    @Override
    public final void d() {
        final cdm c = this.c;
        c.b.d.aR(true);
        c.a.i(bmo.a());
    }
    
    @Override
    public final void e() {
        final cdm c = this.c;
        c.d.c(c.g);
        c.e.a();
        if (c.f.g()) {
            ((gsa)c.f.c()).a();
        }
        c.a.k(true, true, false);
        final kwd a = c.a;
        final kvq a2 = a.a();
        a2.b(c.c.a());
        a.l(a2.a());
        c.b.g.aR(true);
    }
}
