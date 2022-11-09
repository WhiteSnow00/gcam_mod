import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class ida
{
    private static final nsd l;
    public final Object a;
    public final String b;
    public final int c;
    public final boolean d;
    public final HashMap e;
    public final HashMap f;
    public final HashMap g;
    public obl h;
    public boolean i;
    public long j;
    public long k;
    private final jcu m;
    
    static {
        l = nsd.g("com/google/android/apps/camera/timelapse/TimelapseUsageLogging");
    }
    
    public ida(final idc idc, final boolean d) {
        this.a = new Object();
        this.m = new jcu();
        this.b = "";
        this.d = d;
        final int c = ((nqk)idc.c).c;
        this.c = idc.f;
        this.h = obl.c;
        this.i = false;
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new HashMap();
        for (final idb idb : idb.values()) {
            this.e.put(idb, 0);
            final HashMap f = this.f;
            final Long value = 0L;
            f.put(idb, value);
            this.g.put(idb, value);
        }
    }
    
    public final idb a(final obl obl) {
        return (idb)jcu.a(obl, this.m.a);
    }
    
    final void b(final idb idb) {
        synchronized (this.a) {
            if (this.f.containsKey(idb)) {
                this.f.put(idb, this.f.get(idb) + 1L);
                return;
            }
            throw new IllegalArgumentException("unsupported speed up ratio");
        }
    }
    
    final void c(final idb idb) {
        synchronized (this.a) {
            if (this.g.containsKey(idb)) {
                this.g.put(idb, this.g.get(idb) + 1L);
                return;
            }
            throw new IllegalArgumentException("unsupported speed up ratio");
        }
    }
    
    final void d(final idb idb) {
        synchronized (this.a) {
            if (this.e.containsKey(idb)) {
                this.e.put(idb, this.e.get(idb) + 1);
                return;
            }
            throw new IllegalArgumentException("unsupported speed up ratio");
        }
    }
    
    final void e(final long j) {
        synchronized (this.a) {
            this.j = j;
        }
    }
    
    final void f(final idb idb) {
        final Object a = this.a;
        monitorenter(a);
        try {
            try {
                this.h = (obl)jcu.a(idb, this.m.b);
            }
            finally {
                monitorexit(a);
                monitorexit(a);
            }
        }
        catch (final IllegalArgumentException ex) {}
    }
    
    final void g(final long k) {
        synchronized (this.a) {
            this.k = k;
        }
    }
    
    final void h() {
        synchronized (this.a) {
            monitorexit(this.a);
        }
    }
    
    final void i() {
        synchronized (this.a) {
            monitorexit(this.a);
        }
    }
}
