// 
// Decompiled by Procyon v0.6.0
// 

public final class eza
{
    public final hio a;
    public final oaf b;
    public final Float c;
    
    public eza() {
    }
    
    public eza(final hio a, final oaf b, final Float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static eyz a() {
        return new eyz();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof eza) {
            final eza eza = (eza)o;
            if (this.a.equals(eza.a)) {
                final oaf b = this.b;
                if (b == null) {
                    if (eza.b != null) {
                        return false;
                    }
                }
                else if (!b.equals(eza.b)) {
                    return false;
                }
                final Float c = this.c;
                final Float c2 = eza.c;
                if (c == null) {
                    if (c2 != null) {
                        return false;
                    }
                }
                else if (!c.equals(c2)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final oaf b = this.b;
        int hashCode2 = 0;
        int ay;
        if (b == null) {
            ay = 0;
        }
        else {
            ay = b.ay;
            if (ay == 0) {
                ay = omr.a.b(b).b(b);
                b.ay = ay;
            }
        }
        final Float c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ ay) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 64 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("CaptureStartStats{sessionType=");
        sb.append(value);
        sb.append(", microvideoMetaData=");
        sb.append(value2);
        sb.append(", zoomValue=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
