// 
// Decompiled by Procyon v0.6.0
// 

public final class grk
{
    public final float a;
    public final float b;
    
    public grk() {
    }
    
    public grk(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public static grk a(final float n, final float n2) {
        return new grk(n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof grk) {
            final grk grk = (grk)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(grk.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(grk.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.b);
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final StringBuilder sb = new StringBuilder(71);
        sb.append("DualEvKnobPositions{brightness=");
        sb.append(a);
        sb.append(", shadow=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
