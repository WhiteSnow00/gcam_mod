import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbq implements krc
{
    public final ckn a;
    public final cid b;
    public final cey c;
    public final cxl d;
    public final cqn e;
    public cfo f;
    public final Object g;
    public final cbn h;
    
    public cbq(final ckn a, final cid b, final cey c, final cxl d, final cbn h, final cqn e) {
        this.g = new Object();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = e;
    }
    
    public static boolean c(final Intent intent) {
        return intent != null && (intent.hasExtra("android.intent.extra.videoQuality") && intent.getIntExtra("android.intent.extra.videoQuality", 0) == 0);
    }
    
    public final nns a(final cfa cfa, final kmt kmt, final kmv kmv, final clp clp) {
        final nnn nnn = new nnn();
        if (kmt.f()) {
            return nnn.f();
        }
        if (clp.equals(clp.e)) {
            nnn.g(kmt.c);
            return nnn.f();
        }
        if (kmt.e()) {
            nnn.g(kmt.f);
            final cxl d = this.d;
            final cxo a = cwv.a;
            d.d();
            return nnn.f();
        }
        if (this.d.j(cxr.K) && cfa.a(kmt.a, kmv) && (!kmv.e() || (this.d.k(cwv.D) && this.d.k(cwv.E)))) {
            nnn.g(kmt.a);
        }
        nnn.g(kmt.c);
        if (this.d.j(cxr.aA) && cfa.a(kmt.d, kmv) && (!kmv.e() || this.d.k(cwv.D))) {
            nnn.g(kmt.d);
        }
        final cxl d2 = this.d;
        final cxo a2 = cwv.a;
        d2.d();
        return nnn.f();
    }
    
    public final nns b(final kmt kmt, final kmv kmv, final lfu lfu, final clp clp) {
        final nnn nnn = new nnn();
        if (!kmt.f() && (!lfu.equals(lfu.a) || this.d.k(cxr.S)) && !clp.equals(clp.e) && (!clp.equals(clp.c) || this.d.k(cwv.D))) {
            nnn.g(kmv.h);
            nnn.g(kmv.i);
            return nnn.f();
        }
        nnn.g(kmv);
        return nnn.f();
    }
    
    @Override
    public final void close() {
        synchronized (this.g) {
            this.f = null;
        }
    }
}
