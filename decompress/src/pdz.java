import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdz extends AtomicInteger implements owy
{
    private static final long serialVersionUID = -4470634016609963609L;
    final psr[] a;
    final AtomicLongArray b;
    final long[] c;
    final int d;
    final int e;
    pss f;
    ozd g;
    Throwable h;
    volatile boolean i;
    int j;
    volatile boolean k;
    final AtomicInteger l;
    int m;
    int n;
    
    public pdz(final psr[] a, int d) {
        this.l = new AtomicInteger();
        this.a = a;
        this.d = d;
        this.e = d - (d >> 2);
        final int length = a.length;
        d = length + length;
        (this.b = new AtomicLongArray(d + 1)).lazySet(d, length);
        this.c = new long[length];
    }
    
    @Override
    public final void bY(final pss f) {
        if (phe.h(this.f, f)) {
            this.f = f;
            if (f instanceof oza) {
                final oza oza = (oza)f;
                final int k = oza.k();
                if (k == 1) {
                    this.n = 1;
                    this.g = oza;
                    this.i = true;
                    this.f();
                    this.d();
                    return;
                }
                if (k == 2) {
                    this.n = 2;
                    this.g = oza;
                    this.f();
                    f.cb(this.d);
                    return;
                }
            }
            this.g = new pfs(this.d);
            this.f();
            f.cb(this.d);
        }
    }
    
    @Override
    public final void cc() {
        this.i = true;
        this.d();
    }
    
    @Override
    public final void cd(final Throwable h) {
        this.h = h;
        this.i = true;
        this.d();
    }
    
    @Override
    public final void ce(final Object o) {
        if (this.n == 0 && !this.g.j(o)) {
            this.f.a();
            this.cd(new oxx("Queue is full?"));
            return;
        }
        this.d();
    }
    
    final void d() {
        if (this.getAndIncrement() != 0) {
            return;
        }
        Label_0772: {
            if (this.n == 1) {
                final ozd g = this.g;
                final psr[] a = this.a;
                final AtomicLongArray b = this.b;
                final long[] c = this.c;
                final int length = c.length;
                int j = this.j;
                int length2 = 1;
            Label_0051:
                while (true) {
                    int n = 0;
                    int n2 = j;
                    while (!this.k) {
                        if (g.i()) {
                            for (int length3 = a.length, i = 0; i < length3; ++i) {
                                a[i].cc();
                            }
                            break Label_0772;
                        }
                        final long value = b.get(n2);
                        final long n3 = c[n2];
                        int n4 = 0;
                        Label_0268: {
                            if (value != n3 && b.get(length + n2) == 0L) {
                                try {
                                    final Object bw = g.bW();
                                    if (bw == null) {
                                        for (int length4 = a.length, k = 0; k < length4; ++k) {
                                            a[k].cc();
                                        }
                                        break Label_0772;
                                    }
                                    a[n2].ce(bw);
                                    c[n2] = n3 + 1L;
                                    n4 = 0;
                                    break Label_0268;
                                }
                                finally {
                                    final Throwable t;
                                    psn.e(t);
                                    this.f.a();
                                    length2 = a.length;
                                    for (int l = 0; l < length2; ++l) {
                                        a[l].cd(t);
                                    }
                                    break Label_0772;
                                }
                            }
                            n4 = n + 1;
                        }
                        j = ++n2;
                        if (n2 == length) {
                            j = 0;
                        }
                        n2 = j;
                        if ((n = n4) != length) {
                            continue;
                        }
                        n4 = this.get();
                        if (n4 != length2) {
                            length2 = n4;
                            continue Label_0051;
                        }
                        this.j = j;
                        n4 = this.addAndGet(-length2);
                        if ((length2 = n4) == 0) {
                            break Label_0772;
                        }
                        continue Label_0051;
                    }
                    g.bZ();
                    return;
                }
            }
            else {
                final ozd g2 = this.g;
                final psr[] a2 = this.a;
                final AtomicLongArray b2 = this.b;
                final long[] c2 = this.c;
                final int length5 = c2.length;
                int m = this.j;
                int m2 = this.m;
                int n5 = 1;
            Label_0389:
                while (true) {
                    int n6 = 0;
                    while (!this.k) {
                        final boolean i2 = this.i;
                        if (i2) {
                            final Throwable h = this.h;
                            if (h != null) {
                                g2.bZ();
                                for (int length6 = a2.length, n7 = 0; n7 < length6; ++n7) {
                                    a2[n7].cd(h);
                                }
                                break Label_0772;
                            }
                        }
                        final boolean i3 = g2.i();
                        int length8 = 0;
                        Label_0729: {
                            int n11 = 0;
                            Label_0687: {
                                Label_0567: {
                                    if (i2) {
                                        if (i3) {
                                            for (int length7 = a2.length, n8 = 0; n8 < length7; ++n8) {
                                                a2[n8].cc();
                                            }
                                            break Label_0772;
                                        }
                                    }
                                    else if (i3) {
                                        break Label_0567;
                                    }
                                    final long value2 = b2.get(m);
                                    final long n9 = c2[m];
                                    if (value2 == n9 || b2.get(length5 + m) != 0L) {
                                        break Label_0567;
                                    }
                                    try {
                                        final Object bw2 = g2.bW();
                                        if (bw2 == null) {
                                            break Label_0729;
                                        }
                                        a2[m].ce(bw2);
                                        c2[m] = n9 + 1L;
                                        final int n10 = m2 + 1;
                                        if ((n11 = n10) == this.e) {
                                            this.f.cb(n10);
                                            n11 = 0;
                                        }
                                        n6 = 0;
                                        break Label_0687;
                                    }
                                    finally {
                                        psn.e((Throwable)b2);
                                        this.f.a();
                                        for (length8 = a2.length, m = 0; m < length8; ++m) {
                                            a2[m].cd((Throwable)b2);
                                        }
                                        break Label_0772;
                                    }
                                }
                                ++n6;
                                n11 = m2;
                            }
                            if (++m == length5) {
                                m = 0;
                            }
                            length8 = m;
                            m2 = n11;
                            if (n6 != length5) {
                                m2 = n11;
                                continue;
                            }
                        }
                        int n11 = this.get();
                        if (n11 == n5) {
                            this.j = length8;
                            this.m = m2;
                            if ((n11 = this.addAndGet(-n5)) == 0) {
                                break Label_0772;
                            }
                        }
                        m = length8;
                        n5 = n11;
                        continue Label_0389;
                    }
                    g2.bZ();
                    return;
                }
            }
        }
    }
    
    final void f() {
        final psr[] a = this.a;
        int n;
        for (int length = a.length, i = 0; i < length; i = n) {
            if (this.k) {
                return;
            }
            n = i + 1;
            this.l.lazySet(n);
            a[i].bY(new pdy(this, i, length));
        }
    }
}
