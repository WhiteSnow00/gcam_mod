import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bty
{
    public final ScheduledExecutorService a;
    private final ksj b;
    private int c;
    private final List d;
    
    public bty(final kse kse, final ScheduledExecutorService a) {
        this.c = 0;
        this.d = new ArrayList();
        final ksj b = kse.b("InteractivityReadinessLatch");
        this.b = b;
        this.a = a;
        b.c(this.c);
    }
    
    public final bud a(final Executor executor) {
        synchronized (this) {
            final bud bud = new bud(executor);
            if (this.c > 0) {
                bud.a();
            }
            this.d.add(bud);
            return bud;
        }
    }
    
    public final krc b() {
        monitorenter(this);
        try {
            final int c = this.c + 1;
            this.c = c;
            this.b.c(c);
            if (this.c == 1) {
                final Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                    ((bud)iterator.next()).a();
                }
            }
            final btx btx = new btx(this);
            monitorexit(this);
            return btx;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            final int c = this.c - 1;
            this.c = c;
            this.b.c(c);
            njo.o(this.c >= 0);
            if (this.c == 0) {
                final Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                    ((bud)iterator.next()).b();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
