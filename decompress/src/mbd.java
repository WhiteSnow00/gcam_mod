import android.util.Log;
import android.media.MediaCodec$CodecException;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbd implements AutoCloseable
{
    final /* synthetic */ MediaCodec a;
    public final /* synthetic */ ByteBuffer b;
    public final /* synthetic */ MediaCodec$BufferInfo c;
    final /* synthetic */ int d;
    final /* synthetic */ mbf e;
    
    public mbd(final mbf e, final MediaCodec a, final ByteBuffer b, final MediaCodec$BufferInfo c, final int d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void close() {
        synchronized (this.e) {
            if (this.e.l.remove(this)) {
                if (!this.e.e.isDone()) {
                    try {
                        this.a.releaseOutputBuffer(this.d, false);
                        this.e.n.b(this.c.presentationTimeUs);
                        this.e.a(this.c);
                        return;
                    }
                    catch (final MediaCodec$CodecException ex) {
                        final mbf e = this.e;
                        e.j.onError(e.a, ex);
                        return;
                    }
                    finally {
                        final Throwable t;
                        Log.e("AsynchMediaCodec", "Exception occurred while trying to release output buffer", t);
                        return;
                    }
                }
            }
            final long presentationTimeUs = this.c.presentationTimeUs;
            final StringBuilder sb = new StringBuilder(124);
            sb.append("Trying to close output buffer at timestamp ");
            sb.append(presentationTimeUs);
            sb.append(" but it has been closed or the codec has been stopped already");
            Log.w("AsynchMediaCodec", sb.toString());
        }
    }
}
