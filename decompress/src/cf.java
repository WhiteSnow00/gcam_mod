import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class cf implements Serializable, ca
{
    private static final long serialVersionUID = 1L;
    private final int a;
    private final boolean b;
    private final boolean c;
    private final double d;
    private final double e;
    private final long[] f;
    private final int g;
    
    public cf(final int a, final boolean b, final int g, final boolean c, final double d, final double e, final long[] f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean a(final cb cb) {
        final int g = this.g;
        double a = 0.0;
        Label_0102: {
            long n2 = 0L;
            Label_0098: {
                int n = 0;
                switch (g - 1) {
                    default: {
                        a = cb.a;
                        break Label_0102;
                    }
                    case 5: {
                        n = cb.c;
                        break;
                    }
                    case 4: {
                        n = cb.b;
                        break;
                    }
                    case 3: {
                        n2 = cb.e;
                        break Label_0098;
                    }
                    case 2: {
                        n2 = cb.d;
                        break Label_0098;
                    }
                    case 1: {
                        n2 = cb.f;
                        break Label_0098;
                    }
                }
                a = n;
                break Label_0102;
            }
            a = (double)n2;
        }
        if (this.c) {
            final double n3 = (double)(long)a;
            Double.isNaN(n3);
            if (a - n3 != 0.0) {
                return !this.b;
            }
        }
        if (g != 7 || cb.b == 0) {
            final int a2 = this.a;
            if (a2 != 0) {
                final double n4 = a2;
                Double.isNaN(n4);
                a %= n4;
            }
            int n5;
            final boolean b = (n5 = ((a >= this.d && a <= this.e) ? 1 : 0)) != 0;
            if (b) {
                n5 = (b ? 1 : 0);
                if (this.f != null) {
                    int n6 = 0;
                    int n7 = 0;
                    while (true) {
                        n5 = n6;
                        if (n6 != 0) {
                            break;
                        }
                        final long[] f = this.f;
                        n5 = n6;
                        if (n7 >= f.length) {
                            break;
                        }
                        n6 = ((a >= f[n7] && a <= f[n7 + 1]) ? 1 : 0);
                        n7 += 2;
                    }
                }
            }
            return (this.b ? 1 : 0) == n5;
        }
        return !this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        String s = null;
        switch (this.g) {
            default: {
                s = "j";
                break;
            }
            case 6: {
                s = "w";
                break;
            }
            case 5: {
                s = "v";
                break;
            }
            case 4: {
                s = "t";
                break;
            }
            case 3: {
                s = "f";
                break;
            }
            case 2: {
                s = "i";
                break;
            }
            case 1: {
                s = "n";
                break;
            }
        }
        sb.append((Object)s);
        if (this.a != 0) {
            sb.append(" % ");
            sb.append(this.a);
        }
        final double d = this.d;
        final double e = this.e;
        String s2 = " = ";
        Label_0190: {
            if (d != e) {
                if (this.c) {
                    if (this.b) {
                        break Label_0190;
                    }
                }
                else {
                    if (this.b) {
                        s2 = " within ";
                        break Label_0190;
                    }
                    s2 = " not within ";
                    break Label_0190;
                }
            }
            else if (this.b) {
                break Label_0190;
            }
            s2 = " != ";
        }
        sb.append(s2);
        if (this.f != null) {
            int n = 0;
            while (true) {
                final long[] f = this.f;
                if (n >= f.length) {
                    break;
                }
                ci.c(sb, (double)f[n], (double)f[n + 1], n != 0);
                n += 2;
            }
        }
        else {
            ci.c(sb, this.d, this.e, false);
        }
        return sb.toString();
    }
}
