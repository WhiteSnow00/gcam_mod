// 
// Decompiled by Procyon v0.6.0
// 

public final class hyj
{
    public static final hyj a;
    public final long b;
    public final long c;
    private final long d;
    private final long e;
    
    static {
        a = a(-1L, -1L, 0L, 0L);
    }
    
    public hyj() {
    }
    
    public hyj(final long b, final long c, final long d, final long e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static hyj a(final long n, final long n2, final long n3, final long n4) {
        return new hyj(n, n2, n3, n4);
    }
    
    public final boolean b() {
        return this.e < this.b;
    }
    
    public final boolean c() {
        return this.d < this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hyj) {
            final hyj hyj = (hyj)o;
            if (this.b == hyj.b && this.c == hyj.c && this.d == hyj.d && this.e == hyj.e) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long b = this.b;
        final long c = this.c;
        return (int)this.e ^ ((((int)(b ^ b >>> 32) ^ 0xF4243) * 1000003 ^ (int)(c ^ c >>> 32)) * 1000003 ^ (int)this.d) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final long e = this.e;
        final StringBuilder sb = new StringBuilder(174);
        sb.append("SpaceAvailability{rawAvailableBytes=");
        sb.append(b);
        sb.append(", totalBytes=");
        sb.append(c);
        sb.append(", videoThresholdBytes=");
        sb.append(d);
        sb.append(", photoThresholdBytes=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
