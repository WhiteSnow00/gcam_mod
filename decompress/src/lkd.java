// 
// Decompiled by Procyon v0.6.0
// 

public final class lkd
{
    public final long a;
    public final long b;
    public final String c;
    public final lmb d;
    public final llw e;
    
    public lkd() {
    }
    
    public lkd(final long a, final long b, final String c, final lmb d, final llw e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lkd) {
            final lkd lkd = (lkd)o;
            if (this.a == lkd.a && this.b == lkd.b && this.c.equals(lkd.c) && this.d.equals(lkd.d) && this.e.equals(lkd.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final long b = this.b;
        return this.e.hashCode() ^ (((((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final String c = this.c;
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 114 + String.valueOf(value).length() + String.valueOf(value2).length());
        sb.append("MediaFileInfo{timestampNs=");
        sb.append(a);
        sb.append(", utcTimestampMs=");
        sb.append(b);
        sb.append(", tag=");
        sb.append(c);
        sb.append(", metadata=");
        sb.append(value);
        sb.append(", fileObject=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
