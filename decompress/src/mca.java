import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mca
{
    public final ByteBuffer a;
    public final MediaCodec$BufferInfo b;
    
    public mca(final ByteBuffer a, final MediaCodec$BufferInfo b) {
        this.a = a;
        this.b = b;
    }
    
    public static mca a(ByteBuffer duplicate, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final MediaCodec$BufferInfo mediaCodec$BufferInfo2 = new MediaCodec$BufferInfo();
        mediaCodec$BufferInfo2.set(0, mediaCodec$BufferInfo.size, mediaCodec$BufferInfo.presentationTimeUs, mediaCodec$BufferInfo.flags);
        duplicate = duplicate.duplicate();
        duplicate.position(mediaCodec$BufferInfo.offset);
        duplicate.limit(mediaCodec$BufferInfo.size + mediaCodec$BufferInfo.offset);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaCodec$BufferInfo.size);
        allocateDirect.put(duplicate);
        allocateDirect.rewind();
        return new mca(allocateDirect, mediaCodec$BufferInfo2);
    }
}
