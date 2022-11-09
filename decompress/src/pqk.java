import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqk extends Thread
{
    public final pqu a;
    public final pnd b;
    public boolean c;
    final /* synthetic */ pql d;
    public int e;
    private long f;
    private long g;
    private int h;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    
    public pqk(final pql d, final int n) {
        this.d = d;
        this.setDaemon(true);
        this.a = new pqu();
        this.e = 4;
        this.b = plv.h();
        this.nextParkedWorker = pql.a;
        final pma b = pma.b;
        final Random value = ((plw)pma.b).a.get();
        value.getClass();
        this.h = value.nextInt();
        this.c(n);
    }
    
    private final pqq e() {
        if (this.a(2) == 0) {
            final pqq pqq = (pqq)this.d.i.b();
            if (pqq != null) {
                return pqq;
            }
            return (pqq)this.d.j.b();
        }
        else {
            final pqq pqq2 = (pqq)this.d.j.b();
            if (pqq2 != null) {
                return pqq2;
            }
            return (pqq)this.d.i.b();
        }
    }
    
    private final pqq f(final boolean b) {
        final boolean a = pod.a;
        final int a2 = this.d.a();
        if (a2 < 2) {
            return null;
        }
        int a3 = this.a(a2);
        int i = 0;
        long min = Long.MAX_VALUE;
        while (i < a2) {
            if (++a3 > a2) {
                a3 = 1;
            }
            final pqk pqk = this.d.c.get(a3);
            if (pqk != null && pqk != this) {
                long n2 = 0L;
                Label_0308: {
                    if (b) {
                        final pqu a4 = this.a;
                        final pqu a5 = pqk.a;
                        a5.getClass();
                        int j = a5.d.a;
                        final int a6 = a5.c.a;
                        final AtomicReferenceArray a7 = a5.a;
                        while (j != a6) {
                            final int n = j & 0x7F;
                            if (a5.e.a == 0) {
                                break;
                            }
                            final pqq pqq = a7.get(n);
                            if (pqq != null && pqq.h.j() == 1 && a7.compareAndSet(n, pqq, null)) {
                                a5.e.a();
                                pqu.f(a4, pqq);
                                n2 = -1L;
                                break Label_0308;
                            }
                            ++j;
                        }
                        n2 = a4.b(a5, true);
                    }
                    else {
                        final pqu a8 = this.a;
                        final pqu a9 = pqk.a;
                        a9.getClass();
                        final pqq e = a9.e();
                        if (e != null) {
                            pqu.f(a8, e);
                            n2 = -1L;
                        }
                        else {
                            n2 = a8.b(a9, false);
                        }
                    }
                }
                if (n2 == -1L) {
                    return this.a.d();
                }
                if (n2 > 0L) {
                    min = Math.min(min, n2);
                }
            }
            ++i;
        }
        if (min == Long.MAX_VALUE) {
            min = 0L;
        }
        this.g = min;
        return null;
    }
    
    private final boolean g() {
        return this.nextParkedWorker != pql.a;
    }
    
    public final int a(final int n) {
        final int h = this.h;
        final int n2 = h ^ h << 13;
        final int n3 = n2 ^ n2 >> 17;
        final int h2 = n3 ^ n3 << 5;
        this.h = h2;
        final int n4 = n - 1;
        if ((n4 & n) == 0x0) {
            return h2 & n4;
        }
        return (h2 & Integer.MAX_VALUE) % n;
    }
    
    public final pqq b(final boolean b) {
        if (this.e != 1) {
            final pql d = this.d;
            final pne d2 = d.d;
            long b2;
            do {
                b2 = d2.b;
                if ((int)((0x7FFFFC0000000000L & b2) >> 42) == 0) {
                    pqq d3;
                    if (b) {
                        if ((d3 = this.a.d()) == null) {
                            d3 = (pqq)this.d.j.b();
                        }
                    }
                    else {
                        d3 = (pqq)this.d.j.b();
                    }
                    if (d3 != null) {
                        return d3;
                    }
                    return this.f(true);
                }
            } while (!d.d.b(b2, -4398046511104L + b2));
            this.e = 1;
        }
        pqq pqq;
        if (b) {
            final int e = this.d.e;
            final int a = this.a(e + e);
            if (a == 0) {
                pqq = this.e();
                if (pqq != null) {
                    return pqq;
                }
            }
            pqq = this.a.d();
            if (pqq == null) {
                if (a == 0) {
                    return this.f(false);
                }
                pqq = this.e();
                if (pqq == null) {
                    return this.f(false);
                }
            }
        }
        else {
            pqq = this.e();
            if (pqq == null) {
                return this.f(false);
            }
        }
        return pqq;
    }
    
    public final void c(final int indexInArray) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.d.h);
        sb.append("-worker-");
        String value;
        if (indexInArray == 0) {
            value = "TERMINATED";
        }
        else {
            value = String.valueOf(indexInArray);
        }
        sb.append(value);
        this.setName(sb.toString());
        this.indexInArray = indexInArray;
    }
    
    public final boolean d(final int e) {
        final int e2 = this.e;
        boolean b = true;
        if (e2 != 1) {
            b = false;
        }
        if (b) {
            this.d.d.a(4398046511104L);
        }
        if (e2 != e) {
            this.e = e;
        }
        return b;
    }
    
    @Override
    public final void run() {
        int n = 0;
        while (!this.d.e() && this.e != 5) {
            final pqq b = this.b(this.c);
            if (b != null) {
                this.g = 0L;
                final int j = b.h.j();
                this.f = 0L;
                if (this.e == 3) {
                    final boolean a = pod.a;
                    this.e = 2;
                }
                if (j != 0) {
                    if (this.d(2)) {
                        this.d.d();
                    }
                }
                pql.g(b);
                if (j == 0) {
                    n = 0;
                }
                else {
                    this.d.d.a(-2097152L);
                    if (this.e != 5) {
                        final boolean a2 = pod.a;
                        this.e = 4;
                    }
                    n = 0;
                }
            }
            else {
                this.c = false;
                if (this.g != 0L) {
                    if (n == 0) {
                        n = 1;
                    }
                    else {
                        this.d(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.g);
                        this.g = 0L;
                        n = 0;
                    }
                }
                else if (!this.g()) {
                    final pql d = this.d;
                    if (this.nextParkedWorker != pql.a) {
                        continue;
                    }
                    final pne b2 = d.b;
                    long b3;
                    int indexInArray;
                    do {
                        b3 = b2.b;
                        indexInArray = this.indexInArray;
                        final boolean a3 = pod.a;
                        this.nextParkedWorker = d.c.get((int)(b3 & 0x1FFFFFL));
                    } while (!d.b.b(b3, (long)indexInArray | (2097152L + b3 & 0xFFFFFFFFFFE00000L)));
                }
                else {
                    final boolean a4 = pod.a;
                    final pnd b4 = this.b;
                    final int a5 = png.a;
                    b4.a = -1;
                    while (this.g() && this.b.a == -1 && !this.d.e() && this.e != 5) {
                        this.d(3);
                        Thread.interrupted();
                        if (this.f == 0L) {
                            this.f = System.nanoTime() + this.d.g;
                        }
                        LockSupport.parkNanos(this.d.g);
                        if (System.nanoTime() - this.f >= 0L) {
                            this.f = 0L;
                            synchronized (this.d.c) {
                                if (this.d.e()) {
                                    continue;
                                }
                                if (this.d.a() <= this.d.e) {
                                    continue;
                                }
                                if (!this.b.c(-1, 1)) {
                                    continue;
                                }
                                final int indexInArray2 = this.indexInArray;
                                this.c(0);
                                this.d.c(this, indexInArray2, 0);
                                final int n2 = (int)(pne.a.getAndDecrement(this.d.d) & 0x1FFFFFL);
                                if (n2 != indexInArray2) {
                                    final Object value = this.d.c.get(n2);
                                    value.getClass();
                                    final pqk pqk = (pqk)value;
                                    this.d.c.set(indexInArray2, pqk);
                                    pqk.c(indexInArray2);
                                    this.d.c(pqk, n2, indexInArray2);
                                }
                                this.d.c.set(n2, null);
                                monitorexit(this.d.c);
                                this.e = 5;
                            }
                        }
                    }
                }
            }
        }
        this.d(5);
    }
}
