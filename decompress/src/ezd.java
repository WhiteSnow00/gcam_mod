import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezd
{
    public final boolean a;
    public final float b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final Boolean g;
    public final Rect h;
    public final Boolean i;
    public final Boolean j;
    public final nyr k;
    public final nzi l;
    public final boolean m;
    public final int n;
    public final int o;
    private final String p;
    
    public ezd() {
    }
    
    public ezd(final int n, final String p16, final boolean a, final float b, final String c, final boolean d, final boolean e, final float f, final Boolean g, final Rect h, final Boolean i, final Boolean j, final int o, final nyr k, final nzi l, final boolean m) {
        this.n = n;
        this.p = p16;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.o = o;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static ezc a() {
        final ezc ezc = new ezc();
        ezc.c = 1;
        ezc.c(nyr.h);
        ezc.f(nzi.d);
        return ezc;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ezd)) {
            return false;
        }
        final ezd ezd = (ezd)o;
        final int n = this.n;
        final int n2 = ezd.n;
        if (n != 0) {
            if (n == n2 && this.p.equals(ezd.p) && this.a == ezd.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(ezd.b) && this.c.equals(ezd.c) && this.d == ezd.d && this.e == ezd.e && Float.floatToIntBits(this.f) == Float.floatToIntBits(ezd.f) && this.g.equals(ezd.g) && this.h.equals((Object)ezd.h) && this.i.equals(ezd.i) && this.j.equals(ezd.j)) {
                final int o2 = this.o;
                final int o3 = ezd.o;
                if (o2 == 0) {
                    throw null;
                }
                if (o2 == o3 && this.k.equals(ezd.k) && this.l.equals(ezd.l) && this.m == ezd.m) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int n = this.n;
        if (n == 0) {
            throw null;
        }
        final int hashCode = this.p.hashCode();
        final boolean a = this.a;
        int n2 = 1237;
        int n3;
        if (!a) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        final int floatToIntBits = Float.floatToIntBits(this.b);
        final int hashCode2 = this.c.hashCode();
        int n4;
        if (!this.d) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        int n5;
        if (!this.e) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        final int floatToIntBits2 = Float.floatToIntBits(this.f);
        final int hashCode3 = this.g.hashCode();
        final int hashCode4 = this.h.hashCode();
        final int hashCode5 = this.i.hashCode();
        final int hashCode6 = this.j.hashCode();
        final int o = this.o;
        if (o != 0) {
            final nyr k = this.k;
            int ay = k.ay;
            if (ay == 0) {
                ay = omr.a.b(k).b(k);
                k.ay = ay;
            }
            final nzi l = this.l;
            int ay2 = l.ay;
            if (ay2 == 0) {
                ay2 = omr.a.b(l).b(l);
                l.ay = ay2;
            }
            if (this.m) {
                n2 = 1231;
            }
            return (((((((((((((((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ n3) * 1000003 ^ floatToIntBits) * 1000003 ^ hashCode2) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ floatToIntBits2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ o) * 1000003 ^ ay) * 1000003 ^ ay2) * 1000003 ^ n2;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final int n = this.n;
        String string = "null";
        String string2;
        if (n != 0) {
            string2 = Integer.toString(n - 1);
        }
        else {
            string2 = "null";
        }
        final String p = this.p;
        final boolean a = this.a;
        final float b = this.b;
        final String c = this.c;
        final boolean d = this.d;
        final boolean e = this.e;
        final float f = this.f;
        final String value = String.valueOf(this.g);
        final String value2 = String.valueOf(this.h);
        final String value3 = String.valueOf(this.i);
        final String value4 = String.valueOf(this.j);
        final int o = this.o;
        if (o != 0) {
            string = Integer.toString(o - 1);
        }
        final String value5 = String.valueOf(this.k);
        final String value6 = String.valueOf(this.l);
        final boolean m = this.m;
        final StringBuilder sb = new StringBuilder(String.valueOf(string2).length() + 321 + String.valueOf(p).length() + String.valueOf(c).length() + String.valueOf(value).length() + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(string).length() + String.valueOf(value5).length() + String.valueOf(value6).length());
        sb.append("DecorateAtTimeCaptureRequestData{mode=");
        sb.append(string2);
        sb.append(", filename=");
        sb.append(p);
        sb.append(", frontFacing=");
        sb.append(a);
        sb.append(", zoom=");
        sb.append(b);
        sb.append(", flashSetting=");
        sb.append(c);
        sb.append(", gridLinesOn=");
        sb.append(d);
        sb.append(", selfieMirrorOn=");
        sb.append(e);
        sb.append(", timerSeconds=");
        sb.append(f);
        sb.append(", volumeButtonShutter=");
        sb.append(value);
        sb.append(", activeSensorSize=");
        sb.append(value2);
        sb.append(", isSelfieFlashOn=");
        sb.append(value3);
        sb.append(", rawMode=");
        sb.append(value4);
        sb.append(", afLockState=");
        sb.append(string);
        sb.append(", dualEvStats=");
        sb.append(value5);
        sb.append(", frequentFaceMetadata=");
        sb.append(value6);
        sb.append(", isPrivateStorage=");
        sb.append(m);
        sb.append("}");
        return sb.toString();
    }
}
