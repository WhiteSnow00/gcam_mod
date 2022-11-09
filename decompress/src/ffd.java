import java.util.concurrent.CancellationException;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class ffd implements lup
{
    private final lup a;
    private final ofn b;
    
    public ffd(final lup a, final ofn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final oey oey) {
        this.a.a(oey);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        try {
            this.a.b(byteBuffer, mediaCodec$BufferInfo);
            if ((mediaCodec$BufferInfo.flags & 0x1) != 0x0) {
                this.b.o(mediaCodec$BufferInfo.presentationTimeUs);
            }
        }
        catch (final CancellationException ex) {}
        finally {
            this.b.cancel(false);
        }
    }
    
    @Override
    public final void close() {
        try {
            this.a.close();
            if (!this.b.isDone()) {
                this.b.o(null);
            }
        }
        catch (final CancellationException ex) {}
        finally {
            this.b.cancel(false);
        }
    }
}
