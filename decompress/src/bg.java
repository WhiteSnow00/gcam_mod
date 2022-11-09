import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bg
{
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    private final int g;
    
    public bg(String upperCase, final String b, final boolean d, int n, final String f, final int g) {
        this.a = upperCase;
        this.b = b;
        this.d = d;
        this.e = n;
        n = 5;
        if (b != null) {
            upperCase = b.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                n = 3;
            }
            else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB")) {
                if (upperCase.contains("TEXT")) {
                    n = 2;
                }
                else if (!upperCase.contains("BLOB")) {
                    if (!upperCase.contains("REAL") && !upperCase.contains("FLOA") && !upperCase.contains("DOUB")) {
                        n = 1;
                    }
                    else {
                        n = 4;
                    }
                }
            }
            else {
                n = 2;
            }
        }
        this.c = n;
        this.f = f;
        this.g = g;
    }
    
    public static boolean a(final String s, final String s2) {
        if (s2 == null) {
            return false;
        }
        if (!s.equals(s2)) {
            if (s.length() != 0) {
                int i = 0;
                int n = 0;
                while (i < s.length()) {
                    int char1 = s.charAt(i);
                    if (i == 0) {
                        if (char1 != 40) {
                            return false;
                        }
                        i = 0;
                        char1 = 40;
                    }
                    int n2;
                    if (char1 == 40) {
                        n2 = n + 1;
                    }
                    else {
                        n2 = n;
                        if (char1 == 41) {
                            n2 = --n;
                            if (n == 0) {
                                n2 = n;
                                if (i != s.length() - 1) {
                                    return false;
                                }
                            }
                        }
                    }
                    ++i;
                    n = n2;
                }
                if (n == 0) {
                    return s.substring(1, s.length() - 1).trim().equals(s2);
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bg)) {
            return false;
        }
        final bg bg = (bg)o;
        if (this.e != bg.e) {
            return false;
        }
        if (!this.a.equals(bg.a)) {
            return false;
        }
        if (this.d != bg.d) {
            return false;
        }
        if (this.g == 1 && bg.g == 2) {
            final String f = this.f;
            if (f != null) {
                if (!a(f, bg.f)) {
                    return false;
                }
            }
        }
        if (this.g == 2 && bg.g == 1) {
            final String f2 = bg.f;
            if (f2 != null) {
                if (!a(f2, this.f)) {
                    return false;
                }
            }
        }
        if (this.g == bg.g) {
            final String f3 = this.f;
            if (f3 != null) {
                if (a(f3, bg.f)) {
                    return this.c == bg.c;
                }
            }
            else if (bg.f == null) {
                return this.c == bg.c;
            }
            return false;
        }
        return this.c == bg.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int c = this.c;
        int n;
        if (!this.d) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((hashCode * 31 + c) * 31 + n) * 31 + this.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.c);
        sb.append("', notNull=");
        sb.append(this.d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.e);
        sb.append(", defaultValue='");
        sb.append(this.f);
        sb.append("'}");
        return sb.toString();
    }
}
