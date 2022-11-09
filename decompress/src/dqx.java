import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqx
{
    private static final nsd a;
    private final Map b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/gallery/processing/ProcessingMediaManagerImpl");
    }
    
    public dqx() {
        this.b = new HashMap();
    }
    
    private final dqu f(final long n) {
        monitorenter(this);
        try {
            for (dqu dqu : this.b.values()) {
                if (dqu.a.a == n) {
                    monitorexit(this);
                    return dqu;
                }
            }
            dqx.a.b().E(870).q("Mediastore record not found for %s", n);
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final niz a(final long n) {
        return niz.h(this.f(n));
    }
    
    public final niz b(final him him) {
        synchronized (this) {
            return niz.h(this.b.get(him));
        }
    }
    
    public final List c() {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            for (final dqu dqu : this.b.values()) {
                if (dqu.e()) {
                    list.add(dqu);
                }
            }
            list.size();
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final dqu d(final him him) {
        synchronized (this) {
            njo.i(this.b.containsKey(him), "No session associated with session: %s", him);
            final dqu dqu = this.b.remove(him);
            dqu.getClass();
            return dqu;
        }
    }
    
    public final void e(final him him, final dqu dqu) {
        synchronized (this) {
            njo.m(this.b.containsKey(him) ^ true, "Already contain pending ProcessingMedia <%s> for session <%s>. Now attempting to associate ProcessingMedia <%s> with same session.", this.b.get(him), him, dqu);
            this.b.put(him, dqu);
        }
    }
}
