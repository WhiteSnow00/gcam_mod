import android.util.Log;
import android.media.MediaCodec$CodecException;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbc implements AutoCloseable
{
    public long a;
    public final /* synthetic */ ByteBuffer b;
    final /* synthetic */ int c;
    final /* synthetic */ mbf d;
    
    public mbc(final mbf d, final ByteBuffer b, final int c) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = 0L;
    }
    
    @Override
    public final void close() {
        synchronized (this.d) {
            if (this.d.k.remove(this)) {
                final int position = this.b.position();
                try {
                    this.d.a.queueInputBuffer(this.c, 0, position, this.a, 0);
                }
                catch (final MediaCodec$CodecException ex) {
                    final mbf d = this.d;
                    d.j.onError(d.a, ex);
                }
                finally {
                    final Throwable t;
                    Log.e("AsynchMediaCodec", "Exception caught while attempting to queue input buffer.", t);
                }
            }
            else {
                final long a = this.a;
                final StringBuilder sb = new StringBuilder(126);
                sb.append("Trying to submit input buffer for timestamp ");
                sb.append(a);
                sb.append(" but it has been closed already (... or the codec was stopped)");
                Log.w("AsynchMediaCodec", sb.toString());
            }
        }
    }
}
