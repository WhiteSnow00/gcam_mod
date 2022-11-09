// 
// Decompiled by Procyon v0.6.0
// 

public final class cgf
{
    public final cgr a;
    public final int b;
    
    public cgf() {
    }
    
    public cgf(final cgr a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static cge a() {
        return new cge();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof cgf) {
            final cgf cgf = (cgf)o;
            if (this.a.equals(cgf.a) && this.b == cgf.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 67);
        sb.append("CamcorderPendingVideoFile{outputVideo=");
        sb.append(value);
        sb.append(", pendingVideoId=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
