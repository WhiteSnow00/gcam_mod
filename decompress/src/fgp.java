import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgp implements lup
{
    private final lup a;
    
    public fgp(final lup a) {
        this.a = a;
    }
    
    @Override
    public final void a(final oey oey) {
        this.a.a(oey);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        if ((mediaCodec$BufferInfo.flags & Integer.MIN_VALUE) != 0x0) {
            final long presentationTimeUs = mediaCodec$BufferInfo.presentationTimeUs;
            return;
        }
        this.a.b(byteBuffer, mediaCodec$BufferInfo);
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
}
