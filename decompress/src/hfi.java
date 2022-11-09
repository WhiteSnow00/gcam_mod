import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class hfi implements lki
{
    final /* synthetic */ hfl a;
    
    public hfi(final hfl a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        final hfl a = this.a;
        final String value = String.valueOf(a.r);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 33);
        sb.append("Mediagroup.Listener#onAbandoned: ");
        sb.append(value);
        a.E(sb.toString());
        final hfl a2 = this.a;
        a2.b.d(a2.g.b, "onAbandoned");
        this.a.t.cancel(true);
    }
    
    @Override
    public final void b(final Throwable t) {
        final hfl a = this.a;
        final String value = String.valueOf(a.r);
        final String value2 = String.valueOf(t);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30 + String.valueOf(value2).length());
        sb.append("Mediagroup.Listener#nError: ");
        sb.append(value);
        sb.append(": ");
        sb.append(value2);
        a.E(sb.toString());
        final hfl a2 = this.a;
        a2.b.d(a2.g.b, "onError");
        this.a.t.a(t);
        final hfl a3 = this.a;
        a3.h.g(a3.v, a3.w, t);
        this.a.J(iwx.a);
    }
    
    @Override
    public final void c() {
        final hfl a = this.a;
        a.b.d(a.g.b, "onPublished");
        this.a.l.t(SystemClock.elapsedRealtime());
        this.a.a.f(3, 4);
        this.a.N(krd.a, true);
        final hfl a2 = this.a;
        a2.h.h(a2.v, a2.w);
        this.a.I();
        final hfl a3 = this.a;
        a3.b.g(a3.g.b);
        final hfl a4 = this.a;
        a4.t.o(a4.g.a);
    }
    
    @Override
    public final void d() {
        final cxo a = cxr.a;
    }
}
