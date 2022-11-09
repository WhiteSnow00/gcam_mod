import java.util.Set;
import java.util.RandomAccess;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nkt extends nkx implements Serializable
{
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;
    
    protected nkt(final Map a) {
        njo.d(a.isEmpty());
        this.a = a;
    }
    
    public abstract Collection a();
    
    @Override
    public Collection b(final Object o) {
        Collection a;
        if ((a = this.a.get(o)) == null) {
            a = this.a();
        }
        return this.c(o, a);
    }
    
    public Collection c(final Object o, final Collection collection) {
        throw null;
    }
    
    @Override
    public final int e() {
        return this.b;
    }
    
    @Override
    public final Iterator f() {
        return new nkf(this);
    }
    
    final List g(final Object o, final List list, final nkp nkp) {
        nkr nkr;
        if (list instanceof RandomAccess) {
            nkr = new nkn(this, o, list, nkp);
        }
        else {
            nkr = new nkr(this, o, list, nkp);
        }
        return nkr;
    }
    
    @Override
    public final Map h() {
        return new nkj(this, this.a);
    }
    
    @Override
    public final Set i() {
        return new nkm(this, this.a);
    }
    
    @Override
    public final void j() {
        final Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((Collection)iterator.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }
    
    final void k(final Map a) {
        this.a = a;
        this.b = 0;
        for (final Collection collection : a.values()) {
            njo.d(collection.isEmpty() ^ true);
            this.b += collection.size();
        }
    }
    
    @Override
    public final void p(final Object o, final Object o2) {
        final Collection collection = this.a.get(o);
        if (collection == null) {
            final Collection a = this.a();
            if (a.add(o2)) {
                ++this.b;
                this.a.put(o, a);
                return;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        else if (collection.add(o2)) {
            ++this.b;
        }
    }
}
