import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pge extends oxj
{
    static final oxj a;
    final Executor b;
    
    static {
        final oxj a2 = pib.a;
        final oyf g = pip.g;
        a = a2;
    }
    
    public pge(final Executor b) {
        this.b = b;
    }
    
    @Override
    public final oxi a() {
        return new pgd(this.b);
    }
    
    @Override
    public final oxp c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        pip.h(runnable);
        if (this.b instanceof ScheduledExecutorService) {
            try {
                final pgn pgn = new pgn(runnable);
                pgn.b(((ScheduledExecutorService)this.b).schedule((Callable<Object>)pgn, n, timeUnit));
                return pgn;
            }
            catch (final RejectedExecutionException ex) {
                pip.g(ex);
                return oyk.a;
            }
        }
        final pga pga = new pga(runnable);
        oyj.h(pga.a, pge.a.c(new pfz(this, pga), n, timeUnit));
        return pga;
    }
    
    @Override
    public final oxp d(final Runnable runnable) {
        pip.h(runnable);
        try {
            if (this.b instanceof ExecutorService) {
                final pgn pgn = new pgn(runnable);
                pgn.b(((ExecutorService)this.b).submit((Callable<Object>)pgn));
                return pgn;
            }
            final pgb pgb = new pgb(runnable);
            this.b.execute(pgb);
            return pgb;
        }
        catch (final RejectedExecutionException ex) {
            pip.g(ex);
            return oyk.a;
        }
    }
}
