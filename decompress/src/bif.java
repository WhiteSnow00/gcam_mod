import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bif implements awc
{
    private final Object b;
    
    public bif(final Object b) {
        bit.a(b);
        this.b = b;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(bif.a));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof bif && this.b.equals(((bif)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
        sb.append("ObjectKey{object=");
        sb.append(value);
        sb.append('}');
        return sb.toString();
    }
}
