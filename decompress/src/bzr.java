// 
// Decompiled by Procyon v0.6.0
// 

public final class bzr
{
    public final kvs a;
    public final kwz b;
    
    public bzr() {
    }
    
    public bzr(final kvs a, final kwz b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof bzr) {
            final bzr bzr = (bzr)o;
            if (this.a.equals(bzr.a) && this.b.equals(bzr.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 29 + String.valueOf(value2).length());
        sb.append("FrameFeature{frame=");
        sb.append(value);
        sb.append(", stream=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
