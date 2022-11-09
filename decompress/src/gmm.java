import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class gmm implements bjj
{
    public final kwd a;
    public final bky b;
    public final kkd c;
    public final fvt d;
    public final klv e;
    public final grh f;
    public final kkz g;
    public ofn h;
    private final kjk i;
    private final klj j;
    private final int k;
    private volatile boolean l;
    
    public gmm(final kwd a, final bky b, final kjk i, final kkd c, final fvt d, final dgm dgm, final grh f, final kkz g, final int k, final klv j) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.c = c;
        this.d = d;
        this.e = dgm.a;
        this.f = f;
        this.g = g;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        kjm.a();
        this.c.b();
        this.f.f();
        final boolean l = this.l;
        int n = 1;
        if (!l) {
            this.l = true;
            this.i.c(this.e.a(new gmj(this), odx.a));
        }
        final kvq a = this.a.a();
        final int h = ((gzq)this.g.d).h;
        if (h == 0) {
            n = h;
        }
        final kxn kxn = (kxn)a;
        kxn.d = n;
        kxn.h = this.b.b(bjz.a);
        kxn.i = this.b.b(bjz.a);
        this.a.j(a.a(), bmo.c());
        this.b();
        final ofn f = ofn.f();
        this.h = f;
        return new gml(this, f, bjz);
    }
    
    public final void b() {
        final hjg hjg = (hjg)this.j.aQ();
        long n = this.k;
        if (!hjg.equals(hjg.d)) {
            n += hjg.g;
        }
        try {
            this.c.a(new gmk(this), n, TimeUnit.SECONDS);
        }
        catch (final RejectedExecutionException ex) {}
    }
}
