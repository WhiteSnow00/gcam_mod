// 
// Decompiled by Procyon v0.6.0
// 

final class epu implements oen
{
    final /* synthetic */ eqa a;
    
    public epu(final eqa a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        a.m(eqa.b.b(), "Error capturing image", '\u054d', t);
        synchronized (this.a) {
            this.a.q.a(t);
        }
    }
    
    @Override
    public final void b(final Object o) {
        this.a.i.a();
        final eqa a = this.a;
        final epg r = a.r;
        ofi.w(ofi.r(new epe(r, a.h.c().a(), this.a.l.k()), r.d), new epf(r), mcn.n());
        this.a.u.a();
    }
}
