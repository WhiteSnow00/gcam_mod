// 
// Decompiled by Procyon v0.6.0
// 

final class ibe implements kob
{
    final /* synthetic */ ibf a;
    
    public ibe(final ibf a) {
        this.a = a;
    }
    
    @Override
    public final void aU(final kov kov) {
        a.k(ibf.a.b(), "onEncoderError(): %s", kov, '\u0a47');
        this.a.aa.a();
    }
    
    @Override
    public final void d() {
        this.a.aa.a();
    }
    
    @Override
    public final void e() {
        final cgr b = this.a.z.b(llk.e);
        final kmq ab = this.a.ab;
        ab.getClass();
        ab.a.m(b.f());
        final ibf a = this.a;
        final idd a2 = ide.a();
        a2.b = b;
        a2.a = nii.a;
        a2.f(this.a.B);
        a2.l();
        a.T = a2;
    }
    
    @Override
    public final void f() {
        this.a.aa.a();
    }
    
    @Override
    public final void g() {
        synchronized (this.a.o) {
            final ibf a = this.a;
            a.C.add(a.T);
            if (this.a.d.k(cyl.d)) {
                final ibf a2 = this.a;
                final ias v = a2.v;
                final idd v2 = (idd)nov.d(a2.C);
                synchronized (v.s) {
                    final idd v3 = v.v;
                    v3.getClass();
                    v3.i(v.d());
                    v.v.j(v.c());
                    v.v.d(v.a());
                    v.v.e(v.b());
                    v.f.set(0L);
                    v.g.set(0L);
                    v.e.set(0L);
                    v.v = v2;
                    return;
                }
            }
            final ibf a3 = this.a;
            final iaa l = a3.l;
            final idd h = (idd)nov.d(a3.C);
            synchronized (l.x) {
                final idd h2 = l.H;
                h2.getClass();
                h2.i(l.d());
                l.H.j(l.c());
                l.H.d(l.a());
                l.H.e(l.b());
                l.i.set(0L);
                l.j.set(0L);
                l.k.set(0L);
                l.H = h;
            }
        }
    }
    
    @Override
    public final void h(final long n, final long n2) {
    }
}
