// 
// Decompiled by Procyon v0.6.0
// 

public final class mlk implements mft
{
    private final int a;
    private final boolean b;
    private final int c;
    private final mry d;
    
    public mlk() {
    }
    
    public mlk(final int a, final mry d, final boolean b, final byte[] array, final byte[] array2) {
        this.c = 2;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final int b() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mlk)) {
            return false;
        }
        final mlk mlk = (mlk)o;
        final int c = this.c;
        final int c2 = mlk.c;
        if (c != 0) {
            return c == c2 && this.a == mlk.a && this.d.equals(mlk.d) && this.b == mlk.b;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int c = this.c;
        mfu.b(c);
        final int a = this.a;
        final int hashCode = this.d.hashCode();
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((c ^ 0xF4243) * 1000003 ^ a) * 1000003 ^ hashCode) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.c);
        final int a2 = this.a;
        final String value = String.valueOf(this.d);
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder(a.length() + 114 + String.valueOf(value).length());
        sb.append("TikTokTraceConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(a2);
        sb.append(", dynamicSampler=");
        sb.append(value);
        sb.append(", recordTimerDuration=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
