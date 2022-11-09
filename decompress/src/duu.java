// 
// Decompiled by Procyon v0.6.0
// 

final class duu
{
    public final String a;
    public final int b;
    public final lji c;
    
    public duu() {
    }
    
    public duu(final String a, final int b, final lji c) {
        this.a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null metadata");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof duu) {
            final duu duu = (duu)o;
            if (this.a.equals(duu.a) && this.b == duu.b && this.c.equals(duu.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ 0x2) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(a.length() + 86 + String.valueOf(value).length());
        sb.append("MetadataRecord{debugFolder=");
        sb.append(a);
        sb.append(", frameType=2, frameIndex=");
        sb.append(b);
        sb.append(", metadata=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
