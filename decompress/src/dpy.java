import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpy
{
    private static final nsd b;
    public final jdr a;
    private final Map c;
    
    static {
        b = nsd.g("com/google/android/apps/camera/framestore/MetadataFrameStore");
    }
    
    public dpy() {
        new ksb();
        this(null);
    }
    
    public dpy(final byte[] array) {
        this.a = jxc.m(68);
        this.c = new HashMap();
    }
    
    public final gzn a(final long n) {
        return (gzn)this.a.a(bo.e(n));
    }
    
    public final gzn b() {
        final jdr a = this.a;
        synchronized (a.a) {
            krc krc;
            if (a.b.isEmpty()) {
                monitorexit(a.a);
                krc = null;
            }
            else {
                final List d = a.c.d(a.b.k().b());
                krc = (krc)d.get(d.size() - 1);
                monitorexit(a.a);
            }
            return (gzn)krc;
        }
    }
    
    public final List c() {
        return this.a.d();
    }
    
    public final void d(final gzn gzn) {
        monitorenter(this);
        try {
            for (final Map.Entry<K, Executor> entry : this.c.entrySet()) {
                try {
                    entry.getValue().execute(new dpx((Map.Entry)entry, gzn));
                }
                catch (final RejectedExecutionException ex) {
                    a.n(dpy.b.b(), "RejectedExecutionException on %s", entry.getKey(), '\u035b', ex);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e(final dpz dpz) {
        synchronized (this) {
            if (this.c.containsKey(dpz)) {
                this.c.remove(dpz);
            }
        }
    }
    
    public final void f(final dpz dpz, final Executor executor) {
        synchronized (this) {
            this.c.put(dpz, executor);
            new dpw(this, dpz);
        }
    }
}
