import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class bsv implements Executor, krc
{
    public final Executor a;
    private final int b;
    private final ScheduledExecutorService c;
    
    public bsv(final String s, final int b) {
        final kjm a = new kjm();
        this.b = b;
        this.c = mcn.l(s);
        this.a = a;
    }
    
    @Override
    public final void close() {
        this.c.shutdown();
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        try {
            this.c.schedule(new bsu(this, runnable), this.b, TimeUnit.MILLISECONDS);
        }
        catch (final RejectedExecutionException ex) {}
    }
}
