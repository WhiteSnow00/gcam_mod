// 
// Decompiled by Procyon v0.6.0
// 

public final class hop
{
    public final int a;
    public final int b;
    public final hpg c;
    public final jbm d;
    public final float e;
    
    public hop() {
    }
    
    public hop(final int a, final int b, final hpg c, final jbm d, final float e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static hoo a() {
        final hoo hoo = new hoo();
        hoo.c(1);
        hoo.d(1);
        return hoo;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hop) {
            final hop hop = (hop)o;
            if (this.a == hop.a && this.b == hop.b && this.c.equals(hop.c) && this.d.equals(hop.d) && Float.floatToIntBits(this.e) == Float.floatToIntBits(hop.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ Float.floatToIntBits(this.e);
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final float e = this.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 144 + String.valueOf(value2).length());
        sb.append("Options{numFramesPerSample=");
        sb.append(a);
        sb.append(", numSuccessiveSamplesRequired=");
        sb.append(b);
        sb.append(", suggestion=");
        sb.append(value);
        sb.append(", applicationMode=");
        sb.append(value2);
        sb.append(", scoreThreshold=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
