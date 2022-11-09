import java.util.concurrent.Executor;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayr implements axy, bja
{
    final ayq a;
    public final bjd b;
    public awc c;
    public boolean d;
    public boolean e;
    public aza f;
    public boolean g;
    ayv h;
    public boolean i;
    ayt j;
    public volatile boolean k;
    int l;
    public final ayn m;
    public final ayn n;
    private final hp o;
    private final bar p;
    private final bar q;
    private final bar r;
    private final AtomicInteger s;
    private boolean t;
    private ayb u;
    
    public ayr(final bar p6, final bar q, final bar r, final ayn n, final ayn m, final hp o) {
        this.a = new ayq(new ArrayList(2));
        this.b = bjd.a();
        this.s = new AtomicInteger();
        this.p = p6;
        this.q = q;
        this.r = r;
        this.n = n;
        this.m = m;
        this.o = o;
    }
    
    private final bar i() {
        bar bar;
        if (this.t) {
            bar = this.r;
        }
        else {
            bar = this.q;
        }
        return bar;
    }
    
    private final boolean j() {
        return this.i || this.g || this.k;
    }
    
    @Override
    public final void aJ(final ayb ayb) {
        this.i().execute(ayb);
    }
    
    @Override
    public final bjd aK() {
        return this.b;
    }
    
    public final void b(final bhp bhp, final Executor executor) {
        synchronized (this) {
            this.b.b();
            this.a.a.add(new ayp(bhp, executor));
            if (this.g) {
                this.d(1);
                executor.execute(new ayo(this, bhp));
                return;
            }
            if (this.i) {
                this.d(1);
                executor.execute(new ayo(this, bhp, 1));
                return;
            }
            bit.b(this.k ^ true, "Cannot add callbacks to a cancelled EngineJob");
        }
    }
    
    final void c() {
        synchronized (this) {
            this.b.b();
            bit.b(this.j(), "Not yet complete!");
            final int decrementAndGet = this.s.decrementAndGet();
            bit.b(decrementAndGet >= 0, "Can't decrement below 0");
            ayt j;
            if (decrementAndGet == 0) {
                j = this.j;
                this.e();
            }
            else {
                j = null;
            }
            monitorexit(this);
            if (j != null) {
                j.f();
            }
        }
    }
    
    final void d(final int n) {
        synchronized (this) {
            bit.b(this.j(), "Not yet complete!");
            if (this.s.getAndAdd(n) == 0) {
                final ayt j = this.j;
                if (j != null) {
                    j.d();
                }
            }
        }
    }
    
    public final void e() {
        synchronized (this) {
            if (this.c != null) {
                this.a.a.clear();
                this.c = null;
                this.j = null;
                this.f = null;
                this.i = false;
                this.k = false;
                this.g = false;
                final ayb u = this.u;
                if (u.c.d()) {
                    u.c();
                }
                this.u = null;
                this.h = null;
                this.l = 0;
                this.o.b(this);
                return;
            }
            throw new IllegalArgumentException();
        }
    }
    
    public final void f(final bhp bhp) {
        synchronized (this) {
            this.b.b();
            this.a.a.remove(ayq.b(bhp));
            if (this.a.e()) {
                if (!this.j()) {
                    this.k = true;
                    final ayb u = this.u;
                    u.p = true;
                    final axw o = u.o;
                    if (o != null) {
                        o.a();
                    }
                    this.n.a(this, this.c);
                }
                if ((this.g || this.i) && this.s.get() == 0) {
                    this.e();
                }
            }
        }
    }
    
    public final void g(final ayb u) {
        synchronized (this) {
            this.u = u;
            final int f = u.f(1);
            bar bar;
            if (f != 2 && f != 3) {
                bar = this.i();
            }
            else {
                bar = this.p;
            }
            bar.execute(u);
        }
    }
    
    public final void h(final awc c, final boolean d, final boolean t, final boolean e) {
        synchronized (this) {
            this.c = c;
            this.d = d;
            this.t = t;
            this.e = e;
        }
    }
}
