import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public interface mcf extends AutoCloseable
{
    void b(final ByteBuffer p0, final MediaCodec$BufferInfo p1);
    
    void close();
}
