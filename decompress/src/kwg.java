import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwg
{
    public final lfj a;
    public final kwr b;
    public final kwv c;
    public final kwv d;
    public final kwv e;
    public final kwv f;
    public final nns g;
    public final noi h;
    public final kuu i;
    public final kvp j;
    public final long k;
    public final int l;
    public final noi m;
    public final kxc n;
    private final kwv o;
    
    public kwg() {
    }
    
    public kwg(final lfj a, final kwr b, final kwv c, final kwv d, final kwv o, final kwv e, final kwv f, final kxc n, final nns g, final noi h, final kuu i, final kvp j, final long k, final int l, final noi m, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.o = o;
        this.e = e;
        this.f = f;
        this.n = n;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static kwf a() {
        final kwf kwf = new kwf();
        kwf.g(kwr.a);
        kwf.a = new kwv(1);
        kwf.b = new kwv(2);
        kwf.c = new kwv(-1);
        kwf.d = new kwv(1);
        kwf.i(new kwv(5));
        kwf.j(kwc.a);
        kwf.e(new kwq());
        kwf.e = 3100010001000L;
        kwf.f = 60;
        kwf.h(nqr.a);
        return kwf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kwg) {
            final kwg kwg = (kwg)o;
            if (this.a.equals(kwg.a) && this.b.equals(kwg.b) && this.c.equals(kwg.c) && this.d.equals(kwg.d) && this.o.equals(kwg.o) && this.e.equals(kwg.e) && this.f.equals(kwg.f) && this.n.equals(kwg.n) && nqb.t(this.g, kwg.g) && this.h.equals(kwg.h) && this.i.equals(kwg.i) && this.j.equals(kwg.j) && this.k == kwg.k && this.l == kwg.l && this.m.equals(kwg.m)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.a.b;
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int hashCode3 = this.d.hashCode();
        final int hashCode4 = this.o.hashCode();
        final int hashCode5 = this.e.hashCode();
        final int hashCode6 = this.f.hashCode();
        final int hashCode7 = this.n.hashCode();
        final int hashCode8 = this.g.hashCode();
        final int hashCode9 = this.h.hashCode();
        final int hashCode10 = this.i.hashCode();
        final int hashCode11 = this.j.hashCode();
        final long k = this.k;
        return ((((((((((((((b ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ (int)(k >>> 32 ^ k)) * 1000003 ^ this.l) * 1000003 ^ this.m.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.o);
        final String value6 = String.valueOf(this.e);
        final String value7 = String.valueOf(this.f);
        final String value8 = String.valueOf(this.n);
        final String value9 = String.valueOf(this.g);
        final String value10 = String.valueOf(this.h);
        final String value11 = String.valueOf(this.i);
        final String value12 = String.valueOf(this.j);
        final long k = this.k;
        final int l = this.l;
        final String value13 = String.valueOf(this.m);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 325 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(value8).length() + String.valueOf(value9).length() + String.valueOf(value10).length() + String.valueOf(value11).length() + String.valueOf(value12).length() + String.valueOf(value13).length());
        sb.append("FrameServerConfig{cameraId=");
        sb.append(value);
        sb.append(", operatingMode=");
        sb.append(value2);
        sb.append(", template=");
        sb.append(value3);
        sb.append(", captureTemplate=");
        sb.append(value4);
        sb.append(", reprocessingTemplate=");
        sb.append(value5);
        sb.append(", repeatingTemplate=");
        sb.append(value6);
        sb.append(", repeatingCaptureTemplate=");
        sb.append(value7);
        sb.append(", frameListener=");
        sb.append(value8);
        sb.append(", streams=");
        sb.append(value9);
        sb.append(", sessionParameters=");
        sb.append(value10);
        sb.append(", fatalErrorHandler=");
        sb.append(value11);
        sb.append(", cameraDeviceErrorListener=");
        sb.append(value12);
        sb.append(", result3ATimeoutNs=");
        sb.append(k);
        sb.append(", result3ATimeoutFrameCount=");
        sb.append(l);
        sb.append(", quirks=");
        sb.append(value13);
        sb.append("}");
        return sb.toString();
    }
}
