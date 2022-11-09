// 
// Decompiled by Procyon v0.6.0
// 

public final class dxj
{
    private final noi a;
    private final noi b;
    private final noi c;
    private final noi d;
    private final noi e;
    private final noi f;
    private final noi g;
    private final noi h;
    private final noi i;
    private final noi j;
    private final noi k;
    private final noi l;
    private final noi m;
    private final noi n;
    
    public dxj() {
    }
    
    public dxj(final noi a, final noi b, final noi c, final noi d, final noi e, final noi f, final noi g, final noi h, final noi i, final noi j, final noi k, final noi l, final noi m, final noi n) {
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
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public static dxi o() {
        return new dxi(null);
    }
    
    public final niz a() {
        return niz.h(nrr.E(dvr.class, this.b));
    }
    
    public final niz b() {
        return niz.h(nrr.E(dvt.class, this.f));
    }
    
    public final niz c() {
        return niz.h(nrr.E(dvw.class, this.l));
    }
    
    public final niz d() {
        return niz.h(nrr.E(dvx.class, this.m));
    }
    
    public final niz e() {
        return niz.h(nrr.E(dvy.class, this.h));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof dxj) {
            final dxj dxj = (dxj)o;
            if (this.a.equals(dxj.a) && this.b.equals(dxj.b) && this.c.equals(dxj.c) && this.d.equals(dxj.d) && this.e.equals(dxj.e) && this.f.equals(dxj.f) && this.g.equals(dxj.g) && this.h.equals(dxj.h) && this.i.equals(dxj.i) && this.j.equals(dxj.j) && this.k.equals(dxj.k) && this.l.equals(dxj.l) && this.m.equals(dxj.m) && this.n.equals(dxj.n)) {
                return true;
            }
        }
        return false;
    }
    
    public final niz f() {
        return niz.h(nrr.E(dvu.class, this.e));
    }
    
    public final niz g() {
        return niz.h(nrr.E(dvs.class, this.c));
    }
    
    public final niz h() {
        return niz.h(nrr.E(dwd.class, this.d));
    }
    
    @Override
    public final int hashCode() {
        return (((((((((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode()) * 1000003 ^ this.j.hashCode()) * 1000003 ^ this.k.hashCode()) * 1000003 ^ this.l.hashCode()) * 1000003 ^ ((nqr)this.m).c) * 1000003 ^ this.n.hashCode();
    }
    
    public final niz i() {
        return niz.h(nrr.E(dvz.class, this.a));
    }
    
    public final niz j() {
        return niz.h(nrr.E(dwa.class, this.g));
    }
    
    public final niz k() {
        return niz.h(nrr.E(dwb.class, this.j));
    }
    
    public final niz l() {
        return niz.h(nrr.E(dvu.class, this.k));
    }
    
    public final niz m() {
        return niz.h(nrr.E(dwc.class, this.n));
    }
    
    public final niz n() {
        return niz.h(nrr.E(dwd.class, this.i));
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final String value7 = String.valueOf(this.g);
        final String value8 = String.valueOf(this.h);
        final String value9 = String.valueOf(this.i);
        final String value10 = String.valueOf(this.j);
        final String value11 = String.valueOf(this.k);
        final String value12 = String.valueOf(this.l);
        final String value13 = String.valueOf(this.m);
        final String value14 = String.valueOf(this.n);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 291 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(value8).length() + String.valueOf(value9).length() + String.valueOf(value10).length() + String.valueOf(value11).length() + String.valueOf(value12).length() + String.valueOf(value13).length() + String.valueOf(value14).length());
        sb.append("ShotConfig{progressListeners=");
        sb.append(value);
        sb.append(", baseFrameListeners=");
        sb.append(value2);
        sb.append(", postViewRgbListeners=");
        sb.append(value3);
        sb.append(", postViewYuvListeners=");
        sb.append(value4);
        sb.append(", postViewHardwareBufferListeners=");
        sb.append(value5);
        sb.append(", dngListeners=");
        sb.append(value6);
        sb.append(", rawListeners=");
        sb.append(value7);
        sb.append(", pdListeners=");
        sb.append(value8);
        sb.append(", yuvListeners=");
        sb.append(value9);
        sb.append(", rgbListeners=");
        sb.append(value10);
        sb.append(", hardwareBufferListeners=");
        sb.append(value11);
        sb.append(", jpegListeners=");
        sb.append(value12);
        sb.append(", mutableRawListeners=");
        sb.append(value13);
        sb.append(", shotStatusListeners=");
        sb.append(value14);
        sb.append("}");
        return sb.toString();
    }
}
