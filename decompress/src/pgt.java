import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgt extends oxj
{
    static final pgm a;
    static final ScheduledExecutorService b;
    final AtomicReference c;
    
    static {
        (b = Executors.newScheduledThreadPool(0)).shutdown();
        a = new pgm("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5))), true);
    }
    
    public pgt() {
        final pgm a = pgt.a;
        (this.c = new AtomicReference()).lazySet(pgr.a(a));
    }
    
    @Override
    public final oxi a() {
        return new pgs(this.c.get());
    }
    
    @Override
    public final oxp c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        pip.h(runnable);
        final pgn pgn = new pgn(runnable);
        Label_0041: {
            if (n > 0L) {
                break Label_0041;
            }
            try {
                Future<Object> future = this.c.get().submit((Callable<Object>)pgn);
                while (true) {
                    pgn.b(future);
                    return pgn;
                    future = this.c.get().schedule((Callable<Object>)pgn, n, timeUnit);
                    continue;
                }
            }
            catch (final RejectedExecutionException ex) {
                pip.g(ex);
                return oyk.a;
            }
        }
    }
}
