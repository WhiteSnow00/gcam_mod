import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

final class pgs extends oxi
{
    final ScheduledExecutorService a;
    final oxo b;
    volatile boolean c;
    
    public pgs(final ScheduledExecutorService a) {
        this.a = a;
        this.b = new oxo();
    }
    
    @Override
    public final void bX() {
        if (!this.c) {
            this.c = true;
            this.b.bX();
        }
    }
    
    @Override
    public final oxp c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (this.c) {
            return oyk.a;
        }
        pip.h(runnable);
        final pgo pgo = new pgo(runnable, this.b);
        this.b.b(pgo);
        Label_0060: {
            if (n > 0L) {
                break Label_0060;
            }
            try {
                Future<Object> future = this.a.submit((Callable<Object>)pgo);
                while (true) {
                    pgo.b(future);
                    return pgo;
                    future = this.a.schedule((Callable<Object>)pgo, n, timeUnit);
                    continue;
                }
            }
            catch (final RejectedExecutionException ex) {
                this.bX();
                pip.g(ex);
                return oyk.a;
            }
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}
