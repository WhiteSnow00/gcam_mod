// 
// Decompiled by Procyon v0.6.0
// 

public final class fja
{
    public final int a;
    public final float b;
    public final float c;
    
    public fja() {
    }
    
    public fja(final int a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static fja a(final dkz dkz) {
        njo.d(dkz.a.length == 3);
        return new fja((int)dkz.b(0), dkz.b(1), dkz.b(2));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fja) {
            final fja fja = (fja)o;
            if (this.a == fja.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(fja.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(fja.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.b)) * 1000003 ^ Float.floatToIntBits(this.c);
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final float b = this.b;
        final float c = this.c;
        final StringBuilder sb = new StringBuilder(111);
        sb.append("CameraOrientation{deviceRotationDegrees=");
        sb.append(a);
        sb.append(", pitchDegrees=");
        sb.append(b);
        sb.append(", rollDegrees=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
