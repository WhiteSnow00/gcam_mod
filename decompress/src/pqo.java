import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class pqo extends poo implements Executor, pqr
{
    private final ConcurrentLinkedQueue b;
    private final pnd d;
    private final pqn e;
    private final int f;
    private final String g;
    
    public pqo(final pqn e, final int f) {
        this.e = e;
        this.f = f;
        this.g = "Dispatchers.IO";
        this.b = new ConcurrentLinkedQueue();
        this.d = plv.h();
    }
    
    private final void l(Runnable runnable, final boolean b) {
        while (this.d.b() > this.f) {
            this.b.add(runnable);
            if (this.d.a() >= this.f) {
                return;
            }
            if ((runnable = this.b.poll()) == null) {
                return;
            }
        }
        this.e.j(runnable, this, b);
    }
    
    @Override
    public final void cj(final pjq pjq, final Runnable runnable) {
        pjq.getClass();
        runnable.getClass();
        this.l(runnable, false);
    }
    
    @Override
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        this.l(runnable, false);
    }
    
    @Override
    public final int j() {
        return 1;
    }
    
    @Override
    public final void k() {
        final Runnable runnable = this.b.poll();
        if (runnable != null) {
            this.e.j(runnable, this, true);
            return;
        }
        this.d.a();
        final Runnable runnable2 = this.b.poll();
        if (runnable2 != null) {
            this.l(runnable2, true);
        }
    }
    
    @Override
    public final String toString() {
        return this.g;
    }
}
