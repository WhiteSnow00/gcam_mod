import java.util.concurrent.RejectedExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmh implements bjj
{
    public final fvt a;
    public final blc b;
    public final kwd c;
    public final bky d;
    public final grh e;
    public final kkz f;
    public final niz g;
    public ofn h;
    public final Runnable i;
    private final kkd j;
    
    public gmh(final kwd c, final kkd j, final blc b, final fvt a, final bky d, final grh e, final kkz f, final niz g) {
        this.i = new gmg(this, 1);
        this.j = j;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private final void b() {
        try {
            this.j.execute(new gmg(this));
        }
        catch (final RejectedExecutionException ex) {}
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        this.j.b();
        final ofn h = this.h;
        int n = 1;
        if (h != null) {
            h.cancel(true);
        }
        this.b.c(this.i);
        this.e.f();
        final kvq a = this.c.a();
        final int h2 = ((gzq)this.f.d).h;
        if (h2 == 0) {
            n = h2;
        }
        final kxn kxn = (kxn)a;
        kxn.d = n;
        kxn.h = this.d.b(bjz.a);
        kxn.i = this.d.b(bjz.a);
        this.c.j(a.a(), bmo.c());
        final ofn f = ofn.f();
        this.h = f;
        this.b();
        return new gmf(this, f, bjz);
    }
}
