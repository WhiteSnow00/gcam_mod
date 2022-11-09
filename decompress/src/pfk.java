import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pfk extends oxk
{
    final oxm a;
    final oxj b;
    
    public pfk(final oxm a, final oxj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final void n(final oxl oxl) {
        final pfj pfj = new pfj(oxl, this.a);
        oxl.bV(pfj);
        oyj.h(pfj.b, this.b.d(pfj));
    }
}
