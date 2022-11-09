// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.lang.reflect.Array;

public final class ArrayCreatingInputMerger extends aiu
{
    private static final Object c(final Object o, final Object o2) {
        final int length = Array.getLength(o);
        final Object instance = Array.newInstance(o2.getClass(), length + 1);
        System.arraycopy(o, 0, instance, 0, length);
        Array.set(instance, length, o2);
        return instance;
    }
    
    @Override
    public final aiq a(final List list) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            for (final Map.Entry<String, V> entry : ((aiq)iterator.next()).b().entrySet()) {
                final String s = entry.getKey();
                final V value = entry.getValue();
                final Class<?> class1 = value.getClass();
                final Object value2 = hashMap2.get(s);
                Object o;
                if (value2 == null) {
                    o = value;
                    if (!class1.isArray()) {
                        o = Array.newInstance(value.getClass(), 1);
                        Array.set(o, 0, value);
                    }
                }
                else {
                    final Class<?> class2 = value2.getClass();
                    if (class2.equals(class1)) {
                        if (class2.isArray()) {
                            final int length = Array.getLength(value2);
                            final int length2 = Array.getLength(value);
                            o = Array.newInstance(value2.getClass().getComponentType(), length + length2);
                            System.arraycopy(value2, 0, o, 0, length);
                            System.arraycopy(value, 0, o, length, length2);
                        }
                        else {
                            o = Array.newInstance(value2.getClass(), 2);
                            Array.set(o, 0, value2);
                            Array.set(o, 1, value);
                        }
                    }
                    else if (class2.isArray() && class2.getComponentType().equals(class1)) {
                        o = c(value2, value);
                    }
                    else {
                        if (!class1.isArray() || !class1.getComponentType().equals(class2)) {
                            throw new IllegalArgumentException();
                        }
                        o = c(value, value2);
                    }
                }
                hashMap2.put(s, o);
            }
        }
        cwx.d(hashMap2, hashMap);
        return cwx.c(hashMap);
    }
}
