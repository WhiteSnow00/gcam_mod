import android.content.Context;
import java.text.DateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class llb
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final DateFormat j;
    public final Context k;
    public final String l;
    public final String m;
    public final String n;
    public final llu o;
    public final boolean p;
    public final long q;
    public final long r;
    private final nnx s;
    
    public llb() {
    }
    
    public llb(final String a, final String b, final String c, final String d, final String e, final String f, final int g, final boolean h, final boolean i, final DateFormat j, final nnx s, final Context k, final String l, final String m, final String n, final llu o, final boolean p19, final long q, final long r) {
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
        this.s = s;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p19;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof llb) {
            final llb llb = (llb)o;
            if (this.a.equals(llb.a) && this.b.equals(llb.b) && this.c.equals(llb.c) && this.d.equals(llb.d) && this.e.equals(llb.e) && this.f.equals(llb.f) && this.g == llb.g && this.h == llb.h && this.i == llb.i && this.j.equals(llb.j) && this.s.equals(llb.s) && this.k.equals(llb.k) && this.l.equals(llb.l) && this.m.equals(llb.m) && this.n.equals(llb.n) && this.o.equals(llb.o) && this.p == llb.p && this.q == llb.q && this.r == llb.r) {
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
        final int hashCode6 = this.f.hashCode();
        final int g = this.g;
        final boolean h = this.h;
        int n = 1237;
        int n2;
        if (!h) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.i) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        final int hashCode7 = this.j.hashCode();
        final int hashCode8 = this.s.hashCode();
        final int hashCode9 = this.k.hashCode();
        final int hashCode10 = this.l.hashCode();
        final int hashCode11 = this.m.hashCode();
        final int hashCode12 = this.n.hashCode();
        final int hashCode13 = this.o.hashCode();
        if (this.p) {
            n = 1231;
        }
        final long q = this.q;
        final long r = this.r;
        return ((((((((((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ g) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode13) * 1000003 ^ n) * 1000003 ^ (int)(q ^ q >>> 32)) * 1000003 ^ (int)(r >>> 32 ^ r);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final int g = this.g;
        final boolean h = this.h;
        final boolean i = this.i;
        final String value = String.valueOf(this.j);
        final String value2 = String.valueOf(this.s);
        final String value3 = String.valueOf(this.k);
        final String l = this.l;
        final String m = this.m;
        final String n = this.n;
        final String value4 = String.valueOf(this.o);
        final boolean p = this.p;
        final long q = this.q;
        final long r = this.r;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 530 + String.valueOf(b).length() + String.valueOf(c).length() + String.valueOf(d).length() + String.valueOf(e).length() + String.valueOf(f).length() + String.valueOf(value).length() + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(l).length() + String.valueOf(m).length() + String.valueOf(n).length() + String.valueOf(value4).length());
        sb.append("Config{filenameDefaultPrefix=");
        sb.append(a);
        sb.append(", filenameImagePrefix=");
        sb.append(b);
        sb.append(", filenameVideoPrefix=");
        sb.append(c);
        sb.append(", filenameTmpPrefix=");
        sb.append(d);
        sb.append(", filenameBurstTagPrefix=");
        sb.append(e);
        sb.append(", filenameBurstPrimaryTag=");
        sb.append(f);
        sb.append(", filenameBurstDigitCount=");
        sb.append(g);
        sb.append(", filenameBurstTagRequired=");
        sb.append(h);
        sb.append(", filenameBurstUseGroupTag=");
        sb.append(i);
        sb.append(", filenameGroupFormat=");
        sb.append(value);
        sb.append(", filenameMimeTypeGroupPrefix=");
        sb.append(value2);
        sb.append(", storageContext=");
        sb.append(value3);
        sb.append(", storageCacheSubpath=");
        sb.append(l);
        sb.append(", storageDataSubpath=");
        sb.append(m);
        sb.append(", storageDcimSubpath=");
        sb.append(n);
        sb.append(", defaultContentResolverApi=");
        sb.append(value4);
        sb.append(", notifyChangeOnPublish=");
        sb.append(p);
        sb.append(", notifyChangeTimeoutMs=");
        sb.append(q);
        sb.append(", storageAutoPublishTimeoutMs=");
        sb.append(r);
        sb.append("}");
        return sb.toString();
    }
}
