// 
// Decompiled by Procyon v0.6.0
// 

public final class pog extends pqc
{
    public final pnd a;
    
    public pog(final pjq pjq, final pjl pjl) {
        pjq.getClass();
        super(pjq, pjl);
        this.a = plv.h();
    }
    
    @Override
    protected final void f(final Object o) {
        this.j(o);
    }
    
    @Override
    protected final void j(final Object o) {
        final pnd a = this.a;
        do {
            switch (a.a) {
                default: {
                    throw new IllegalStateException("Already resumed".toString());
                }
                case 1: {
                    ppr.a(pjv.b(this.e), plv.d(o, this.e));
                    return;
                }
                case 0: {
                    continue;
                }
            }
        } while (!this.a.c(0, 2));
    }
}
