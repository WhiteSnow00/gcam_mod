import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pft implements ozc
{
    static final int a;
    private static final Object j;
    final AtomicLong b;
    final int c;
    long d;
    final int e;
    AtomicReferenceArray f;
    final int g;
    AtomicReferenceArray h;
    final AtomicLong i;
    
    static {
        a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
        j = new Object();
    }
    
    public pft(int a) {
        this.b = new AtomicLong();
        this.i = new AtomicLong();
        a = phn.a(Math.max(8, a));
        final int n = a - 1;
        final AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(a + 1);
        this.f = atomicReferenceArray;
        this.e = n;
        this.c = Math.min(a / 4, pft.a);
        this.h = atomicReferenceArray;
        this.g = n;
        this.d = n - 1;
        this.d(0L);
    }
    
    private final void a(final long n) {
        this.i.lazySet(n);
    }
    
    private final void d(final long n) {
        this.b.lazySet(n);
    }
    
    private final void e(final AtomicReferenceArray atomicReferenceArray, final Object o, final long n, final int n2) {
        atomicReferenceArray.lazySet(n2, o);
        this.d(n + 1L);
    }
    
    @Override
    public final Object bW() {
        final AtomicReferenceArray h = this.h;
        final long value = this.i.get();
        int g = this.g;
        final int n = (int)value & g;
        final Object value2 = h.get(n);
        final Object j = pft.j;
        if (value2 != null) {
            if (value2 != j) {
                h.lazySet(n, null);
                this.a(value + 1L);
                return value2;
            }
        }
        else if (j != null) {
            return null;
        }
        ++g;
        final AtomicReferenceArray h2 = h.get(g);
        h.lazySet(g, null);
        this.h = h2;
        final Object value3 = h2.get(n);
        if (value3 != null) {
            h2.lazySet(n, null);
            this.a(value + 1L);
        }
        return value3;
    }
    
    @Override
    public final void bZ() {
        while (this.bW() != null || !this.i()) {}
    }
    
    @Override
    public final boolean i() {
        return this.b.get() == this.i.get();
    }
    
    @Override
    public final boolean j(final Object o) {
        if (o == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        final AtomicReferenceArray f = this.f;
        final long value = this.b.get();
        final int e = this.e;
        final int n = (int)value & e;
        if (value < this.d) {
            this.e(f, o, value, n);
            return true;
        }
        final long n2 = this.c + value;
        if (f.get((int)n2 & e) == null) {
            this.d = n2 - 1L;
            this.e(f, o, value, n);
            return true;
        }
        final long n3 = 1L + value;
        if (f.get((int)n3 & e) == null) {
            this.e(f, o, value, n);
            return true;
        }
        final AtomicReferenceArray f2 = new AtomicReferenceArray(f.length());
        this.f = f2;
        this.d = value + e - 1L;
        f2.lazySet(n, o);
        f.lazySet(f.length() - 1, f2);
        f.lazySet(n, pft.j);
        this.d(n3);
        return true;
    }
}
