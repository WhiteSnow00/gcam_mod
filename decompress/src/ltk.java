import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public interface ltk extends AutoCloseable
{
    void a(final float p0);
    
    void b(final float p0, final float p1);
    
    void c(final int p0);
    
    void close();
    
    ltx d(final int p0, final MediaFormat p1);
    
    void e(final ltx p0, final ByteBuffer p1, final MediaCodec$BufferInfo p2);
}
