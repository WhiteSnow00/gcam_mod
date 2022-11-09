// 
// Decompiled by Procyon v0.6.0
// 

public final class kwx
{
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    
    public kwx() {
    }
    
    public kwx(final int b, final int c, final int d, final boolean a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public static kww a() {
        final kww kww = new kww();
        kww.d(false);
        return kww;
    }
    
    public final boolean b() {
        final int b = this.b;
        return b == 4 || b == 2;
    }
    
    public final boolean c() {
        final int d = this.d;
        return d == 4 || d == 2;
    }
    
    public final boolean d() {
        return this.c != 1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof kwx)) {
            return false;
        }
        final kwx kwx = (kwx)o;
        final int b = this.b;
        final int b2 = kwx.b;
        if (b != 0) {
            if (b == b2) {
                final int c = this.c;
                final int c2 = kwx.c;
                if (c == 0) {
                    throw null;
                }
                if (c == c2) {
                    final int d = this.d;
                    final int d2 = kwx.d;
                    if (d == 0) {
                        throw null;
                    }
                    if (d == d2 && this.a == kwx.a) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        kxc.o(b);
        final int c = this.c;
        kxc.o(c);
        final int d = this.d;
        kxc.o(d);
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((b ^ 0xF4243) * 1000003 ^ c) * 1000003 ^ d) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String n = kxc.n(this.b);
        final String n2 = kxc.n(this.c);
        final String n3 = kxc.n(this.d);
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder(n.length() + 58 + n2.length() + n3.length());
        sb.append("Spec3A{exposure=");
        sb.append(n);
        sb.append(", focus=");
        sb.append(n2);
        sb.append(", whiteBalance=");
        sb.append(n3);
        sb.append(", forCapture=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
