import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.SortedSet;
import java.util.NavigableSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class nrh extends nrm implements NavigableSet
{
    private static final long serialVersionUID = 0L;
    transient NavigableSet a;
    
    public nrh(final NavigableSet set, final Object o) {
        super(set, o);
    }
    
    final NavigableSet b() {
        return (NavigableSet)super.d();
    }
    
    @Override
    public final Object ceiling(Object ceiling) {
        synchronized (this.h) {
            ceiling = this.b().ceiling(ceiling);
            return ceiling;
        }
    }
    
    @Override
    public final Iterator descendingIterator() {
        return this.b().descendingIterator();
    }
    
    @Override
    public final NavigableSet descendingSet() {
        synchronized (this.h) {
            final NavigableSet a = this.a;
            if (a == null) {
                return this.a = nrr.e(this.b().descendingSet(), this.h);
            }
            return a;
        }
    }
    
    @Override
    public final Object floor(Object floor) {
        synchronized (this.h) {
            floor = this.b().floor(floor);
            return floor;
        }
    }
    
    @Override
    public final NavigableSet headSet(final Object o, final boolean b) {
        synchronized (this.h) {
            return nrr.e(this.b().headSet(o, b), this.h);
        }
    }
    
    @Override
    public final SortedSet headSet(final Object o) {
        return this.headSet(o, false);
    }
    
    @Override
    public final Object higher(Object higher) {
        synchronized (this.h) {
            higher = this.b().higher(higher);
            return higher;
        }
    }
    
    @Override
    public final Object lower(Object lower) {
        synchronized (this.h) {
            lower = this.b().lower(lower);
            return lower;
        }
    }
    
    @Override
    public final Object pollFirst() {
        synchronized (this.h) {
            return this.b().pollFirst();
        }
    }
    
    @Override
    public final Object pollLast() {
        synchronized (this.h) {
            return this.b().pollLast();
        }
    }
    
    @Override
    public final NavigableSet subSet(final Object o, final boolean b, final Object o2, final boolean b2) {
        synchronized (this.h) {
            return nrr.e(this.b().subSet(o, b, o2, b2), this.h);
        }
    }
    
    @Override
    public final SortedSet subSet(final Object o, final Object o2) {
        return this.subSet(o, true, o2, false);
    }
    
    @Override
    public final NavigableSet tailSet(final Object o, final boolean b) {
        synchronized (this.h) {
            return nrr.e(this.b().tailSet(o, b), this.h);
        }
    }
    
    @Override
    public final SortedSet tailSet(final Object o) {
        return this.tailSet(o, true);
    }
}
