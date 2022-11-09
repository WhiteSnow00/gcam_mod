import java.io.Serializable;
import java.util.RandomAccess;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nqb
{
    static void A(final Object o, final Object o2) {
        if (o == null) {
            final String value = String.valueOf(o2);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 24);
            sb.append("null key in entry: null=");
            sb.append(value);
            throw new NullPointerException(sb.toString());
        }
        if (o2 != null) {
            return;
        }
        final String value2 = String.valueOf(o);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(value2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }
    
    static void B(final boolean b) {
        njo.p(b, "no calls to next() since the last call to remove()");
    }
    
    public static void C(final int n, final String s) {
        if (n >= 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder(s.length() + 40);
        sb.append(s);
        sb.append(" cannot be negative but was: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    static int D(final boolean b) {
        if (b) {
            return 2;
        }
        return 1;
    }
    
    public static boolean E(final Object o, final Object o2) {
        boolean b = false;
        if (o != o2) {
            if (o == null) {
                return b;
            }
            if (!o.equals(o2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    public static nps a(final Object o, final int n) {
        return new npy(o, n);
    }
    
    public static nra b(final nra nra) {
        nra.getClass();
        return new nrx(nra);
    }
    
    public static Iterator c(final npt npt) {
        return new npz(npt, npt.g().iterator());
    }
    
    static int d(final int n) {
        if (n < 3) {
            C(n, "expectedSize");
            return n + 1;
        }
        if (n < 1073741824) {
            return (int)(n / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
    
    public static nnx e(final Map map) {
        final Iterator iterator = map.entrySet().iterator();
        if (!iterator.hasNext()) {
            return nqq.a;
        }
        final Map.Entry<Enum, V> entry = (Map.Entry<Enum, V>)iterator.next();
        final Enum enum1 = entry.getKey();
        final V value = entry.getValue();
        A(enum1, value);
        final EnumMap enumMap = new EnumMap<Enum, Object>(enum1.getDeclaringClass());
        enumMap.put(enum1, value);
        while (iterator.hasNext()) {
            final Map.Entry<Enum, V> entry2 = (Map.Entry<Enum, V>)iterator.next();
            final Enum enum2 = entry2.getKey();
            final V value2 = entry2.getValue();
            A(enum2, value2);
            enumMap.put(enum2, value2);
        }
        nnx nnx = null;
        switch (enumMap.size()) {
            default: {
                nnx = new nnm(enumMap);
                break;
            }
            case 1: {
                final Map.Entry entry3 = (Map.Entry)nov.f(enumMap.entrySet());
                nnx = nnx.o(entry3.getKey(), entry3.getValue());
                break;
            }
            case 0: {
                nnx = nqq.a;
                break;
            }
        }
        return nnx;
    }
    
    static Object f(final Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }
    
    static Object g(final Map map, final Object o) {
        map.getClass();
        try {
            return map.get(o);
        }
        catch (final NullPointerException ex) {}
        catch (final ClassCastException ex2) {}
        return null;
    }
    
    public static HashMap h(final int n) {
        return new HashMap(d(n));
    }
    
    static Iterator i(final Iterator iterator) {
        return new npi(iterator);
    }
    
    static Iterator j(final Iterator iterator) {
        return new npj(iterator);
    }
    
    public static Map.Entry k(final Object o, final Object o2) {
        return new nnk(o, o2);
    }
    
    static Map.Entry l(final Map.Entry entry) {
        entry.getClass();
        return new npk(entry);
    }
    
    public static ArrayList m() {
        return new ArrayList();
    }
    
    public static ArrayList n(final Iterable iterable) {
        iterable.getClass();
        ArrayList o;
        if (iterable instanceof Collection) {
            o = new ArrayList((Collection<?>)iterable);
        }
        else {
            o = o(iterable.iterator());
        }
        return o;
    }
    
    public static ArrayList o(final Iterator iterator) {
        final ArrayList m = m();
        z(m, iterator);
        return m;
    }
    
    @SafeVarargs
    public static ArrayList p(final Object... array) {
        array.getClass();
        final int length = array.length;
        C(length, "arraySize");
        final ArrayList list = new ArrayList<Object>(ofi.C(length + 5L + length / 10));
        Collections.addAll((Collection<? super Object>)list, array);
        return list;
    }
    
    public static ArrayList q(final int n) {
        C(n, "initialArraySize");
        return new ArrayList(n);
    }
    
    public static List r(final List list) {
        if (list instanceof nns) {
            return ((nns)list).a();
        }
        if (list instanceof npd) {
            return ((npd)list).a;
        }
        if (list instanceof RandomAccess) {
            return new npb(list);
        }
        return new npd(list);
    }
    
    public static List s(final List list, final nir nir) {
        Serializable s;
        if (list instanceof RandomAccess) {
            s = new npf(list, nir);
        }
        else {
            s = new nph(list, nir);
        }
        return (List)s;
    }
    
    public static boolean t(final List list, final Object o) {
        if (o == list) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        final List list2 = (List)o;
        final int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; ++i) {
                if (!E(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        final Iterator iterator = list.iterator();
        final Iterator iterator2 = list2.iterator();
        while (iterator.hasNext()) {
            if (iterator2.hasNext()) {
                if (E(iterator.next(), iterator2.next())) {
                    continue;
                }
            }
            return false;
        }
        if (!iterator2.hasNext()) {
            return true;
        }
        return false;
    }
    
    public static int u(final Iterator iterator, final int n) {
        iterator.getClass();
        int n2 = 0;
        njo.e(n >= 0, "numberToAdvance must be nonnegative");
        while (n2 < n && iterator.hasNext()) {
            iterator.next();
            ++n2;
        }
        return n2;
    }
    
    public static nrv v(final Iterator iterator) {
        iterator.getClass();
        if (iterator instanceof nrv) {
            return (nrv)iterator;
        }
        return new now(iterator);
    }
    
    public static Object w(final Iterator iterator) {
        Object next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }
    
    public static Object x(final Iterator iterator, final Object o) {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return o;
    }
    
    static void y(final Iterator iterator) {
        iterator.getClass();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
    
    public static boolean z(final Collection collection, final Iterator iterator) {
        collection.getClass();
        iterator.getClass();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= collection.add(iterator.next());
        }
        return b;
    }
}
