import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class nlm extends AbstractSet
{
    final /* synthetic */ nlr a;
    
    public nlm(final nlr a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Map h = this.a.h();
        if (h != null) {
            return h.entrySet().contains(o);
        }
        if (o instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)o;
            final int d = this.a.d(entry.getKey());
            if (d != -1 && nqb.E(this.a.e[d], entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.g();
    }
    
    @Override
    public final boolean remove(Object key) {
        final Map h = this.a.h();
        if (h != null) {
            return h.entrySet().remove(key);
        }
        if (!(key instanceof Map.Entry)) {
            return false;
        }
        final Map.Entry entry = (Map.Entry)key;
        if (this.a.l()) {
            return false;
        }
        final int c = this.a.c();
        key = entry.getKey();
        final Object value = entry.getValue();
        final nlr a = this.a;
        final int p = nov.p(key, value, c, a.b, a.c, a.d, a.e);
        if (p == -1) {
            return false;
        }
        this.a.k(p, c);
        final nlr a2 = this.a;
        --a2.g;
        a2.i();
        return true;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
