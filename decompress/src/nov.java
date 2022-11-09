import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.RandomAccess;
import java.lang.reflect.Array;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.RectF;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public class nov
{
    public static void A(final boolean b) {
        if (b) {
            return;
        }
        throw new njv();
    }
    
    public static void B(final boolean b, final String s, final Object o) {
        if (b) {
            return;
        }
        throw new njv(njo.b(s, o));
    }
    
    public static void C(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new njv(njo.b(s, array));
    }
    
    public static void D(final boolean b, final String s, final Object o, final Object o2) {
        if (b) {
            return;
        }
        throw new njv(njo.b(s, o, o2));
    }
    
    public static void E(final Object o, final String s, final Object... array) {
        if (o != null) {
            return;
        }
        throw new njv(njo.b(s, array));
    }
    
    public static njp F(final njp njp) {
        if (!(njp instanceof njr) && !(njp instanceof njq)) {
            njp njp2;
            if (njp instanceof Serializable) {
                njp2 = new njq(njp);
            }
            else {
                njp2 = new njr(njp);
            }
            return njp2;
        }
        return njp;
    }
    
    public static njp G(final Object o) {
        return new njs(o);
    }
    
    public static boolean H(final CharSequence charSequence, final CharSequence charSequence2) {
        final int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; ++i) {
                final char char1 = charSequence.charAt(i);
                final char char2 = charSequence2.charAt(i);
                if (char1 != char2) {
                    final int o = O(char1);
                    if (o >= 26 || o != O(char2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean I(final char c) {
        return c >= 'a' && c <= 'z';
    }
    
    public static RectF J(final TabLayout tabLayout, final View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.t && view instanceof ngk) {
            final ngk ngk = (ngk)view;
            final TextView a = ngk.a;
            final int n = 0;
            final ImageView b = ngk.b;
            int i = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            while (i < 3) {
                final View view2 = (new View[] { (View)a, (View)b, null })[i];
                if (view2 != null && view2.getVisibility() == 0) {
                    if (n4 != 0) {
                        n3 = Math.min(n3, view2.getLeft());
                    }
                    else {
                        n3 = view2.getLeft();
                    }
                    if (n4 != 0) {
                        n2 = Math.max(n2, view2.getRight());
                    }
                    else {
                        n2 = view2.getRight();
                    }
                    n4 = 1;
                }
                ++i;
            }
            final int n5 = n2 - n3;
            final TextView a2 = ngk.a;
            final ImageView b2 = ngk.b;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            for (int j = n; j < 3; ++j) {
                final View view3 = (new View[] { (View)a2, (View)b2, null })[j];
                if (view3 != null && view3.getVisibility() == 0) {
                    if (n8 != 0) {
                        n7 = Math.min(n7, view3.getTop());
                    }
                    else {
                        n7 = view3.getTop();
                    }
                    if (n8 != 0) {
                        n6 = Math.max(n6, view3.getBottom());
                    }
                    else {
                        n6 = view3.getBottom();
                    }
                    n8 = 1;
                }
            }
            int n9 = (int)neq.a(ngk.getContext(), 24);
            if (n5 >= n9) {
                n9 = n5;
            }
            final int n10 = (ngk.getLeft() + ngk.getRight()) / 2;
            final int n11 = (ngk.getTop() + ngk.getBottom()) / 2;
            final int n12 = n9 / 2;
            return new RectF((float)(n10 - n12), (float)(n11 - (n6 - n7) / 2), (float)(n12 + n10), (float)(n11 + n10 / 2));
        }
        return new RectF((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom());
    }
    
    private static Object K(final List list) {
        return list.get(list.size() - 1);
    }
    
    private static Collection L(final Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection)iterable;
        }
        return nqb.o(iterable.iterator());
    }
    
    private static void M(final List list, final njc njc, final int n, int i) {
        for (int j = list.size() - 1; j > i; --j) {
            if (njc.a(list.get(j))) {
                list.remove(j);
            }
        }
        --i;
        while (i >= n) {
            list.remove(i);
            --i;
        }
    }
    
    private static void N(final List list, final njc njc) {
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            final Object value = list.get(i);
            int n2 = n;
            if (!njc.a(value)) {
                if (i > n) {
                    try {
                        list.set(n, value);
                    }
                    catch (final IllegalArgumentException ex) {
                        M(list, njc, n, i);
                        return;
                    }
                    catch (final UnsupportedOperationException ex2) {
                        M(list, njc, n, i);
                        return;
                    }
                }
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        list.subList(n, list.size()).clear();
    }
    
    private static int O(final char c) {
        return (char)((c | ' ') - 97);
    }
    
    public static Object b(final Iterable iterable, final int n) {
        iterable.getClass();
        Object o;
        if (iterable instanceof List) {
            o = ((List<Object>)iterable).get(n);
        }
        else {
            final Iterator<Object> iterator = iterable.iterator();
            final int u = nqb.u(iterator, n);
            if (!iterator.hasNext()) {
                final StringBuilder sb = new StringBuilder(91);
                sb.append("position (");
                sb.append(n);
                sb.append(") must be less than the number of elements that remained (");
                sb.append(u);
                sb.append(")");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            o = iterator.next();
        }
        return o;
    }
    
    public static Object c(final Iterable iterable, final Object o) {
        return nqb.x(iterable.iterator(), o);
    }
    
    public static Object d(final Iterable iterable) {
        if (!(iterable instanceof List)) {
            return nqb.w(iterable.iterator());
        }
        if (!((List)iterable).isEmpty()) {
            return K((List)iterable);
        }
        throw new NoSuchElementException();
    }
    
    public static Object e(final Iterable iterable, final Object o) {
        if (((Collection)iterable).isEmpty()) {
            return o;
        }
        if (iterable instanceof List) {
            return K((List)iterable);
        }
        final Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            return nqb.w(iterator);
        }
        return o;
    }
    
    public static Object f(final Iterable iterable) {
        final Iterator iterator = iterable.iterator();
        final Object next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int n = 0; n < 4 && iterator.hasNext(); ++n) {
            sb.append(", ");
            sb.append(iterator.next());
        }
        if (iterator.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static Object[] g(final Iterable iterable) {
        return L(iterable).toArray();
    }
    
    public static Object[] h(final Iterable iterable, final Class clazz) {
        return L(iterable).toArray((Object[])Array.newInstance(clazz, 0));
    }
    
    public static void i(final Iterable iterable, final njc njc) {
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            njc.getClass();
            N((List)iterable, njc);
            return;
        }
        final Iterator iterator = iterable.iterator();
        njc.getClass();
        while (iterator.hasNext()) {
            if (njc.a(iterator.next())) {
                iterator.remove();
            }
        }
    }
    
    static int j(final int n) {
        return (int)(Integer.rotateLeft((int)(n * -862048943L), 15) * 461845907L);
    }
    
    static int k(final Object o) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return j(hashCode);
    }
    
    static int l(int max) {
        max = Math.max(max, 2);
        final int highestOneBit = Integer.highestOneBit(max);
        if (max <= highestOneBit) {
            return highestOneBit;
        }
        max = highestOneBit + highestOneBit;
        if (max > 0) {
            return max;
        }
        return 1073741824;
    }
    
    static int m(final int n, final int n2) {
        return n & ~n2;
    }
    
    static int n(final int n, final int n2, final int n3) {
        return (n & ~n3) | (n2 & n3);
    }
    
    static int o(final int n) {
        int n2;
        if (n < 32) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        return n2 * (n + 1);
    }
    
    static int p(final Object o, final Object o2, final int n, final Object o3, final int[] array, final Object[] array2, final Object[] array3) {
        final int k = k(o);
        final int n2 = k & n;
        int q = q(o3, n2);
        if (q == 0) {
            return -1;
        }
        final int m = m(k, n);
        int n3 = -1;
        while (true) {
            --q;
            final int n4 = array[q];
            if (m(n4, n) == m && nqb.E(o, array2[q]) && (array3 == null || nqb.E(o2, array3[q]))) {
                final int n5 = n4 & n;
                if (n3 == -1) {
                    u(o3, n2, n5);
                }
                else {
                    array[n3] = n(array[n3], n5, n);
                }
                return q;
            }
            final int n6 = n4 & n;
            if (n6 == 0) {
                return -1;
            }
            n3 = q;
            q = n6;
        }
    }
    
    static int q(final Object o, final int n) {
        if (o instanceof byte[]) {
            return ((byte[])o)[n] & 0xFF;
        }
        if (o instanceof short[]) {
            return (char)((short[])o)[n];
        }
        return ((int[])o)[n];
    }
    
    static int r(final int n) {
        return Math.max(4, l(n + 1));
    }
    
    static Object s(final int n) {
        if (n < 2 || n > 1073741824 || Integer.highestOneBit(n) != n) {
            final StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n <= 256) {
            return new byte[n];
        }
        if (n <= 65536) {
            return new short[n];
        }
        return new int[n];
    }
    
    static void t(final Object o) {
        if (o instanceof byte[]) {
            Arrays.fill((byte[])o, (byte)0);
            return;
        }
        if (o instanceof short[]) {
            Arrays.fill((short[])o, (short)0);
            return;
        }
        Arrays.fill((int[])o, 0);
    }
    
    static void u(final Object o, final int n, final int n2) {
        if (o instanceof byte[]) {
            ((byte[])o)[n] = (byte)n2;
            return;
        }
        if (o instanceof short[]) {
            ((short[])o)[n] = (short)n2;
            return;
        }
        ((int[])o)[n] = n2;
    }
    
    static StringBuilder v(final int n) {
        nqb.C(n, "size");
        return new StringBuilder((int)Math.min(n * 8L, 1073741824L));
    }
    
    public static Collection w(final Collection collection, final njc njc) {
        collection.getClass();
        njc.getClass();
        return new nlh(collection, njc);
    }
    
    static boolean x(final Collection collection, final Collection collection2) {
        final Iterator iterator = collection2.iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    static boolean y(final Collection collection, final Object o) {
        collection.getClass();
        try {
            return collection.contains(o);
        }
        catch (final NullPointerException ex) {}
        catch (final ClassCastException ex2) {}
        return false;
    }
    
    public static Object z(final Object o) {
        E(o, "expected a non-null reference", new Object[0]);
        return o;
    }
    
    public void a(final TabLayout tabLayout, final View view, final View view2, final float n, final Drawable drawable) {
        final RectF j = J(tabLayout, view);
        final RectF i = J(tabLayout, view2);
        drawable.setBounds(ncj.a((int)j.left, (int)i.left, n), drawable.getBounds().top, ncj.a((int)j.right, (int)i.right, n), drawable.getBounds().bottom);
    }
}
