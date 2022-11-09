// 
// Decompiled by Procyon v0.6.0
// 

public final class hwg
{
    public final boolean a;
    public final boolean b;
    
    public hwg() {
    }
    
    public hwg(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public static hwf a() {
        final hwf hwf = new hwf();
        hwf.c(true);
        hwf.b(true);
        return hwf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hwg) {
            final hwg hwg = (hwg)o;
            if (this.a == hwg.a && this.b == hwg.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.b) {
            n = 1231;
        }
        return (n2 ^ 0xF4243) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder(68);
        sb.append("RecordOptions{logDurationFromStart=");
        sb.append(a);
        sb.append(", logDurationFromLast=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
