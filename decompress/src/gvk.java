// 
// Decompiled by Procyon v0.6.0
// 

final class gvk
{
    public final jcw a;
    public final String b;
    public final String c;
    public final long d;
    
    public gvk() {
    }
    
    public gvk(final jcw a, final String b, final String c, final long d) {
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null xmpMetadataMain");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            this.d = d;
            return;
        }
        throw new NullPointerException("Null xmpMetadataExtended");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gvk) {
            final gvk gvk = (gvk)o;
            if (this.a.equals(gvk.a) && this.b.equals(gvk.b) && this.c.equals(gvk.c) && this.d == gvk.d) {
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
        final long d = this.d;
        return (((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ (int)(d >>> 32 ^ d);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String b = this.b;
        final String c = this.c;
        final long d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 87 + b.length() + c.length());
        sb.append("UpsampledImage{image=");
        sb.append(value);
        sb.append(", xmpMetadataMain=");
        sb.append(b);
        sb.append(", xmpMetadataExtended=");
        sb.append(c);
        sb.append(", id=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
