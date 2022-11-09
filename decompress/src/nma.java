import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nma implements Comparable, Serializable
{
    private static final long serialVersionUID = 0L;
    final Comparable b;
    
    public nma(final Comparable b) {
        this.b = b;
    }
    
    static nma j(final Comparable comparable) {
        return new nlx(comparable);
    }
    
    static nma k(final Comparable comparable) {
        return new nlz(comparable);
    }
    
    public int a(final nma nma) {
        if (nma != nly.a) {
            final nlw a = nlw.a;
            int n = -1;
            if (nma == a) {
                return -1;
            }
            final int b = nqe.b(this.b, nma.b);
            if (b != 0) {
                return b;
            }
            final boolean b2 = this instanceof nlx;
            if (b2 == nma instanceof nlx) {
                n = 0;
            }
            else if (b2) {
                return 1;
            }
            return n;
        }
        return 1;
    }
    
    public Comparable b() {
        return this.b;
    }
    
    public abstract Comparable c(final nmf p0);
    
    public abstract Comparable d(final nmf p0);
    
    public abstract void e(final StringBuilder p0);
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nma) {
            final nma nma = (nma)o;
            try {
                return this.a(nma) == 0;
            }
            catch (final ClassCastException ex) {}
        }
        return false;
    }
    
    public abstract void f(final StringBuilder p0);
    
    public abstract boolean g(final Comparable p0);
    
    public abstract nma h(final nmf p0);
    
    @Override
    public abstract int hashCode();
    
    public abstract nma i(final nmf p0);
}
