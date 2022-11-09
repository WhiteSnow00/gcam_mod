import android.media.MediaCodec$BufferInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class fri implements fra
{
    final /* synthetic */ MediaCodec$BufferInfo a;
    final /* synthetic */ fra b;
    
    public fri(final MediaCodec$BufferInfo a, final fra b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void close() {
        this.b.close();
    }
}
