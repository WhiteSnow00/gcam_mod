import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nkz extends AbstractCollection implements npt
{
    public transient Set a;
    private transient Set b;
    
    public nkz() {
    }
    
    @Override
    public final boolean add(final Object o) {
        this.h(o, 1);
        return true;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        collection.getClass();
        final boolean b = collection instanceof npt;
        boolean b2 = false;
        if (b) {
            final npt npt = (npt)collection;
            if (npt instanceof nku) {
                if (!((nku)npt).isEmpty()) {
                    throw null;
                }
            }
            else if (!npt.isEmpty()) {
                for (final nps nps : npt.g()) {
                    this.h(nps.b(), nps.a());
                }
                b2 = true;
            }
        }
        else if (!collection.isEmpty()) {
            return nqb.z(this, collection.iterator());
        }
        return b2;
    }
    
    public abstract int b();
    
    public abstract Iterator c();
    
    @Override
    public final boolean contains(final Object o) {
        return this.bK(o) > 0;
    }
    
    @Override
    public int d(final Object o, final int n) {
        throw null;
    }
    
    public Set e() {
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            Label_0125: {
                if (o instanceof npt) {
                    final npt npt = (npt)o;
                    if (this.size() == npt.size()) {
                        if (this.g().size() != npt.g().size()) {
                            b = false;
                            return b;
                        }
                        for (final nps nps : npt.g()) {
                            if (this.bK(nps.b()) != nps.a()) {
                                break Label_0125;
                            }
                        }
                        return b;
                    }
                }
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public Set f() {
        throw null;
    }
    
    @Override
    public final Set g() {
        Set b;
        if ((b = this.b) == null) {
            b = new nky(this);
            this.b = b;
        }
        return b;
    }
    
    @Override
    public void h(final Object o, final int n) {
        throw null;
    }
    
    @Override
    public final int hashCode() {
        return this.g().hashCode();
    }
    
    @Override
    public boolean i(final Object o, final int n) {
        throw null;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.g().isEmpty();
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.d(o, 1) > 0;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        Object f = collection;
        if (collection instanceof npt) {
            f = ((npt)collection).f();
        }
        return this.f().removeAll((Collection)f);
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        collection.getClass();
        Object f = collection;
        if (collection instanceof npt) {
            f = ((npt)collection).f();
        }
        return this.f().retainAll((Collection)f);
    }
    
    @Override
    public final String toString() {
        return this.g().toString();
    }
}
