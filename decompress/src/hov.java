// 
// Decompiled by Procyon v0.6.0
// 

public final class hov
{
    public final int a;
    public final int b;
    public final hpg c;
    
    public hov() {
    }
    
    public hov(final int a, final int b, final hpg c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static hou a() {
        final hou hou = new hou();
        hou.b(3);
        hou.c(10);
        return hou;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hov) {
            final hov hov = (hov)o;
            if (this.a == hov.a && this.b == hov.b && this.c.equals(hov.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 87);
        sb.append("Options{samplingPeriod=");
        sb.append(a);
        sb.append(", successiveSamplesRequired=");
        sb.append(b);
        sb.append(", suggestion=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
