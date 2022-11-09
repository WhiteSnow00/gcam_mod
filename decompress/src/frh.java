import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class frh implements fra
{
    final /* synthetic */ MediaCodec$BufferInfo a;
    final /* synthetic */ MediaFormat b;
    final /* synthetic */ ByteBuffer c;
    
    public frh(final MediaCodec$BufferInfo a, final MediaFormat b, final ByteBuffer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void close() {
    }
}
