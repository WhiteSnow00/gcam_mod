import java.util.Arrays;
import java.util.Comparator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nmu implements Serializable
{
    public final Comparator a;
    public final boolean b;
    public final Object c;
    public final boolean d;
    public final Object e;
    public final int f;
    public final int g;
    
    public nmu(final Comparator a, final boolean b, final Object c, int f, final boolean d, final Object e, int g) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.f = f;
        this.e = e;
        this.g = g;
        if (b) {
            a.compare(c, c);
        }
        if (d) {
            a.compare(e, e);
        }
        if (b && d) {
            final int compare = a.compare(c, e);
            final int n = 0;
            njo.l(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", c, e);
            if (compare == 0) {
                if (f != 1) {
                    f = 1;
                }
                else {
                    f = 0;
                }
                if (g != 1) {
                    g = 1;
                }
                else {
                    g = n;
                }
                njo.d((boolean)((f | g) != 0x0));
            }
        }
    }
    
    static nmu a(final Comparator comparator) {
        return new nmu(comparator, false, null, 1, false, null, 1);
    }
    
    final nmu b(final nmu nmu) {
        njo.d(this.a.equals(nmu.a));
        boolean b = this.b;
        final Object c = this.c;
        final int f = this.f;
        Object o = null;
        int n = 0;
        Label_0146: {
            boolean b2 = false;
            Label_0143: {
                if (!b) {
                    b2 = nmu.b;
                    o = nmu.c;
                    n = nmu.f;
                }
                else {
                    b2 = b;
                    o = c;
                    n = f;
                    if (nmu.b) {
                        final int compare = this.a.compare(c, nmu.c);
                        if (compare >= 0) {
                            b2 = b;
                            o = c;
                            n = f;
                            if (compare != 0) {
                                break Label_0143;
                            }
                            b2 = b;
                            o = c;
                            n = f;
                            if (nmu.f != 1) {
                                break Label_0143;
                            }
                        }
                        o = nmu.c;
                        n = nmu.f;
                        break Label_0146;
                    }
                }
            }
            b = b2;
        }
        boolean b3 = this.d;
        final Object e = this.e;
        int n2 = this.g;
        Object o2 = null;
        Label_0252: {
            if (!b3) {
                b3 = nmu.d;
                final Object e2 = nmu.e;
                n2 = nmu.g;
                o2 = e2;
            }
            else {
                if (nmu.d) {
                    final int compare2 = this.a.compare(e, nmu.e);
                    if (compare2 > 0 || (compare2 == 0 && nmu.g == 1)) {
                        final Object e3 = nmu.e;
                        n2 = nmu.g;
                        o2 = e3;
                        break Label_0252;
                    }
                }
                o2 = e;
            }
        }
        if (b && b3) {
            final int compare3 = this.a.compare(o, o2);
            if (compare3 <= 0) {
                if (compare3 != 0 || n != 1) {
                    return new nmu(this.a, b, o, n, b3, o2, n2);
                }
                if (n2 == 1) {
                    o = o2;
                    n = 1;
                    n2 = 2;
                    return new nmu(this.a, b, o, n, b3, o2, n2);
                }
            }
            else {
                o = o2;
                n = 1;
            }
            n2 = 2;
        }
        return new nmu(this.a, b, o, n, b3, o2, n2);
    }
    
    final boolean c(final Object o) {
        return !this.e(o) && !this.d(o);
    }
    
    final boolean d(final Object o) {
        final boolean d = this.d;
        boolean b = false;
        if (d) {
            final int compare = this.a.compare(o, this.e);
            final boolean b2 = compare > 0;
            final boolean b3 = compare == 0;
            if (this.g == 1) {
                b = true;
            }
            return (b3 & b) | b2;
        }
        return false;
    }
    
    final boolean e(final Object o) {
        final boolean b = this.b;
        boolean b2 = false;
        if (b) {
            final int compare = this.a.compare(o, this.c);
            final boolean b3 = compare < 0;
            final boolean b4 = compare == 0;
            if (this.f == 1) {
                b2 = true;
            }
            return (b4 & b2) | b3;
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nmu) {
            final nmu nmu = (nmu)o;
            if (this.a.equals(nmu.a) && this.b == nmu.b && this.d == nmu.d && this.f == nmu.f && this.g == nmu.g && nqb.E(this.c, nmu.c) && nqb.E(this.e, nmu.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.c, this.f, this.e, this.g });
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        char c;
        if (this.f == 2) {
            c = '[';
        }
        else {
            c = '(';
        }
        Object c2;
        if (this.b) {
            c2 = this.c;
        }
        else {
            c2 = "-\u221e";
        }
        final String value2 = String.valueOf(c2);
        Object e;
        if (this.d) {
            e = this.e;
        }
        else {
            e = "\u221e";
        }
        final String value3 = String.valueOf(e);
        char c3;
        if (this.g == 2) {
            c3 = ']';
        }
        else {
            c3 = ')';
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 4 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append(value);
        sb.append(":");
        sb.append(c);
        sb.append(value2);
        sb.append(',');
        sb.append(value3);
        sb.append(c3);
        return sb.toString();
    }
}
