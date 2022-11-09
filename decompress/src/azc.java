import java.nio.ByteBuffer;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

final class azc implements awc
{
    private static final biq b;
    private final azi c;
    private final awc d;
    private final awc e;
    private final int f;
    private final int g;
    private final Class h;
    private final awg i;
    private final awk j;
    
    static {
        b = new biq(50L);
    }
    
    public azc(final azi c, final awc d, final awc e, final int f, final int g, final awk j, final Class h, final awg i) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        final byte[] array = (byte[])this.c.e(byte[].class);
        ByteBuffer.wrap(array).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(array);
        final awk j = this.j;
        if (j != null) {
            j.a(messageDigest);
        }
        this.i.a(messageDigest);
        final biq b = azc.b;
        byte[] bytes;
        if ((bytes = (byte[])b.f(this.h)) == null) {
            bytes = this.h.getName().getBytes(azc.a);
            b.g(this.h, bytes);
        }
        messageDigest.update(bytes);
        this.c.c(array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof azc) {
            final azc azc = (azc)o;
            if (this.g == azc.g && this.f == azc.f && biv.l(this.j, azc.j) && this.h.equals(azc.h) && this.d.equals(azc.d) && this.e.equals(azc.e) && this.i.equals(azc.i)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int n = ((this.d.hashCode() * 31 + this.e.hashCode()) * 31 + this.f) * 31 + this.g;
        final awk j = this.j;
        int n2 = n;
        if (j != null) {
            n2 = n * 31 + j.hashCode();
        }
        return (n2 * 31 + this.h.hashCode()) * 31 + this.i.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.e);
        final int f = this.f;
        final int g = this.g;
        final String value3 = String.valueOf(this.h);
        final String value4 = String.valueOf(this.j);
        final String value5 = String.valueOf(this.i);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 131 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length());
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(value);
        sb.append(", signature=");
        sb.append(value2);
        sb.append(", width=");
        sb.append(f);
        sb.append(", height=");
        sb.append(g);
        sb.append(", decodedResourceClass=");
        sb.append(value3);
        sb.append(", transformation='");
        sb.append(value4);
        sb.append("', options=");
        sb.append(value5);
        sb.append('}');
        return sb.toString();
    }
}
