import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwu implements gxf
{
    public final kkz a;
    public final long b;
    public final klj c;
    public final Object d;
    public boolean e;
    private final kqq f;
    private final LinkedList g;
    private List h;
    private final gxa i;
    
    public gwu(final fbj fbj, fbg a, final gxa i) {
        this.a = new kkz(0L);
        this.i = i;
        this.g = new LinkedList();
        this.d = new Object();
        this.e = false;
        this.h = new ArrayList();
        this.b = Math.min(300000000L, a.a);
        final gwq gwq = new gwq(this);
        synchronized (fbj.a) {
            if (fbj.c.containsKey(fbc.b)) {
                fbc.b.name();
                monitorexit(fbj.a);
            }
            else {
                fbc.b.name();
                fbj.c.put(fbc.b, new fbi(gwq, new kkz(false), nns.n(gwq.b().a(new fbh(fbj, 1), fbj.b), gwq.a().a(new fbh(fbj), fbj.b))));
                fbj.a();
                monitorexit(fbj.a);
            }
            final fbc b = fbc.b;
            a = (fbg)fbj.a;
            synchronized (fbj.a) {
                if (fbj.c.containsKey(b)) {
                    final kkz a2 = fbj.c.get(b).a;
                    monitorexit(fbj.a);
                    (this.c = a2).a(new gwr(this), ofi.c());
                    this.f = new gws(this);
                    return;
                }
                final String value = String.valueOf(b);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 24);
                sb.append("Feature not registered: ");
                sb.append(value);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
    
    private final void d(final gxc gxc) {
        synchronized (this.d) {
            this.e = true;
            final kkz a = this.a;
            a.aR((long)a.d + this.b);
            gxc.c(this.f);
            this.i.a(gxc);
        }
    }
    
    private final void e() {
        final Object d = this.d;
        monitorenter(d);
        try {
            this.g.size();
            final List h = this.h;
            if (h != null) {
                final Iterator iterator = h.iterator();
                while (iterator.hasNext()) {
                    ((gwt)iterator.next()).a();
                }
            }
            monitorexit(d);
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    @Override
    public final long a() {
        return this.b;
    }
    
    @Override
    public final void b(final gxc gxc) {
        synchronized (this.d) {
            if (((kkz)this.c).d) {
                this.d(gxc);
            }
            else {
                this.g.add(gxc);
                this.e();
            }
        }
    }
    
    public final void c() {
        synchronized (this.d) {
            if (!this.g.isEmpty()) {
                this.d(this.g.removeFirst());
                this.e();
            }
        }
    }
}
