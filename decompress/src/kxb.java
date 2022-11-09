// 
// Decompiled by Procyon v0.6.0
// 

public final class kxb
{
    public final kxd a;
    public final niz b;
    public final niz c;
    public final kre d;
    public final int e;
    public final int f;
    public final niz g;
    public final boolean h;
    public final boolean i;
    
    public kxb() {
    }
    
    public kxb(final kxd a, final niz b, final niz c, final kre d, final int e, final int f, final niz g, final boolean h, final boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static kxa a() {
        final kxa kxa = new kxa(null);
        kxa.f(0);
        kxa.c(-1);
        kxa.d(false);
        kxa.e(false);
        return kxa;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kxb) {
            final kxb kxb = (kxb)o;
            if (this.a.equals(kxb.a) && this.b.equals(kxb.b) && this.c.equals(kxb.c) && this.d.equals(kxb.d) && this.e == kxb.e && this.f == kxb.f && this.g.equals(kxb.g) && this.h == kxb.h && this.i == kxb.i) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.d.hashCode();
        final int e = this.e;
        final int f = this.f;
        final int hashCode4 = this.g.hashCode();
        final boolean h = this.h;
        int n = 1237;
        int n2;
        if (!h) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.i) {
            n = 1231;
        }
        return ((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ 0x79A31AAC) * 1000003 ^ hashCode3) * 1000003 ^ e) * 1000003 ^ f) * 1000003 ^ hashCode4) * 1000003 ^ n2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final int e = this.e;
        final int f = this.f;
        final String value5 = String.valueOf(this.g);
        final boolean h = this.h;
        final boolean i = this.i;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 151 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length());
        sb.append("StreamConfig{type=");
        sb.append(value);
        sb.append(", cameraId=");
        sb.append(value2);
        sb.append(", surface=");
        sb.append(value3);
        sb.append(", size=");
        sb.append(value4);
        sb.append(", imageFormat=");
        sb.append(e);
        sb.append(", capacity=");
        sb.append(f);
        sb.append(", usageFlags=");
        sb.append(value5);
        sb.append(", forCapture=");
        sb.append(h);
        sb.append(", ignoreMemoryLimits=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
