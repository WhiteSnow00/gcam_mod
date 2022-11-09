// 
// Decompiled by Procyon v0.6.0
// 

public final class grg
{
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    
    public grg() {
    }
    
    public grg(final float a, final float b, final float c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static grg a(final float n, final float n2, final float n3, final int n4) {
        return new grg(n, n2, n3, n4);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof grg) {
            final grg grg = (grg)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(grg.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(grg.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(grg.c) && this.d == grg.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ Float.floatToIntBits(this.c)) * 1000003 ^ this.d;
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final float c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(136);
        sb.append("DualEvHdrSettings{shortTet=");
        sb.append(a);
        sb.append(", longTet=");
        sb.append(b);
        sb.append(", portraitTet=");
        sb.append(c);
        sb.append(", exposureCompensationSteps=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
