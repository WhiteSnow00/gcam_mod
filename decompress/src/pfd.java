// 
// Decompiled by Procyon v0.6.0
// 

final class pfd implements oxl
{
    final oxl a;
    final oyf b;
    
    public pfd(final oxl a, final oyf b) {
        this.a = a;
        this.b = b;
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
    public final void d(Object a) {
        try {
            a = this.b.a(a);
            phn.g(a, "The mapper function returned a null value.");
            this.a.d(a);
        }
        finally {
            final Throwable t;
            psn.e(t);
            this.b(t);
        }
    }
}
