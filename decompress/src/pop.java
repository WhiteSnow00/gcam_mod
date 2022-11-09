import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pop extends poo
{
    private final Executor b;
    
    public pop() {
    }
    
    public pop(final Executor b) {
        b.getClass();
        ppo.a(this.b = b);
    }
    
    @Override
    public final void cj(final pjq pjq, final Runnable runnable) {
        pjq.getClass();
        runnable.getClass();
        try {
            this.b.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            final CancellationException ex2 = new CancellationException("The task was rejected");
            ex2.initCause(ex);
            pjq.getClass();
            final pou pou = (pou)pjq.b(pou.b);
            if (pou != null) {
                pou.q(ex2);
            }
            poi.b.cj(pjq, runnable);
        }
    }
    
    @Override
    public final void close() {
        Executor b;
        if (!((b = this.b) instanceof ExecutorService)) {
            b = null;
        }
        if (b != null) {
            ((ExecutorService)b).shutdown();
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof pop && ((pop)o).b == this.b;
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this.b);
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
