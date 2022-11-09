import java.nio.ByteBuffer;
import android.media.MediaDataSource;

// 
// Decompiled by Procyon v0.6.0
// 

final class bet extends MediaDataSource
{
    final /* synthetic */ ByteBuffer a;
    
    public bet(final ByteBuffer a) {
        this.a = a;
    }
    
    public final void close() {
    }
    
    public final long getSize() {
        return this.a.limit();
    }
    
    public final int readAt(final long n, final byte[] array, final int n2, int min) {
        if (n >= this.a.limit()) {
            return -1;
        }
        this.a.position((int)n);
        min = Math.min(min, this.a.remaining());
        this.a.get(array, n2, min);
        return min;
    }
}
