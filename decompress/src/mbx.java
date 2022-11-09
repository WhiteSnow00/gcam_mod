import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbx implements mcf
{
    private final mcf a;
    
    public mbx(final mcf a) {
        this.a = a;
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final mca a = mca.a(byteBuffer, mediaCodec$BufferInfo);
        this.a.b(a.a, a.b);
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
}
