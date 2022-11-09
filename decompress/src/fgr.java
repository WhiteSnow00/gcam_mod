import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class fgr implements lup
{
    final /* synthetic */ ofn a;
    final /* synthetic */ lup b;
    final /* synthetic */ fgt c;
    
    public fgr(final fgt c, final ofn a, final lup b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final oey oey) {
        this.a.e(oey);
        this.b.a(oey);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.b.b(byteBuffer, mediaCodec$BufferInfo);
        if (!this.a.isDone()) {
            a.l(fgt.a.c(), "Configured format not yet available for packet; stats might be inaccurate", '\u067a');
            return;
        }
        if (this.a.isCancelled()) {
            return;
        }
        try {
            final MediaFormat mediaFormat = (MediaFormat)ofi.u(this.a);
            new fgq(mediaCodec$BufferInfo, mediaFormat);
            flj.b();
            if (!lsp.h(mediaFormat.getString("mime"))) {
                return;
            }
            synchronized (this.c.b) {
                final fgs b = this.c.b;
                if (b.b == 0) {
                    b.c = Long.MAX_VALUE;
                }
                if ((mediaCodec$BufferInfo.flags & 0x1) != 0x0) {
                    final fgs b2 = this.c.b;
                    ++b2.a;
                }
                final fgs b3 = this.c.b;
                ++b3.b;
                b3.c = Math.min(mediaCodec$BufferInfo.presentationTimeUs, this.c.b.c);
                this.c.b.d = Math.max(mediaCodec$BufferInfo.presentationTimeUs, this.c.b.d);
            }
        }
        catch (final ExecutionException ex) {
            throw new AssertionError((Object)"... we just checked for isDone.");
        }
    }
    
    @Override
    public final void close() {
        this.b.close();
    }
}
