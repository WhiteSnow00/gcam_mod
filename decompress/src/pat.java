import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class pat extends AtomicInteger implements owy, pss
{
    static final pas[] a;
    static final pas[] b;
    private static final long serialVersionUID = -2117620485640801370L;
    final psr c;
    final oyf d;
    final int e;
    final int f;
    volatile ozc g;
    volatile boolean h;
    final phg i;
    volatile boolean j;
    final AtomicReference k;
    final AtomicLong l;
    pss m;
    long n;
    long o;
    int p;
    int q;
    final int r;
    
    static {
        a = new pas[0];
        b = new pas[0];
    }
    
    public pat(final psr c, final oyf d, final int e, final int f) {
        this.i = new phg();
        final AtomicReference k = new AtomicReference();
        this.k = k;
        this.l = new AtomicLong();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.r = Math.max(1, e >> 1);
        k.lazySet(pat.a);
    }
    
    @Override
    public final void a() {
        if (!this.j) {
            this.j = true;
            this.m.a();
            final pas[] array = this.k.get();
            final pas[] b = pat.b;
            if (array != b) {
                final pas[] array2 = this.k.getAndSet(b);
                if (array2 != b) {
                    for (int length = array2.length, i = 0; i < length; ++i) {
                        phe.i(array2[i]);
                    }
                    final Throwable b2 = phi.b(this.i);
                    if (b2 != null && b2 != phi.a) {
                        pip.g(b2);
                    }
                }
            }
            if (this.getAndIncrement() == 0) {
                final ozc g = this.g;
                if (g != null) {
                    g.bZ();
                }
            }
        }
    }
    
    @Override
    public final void bY(final pss m) {
        if (phe.h(this.m, m)) {
            this.m = m;
            this.c.bY(this);
            if (!this.j) {
                final int e = this.e;
                if (e == Integer.MAX_VALUE) {
                    m.cb(Long.MAX_VALUE);
                    return;
                }
                m.cb(e);
            }
        }
    }
    
    @Override
    public final void cb(final long n) {
        if (phe.g(n)) {
            phn.b(this.l, n);
            this.h();
        }
    }
    
    @Override
    public final void cc() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.h();
    }
    
    @Override
    public final void cd(final Throwable t) {
        if (this.h) {
            pip.g(t);
            return;
        }
        if (phi.c(this.i, t)) {
            this.h = true;
            this.h();
            return;
        }
        pip.g(t);
    }
    
    @Override
    public final void ce(final Object o) {
        if (this.h) {
            return;
        }
        try {
            final psq psq = (psq)this.d.a(o);
            phn.g(psq, "The mapper returned a null Publisher");
            if (psq instanceof Callable) {
                try {
                    final Object call = ((Callable<Object>)psq).call();
                    if (call != null) {
                        if (this.get() == 0 && this.compareAndSet(0, 1)) {
                            final long value = this.l.get();
                            final ozc g = this.g;
                            if (value != 0L && (g == null || g.i())) {
                                this.c.ce(call);
                                if (value != Long.MAX_VALUE) {
                                    this.l.decrementAndGet();
                                }
                                if (this.e != Integer.MAX_VALUE && !this.j) {
                                    final int q = this.q + 1;
                                    this.q = q;
                                    final int r = this.r;
                                    if (q == r) {
                                        this.q = 0;
                                        this.m.cb(r);
                                    }
                                }
                            }
                            else {
                                ozd f;
                                if ((f = g) == null) {
                                    f = this.f();
                                }
                                if (!f.j(call)) {
                                    this.cd(new IllegalStateException("Scalar queue full?!"));
                                    return;
                                }
                            }
                            if (this.decrementAndGet() == 0) {
                                return;
                            }
                        }
                        else {
                            if (!this.f().j(call)) {
                                this.cd(new IllegalStateException("Scalar queue full?!"));
                                return;
                            }
                            if (this.getAndIncrement() != 0) {
                                return;
                            }
                        }
                        this.i();
                        return;
                    }
                    if (this.e != Integer.MAX_VALUE && !this.j) {
                        final int q2 = this.q + 1;
                        this.q = q2;
                        final int r2 = this.r;
                        if (q2 == r2) {
                            this.q = 0;
                            this.m.cb(r2);
                        }
                    }
                    return;
                }
                finally {
                    final Throwable t;
                    psn.e(t);
                    phi.c(this.i, t);
                    this.h();
                    return;
                }
            }
            final long n = this.n;
            this.n = 1L + n;
            final pas pas = new pas(this, n);
            pas[] array;
            pas[] array2;
            do {
                array = this.k.get();
                if (array == pat.b) {
                    phe.i(pas);
                    return;
                }
                final int length = array.length;
                array2 = new pas[length + 1];
                System.arraycopy(array, 0, array2, 0, length);
                array2[length] = pas;
            } while (!this.k.compareAndSet(array, array2));
            psq.j(pas);
        }
        finally {
            final Throwable t2;
            psn.e(t2);
            this.m.a();
            this.cd(t2);
        }
    }
    
    final ozd f() {
        ozc g = this.g;
        if (g == null) {
            final int e = this.e;
            if (e == Integer.MAX_VALUE) {
                g = new pft(this.f);
            }
            else {
                g = new pfs(e);
            }
            this.g = g;
        }
        return g;
    }
    
    final void g() {
        final ozc g = this.g;
        if (g != null) {
            g.bZ();
        }
    }
    
    final void h() {
        if (this.getAndIncrement() == 0) {
            this.i();
        }
    }
    
    final void i() {
        final psr c = this.c;
        int addAndGet = 1;
        while (!this.k()) {
            final ozc g = this.g;
            final long value = this.l.get();
            int n2;
            long n4;
            long n5;
            if (g != null) {
                long addAndGet2 = value;
                long n = 0L;
                while (true) {
                    n2 = addAndGet;
                    long n3 = 0L;
                    Object bw = null;
                    while (addAndGet2 != 0L) {
                        bw = g.bW();
                        if (this.k()) {
                            return;
                        }
                        if (bw == null) {
                            break;
                        }
                        c.ce(bw);
                        ++n;
                        ++n3;
                        --addAndGet2;
                    }
                    if (n3 != 0L) {
                        if (value == Long.MAX_VALUE) {
                            addAndGet2 = Long.MAX_VALUE;
                        }
                        else {
                            addAndGet2 = this.l.addAndGet(-n3);
                        }
                    }
                    if (addAndGet2 == 0L) {
                        n4 = addAndGet2;
                        n5 = n;
                        break;
                    }
                    if (bw == null) {
                        n4 = addAndGet2;
                        n5 = n;
                        break;
                    }
                    addAndGet = n2;
                }
            }
            else {
                n4 = value;
                n5 = 0L;
                n2 = addAndGet;
            }
            final boolean h = this.h;
            final ozc g2 = this.g;
            final pas[] array = this.k.get();
            final int length = array.length;
            if (h && (g2 == null || g2.i()) && length == 0) {
                final Throwable b = phi.b(this.i);
                if (b != phi.a) {
                    if (b == null) {
                        c.cc();
                        return;
                    }
                    c.cd(b);
                }
                return;
            }
            int n8;
            if (length != 0) {
                final long o = this.o;
                final int p = this.p;
                int p2 = 0;
                Label_0400: {
                    if (length > p) {
                        p2 = p;
                        if (array[p].a == o) {
                            break Label_0400;
                        }
                    }
                    if (length <= (p2 = p)) {
                        p2 = 0;
                    }
                    for (int n6 = 0; n6 < length && array[p2].a != o; ++n6) {
                        if (++p2 == length) {
                            p2 = 0;
                        }
                    }
                    this.p = p2;
                    this.o = array[p2].a;
                }
                final int n7 = 0;
                int i = 0;
                long addAndGet3 = n4;
                int p3 = p2;
                n8 = n7;
            Label_0799:
                while (i < length) {
                    if (this.k()) {
                        return;
                    }
                    final pas pas = array[p3];
                    final Throwable t = null;
                    while (!this.k()) {
                        final ozd f = pas.f;
                        int n11 = 0;
                        int n12 = 0;
                        long n13 = 0L;
                        Label_0783: {
                            long n9;
                            if (f == null) {
                                n9 = addAndGet3;
                            }
                            else {
                                long n10 = 0L;
                                while (addAndGet3 != 0L) {
                                    try {
                                        final Object bw2 = f.bW();
                                        if (bw2 != null) {
                                            c.ce(bw2);
                                            if (this.k()) {
                                                return;
                                            }
                                            --addAndGet3;
                                            ++n10;
                                            continue;
                                        }
                                    }
                                    finally {
                                        psn.e(t);
                                        phe.i(pas);
                                        phi.c(this.i, t);
                                        this.m.a();
                                        if (this.k()) {
                                            return;
                                        }
                                        this.j(pas);
                                        n11 = i + 1;
                                        n12 = 1;
                                        n13 = n5;
                                        break Label_0783;
                                    }
                                    break;
                                }
                                if (n10 != 0L) {
                                    if (value != Long.MAX_VALUE) {
                                        addAndGet3 = this.l.addAndGet(-n10);
                                    }
                                    else {
                                        addAndGet3 = Long.MAX_VALUE;
                                    }
                                    pas.f(n10);
                                }
                                n9 = addAndGet3;
                                if (addAndGet3 != 0L) {
                                    if (t != null) {
                                        continue;
                                    }
                                    n9 = addAndGet3;
                                }
                            }
                            final boolean e = pas.e;
                            final ozd f2 = pas.f;
                            if (e) {
                                if (f2 == null || f2.i()) {
                                    this.j(pas);
                                    if (this.k()) {
                                        return;
                                    }
                                    ++n5;
                                    n8 = 1;
                                }
                            }
                            if (n9 == 0L) {
                                break Label_0799;
                            }
                            final int n14 = p3 + 1;
                            n12 = n8;
                            p3 = n14;
                            n11 = i;
                            addAndGet3 = n9;
                            n13 = n5;
                            if (n14 == length) {
                                p3 = 0;
                                n13 = n5;
                                addAndGet3 = n9;
                                n11 = i;
                                n12 = n8;
                            }
                        }
                        i = n11 + 1;
                        n8 = n12;
                        n5 = n13;
                        continue Label_0799;
                    }
                    return;
                }
                this.p = p3;
                this.o = array[p3].a;
            }
            else {
                n8 = 0;
            }
            if (n5 != 0L && !this.j) {
                this.m.cb(n5);
            }
            if (n8 == 0) {
                if ((addAndGet = this.addAndGet(-n2)) == 0) {
                    return;
                }
                continue;
            }
            else {
                addAndGet = n2;
            }
        }
    }
    
    final void j(final pas pas) {
        pas[] array;
        pas[] a = null;
    Label_0103:
        do {
            array = this.k.get();
            final int length = array.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    while (i < length) {
                        final int n = i;
                        if (array[i] != pas) {
                            ++i;
                        }
                        else {
                            if (n < 0) {
                                return;
                            }
                            if (length == 1) {
                                a = pat.a;
                                continue Label_0103;
                            }
                            a = new pas[length - 1];
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
    
    final boolean k() {
        if (this.j) {
            this.g();
            return true;
        }
        if (this.i.get() != null) {
            this.g();
            final Throwable b = phi.b(this.i);
            if (b != phi.a) {
                this.c.cd(b);
            }
            return true;
        }
        return false;
    }
}
