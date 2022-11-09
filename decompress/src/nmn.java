import java.util.Collection;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nmn extends nmq implements Map
{
    protected nmn() {
    }
    
    protected abstract Map c();
    
    @Override
    public void clear() {
        this.c().clear();
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.c().containsKey(o);
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.c().containsValue(o);
    }
    
    @Override
    public Set entrySet() {
        return this.c().entrySet();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || this.c().equals(o);
    }
    
    @Override
    public final Object get(final Object o) {
        return this.c().get(o);
    }
    
    @Override
    public final int hashCode() {
        return this.c().hashCode();
    }
    
    @Override
    public final boolean isEmpty() {
        return this.c().isEmpty();
    }
    
    @Override
    public Set keySet() {
        return this.c().keySet();
    }
    
    @Override
    public Object put(final Object o, final Object o2) {
        return this.c().put(o, o2);
    }
    
    @Override
    public void putAll(final Map map) {
        this.c().putAll(map);
    }
    
    @Override
    public Object remove(final Object o) {
        return this.c().remove(o);
    }
    
    @Override
    public final int size() {
        return this.c().size();
    }
    
    @Override
    public Collection values() {
        return this.c().values();
    }
}
