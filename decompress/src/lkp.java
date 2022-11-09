import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lkp
{
    public final lkk a;
    public final long b;
    public final String c;
    public final lkd d;
    public final noi e;
    public final noi f;
    public final noi g;
    public final nns h;
    public final llu i;
    public final int j;
    private final long k;
    
    public lkp() {
    }
    
    public lkp(final lkk a, final long k, final long b, final String c, final lkd d, final noi e, final noi f, final noi g, final int j, final nns h, final llu i) {
        this.a = a;
        this.k = k;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lkp) {
            final lkp lkp = (lkp)o;
            if (this.a.equals(lkp.a) && this.k == lkp.k && this.b == lkp.b && this.c.equals(lkp.c)) {
                final lkd d = this.d;
                if (d == null) {
                    if (lkp.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(lkp.d)) {
                    return false;
                }
                if (this.e.equals(lkp.e) && this.f.equals(lkp.f) && this.g.equals(lkp.g)) {
                    final int j = this.j;
                    final int i = lkp.j;
                    if (j == 0) {
                        throw null;
                    }
                    if (j == i && nqb.t(this.h, lkp.h) && this.i.equals(lkp.i)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long k = this.k;
        final long b = this.b;
        final int n = (int)(k ^ k >>> 32);
        final int n2 = (int)(b >>> 32 ^ b);
        final int hashCode2 = this.c.hashCode();
        final lkd d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final int hashCode4 = this.e.hashCode();
        final int hashCode5 = this.f.hashCode();
        final int hashCode6 = this.g.hashCode();
        final int j = this.j;
        if (j != 0) {
            return ((((((((((hashCode ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ j) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final long k = this.k;
        final long b = this.b;
        final String c = this.c;
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.e);
        final String value4 = String.valueOf(this.f);
        final String value5 = String.valueOf(this.g);
        String s = null;
        switch (this.j) {
            default: {
                s = "null";
                break;
            }
            case 3: {
                s = "ABANDON";
                break;
            }
            case 2: {
                s = "PUBLISH";
                break;
            }
            case 1: {
                s = "NONE";
                break;
            }
        }
        final String value6 = String.valueOf(this.h);
        final String value7 = String.valueOf(this.i);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 212 + String.valueOf(c).length() + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + s.length() + String.valueOf(value6).length() + String.valueOf(value7).length());
        sb.append("MediaGroupInfo{mediaGroupId=");
        sb.append(value);
        sb.append(", timestampNs=");
        sb.append(k);
        sb.append(", utcTimestampMs=");
        sb.append(b);
        sb.append(", tag=");
        sb.append(c);
        sb.append(", primary=");
        sb.append(value2);
        sb.append(", mediaFiles=");
        sb.append(value3);
        sb.append(", privateMediaFiles=");
        sb.append(value4);
        sb.append(", cachedFiles=");
        sb.append(value5);
        sb.append(", publishIntent=");
        sb.append(s);
        sb.append(", listeners=");
        sb.append(value6);
        sb.append(", contentResolverApi=");
        sb.append(value7);
        sb.append("}");
        return sb.toString();
    }
}
