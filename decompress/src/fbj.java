import java.util.Iterator;
import java.util.EnumMap;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbj
{
    private static final nsd d;
    public final Object a;
    public final Executor b;
    public final EnumMap c;
    private final long e;
    
    static {
        d = nsd.g("com/google/android/apps/camera/memory/MemoryManager");
    }
    
    public fbj(final fbg fbg, final Executor b) {
        this.e = fbg.a;
        this.c = new EnumMap((Class<K>)fbc.class);
        this.a = new Object();
        this.b = b;
    }
    
    private final long b() {
        final Object a = this.a;
        monitorenter(a);
        try {
            final Iterator iterator = this.c.keySet().iterator();
            long n = 0L;
            while (iterator.hasNext()) {
                n += (long)((kkz)this.c.get(iterator.next()).c.b()).d;
            }
            final long e = this.e;
            monitorexit(a);
            return e - n;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void a() {
        final Object a = this.a;
        monitorenter(a);
        try {
            this.b();
            for (fbc fbc : this.c.keySet()) {
                final kkz a2 = this.c.get(fbc).a;
                synchronized (this.a) {
                    final long b = this.b();
                    final long longValue = (long)((klo)this.c.get(fbc).c.a()).a;
                    final boolean b2 = false;
                    boolean b3 = false;
                    if (longValue < 0L) {
                        fbj.d.c().E(1508).w("Feature (%s) reports negative shot memory: %d. Disabling.", fbc.name(), longValue);
                        monitorexit(this.a);
                        b3 = b2;
                    }
                    else {
                        if (longValue <= b) {
                            b3 = true;
                        }
                        fbc.name();
                        monitorexit(this.a);
                    }
                    a2.aR(b3);
                    continue;
                }
                break;
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
