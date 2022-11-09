// 
// Decompiled by Procyon v0.6.0
// 

public final class ide
{
    public final kmt a;
    public final kmv b;
    public final cgr c;
    public final niz d;
    public final idc e;
    public final kra f;
    public final String g;
    public final boolean h;
    private final niz i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    
    public ide() {
    }
    
    public ide(final kmt a, final kmv b, final niz i, final cgr c, final niz d, final idc e, final long j, final long k, final long l, final long m, final kra f, final String g, final boolean h) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.c = c;
        this.d = d;
        this.e = e;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static idd a() {
        final idd idd = new idd(null);
        idd.j(0L);
        idd.i(0L);
        idd.d(0L);
        idd.e(0L);
        return idd;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ide) {
            final ide ide = (ide)o;
            if (this.a.equals(ide.a) && this.b.equals(ide.b) && this.i.equals(ide.i) && this.c.equals(ide.c) && this.d.equals(ide.d) && this.e.equals(ide.e) && this.j == ide.j && this.k == ide.k && this.l == ide.l && this.m == ide.m && this.f.equals(ide.f) && this.g.equals(ide.g) && this.h == ide.h) {
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
        final int hashCode4 = this.d.hashCode();
        final int hashCode5 = this.e.hashCode();
        final long j = this.j;
        final long k = this.k;
        final long l = this.l;
        final long m = this.m;
        final int n = (int)(j >>> 32 ^ j);
        final int n2 = (int)(k >>> 32 ^ k);
        final int n3 = (int)(l >>> 32 ^ l);
        final int n4 = (int)(m >>> 32 ^ m);
        final int hashCode6 = this.f.hashCode();
        final int hashCode7 = this.g.hashCode();
        int n5;
        if (!this.h) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        return ((((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ 0x79A31AAC) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ n5;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.i);
        final String value4 = String.valueOf(this.c);
        final String value5 = String.valueOf(this.d);
        final String value6 = String.valueOf(this.e);
        final long j = this.j;
        final long k = this.k;
        final long l = this.l;
        final long m = this.m;
        final String value7 = String.valueOf(this.f);
        final String g = this.g;
        final boolean h = this.h;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 313 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(g).length());
        sb.append("TimelapseVideoFile{camcorderCaptureRate=");
        sb.append(value);
        sb.append(", camcorderVideoResolution=");
        sb.append(value2);
        sb.append(", videoFile=");
        sb.append(value3);
        sb.append(", outputVideo=");
        sb.append(value4);
        sb.append(", location=");
        sb.append(value5);
        sb.append(", timelapseMode=");
        sb.append(value6);
        sb.append(", recordingDurationMs=");
        sb.append(j);
        sb.append(", outputDurationMs=");
        sb.append(k);
        sb.append(", frameCount=");
        sb.append(l);
        sb.append(", frameDropped=");
        sb.append(m);
        sb.append(", orientation=");
        sb.append(value7);
        sb.append(", title=");
        sb.append(g);
        sb.append(", isSecureVideo=");
        sb.append(h);
        sb.append("}");
        return sb.toString();
    }
}
