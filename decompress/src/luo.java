import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class luo implements lup
{
    final /* synthetic */ ofn a;
    final /* synthetic */ mcf b;
    
    public luo(final ofn a, final mcf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final oey oey) {
        this.a.e(oey);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.b.b(byteBuffer, mediaCodec$BufferInfo);
    }
    
    @Override
    public final void close() {
        this.b.close();
    }
}
