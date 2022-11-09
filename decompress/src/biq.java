import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class biq
{
    private final Map a;
    private final long b;
    private long c;
    
    public biq(final long b) {
        this.a = new LinkedHashMap(100, 0.75f, true);
        this.b = b;
    }
    
    protected int a(final Object o) {
        return 1;
    }
    
    protected void c(final Object o, final Object o2) {
    }
    
    public final long e() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final Object f(Object a) {
        monitorenter(this);
        try {
            final bip bip = this.a.get(a);
            if (bip != null) {
                a = bip.a;
            }
            else {
                a = null;
            }
            monitorexit(this);
            return a;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final Object g(Object a, final Object o) {
        synchronized (this) {
            final int a2 = this.a(o);
            final long n = a2;
            if (n >= this.b) {
                this.c(a, o);
                return null;
            }
            if (o != null) {
                this.c += n;
            }
            final Map a3 = this.a;
            bip bip;
            if (o == null) {
                bip = null;
            }
            else {
                bip = new bip(o, a2);
            }
            final bip bip2 = a3.put(a, bip);
            if (bip2 != null) {
                this.c -= bip2.b;
                if (!bip2.a.equals(o)) {
                    this.c(a, bip2.a);
                }
            }
            this.j(this.b);
            if (bip2 != null) {
                a = bip2.a;
                return a;
            }
            return null;
        }
    }
    
    public final Object h(Object a) {
        monitorenter(this);
        try {
            final bip bip = this.a.remove(a);
            if (bip == null) {
                a = null;
            }
            else {
                this.c -= bip.b;
                a = bip.a;
            }
            monitorexit(this);
            return a;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void i() {
        this.j(0L);
    }
    
    public final void j(final long n) {
        monitorenter(this);
        try {
            while (this.c > n) {
                final Iterator iterator = this.a.entrySet().iterator();
                final Map.Entry<K, bip> entry = (Map.Entry<K, bip>)iterator.next();
                final bip bip = entry.getValue();
                this.c -= bip.b;
                final K key = entry.getKey();
                iterator.remove();
                this.c(key, bip.a);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
