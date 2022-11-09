import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

class ofe extends odd
{
    private final ExecutorService a;
    
    public ofe(final ExecutorService a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        return this.a.awaitTermination(n, timeUnit);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.execute(runnable);
    }
    
    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }
    
    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }
    
    @Override
    public final void shutdown() {
        this.a.shutdown();
    }
    
    @Override
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(value).length());
        sb.append(string);
        sb.append("[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
