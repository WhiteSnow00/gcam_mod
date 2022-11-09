import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class klw implements Executor
{
    private boolean a;
    private final Queue b;
    
    public klw() {
        this.a = false;
        this.b = new LinkedList();
    }
    
    @Override
    public final void execute(Runnable o) {
        final Queue b = this.b;
        monitorenter(b);
        try {
            if (this.a) {
                this.b.add(o);
                monitorexit(b);
                return;
            }
            this.a = true;
            monitorexit(b);
            while (o != null) {
                ((Runnable)o).run();
                synchronized (this.b) {
                    o = this.b.poll();
                    if (o != null) {
                        continue;
                    }
                    this.a = false;
                    continue;
                }
                break;
            }
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}
