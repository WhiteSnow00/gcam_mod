// 
// Decompiled by Procyon v0.6.0
// 

public final class pgw implements owy, oza, oyx
{
    protected final psr a;
    protected pss b;
    protected oza c;
    protected boolean d;
    final oyg e;
    
    public pgw(final psr a, final oyg e) {
        this.a = a;
        this.e = e;
    }
    
    @Override
    public final void a() {
        this.b.a();
    }
    
    @Override
    public final Object bW() {
        final oza c = this.c;
        Object bw;
        do {
            bw = c.bW();
            if (bw == null) {
                return null;
            }
        } while (!this.e.a(bw));
        return bw;
    }
    
    @Override
    public final void bY(final pss b) {
        if (phe.h(this.b, b)) {
            this.b = b;
            if (b instanceof oza) {
                this.c = (oza)b;
            }
            this.a.bY(this);
        }
    }
    
    @Override
    public final void bZ() {
        this.c.bZ();
    }
    
    @Override
    public final void cb(final long n) {
        this.b.cb(n);
    }
    
    @Override
    public final void cc() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.cc();
    }
    
    @Override
    public final void cd(final Throwable t) {
        if (this.d) {
            pip.g(t);
            return;
        }
        this.d = true;
        this.a.cd(t);
    }
    
    @Override
    public final void ce(final Object o) {
        if (!this.d(o)) {
            this.b.cb(1L);
        }
    }
    
    @Override
    public final boolean d(final Object o) {
        if (!this.d) {
            try {
                final boolean a = this.e.a(o);
                if (a) {
                    this.a.ce(o);
                }
                return a;
            }
            finally {
                final Throwable t;
                psn.e(t);
                this.b.a();
                this.cd(t);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean i() {
        return this.c.i();
    }
    
    @Override
    public final boolean j(final Object o) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    @Override
    public final int k() {
        return 0;
    }
}
