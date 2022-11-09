import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjq implements Executor
{
    private final kjm a;
    
    public kjq(final kjm a) {
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        if (kjm.c()) {
            runnable.run();
            return;
        }
        final ofn f = ofn.f();
        this.a.execute(new kjp(runnable, f));
        try {
            f.get();
        }
        catch (final ExecutionException ex) {
            throw new RuntimeException(ex);
        }
        catch (final InterruptedException ex2) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(ex2);
        }
    }
}
