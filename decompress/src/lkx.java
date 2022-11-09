import java.util.Locale;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.Set;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

final class lkx implements lku
{
    public final lkr a;
    public final krr b;
    public final kse c;
    private final ScheduledExecutorService d;
    private final llb e;
    private final List f;
    private final List g;
    private Set h;
    private Set i;
    private Set j;
    private lkb k;
    private lko l;
    private ScheduledFuture m;
    private nns n;
    private boolean o;
    private boolean p;
    private int q;
    
    public lkx(final ScheduledExecutorService d, final lkr a, final llb e, final kse c, final krr krr) {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.n = nns.l();
        this.o = false;
        this.p = false;
        this.q = 1;
        this.d = d;
        this.a = a;
        this.e = e;
        this.c = c;
        this.b = krr.a("MediaGroup");
    }
    
    private final void g() {
        synchronized (this) {
            if (this.m == null && !this.o && this.e.r >= 0L) {
                this.m = this.d.schedule(new lkv(this), this.e.r, TimeUnit.MILLISECONDS);
            }
        }
    }
    
    private final void h() {
        synchronized (this) {
            if (!this.p && this.l != null && this.h != null && this.i != null && this.j != null && (this.o || this.f.size() + this.g.size() == this.h.size() + this.i.size() + this.j.size())) {
                this.p = true;
                final ScheduledFuture m = this.m;
                if (m != null) {
                    m.cancel(false);
                    this.m = null;
                }
                this.d.execute(new lkw(this, this.c()));
            }
        }
    }
    
    @Override
    public final void a(final lkt lkt) {
        synchronized (this) {
            njo.o(this.l == null);
            this.l = lkt.e;
            this.h = nqr.a;
            this.i = nqr.a;
            this.n = lkt.f;
            this.q = 3;
            final HashSet j = new HashSet(lkt.d);
            j.addAll(lkt.b);
            j.addAll(lkt.c);
            this.j = j;
            this.g();
            this.h();
        }
    }
    
    @Override
    public final void b(final lkt lkt) {
        synchronized (this) {
            njo.o(this.l == null);
            this.l = lkt.e;
            this.k = lkt.a;
            this.h = lkt.b;
            this.i = lkt.c;
            this.j = noi.F(lkt.d);
            this.n = lkt.f;
            this.q = 2;
            this.g();
            this.h();
        }
    }
    
    final lkp c() {
        monitorenter(this);
        try {
            final Set h = this.h;
            h.getClass();
            final Set i = this.i;
            i.getClass();
            final lko l = this.l;
            l.getClass();
            final nog d = noi.D();
            final nog d2 = noi.D();
            final nog d3 = noi.D();
            for (final llj llj : this.f) {
                if (h.contains(llj)) {
                    if (llj.a() <= 0L) {
                        final krr b = this.b;
                        final String value = String.valueOf(llj);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 47);
                        sb.append("Refusing to publish ");
                        sb.append(value);
                        sb.append(" because the file is empty.");
                        b.d(sb.toString());
                        final llw k = llj.k();
                        if (k == null) {
                            continue;
                        }
                        d3.g(k);
                    }
                    else {
                        final lkd j = llj.j();
                        if (llj == this.k) {
                            l.e = j;
                        }
                        d.g(j);
                    }
                }
                else if (i.contains(llj)) {
                    if (llj.a() <= 0L) {
                        final krr b2 = this.b;
                        final String value2 = String.valueOf(llj);
                        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 47);
                        sb2.append("Refusing to publish ");
                        sb2.append(value2);
                        sb2.append(" because the file is empty.");
                        b2.d(sb2.toString());
                        final llw m = llj.k();
                        if (m == null) {
                            continue;
                        }
                        d3.g(m);
                    }
                    else {
                        final lkd j2 = llj.j();
                        if (llj == this.k) {
                            l.e = j2;
                        }
                        d2.g(j2);
                    }
                }
                else {
                    final llw k2 = llj.k();
                    if (k2 == null) {
                        continue;
                    }
                    d3.g(k2);
                }
            }
            final Iterator iterator2 = this.g.iterator();
            while (iterator2.hasNext()) {
                final llw k3 = ((llj)iterator2.next()).k();
                if (k3 != null) {
                    d3.g(k3);
                }
            }
            final noi f = d.f();
            if (f == null) {
                throw new NullPointerException("Null mediaFiles");
            }
            l.f = f;
            final noi f2 = d2.f();
            if (f2 == null) {
                throw new NullPointerException("Null privateMediaFiles");
            }
            l.g = f2;
            final noi f3 = d3.f();
            if (f3 != null) {
                l.h = f3;
                l.a(this.n);
                l.b(this.q);
                final lkk a = l.a;
                if (a != null) {
                    final Long b3 = l.b;
                    if (b3 != null && l.c != null && l.d != null && l.f != null && l.g != null && l.h != null && l.k != 0 && l.i != null) {
                        if (l.j != null) {
                            final lkp lkp = new lkp(a, b3, l.c, l.d, l.e, l.f, l.g, l.h, l.k, l.i, l.j);
                            monitorexit(this);
                            return lkp;
                        }
                    }
                }
                final StringBuilder sb3 = new StringBuilder();
                if (l.a == null) {
                    sb3.append(" mediaGroupId");
                }
                if (l.b == null) {
                    sb3.append(" timestampNs");
                }
                if (l.c == null) {
                    sb3.append(" utcTimestampMs");
                }
                if (l.d == null) {
                    sb3.append(" tag");
                }
                if (l.f == null) {
                    sb3.append(" mediaFiles");
                }
                if (l.g == null) {
                    sb3.append(" privateMediaFiles");
                }
                if (l.h == null) {
                    sb3.append(" cachedFiles");
                }
                if (l.k == 0) {
                    sb3.append(" publishIntent");
                }
                if (l.i == null) {
                    sb3.append(" listeners");
                }
                if (l.j == null) {
                    sb3.append(" contentResolverApi");
                }
                final String value3 = String.valueOf(sb3);
                final StringBuilder sb4 = new StringBuilder(String.valueOf(value3).length() + 28);
                sb4.append("Missing required properties:");
                sb4.append(value3);
                throw new IllegalStateException(sb4.toString());
            }
            throw new NullPointerException("Null cachedFiles");
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final llj llj) {
        synchronized (this) {
            this.g.add(llj);
            this.h();
        }
    }
    
    @Override
    public final void e(final llj llj) {
        synchronized (this) {
            this.f.add(llj);
            this.h();
        }
    }
    
    public final void f() {
        monitorenter(this);
        try {
            final HashSet m = nrr.m();
            final Set h = this.h;
            h.getClass();
            m.addAll(h);
            final Set i = this.i;
            i.getClass();
            m.addAll(i);
            final Set j = this.j;
            j.getClass();
            m.addAll(j);
            m.removeAll(this.f);
            m.removeAll(this.g);
            final krr b = this.b;
            final Locale root = Locale.ROOT;
            final lko l = this.l;
            l.getClass();
            final lkk a = l.a;
            if (a != null) {
                int k = 0;
                b.h(String.format(root, "Failed to publish MediaGroup-%s after %s ms. Forcibly publishing, and ignoring %s files that are neither published nor abandoned: %s.", a, this.e.r, m.size(), m));
                for (nns n = this.n; k < ((nql)n).c; ++k) {
                    ((lki)n.get(k)).d();
                }
                this.o = true;
                this.h();
                monitorexit(this);
                return;
            }
            throw new IllegalStateException("Property \"mediaGroupId\" has not been set");
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
