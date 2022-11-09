import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nmt extends nms implements SortedSet
{
    protected nmt() {
    }
    
    @Override
    public final Comparator comparator() {
        return this.e().comparator();
    }
    
    protected abstract SortedSet e();
    
    @Override
    public final Object first() {
        return this.e().first();
    }
    
    @Override
    public final SortedSet headSet(final Object o) {
        return this.e().headSet(o);
    }
    
    @Override
    public final Object last() {
        return this.e().last();
    }
    
    @Override
    public final SortedSet subSet(final Object o, final Object o2) {
        return this.e().subSet(o, o2);
    }
    
    @Override
    public final SortedSet tailSet(final Object o) {
        return this.e().tailSet(o);
    }
}
