import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class pgg extends oxi
{
    final AtomicBoolean a;
    private final oxo b;
    private final pgf c;
    private final pgh d;
    
    public pgg(final pgf c) {
        this.a = new AtomicBoolean();
        this.c = c;
        this.b = new oxo();
        pgh c2 = null;
        Label_0101: {
            if (!c.c.b) {
                while (!c.b.isEmpty()) {
                    final pgh pgh = c.b.poll();
                    if (pgh != null) {
                        c2 = pgh;
                        break Label_0101;
                    }
                }
                final pgh pgh2 = new pgh(c.d);
                c.c.b(pgh2);
                c2 = pgh2;
            }
            else {
                c2 = pgi.c;
            }
        }
        this.d = c2;
    }
    
    @Override
    public final void bX() {
        if (this.a.compareAndSet(false, true)) {
            this.b.bX();
            final pgf c = this.c;
            final pgh d = this.d;
            d.a = System.nanoTime() + c.a;
            c.b.offer(d);
        }
    }
    
    @Override
    public final oxp c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (this.b.b) {
            return oyk.a;
        }
        return this.d.f(runnable, n, timeUnit, this.b);
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}
