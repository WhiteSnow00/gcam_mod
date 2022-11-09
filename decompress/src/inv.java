import android.util.Size;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inv
{
    public static final inv a;
    public final Size b;
    public final Size c;
    public final boolean d;
    public final boolean e;
    public final jcb f;
    public final jbm g;
    
    static {
        final inu inu = new inu();
        inu.b(false);
        inu.c();
        inu.d(jbm.a);
        inu.e(jcb.a);
        a = inu.a();
    }
    
    public inv() {
    }
    
    public inv(final Size b, final Size c, final boolean d, final boolean e, final jcb f, final jbm g) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final boolean a() {
        return this.b != null && this.c != null;
    }
    
    public final inu b() {
        return new inu(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof inv) {
            final inv inv = (inv)o;
            final Size b = this.b;
            if (b == null) {
                if (inv.b != null) {
                    return false;
                }
            }
            else if (!b.equals((Object)inv.b)) {
                return false;
            }
            final Size c = this.c;
            if (c == null) {
                if (inv.c != null) {
                    return false;
                }
            }
            else if (!c.equals((Object)inv.c)) {
                return false;
            }
            if (this.d == inv.d && this.e == inv.e && this.f.equals(inv.f) && this.g.equals(inv.g)) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Size b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final Size c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        final boolean d = this.d;
        int n = 1237;
        int n2;
        if (!d) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.e) {
            n = 1231;
        }
        return (((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ n2) * 1000003 ^ n) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final boolean d = this.d;
        final boolean e = this.e;
        final String value3 = String.valueOf(this.f);
        final String value4 = String.valueOf(this.g);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 114 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length());
        sb.append("CameraLayoutConstraints{windowSize=");
        sb.append(value);
        sb.append(", previewSize=");
        sb.append(value2);
        sb.append(", isPreviewMaximized=");
        sb.append(d);
        sb.append(", hasCutout=");
        sb.append(e);
        sb.append(", orientation=");
        sb.append(value3);
        sb.append(", mode=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
