import android.content.pm.Signature;
import android.os.IBinder;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pjf
{
    public static int a;
    public static oud b;
    public static volatile Boolean c;
    private static Context d;
    
    public static onk D(final Object o) {
        return ((oky)o).aA;
    }
    
    public static void E(final Object o, final onk aa) {
        ((oky)o).aA = aa;
    }
    
    public static final void G(final Object o) {
        D(o).d();
    }
    
    public static String H(final ojw ojw) {
        final StringBuilder sb = new StringBuilder(ojw.d());
        for (int i = 0; i < ojw.d(); ++i) {
            final byte a = ojw.a(i);
            switch (a) {
                default: {
                    if (a >= 32 && a <= 126) {
                        sb.append((char)a);
                        break;
                    }
                    sb.append('\\');
                    sb.append((char)((a >>> 6 & 0x3) + 48));
                    sb.append((char)((a >>> 3 & 0x7) + 48));
                    sb.append((char)((a & 0x7) + 48));
                    break;
                }
                case 92: {
                    sb.append("\\\\");
                    break;
                }
                case 39: {
                    sb.append("\\'");
                    break;
                }
                case 34: {
                    sb.append("\\\"");
                    break;
                }
                case 13: {
                    sb.append("\\r");
                    break;
                }
                case 12: {
                    sb.append("\\f");
                    break;
                }
                case 11: {
                    sb.append("\\v");
                    break;
                }
                case 10: {
                    sb.append("\\n");
                    break;
                }
                case 9: {
                    sb.append("\\t");
                    break;
                }
                case 8: {
                    sb.append("\\b");
                    break;
                }
                case 7: {
                    sb.append("\\a");
                    break;
                }
            }
        }
        return sb.toString();
    }
    
    public static int a(int n) {
        if (n >= 0) {
            if (n < 3) {
                ++n;
            }
            else {
                if (n < 1073741824) {
                    return (int)(n / 0.75f + 1.0f);
                }
                n = Integer.MAX_VALUE;
            }
        }
        return n;
    }
    
    public static final List b(final Object o) {
        final List<Object> singletonList = Collections.singletonList(o);
        singletonList.getClass();
        return singletonList;
    }
    
    public static int c(final List list) {
        list.getClass();
        return list.size() - 1;
    }
    
    public static List d(final List list) {
        switch (list.size()) {
            default: {
                return list;
            }
            case 1: {
                return b(list.get(0));
            }
            case 0: {
                return pja.a;
            }
        }
    }
    
    public static void e() {
        throw new ArithmeticException("Index overflow has happened.");
    }
    
    public static int f(final List list, final int n) {
        final int c = c(list);
        if (n >= 0 && c >= n) {
            return c(list) - n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(n);
        sb.append(" must be in range [");
        sb.append(new pmc(0, c(list)));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public static Object g(final List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public static Object h(final List list, final int n) {
        list.getClass();
        if (n >= 0 && n <= c(list)) {
            return list.get(n);
        }
        return null;
    }
    
    public static List i(final Collection collection, final Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            final ArrayList list = new ArrayList(collection.size() + ((Collection)iterable).size());
            list.addAll(collection);
            list.addAll((Collection)iterable);
            return list;
        }
        final ArrayList list2 = new ArrayList(collection);
        n(list2, iterable);
        return list2;
    }
    
    public static List j(final Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            final Collection collection = (Collection)iterable;
            List list = null;
            switch (collection.size()) {
                default: {
                    list = k(collection);
                    break;
                }
                case 1: {
                    Object o;
                    if (iterable instanceof List) {
                        o = ((List<Object>)iterable).get(0);
                    }
                    else {
                        o = iterable.iterator().next();
                    }
                    list = b(o);
                    break;
                }
                case 0: {
                    list = pja.a;
                    break;
                }
            }
            return list;
        }
        iterable.getClass();
        final ArrayList list2 = new ArrayList();
        r(iterable, list2);
        return d(list2);
    }
    
    public static List k(final Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }
    
    public static Set l(final Iterable iterable) {
        Set<Object> set2 = null;
        switch (((Collection)iterable).size()) {
            default: {
                final LinkedHashSet set = new LinkedHashSet(a(((Collection)iterable).size()));
                r(iterable, set);
                set2 = set;
                break;
            }
            case 1: {
                set2 = Collections.singleton((Object)((List<T>)iterable).get(0));
                ((LinkedHashSet)set2).getClass();
                break;
            }
            case 0: {
                set2 = pjc.a;
                break;
            }
        }
        return set2;
    }
    
    public static pml m(final Iterable iterable) {
        iterable.getClass();
        return new piy(iterable);
    }
    
    public static void n(final Collection collection, final Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection)iterable);
            return;
        }
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            collection.add(iterator.next());
        }
    }
    
    public static int o(final Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection)iterable).size();
        }
        return 10;
    }
    
    public static void p(final Iterable iterable, final Appendable appendable, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, int n, final CharSequence charSequence4, final pky pky) {
        iterable.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        appendable.append(charSequence2);
        final Iterator iterator = iterable.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (++n2 > 1) {
                appendable.append(charSequence);
            }
            if (n >= 0 && n2 > 0) {
                n = 0;
                break;
            }
            if (pky != null) {
                appendable.append((CharSequence)pky.a(next));
            }
            else if (next != null && !(next instanceof CharSequence)) {
                if (next instanceof Character) {
                    appendable.append((char)next);
                }
                else {
                    appendable.append(String.valueOf(next));
                }
            }
            else {
                appendable.append((CharSequence)next);
            }
        }
        if (n >= 0 && n2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }
    
    public static void r(final Iterable iterable, final Collection collection) {
        iterable.getClass();
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            collection.add(iterator.next());
        }
    }
    
    public static List s(final Object[] array) {
        array.getClass();
        final List<Object> list = Arrays.asList(array);
        list.getClass();
        return list;
    }
    
    public static Set t(final Object[] array) {
        final LinkedHashSet set = new LinkedHashSet(a(3));
        for (int i = 0; i < 3; ++i) {
            set.add(array[i]);
        }
        return set;
    }
    
    public static pml u(final Object[] array) {
        return new pix(array);
    }
    
    public static final pim w(final Object o, final Object o2) {
        return new pim(o, o2);
    }
    
    public static Context x(final Context context) {
        if (pjf.d == null) {
            final int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            if (vrCoreClientApiVersion >= 9) {
                try {
                    pjf.d = context.createPackageContext("com.google.vr.vrcore", 3);
                    pjf.a = vrCoreClientApiVersion;
                    return pjf.d;
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    throw new otd(1);
                }
            }
            throw new otd(4);
        }
        return pjf.d;
    }
    
    public static IBinder y(final ClassLoader classLoader) {
        try {
            return (IBinder)classLoader.loadClass("com.google.vr.vrcore.library.VrCreator").newInstance();
        }
        catch (final IllegalAccessException ex) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.vrcore.library.VrCreator");
        }
        catch (final InstantiationException ex2) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.vrcore.library.VrCreator");
        }
        catch (final ClassNotFoundException ex3) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.vrcore.library.VrCreator");
        }
    }
    
    public static boolean z(final Context context) {
        synchronized (pjf.class) {
            if (pjf.c == null) {
                try {
                    pjf.c = otc.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), otc.c, otc.d, otc.b);
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    throw new IllegalStateException("Unable to find self package info", (Throwable)ex);
                }
            }
            return pjf.c;
        }
    }
    
    public final boolean A(final Object o, final omu omu) {
        final int d = omu.d();
        final int a = onx.a(d);
        switch (onx.b(d)) {
            default: {
                throw olm.a();
            }
            case 5: {
                ((onk)o).e(onx.c(a, 5), omu.f());
                return true;
            }
            case 4: {
                return false;
            }
            case 3: {
                final int c = onx.c(a, 4);
                final onk c2 = onk.c();
                while (omu.c() != Integer.MAX_VALUE && this.A(c2, omu)) {}
                if (c == omu.d()) {
                    c2.d();
                    ((onk)o).e(onx.c(a, 3), c2);
                    return true;
                }
                throw olm.b();
            }
            case 2: {
                B(o, a, omu.q());
                return true;
            }
            case 1: {
                ((onk)o).e(onx.c(a, 1), omu.k());
                return true;
            }
            case 0: {
                C(o, a, omu.l());
                return true;
            }
        }
    }
}
