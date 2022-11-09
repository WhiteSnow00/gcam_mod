import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zq implements oey
{
    final WeakReference a;
    public final zm b;
    
    public zq(final zn zn) {
        this.b = new zp(this);
        this.a = new WeakReference((T)zn);
    }
    
    public final void a(final Throwable t) {
        final zm b = this.b;
        if (zm.b.d(b, null, new zg(t))) {
            zm.e(b);
        }
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        final zn zn = (zn)this.a.get();
        boolean cancel;
        final boolean b2 = cancel = this.b.cancel(b);
        if (b2) {
            cancel = b2;
            if (zn != null) {
                zn.a = null;
                zn.b = null;
                zn.c.f(null);
                cancel = true;
            }
        }
        return cancel;
    }
    
    @Override
    public final void d(final Runnable runnable, final Executor executor) {
        this.b.d(runnable, executor);
    }
    
    @Override
    public final Object get() {
        return this.b.get();
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        return this.b.get(n, timeUnit);
    }
    
    @Override
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }
    
    @Override
    public final boolean isDone() {
        return this.b.isDone();
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
