import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pfo extends AtomicReference implements oxl
{
    private static final long serialVersionUID = 3323743579927613702L;
    final pfn a;
    final int b;
    
    public pfo(final pfn a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t, this.b);
    }
    
    @Override
    public final void bV(final oxp oxp) {
        oyj.e(this, oxp);
    }
    
    @Override
    public final void d(Object a) {
        final pfn a2 = this.a;
        a2.d[this.b] = a;
        if (a2.decrementAndGet() == 0) {
            try {
                a = a2.b.a(a2.d);
                phn.g(a, "The zipper returned a null value");
                a2.a.d(a);
            }
            finally {
                final Throwable t;
                psn.e(t);
                a2.a.b(t);
            }
        }
    }
}
