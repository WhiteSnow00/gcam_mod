import java.util.concurrent.atomic.AtomicReferenceArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqu
{
    public final AtomicReferenceArray a;
    public final pnf b;
    public final pnd c;
    public final pnd d;
    public final pnd e;
    
    public pqu() {
        this.a = new AtomicReferenceArray(128);
        this.b = plv.g(null);
        this.c = plv.h();
        this.d = plv.h();
        this.e = plv.h();
    }
    
    public static /* synthetic */ void f(final pqu pqu, final pqq pqq) {
        pqu.c(pqq, false);
    }
    
    private final pqq g(final pqq pqq) {
        if (pqq.h.j() == 1) {
            this.e.b();
        }
        if (this.a() == 127) {
            return pqq;
        }
        final int n = this.c.a & 0x7F;
        while (this.a.get(n) != null) {
            Thread.yield();
        }
        this.a.lazySet(n, pqq);
        this.c.b();
        return null;
    }
    
    public final int a() {
        return this.c.a - this.d.a;
    }
    
    public final long b(final pqu pqu, final boolean b) {
        pqq pqq;
        do {
            pqq = (pqq)pqu.b.a;
            if (pqq == null) {
                return -2L;
            }
            if (b && pqq.h.j() != 1) {
                return -2L;
            }
            final long a = pqt.a;
            final long n = System.nanoTime() - pqq.g;
            if (n < pqt.a) {
                return pqt.a - n;
            }
        } while (!pqu.b.c(pqq, null));
        f(this, pqq);
        return -1L;
    }
    
    public final pqq c(pqq pqq, final boolean b) {
        pqq.getClass();
        if (b) {
            return this.g(pqq);
        }
        pqq = (pqq)this.b.a(pqq);
        if (pqq != null) {
            return this.g(pqq);
        }
        return null;
    }
    
    public final pqq d() {
        final pqq pqq = (pqq)this.b.a(null);
        if (pqq != null) {
            return pqq;
        }
        return this.e();
    }
    
    public final pqq e() {
        while (true) {
            final int a = this.d.a;
            if (a - this.c.a == 0) {
                return null;
            }
            if (!this.d.c(a, a + 1)) {
                continue;
            }
            final pqq pqq = this.a.getAndSet(a & 0x7F, null);
            if (pqq != null) {
                if (pqq.h.j() == 1) {
                    this.e.a();
                    final boolean a2 = pod.a;
                }
                return pqq;
            }
        }
    }
}
