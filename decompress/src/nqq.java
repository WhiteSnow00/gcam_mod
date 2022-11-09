import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nqq extends nnx
{
    public static final nnx a;
    private static final long serialVersionUID = 0L;
    final transient Object[] b;
    public final transient int c;
    private final transient Object d;
    
    static {
        a = new nqq(null, new Object[0], 0);
    }
    
    private nqq(final Object d, final Object[] b, final int c) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    static nqq a(final int n, final Object[] array) {
        if (n == 0) {
            return (nqq)nqq.a;
        }
        if (n == 1) {
            nqb.A(array[0], array[1]);
            return new nqq(null, array, 1);
        }
        njo.w(n, array.length >> 1);
        return new nqq(f(array, n, noi.B(n), 0), array, n);
    }
    
    static Object f(final Object[] array, final int n, int i, final int n2) {
        if (n == 1) {
            nqb.A(array[n2], array[n2 ^ 0x1]);
            return null;
        }
        final int n3 = i - 1;
        final int n4 = 0;
        final int n5 = 0;
        final int n6 = 0;
        if (i <= 128) {
            final byte[] array2 = new byte[i];
            Arrays.fill(array2, (byte)(-1));
            int n7;
            Object o;
            Object o2;
            int j;
            int n8;
            for (i = n6; i < n; ++i) {
                n7 = i + i + n2;
                o = array[n7];
                o2 = array[n7 ^ 0x1];
                nqb.A(o, o2);
                j = nov.j(o.hashCode());
                while (true) {
                    j &= n3;
                    n8 = (array2[j] & 0xFF);
                    if (n8 == 255) {
                        array2[j] = (byte)n7;
                        break;
                    }
                    if (array[n8].equals(o)) {
                        throw j(o, o2, array, n8);
                    }
                    ++j;
                }
            }
            return array2;
        }
        if (i <= 32768) {
            final short[] array3 = new short[i];
            Arrays.fill(array3, (short)(-1));
            int n9;
            Object o3;
            Object o4;
            int k;
            char c;
            for (i = n4; i < n; ++i) {
                n9 = i + i + n2;
                o3 = array[n9];
                o4 = array[n9 ^ 0x1];
                nqb.A(o3, o4);
                k = nov.j(o3.hashCode());
                while (true) {
                    k &= n3;
                    c = (char)array3[k];
                    if (c == '\uffff') {
                        array3[k] = (short)n9;
                        break;
                    }
                    if (array[c].equals(o3)) {
                        throw j(o3, o4, array, c);
                    }
                    ++k;
                }
            }
            return array3;
        }
        final int[] array4 = new int[i];
        Arrays.fill(array4, -1);
        int n10;
        Object o5;
        Object o6;
        int l;
        int n11;
        for (i = n5; i < n; ++i) {
            n10 = i + i + n2;
            o5 = array[n10];
            o6 = array[n10 ^ 0x1];
            nqb.A(o5, o6);
            l = nov.j(o5.hashCode());
            while (true) {
                l &= n3;
                n11 = array4[l];
                if (n11 == -1) {
                    array4[l] = n10;
                    break;
                }
                if (array[n11].equals(o5)) {
                    throw j(o5, o6, array, n11);
                }
                ++l;
            }
        }
        return array4;
    }
    
    static Object g(final Object o, final Object[] array, int n, int n2, final Object o2) {
        if (o2 == null) {
            return null;
        }
        if (n == 1) {
            if (array[n2].equals(o2)) {
                return array[n2 ^ 0x1];
            }
            return null;
        }
        else {
            if (o == null) {
                return null;
            }
            if (o instanceof byte[]) {
                final byte[] array2 = (byte[])o;
                n2 = array2.length;
                n = nov.j(o2.hashCode());
                while (true) {
                    n &= n2 - 1;
                    final int n3 = array2[n] & 0xFF;
                    if (n3 == 255) {
                        return null;
                    }
                    if (array[n3].equals(o2)) {
                        return array[n3 ^ 0x1];
                    }
                    ++n;
                }
            }
            else if (o instanceof short[]) {
                final short[] array3 = (short[])o;
                n2 = array3.length;
                n = nov.j(o2.hashCode());
                while (true) {
                    n &= n2 - 1;
                    final char c = (char)array3[n];
                    if (c == '\uffff') {
                        return null;
                    }
                    if (array[c].equals(o2)) {
                        return array[c ^ '\u0001'];
                    }
                    ++n;
                }
            }
            else {
                final int[] array4 = (int[])o;
                n2 = array4.length;
                n = nov.j(o2.hashCode());
                while (true) {
                    n &= n2 - 1;
                    final int n4 = array4[n];
                    if (n4 == -1) {
                        return null;
                    }
                    if (array[n4].equals(o2)) {
                        return array[n4 ^ 0x1];
                    }
                    ++n;
                }
            }
        }
    }
    
    private static IllegalArgumentException j(final Object o, final Object o2, final Object[] array, final int n) {
        final String value = String.valueOf(o);
        final String value2 = String.valueOf(o2);
        final String value3 = String.valueOf(array[n]);
        final String value4 = String.valueOf(array[n ^ 0x1]);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 39 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(value);
        sb.append("=");
        sb.append(value2);
        sb.append(" and ");
        sb.append(value3);
        sb.append("=");
        sb.append(value4);
        return new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final noi bP() {
        return new nqn(this, this.b, 0, this.c);
    }
    
    @Override
    public final noi bQ() {
        return new nqo(this, new nqp(this.b, 0, this.c));
    }
    
    @Override
    public final boolean bS() {
        return false;
    }
    
    @Override
    public final Object get(final Object o) {
        return g(this.d, this.b, this.c, 0, o);
    }
    
    @Override
    public final nnj h() {
        return new nqp(this.b, 1, this.c);
    }
    
    @Override
    public final int size() {
        return this.c;
    }
}
