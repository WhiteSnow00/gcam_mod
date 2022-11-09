import java.lang.reflect.Array;
import java.util.Iterator;
import java.io.PrintStream;
import java.util.ConcurrentModificationException;
import java.util.Set;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yw implements Collection, Set
{
    private static Object[] c;
    private static int d;
    private static Object[] e;
    private static int f;
    private static final Object g;
    private static final Object h;
    Object[] a;
    int b;
    private int[] i;
    
    static {
        g = new Object();
        h = new Object();
    }
    
    public yw() {
        this.i = yx.a;
        this.a = yx.b;
        this.b = 0;
    }
    
    private final int d(int a) {
        try {
            a = yx.a(this.i, this.b, a);
            return a;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    private final int e(final Object o, final int n) {
        final int b = this.b;
        if (b == 0) {
            return -1;
        }
        final int d = this.d(n);
        if (d < 0) {
            return d;
        }
        if (o.equals(this.a[d])) {
            return d;
        }
        int n2;
        for (n2 = d + 1; n2 < b && this.i[n2] == n; ++n2) {
            if (o.equals(this.a[n2])) {
                return n2;
            }
        }
        for (int n3 = d - 1; n3 >= 0 && this.i[n3] == n; --n3) {
            if (o.equals(this.a[n3])) {
                return n3;
            }
        }
        return ~n2;
    }
    
    private final int f() {
        final int b = this.b;
        if (b == 0) {
            return -1;
        }
        int d = this.d(0);
        if (d < 0) {
            return d;
        }
        if (this.a[d] == null) {
            return d;
        }
        int n;
        for (n = d + 1; n < b && this.i[n] == 0; ++n) {
            if (this.a[n] == null) {
                return n;
            }
        }
        --d;
        while (d >= 0 && this.i[d] == 0) {
            if (this.a[d] == null) {
                return d;
            }
            --d;
        }
        return ~n;
    }
    
    private final void g(final int n) {
        int n2 = 0;
        Label_0310: {
            if (n == 8) {
                synchronized (yw.h) {
                    final Object[] e = yw.e;
                    if (e != null) {
                        try {
                            this.a = e;
                            yw.e = (Object[])e[0];
                            final int[] i = (int[])e[1];
                            this.i = i;
                            if (i != null) {
                                e[0] = (e[1] = null);
                                --yw.f;
                                return;
                            }
                        }
                        catch (final ClassCastException ex) {}
                        final PrintStream out = System.out;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("ArraySet Found corrupt ArraySet cache: [0]=");
                        sb.append(e[0]);
                        sb.append(" [1]=");
                        sb.append(e[1]);
                        out.println(sb.toString());
                        yw.e = null;
                        yw.f = 0;
                    }
                    monitorexit(yw.h);
                    n2 = n;
                    break Label_0310;
                }
            }
            if ((n2 = n) == 4) {
                synchronized (yw.g) {
                    final Object[] c = yw.c;
                    if (c != null) {
                        try {
                            this.a = c;
                            yw.c = (Object[])c[0];
                            final int[] j = (int[])c[1];
                            this.i = j;
                            if (j != null) {
                                c[0] = (c[1] = null);
                                --yw.d;
                                return;
                            }
                        }
                        catch (final ClassCastException ex2) {}
                        final PrintStream out2 = System.out;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("ArraySet Found corrupt ArraySet cache: [0]=");
                        sb2.append(c[0]);
                        sb2.append(" [1]=");
                        sb2.append(c[1]);
                        out2.println(sb2.toString());
                        yw.c = null;
                        yw.d = 0;
                    }
                    monitorexit(yw.g);
                    n2 = 4;
                }
            }
        }
        this.i = new int[n2];
        this.a = new Object[n2];
    }
    
    private static void h(final int[] array, final Object[] array2, int i) {
        final int length = array.length;
        if (length == 8) {
            synchronized (yw.h) {
                if (yw.f < 10) {
                    array2[0] = yw.e;
                    array2[1] = array;
                    --i;
                    while (i >= 2) {
                        array2[i] = null;
                        --i;
                    }
                    yw.e = array2;
                    ++yw.f;
                }
                return;
            }
        }
        if (length == 4) {
            synchronized (yw.g) {
                if (yw.d < 10) {
                    array2[0] = yw.c;
                    array2[1] = array;
                    --i;
                    while (i >= 2) {
                        array2[i] = null;
                        --i;
                    }
                    yw.c = array2;
                    ++yw.d;
                }
            }
        }
    }
    
    public final int a(final Object o) {
        int n;
        if (o == null) {
            n = this.f();
        }
        else {
            n = this.e(o, o.hashCode());
        }
        return n;
    }
    
    @Override
    public final boolean add(final Object o) {
        final int b = this.b;
        int n;
        int hashCode;
        if (o == null) {
            n = this.f();
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n = this.e(o, hashCode);
        }
        if (n >= 0) {
            return false;
        }
        final int n2 = ~n;
        final int[] i = this.i;
        final int length = i.length;
        if (b >= length) {
            int n3 = 4;
            if (b >= 8) {
                n3 = (b >> 1) + b;
            }
            else if (b >= 4) {
                n3 = 8;
            }
            final Object[] a = this.a;
            this.g(n3);
            if (b != this.b) {
                throw new ConcurrentModificationException();
            }
            final int[] j = this.i;
            if (j.length > 0) {
                System.arraycopy(i, 0, j, 0, length);
                System.arraycopy(a, 0, this.a, 0, a.length);
            }
            h(i, a, b);
        }
        if (n2 < b) {
            final int[] k = this.i;
            final int n4 = n2 + 1;
            final int n5 = b - n2;
            System.arraycopy(k, n2, k, n4, n5);
            final Object[] a2 = this.a;
            System.arraycopy(a2, n2, a2, n4, n5);
        }
        final int b2 = this.b;
        if (b == b2) {
            final int[] l = this.i;
            if (n2 < l.length) {
                l[n2] = hashCode;
                this.a[n2] = o;
                this.b = b2 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        final int n = this.b + collection.size();
        final int b = this.b;
        final int[] i = this.i;
        final int length = i.length;
        boolean b2 = false;
        if (length < n) {
            final Object[] a = this.a;
            this.g(n);
            final int b3 = this.b;
            if (b3 > 0) {
                System.arraycopy(i, 0, this.i, 0, b3);
                System.arraycopy(a, 0, this.a, 0, this.b);
            }
            h(i, a, this.b);
        }
        if (this.b == b) {
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                b2 |= this.add(iterator.next());
            }
            return b2;
        }
        throw new ConcurrentModificationException();
    }
    
    public final Object b(final int n) {
        return this.a[n];
    }
    
    public final void c(final int n) {
        final int b = this.b;
        final Object[] a = this.a;
        final Object o = a[n];
        if (b <= 1) {
            this.clear();
            return;
        }
        final int b2 = b - 1;
        final int[] i = this.i;
        final int length = i.length;
        int n2 = 8;
        if (length > 8 && b < length / 3) {
            if (b > 8) {
                n2 = b + (b >> 1);
            }
            this.g(n2);
            if (n > 0) {
                System.arraycopy(i, 0, this.i, 0, n);
                System.arraycopy(a, 0, this.a, 0, n);
            }
            if (n < b2) {
                final int n3 = n + 1;
                final int n4 = b2 - n;
                System.arraycopy(i, n3, this.i, n, n4);
                System.arraycopy(a, n3, this.a, n, n4);
            }
        }
        else {
            if (n < b2) {
                final int n5 = n + 1;
                final int n6 = b2 - n;
                System.arraycopy(i, n5, i, n, n6);
                final Object[] a2 = this.a;
                System.arraycopy(a2, n5, a2, n, n6);
            }
            this.a[b2] = null;
        }
        if (b == this.b) {
            this.b = b2;
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final void clear() {
        final int b = this.b;
        if (b != 0) {
            final int[] i = this.i;
            final Object[] a = this.a;
            this.i = yx.a;
            this.a = yx.b;
            this.b = 0;
            h(i, a, b);
        }
        if (this.b == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a(o) >= 0;
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Set) {
            final Set set = (Set)o;
            if (this.b == set.size()) {
                int i = 0;
                try {
                    while (i < this.b) {
                        if (!set.contains(this.b(i))) {
                            return false;
                        }
                        ++i;
                    }
                    return true;
                }
                catch (final ClassCastException ex) {
                    return false;
                }
                catch (final NullPointerException ex2) {}
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int[] i = this.i;
        final int b = this.b;
        int j = 0;
        int n = 0;
        while (j < b) {
            n += i[j];
            ++j;
        }
        return n;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.b <= 0;
    }
    
    @Override
    public final Iterator iterator() {
        return new yv(this);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int a = this.a(o);
        if (a >= 0) {
            this.c(a);
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.remove(iterator.next());
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        int i = this.b - 1;
        boolean b = false;
        while (i >= 0) {
            if (!collection.contains(this.a[i])) {
                this.c(i);
                b = true;
            }
            --i;
        }
        return b;
    }
    
    @Override
    public final int size() {
        return this.b;
    }
    
    @Override
    public final Object[] toArray() {
        final int b = this.b;
        final Object[] array = new Object[b];
        System.arraycopy(this.a, 0, array, 0, b);
        return array;
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        Object[] array2 = array;
        if (array.length < this.b) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), this.b);
        }
        System.arraycopy(this.a, 0, array2, 0, this.b);
        final int length = array2.length;
        final int b = this.b;
        if (length > b) {
            array2[b] = null;
        }
        return array2;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i = 0; i < this.b; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object b = this.b(i);
            if (b != this) {
                sb.append(b);
            }
            else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
