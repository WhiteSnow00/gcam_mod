import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Deque;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldt implements krc
{
    private static int l;
    public final ljx a;
    public final int b;
    public final kre c;
    public final Executor d;
    public final Runnable e;
    public final krr f;
    public final lbk g;
    public final ksj h;
    public final Deque i;
    public final Queue j;
    public boolean k;
    private final kjk m;
    private final Runnable n;
    private final kse o;
    private final ldo p;
    private final long q;
    private final String r;
    private boolean s;
    private List t;
    private lju u;
    
    static {
        ldt.l = 0;
    }
    
    public ldt(final ljx a, final kjk m, final Executor d, final krr f, final kse o, final lbk g, final ldo p7) {
        this.k = false;
        this.s = true;
        this.a = a;
        this.b = a.b();
        this.m = m;
        this.d = d;
        this.f = f;
        this.o = o;
        this.g = g;
        this.c = kre.h(a.d(), a.a());
        this.i = new ArrayDeque();
        this.j = new nrj(new ArrayDeque());
        this.n = new lds(this, 1);
        this.e = new lds(this);
        this.p = p7;
        this.q = d();
        final String value = String.valueOf(lio.i(a));
        String concat;
        if (value.length() != 0) {
            concat = "PckImageCount_".concat(value);
        }
        else {
            concat = new String("PckImageCount_");
        }
        this.h = o.b(concat);
        final String value2 = String.valueOf(lio.i(a));
        String concat2;
        if (value2.length() != 0) {
            concat2 = "distribute_".concat(value2);
        }
        else {
            concat2 = new String("distribute_");
        }
        this.r = concat2;
    }
    
    private static int d() {
        synchronized (ldt.class) {
            final int l = ldt.l;
            ldt.l = l + 1;
            return l;
        }
    }
    
    public final void a() {
        this.o.f("distribute");
        Object p = null;
        try {
        Label_0341_Outer:
            while (true) {
                synchronized (this) {
                    kse kse = null;
                    Label_0029: {
                        if (this.k) {
                            monitorexit(this);
                            kse = this.o;
                        }
                        else if (!this.s) {
                            monitorexit(this);
                            kse = this.o;
                        }
                        else {
                            if (this.u == null) {
                                this.o.f("acquire");
                                this.u = this.a.g();
                                this.o.g();
                            }
                            final lju u = this.u;
                            if (u == null) {
                                monitorexit(this);
                                kse = this.o;
                            }
                            else {
                                Label_0579: {
                                    if (this.t == null) {
                                        final Iterator iterator = this.i.iterator();
                                        leb leb = null;
                                        while (iterator.hasNext()) {
                                            final leb leb2 = (leb)iterator.next();
                                            final kvx c = leb2.c();
                                            c.getClass();
                                            if (leb != null) {
                                                final kvx c2 = leb.c();
                                                c2.getClass();
                                                if (c.a(c2) <= 0) {
                                                    continue Label_0341_Outer;
                                                }
                                            }
                                            leb = leb2;
                                        }
                                        if (leb != null) {
                                            final ldo p2 = this.p;
                                            final kvx c3 = leb.c();
                                            c3.getClass();
                                            if (u.d() - c3.a - p2.b - p2.a > 0L) {
                                                monitorexit(this);
                                                kse = this.o;
                                                break Label_0029;
                                            }
                                        }
                                        final long d = u.d();
                                        final Iterator iterator2 = this.i.iterator();
                                        while (true) {
                                            while (iterator2.hasNext()) {
                                                final kvx c4 = ((leb)iterator2.next()).c();
                                                if (c4 != null && this.p.a(c4.a, d)) {
                                                    List t;
                                                    if (c4 != null) {
                                                        final Iterator iterator3 = this.i.iterator();
                                                        t = null;
                                                        while (iterator3.hasNext()) {
                                                            final leb leb3 = (leb)iterator3.next();
                                                            final kvx c5 = leb3.c();
                                                            if (c5 != null && (c5.c <= c4.c || c5.a == c4.a)) {
                                                                List list;
                                                                if ((list = t) == null) {
                                                                    list = new ArrayList(2);
                                                                }
                                                                list.add(leb3);
                                                                iterator3.remove();
                                                                t = list;
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        final Iterator iterator4 = this.i.iterator();
                                                        t = null;
                                                        while (iterator4.hasNext()) {
                                                            final leb leb4 = (leb)iterator4.next();
                                                            final kvx c6 = leb4.c();
                                                            if (c6 != null && !this.p.b(c6.a, d)) {
                                                                List list2;
                                                                if ((list2 = t) == null) {
                                                                    list2 = new ArrayList(2);
                                                                }
                                                                list2.add(leb4);
                                                                iterator4.remove();
                                                                t = list2;
                                                            }
                                                        }
                                                    }
                                                    this.t = t;
                                                    break Label_0579;
                                                }
                                            }
                                            final kvx c4 = null;
                                            continue;
                                        }
                                    }
                                }
                                final List t2 = this.t;
                                if (t2 != null) {
                                    if (!t2.isEmpty()) {
                                        final Iterator iterator5 = t2.iterator();
                                        while (iterator5.hasNext()) {
                                            final kvx c7 = ((leb)iterator5.next()).c();
                                            c7.getClass();
                                            if (this.p.a(c7.a, u.d())) {
                                                p = c7;
                                            }
                                        }
                                        p.getClass();
                                        final ldp ldp = new ldp(this, u, (kvx)p);
                                        this.s = false;
                                        this.u = null;
                                        this.t = null;
                                        monitorexit(this);
                                        this.o.f(this.r);
                                        final lgb lgb = new lgb(ldp);
                                        for (final leb leb5 : t2) {
                                            final kvx c8 = leb5.c();
                                            c8.getClass();
                                            if (c8.a == ((kvx)p).a && c8.b == ((kvx)p).b) {
                                                leb5.k(lgb.k());
                                            }
                                            else {
                                                final krr f = this.f;
                                                final String value = String.valueOf(leb5.d());
                                                final long b = c8.b;
                                                final long a = c8.a;
                                                final String value2 = String.valueOf(ldp);
                                                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 102 + String.valueOf(value2).length());
                                                sb.append("Distributing null to ");
                                                sb.append(value);
                                                sb.append(" for frame ");
                                                sb.append(b);
                                                sb.append(" at ");
                                                sb.append(a);
                                                sb.append(" because it is older than ");
                                                sb.append(value2);
                                                f.h(sb.toString());
                                                leb5.k(null);
                                            }
                                        }
                                        lgb.l();
                                        this.o.g();
                                        synchronized (this) {
                                            this.s = true;
                                            continue;
                                        }
                                    }
                                }
                                final Iterator iterator7 = this.i.iterator();
                                leb leb6 = null;
                                while (iterator7.hasNext()) {
                                    p = iterator7.next();
                                    final kvx c9 = ((leb)p).c();
                                    c9.getClass();
                                    if (leb6 != null) {
                                        final kvx c10 = leb6.c();
                                        c10.getClass();
                                        if (c9.a(c10) >= 0) {
                                            continue;
                                        }
                                    }
                                    leb6 = (leb)p;
                                }
                                if (leb6 != null) {
                                    p = this.p;
                                    final kvx c11 = leb6.c();
                                    c11.getClass();
                                    if (((ldo)p).b(c11.a, u.d())) {
                                        this.u = null;
                                        u.close();
                                        this.b();
                                    }
                                }
                                monitorexit(this);
                                kse = this.o;
                            }
                        }
                    }
                    kse.g();
                }
            }
        }
        finally {
            this.o.g();
            while (true) {}
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (!this.k) {
                this.d.execute(this.n);
            }
        }
    }
    
    public final void c(final kwz kwz, final long n) {
        monitorenter(this);
        try {
            final Iterator iterator = this.i.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final leb leb = (leb)iterator.next();
                if (leb.d() == kwz) {
                    final kvx c = leb.c();
                    if (c == null || c.b != n) {
                        continue;
                    }
                    final krr f = this.f;
                    final String value = String.valueOf(kwz);
                    final long a = c.a;
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 105);
                    sb.append("Distributing null to ");
                    sb.append(value);
                    sb.append(" for frame ");
                    sb.append(n);
                    sb.append(" at ");
                    sb.append(a);
                    sb.append(" because the buffer was lost.");
                    f.h(sb.toString());
                    iterator.remove();
                    leb.k(null);
                    b = true;
                }
            }
            if (!b) {
                final krr f2 = this.f;
                final String value2 = String.valueOf(kwz);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 110);
                sb2.append("Received onBufferLost from ");
                sb2.append(value2);
                sb2.append(" for frame ");
                sb2.append(n);
                sb2.append(" but was unable to find a matching request to abort.");
                f2.h(sb2.toString());
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (this.k) {
                monitorexit(this);
                return;
            }
            this.k = true;
            final lju u = this.u;
            final ArrayList list = new ArrayList();
            final List t = this.t;
            if (t != null) {
                list.addAll(t);
            }
            list.addAll(this.i);
            this.u = null;
            this.t = null;
            this.i.clear();
            monitorexit(this);
            if (u != null) {
                u.close();
            }
            for (int size = list.size(), i = 0; i < size; ++i) {
                ((leb)list.get(i)).k(null);
            }
            this.m.close();
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final String toString() {
        final String i = lio.i(this.a);
        final long q = this.q;
        final StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
        sb.append(i);
        sb.append("-");
        sb.append(q);
        return sb.toString();
    }
}
