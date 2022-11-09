import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bud implements Executor
{
    private boolean a;
    private final List b;
    private final Executor c;
    
    public bud(final Executor c) {
        this.b = new ArrayList();
        this.c = c;
        this.a = false;
    }
    
    final void a() {
        synchronized (this) {
            njo.o(this.a ^ true);
            this.a = true;
        }
    }
    
    final void b() {
        monitorenter(this);
        try {
            njo.o(this.a);
            this.a = false;
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                this.c.execute((Runnable)iterator.next());
            }
            this.b.clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        synchronized (this) {
            if (this.a) {
                this.b.add(runnable);
                return;
            }
            njo.p(this.b.isEmpty(), "LatchExecutor: Bad pending task.");
            this.c.execute(runnable);
        }
    }
}
