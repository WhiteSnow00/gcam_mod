import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.util.Log;
import android.media.MediaCodec$CodecException;
import android.media.MediaCodec;
import android.media.MediaCodec$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class mbe extends MediaCodec$Callback
{
    final /* synthetic */ mbf a;
    
    public mbe(final mbf a) {
        this.a = a;
    }
    
    public final void onError(final MediaCodec mediaCodec, final MediaCodec$CodecException ex) {
        if (ex.isTransient()) {
            Log.w("AsynchMediaCodec", "Transient error occurred while processing data.", (Throwable)ex);
        }
        else if (ex.isRecoverable()) {
            Log.w("AsynchMediaCodec", "Recoverable error occurred while encoding data.", (Throwable)ex);
            this.a.e.a((Throwable)ex);
            this.a.c();
        }
        else {
            Log.e("AsynchMediaCodec", "Unrecoverable error occurred while encoding data.", (Throwable)ex);
            this.a.e.a((Throwable)ex);
            this.a.c();
        }
        this.a.b.set(3);
        this.a.n.e(3);
        this.a.g.getAndSet(false);
    }
    
    public final void onInputBufferAvailable(final MediaCodec mediaCodec, final int n) {
        synchronized (this.a) {
            if (this.a.e.isDone()) {
                return;
            }
            if (this.a.f.getAndSet(false)) {
                this.a.e(n);
            }
            else {
                this.a.d.addLast(n);
                this.a.n.a(this.a);
            }
        }
    }
    
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        synchronized (this.a) {
            if (this.a.e.isDone()) {
                return;
            }
            final boolean value = this.a.h.get();
            final int flags = mediaCodec$BufferInfo.flags;
            if (mediaCodec$BufferInfo.size > 0 && !value && (flags & 0x2) == 0x0) {
                this.a.n.c(mediaCodec$BufferInfo);
                try {
                    final mcr m = this.a.m;
                    final mbf a = this.a;
                    final mbd mbd = new mbd(a, mediaCodec, mediaCodec.getOutputBuffer(n), mediaCodec$BufferInfo, n);
                    synchronized (a) {
                        a.l.add(mbd);
                        monitorexit(a);
                        m.a(mbd);
                    }
                }
                catch (final MediaCodec$CodecException ex) {
                    this.a.j.onError(mediaCodec, ex);
                    return;
                }
                finally {
                    Log.e("AsynchMediaCodec", "Exception occurred while trying construct media data", (Throwable)mediaCodec);
                    return;
                }
            }
            try {
                mediaCodec.releaseOutputBuffer(n, false);
                this.a.a(mediaCodec$BufferInfo);
            }
            catch (final MediaCodec$CodecException ex2) {
                this.a.j.onError(mediaCodec, ex2);
            }
            finally {
                final Throwable t;
                Log.e("AsynchMediaCodec", "Exception occurred while trying to release output buffer", t);
            }
        }
    }
    
    public final void onOutputFormatChanged(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        this.a.m.b(mediaFormat);
    }
}
