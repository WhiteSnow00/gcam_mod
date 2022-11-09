// 
// Decompiled by Procyon v0.6.0
// 

final class pep implements oxl
{
    final /* synthetic */ peq a;
    private final oxl b;
    
    public pep(final peq a, final oxl b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        oxw oxw = null;
        try {
            this.a.b.a(t);
        }
        finally {
            final Throwable t2;
            psn.e(t2);
            oxw = new oxw(new Throwable[] { t, t2 });
        }
        this.b.b(oxw);
    }
    
    @Override
    public final void bV(final oxp oxp) {
        this.b.bV(oxp);
    }
    
    @Override
    public final void d(final Object o) {
        this.b.d(o);
    }
}
