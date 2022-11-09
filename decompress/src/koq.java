import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.util.Log;
import android.media.MediaCodec$CodecException;
import android.media.MediaCodec;
import android.media.MediaCodec$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class koq extends MediaCodec$Callback
{
    final /* synthetic */ kot a;
    
    public koq(final kot a) {
        this.a = a;
    }
    
    public final void onError(final MediaCodec mediaCodec, final MediaCodec$CodecException ex) {
        final String format = String.format("%s failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", "AudioEncoder", ex.getErrorCode(), ex.isTransient(), ex.isRecoverable(), ex.getMessage(), ex.getDiagnosticInfo());
        if (!ex.isTransient()) {
            this.a.A = true;
            final String value = String.valueOf(format);
            String concat;
            if (value.length() != 0) {
                concat = "Stopping recording due to: ".concat(value);
            }
            else {
                concat = new String("Stopping recording due to: ");
            }
            Log.e("AudioEncoder", concat, (Throwable)ex);
            this.a.g(new kon(this), this.a.c);
            this.a.l.a(kov.g);
            return;
        }
        Log.e("AudioEncoder", format);
    }
    
    public final void onInputBufferAvailable(final MediaCodec mediaCodec, final int n) {
        final kot a = this.a;
        if (a.m) {
            synchronized (a.f) {
                final kot a2 = this.a;
                if (!a2.D) {
                    a2.F.add(n);
                    return;
                }
            }
        }
        if (!this.a.M.isDone()) {
            this.a.g(new kop(this, mediaCodec, n), this.a.b);
        }
    }
    
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final kot a = this.a;
        if (a.m) {
            synchronized (a.f) {
                final kot a2 = this.a;
                if (!a2.D) {
                    a2.G.add(n);
                    return;
                }
            }
        }
        if (!this.a.M.isDone()) {
            this.a.g(new koo(this, n, mediaCodec$BufferInfo), this.a.c);
        }
    }
    
    public final void onOutputFormatChanged(final MediaCodec mediaCodec, final MediaFormat e) {
        final kot a = this.a;
        if (a.m) {
            synchronized (a.f) {
                final kot a2 = this.a;
                if (!a2.D) {
                    a2.E = e;
                    return;
                }
            }
        }
        this.a.f(e);
    }
}
