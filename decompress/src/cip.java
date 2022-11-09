import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cip implements krc
{
    public final kse a;
    public final pii b;
    public final niz c;
    public final ofa d;
    public final ScheduledExecutorService e;
    public final ckn f;
    public final pii g;
    public final chw h;
    public final eya i;
    public final cid j;
    public final cqz k;
    public final kny l;
    public final cqn m;
    public final cxl n;
    public final Object o;
    public niz p;
    public koh q;
    public boolean r;
    public cgr s;
    public final cem t;
    
    public cip(final pii b, final cem t, final niz c, final chw h, final ofa d, final ScheduledExecutorService e, final ckn f, final kse a, final pii g, final eya i, final cid j, final cqz k, final kny l, final cqn m, final cxl n) {
        this.o = new Object();
        this.p = nii.a;
        this.r = true;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.b = b;
        this.t = t;
        this.c = c;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final void close() {
        synchronized (this.o) {
            this.r = true;
            final koh q = this.q;
            if (q != null) {
                q.close();
                this.q = null;
            }
            if (this.p.g()) {
                ((kpz)this.p.c()).e();
                this.p = nii.a;
            }
        }
    }
}
