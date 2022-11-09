import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import android.arch.lifecycle.CompositeGeneratedAdaptersObserver;
import android.arch.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.util.List;
import android.arch.lifecycle.ReflectiveGenericLifecycleObserver;
import android.arch.lifecycle.FullLifecycleObserverAdapter;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o
{
    private static final Map a;
    private static final Map b;
    
    static {
        a = new HashMap();
        b = new HashMap();
    }
    
    static j a(final Object o) {
        final boolean b = o instanceof j;
        final boolean b2 = o instanceof e;
        if (b && b2) {
            return new FullLifecycleObserverAdapter((e)o, (j)o);
        }
        if (b2) {
            return new FullLifecycleObserverAdapter((e)o, null);
        }
        if (b) {
            return (j)o;
        }
        final Class<?> class1 = o.getClass();
        if (b(class1) != 2) {
            return new ReflectiveGenericLifecycleObserver(o);
        }
        final List list = o.b.get(class1);
        final int size = list.size();
        int i = 0;
        if (size == 1) {
            return new SingleGeneratedAdapterObserver(c((Constructor)list.get(0), o));
        }
        final f[] array = new f[list.size()];
        while (i < list.size()) {
            array[i] = c((Constructor)list.get(i), o);
            ++i;
        }
        return new CompositeGeneratedAdaptersObserver(array);
    }
    
    private static int b(final Class clazz) {
        final Integer n = o.a.get(clazz);
        if (n == null) {
            final String canonicalName = clazz.getCanonicalName();
            final int n2 = 2;
            int n3 = 0;
            Label_0536: {
                if (canonicalName == null) {
                    n3 = 1;
                }
                else {
                    final List list = null;
                    final int n4 = 0;
                    Constructor<?> declaredConstructor;
                    try {
                        final Package package1 = clazz.getPackage();
                        final String canonicalName2 = clazz.getCanonicalName();
                        String name;
                        if (package1 != null) {
                            name = package1.getName();
                        }
                        else {
                            name = "";
                        }
                        String substring = canonicalName2;
                        if (!name.isEmpty()) {
                            substring = canonicalName2.substring(name.length() + 1);
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append(substring.replace(".", "_"));
                        sb.append("_LifecycleAdapter");
                        final String string = sb.toString();
                        String string2;
                        if (name.isEmpty()) {
                            string2 = string;
                        }
                        else {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(name);
                            sb2.append(".");
                            sb2.append(string);
                            string2 = sb2.toString();
                        }
                        final Constructor<?> constructor = declaredConstructor = Class.forName(string2).getDeclaredConstructor(clazz);
                        if (!constructor.isAccessible()) {
                            constructor.setAccessible(true);
                            declaredConstructor = constructor;
                        }
                    }
                    catch (final NoSuchMethodException ex) {
                        throw new RuntimeException(ex);
                    }
                    catch (final ClassNotFoundException ex2) {
                        declaredConstructor = null;
                    }
                    if (declaredConstructor != null) {
                        o.b.put(clazz, Collections.singletonList(declaredConstructor));
                        n3 = n2;
                    }
                    else {
                        final d a = d.a;
                        final Boolean b = a.b.get(clazz);
                        if (b != null) {
                            if (b) {
                                n3 = 1;
                                break Label_0536;
                            }
                        }
                        else {
                            final Method[] c = a.c(clazz);
                            for (int length = c.length, i = 0; i < length; ++i) {
                                if (c[i].getAnnotation(v.class) != null) {
                                    a.a(clazz, c);
                                    n3 = 1;
                                    break Label_0536;
                                }
                            }
                            a.b.put(clazz, false);
                        }
                        final Class superclass = clazz.getSuperclass();
                        List list2;
                        if (d(superclass)) {
                            if (b(superclass) == 1) {
                                n3 = 1;
                                break Label_0536;
                            }
                            list2 = new ArrayList(o.b.get(superclass));
                        }
                        else {
                            list2 = list;
                        }
                        final Class[] interfaces = clazz.getInterfaces();
                        for (int length2 = interfaces.length, j = n4; j < length2; ++j) {
                            final Class clazz2 = interfaces[j];
                            if (d(clazz2)) {
                                if (b(clazz2) == 1) {
                                    n3 = 1;
                                    break Label_0536;
                                }
                                List list3;
                                if ((list3 = list2) == null) {
                                    list3 = new ArrayList();
                                }
                                list3.addAll(o.b.get(clazz2));
                                list2 = list3;
                            }
                        }
                        if (list2 != null) {
                            o.b.put(clazz, list2);
                            n3 = n2;
                        }
                        else {
                            n3 = 1;
                        }
                    }
                }
            }
            o.a.put(clazz, n3);
            return n3;
        }
        return n;
    }
    
    private static f c(final Constructor constructor, final Object o) {
        try {
            return constructor.newInstance(o);
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException(ex);
        }
        catch (final InstantiationException ex2) {
            throw new RuntimeException(ex2);
        }
        catch (final IllegalAccessException ex3) {
            throw new RuntimeException(ex3);
        }
    }
    
    private static boolean d(final Class clazz) {
        return clazz != null && adj.class.isAssignableFrom(clazz);
    }
}
