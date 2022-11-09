import java.util.Iterator;
import java.util.Comparator;
import java.util.SortedSet;

// 
// Decompiled by Procyon v0.6.0
// 

class nrb extends npw implements SortedSet
{
    public final nra a;
    
    public nrb(final nra a) {
        this.a = a;
    }
    
    @Override
    public final Comparator comparator() {
        return this.a.comparator();
    }
    
    @Override
    public final Object first() {
        return nrr.j(this.a.j());
    }
    
    @Override
    public final SortedSet headSet(final Object o) {
        return this.a.r(o, 1).p();
    }
    
    @Override
    public final Iterator iterator() {
        return new npu(this.a.g().iterator());
    }
    
    @Override
    public final Object last() {
        return nrr.j(this.a.k());
    }
    
    @Override
    public final SortedSet subSet(final Object o, final Object o2) {
        return this.a.q(o, 2, o2, 1).p();
    }
    
    @Override
    public final SortedSet tailSet(final Object o) {
        return this.a.s(o, 2).p();
    }
}
