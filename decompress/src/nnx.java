import java.util.Iterator;
import j$.util.function.BiConsumer;
import j$.util.function.Function;
import j$.util.Map$_CC;
import j$.util.function.BiFunction;
import java.util.Set;
import java.util.Collection;
import java.util.SortedMap;
import java.io.Serializable;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nnx implements Map, Serializable, j$.util.Map
{
    private transient noi a;
    private transient noi b;
    private transient nnj c;
    
    public static nnt l() {
        return new nnt();
    }
    
    public static nnt m(final int n) {
        nqb.C(n, "expectedSize");
        return new nnt(n);
    }
    
    public static nnx n(final Map map) {
        if (map instanceof nnx && !(map instanceof SortedMap)) {
            final nnx nnx = (nnx)map;
            if (!nnx.bS()) {
                return nnx;
            }
        }
        final Set<Entry<Object, Object>> entrySet = map.entrySet();
        int size;
        if (entrySet instanceof Collection) {
            size = entrySet.size();
        }
        else {
            size = 4;
        }
        final nnt nnt = new nnt(size);
        nnt.e(entrySet);
        return nnt.b();
    }
    
    public static nnx o(final Object o, final Object o2) {
        nqb.A(o, o2);
        return nqq.a(1, new Object[] { o, o2 });
    }
    
    public static nnx p(final Object o, final Object o2, final Object o3, final Object o4) {
        nqb.A(o, o2);
        nqb.A(o3, o4);
        return nqq.a(2, new Object[] { o, o2, o3, o4 });
    }
    
    public static nnx q(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6) {
        nqb.A(o, o2);
        nqb.A(o3, o4);
        nqb.A(o5, o6);
        return nqq.a(3, new Object[] { o, o2, o3, o4, o5, o6 });
    }
    
    public static nnx r(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8) {
        nqb.A(o, o2);
        nqb.A(o3, o4);
        nqb.A(o5, o6);
        nqb.A(o7, o8);
        return nqq.a(4, new Object[] { o, o2, o3, o4, o5, o6, o7, o8 });
    }
    
    public abstract noi bP();
    
    public abstract noi bQ();
    
    public nrv bR() {
        throw null;
    }
    
    public abstract boolean bS();
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.get(o) != null;
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.i().contains(o);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b;
        if (this == o) {
            b = true;
        }
        else {
            if (o instanceof Map) {
                return this.entrySet().equals(((Map)o).entrySet());
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public abstract Object get(final Object p0);
    
    @Override
    public final Object getOrDefault(Object value, final Object o) {
        value = this.get(value);
        if (value != null) {
            return value;
        }
        return o;
    }
    
    public abstract nnj h();
    
    @Override
    public final int hashCode() {
        return nrr.l(this.s());
    }
    
    public nnj i() {
        nnj c;
        if ((c = this.c) == null) {
            c = this.h();
            this.c = c;
        }
        return c;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Deprecated
    @Override
    public final Object put(final Object o, final Object o2) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final void putAll(final Map map) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final Object remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final noi s() {
        noi a;
        if ((a = this.a) == null) {
            a = this.bP();
            this.a = a;
        }
        return a;
    }
    
    public noi t() {
        noi b;
        if ((b = this.b) == null) {
            b = this.bQ();
            this.b = b;
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder v = nov.v(this.size());
        v.append('{');
        final Iterator<Entry<Object, Object>> iterator = this.entrySet().iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Entry<Object, V> entry = (Entry<Object, V>)iterator.next();
            if (n == 0) {
                v.append(", ");
            }
            v.append(entry.getKey());
            v.append('=');
            v.append(entry.getValue());
            n = 0;
        }
        v.append('}');
        return v.toString();
    }
    
    Object writeReplace() {
        return new nnw(this);
    }
}
