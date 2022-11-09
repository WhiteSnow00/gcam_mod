import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nmh extends nlv
{
    public nmh(final nmf nmf) {
        super(nmf);
    }
    
    @Override
    public final nrv bM() {
        return noz.a;
    }
    
    @Override
    public final nrv bN() {
        return noz.a;
    }
    
    @Override
    public final boolean bO() {
        return false;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return false;
    }
    
    @Override
    public final nlv d(final Comparable comparable, final boolean b) {
        return this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof Set && ((Set)o).isEmpty();
    }
    
    @Override
    public final nlv g(final Comparable comparable, final boolean b, final Comparable comparable2, final boolean b2) {
        return this;
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    @Override
    public final boolean isEmpty() {
        return true;
    }
    
    @Override
    public final nlv j(final Comparable comparable, final boolean b) {
        return this;
    }
    
    @Override
    public final noq k() {
        return noq.Q(nqt.a);
    }
    
    @Override
    public final int size() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return "[]";
    }
    
    @Override
    public final nqe u() {
        throw new NoSuchElementException();
    }
    
    @Override
    public final nns v() {
        return nns.l();
    }
    
    @Override
    public final boolean w() {
        return true;
    }
    
    @Override
    Object writeReplace() {
        return new nmg(this.a);
    }
}
