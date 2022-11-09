import java.util.Comparator;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

// 
// Decompiled by Procyon v0.6.0
// 

class nrm extends nrk implements SortedSet
{
    private static final long serialVersionUID = 0L;
    
    public nrm(final SortedSet set, final Object o) {
        super(set, o);
    }
    
    @Override
    public final Comparator comparator() {
        synchronized (this.h) {
            return this.d().comparator();
        }
    }
    
    public SortedSet d() {
        return (SortedSet)super.c();
    }
    
    @Override
    public final Object first() {
        synchronized (this.h) {
            return this.d().first();
        }
    }
    
    @Override
    public SortedSet headSet(final Object o) {
        synchronized (this.h) {
            return nrr.h(this.d().headSet(o), this.h);
        }
    }
    
    @Override
    public final Object last() {
        synchronized (this.h) {
            return this.d().last();
        }
    }
    
    @Override
    public SortedSet subSet(final Object o, final Object o2) {
        synchronized (this.h) {
            return nrr.h(this.d().subSet(o, o2), this.h);
        }
    }
    
    @Override
    public SortedSet tailSet(final Object o) {
        synchronized (this.h) {
            return nrr.h(this.d().tailSet(o), this.h);
        }
    }
}
