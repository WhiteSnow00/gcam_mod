import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lxg implements oey
{
    private final lxh a;
    
    public lxg(final lxh a) {
        this.a = a;
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        return false;
    }
    
    @Override
    public final void d(final Runnable runnable, final Executor executor) {
        if (this.a.f()) {
            executor.execute(runnable);
            return;
        }
        synchronized (this.a) {
            if (!this.a.f()) {
                this.a.m(executor, runnable);
                return;
            }
            monitorexit(this.a);
            executor.execute(runnable);
        }
    }
    
    @Override
    public final Object get() {
        try {
            return this.a.e();
        }
        catch (final lwi lwi) {
            throw new ExecutionException(lwi);
        }
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        synchronized (this.a) {
            if (!this.isDone()) {
                timeUnit.timedWait(this.a, n);
                if (!this.isDone()) {
                    throw new TimeoutException();
                }
            }
            final Object a = this.a.a;
            if (a != null) {
                return a;
            }
            throw new ExecutionException(this.a.b);
        }
    }
    
    @Override
    public final boolean isCancelled() {
        return false;
    }
    
    @Override
    public final boolean isDone() {
        return this.a.f();
    }
}
