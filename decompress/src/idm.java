import android.util.SizeF;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idm
{
    public final lji a;
    public final Rect b;
    public final SizeF c;
    public final boolean d;
    public final int e;
    public final Rect f;
    private final float g;
    
    public idm() {
    }
    
    public idm(final lji a, final Rect b, final SizeF c, final boolean d, final int e, final float g, final Rect f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof idm) {
            final idm idm = (idm)o;
            if (this.a.equals(idm.a) && this.b.equals((Object)idm.b) && this.c.equals((Object)idm.c) && this.d == idm.d && this.e == idm.e && Float.floatToIntBits(this.g) == Float.floatToIntBits(idm.g) && this.f.equals((Object)idm.f)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        int n;
        if (!this.d) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ n) * 1000003 ^ this.e) * 1000003 ^ Float.floatToIntBits(this.g)) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final boolean d = this.d;
        final int e = this.e;
        final float g = this.g;
        final String value4 = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 165 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length());
        sb.append("EisParams{metadata=");
        sb.append(value);
        sb.append(", sensorInfoActiveArraySize=");
        sb.append(value2);
        sb.append(", sensorInfoPhysicalSize=");
        sb.append(value3);
        sb.append(", supportOis=");
        sb.append(d);
        sb.append(", oisApiVersion=");
        sb.append(e);
        sb.append(", digitalZoomRatio=");
        sb.append(g);
        sb.append(", cropRegion=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
