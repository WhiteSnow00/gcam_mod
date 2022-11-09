import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nhe
{
    public final nhb a;
    public final AtomicLong b;
    public final AtomicReference c;
    public final ofn d;
    private final AtomicReference e;
    private final Executor f;
    
    public nhe(final odo odo, final Executor executor) {
        this.b = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
        this.c = new AtomicReference(null);
        this.e = new AtomicReference(null);
        this.f = ofi.e(odx.a);
        (this.d = ofn.f()).d(this.a = new nhb(odo, executor), odx.a);
    }
    
    public static int a(final long n) {
        return (int)(n >>> 32);
    }
    
    public static long b(final int n, final int n2) {
        return ((long)n2 & 0xFFFFFFFFL) | (long)n << 32;
    }
    
    public final oey c() {
        if (!this.d.isDone()) {
            long value;
            int a;
            do {
                value = this.b.get();
                a = a(value);
            } while (!this.b.compareAndSet(value, b(a, (int)value + 1)));
            final ofn f = ofn.f();
            final oey oey = this.e.getAndSet(f);
            oey oey2;
            if (oey == null) {
                oey2 = ofi.r(nhu.a(new ngy(this, a)), odx.a);
            }
            else {
                oey2 = oco.i(oey, Throwable.class, nhu.b(new ngz(this, a)), this.f);
            }
            f.e(oey2);
            final nhc nhc = new nhc(this, a);
            f.d(new nha(this, f, nhc), odx.a);
            return nhc;
        }
        return this.d;
    }
    
    public final oey d(final int n) {
        if (a(this.b.get()) > n) {
            return ofi.l();
        }
        final nhd nhd = new nhd(n);
        nhd nhd2;
        do {
            nhd2 = this.c.get();
            if (nhd2 != null && nhd2.a > n) {
                return ofi.l();
            }
        } while (!this.c.compareAndSet(nhd2, nhd));
        if (a(this.b.get()) > n) {
            nhd.cancel(true);
            this.c.compareAndSet(nhd, null);
            return nhd;
        }
        final nhb a = this.a;
        final odo a2 = a.a;
        final Executor b = a.b;
        if (a2 != null && b != null) {
            nhd.e(ofi.r(nhu.a(a2), b));
        }
        else {
            nhd.e(this.d);
        }
        return nhd;
    }
}
