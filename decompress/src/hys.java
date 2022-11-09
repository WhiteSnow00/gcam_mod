import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hys
{
    public final cxl a;
    public final kkz b;
    public boolean c;
    private final hkd d;
    private final klv e;
    private final kjm f;
    private krc g;
    private final bqz h;
    
    public hys(final cxl a, final hkd d, final klv e, final hzf hzf, final hzg hzg, final bqz h, final kjm f) {
        this.b = new kkz(true);
        this.c = false;
        this.a = a;
        this.d = d;
        this.e = e;
        this.h = h;
        this.f = f;
        final kjk b = h.b;
        final hzi a2 = hzj.a();
        a2.a = "Swiss";
        a2.c(f);
        a2.f(hzf);
        a2.e(new hyr(this, 1));
        a2.d(new hyr(this));
        b.c(hzg.d(a2.a()));
    }
    
    public final klj a() {
        return klq.j(klq.b(this.b(), this.c()), fzt.j);
    }
    
    public final klj b() {
        return klq.j(klq.b(this.e, this.b), new hyq(this));
    }
    
    public final klv c() {
        final cxl a = this.a;
        final cxo a2 = cyj.a;
        a.e();
        return this.d.b(hjq.O);
    }
    
    public final void d() {
        synchronized (this) {
            if (this.b().aQ()) {
                this.e();
                return;
            }
            if (!this.c) {
                this.c = true;
                if (this.g == null) {
                    final krc a = this.b().a(new hyp(this), this.f);
                    this.g = a;
                    this.h.b.c(a);
                }
            }
        }
    }
    
    public final void e() {
        synchronized (this) {
            this.c().aR(hjf.a(1));
            this.c = false;
            final krc g = this.g;
            if (g != null) {
                g.close();
                this.g = null;
            }
        }
    }
}
