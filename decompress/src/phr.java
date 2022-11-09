// 
// Decompiled by Procyon v0.6.0
// 

public final class phr extends phq
{
    final phq b;
    boolean c;
    phf d;
    volatile boolean e;
    
    public phr(final phq b) {
        this.b = b;
    }
    
    @Override
    public final void bY(final pss pss) {
        final boolean e = this.e;
        final int n = 1;
        int n2 = 1;
        Label_0097: {
            if (!e) {
                synchronized (this) {
                    if (!this.e) {
                        if (this.c) {
                            phf d;
                            if ((d = this.d) == null) {
                                d = new phf();
                                this.d = d;
                            }
                            d.a(phl.b(pss));
                            return;
                        }
                        this.c = true;
                        n2 = 0;
                    }
                    break Label_0097;
                }
            }
            n2 = n;
        }
        if (n2 != 0) {
            pss.a();
            return;
        }
        this.b.bY(pss);
        this.m();
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
            this.e = true;
            if (this.c) {
                phf d;
                if ((d = this.d) == null) {
                    d = new phf();
                    this.d = d;
                }
                d.a(phl.a);
                return;
            }
            this.c = true;
            monitorexit(this);
            this.b.cc();
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
                this.e = true;
                if (this.c) {
                    phf d;
                    if ((d = this.d) == null) {
                        d = new phf();
                        this.d = d;
                    }
                    d.b(phl.a(t));
                    return;
                }
                this.c = true;
                b = false;
            }
            monitorexit(this);
            if (b) {
                pip.g(t);
                return;
            }
            this.b.cd(t);
        }
    }
    
    @Override
    public final void ce(final Object o) {
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
                final phl a = phl.a;
                d.a(o);
                return;
            }
            this.c = true;
            monitorexit(this);
            this.b.ce(o);
            this.m();
        }
    }
    
    @Override
    protected final void k(final psr psr) {
        this.b.j(psr);
    }
    
    final void m() {
        while (true) {
            monitorenter(this);
            try {
                final phf d = this.d;
                if (d == null) {
                    this.c = false;
                    monitorexit(this);
                    return;
                }
                this.d = null;
                monitorexit(this);
                d.c(this.b);
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
}
