import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class mcp implements Executor
{
    public final Object a;
    public final Executor b;
    public final Deque c;
    public boolean d;
    
    public mcp(final Executor b) {
        this.a = new Object();
        this.c = new ArrayDeque();
        this.d = false;
        this.b = b;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this.a) {
            this.c.addLast(runnable);
            if (!this.d) {
                this.d = true;
                this.b.execute(new mco(this));
            }
        }
    }
}
