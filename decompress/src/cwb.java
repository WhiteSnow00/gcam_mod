// 
// Decompiled by Procyon v0.6.0
// 

public final class cwb
{
    public final int a;
    public final hpg b;
    
    public cwb() {
    }
    
    public cwb(final int a, final hpg b) {
        this.a = a;
        this.b = b;
    }
    
    public static cwa a() {
        final cwa cwa = new cwa();
        cwa.a = 5;
        return cwa;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof cwb) {
            final cwb cwb = (cwb)o;
            if (this.a == cwb.a && this.b.equals(cwb.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 59);
        sb.append("Options{successiveSamplesRequired=");
        sb.append(a);
        sb.append(", suggestion=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
