// 
// Decompiled by Procyon v0.6.0
// 

public final class pih implements owy, pss
{
    final psr a;
    pss b;
    boolean c;
    phf d;
    volatile boolean e;
    
    public pih(final psr a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.b.a();
    }
    
    @Override
    public final void bY(final pss b) {
        if (phe.h(this.b, b)) {
            this.b = b;
            this.a.bY(this);
        }
    }
    
    @Override
    public final void cb(final long n) {
        this.b.cb(n);
    }
    
    @Override
    public final void cc() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                phf d;
                if ((d = this.d) == null) {
                    d = new phf();
                    this.d = d;
                }
                d.a(phl.a);
                return;
            }
            this.e = true;
            this.c = true;
            monitorexit(this);
            this.a.cc();
        }
    }
    
    @Override
    public final void cd(final Throwable t) {
        if (this.e) {
            pip.g(t);
            return;
        }
        synchronized (this) {
            final boolean e = this.e;
            boolean b = true;
            if (!e) {
                if (this.c) {
                    this.e = true;
                    phf d;
                    if ((d = this.d) == null) {
                        d = new phf();
                        this.d = d;
                    }
                    d.b(phl.a(t));
                    return;
                }
                this.e = true;
                this.c = true;
                b = false;
            }
            monitorexit(this);
            if (b) {
                pip.g(t);
                return;
            }
            this.a.cd(t);
        }
    }
    
    @Override
    public final void ce(final Object o) {
        if (this.e) {
            return;
        }
        if (o == null) {
            this.b.a();
            this.cd(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        monitorenter(this);
        try {
            if (this.e) {
                monitorexit(this);
                return;
            }
            if (this.c) {
                phf d;
                if ((d = this.d) == null) {
                    d = new phf();
                    this.d = d;
                }
                final phl a = phl.a;
                d.a(o);
                monitorexit(this);
                return;
            }
            this.c = true;
            monitorexit(this);
            this.a.ce(o);
            while (true) {
                synchronized (this) {
                    final phf d2 = this.d;
                    if (d2 == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                    monitorexit(this);
                    if (d2.c(this.a)) {
                        return;
                    }
                    continue;
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
