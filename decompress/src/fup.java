// 
// Decompiled by Procyon v0.6.0
// 

public final class fup
{
    public final int a;
    public final int b;
    public final boolean c;
    public final long d;
    public final int e;
    private final int f;
    private final int g;
    
    public fup() {
    }
    
    public fup(final int f, final int g, final int a, final int b, final boolean c, final long d, final int e) {
        this.f = f;
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fup) {
            final fup fup = (fup)o;
            if (this.f == fup.f && this.g == fup.g && this.a == fup.a && this.b == fup.b && this.c == fup.c && this.d == fup.d && this.e == fup.e) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int f = this.f;
        final int g = this.g;
        final int a = this.a;
        final int b = this.b;
        int n;
        if (!this.c) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final long d = this.d;
        return ((((((f ^ 0xF4243) * 1000003 ^ g) * 1000003 ^ a) * 1000003 ^ b) * 1000003 ^ n) * 1000003 ^ (int)(d ^ d >>> 32)) * 1000003 ^ this.e;
    }
    
    @Override
    public final String toString() {
        final int f = this.f;
        final int g = this.g;
        final int a = this.a;
        final int b = this.b;
        final boolean c = this.c;
        final long d = this.d;
        final int e = this.e;
        final StringBuilder sb = new StringBuilder(94);
        sb.append("{");
        sb.append(f);
        sb.append(", ");
        sb.append(g);
        sb.append(", ");
        sb.append(a);
        sb.append(", ");
        sb.append(b);
        sb.append(", ");
        sb.append(c);
        sb.append(", ");
        sb.append(d);
        sb.append(", ");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
