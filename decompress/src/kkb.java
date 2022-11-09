import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kkb extends kkc
{
    public kkb(final RunnableScheduledFuture runnableScheduledFuture) {
        super(runnableScheduledFuture);
    }
    
    @Override
    public final void run() {
        try {
            super.run();
            if (super.isDone() && !super.isCancelled()) {
                super.get();
            }
        }
        catch (final ExecutionException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
        catch (final CancellationException ex2) {}
        catch (final InterruptedException ex3) {}
    }
}
