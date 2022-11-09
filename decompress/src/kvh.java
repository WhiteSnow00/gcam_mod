import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvh
{
    private static final Charset h;
    private static final int[] i;
    public final short a;
    public final short b;
    public boolean c;
    public int d;
    public int e;
    public Object f;
    public int g;
    
    static {
        h = Charset.forName("US-ASCII");
        final int[] j = new int[11];
        (i = j)[2] = (j[1] = 1);
        j[3] = 2;
        j[4] = 4;
        j[5] = 8;
        j[7] = 1;
        j[9] = 4;
        j[10] = 8;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    }
    
    public kvh(final short n, final short n2, final int d, final int e, final boolean c) {
        this.a = n;
        this.b = n2;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = null;
    }
    
    public static String c(final short n) {
        switch (n) {
            default: {
                return "";
            }
            case 10: {
                return "RATIONAL";
            }
            case 9: {
                return "LONG";
            }
            case 7: {
                return "UNDEFINED";
            }
            case 5: {
                return "UNSIGNED_RATIONAL";
            }
            case 4: {
                return "UNSIGNED_LONG";
            }
            case 3: {
                return "UNSIGNED_SHORT";
            }
            case 2: {
                return "ASCII";
            }
            case 1: {
                return "UNSIGNED_BYTE";
            }
        }
    }
    
    public static boolean f(final int n) {
        return n == 0 || n == 1 || n == 2 || n == 3 || n == 4;
    }
    
    public static boolean g(final short n) {
        return n == 1 || n == 2 || n == 3 || n == 4 || n == 5 || n == 7 || n == 9 || n == 10;
    }
    
    private final boolean p(final int n) {
        return this.c && this.d != n;
    }
    
    public final int a() {
        return this.d * kvh.i[this.b];
    }
    
    public final long b(final int n) {
        final Object f = this.f;
        if (f instanceof long[]) {
            return ((long[])f)[n];
        }
        if (f instanceof byte[]) {
            return ((byte[])f)[n];
        }
        final String c = c(this.b);
        String concat;
        if (c.length() != 0) {
            concat = "Cannot get integer value from ".concat(c);
        }
        else {
            concat = new String("Cannot get integer value from ");
        }
        throw new IllegalArgumentException(concat);
    }
    
    public final String d() {
        final Object f = this.f;
        String s = null;
        if (f == null) {
            return null;
        }
        if (f instanceof String) {
            return (String)f;
        }
        if (f instanceof byte[]) {
            final byte[] array = (byte[])f;
            final int n = array.length - 1;
            byte[] copy = array;
            if (array[n] == 0) {
                copy = Arrays.copyOf(array, n);
            }
            s = new String(copy, kvh.h);
        }
        return s;
    }
    
    public final boolean e() {
        return this.f != null;
    }
    
    @Override
    public final boolean equals(Object f) {
        if (f == null) {
            return false;
        }
        if (!(f instanceof kvh)) {
            return false;
        }
        final kvh kvh = (kvh)f;
        if (kvh.a != this.a || kvh.d != this.d || kvh.b != this.b) {
            return false;
        }
        f = this.f;
        if (f == null) {
            return kvh.f == null;
        }
        final Object f2 = kvh.f;
        if (f2 == null) {
            return false;
        }
        if (f instanceof long[]) {
            return f2 instanceof long[] && Arrays.equals((long[])f, (long[])f2);
        }
        if (f instanceof krb[]) {
            return f2 instanceof krb[] && Arrays.equals((Object[])f, (Object[])f2);
        }
        if (f instanceof byte[]) {
            return f2 instanceof byte[] && Arrays.equals((byte[])f, (byte[])f2);
        }
        return f.equals(f2);
    }
    
    public final boolean h(final int n) {
        return this.k(new int[] { n });
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g });
    }
    
    public final boolean i(final String s) {
        final short b = this.b;
        if (b != 2 && b != 7) {
            return false;
        }
        final byte[] bytes = s.getBytes(kvh.h);
        final int length = bytes.length;
        byte[] copy;
        if (length > 0) {
            copy = bytes;
            if (bytes[length - 1] != 0) {
                copy = bytes;
                if (this.b != 7) {
                    copy = Arrays.copyOf(bytes, length + 1);
                }
            }
        }
        else {
            copy = bytes;
            if (this.b == 2) {
                copy = bytes;
                if (this.d == 1) {
                    copy = new byte[] { 0 };
                }
            }
        }
        final int length2 = copy.length;
        if (this.p(length2)) {
            return false;
        }
        this.d = length2;
        this.f = copy;
        return true;
    }
    
    public final boolean j(final byte[] array) {
        final int length = array.length;
        if (!this.p(length)) {
            final short b = this.b;
            if (b == 1 || b == 7) {
                System.arraycopy(array, 0, this.f = new byte[length], 0, length);
                this.d = length;
                return true;
            }
        }
        return false;
    }
    
    public final boolean k(final int[] array) {
        final int length = array.length;
        final boolean p = this.p(length);
        final int n = 0;
        if (p) {
            return false;
        }
        final short b = this.b;
        if (b != 3) {
            if (b != 9) {
                if (b != 4) {
                    return false;
                }
            }
        }
        else {
            for (final int n2 : array) {
                if (n2 > 65535 || n2 < 0) {
                    return false;
                }
            }
        }
        if (this.b == 4) {
            for (int length2 = array.length, j = 0; j < length2; ++j) {
                if (array[j] < 0) {
                    return false;
                }
            }
        }
        final long[] f = new long[array.length];
        int n3 = n;
        int length3;
        while (true) {
            length3 = array.length;
            if (n3 >= length3) {
                break;
            }
            f[n3] = array[n3];
            ++n3;
        }
        this.f = f;
        this.d = length3;
        return true;
    }
    
    public final boolean l(final long[] f) {
        final int length = f.length;
        if (!this.p(length) && this.b == 4) {
            for (final long n : f) {
                if (n < 0L || n > 4294967295L) {
                    return false;
                }
            }
            this.f = f;
            this.d = f.length;
            return true;
        }
        return false;
    }
    
    public final boolean m(final krb[] f) {
        final int length = f.length;
        if (this.p(length)) {
            return false;
        }
        final short b = this.b;
        if (b != 5) {
            if (b != 10) {
                return false;
            }
        }
        else {
            int i = 0;
            while (i < length) {
                final krb krb = f[i];
                final long a = krb.a;
                if (a >= 0L) {
                    final long b2 = krb.b;
                    if (b2 >= 0L && a <= 4294967295L) {
                        if (b2 <= 4294967295L) {
                            ++i;
                            continue;
                        }
                    }
                }
                return false;
            }
        }
        if (this.b == 10) {
            final int length2 = f.length;
            int j = 0;
            while (j < length2) {
                final krb krb2 = f[j];
                final long a2 = krb2.a;
                if (a2 >= -2147483648L) {
                    final long b3 = krb2.b;
                    if (b3 >= -2147483648L && a2 <= 2147483647L) {
                        if (b3 <= 2147483647L) {
                            ++j;
                            continue;
                        }
                    }
                }
                return false;
            }
        }
        this.f = f;
        this.d = f.length;
        return true;
    }
    
    public final int[] n() {
        final Object f = this.f;
        int[] array = null;
        if (f == null) {
            return null;
        }
        if (f instanceof long[]) {
            final long[] array2 = (long[])f;
            final int[] array3 = new int[array2.length];
            int n = 0;
            while (true) {
                array = array3;
                if (n >= array2.length) {
                    break;
                }
                array3[n] = (int)array2[n];
                ++n;
            }
        }
        return array;
    }
    
    public final long o() {
        final Object f = this.f;
        long[] array;
        if (f instanceof long[]) {
            array = (long[])f;
        }
        else {
            array = null;
        }
        if (array != null && array.length > 0) {
            return array[0];
        }
        return 0L;
    }
    
    @Override
    public final String toString() {
        final String format = String.format("tag id: %04X\n", this.a);
        final int e = this.e;
        final String c = c(this.b);
        final int d = this.d;
        final int g = this.g;
        final Object f = this.f;
        String s = "";
        if (f != null) {
            if (f instanceof byte[]) {
                if (this.b == 2) {
                    s = new String((byte[])f, kvh.h);
                }
                else {
                    s = Arrays.toString((byte[])f);
                }
            }
            else if (f instanceof long[]) {
                final long[] array = (long[])f;
                if (array.length == 1) {
                    s = String.valueOf(array[0]);
                }
                else {
                    s = Arrays.toString(array);
                }
            }
            else if (f instanceof Object[]) {
                final Object[] array2 = (Object[])f;
                if (array2.length == 1) {
                    final Object o = array2[0];
                    if (o != null) {
                        s = o.toString();
                    }
                }
                else {
                    s = Arrays.toString(array2);
                }
            }
            else {
                s = f.toString();
            }
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 74 + c.length() + String.valueOf(s).length());
        sb.append(format);
        sb.append("ifd id: ");
        sb.append(e);
        sb.append("\ntype: ");
        sb.append(c);
        sb.append("\ncount: ");
        sb.append(d);
        sb.append("\noffset: ");
        sb.append(g);
        sb.append("\nvalue: ");
        sb.append(s);
        sb.append("\n");
        return sb.toString();
    }
}
