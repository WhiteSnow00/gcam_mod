import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxp
{
    public final kzz a;
    private final Map b;
    private Runnable c;
    
    public kxp(final kzz a) {
        this.a = a;
        this.b = new HashMap();
    }
    
    public final noi a() {
        synchronized (this) {
            return noi.F(this.b.values());
        }
    }
    
    public final void b(final Runnable c) {
        synchronized (this) {
            njo.p(this.c == null, "Listener is already set, override not supported.");
            this.c = c;
        }
    }
    
    public final void c(final kws kws) {
        if (!this.a.a(kws.a)) {
            this.d(noi.H(kws));
        }
    }
    
    public final void d(final Set set) {
        monitorenter(this);
        try {
            final Iterator iterator = set.iterator();
            Runnable c = null;
            while (iterator.hasNext()) {
                final kws kws = (kws)iterator.next();
                if (!this.a.a(kws.a) && (!this.b.containsKey(kws.a) || !kws.equals(this.b.get(kws.a)))) {
                    c = this.c;
                    this.b.put(kws.a, kws);
                }
            }
            monitorexit(this);
            if (c != null) {
                c.run();
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
