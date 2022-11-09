import java.util.Set;
import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class nqj extends nlv
{
    private static final long serialVersionUID = 0L;
    private final nqe d;
    
    public nqj(final nqe d, final nmf nmf) {
        super(nmf);
        this.d = d;
    }
    
    public static boolean T(final Comparable comparable, final Comparable comparable2) {
        return comparable2 != null && nqe.b(comparable, comparable2) == 0;
    }
    
    private final nlv U(final nqe nqe) {
        nlv a;
        if (this.d.n(nqe)) {
            a = nlv.a(this.d.h(nqe), this.a);
        }
        else {
            a = new nmh(this.a);
        }
        return a;
    }
    
    @Override
    public final nns C() {
        final boolean b = this.a.b;
        return new nne(this);
    }
    
    public final Comparable R() {
        return this.d.a.d(this.a);
    }
    
    public final Comparable S() {
        return this.d.b.c(this.a);
    }
    
    @Override
    public final nrv bM() {
        return new nqh(this, this.S());
    }
    
    @Override
    public final nrv bN() {
        return new nqg(this, this.R());
    }
    
    @Override
    public final boolean bO() {
        return false;
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (o == null) {
            return false;
        }
        try {
            return this.d.k((Comparable)o);
        }
        catch (final ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        return nov.x(this, collection);
    }
    
    @Override
    public final nlv d(final Comparable comparable, final boolean b) {
        return this.U(nqe.q(comparable, nqb.D(b)));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof nqj) {
            final nqj nqj = (nqj)o;
            if (this.a.equals(nqj.a)) {
                return this.R().equals(nqj.R()) && this.S().equals(nqj.S());
            }
        }
        return super.equals(o);
    }
    
    @Override
    public final nlv g(final Comparable comparable, final boolean b, final Comparable comparable2, final boolean b2) {
        if (comparable.compareTo(comparable2) == 0 && !b && !b2) {
            return new nmh(this.a);
        }
        return this.U(nqe.p(comparable, nqb.D(b), comparable2, nqb.D(b2)));
    }
    
    @Override
    public final int hashCode() {
        return nrr.l(this);
    }
    
    @Override
    public final boolean isEmpty() {
        return false;
    }
    
    @Override
    public final nlv j(final Comparable comparable, final boolean b) {
        return this.U(nqe.o(comparable, nqb.D(b)));
    }
    
    @Override
    public final int size() {
        final long n = (int)this.S() - (long)(int)this.R();
        if (n >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int)n + 1;
    }
    
    @Override
    public final nqe u() {
        return nqe.g(this.d.a.h(this.a), this.d.b.i(this.a));
    }
    
    @Override
    Object writeReplace() {
        return new nqi(this.d, this.a);
    }
}
