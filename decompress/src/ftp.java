import android.media.MediaFormat;
import android.util.Pair;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCodec$CodecException;
import android.media.MediaCodec;
import android.media.MediaCodec$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ftp extends MediaCodec$Callback
{
    final /* synthetic */ lup a;
    final /* synthetic */ ftt b;
    
    public ftp(final ftt b, final lup a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onError(final MediaCodec mediaCodec, final MediaCodec$CodecException ex) {
        this.b.h.set(true);
        this.b.b((Exception)ex);
    }
    
    public final void onInputBufferAvailable(final MediaCodec mediaCodec, final int n) {
        this.b.h.set(true);
        this.b.a.addLast(n);
        this.b.c();
    }
    
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.b.h.set(true);
        this.b.b.addLast(Pair.create((Object)n, (Object)mediaCodec$BufferInfo));
        this.b.c();
    }
    
    public final void onOutputFormatChanged(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        this.b.h.set(true);
        this.a.a(ofi.n(mediaFormat));
    }
}
