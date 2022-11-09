import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pcl extends AtomicInteger implements oxd
{
    private static final long serialVersionUID = 4883307006032401862L;
    public final oxd a;
    final phg b;
    final pft c;
    volatile boolean d;
    
    public pcl(final oxd a) {
        this.a = a;
        this.b = new phg();
        this.c = new pft(16);
    }
    
    @Override
    public final void a() {
        if (!this.a.ca() && !this.d) {
            this.d = true;
            if (this.getAndIncrement() == 0) {
                this.e();
            }
        }
    }
    
    @Override
    public final void b(final Throwable t) {
        throw null;
    }
    
    @Override
    public final void c(final Object o) {
        if (!this.a.ca()) {
            if (!this.d) {
                Label_0081: {
                    if (this.get() == 0 && this.compareAndSet(0, 1)) {
                        this.a.c(o);
                        if (this.decrementAndGet() == 0) {
                            return;
                        }
                        break Label_0081;
                    }
                    final pft c = this.c;
                    synchronized (c) {
                        c.j(o);
                        monitorexit(c);
                        if (this.getAndIncrement() != 0) {
                            return;
                        }
                        this.e();
                    }
                }
            }
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    final void e() {
        final oxd a = this.a;
        final pft c = this.c;
        final phg b = this.b;
        int addAndGet = 1;
        while (!a.ca()) {
            if (b.get() != null) {
                c.bZ();
                a.b(phi.b(b));
                return;
            }
            final boolean d = this.d;
            final Object bw = c.bW();
            if (d) {
                if (bw == null) {
                    if (!((pck)a).ca()) {
                        try {
                            ((pck)a).a.bU();
                        }
                        finally {
                            oyj.g((AtomicReference)a);
                        }
                    }
                    return;
                }
            }
            else if (bw == null) {
                if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                    return;
                }
                continue;
            }
            a.c(bw);
        }
        c.bZ();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
