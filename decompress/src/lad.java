import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lad
{
    public final krr a;
    private final kxw b;
    private final kzo c;
    private final kzq d;
    private final kse e;
    private final Deque f;
    private final Deque g;
    private boolean h;
    private boolean i;
    private Runnable j;
    
    public lad(final kxw b, final kzo c, final kzq d, final kjk kjk, final krr krr, final kse e) {
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
        this.h = false;
        this.i = false;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = krr.a("PendingFrameQueue");
        kjk.c(new lab(this));
    }
    
    private final kzp h(final kzl kzl) {
        final kzq d = this.d;
        final nog d2 = noi.D();
        final Iterator<Object> iterator = kzl.c.iterator();
        while (iterator.hasNext()) {
            d2.g(ldn.f(iterator.next()));
        }
        final kzp n = kzp.n(d, kzl, d2.f());
        n.f();
        return n;
    }
    
    final Set a() {
        synchronized (this) {
            if (!this.g.isEmpty() && !this.i) {
                final Set set = this.g.removeFirst();
                this.e();
                return set;
            }
            return null;
        }
    }
    
    public final void b(final Set set, final Set set2) {
        monitorenter(this);
        try {
            if (this.i) {
                for (final kzp kzp : set2) {
                    kzp.f();
                    kzp.g();
                }
                final nrv bn = ((nqy)set).bN();
                while (bn.hasNext()) {
                    final laa laa = bn.next();
                    for (final kzp kzp2 : set2) {
                        if (kzp2.c == laa.a) {
                            laa.k(kzp2);
                        }
                    }
                }
                monitorexit(this);
                return;
            }
            this.e.f("onRequestAllocated");
            final nrv bn2 = ((nqy)set).bN();
            while (bn2.hasNext()) {
                final laa laa2 = bn2.next();
                for (final kzp kzp3 : set2) {
                    if (kzp3.c == laa2.a) {
                        laa2.k(kzp3);
                    }
                }
            }
            this.g.add(set2);
            this.e.g();
            if (!this.g.isEmpty() && !this.i && this.j != null) {
                this.e.f("invokeSubmitListener");
                this.j.run();
                this.e.g();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final Runnable j) {
        synchronized (this) {
            njo.o(this.j == null);
            njo.o(this.g.isEmpty());
            njo.o(this.i ^ true);
            this.j = j;
        }
    }
    
    public final void d() {
        monitorenter(this);
        try {
            if (this.i) {
                monitorexit(this);
                return;
            }
            this.i = true;
            for (final laa laa : this.f) {
                laa.k(this.h(laa.a));
            }
            this.f.clear();
            final Iterator iterator2 = this.g.iterator();
            while (iterator2.hasNext()) {
                for (final kzp kzp : (Set)iterator2.next()) {
                    kzp.f();
                    kzp.g();
                }
            }
            this.g.clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e() {
        synchronized (this) {
            if (!this.h && !this.f.isEmpty() && this.g.isEmpty() && !this.i) {
                this.e.f("allocate#FrameStream(s)");
                final laa laa = this.f.removeFirst();
                laa.getClass();
                final noi h = noi.H(laa);
                final noi h2 = noi.H(laa.a);
                this.h = true;
                ofi.w(this.b.b(h2), new lac(this, h, h2), odx.a);
                this.e.g();
            }
        }
    }
    
    public final kvs g(final kzl kzl) {
        synchronized (this) {
            this.e.f("submit#FrameStream");
            final kzo c = this.c;
            final boolean b = kzl instanceof kzl;
            boolean b2 = false;
            if (b && c.b.contains(kzl)) {
                b2 = true;
            }
            njo.d(b2);
            final laa laa = new laa(kzl);
            if (!this.i) {
                this.f.addLast(laa);
                this.e();
            }
            else {
                laa.k(this.h(kzl));
            }
            this.e.g();
            return laa;
        }
    }
}
