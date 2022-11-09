import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgd extends oxi implements Runnable
{
    final Executor a;
    final pfr b;
    volatile boolean c;
    final AtomicInteger d;
    final oxo e;
    
    public pgd(final Executor a) {
        this.d = new AtomicInteger();
        this.e = new oxo();
        this.a = a;
        this.b = new pfr();
    }
    
    @Override
    public final oxp b(final Runnable runnable) {
        if (this.c) {
            return oyk.a;
        }
        pip.h(runnable);
        final pgb pgb = new pgb(runnable);
        this.b.j(pgb);
        if (this.d.getAndIncrement() == 0) {
            try {
                this.a.execute(this);
            }
            catch (final RejectedExecutionException ex) {
                this.c = true;
                this.b.bZ();
                pip.g(ex);
                return oyk.a;
            }
        }
        return pgb;
    }
    
    @Override
    public final void bX() {
        if (!this.c) {
            this.c = true;
            this.e.bX();
            if (this.d.getAndIncrement() == 0) {
                this.b.bZ();
            }
        }
    }
    
    @Override
    public final oxp c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (n <= 0L) {
            return this.b(runnable);
        }
        if (this.c) {
            return oyk.a;
        }
        final oym oym = new oym();
        final oym oym2 = new oym(oym);
        pip.h(runnable);
        final pgo pgo = new pgo(new pgc(this, oym2, runnable), this.e);
        this.e.b(pgo);
        final Executor a = this.a;
        Label_0152: {
            if (a instanceof ScheduledExecutorService) {
                try {
                    pgo.b(((ScheduledExecutorService)a).schedule((Callable<Object>)pgo, n, timeUnit));
                    break Label_0152;
                }
                catch (final RejectedExecutionException ex) {
                    this.c = true;
                    pip.g(ex);
                    return oyk.a;
                }
            }
            pgo.b(new pfy(pge.a.c(pgo, n, timeUnit)));
        }
        oyj.h(oym, pgo);
        return oym2;
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void run() {
        final pfr b = this.b;
        int addAndGet = 1;
    Label_0007:
        while (!this.c) {
            do {
                final Runnable runnable = (Runnable)b.bW();
                if (runnable == null) {
                    if (this.c) {
                        b.bZ();
                        return;
                    }
                    if ((addAndGet = this.d.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue Label_0007;
                }
                else {
                    runnable.run();
                }
            } while (!this.c);
            b.bZ();
            return;
        }
        b.bZ();
    }
}
