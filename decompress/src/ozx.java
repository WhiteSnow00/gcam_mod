import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class ozx extends AtomicInteger implements owu
{
    private static final long serialVersionUID = -8360547806504310570L;
    final owu a;
    final AtomicBoolean b;
    final oxo c;
    
    public ozx(final owu a, final AtomicBoolean b, final oxo c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.lazySet(3);
    }
    
    @Override
    public final void b(final Throwable t) {
        this.c.bX();
        if (this.b.compareAndSet(false, true)) {
            this.a.b(t);
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void bV(final oxp oxp) {
        this.c.b(oxp);
    }
    
    @Override
    public final void e() {
        if (this.decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
            this.a.e();
        }
    }
}
