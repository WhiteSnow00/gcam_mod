import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofv extends oeh implements RunnableFuture
{
    private volatile oex a;
    
    public ofv(final Callable callable) {
        this.a = new ofu(this, callable);
    }
    
    public ofv(final odo odo) {
        this.a = new oft(this, odo);
    }
    
    public static ofv f(final odo odo) {
        return new ofv(odo);
    }
    
    static ofv g(final Callable callable) {
        return new ofv(callable);
    }
    
    static ofv h(final Runnable runnable, final Object o) {
        return new ofv(Executors.callable(runnable, o));
    }
    
    @Override
    protected final String bp() {
        final oex a = this.a;
        if (a != null) {
            final String value = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 7);
            sb.append("task=[");
            sb.append(value);
            sb.append("]");
            return sb.toString();
        }
        return super.bp();
    }
    
    @Override
    protected final void c() {
        if (this.p()) {
            final oex a = this.a;
            if (a != null) {
                a.h();
            }
        }
        this.a = null;
    }
    
    @Override
    public final void run() {
        final oex a = this.a;
        if (a != null) {
            a.run();
        }
        this.a = null;
    }
}
