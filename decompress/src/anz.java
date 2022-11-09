import java.util.ArrayDeque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anz implements Executor
{
    public final ArrayDeque a;
    public final Object b;
    private final Executor c;
    private volatile Runnable d;
    
    public anz(final Executor c) {
        this.c = c;
        this.a = new ArrayDeque();
        this.b = new Object();
    }
    
    final void a() {
        synchronized (this.b) {
            final Runnable d = this.a.poll();
            this.d = d;
            if (d != null) {
                this.c.execute(this.d);
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this.b) {
            this.a.add(new any(this, runnable));
            if (this.d == null) {
                this.a();
            }
        }
    }
}
