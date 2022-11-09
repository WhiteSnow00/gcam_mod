// 
// Decompiled by Procyon v0.6.0
// 

public final class bzk
{
    public final float a;
    public final float b;
    private final float c;
    private final float d;
    
    public bzk() {
    }
    
    public bzk(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof bzk) {
            final bzk bzk = (bzk)o;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(bzk.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(bzk.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(bzk.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(bzk.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ Float.floatToIntBits(this.c)) * 1000003 ^ Float.floatToIntBits(this.d);
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final float c = this.c;
        final float d = this.d;
        final StringBuilder sb = new StringBuilder(109);
        sb.append("FaceFeatures{width=");
        sb.append(a);
        sb.append(", height=");
        sb.append(b);
        sb.append(", centerX=");
        sb.append(c);
        sb.append(", centerY=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
