import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffq implements lup
{
    private final lup a;
    private volatile boolean b;
    
    public ffq(final lup a) {
        this.b = false;
        this.a = a;
    }
    
    @Override
    public final void a(final oey oey) {
        this.a.a(oey);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        if ((mediaCodec$BufferInfo.flags & 0x1) != 0x0) {
            this.b = true;
        }
        if (this.b) {
            this.a.b(byteBuffer, mediaCodec$BufferInfo);
        }
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
}
