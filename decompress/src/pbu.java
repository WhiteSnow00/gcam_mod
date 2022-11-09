import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pbu extends owx
{
    final oxj b;
    final long c;
    final TimeUnit d;
    
    public pbu(final long c, final TimeUnit d, final oxj b) {
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public final void k(final psr psr) {
        final pbt pbt = new pbt(psr);
        psr.bY(pbt);
        oyj.j(pbt, this.b.c(pbt, this.c, this.d));
    }
}
