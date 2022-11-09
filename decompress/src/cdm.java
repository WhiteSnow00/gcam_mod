import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdm implements ceg
{
    public final kwd a;
    public final cfg b;
    public final bky c;
    public final blc d;
    public final fvt e;
    public final niz f;
    public final Runnable g;
    public ofn h;
    public final Object i;
    private final kkd j;
    
    public cdm(final cfm cfm, final gko gko, final blc d, final fvt e, final liy liy, final cxl cxl, final niz f, final kwd a, final cfo cfo, final byte[] array) {
        this.j = new kkd(mcn.k("CdrSCFocus", 1), 2L, TimeUnit.SECONDS);
        this.g = new cdk(this);
        this.i = new Object();
        final cfg a2 = cfm.a();
        this.b = a2;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = new bky(a2.r, gko, cfo.c.a, liy, cxl, null);
    }
    
    private final void b() {
        try {
            this.j.execute(new cdk(this, 1));
        }
        catch (final RejectedExecutionException ex) {}
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        this.j.b();
        synchronized (this.i) {
            final ofn h = this.h;
            if (h != null) {
                h.cancel(true);
            }
            this.d.c(this.g);
            final kvq a = this.a.a();
            ((kxn)a).d = 1;
            ((kxn)a).h = this.c.b(bjz.a);
            ((kxn)a).i = this.c.b(bjz.a);
            this.a.j(a.a(), bmo.c());
            this.b.g.aR(false);
            final ofn f = ofn.f();
            this.h = f;
            this.b();
            return new cdl(this, f, bjz);
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.i) {
            this.j.close();
        }
    }
}
