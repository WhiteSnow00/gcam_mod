import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

class nqa extends nmp implements Serializable
{
    private static final long serialVersionUID = 0L;
    final npt a;
    transient Set b;
    transient Set c;
    
    public nqa(final npt a) {
        this.a = a;
    }
    
    @Override
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public Set c() {
        return Collections.unmodifiableSet((Set<?>)this.a.f());
    }
    
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final int d(final Object o, final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Set f() {
        Set b;
        if ((b = this.b) == null) {
            b = this.c();
            this.b = b;
        }
        return b;
    }
    
    @Override
    public final Set g() {
        Set<Object> c;
        if ((c = this.c) == null) {
            c = Collections.unmodifiableSet((Set<?>)this.a.g());
            this.c = c;
        }
        return c;
    }
    
    @Override
    public final void h(final Object o, final int n) {
        throw null;
    }
    
    @Override
    public final boolean i(final Object o, final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Iterator iterator() {
        return nqb.v(this.a.iterator());
    }
    
    @Override
    protected npt o() {
        return this.a;
    }
    
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
}
