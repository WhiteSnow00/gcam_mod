// 
// Decompiled by Procyon v0.6.0
// 

public final class mis implements mft
{
    private final int a;
    private final int b;
    
    public mis() {
    }
    
    public mis(final int a) {
        this.b = 2;
        this.a = a;
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final int b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof mis)) {
            return false;
        }
        final mis mis = (mis)o;
        final int b = this.b;
        final int b2 = mis.b;
        if (b != 0) {
            return b == b2 && this.a == mis.a;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        mfu.b(b);
        return (b ^ 0xF4243) * 1000003 ^ this.a;
    }
    
    @Override
    public final String toString() {
        final String a = mfu.a(this.b);
        final int a2 = this.a;
        final StringBuilder sb = new StringBuilder(a.length() + 63);
        sb.append("JankConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }
}
