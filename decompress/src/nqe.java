import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nqe extends nqf implements Serializable, njc
{
    private static final nqe c;
    private static final long serialVersionUID = 0L;
    final nma a;
    final nma b;
    
    static {
        c = new nqe(nly.a, nlw.a);
    }
    
    private nqe(final nma a, final nma b) {
        this.a = a;
        this.b = b;
        if (a.a(b) <= 0 && a != nlw.a && b != nly.a) {
            return;
        }
        final String value = String.valueOf(r(a, b));
        String concat;
        if (value.length() != 0) {
            concat = "Invalid range: ".concat(value);
        }
        else {
            concat = new String("Invalid range: ");
        }
        throw new IllegalArgumentException(concat);
    }
    
    static int b(final Comparable comparable, final Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
    
    public static nqe c(final Comparable comparable) {
        return g(nma.k(comparable), nlw.a);
    }
    
    public static nqe d(final Comparable comparable) {
        return g(nly.a, nma.j(comparable));
    }
    
    public static nqe e(final Comparable comparable, final Comparable comparable2) {
        return g(nma.k(comparable), nma.j(comparable2));
    }
    
    public static nqe f(final Comparable comparable, final Comparable comparable2) {
        return g(nma.k(comparable), nma.k(comparable2));
    }
    
    static nqe g(final nma nma, final nma nma2) {
        return new nqe(nma, nma2);
    }
    
    public static nqe o(final Comparable comparable, final int n) {
        switch (n - 1) {
            default: {
                return c(comparable);
            }
            case 0: {
                return g(nma.j(comparable), nlw.a);
            }
        }
    }
    
    public static nqe p(final Comparable comparable, final int n, final Comparable comparable2, final int n2) {
        nma nma;
        if (n == 1) {
            nma = nma.j(comparable);
        }
        else {
            nma = nma.k(comparable);
        }
        nma nma2;
        if (n2 == 1) {
            nma2 = nma.k(comparable2);
        }
        else {
            nma2 = nma.j(comparable2);
        }
        return g(nma, nma2);
    }
    
    public static nqe q(final Comparable comparable, final int n) {
        switch (n - 1) {
            default: {
                return d(comparable);
            }
            case 0: {
                return g(nly.a, nma.k(comparable));
            }
        }
    }
    
    private static String r(final nma nma, final nma nma2) {
        final StringBuilder sb = new StringBuilder(16);
        nma.e(sb);
        sb.append("..");
        nma2.f(sb);
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nqe) {
            final nqe nqe = (nqe)o;
            if (this.a.equals(nqe.a) && this.b.equals(nqe.b)) {
                return true;
            }
        }
        return false;
    }
    
    public final nqe h(final nqe nqe) {
        final int a = this.a.a(nqe.a);
        final int a2 = this.b.a(nqe.b);
        if (a >= 0 && a2 <= 0) {
            return this;
        }
        if (a <= 0 && a2 >= 0) {
            return nqe;
        }
        nma nma;
        if (a >= 0) {
            nma = this.a;
        }
        else {
            nma = nqe.a;
        }
        nma nma2;
        if (a2 <= 0) {
            nma2 = this.b;
        }
        else {
            nma2 = nqe.b;
        }
        return g(nma, nma2);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    public final Comparable i() {
        return this.a.b();
    }
    
    public final Comparable j() {
        return this.b.b();
    }
    
    public final boolean k(final Comparable comparable) {
        comparable.getClass();
        return this.a.g(comparable) && !this.b.g(comparable);
    }
    
    public final boolean l() {
        return this.a != nly.a;
    }
    
    public final boolean m() {
        return this.b != nlw.a;
    }
    
    public final boolean n(final nqe nqe) {
        return this.a.a(nqe.b) <= 0 && nqe.a.a(this.b) <= 0;
    }
    
    Object readResolve() {
        final nqe c = nqe.c;
        if (this.equals(c)) {
            return c;
        }
        return this;
    }
    
    @Override
    public final String toString() {
        return r(this.a, this.b);
    }
}
