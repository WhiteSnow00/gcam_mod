import java.util.TreeMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzx
{
    private final TreeMap a;
    private final TreeMap b;
    
    public gzx() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
    
    public final void a(final long n, final ool ool, final oom oom) {
        monitorenter(this);
        try {
            final TreeMap a = this.a;
            final Long value = n;
            a.put(value, ool);
            this.b.put(value, oom);
            while (this.a.size() > 1000) {
                final TreeMap a2 = this.a;
                a2.remove(a2.firstKey());
                final TreeMap b = this.b;
                b.remove(b.firstKey());
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final long n) {
        synchronized (this) {
            final ool ool = this.a.get(n);
        }
    }
    
    public final void c(final long n) {
        synchronized (this) {
            final oom oom = this.b.get(n);
        }
    }
}
