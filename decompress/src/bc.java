import java.util.ArrayDeque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class bc implements Executor
{
    private final Executor a;
    private final ArrayDeque b;
    private Runnable c;
    
    public bc(final Executor a) {
        this.b = new ArrayDeque();
        this.a = a;
    }
    
    final void a() {
        synchronized (this) {
            final Runnable c = this.b.poll();
            this.c = c;
            if (c != null) {
                this.a.execute(c);
            }
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this) {
            this.b.offer(new bb(this, runnable));
            if (this.c == null) {
                this.a();
            }
        }
    }
}
