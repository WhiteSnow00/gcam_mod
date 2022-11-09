import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public class pgk extends oxi implements oxp
{
    public final ScheduledExecutorService b;
    public volatile boolean c;
    
    public pgk(final ThreadFactory threadFactory) {
        this.b = pgr.a(threadFactory);
    }
    
    @Override
    public final oxp b(final Runnable runnable) {
        return this.c(runnable, 0L, null);
    }
    
    @Override
    public final void bX() {
        if (!this.c) {
            this.c = true;
            this.b.shutdownNow();
        }
    }
    
    @Override
    public final oxp c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (this.c) {
            return oyk.a;
        }
        return this.f(runnable, n, timeUnit, null);
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    public final oxp e(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        pip.h(runnable);
        final pgn pgn = new pgn(runnable);
        Label_0035: {
            if (n > 0L) {
                break Label_0035;
            }
            try {
                Future<Object> future = this.b.submit((Callable<Object>)pgn);
                while (true) {
                    pgn.b(future);
                    return pgn;
                    future = this.b.schedule((Callable<Object>)pgn, n, timeUnit);
                    continue;
                }
            }
            catch (final RejectedExecutionException ex) {
                pip.g(ex);
                return oyk.a;
            }
        }
    }
    
    public final pgo f(final Runnable runnable, final long n, final TimeUnit timeUnit, final oyi oyi) {
        pip.h(runnable);
        final pgo pgo = new pgo(runnable, oyi);
        if (oyi != null && !oyi.b(pgo)) {
            return pgo;
        }
        while (true) {
            if (n <= 0L) {
                try {
                    Future<Object> future = this.b.submit((Callable<Object>)pgo);
                    while (true) {
                        pgo.b(future);
                        return pgo;
                        future = this.b.schedule((Callable<Object>)pgo, n, timeUnit);
                        continue;
                    }
                }
                catch (final RejectedExecutionException ex) {
                    if (oyi != null) {
                        oyi.e(pgo);
                    }
                    pip.g(ex);
                }
                return pgo;
            }
            continue;
        }
    }
}
