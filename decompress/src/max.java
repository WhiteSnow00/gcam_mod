import java.nio.ByteBuffer;
import android.media.AudioFormat;
import android.media.AudioRouting;

// 
// Decompiled by Procyon v0.6.0
// 

public interface max extends AutoCloseable, AudioRouting
{
    AudioFormat a();
    
    maw b(final ByteBuffer p0, final int p1);
    
    void c();
    
    void close();
    
    void d();
}
