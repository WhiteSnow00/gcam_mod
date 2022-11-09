import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i
{
    public h a;
    private wz b;
    private final WeakReference c;
    private int d;
    private boolean e;
    private boolean f;
    private ArrayList g;
    
    public i() {
        new AtomicReference();
    }
    
    public i(final k k) {
        new AtomicReference();
        this.b = new wz();
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = new ArrayList();
        this.c = new WeakReference((T)k);
        this.a = h.b;
    }
    
    static h a(final h h, final h h2) {
        if (h2 != null && h2.compareTo(h) < 0) {
            return h2;
        }
        return h;
    }
    
    public static void f(final String s) {
        if (ww.a().b()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Method ");
        sb.append(s);
        sb.append(" must be called on the main thread");
        throw new IllegalStateException(sb.toString());
    }
    
    private final h g(final adj adj) {
        final wz b = this.b;
        final boolean c = b.c(adj);
        h h = null;
        xc d;
        if (c) {
            d = b.a.get(adj).d;
        }
        else {
            d = null;
        }
        h a;
        if (d != null) {
            a = ((l)d.b).a;
        }
        else {
            a = null;
        }
        if (!this.g.isEmpty()) {
            final ArrayList g = this.g;
            h = (h)g.get(g.size() - 1);
        }
        return a(a(this.a, a), h);
    }
    
    private final void h(final h a) {
        if (this.a == a) {
            return;
        }
        this.a = a;
        if (!this.e && this.d == 0) {
            this.e = true;
            this.k();
            this.e = false;
            return;
        }
        this.f = true;
    }
    
    private final void i() {
        final ArrayList g = this.g;
        g.remove(g.size() - 1);
    }
    
    private final void j(final h h) {
        this.g.add(h);
    }
    
    private final void k() {
        final k k = (k)this.c.get();
        if (k != null) {
            l i = null;
            Label_0438: {
                l l = null;
                Label_0246: {
                    while (true) {
                        final wz b = this.b;
                        if (b.e == 0) {
                            break;
                        }
                        final h a = ((l)b.b.b).a;
                        final h a2 = ((l)b.c.b).a;
                        if (a == a2 && this.a == a2) {
                            break;
                        }
                        this.f = false;
                        if (this.a.compareTo(a) < 0) {
                            final wz b2 = this.b;
                            final xb xb = new xb(b2.c, b2.b);
                            b2.d.put(xb, false);
                            while (xb.hasNext() && !this.f) {
                                final Map.Entry<K, l> entry = xb.next();
                                l = entry.getValue();
                                while (l.a.compareTo(this.a) > 0 && !this.f && this.b.c(entry.getKey())) {
                                    final g a3 = g.a(l.a);
                                    if (a3 == null) {
                                        break Label_0246;
                                    }
                                    this.j(a3.c());
                                    l.a(k, a3);
                                    this.i();
                                }
                            }
                        }
                        final xc c = this.b.c;
                        if (this.f || c == null || this.a.compareTo(((l)c.b).a) <= 0) {
                            continue;
                        }
                        final xd e = this.b.e();
                        while (e.hasNext() && !this.f) {
                            final xc xc = (xc)e.a();
                            i = (l)xc.b;
                            while (i.a.compareTo(this.a) < 0 && !this.f && this.b.c(xc.a)) {
                                this.j(i.a);
                                final g b3 = g.b(i.a);
                                if (b3 == null) {
                                    break Label_0438;
                                }
                                i.a(k, b3);
                                this.i();
                            }
                        }
                    }
                    this.f = false;
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("no event down from ");
                sb.append(l.a);
                throw new IllegalStateException(sb.toString());
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("no event up from ");
            sb2.append(i.a);
            throw new IllegalStateException(sb2.toString());
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }
    
    public final void b(final adj adj) {
        f("addObserver");
        h h;
        if (this.a == h.a) {
            h = h.a;
        }
        else {
            h = h.b;
        }
        final l l = new l(adj, h);
        final wz b = this.b;
        final xc a = b.a(adj);
        Object b2;
        if (a != null) {
            b2 = a.b;
        }
        else {
            b.a.put(adj, b.d(adj, l));
            b2 = null;
        }
        if (b2 != null) {
            return;
        }
        final k k = (k)this.c.get();
        if (k == null) {
            return;
        }
        final boolean b3 = this.d != 0 || this.e;
        h h2 = this.g(adj);
        ++this.d;
        while (l.a.compareTo(h2) < 0 && this.b.c(adj)) {
            this.j(l.a);
            final g b4 = g.b(l.a);
            if (b4 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("no event up from ");
                sb.append(l.a);
                throw new IllegalStateException(sb.toString());
            }
            l.a(k, b4);
            this.i();
            h2 = this.g(adj);
        }
        if (!b3) {
            this.k();
        }
        --this.d;
    }
    
    public final void c(final g g) {
        f("handleLifecycleEvent");
        this.h(g.c());
    }
    
    public final void d(final adj adj) {
        f("removeObserver");
        this.b.b(adj);
    }
    
    public final void e(final h h) {
        f("setCurrentState");
        this.h(h);
    }
}
