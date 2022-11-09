// 
// Decompiled by Procyon v0.6.0
// 

final class paf extends pha implements owy
{
    private static final long serialVersionUID = -3589550218733891694L;
    final oyc a;
    final Object b;
    pss c;
    boolean d;
    
    public paf(final psr psr, final Object b, final oyc a) {
        super(psr);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        super.a();
        this.c.a();
    }
    
    @Override
    public final void bY(final pss c) {
        if (phe.h(this.c, c)) {
            this.c = c;
            this.e.bY(this);
            c.cb(Long.MAX_VALUE);
        }
    }
    
    @Override
    public final void cc() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f(this.b);
    }
    
    @Override
    public final void cd(final Throwable t) {
        if (this.d) {
            pip.g(t);
            return;
        }
        this.d = true;
        this.e.cd(t);
    }
    
    @Override
    public final void ce(final Object o) {
        if (this.d) {
            return;
        }
        try {
            this.a.a(this.b, o);
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.c.a();
            this.cd(t);
        }
    }
}
