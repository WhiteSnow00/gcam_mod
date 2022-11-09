import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class maw
{
    public final ByteBuffer a;
    public final int b;
    public final long c;
    
    public maw() {
    }
    
    public maw(final ByteBuffer a, final int b, final long c) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null buffer");
    }
    
    public static maw a(final ByteBuffer byteBuffer, final int n, final long n2) {
        return new maw(byteBuffer, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof maw) {
            final maw maw = (maw)o;
            if (this.a.equals(maw.a) && this.b == maw.b && this.c == maw.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        final long c = this.c;
        return ((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ (int)(c ^ c >>> 32);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final long c = this.c;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 72);
        sb.append("AudioPacket{buffer=");
        sb.append(value);
        sb.append(", size=");
        sb.append(b);
        sb.append(", timestampNs=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
