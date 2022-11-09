import java.util.Arrays;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ntn
{
    public static final Locale a;
    
    static {
        a = Locale.ROOT;
    }
    
    public static String a(Object o, final RuntimeException ex) {
        String s;
        try {
            s = ex.toString();
        }
        catch (final RuntimeException ex) {
            s = ex.getClass().getSimpleName();
        }
        final String name = o.getClass().getName();
        final int identityHashCode = System.identityHashCode(o);
        o = new StringBuilder(String.valueOf(name).length() + 16 + String.valueOf(s).length());
        ((StringBuilder)o).append("{");
        ((StringBuilder)o).append(name);
        ((StringBuilder)o).append("@");
        ((StringBuilder)o).append(identityHashCode);
        ((StringBuilder)o).append(": ");
        ((StringBuilder)o).append(s);
        ((StringBuilder)o).append("}");
        return ((StringBuilder)o).toString();
    }
    
    public static String b(Object o) {
        Label_0197: {
            if (o == null) {
                break Label_0197;
            }
            try {
                if (!o.getClass().isArray()) {
                    o = String.valueOf(o);
                }
                else if (o instanceof int[]) {
                    o = Arrays.toString((int[])o);
                }
                else if (o instanceof long[]) {
                    o = Arrays.toString((long[])o);
                }
                else if (o instanceof byte[]) {
                    o = Arrays.toString((byte[])o);
                }
                else if (o instanceof char[]) {
                    o = Arrays.toString((char[])o);
                }
                else if (o instanceof short[]) {
                    o = Arrays.toString((short[])o);
                }
                else if (o instanceof float[]) {
                    o = Arrays.toString((float[])o);
                }
                else if (o instanceof double[]) {
                    o = Arrays.toString((double[])o);
                }
                else if (o instanceof boolean[]) {
                    o = Arrays.toString((boolean[])o);
                }
                else {
                    o = Arrays.toString((Object[])o);
                }
                return (String)o;
                o = "null";
                return (String)o;
            }
            catch (final RuntimeException ex) {
                return a(o, ex);
            }
        }
    }
    
    public static void c(final StringBuilder sb, final long n, final boolean b) {
        if (n == 0L) {
            sb.append("0");
            return;
        }
        String s;
        if (!b) {
            s = "0123456789abcdef";
        }
        else {
            s = "0123456789ABCDEF";
        }
        for (int i = 63 - Long.numberOfLeadingZeros(n) & 0xFFFFFFFC; i >= 0; i -= 4) {
            sb.append(s.charAt((int)(n >>> i & 0xFL)));
        }
    }
}
