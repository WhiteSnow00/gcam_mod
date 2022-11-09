import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class fhg implements lup
{
    final /* synthetic */ lup a;
    final /* synthetic */ fhh b;
    
    public fhg(final fhh b, final lup a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final oey oey) {
        this.a.a(oey);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.a.b(byteBuffer, mediaCodec$BufferInfo);
        this.b.a.a.R();
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
}
