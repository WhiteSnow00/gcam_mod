// 
// Decompiled by Procyon v0.6.0
// 

public final class hpe
{
    public final String a;
    public final noi b;
    public final noi c;
    public final boolean d;
    public final boolean e;
    public final klv f;
    public final niz g;
    public final int h;
    private final niz i;
    
    public hpe() {
    }
    
    public hpe(final String a, final noi b, final noi c, final boolean d, final boolean e, final klv f, final int h, final niz g, final niz i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
        this.i = i;
    }
    
    public static hpd a() {
        final hpd hpd = new hpd(null);
        hpd.a = "UnknownSmartsProcessor";
        hpd.e(true);
        hpd.f(true);
        hpd.d(klu.a(true));
        hpd.d = 4;
        hpd.b = nii.a;
        hpd.c = nii.a;
        return hpd;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hpe) {
            final hpe hpe = (hpe)o;
            if (this.a.equals(hpe.a) && this.b.equals(hpe.b) && this.c.equals(hpe.c) && this.d == hpe.d && this.e == hpe.e && this.f.equals(hpe.f)) {
                final int h = this.h;
                final int h2 = hpe.h;
                if (h == 0) {
                    throw null;
                }
                if (h == h2 && this.g.equals(hpe.g) && this.i.equals(hpe.i)) {
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
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
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
        final int hashCode4 = this.f.hashCode();
        final int h = this.h;
        if (h != 0) {
            return ((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ n2) * 1000003 ^ n) * 1000003 ^ hashCode4) * 1000003 ^ h) * 1000003 ^ this.g.hashCode()) * 1000003 ^ 0x79A31AAC;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final boolean d = this.d;
        final boolean e = this.e;
        final String value3 = String.valueOf(this.f);
        String s = null;
        switch (this.h) {
            default: {
                s = "null";
                break;
            }
            case 4: {
                s = "SUGGESTION";
                break;
            }
            case 3: {
                s = "FRAMING_HINT";
                break;
            }
            case 2: {
                s = "STATUS_UPDATE_STICKY";
                break;
            }
            case 1: {
                s = "DEFAULT";
                break;
            }
        }
        final String value4 = String.valueOf(this.g);
        final String value5 = String.valueOf(this.i);
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 215 + String.valueOf(value).length() + String.valueOf(value2).length() + String.valueOf(value3).length() + s.length() + String.valueOf(value4).length() + String.valueOf(value5).length());
        sb.append("SmartsProcessorOptions{name=");
        sb.append(a);
        sb.append(", activeModes=");
        sb.append(value);
        sb.append(", activeCameraFacing=");
        sb.append(value2);
        sb.append(", shouldPauseDuringCapture=");
        sb.append(d);
        sb.append(", shouldPauseWhenTimerActive=");
        sb.append(e);
        sb.append(", externalToggle=");
        sb.append(value3);
        sb.append(", notificationPriority=");
        sb.append(s);
        sb.append(", smartsCaptureListener=");
        sb.append(value4);
        sb.append(", registrationThread=");
        sb.append(value5);
        sb.append("}");
        return sb.toString();
    }
}
