import java.util.concurrent.Executor;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpo implements dpm
{
    private static final nsd a;
    private final max b;
    private final Map c;
    private final int d;
    private final AtomicBoolean e;
    private final jdr f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/framestore/AudioFrameStoreImpl");
    }
    
    public dpo(final max b, final int d, final AtomicBoolean e, final jdr f) {
        this.c = (Map)new ConcurrentHashMap();
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void a(final boolean b) {
        if (this.e.getAndSet(b) != b && !b) {
            final jdr f = this.f;
            synchronized (f.a) {
                final ArrayList list = new ArrayList(f.c.b);
                final Iterator c = nqb.c(f.b);
                long n = -1L;
                while (c.hasNext()) {
                    final long longValue = c.next();
                    if (n != longValue) {
                        list.addAll(f.c.d(longValue));
                        n = longValue;
                    }
                }
                f.c.j();
                f.b.clear();
            }
        }
    }
    
    @Override
    public final void c() {
        monitorenter(this);
        try {
            final maw b = this.b.b(ByteBuffer.allocate(this.d), this.d);
            if (b == null) {
                monitorexit(this);
                return;
            }
            b.a.limit(b.b).rewind();
            if (this.e.get()) {
                this.f.e(b.c, (Object)new kqr(b));
                for (final Map.Entry<K, Executor> entry : this.c.entrySet()) {
                    entry.getValue().execute((Runnable)entry.getKey());
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final Runnable runnable, final Executor executor) {
        if (this.c.containsKey(runnable)) {
            dpo.a.c().i(nsz.b).E(856).o("Attempting to register listener twice.");
            return;
        }
        this.c.put(runnable, executor);
    }
}
