// 
// Decompiled by Procyon v0.6.0
// 

public final class apn
{
    private static boolean[] a;
    private static boolean[] b;
    
    static {
        apn.b = new boolean[256];
        apn.a = new boolean[256];
        int n = 0;
        while (true) {
            final boolean[] b = apn.b;
            final int length = b.length;
            if (n >= 256) {
                break;
            }
            final boolean[] a = apn.a;
            final boolean b2 = true;
            a[n] = ((n >= 97 && n <= 122) || ((n >= 65 && n <= 90) || n == 58 || n == 95 || (n >= 192 && n <= 214)) || (n >= 216 && n <= 246));
            boolean b3;
            if ((n < 97 || n > 122) && ((n < 65 || n > 90) && (n < 48 || n > 57) && n != 58 && n != 95 && n != 45 && n != 46 && n != 183 && (n < 192 || n > 214))) {
                b3 = (n >= 216 && n <= 246 && b2);
            }
            else {
                b3 = b2;
            }
            b[n] = b3;
            n = (char)(n + 1);
        }
    }
    
    public static String a(final String s) {
        if ("x-default".equals(s)) {
            return s;
        }
        final StringBuffer sb = new StringBuffer();
        int i = 0;
        int n = 1;
        while (i < s.length()) {
            int n2 = n;
            switch (s.charAt(i)) {
                case '-':
                case '_': {
                    sb.append('-');
                    n2 = n + 1;
                }
                default:
                    Label_0127: {
                        if (n != 2) {
                            sb.append(Character.toLowerCase(s.charAt(i)));
                            n2 = n;
                            break Label_0127;
                        }
                        sb.append(Character.toUpperCase(s.charAt(i)));
                        n2 = n;
                        break Label_0127;
                    }
                case ' ': {
                    ++i;
                    n = n2;
                    continue;
                }
            }
        }
        return sb.toString();
    }
    
    static String b(final String s) {
        final StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); ++i) {
            if (d(sb.charAt(i))) {
                sb.setCharAt(i, ' ');
            }
        }
        return sb.toString();
    }
    
    static boolean c(final String s) {
        if (s != null) {
            int i = 0;
            int n = 1;
            int n2 = 0;
            while (i < s.length()) {
                int n3 = n;
                int n4 = n2;
                if (s.charAt(i) == '-') {
                    n4 = n2 + 1;
                    if (n != 0 && (i == 8 || i == 13 || i == 18 || i == 23)) {
                        n3 = 1;
                    }
                    else {
                        n3 = 0;
                    }
                }
                ++i;
                n = n3;
                n2 = n4;
            }
            if (n != 0 && n2 == 4 && i == 36) {
                return true;
            }
        }
        return false;
    }
    
    static boolean d(final char c) {
        int n = c;
        if (c > '\u001f') {
            if (c != '\u007f') {
                return false;
            }
            n = 127;
        }
        if (n != 9 && n != 10 && n != 13) {
            return true;
        }
        return false;
    }
    
    public static boolean e(final String s) {
        int i;
        if (s.length() > 0) {
            if (!j(s.charAt(0))) {
                return false;
            }
            i = 1;
        }
        else {
            i = 1;
        }
        while (i < s.length()) {
            if (!i(s.charAt(i))) {
                return false;
            }
            ++i;
        }
        return true;
    }
    
    public static boolean f(final String s) {
        int i;
        if (s.length() > 0) {
            if (!j(s.charAt(0)) || s.charAt(0) == ':') {
                return false;
            }
            i = 1;
        }
        else {
            i = 1;
        }
        while (i < s.length()) {
            if (!i(s.charAt(i)) || s.charAt(i) == ':') {
                return false;
            }
            ++i;
        }
        return true;
    }
    
    public static String[] g(final String s) {
        final int index = s.indexOf(61);
        int n;
        if (s.charAt(1) == '?') {
            n = 2;
        }
        else {
            n = 1;
        }
        final String substring = s.substring(n, index);
        int i = index + 1;
        final char char1 = s.charAt(i);
        ++i;
        final int n2 = s.length() - 2;
        final StringBuffer sb = new StringBuffer(n2 - index);
        while (i < n2) {
            sb.append(s.charAt(i));
            final int n3 = ++i;
            if (s.charAt(n3) == char1) {
                i = n3 + 1;
            }
        }
        return new String[] { substring, sb.toString() };
    }
    
    public static String h(final String s, final boolean b) {
        final int n = 0;
        int n2 = 0;
        boolean b2 = false;
        Label_0105: {
            while (true) {
                final String string = s;
                if (n2 >= s.length()) {
                    return string;
                }
                final char char1 = s.charAt(n2);
                b2 = b;
                if (char1 == '<') {
                    break Label_0105;
                }
                b2 = b;
                if (char1 == '>') {
                    break Label_0105;
                }
                b2 = b;
                if (char1 == '&') {
                    break Label_0105;
                }
                b2 = b;
                if (char1 == '\t') {
                    break Label_0105;
                }
                b2 = b;
                if (char1 == '\n') {
                    break Label_0105;
                }
                b2 = b;
                if (char1 == '\r') {
                    break Label_0105;
                }
                if (b && char1 == '\"') {
                    break;
                }
                ++n2;
            }
            b2 = true;
        }
        final StringBuffer sb = new StringBuffer(s.length() * 4 / 3);
        for (int i = n; i < s.length(); ++i) {
            final char char2 = s.charAt(i);
            if (char2 != '\t' && char2 != '\n' && char2 != '\r') {
                switch (char2) {
                    default: {
                        sb.append(char2);
                        break;
                    }
                    case 62: {
                        sb.append("&gt;");
                        break;
                    }
                    case 60: {
                        sb.append("&lt;");
                        break;
                    }
                    case 38: {
                        sb.append("&amp;");
                        break;
                    }
                    case 34: {
                        String s2;
                        if (!b2) {
                            s2 = "\"";
                        }
                        else {
                            s2 = "&quot;";
                        }
                        sb.append(s2);
                        break;
                    }
                }
            }
            else {
                sb.append("&#x");
                sb.append(Integer.toHexString(char2).toUpperCase());
                sb.append(';');
            }
        }
        return sb.toString();
    }
    
    private static boolean i(final char c) {
        return c > '\u00ff' || apn.b[c];
    }
    
    private static boolean j(final char c) {
        return c > '\u00ff' || apn.a[c];
    }
}
