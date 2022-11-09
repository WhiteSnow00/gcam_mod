import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public class nkc extends nmn implements Serializable, nlf
{
    private static final long serialVersionUID = 0L;
    public transient Map a;
    public transient nkc b;
    private transient Set c;
    private transient Set d;
    private transient Set e;
    
    public nkc(final Map map, final Map map2) {
        this.i(map, map2);
    }
    
    public nkc(final Map a, final nkc b) {
        this.a = a;
        this.b = b;
    }
    
    public Object b(final Object o) {
        throw null;
    }
    
    @Override
    protected final Map c() {
        return this.a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
        this.b.a.clear();
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.b.containsKey(o);
    }
    
    public Object d(final Object o) {
        return o;
    }
    
    @Override
    public final nlf e() {
        return this.b;
    }
    
    @Override
    public final Set entrySet() {
        Set e;
        if ((e = this.e) == null) {
            e = new njy(this);
            this.e = e;
        }
        return e;
    }
    
    public final Object f(Object remove) {
        remove = this.a.remove(remove);
        this.h(remove);
        return remove;
    }
    
    @Override
    public final Set g() {
        Set d;
        if ((d = this.d) == null) {
            d = new nkb(this);
            this.d = d;
        }
        return d;
    }
    
    public final void h(final Object o) {
        this.b.a.remove(o);
    }
    
    final void i(final Map a, final Map map) {
        final Map a2 = this.a;
        final boolean b = true;
        njo.o(a2 == null);
        njo.o(this.b == null);
        njo.d(a.isEmpty());
        njo.d(map.isEmpty());
        njo.d(a != map && b);
        this.a = a;
        this.b = new njz(map, this);
    }
    
    public final void j(final Object o, final boolean b, final Object o2, final Object o3) {
        if (b) {
            this.h(o2);
        }
        this.b.a.put(o3, o);
    }
    
    @Override
    public final void k(final Object o, final Object o2) {
        throw null;
    }
    
    @Override
    public final Set keySet() {
        Set c;
        if ((c = this.c) == null) {
            c = new nka(this);
            this.c = c;
        }
        return c;
    }
    
    @Override
    public Object put(final Object o, final Object o2) {
        this.b(o);
        this.d(o2);
        final boolean containsKey = this.containsKey(o);
        if (containsKey && nqb.E(o2, this.get(o))) {
            return o2;
        }
        njo.i(this.containsValue(o2) ^ true, "value already present: %s", o2);
        final Object put = this.a.put(o, o2);
        this.j(o, containsKey, put, o2);
        return put;
    }
    
    @Override
    public final void putAll(final Map map) {
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public final Object remove(final Object o) {
        if (this.containsKey(o)) {
            return this.f(o);
        }
        return null;
    }
}
