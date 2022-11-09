import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lkt
{
    public final lkb a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final lko e;
    public final nns f;
    
    public lkt() {
    }
    
    public lkt(final lkb a, final Set b, final Set c, final Set d, final lko e, final nns f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static lks a() {
        return new lks();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lkt) {
            final lkt lkt = (lkt)o;
            final lkb a = this.a;
            if (a == null) {
                if (lkt.a != null) {
                    return false;
                }
            }
            else if (!a.equals(lkt.a)) {
                return false;
            }
            if (this.b.equals(lkt.b) && this.c.equals(lkt.c) && this.d.equals(lkt.d) && this.e.equals(lkt.e) && nqb.t(this.f, lkt.f)) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final lkb a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return (((((hashCode ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 124 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length());
        sb.append("PublishInfo{primaryMediaFile=");
        sb.append(value);
        sb.append(", publicMediaFiles=");
        sb.append(value2);
        sb.append(", privateMediaFiles=");
        sb.append(value3);
        sb.append(", cachedMediaFiles=");
        sb.append(value4);
        sb.append(", mediaGroupInfoBuilder=");
        sb.append(value5);
        sb.append(", listeners=");
        sb.append(value6);
        sb.append("}");
        return sb.toString();
    }
}
