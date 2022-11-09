// 
// Decompiled by Procyon v0.6.0
// 

public final class gwa
{
    public final niz a;
    public final niz b;
    public final niz c;
    
    public gwa() {
    }
    
    public gwa(final niz a, final niz b, final niz c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static gvz a() {
        return new gvz(null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gwa) {
            final gwa gwa = (gwa)o;
            if (this.a.equals(gwa.a) && this.b.equals(gwa.b) && this.c.equals(gwa.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 59 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("PortraitJpegMetadata{main=");
        sb.append(value);
        sb.append(", extended=");
        sb.append(value2);
        sb.append(", dynamicDepthResult=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
