// 
// Decompiled by Procyon v0.6.0
// 

public final class nth
{
    public static final nth a;
    private static final long e;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        long e2 = 0L;
        for (int i = 0; i < 7; ++i) {
            e2 |= i + 1L << (int)((" #(+,-0".charAt(i) - ' ') * 3L);
        }
        e = e2;
        a = new nth(0, -1, -1);
    }
    
    public nth(final int b, final int c, final int d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    static int a(String concat, final boolean b) {
        int i = 0;
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 128;
        }
        while (i < ((String)concat).length()) {
            final int g = g(((String)concat).charAt(i));
            if (g < 0) {
                if (((String)concat).length() != 0) {
                    concat = "invalid flags: ".concat((String)concat);
                }
                else {
                    concat = new String("invalid flags: ");
                }
                throw new IllegalArgumentException((String)concat);
            }
            n |= 1 << g;
            ++i;
        }
        return n;
    }
    
    public static nth b(final String s, int i, final int n, final boolean b) {
        if (i == n && !b) {
            return nth.a;
        }
        int n2;
        int j;
        if (!b) {
            n2 = 0;
            j = i;
        }
        else {
            n2 = 128;
            j = i;
        }
        while (j != n) {
            i = j + 1;
            final char char1 = s.charAt(j);
            if (char1 >= ' ' && char1 <= '0') {
                final int g = g(char1);
                if (g < 0) {
                    if (char1 == '.') {
                        return new nth(n2, -1, h(s, i, n));
                    }
                    throw nvu.a("invalid flag", s, i - 1);
                }
                else {
                    final int n3 = 1 << g;
                    if ((n2 & n3) != 0x0) {
                        throw nvu.a("repeated flag", s, i - 1);
                    }
                    n2 |= n3;
                    j = i;
                }
            }
            else {
                final int n4 = i - 1;
                if (char1 <= '9') {
                    int n5 = char1 - '0';
                    while (i != n) {
                        final int n6 = i + 1;
                        i = s.charAt(i);
                        if (i == 46) {
                            return new nth(n2, n5, h(s, n6, n));
                        }
                        i = (char)(i - 48);
                        if (i >= 10) {
                            throw nvu.a("invalid width character", s, n6 - 1);
                        }
                        n5 = n5 * 10 + i;
                        if (n5 > 999999) {
                            throw nvu.b("width too large", s, n4, n);
                        }
                        i = n6;
                    }
                    return new nth(n2, n5, -1);
                }
                throw nvu.a("invalid flag", s, n4);
            }
        }
        return new nth(n2, -1, -1);
    }
    
    private static int g(final char c) {
        return (int)(nth.e >>> (c - ' ') * 3 & 0x7L) - 1;
    }
    
    private static int h(final String s, int n, final int n2) {
        if (n != n2) {
            final int n3 = 0;
            int i = n;
            int n4 = 0;
            while (i < n2) {
                final char c = (char)(s.charAt(i) - '0');
                if (c >= '\n') {
                    throw nvu.a("invalid precision character", s, i);
                }
                n4 = n4 * 10 + c;
                if (n4 > 999999) {
                    throw nvu.b("precision too large", s, n, n2);
                }
                ++i;
            }
            if (n4 == 0) {
                if (n2 != n + 1) {
                    throw nvu.b("invalid precision", s, n, n2);
                }
                n = n3;
            }
            else {
                n = n4;
            }
            return n;
        }
        throw nvu.a("missing precision", s, n - 1);
    }
    
    public final boolean c() {
        return this == nth.a;
    }
    
    public final boolean d() {
        return (this.b & 0x80) != 0x0;
    }
    
    public final boolean e(int c, final boolean b) {
        final boolean c2 = this.c();
        final boolean b2 = true;
        if (c2) {
            return true;
        }
        final int b3 = this.b;
        if ((~c & b3) != 0x0) {
            return false;
        }
        if (!b && this.d != -1) {
            return false;
        }
        c = this.c;
        if ((b3 & 0x9) != 0x9) {
            final int n = b3 & 0x60;
            if (n != 96) {
                boolean b4 = b2;
                if (n == 0) {
                    return b4;
                }
                if (c != -1) {
                    b4 = b2;
                    return b4;
                }
                return false;
            }
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof nth) {
            final nth nth = (nth)o;
            if (nth.b == this.b && nth.c == this.c && nth.d == this.d) {
                return true;
            }
        }
        return false;
    }
    
    public final void f(final StringBuilder sb) {
        if (!this.c()) {
            final int n = this.b & 0xFFFFFF7F;
            int n2 = 0;
            while (true) {
                final int n3 = 1 << n2;
                if (n3 > n) {
                    break;
                }
                if ((n3 & n) != 0x0) {
                    sb.append(" #(+,-0".charAt(n2));
                }
                ++n2;
            }
            final int c = this.c;
            if (c != -1) {
                sb.append(c);
            }
            if (this.d != -1) {
                sb.append('.');
                sb.append(this.d);
            }
        }
    }
    
    @Override
    public final int hashCode() {
        return (this.b * 31 + this.c) * 31 + this.d;
    }
}
