import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gof implements kvw
{
    public final List a;
    public final int b;
    public final kvw c;
    public final Executor d;
    public kvw e;
    public boolean f;
    public final kvv g;
    public final kzl h;
    private final kwd i;
    
    public gof(final kwd i, final kjk kjk, final Executor d, final kzl h, final klj klj) {
        this.a = new ArrayList();
        final goe goe = new goe(this);
        this.c = goe;
        this.g = new goc(this);
        this.i = i;
        this.d = d;
        this.h = h;
        this.b = 3;
        if (klj.aQ()) {
            this.e = this.r();
        }
        else {
            this.e = goe;
        }
        kjk.c(klj.a(new gob(this, i), odx.a));
    }
    
    @Override
    public final int a() {
        synchronized (this) {
            return this.e.a();
        }
    }
    
    @Override
    public final int b() {
        synchronized (this) {
            return this.e.b();
        }
    }
    
    @Override
    public final kvs c() {
        synchronized (this) {
            return this.e.c();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.f = true;
            this.a.clear();
            this.e.l(this.g);
            grd.e(this.i, this.e);
            this.e.close();
            this.e = this.c;
        }
    }
    
    @Override
    public final kvs d(final njc njc) {
        synchronized (this) {
            return this.e.d(njc);
        }
    }
    
    @Override
    public final kvs e() {
        synchronized (this) {
            return this.e.e();
        }
    }
    
    @Override
    public final kvs f(final njc njc) {
        synchronized (this) {
            return this.e.f(njc);
        }
    }
    
    @Override
    public final kvs g() {
        synchronized (this) {
            return this.e.g();
        }
    }
    
    @Override
    public final kvs h() {
        synchronized (this) {
            return this.e.h();
        }
    }
    
    @Override
    public final List i() {
        synchronized (this) {
            return this.e.i();
        }
    }
    
    @Override
    public final List j() {
        synchronized (this) {
            return this.e.j();
        }
    }
    
    @Override
    public final void k(final kvv kvv) {
        synchronized (this) {
            this.a.add(kvv);
        }
    }
    
    @Override
    public final void l(final kvv kvv) {
        synchronized (this) {
            this.a.remove(kvv);
        }
    }
    
    @Override
    public final void m(final int n) {
        synchronized (this) {
            this.e.m(n);
        }
    }
    
    @Override
    public final void n(final kvu kvu) {
        synchronized (this) {
            this.e.n(kvu);
        }
    }
    
    @Override
    public final boolean o(final kvx kvx) {
        synchronized (this) {
            return this.e.o(kvx);
        }
    }
    
    @Override
    public final boolean p() {
        synchronized (this) {
            return this.e.p();
        }
    }
    
    @Override
    public final kzl q() {
        synchronized (this) {
            return this.h;
        }
    }
    
    public final kvw r() {
        final kwd i = this.i;
        i.getClass();
        final kzl h = this.h;
        h.getClass();
        final kvw r = i.r(h, this.b);
        r.k(this.g);
        return r;
    }
}
