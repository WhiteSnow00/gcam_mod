import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdr implements ceg
{
    public final kwd a;
    public final cfg b;
    public final bky c;
    public ofn d;
    private final kkd e;
    private final cid f;
    private boolean g;
    
    public cdr(final cfm cfm, final gko gko, final cid f, final liy liy, final cxl cxl, final kwd a, final cfo cfo, final byte[] array) {
        this.e = new kkd(mcn.k("CdrStdFocus", 1), 8L, TimeUnit.SECONDS);
        final cfg a2 = cfm.a();
        this.b = a2;
        this.a = a;
        this.f = f;
        this.c = new bky(a2.r, gko, cfo.c.a, liy, cxl, null);
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        this.b();
        if (!this.g) {
            this.g = true;
            this.f.a(cic.e).c(this.b.a.a(new cdo(this), odx.a));
        }
        final kvq a = this.a.a();
        ((kxn)a).d = 1;
        a.b(this.c.b(bjz.a));
        this.a.j(a.a(), bmo.c());
        this.b.g.aR(false);
        this.c();
        return new cdq(this, bjz);
    }
    
    public final void b() {
        synchronized (this) {
            final ofn d = this.d;
            if (d != null) {
                d.cancel(false);
            }
            this.d = ofn.f();
            this.e.b();
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            try {
                this.e.execute(new cdp(this));
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
        catch (final RejectedExecutionException ex) {}
    }
    
    @Override
    public final void close() {
        this.b();
        this.f.b(cic.e);
        this.e.close();
    }
}
