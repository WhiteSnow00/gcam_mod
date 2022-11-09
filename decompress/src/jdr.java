import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdr
{
    public final Object a;
    public final nra b;
    public final nle c;
    private final jds d;
    
    public jdr(final jds d) {
        this.d = d;
        this.c = nle.v();
        this.b = new nru(nqc.a);
        this.a = this;
    }
    
    private final void f(final Long n, final krc krc) {
        this.c.u(n, krc);
        this.b.remove(n);
    }
    
    public final krc a(final long n) {
        synchronized (this.a) {
            final nra b = this.b;
            final Long value = n;
            if (!b.contains(value)) {
                return null;
            }
            return (krc)this.c.d(value).get(0);
        }
    }
    
    public final krc b() {
        synchronized (this.a) {
            if (this.b.isEmpty()) {
                return null;
            }
            return this.c.d(this.b.j().b()).get(0);
        }
    }
    
    public final krc c() {
        synchronized (this.a) {
            if (this.b.isEmpty()) {
                return null;
            }
            final Long n = (Long)this.b.j().b();
            final krc krc = this.c.d(n).get(0);
            this.f(n, krc);
            return krc;
        }
    }
    
    public final List d() {
        final Object a = this.a;
        monitorenter(a);
        try {
            final ArrayList list = new ArrayList(this.c.b);
            final Iterator c = nqb.c(this.b);
            long n = -1L;
            while (c.hasNext()) {
                final long longValue = c.next();
                if (n != longValue) {
                    list.addAll(this.c.d(longValue));
                    n = longValue;
                }
            }
            monitorexit(a);
            return list;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
