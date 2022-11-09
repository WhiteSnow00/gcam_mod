// 
// Decompiled by Procyon v0.6.0
// 

public final class hlq
{
    public final hoz a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    
    public hlq() {
    }
    
    public hlq(final hoz a, final int f, final boolean b, final boolean c, final boolean d, final boolean e) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    static hlp a(final hoz a) {
        final hlp hlp = new hlp();
        hlp.a = a;
        hlp.f(1);
        hlp.b(false);
        hlp.d(false);
        hlp.c(false);
        hlp.e(false);
        return hlp;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hlq) {
            final hlq hlq = (hlq)o;
            if (this.a.equals(hlq.a)) {
                final int f = this.f;
                final int f2 = hlq.f;
                if (f == 0) {
                    throw null;
                }
                if (f == f2 && this.b == hlq.b && this.c == hlq.c && this.d == hlq.d && this.e == hlq.e) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int f = this.f;
        if (f != 0) {
            final boolean b = this.b;
            int n = 1237;
            int n2;
            if (!b) {
                n2 = 1237;
            }
            else {
                n2 = 1231;
            }
            int n3;
            if (!this.c) {
                n3 = 1237;
            }
            else {
                n3 = 1231;
            }
            int n4;
            if (!this.d) {
                n4 = 1237;
            }
            else {
                n4 = 1231;
            }
            if (this.e) {
                n = 1231;
            }
            return (((((hashCode ^ 0xF4243) * 1000003 ^ f) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        String s = null;
        switch (this.f) {
            default: {
                s = "null";
                break;
            }
            case 6: {
                s = "DOUBLE_TAP_ZOOM";
                break;
            }
            case 5: {
                s = "CONTINUOUS_ZOOM";
                break;
            }
            case 4: {
                s = "SLIDING";
                break;
            }
            case 3: {
                s = "RESTING";
                break;
            }
            case 2: {
                s = "ZOOMING";
                break;
            }
            case 1: {
                s = "HIDE";
                break;
            }
        }
        final boolean b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 151 + s.length());
        sb.append("SmartChipCharacteristics{entry=");
        sb.append(value);
        sb.append(", zoomUiMode=");
        sb.append(s);
        sb.append(", isLayoutUpdate=");
        sb.append(b);
        sb.append(", isZoomInViewfinder=");
        sb.append(c);
        sb.append(", isVideoControlUiVisible=");
        sb.append(d);
        sb.append(", isZoomToggleEnabled=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
