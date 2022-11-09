import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

class pfu extends AtomicReference implements oxp
{
    protected static final FutureTask a;
    protected static final FutureTask b;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable c;
    protected Thread d;
    
    static {
        a = new FutureTask(oyw.b, null);
        b = new FutureTask(oyw.b, null);
    }
    
    public pfu(final Runnable c) {
        this.c = c;
    }
    
    public final void b(final Future future) {
        Future future2;
        do {
            future2 = this.get();
            if (future2 == pfu.a) {
                break;
            }
            if (future2 == pfu.b) {
                future.cancel(this.d != Thread.currentThread());
            }
        } while (!this.compareAndSet(future2, future));
    }
    
    @Override
    public final void bX() {
        final Future future = this.get();
        if (future != pfu.a) {
            final FutureTask b = pfu.b;
            if (future != b && this.compareAndSet((FutureTask)future, b) && future != null) {
                future.cancel(this.d != Thread.currentThread());
            }
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}
