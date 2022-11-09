import java.util.SortedSet;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nlv extends noq
{
    final nmf a;
    
    public nlv(final nmf a) {
        super(nqc.a);
        this.a = a;
    }
    
    public static nlv a(final nqe nqe, final nmf nmf) {
        nmf.getClass();
        try {
            nqe h;
            if (!nqe.l()) {
                h = nqe.h(nqe.c(((nme)nmf).d()));
            }
            else {
                h = nqe;
            }
            nqe h2 = h;
            if (!nqe.m()) {
                h2 = h.h(nqe.d(((nme)nmf).c()));
            }
            nlv nlv;
            if (!h2.a.equals(h2.b) && nqe.b(nqe.a.d(nmf), nqe.b.c(nmf)) <= 0) {
                nlv = new nqj(h2, nmf);
            }
            else {
                nlv = new nmh(nmf);
            }
            return nlv;
        }
        catch (final NoSuchElementException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
    
    public final nlv b(final Comparable comparable) {
        comparable.getClass();
        return this.d(comparable, false);
    }
    
    public final nlv c(final Comparable comparable, final boolean b) {
        comparable.getClass();
        return this.d(comparable, b);
    }
    
    public abstract nlv d(final Comparable p0, final boolean p1);
    
    public final nlv e(final Comparable comparable, final Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        njo.d(super.b.compare(comparable, comparable2) <= 0);
        return this.g(comparable, true, comparable2, false);
    }
    
    public final nlv f(final Comparable comparable, final boolean b, final Comparable comparable2, final boolean b2) {
        comparable.getClass();
        comparable2.getClass();
        njo.d(super.b.compare(comparable, comparable2) <= 0);
        return this.g(comparable, b, comparable2, b2);
    }
    
    public abstract nlv g(final Comparable p0, final boolean p1, final Comparable p2, final boolean p3);
    
    public final nlv h(final Comparable comparable) {
        comparable.getClass();
        return this.j(comparable, true);
    }
    
    public final nlv i(final Comparable comparable, final boolean b) {
        comparable.getClass();
        return this.j(comparable, b);
    }
    
    public abstract nlv j(final Comparable p0, final boolean p1);
    
    @Override
    public noq k() {
        return new nmb(this);
    }
    
    @Override
    public String toString() {
        return this.u().toString();
    }
    
    public abstract nqe u();
}
