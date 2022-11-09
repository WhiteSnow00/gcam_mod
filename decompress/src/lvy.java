import java.util.List;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.AbstractExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvy extends AbstractExecutorService implements lvi
{
    public final lxh a;
    private final Thread b;
    private final AtomicBoolean c;
    private final lwa d;
    
    private lvy(final String s, final lwa d) {
        this.c = new AtomicBoolean(false);
        this.a = lxh.i();
        this.d = d;
        this.b = new Thread(new lvx(this, d), s);
    }
    
    public static lvy b(final String s, final lwa lwa) {
        return new lvy(s, lwa);
    }
    
    public final void a() {
        this.b.start();
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        try {
            this.b.join(TimeUnit.MILLISECONDS.convert(n, timeUnit));
            return this.isTerminated();
        }
        catch (final InterruptedException ex) {
            Log.w("EventLoopThread", "Interrupted while waiting for thread to stop.");
            return false;
        }
    }
    
    @Override
    public final void close() {
        this.a.h(lvm.a);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.d.execute(runnable);
    }
    
    @Override
    public final boolean isShutdown() {
        return this.c.get();
    }
    
    @Override
    public final boolean isTerminated() {
        return !this.b.isAlive();
    }
    
    @Override
    public final void shutdown() {
        this.c.set(true);
        this.d.a();
    }
    
    @Override
    public final List shutdownNow() {
        this.c.set(true);
        final lwa d = this.d;
        d.a.clear();
        d.a();
        return (List)lwt.f(this.a);
    }
    
    @Override
    public final String toString() {
        final String name = this.b.getName();
        final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 17);
        sb.append("EventLoopThread[");
        sb.append(name);
        sb.append("]");
        return sb.toString();
    }
}
