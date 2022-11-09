import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

final class axt implements awc
{
    private final awc b;
    private final awc c;
    
    public axt(final awc b, final awc c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof axt) {
            final axt axt = (axt)o;
            if (this.b.equals(axt.b) && this.c.equals(axt.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 36 + String.valueOf(value2).length());
        sb.append("DataCacheKey{sourceKey=");
        sb.append(value);
        sb.append(", signature=");
        sb.append(value2);
        sb.append('}');
        return sb.toString();
    }
}
