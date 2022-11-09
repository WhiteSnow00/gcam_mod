import java.util.Collection;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

class nrf extends nri implements Map
{
    private static final long serialVersionUID = 0L;
    transient Set a;
    transient Collection b;
    transient Set c;
    
    public nrf(final Map map, final Object o) {
        super(map, o);
    }
    
    public Map a() {
        return (Map)super.g;
    }
    
    @Override
    public final void clear() {
        synchronized (this.h) {
            this.a().clear();
        }
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        synchronized (this.h) {
            return this.a().containsKey(o);
        }
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        synchronized (this.h) {
            return this.a().containsValue(o);
        }
    }
    
    @Override
    public final Set entrySet() {
        synchronized (this.h) {
            if (this.c == null) {
                this.c = nrr.f(this.a().entrySet(), this.h);
            }
            return this.c;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        synchronized (this.h) {
            return this.a().equals(o);
        }
    }
    
    @Override
    public final Object get(Object value) {
        synchronized (this.h) {
            value = this.a().get(value);
            return value;
        }
    }
    
    @Override
    public final int hashCode() {
        synchronized (this.h) {
            return this.a().hashCode();
        }
    }
    
    @Override
    public final boolean isEmpty() {
        synchronized (this.h) {
            return this.a().isEmpty();
        }
    }
    
    @Override
    public Set keySet() {
        synchronized (this.h) {
            if (this.a == null) {
                this.a = nrr.f(this.a().keySet(), this.h);
            }
            return this.a;
        }
    }
    
    @Override
    public final Object put(Object put, final Object o) {
        synchronized (this.h) {
            put = this.a().put(put, o);
            return put;
        }
    }
    
    @Override
    public final void putAll(final Map map) {
        synchronized (this.h) {
            this.a().putAll(map);
        }
    }
    
    @Override
    public final Object remove(Object remove) {
        synchronized (this.h) {
            remove = this.a().remove(remove);
            return remove;
        }
    }
    
    @Override
    public final int size() {
        synchronized (this.h) {
            return this.a().size();
        }
    }
    
    @Override
    public final Collection values() {
        synchronized (this.h) {
            if (this.b == null) {
                this.b = new nrd(this.a().values(), this.h);
            }
            return this.b;
        }
    }
}
