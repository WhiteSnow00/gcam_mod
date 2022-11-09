import java.util.concurrent.Callable;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class pcs extends AtomicInteger implements oxp, oxg
{
    static final pcr[] a;
    static final pcr[] b;
    private static final long serialVersionUID = -2117620485640801370L;
    final oxg c;
    final boolean d;
    final int e;
    final int f;
    volatile ozc g;
    volatile boolean h;
    final phg i;
    volatile boolean j;
    final AtomicReference k;
    oxp l;
    long m;
    long n;
    int o;
    final Queue p;
    int q;
    
    static {
        a = new pcr[0];
        b = new pcr[0];
    }
    
    public pcs(final oxg c, final int f) {
        this.i = new phg();
        this.c = c;
        this.d = false;
        this.e = 2;
        this.f = f;
        this.p = new ArrayDeque(2);
        this.k = new AtomicReference((V)(Object)pcs.a);
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.h) {
            pip.g(t);
            return;
        }
        if (phi.c(this.i, t)) {
            this.h = true;
            this.f();
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void bU() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f();
    }
    
    @Override
    public final void bV(final oxp l) {
        if (oyj.f(this.l, l)) {
            this.l = l;
            this.c.bV(this);
        }
    }
    
    @Override
    public final void bX() {
        if (!this.j) {
            this.j = true;
            if (this.k()) {
                final Throwable b = phi.b(this.i);
                if (b != null && b != phi.a) {
                    pip.g(b);
                }
            }
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void e(final Object o) {
        if (!this.h) {
            try {
                final oxf oxf = (oxf)o;
                phn.g(oxf, "The mapper returned a null ObservableSource");
                synchronized (this) {
                    final int q = this.q;
                    if (q != this.e) {
                        this.q = q + 1;
                        monitorexit(this);
                        this.i(oxf);
                        return;
                    }
                    this.p.offer(oxf);
                }
            }
            finally {
                final Throwable t;
                psn.e(t);
                this.l.bX();
                this.b(t);
            }
        }
    }
    
    final void f() {
        if (this.getAndIncrement() == 0) {
            this.g();
        }
    }
    
    final void g() {
        final oxg c = this.c;
        int addAndGet = 1;
        while (!this.j()) {
            final ozc g = this.g;
            Label_0059: {
                if (g != null) {
                    while (!this.j()) {
                        final Object bw = g.bW();
                        if (bw == null) {
                            break Label_0059;
                        }
                        c.e(bw);
                    }
                    return;
                }
            }
            final boolean h = this.h;
            final ozc g2 = this.g;
            final pcr[] array = this.k.get();
            final int length = array.length;
            monitorenter(this);
            try {
                final int size = this.p.size();
                monitorexit(this);
                if (h && (g2 == null || g2.i()) && length == 0 && size == 0) {
                    final Throwable b = phi.b(this.i);
                    if (b != phi.a) {
                        if (b == null) {
                            c.bU();
                            return;
                        }
                        c.b(b);
                    }
                    return;
                }
                int n = 0;
                if (length != 0) {
                    final long n2 = this.n;
                    final int o = this.o;
                    int n3 = 0;
                    Label_0296: {
                        if (length > o) {
                            n3 = o;
                            if (array[o].a == n2) {
                                break Label_0296;
                            }
                        }
                        int o2;
                        if (length <= (o2 = o)) {
                            o2 = 0;
                        }
                        for (int n4 = 0; n4 < length && array[o2].a != n2; ++n4) {
                            if (++o2 == length) {
                                o2 = 0;
                            }
                        }
                        this.o = o2;
                        this.n = array[o2].a;
                        n3 = o2;
                    }
                    int i = 0;
                    n = 0;
                    int o3 = n3;
                    while (i < length) {
                        if (this.j()) {
                            return;
                        }
                        final pcr pcr = array[o3];
                        final ozd d = pcr.d;
                        int n6 = 0;
                        Label_0528: {
                            Label_0442: {
                                if (d != null) {
                                    try {
                                        do {
                                            final Object bw2 = d.bW();
                                            if (bw2 == null) {
                                                break Label_0442;
                                            }
                                            c.e(bw2);
                                        } while (!this.j());
                                        return;
                                    }
                                    finally {
                                        final Throwable t;
                                        psn.e(t);
                                        oyj.g(pcr);
                                        phi.c(this.i, t);
                                        if (this.j()) {
                                            return;
                                        }
                                        this.h(pcr);
                                        final int n5 = n + 1;
                                        n = ++o3;
                                        n6 = n5;
                                        if (o3 == length) {
                                            n = 0;
                                            n6 = n5;
                                        }
                                        break Label_0528;
                                    }
                                }
                            }
                            final boolean c2 = pcr.c;
                            final ozd d2 = pcr.d;
                            int n7;
                            if (c2 && (d2 == null || d2.i())) {
                                this.h(pcr);
                                if (this.j()) {
                                    return;
                                }
                                n7 = n + 1;
                            }
                            else {
                                n7 = n;
                            }
                            n = ++o3;
                            n6 = n7;
                            if (o3 == length) {
                                n = 0;
                                n6 = n7;
                            }
                        }
                        ++i;
                        o3 = n;
                        n = n6;
                    }
                    this.o = o3;
                    this.n = array[o3].a;
                }
                int j;
                if ((j = n) == 0) {
                    if ((addAndGet = this.addAndGet(-addAndGet)) == 0) {
                        return;
                    }
                    continue;
                }
                else {
                    while (j != 0) {
                        synchronized (this) {
                            final oxf oxf = this.p.poll();
                            if (oxf == null) {
                                --this.q;
                                monitorexit(this);
                            }
                            else {
                                monitorexit(this);
                                this.i(oxf);
                            }
                            --j;
                        }
                    }
                }
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
    
    final void h(final pcr pcr) {
        pcr[] array;
        pcr[] a = null;
    Label_0103:
        do {
            array = this.k.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        final int n = i;
                        if (array[i] != pcr) {
                            ++i;
                        }
                        else {
                            if (n < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = pcs.a;
                                continue Label_0103;
                            }
                            a = new pcr[length - 1];
                            System.arraycopy(array, 0, a, 0, n);
                            System.arraycopy(array, n + 1, a, n, length - n - 1);
                            continue Label_0103;
                        }
                    }
                    final int n = -1;
                    continue;
                }
            }
        } while (!this.k.compareAndSet(array, a));
    }
    
    final void i(oxf o) {
        while (true) {
            final boolean b = o instanceof Callable;
            boolean b2 = false;
            if (b) {
                final Callable callable = (Callable)o;
                Label_0160: {
                    try {
                        final Object call = callable.call();
                        if (call != null) {
                            if (this.get() == 0 && this.compareAndSet(0, 1)) {
                                this.c.e(call);
                                if (this.decrementAndGet() == 0) {
                                    break Label_0160;
                                }
                            }
                            else {
                                ozc g;
                                if ((g = this.g) == null) {
                                    g = new pfs(this.e);
                                    this.g = g;
                                }
                                if (!g.j(call)) {
                                    this.b(new IllegalStateException("Scalar queue full?!"));
                                    break Label_0160;
                                }
                                if (this.getAndIncrement() != 0) {
                                    return;
                                }
                            }
                            this.g();
                        }
                    }
                    finally {
                        final Throwable t;
                        psn.e(t);
                        phi.c(this.i, t);
                        this.f();
                    }
                }
                synchronized (this) {
                    o = this.p.poll();
                    if (o == null) {
                        --this.q;
                        b2 = true;
                    }
                    monitorexit(this);
                    if (!b2) {
                        continue;
                    }
                    this.f();
                    return;
                }
                break;
            }
            break;
        }
        final long m = this.m;
        this.m = 1L + m;
        final pcr pcr = new pcr(this, m);
        while (true) {
            final pcr[] array = this.k.get();
            if (array == pcs.b) {
                oyj.g(pcr);
                return;
            }
            final int length = array.length;
            final pcr[] array2 = new pcr[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = pcr;
            if (this.k.compareAndSet(array, array2)) {
                ((oxf)o).f(pcr);
            }
        }
    }
    
    final boolean j() {
        if (this.j) {
            return true;
        }
        if (this.i.get() != null) {
            this.k();
            final Throwable b = phi.b(this.i);
            if (b != phi.a) {
                this.c.b(b);
            }
            return true;
        }
        return false;
    }
    
    final boolean k() {
        this.l.bX();
        final pcr[] array = this.k.get();
        final pcr[] b = pcs.b;
        int i = 0;
        if (array != b) {
            final pcr[] array2 = this.k.getAndSet(b);
            if (array2 != b) {
                while (i < array2.length) {
                    oyj.g(array2[i]);
                    ++i;
                }
                return true;
            }
        }
        return false;
    }
}
