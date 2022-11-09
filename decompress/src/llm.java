// 
// Decompiled by Procyon v0.6.0
// 

final class llm
{
    public final long a;
    public final long b;
    public final long c;
    private final long d;
    private final String e;
    private final String f;
    private final String g;
    
    public llm() {
    }
    
    public llm(final long a, final long b, final long c, final long d, final String e, final String f, final String g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof llm) {
            final llm llm = (llm)o;
            if (this.a == llm.a && this.b == llm.b && this.c == llm.c && this.d == llm.d && this.e.equals(llm.e) && this.f.equals(llm.f) && this.g.equals(llm.g)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        return this.g.hashCode() ^ (((((((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ (int)(c >>> 32 ^ c)) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 203 + String.valueOf(f).length() + String.valueOf(g).length());
        sb.append("TemporaryMediaFileInfo{groupTimestampNs=");
        sb.append(a);
        sb.append(", groupUtcTimestampMs=");
        sb.append(b);
        sb.append(", timestampNs=");
        sb.append(c);
        sb.append(", utcTimestampMs=");
        sb.append(d);
        sb.append(", groupTag=");
        sb.append(e);
        sb.append(", tag=");
        sb.append(f);
        sb.append(", extension=");
        sb.append(g);
        sb.append("}");
        return sb.toString();
    }
}
