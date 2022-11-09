import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class plr
{
    private plr() {
    }
    
    public static String a(final String s, final Object o) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(o);
        return sb.toString();
    }
    
    public static boolean b(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            if (o2 == null) {
                return true;
            }
            equals = false;
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    public static int c(int n) {
        if (n < 48) {
            n = -1;
        }
        else {
            if (n == 48) {
                return 0;
            }
            n = 1;
        }
        return n;
    }
    
    static void d(final Throwable t, final String s) {
        final StackTraceElement[] stackTrace = t.getStackTrace();
        final int length = stackTrace.length;
        int n = -1;
        for (int i = 0; i < length; ++i) {
            if (s.equals(stackTrace[i].getClassName())) {
                n = i;
            }
        }
        t.setStackTrace(Arrays.copyOfRange(stackTrace, n + 1, length));
    }
    
    public static void e() {
        final pit pit = new pit((byte[])null);
        d(pit, plr.class.getName());
        throw pit;
    }
    
    public static final Class f(final pmd pmd) {
        pmd.getClass();
        final Class a = ((pln)pmd).a();
        if (!a.isPrimitive()) {
            if (a != null) {
                return a;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
        else {
            final String name = a.getName();
            Serializable s = a;
            if (name != null) {
                switch (name.hashCode()) {
                    default: {
                        s = a;
                        break;
                    }
                    case 109413500: {
                        s = a;
                        if (name.equals("short")) {
                            s = Short.class;
                            break;
                        }
                        break;
                    }
                    case 97526364: {
                        s = a;
                        if (name.equals("float")) {
                            s = Float.class;
                            break;
                        }
                        break;
                    }
                    case 64711720: {
                        s = a;
                        if (name.equals("boolean")) {
                            s = Boolean.class;
                            break;
                        }
                        break;
                    }
                    case 3625364: {
                        s = a;
                        if (name.equals("void")) {
                            s = Void.class;
                            break;
                        }
                        break;
                    }
                    case 3327612: {
                        s = a;
                        if (name.equals("long")) {
                            s = Long.class;
                            break;
                        }
                        break;
                    }
                    case 3052374: {
                        s = a;
                        if (name.equals("char")) {
                            s = Character.class;
                            break;
                        }
                        break;
                    }
                    case 3039496: {
                        s = a;
                        if (name.equals("byte")) {
                            s = Byte.class;
                            break;
                        }
                        break;
                    }
                    case 104431: {
                        s = a;
                        if (name.equals("int")) {
                            s = Integer.class;
                            break;
                        }
                        break;
                    }
                    case -1325958191: {
                        s = a;
                        if (name.equals("double")) {
                            s = Double.class;
                            break;
                        }
                        break;
                    }
                }
            }
            if (s != null) {
                return (Class)s;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }
    
    public static Long g(final String s) {
        s.getClass();
        s.getClass();
        final int length = s.length();
        final Long n = null;
        Long n2;
        if (length == 0) {
            n2 = n;
        }
        else {
            int i = 0;
            final char char1 = s.charAt(0);
            final int c = c(char1);
            long n3 = -9223372036854775807L;
            boolean b = true;
            Label_0102: {
                if (c < 0) {
                    if (length == 1) {
                        n2 = n;
                        return n2;
                    }
                    if (char1 == '-') {
                        n3 = Long.MIN_VALUE;
                        i = 1;
                        break Label_0102;
                    }
                    n2 = n;
                    if (char1 != '+') {
                        return n2;
                    }
                    i = 1;
                }
                b = false;
            }
            long n4 = 0L;
            long n5 = -256204778801521550L;
            while (i < length) {
                final int u = u(s.charAt(i));
                if (u >= 0) {
                    long n6 = n5;
                    if (n4 < n5) {
                        if (n5 != -256204778801521550L) {
                            return n;
                        }
                        if (n4 < -922337203685477580L) {
                            return n;
                        }
                        n6 = -922337203685477580L;
                    }
                    final long n7 = n4 * 10L;
                    final long n8 = u;
                    if (n7 >= n3 + n8) {
                        n4 = n7 - n8;
                        ++i;
                        n5 = n6;
                        continue;
                    }
                }
                n2 = n;
                return n2;
            }
            if (b) {
                n2 = n4;
            }
            else {
                n2 = -n4;
            }
        }
        return n2;
    }
    
    public static boolean h(final CharSequence charSequence) {
        charSequence.getClass();
        final int length = charSequence.length();
        boolean b = false;
        if (length != 0) {
            charSequence.getClass();
            final pje a = new pmc(0, charSequence.length() - 1).a();
            while (a.a) {
                final char char1 = charSequence.charAt(a.a());
                if (!Character.isWhitespace(char1) && !Character.isSpaceChar(char1)) {
                    return b;
                }
            }
        }
        b = true;
        return b;
    }
    
    public static int i(final CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }
    
    public static int k(final CharSequence charSequence, final String s, int n) {
        charSequence.getClass();
        s.getClass();
        if (!(charSequence instanceof String)) {
            n = l(charSequence, s, n, charSequence.length(), false);
        }
        else {
            n = ((String)charSequence).indexOf(s, n);
        }
        return n;
    }
    
    public static int l(final CharSequence charSequence, final CharSequence charSequence2, int n, int n2, final boolean b) {
        pmb pmb;
        if (!b) {
            pmb = new pmc(poe.e(n, 0), poe.f(n2, charSequence.length()));
        }
        else {
            pmb = new pmb(poe.f(n, i(charSequence)), poe.e(n2, 0), -1);
        }
        if (charSequence instanceof String && charSequence2 instanceof String) {
            n = pmb.a;
            final int b2 = pmb.b;
            n2 = pmb.c;
            if (n2 >= 0) {
                if (n > b2) {
                    return -1;
                }
            }
            else if (n < b2) {
                return -1;
            }
            while (!o((String)charSequence2, (String)charSequence, n, charSequence2.length())) {
                if (n == b2) {
                    return -1;
                }
                n += n2;
            }
            return n;
        }
        n = pmb.a;
        n2 = pmb.b;
        final int c = pmb.c;
        if (c >= 0) {
            if (n > n2) {
                return -1;
            }
        }
        else if (n < n2) {
            return -1;
        }
        while (!p(charSequence2, charSequence, n, charSequence2.length())) {
            if (n == n2) {
                return -1;
            }
            n += c;
        }
        return n;
    }
    
    public static String n(final String s) {
        s.getClass();
        s.getClass();
        CharSequence subSequence;
        if (s.length() >= 2) {
            subSequence = s.subSequence(0, s.length());
        }
        else {
            final StringBuilder sb = new StringBuilder(2);
            final int n = 2 - s.length();
            if (n > 0) {
                int n2 = 1;
                while (true) {
                    sb.append('0');
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                }
            }
            sb.append((CharSequence)s);
            subSequence = sb;
        }
        return subSequence.toString();
    }
    
    public static boolean o(final String s, final String s2, final int n, final int n2) {
        s.getClass();
        s2.getClass();
        return s.regionMatches(0, s2, n, n2);
    }
    
    public static boolean p(final CharSequence charSequence, final CharSequence charSequence2, final int n, final int n2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (n >= 0 && charSequence.length() - n2 >= 0 && n <= charSequence2.length() - n2) {
            for (int i = 0; i < n2; ++i) {
                if (!v(charSequence.charAt(i), charSequence2.charAt(n + i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static List q(final CharSequence charSequence, final String[] array, final int n) {
        charSequence.getClass();
        int n2 = 0;
        final String s = array[0];
        if (s.length() == 0) {
            final pmr pmr = new pmr(new pmz(charSequence, n, new pna(pjf.s(array))));
            final ArrayList list = new ArrayList(pjf.o(pmr));
            for (final pmc pmc : pmr) {
                charSequence.getClass();
                pmc.getClass();
                list.add((Object)charSequence.subSequence(pmc.a, pmc.b + 1).toString());
            }
            return list;
        }
        final int k = k(charSequence, s, 0);
        List<String> b;
        if (k != -1 && n != 1) {
            int n3;
            if (n > 0) {
                n3 = n;
            }
            else {
                n3 = 10;
            }
            final ArrayList list2 = new ArrayList<String>(n3);
            int n4 = k;
            int i;
            int n5;
            do {
                list2.add(charSequence.subSequence(n2, n4).toString());
                n5 = s.length() + n4;
                if (n > 0 && list2.size() == n - 1) {
                    break;
                }
                i = k(charSequence, s, n5);
                n2 = n5;
            } while ((n4 = i) != -1);
            list2.add(charSequence.subSequence(n5, charSequence.length()).toString());
            b = (List<String>)list2;
        }
        else {
            b = pjf.b(charSequence.toString());
        }
        return b;
    }
    
    public static final int u(final char c) {
        return Character.digit((int)c, 10);
    }
    
    public static boolean v(final char c, final char c2) {
        return c == c2;
    }
}
