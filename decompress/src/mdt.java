import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mdt implements Executor
{
    public final ofb a;
    private final ConcurrentLinkedQueue b;
    private volatile boolean c;
    private final AtomicBoolean d;
    
    public mdt(final ofb a, final mfp mfp) {
        this.b = new ConcurrentLinkedQueue();
        this.c = false;
        this.d = new AtomicBoolean();
        this.a = a;
        final mee mee = new mee(mfp);
        mfp.a(mee);
        mee.execute(new mdr(this));
    }
    
    private final void b() {
        while (true) {
            final Runnable runnable = this.b.poll();
            if (runnable == null) {
                break;
            }
            this.a.execute(runnable);
        }
    }
    
    public final void a() {
        this.c = true;
        this.b();
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        if (this.c) {
            this.a.execute(runnable);
            return;
        }
        this.b.add(runnable);
        if (this.c) {
            this.b();
            return;
        }
        if (!this.d.getAndSet(true)) {
            this.a.e(new mds(this, 1), 7000L, TimeUnit.MILLISECONDS);
        }
    }
}
