import java.util.Collection;
import java.util.Iterator;
import j$.util.function.BiConsumer;
import java.util.Set;
import j$.util.function.Function;
import j$.util.Map$_CC;
import j$.util.function.BiFunction;
import java.lang.reflect.Array;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class yu extends zb implements Map, j$.util.Map
{
    yo a;
    yq b;
    ys c;
    
    public yu() {
    }
    
    public yu(final int n) {
        super(n);
    }
    
    final Object[] a(final Object[] array, final int n) {
        final int j = this.j;
        Object[] array2 = array;
        if (array.length < j) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), j);
        }
        for (int i = 0; i < j; ++i) {
            array2[i] = this.i[i + i + n];
        }
        if (array2.length > j) {
            array2[j] = null;
        }
        return array2;
    }
    
    @Override
    public final Set entrySet() {
        yo a;
        if ((a = this.a) == null) {
            a = new yo(this);
            this.a = a;
        }
        return a;
    }
    
    @Override
    public final Set keySet() {
        yq b;
        if ((b = this.b) == null) {
            b = new yq(this);
            this.b = b;
        }
        return b;
    }
    
    @Override
    public final void putAll(final Map map) {
        this.j(this.j + map.size());
        for (final Entry<Object, V> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public final Collection values() {
        ys c;
        if ((c = this.c) == null) {
            c = new ys(this);
            this.c = c;
        }
        return c;
    }
}
