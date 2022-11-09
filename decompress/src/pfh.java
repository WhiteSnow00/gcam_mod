// 
// Decompiled by Procyon v0.6.0
// 

final class pfh implements oxl
{
    final /* synthetic */ pfi a;
    private final oxl b;
    
    public pfh(final pfi a, final oxl b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        try {
            this.b.d(this.a.b.a(t));
        }
        finally {
            final Throwable t2;
            psn.e(t2);
            this.b.b(new oxw(new Throwable[] { t, t2 }));
        }
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
