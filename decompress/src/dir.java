import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dir implements AutoCloseable, klj
{
    private static final krc a;
    private klj b;
    private krc c;
    private klv d;
    private krc e;
    private lfu f;
    private final Executor g;
    private final klv h;
    private final klj i;
    
    static {
        a = bqx.f;
    }
    
    public dir(final Executor g) {
        final krc a = dir.a;
        this.c = a;
        this.d = klu.a(jbm.b);
        this.e = a;
        this.f = lfu.b;
        final kkz h = new kkz(false);
        this.h = h;
        this.i = kld.c(h);
        this.g = g;
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.i.a(kri, executor);
    }
    
    public final Boolean c() {
        return (Boolean)this.i.aQ();
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.e.close();
            final krc a = dir.a;
            this.e = a;
            this.c.close();
            this.c = a;
        }
    }
    
    public final void d() {
        monitorenter(this);
        try {
            final jbm jbm = (jbm)this.d.aQ();
            final boolean booleanValue = (boolean)this.b.aQ();
            final lfu f = this.f;
            boolean b = false;
            if (booleanValue) {
                if ((jbm != jbm.b || f != lfu.a) && (jbm != jbm.m || f != lfu.a)) {
                    if (jbm == jbm.g) {
                        b = true;
                    }
                }
                else {
                    b = true;
                }
            }
            this.h.aR(b);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e(final klv d) {
        synchronized (this) {
            this.d = d;
            this.e.close();
            this.e = d.a(new diq(this, 1), this.g);
        }
    }
    
    public final void f(final lfu f) {
        synchronized (this) {
            this.f = f;
            this.d();
        }
    }
    
    public final void g(final klj b) {
        synchronized (this) {
            this.b = b;
            this.c.close();
            this.c = b.a(new diq(this), this.g);
        }
    }
}
