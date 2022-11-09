import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.io.Serializable;
import java.util.NavigableSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class nqx extends nmt implements NavigableSet, Serializable
{
    private static final long serialVersionUID = 0L;
    private final NavigableSet a;
    private final SortedSet b;
    private transient nqx c;
    
    public nqx(final NavigableSet a) {
        a.getClass();
        this.a = a;
        this.b = Collections.unmodifiableSortedSet((SortedSet<Object>)a);
    }
    
    @Override
    public final Object ceiling(final Object o) {
        return this.a.ceiling(o);
    }
    
    @Override
    public final Iterator descendingIterator() {
        return nqb.v(this.a.descendingIterator());
    }
    
    @Override
    public final NavigableSet descendingSet() {
        nqx c;
        if ((c = this.c) == null) {
            c = new nqx(this.a.descendingSet());
            this.c = c;
            c.c = this;
        }
        return c;
    }
    
    @Override
    protected final SortedSet e() {
        return this.b;
    }
    
    @Override
    public final Object floor(final Object o) {
        return this.a.floor(o);
    }
    
    @Override
    public final NavigableSet headSet(final Object o, final boolean b) {
        return nrr.n(this.a.headSet(o, b));
    }
    
    @Override
    public final Object higher(final Object o) {
        return this.a.higher(o);
    }
    
    @Override
    public final Object lower(final Object o) {
        return this.a.lower(o);
    }
    
    @Override
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final NavigableSet subSet(final Object o, final boolean b, final Object o2, final boolean b2) {
        return nrr.n(this.a.subSet(o, b, o2, b2));
    }
    
    @Override
    public final NavigableSet tailSet(final Object o, final boolean b) {
        return nrr.n(this.a.tailSet(o, b));
    }
}
