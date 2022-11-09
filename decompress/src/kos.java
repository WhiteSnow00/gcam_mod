import java.nio.ByteBuffer;
import android.media.MediaCodec$BufferInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class kos
{
    public final MediaCodec$BufferInfo a;
    public final ByteBuffer b;
    
    public kos() {
    }
    
    public kos(final MediaCodec$BufferInfo a, final ByteBuffer b) {
        if (a == null) {
            throw new NullPointerException("Null bufferInfo");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null byteBuffer");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kos) {
            final kos kos = (kos)o;
            if (this.a.equals(kos.a) && this.b.equals(kos.b)) {
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
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 37 + String.valueOf(value2).length());
        sb.append("AudioBuffer{bufferInfo=");
        sb.append(value);
        sb.append(", byteBuffer=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
