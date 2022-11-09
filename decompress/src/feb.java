// 
// Decompiled by Procyon v0.6.0
// 

public final class feb implements exj, exh, exn
{
    public final fda a;
    public volatile int b;
    private final klv c;
    private final cxl d;
    
    public feb(final fda a, final klv c, final cxl d) {
        this.a = a;
        this.b = 1;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a() {
        final jbm jbm = (jbm)this.c.aQ();
        final int b = this.b;
        boolean b2 = false;
        if (b == 3 || b == 2) {
            if (jbm != jbm.b) {
                final cxl d = this.d;
                final cxo a = cxr.a;
                d.c();
                this.d.c();
                return false;
            }
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public final void bi() {
        this.a.g(false);
        this.a.k(this);
    }
    
    @Override
    public final void bj() {
        this.a.j(this);
        this.a.g(this.a());
    }
}
