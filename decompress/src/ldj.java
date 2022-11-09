import android.view.Surface;
import java.util.Collection;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.Map;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldj
{
    public final Set a;
    public final List b;
    public final krr c;
    public lcd d;
    private final ldy e;
    private final Set f;
    private final Map g;
    private final Map h;
    private final kse i;
    private boolean j;
    
    public ldj(final ldy e, final kjk kjk, final Executor executor, final krr krr, final kse i) {
        this.j = false;
        this.e = e;
        this.i = i;
        this.b = new ArrayList();
        this.a = new HashSet();
        this.f = new HashSet(e.a.size());
        this.g = new HashMap(e.a.size());
        this.h = new HashMap(e.a.size());
        this.c = krr.a("SurfaceMap");
        for (final ldm ldm : e.c) {
            kjk.c(ldm.a.a(new ldi(this, ldm), executor));
        }
    }
    
    public final void a(final lcd lcd, final Collection collection) {
        monitorenter(this);
        try {
            final lcd d = this.d;
            boolean b = false;
            nov.C(d != null, "setActiveCaptureSession must be invoked first.", new Object[0]);
            if (lcd != this.d) {
                monitorexit(this);
                return;
            }
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                b |= this.a.addAll(((ljo)iterator.next()).a());
            }
            monitorexit(this);
            if (b) {
                this.c();
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final Runnable runnable) {
        synchronized (this.b) {
            this.b.add(runnable);
        }
    }
    
    public final void c() {
        this.i.f("SurfaceMap#invokeCallbacks");
        List l = nns.l();
        final List b = this.b;
        monitorenter(b);
        try {
            if (!this.b.isEmpty()) {
                l = new ArrayList(this.b);
            }
            monitorexit(b);
            final Iterator iterator = l.iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
            this.i.g();
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final void d(final lcd d) {
        synchronized (this) {
            final lcd d2 = this.d;
            boolean b = false;
            if (d2 == null || d2 != d) {
                this.a.clear();
                this.d = d;
                this.j = false;
                b = true;
            }
            monitorexit(this);
            if (b) {
                this.e();
            }
        }
    }
    
    public final void e() {
        monitorenter(this);
        try {
            final Iterator<Object> iterator = this.e.a.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final ldw ldw = iterator.next();
                final Surface g = ldw.g();
                if (g != null && g.isValid()) {
                    if (!this.g.containsKey(ldw)) {
                        this.f.add(g);
                        this.g.put(ldw, g);
                        final Surface surface = this.h.remove(ldw);
                        if (surface != g && surface != null) {
                            this.j = true;
                        }
                        b = true;
                    }
                    else {
                        final Surface surface2 = this.g.get(ldw);
                        if (surface2 == g) {
                            continue;
                        }
                        this.j = true;
                        this.f.remove(surface2);
                        this.f.add(g);
                        this.g.put(ldw, g);
                    }
                }
                else {
                    if (!this.g.containsKey(ldw)) {
                        continue;
                    }
                    final Surface surface3 = this.g.get(ldw);
                    if (surface3 == g) {
                        continue;
                    }
                    this.f.remove(surface3);
                    this.g.remove(ldw);
                    this.h.put(ldw, surface3);
                    b = true;
                }
            }
            final boolean j = this.j;
            monitorexit(this);
            if (!j && !b) {
                return;
            }
            this.c();
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean f(final Surface surface) {
        monitorenter(this);
        try {
            final boolean contains = this.f.contains(surface);
            final boolean contains2 = this.a.contains(surface);
            if (contains && !contains2) {
                final krr c = this.c;
                final String value = String.valueOf(surface);
                final String value2 = String.valueOf(this.d);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 57 + String.valueOf(value2).length());
                sb.append(value);
                sb.append(" is valid but deferred streams are not yet available for ");
                sb.append(value2);
                c.h(sb.toString());
            }
            final boolean b = contains && contains2;
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean g() {
        synchronized (this) {
            return this.j;
        }
    }
}
