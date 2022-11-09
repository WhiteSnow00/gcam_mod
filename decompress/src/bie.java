import java.nio.ByteBuffer;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bie implements awc
{
    private final String b;
    private final long c;
    private final int d;
    
    public bie(final String b, final long c, final int d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.c).putInt(this.d).array());
        messageDigest.update(this.b.getBytes(bie.a));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final bie bie = (bie)o;
            return this.c == bie.c && this.d == bie.d && this.b.equals(bie.b);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final long c = this.c;
        return (hashCode * 31 + (int)(c ^ c >>> 32)) * 31 + this.d;
    }
}
