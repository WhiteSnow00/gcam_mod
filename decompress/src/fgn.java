import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class fgn implements mcf
{
    final /* synthetic */ fgo a;
    
    public fgn(final fgo a) {
        this.a = a;
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.a.a.b(byteBuffer, mediaCodec$BufferInfo);
    }
    
    @Override
    public final void close() {
        this.a.a.close();
        this.a.b.o(new Object());
    }
}
