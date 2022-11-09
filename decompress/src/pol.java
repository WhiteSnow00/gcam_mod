// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pol extends pnw
{
    private long b;
    public ppm d;
    private boolean e;
    
    private static final long s(final boolean b) {
        if (b) {
            return 4294967296L;
        }
        return 1L;
    }
    
    protected abstract Thread h();
    
    public long j() {
        throw null;
    }
    
    public final void k(final boolean b) {
        final long b2 = this.b - s(b);
        this.b = b2;
        if (b2 > 0L) {
            return;
        }
        final boolean a = pod.a;
        if (this.e) {
            this.n();
        }
    }
    
    public final void l(final poh poh) {
        poh.getClass();
        ppm d = this.d;
        if (d == null) {
            d = new ppm();
            this.d = d;
        }
        poh.getClass();
        final Object[] a = d.a;
        final int c = d.c;
        a[c] = poh;
        final int length = a.length;
        final int c2 = c + 1 & length - 1;
        d.c = c2;
        final int b = d.b;
        if (c2 == b) {
            final Object[] a2 = new Object[length + length];
            pjf.v(a, a2, 0, b, 0, 10);
            final Object[] a3 = d.a;
            final int length2 = a3.length;
            final int b2 = d.b;
            pjf.v(a3, a2, length2 - b2, 0, b2, 4);
            d.a = a2;
            d.b = 0;
            d.c = length;
        }
    }
    
    public final void m(final boolean b) {
        this.b += s(b);
        if (!b) {
            this.e = true;
        }
    }
    
    protected void n() {
        throw null;
    }
    
    public final boolean o() {
        return this.b >= s(true);
    }
    
    public final boolean p() {
        final ppm d = this.d;
        if (d == null) {
            return false;
        }
        final int b = d.b;
        final int c = d.c;
        Object o = null;
        if (b != c) {
            final Object[] a = d.a;
            o = a[b];
            a[b] = null;
            d.b = (b + 1 & a.length - 1);
            if (o == null) {
                throw new NullPointerException("null cannot be cast to non-null type T");
            }
        }
        final poh poh = (poh)o;
        if (poh != null) {
            poh.run();
            return true;
        }
        return false;
    }
}
