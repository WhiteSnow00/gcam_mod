// 
// Decompiled by Procyon v0.6.0
// 

public final class mgr
{
    public final String a;
    public final boolean b;
    public final psp c;
    public final prk d;
    public final String e;
    public final mfa f;
    
    public mgr() {
    }
    
    public mgr(final String a, final boolean b, final psp c, final prk d, final String e, final mfa f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static mgq a() {
        final mgq mgq = new mgq();
        mgq.b(false);
        return mgq;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mgr) {
            final mgr mgr = (mgr)o;
            final String a = this.a;
            if (a == null) {
                if (mgr.a != null) {
                    return false;
                }
            }
            else if (!a.equals(mgr.a)) {
                return false;
            }
            if (this.b == mgr.b && this.c.equals(mgr.c)) {
                final prk d = this.d;
                if (d == null) {
                    if (mgr.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(mgr.d)) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (mgr.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(mgr.e)) {
                    return false;
                }
                final mfa f = this.f;
                final mfa f2 = mgr.f;
                if (f == null) {
                    if (f2 != null) {
                        return false;
                    }
                }
                else if (!f.equals(f2)) {
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
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        int n;
        if (!this.b) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final psp c = this.c;
        int ay = c.ay;
        if (ay == 0) {
            ay = omr.a.b(c).b(c);
            c.ay = ay;
        }
        final prk d = this.d;
        int ay2;
        if (d == null) {
            ay2 = 0;
        }
        else {
            ay2 = d.ay;
            if (ay2 == 0) {
                ay2 = omr.a.b(d).b(d);
                d.ay = ay2;
            }
        }
        final String e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        final mfa f = this.f;
        if (f != null) {
            hashCode = f.hashCode();
        }
        return (((((hashCode2 ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ ay) * 1000003 ^ ay2) * 1000003 ^ hashCode3) * -721379959 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final boolean b = this.b;
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final String e = this.e;
        final String value3 = String.valueOf((Object)null);
        final String value4 = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 142 + String.valueOf(value).length() + String.valueOf(value2).length() + String.valueOf(e).length() + String.valueOf(value3).length() + String.valueOf(value4).length());
        sb.append("Metric{customEventName=");
        sb.append(a);
        sb.append(", isEventNameConstant=");
        sb.append(b);
        sb.append(", metric=");
        sb.append(value);
        sb.append(", metricExtension=");
        sb.append(value2);
        sb.append(", accountableComponentName=");
        sb.append(e);
        sb.append(", sampleRatePermille=");
        sb.append(value3);
        sb.append(", debugLogsTime=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
