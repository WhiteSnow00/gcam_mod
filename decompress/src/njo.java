import java.util.logging.Level;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public class njo
{
    public static String b(final String s, final Object... array) {
        final int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = array.length;
            if (n2 >= length) {
                break;
            }
            final Object o = array[n2];
            String s2;
            if (o == null) {
                s2 = "null";
            }
            else {
                try {
                    s2 = o.toString();
                }
                catch (final Exception ex) {
                    final String name = o.getClass().getName();
                    final String hexString = Integer.toHexString(System.identityHashCode(o));
                    final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    final String string = sb.toString();
                    final Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    final Level warning = Level.WARNING;
                    final String value = String.valueOf(string);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Exception during lenientFormat for ".concat(value);
                    }
                    else {
                        concat = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(warning, "com.google.common.base.Strings", "lenientToString", concat, ex);
                    final String name2 = ex.getClass().getName();
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 9 + String.valueOf(name2).length());
                    sb2.append("<");
                    sb2.append(string);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    s2 = sb2.toString();
                }
            }
            array[n2] = s2;
            ++n2;
        }
        final StringBuilder sb3 = new StringBuilder(s.length() + length * 16);
        int n3 = 0;
        int n4 = n;
        int length2;
        while (true) {
            length2 = array.length;
            if (n4 >= length2) {
                break;
            }
            final int index = s.indexOf("%s", n3);
            if (index == -1) {
                break;
            }
            sb3.append(s, n3, index);
            sb3.append(array[n4]);
            n3 = index + 2;
            ++n4;
        }
        sb3.append(s, n3, s.length());
        if (n4 < length2) {
            sb3.append(" [");
            final int n5 = n4 + 1;
            sb3.append(array[n4]);
            for (int i = n5; i < array.length; ++i) {
                sb3.append(", ");
                sb3.append(array[i]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
    
    public static String c(final String s, final int n) {
        s.getClass();
        if (s.length() >= n) {
            return s;
        }
        final StringBuilder sb = new StringBuilder(n);
        for (int i = s.length(); i < n; ++i) {
            sb.append('0');
        }
        sb.append(s);
        return sb.toString();
    }
    
    public static void d(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void e(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(o));
    }
    
    public static void f(final boolean b, final String s, final char c) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(b(s, c));
    }
    
    public static void g(final boolean b, final String s, final int n) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(b(s, n));
    }
    
    public static void h(final boolean b, final String s, final long n) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(b(s, n));
    }
    
    public static void i(final boolean b, final String s, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(b(s, o));
    }
    
    public static void j(final boolean b, final String s, final int n, final int n2) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(b(s, n, n2));
    }
    
    public static void k(final boolean b, final String s, final long n, final long n2) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(b(s, n, n2));
    }
    
    public static void l(final boolean b, final String s, final Object o, final Object o2) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(b(s, o, o2));
    }
    
    public static void m(final boolean b, final String s, final Object o, final Object o2, final Object o3) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(b(s, o, o2, o3));
    }
    
    public static void n(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = b("end index (%s) must not be less than start index (%s)", n2, n);
            }
            else {
                s = y(n2, n3, "end index");
            }
        }
        else {
            s = y(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void o(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void p(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(o));
    }
    
    public static void q(final boolean b, final String s, final int n) {
        if (b) {
            return;
        }
        throw new IllegalStateException(b(s, n));
    }
    
    public static void r(final boolean b, final String s, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(b(s, o));
    }
    
    public static void s(final boolean b, final String s, final Object o, final Object o2) {
        if (b) {
            return;
        }
        throw new IllegalStateException(b(s, o, o2));
    }
    
    public static void t(final boolean b, final String s, final Object o, final Object o2, final Object o3) {
        if (b) {
            return;
        }
        throw new IllegalStateException(b(s, o, o2, o3));
    }
    
    public static void u(final boolean b, final String s, final Object o, final Object o2, final Object o3, final Object o4) {
        if (b) {
            return;
        }
        throw new IllegalStateException(b(s, o, o2, o3, o4));
    }
    
    public static void v(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                final StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(n2);
                throw new IllegalArgumentException(sb.toString());
            }
            s = b("%s (%s) must be less than size (%s)", "index", n, n2);
        }
        else {
            s = b("%s (%s) must not be negative", "index", n);
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void w(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return;
        }
        throw new IndexOutOfBoundsException(y(n, n2, "index"));
    }
    
    public static ney x(final ney ney, final float n) {
        if (ney instanceof nff) {
            return ney;
        }
        return new nex(n, ney);
    }
    
    private static String y(final int n, final int n2, final String s) {
        if (n < 0) {
            return b("%s (%s) must not be negative", s, n);
        }
        if (n2 >= 0) {
            return b("%s (%s) must not be greater than size (%s)", s, n, n2);
        }
        final StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void a(final nfq nfq, final float n, final float n2) {
    }
}
