import java.util.Iterator;
import java.util.NavigableSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class nrc extends nrb implements NavigableSet
{
    public nrc(final nra nra) {
        super(nra);
    }
    
    @Override
    public final Object ceiling(final Object o) {
        return nrr.i(super.a.s(o, 2).j());
    }
    
    @Override
    public final Iterator descendingIterator() {
        return this.descendingSet().iterator();
    }
    
    @Override
    public final NavigableSet descendingSet() {
        return new nrc(super.a.n());
    }
    
    @Override
    public final Object floor(final Object o) {
        return nrr.i(super.a.r(o, 2).k());
    }
    
    @Override
    public final NavigableSet headSet(final Object o, final boolean b) {
        return new nrc(super.a.r(o, nqb.D(b)));
    }
    
    @Override
    public final Object higher(final Object o) {
        return nrr.i(super.a.s(o, 1).j());
    }
    
    @Override
    public final Object lower(final Object o) {
        return nrr.i(super.a.r(o, 1).k());
    }
    
    @Override
    public final Object pollFirst() {
        return nrr.i(super.a.l());
    }
    
    @Override
    public final Object pollLast() {
        return nrr.i(super.a.m());
    }
    
    @Override
    public final NavigableSet subSet(final Object o, final boolean b, final Object o2, final boolean b2) {
        return new nrc(super.a.q(o, nqb.D(b), o2, nqb.D(b2)));
    }
    
    @Override
    public final NavigableSet tailSet(final Object o, final boolean b) {
        return new nrc(super.a.s(o, nqb.D(b)));
    }
}
