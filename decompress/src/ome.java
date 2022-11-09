import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ome extends LinkedHashMap
{
    public static final ome a;
    public boolean b;
    
    static {
        (a = new ome()).c();
    }
    
    private ome() {
        this.b = true;
    }
    
    private ome(final Map map) {
        super(map);
        this.b = true;
    }
    
    private static int d(final Object o) {
        if (o instanceof byte[]) {
            return olk.b((byte[])o);
        }
        if (!(o instanceof olb)) {
            return o.hashCode();
        }
        throw new UnsupportedOperationException();
    }
    
    public final ome a() {
        ome ome;
        if (this.isEmpty()) {
            ome = new ome();
        }
        else {
            ome = new ome(this);
        }
        return ome;
    }
    
    public final void b() {
        if (this.b) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public final void c() {
        this.b = false;
    }
    
    @Override
    public final void clear() {
        this.b();
        super.clear();
    }
    
    @Override
    public final Set entrySet() {
        Object o;
        if (this.isEmpty()) {
            o = Collections.emptySet();
        }
        else {
            o = super.entrySet();
        }
        return (Set)o;
    }
    
    @Override
    public final boolean equals(Object value) {
        if (value instanceof Map) {
            final Map map = (Map)value;
            if (this != map) {
                if (this.size() != map.size()) {
                    return false;
                }
                for (final Map.Entry<Object, V> entry : this.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        return false;
                    }
                    value = entry.getValue();
                    final Object value2 = map.get(entry.getKey());
                    boolean b;
                    if (value instanceof byte[] && value2 instanceof byte[]) {
                        b = Arrays.equals((byte[])value, (byte[])value2);
                    }
                    else {
                        b = value.equals(value2);
                    }
                    if (!b) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Iterator<Map.Entry<Object, Object>> iterator = this.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry entry = iterator.next();
            n += (d(entry.getValue()) ^ d(entry.getKey()));
        }
        return n;
    }
    
    @Override
    public final Object put(final Object o, final Object o2) {
        this.b();
        olk.h(o);
        olk.h(o2);
        return super.put(o, o2);
    }
    
    @Override
    public final void putAll(final Map map) {
        this.b();
        for (final Object next : map.keySet()) {
            olk.h(next);
            olk.h(map.get(next));
        }
        super.putAll(map);
    }
    
    @Override
    public final Object remove(final Object o) {
        this.b();
        return super.remove(o);
    }
}
