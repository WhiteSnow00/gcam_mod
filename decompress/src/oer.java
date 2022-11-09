import java.util.concurrent.Executor;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oer
{
    private final boolean a;
    private final nns b;
    
    public oer(final boolean a, final nns b) {
        this.a = a;
        this.b = b;
    }
    
    public final oey a(final Callable callable, final Executor executor) {
        return new odw(this.b, this.a, executor, callable);
    }
    
    public final oey b(final odo odo, final Executor executor) {
        return new odw(this.b, this.a, executor, odo);
    }
    
    public final void c(final Runnable runnable, final Executor executor) {
        this.a(new oeq(runnable), executor);
    }
}
