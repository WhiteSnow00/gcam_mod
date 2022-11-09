import java.lang.reflect.Array;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.SortedMap;
import java.util.Set;
import java.util.NavigableSet;
import java.util.NavigableMap;
import java.util.Map;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.NetworkCapabilities;
import android.net.Network;
import android.net.ConnectivityManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nrr
{
    static void A(final Object... array) {
        z(array, array.length);
    }
    
    public static int B(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        int n = 1;
        if (connectivityManager != null && context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            final Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                final NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(13)) {
                        if (connectivityManager.isActiveNetworkMetered()) {
                            return 2;
                        }
                        n = 3;
                    }
                }
            }
        }
        return n;
    }
    
    public static niz C(final PackageManager packageManager, final Intent intent, final boolean b) {
        final ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 851968);
        if (resolveActivity == null) {
            return nii.a;
        }
        final ActivityInfo activityInfo = resolveActivity.activityInfo;
        if (activityInfo.name != null && activityInfo.name.endsWith("ResolverActivity")) {
            if (b) {
                final List queryIntentActivities = packageManager.queryIntentActivities(intent, 851968);
                niz niz = nii.a;
                for (final ResolveInfo resolveInfo : queryIntentActivities) {
                    if ((resolveInfo.activityInfo.applicationInfo.flags & 0x1) != 0x0) {
                        if (niz.g()) {
                            return nii.a;
                        }
                        niz = niz.i(resolveInfo.activityInfo.applicationInfo);
                    }
                }
                return niz;
            }
            return nii.a;
        }
        return niz.i(resolveActivity.activityInfo.applicationInfo);
    }
    
    public static boolean D(final liy liy, final liz liz) {
        final boolean g = liy.g;
        boolean b = false;
        if (g && !Build.ID.startsWith("RQ2")) {
            if (liz.e()) {
                if (Build.ID.startsWith("RP1")) {
                    return b;
                }
                if (Build.ID.startsWith("RD1")) {
                    return false;
                }
            }
            b = true;
            return b;
        }
        return false;
    }
    
    public static Object E(final Class clazz, final noi noi) {
        if (noi != null && !noi.isEmpty()) {
            return clazz.cast(Proxy.newProxyInstance(clazz.getClassLoader(), new Class[] { clazz }, new jcv(noi)));
        }
        return null;
    }
    
    public static krc F(final ivj ivj) {
        ivj.F(true);
        return new ivi(ivj);
    }
    
    public static final ivc G(final iuk iuk, final List list) {
        final ivc ivc = new ivc(iuk);
        list.add(ivc);
        return ivc;
    }
    
    public static boolean H(final cxl cxl) {
        return cxl.k(cyl.a);
    }
    
    static int a(final int n, final nrs nrs) {
        switch (n - 1) {
            default: {
                return 1;
            }
            case 0: {
                return nrs.b;
            }
        }
    }
    
    static long b(final int n, final nrs nrs) {
        switch (n - 1) {
            default: {
                if (nrs == null) {
                    return 0L;
                }
                return nrs.c;
            }
            case 0: {
                if (nrs == null) {
                    return 0L;
                }
                return nrs.d;
            }
        }
    }
    
    public static Map.Entry c(final Map.Entry entry, final Object o) {
        if (entry == null) {
            return null;
        }
        return new nre(entry, o);
    }
    
    public static NavigableMap d(final NavigableMap navigableMap, final Object o) {
        return new nrg(navigableMap, o);
    }
    
    static NavigableSet e(final NavigableSet set, final Object o) {
        return new nrh(set, o);
    }
    
    static Set f(final Set set, final Object o) {
        return new nrk(set, o);
    }
    
    static SortedMap g(final SortedMap sortedMap, final Object o) {
        return new nrl(sortedMap, o);
    }
    
    public static SortedSet h(final SortedSet set, final Object o) {
        return new nrm(set, o);
    }
    
    public static Object i(final nps nps) {
        if (nps == null) {
            return null;
        }
        return nps.b();
    }
    
    public static Object j(final nps nps) {
        if (nps != null) {
            return nps.b();
        }
        throw new NoSuchElementException();
    }
    
    public static boolean k(final Comparator comparator, final Iterable iterable) {
        comparator.getClass();
        iterable.getClass();
        Comparator comparator2;
        if (iterable instanceof SortedSet) {
            if ((comparator2 = ((SortedSet)iterable).comparator()) == null) {
                comparator2 = nqc.a;
            }
        }
        else {
            if (!(iterable instanceof nqz)) {
                return false;
            }
            comparator2 = ((nqz)iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
    
    static int l(final Set set) {
        final Iterator iterator = set.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            }
            else {
                hashCode = 0;
            }
            n += hashCode;
        }
        return n;
    }
    
    public static HashSet m() {
        return new HashSet();
    }
    
    public static NavigableSet n(final NavigableSet set) {
        if (!(set instanceof nnj) && !(set instanceof nqx)) {
            return new nqx(set);
        }
        return set;
    }
    
    public static Set o() {
        return Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
    }
    
    static boolean p(final Set set, final Collection collection) {
        collection.getClass();
        Object f = collection;
        if (collection instanceof npt) {
            f = ((npt)collection).f();
        }
        if (f instanceof Set && ((Collection)f).size() > set.size()) {
            final Iterator iterator = set.iterator();
            ((Collection)f).getClass();
            boolean b = false;
            while (iterator.hasNext()) {
                if (((Collection)f).contains(iterator.next())) {
                    iterator.remove();
                    b = true;
                }
            }
            return b;
        }
        return q(set, ((Collection)f).iterator());
    }
    
    static boolean q(final Set set, final Iterator iterator) {
        boolean b = false;
        while (iterator.hasNext()) {
            b |= set.remove(iterator.next());
        }
        return b;
    }
    
    static nqv r(final Class clazz, final String s) {
        try {
            return new nqv(clazz.getDeclaredField(s));
        }
        catch (final NoSuchFieldException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    static void s(final Map map, final ObjectInputStream objectInputStream, final int n) {
        for (int i = 0; i < n; ++i) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }
    
    static void t(final npq npq, final ObjectInputStream objectInputStream, final int n) {
        for (int i = 0; i < n; ++i) {
            final Collection b = npq.b(objectInputStream.readObject());
            for (int int1 = objectInputStream.readInt(), j = 0; j < int1; ++j) {
                b.add(objectInputStream.readObject());
            }
        }
    }
    
    static void u(final Map map, final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }
    
    static void v(final npq npq, final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(npq.q().size());
        for (final Map.Entry<Object, V> entry : npq.q().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection)entry.getValue()).size());
            final Iterator iterator2 = ((Collection)entry.getValue()).iterator();
            while (iterator2.hasNext()) {
                objectOutputStream.writeObject(iterator2.next());
            }
        }
    }
    
    static Object[] w(final Object[] array, final int n) {
        return (Object[])Array.newInstance(array.getClass().getComponentType(), n);
    }
    
    static Object[] x(final Collection collection, final Object[] array) {
        final int size = collection.size();
        Object[] w = array;
        if (array.length < size) {
            w = w(array, size);
        }
        final Iterator iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            w[n] = iterator.next();
            ++n;
        }
        if (w.length > size) {
            w[size] = null;
        }
        return w;
    }
    
    static void y(final Object o, final int n) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(n);
        throw new NullPointerException(sb.toString());
    }
    
    static void z(final Object[] array, final int n) {
        for (int i = 0; i < n; ++i) {
            y(array[i], i);
        }
    }
}
