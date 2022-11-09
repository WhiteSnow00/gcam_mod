// 
// Decompiled by Procyon v0.6.0
// 

final class per implements oxl
{
    final oxl a;
    final /* synthetic */ pes b;
    
    public per(final pes b, final oxl a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void bV(final oxp oxp) {
        this.a.bV(oxp);
    }
    
    @Override
    public final void d(final Object o) {
        try {
            this.b.b.a(o);
            this.a.d(o);
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.a.b(t);
        }
    }
}
