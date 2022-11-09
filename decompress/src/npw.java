import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class npw extends nqw
{
    public npw() {
    }
    
    public abstract npt a();
    
    @Override
    public final void clear() {
        this.a().clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a().contains(o);
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        return this.a().containsAll(collection);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a().isEmpty();
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.a().d(o, Integer.MAX_VALUE) > 0;
    }
    
    @Override
    public final int size() {
        return this.a().g().size();
    }
}
