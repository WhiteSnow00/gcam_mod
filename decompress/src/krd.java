// 
// Decompiled by Procyon v0.6.0
// 

public final class krd implements Comparable
{
    public static final krd a;
    public static final krd b;
    public static final krd c;
    public static final krd d;
    public final int e;
    
    static {
        a = e(100);
        b = c(0);
        c = new krd(-1);
        d = c(32);
    }
    
    public krd() {
    }
    
    public krd(final int e) {
        this.e = e;
    }
    
    public static krd b(final float n) {
        return c((int)(n * 100.0f));
    }
    
    public static krd c(final int n) {
        int n2 = n;
        if (n > 99) {
            n2 = 99;
        }
        return e(n2);
    }
    
    private static krd e(final int n) {
        njo.g(n >= 0, "Percentages must be between [0,100] inclusive: %s", n);
        return new krd(n);
    }
    
    public final int a(final krd krd) {
        final int e = this.e;
        final int e2 = krd.e;
        int n;
        if (e == e2) {
            n = 0;
        }
        else {
            if (e < e2) {
                return -1;
            }
            n = 1;
        }
        return n;
    }
    
    public final boolean d() {
        return this.e >= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof krd && this.e == ((krd)o).e);
    }
    
    @Override
    public final int hashCode() {
        return this.e ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final int e = this.e;
        final StringBuilder sb = new StringBuilder(12);
        sb.append(e);
        sb.append("%");
        return sb.toString();
    }
}
