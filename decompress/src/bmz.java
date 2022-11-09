// 
// Decompiled by Procyon v0.6.0
// 

public final class bmz implements exh, exj, exl, exm, exe
{
    public final Object a;
    public kjk b;
    public kjk c;
    public kjk d;
    public btf e;
    public btf f;
    public btf g;
    public final bqz h;
    
    public bmz(final bqz h) {
        this.h = h;
        this.a = new Object();
        final kjk b = h.b();
        this.d = b;
        final kjk c = h.c(b);
        this.c = c;
        this.b = h.a(c);
        final kjk d = this.d;
        final btf g = new btf();
        d.c(g);
        this.g = g;
        final kjk c2 = this.c;
        final btf f = new btf();
        c2.c(f);
        this.f = f;
        final kjk b2 = this.b;
        final btf e = new btf();
        b2.c(e);
        this.e = e;
    }
    
    @Override
    public final void bh() {
        synchronized (this.a) {
            this.d.close();
        }
    }
    
    @Override
    public final void bi() {
        synchronized (this.a) {
            this.b.close();
        }
    }
    
    @Override
    public final void bj() {
        synchronized (this.a) {
            if (this.f()) {
                final kjk a = this.h.a(this.c);
                this.b = a;
                final btf e = new btf();
                a.c(e);
                this.e = e;
            }
        }
    }
    
    @Override
    public final void bk() {
        synchronized (this.a) {
            if (this.g()) {
                final kjk c = this.h.c(this.d);
                this.c = c;
                final btf f = new btf();
                c.c(f);
                this.f = f;
                final kjk a = this.h.a(this.c);
                this.b = a;
                final btf e = new btf();
                a.c(e);
                this.e = e;
            }
        }
    }
    
    @Override
    public final void e() {
        synchronized (this.a) {
            this.c.close();
        }
    }
    
    public final boolean f() {
        synchronized (this.a) {
            return this.e.a();
        }
    }
    
    public final boolean g() {
        synchronized (this.a) {
            return this.f.a();
        }
    }
    
    public final kjk h() {
        synchronized (this.a) {
            return this.b;
        }
    }
    
    public final kjk i() {
        synchronized (this.a) {
            return this.d;
        }
    }
}
