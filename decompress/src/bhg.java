// 
// Decompiled by Procyon v0.6.0
// 

public final class bhg implements bhl, bhj
{
    public volatile bhj a;
    public volatile bhj b;
    private final Object c;
    private final bhl d;
    private bhk e;
    private bhk f;
    
    public bhg(final Object c, final bhl d) {
        this.e = bhk.c;
        this.f = bhk.c;
        this.c = c;
        this.d = d;
    }
    
    private final boolean o(final bhj bhj) {
        final boolean equals = bhj.equals(this.a);
        boolean b = false;
        if (!equals) {
            if (this.e != bhk.e) {
                return b;
            }
            if (!bhj.equals(this.b)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    @Override
    public final bhl a() {
        synchronized (this.c) {
            final bhl d = this.d;
            bhl a;
            if (d != null) {
                a = d.a();
            }
            else {
                a = this;
            }
            return a;
        }
    }
    
    @Override
    public final void b() {
        synchronized (this.c) {
            if (this.e != bhk.a) {
                this.e = bhk.a;
                this.a.b();
            }
        }
    }
    
    @Override
    public final void c() {
        synchronized (this.c) {
            this.e = bhk.c;
            this.a.c();
            if (this.f != bhk.c) {
                this.f = bhk.c;
                this.b.c();
            }
        }
    }
    
    @Override
    public final void d(final bhj bhj) {
        synchronized (this.c) {
            if (!bhj.equals(this.b)) {
                this.e = bhk.e;
                if (this.f != bhk.a) {
                    this.f = bhk.a;
                    this.b.b();
                }
                return;
            }
            this.f = bhk.e;
            final bhl d = this.d;
            if (d != null) {
                d.d(this);
            }
        }
    }
    
    @Override
    public final void e(final bhj bhj) {
        synchronized (this.c) {
            if (bhj.equals(this.a)) {
                this.e = bhk.d;
            }
            else if (bhj.equals(this.b)) {
                this.f = bhk.d;
            }
            final bhl d = this.d;
            if (d != null) {
                d.e(this);
            }
        }
    }
    
    @Override
    public final void f() {
        synchronized (this.c) {
            if (this.e == bhk.a) {
                this.e = bhk.b;
                this.a.f();
            }
            if (this.f == bhk.a) {
                this.f = bhk.b;
                this.b.f();
            }
        }
    }
    
    @Override
    public final boolean g(final bhj bhj) {
        synchronized (this.c) {
            final bhl d = this.d;
            boolean b = false;
            if ((d == null || d.g(this)) && this.o(bhj)) {
                b = true;
            }
            return b;
        }
    }
    
    @Override
    public final boolean h(final bhj bhj) {
        synchronized (this.c) {
            final bhl d = this.d;
            boolean b = false;
            if ((d == null || d.h(this)) && this.o(bhj)) {
                b = true;
            }
            return b;
        }
    }
    
    @Override
    public final boolean i(final bhj bhj) {
        synchronized (this.c) {
            final bhl d = this.d;
            boolean b = false;
            if ((d == null || d.i(this)) && this.o(bhj)) {
                b = true;
            }
            return b;
        }
    }
    
    @Override
    public final boolean j() {
        synchronized (this.c) {
            final boolean j = this.a.j();
            boolean b = true;
            if (!j) {
                b = (this.b.j() && b);
            }
            return b;
        }
    }
    
    @Override
    public final boolean k() {
        synchronized (this.c) {
            final bhk e = this.e;
            final bhk c = bhk.c;
            boolean b = false;
            if (e == c) {
                b = b;
                if (this.f == bhk.c) {
                    b = true;
                }
            }
            return b;
        }
    }
    
    @Override
    public final boolean l() {
        synchronized (this.c) {
            final bhk e = this.e;
            final bhk d = bhk.d;
            boolean b = true;
            if (e != d) {
                b = (this.f == bhk.d && b);
            }
            return b;
        }
    }
    
    @Override
    public final boolean m(final bhj bhj) {
        if (bhj instanceof bhg) {
            final bhg bhg = (bhg)bhj;
            if (this.a.m(bhg.a) && this.b.m(bhg.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean n() {
        synchronized (this.c) {
            final bhk e = this.e;
            final bhk a = bhk.a;
            boolean b = true;
            if (e != a) {
                b = (this.f == bhk.a && b);
            }
            return b;
        }
    }
}
