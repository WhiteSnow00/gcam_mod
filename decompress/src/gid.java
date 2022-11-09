import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gid implements krc
{
    public final kma a;
    public final Object b;
    public final LinkedList c;
    public final kly d;
    public int e;
    public boolean f;
    
    public gid(final int e) {
        this.b = new ReentrantLock(true);
        this.e = e;
        this.c = new LinkedList();
        this.f = false;
        final kly d = new kly(e);
        this.d = d;
        this.a = new kma(d);
    }
    
    public final int a() {
        if (!this.f && this.c.isEmpty()) {
            return this.e;
        }
        return 0;
    }
    
    @Override
    public final void close() {
        final ArrayList list = new ArrayList();
        Object b = this.b;
        monitorenter(b);
        try {
            if (this.f) {
                monitorexit(b);
                return;
            }
            this.f = true;
            for (final gic gic : this.c) {
                gic.a = new gih("FiniteTicketPool closing.");
                list.add(gic);
            }
            this.d.a = this.a();
            monitorexit(b);
            if (list.size() <= 0) {
                this.d.c();
                return;
            }
            b = list.get(0);
            throw null;
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}
