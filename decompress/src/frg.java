import android.media.MediaCodec;
import android.media.MediaCodec$BufferInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class frg implements fra
{
    final /* synthetic */ MediaCodec$BufferInfo a;
    final /* synthetic */ MediaCodec b;
    final /* synthetic */ int c;
    
    public frg(final MediaCodec$BufferInfo a, final MediaCodec b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void close() {
        this.b.releaseOutputBuffer(this.c, false);
    }
}
