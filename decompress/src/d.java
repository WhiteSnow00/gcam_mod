import java.util.Iterator;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d
{
    public static final d a;
    public final Map b;
    private final Map c;
    
    static {
        a = new d();
    }
    
    public d() {
        this.c = new HashMap();
        this.b = new HashMap();
    }
    
    private static final void d(final Map map, final c c, final g g, final Class clazz) {
        final g g2 = map.get(c);
        if (g2 != null && g != g2) {
            final Method b = c.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(b.getName());
            sb.append(" in ");
            sb.append(clazz.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(g2);
            sb.append(", new value ");
            sb.append(g);
            throw new IllegalArgumentException(sb.toString());
        }
        if (g2 == null) {
            map.put(c, g);
        }
    }
    
    public final b a(final Class clazz, final Method[] array) {
        final Class superclass = clazz.getSuperclass();
        final HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(this.b(superclass).b);
        }
        final Class[] interfaces = clazz.getInterfaces();
        for (int length = interfaces.length, i = 0; i < length; ++i) {
            for (final Map.Entry<c, V> entry : this.b(interfaces[i]).b.entrySet()) {
                d(hashMap, entry.getKey(), (g)entry.getValue(), clazz);
            }
        }
        Method[] c;
        if ((c = array) == null) {
            c = this.c(clazz);
        }
        final int length2 = c.length;
        int j = 0;
        boolean b = false;
        while (j < length2) {
            final Method method = c[j];
            final v v = method.getAnnotation(v.class);
            if (v != null) {
                final Class<?>[] parameterTypes = method.getParameterTypes();
                final int length3 = parameterTypes.length;
                int n;
                if (length3 > 0) {
                    if (!parameterTypes[0].isAssignableFrom(k.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    n = 1;
                }
                else {
                    n = 0;
                }
                final g a = v.a();
                if (length3 > 1) {
                    if (!parameterTypes[1].isAssignableFrom(g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (a != g.g) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    n = 2;
                }
                if (length3 > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(hashMap, new c(n, method), a, clazz);
                b = true;
            }
            ++j;
        }
        final b b2 = new b(hashMap);
        this.c.put(clazz, b2);
        this.b.put(clazz, b);
        return b2;
    }
    
    public final b b(final Class clazz) {
        final b b = this.c.get(clazz);
        if (b != null) {
            return b;
        }
        return this.a(clazz, null);
    }
    
    public final Method[] c(final Class clazz) {
        try {
            return clazz.getDeclaredMethods();
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
        }
    }
}
