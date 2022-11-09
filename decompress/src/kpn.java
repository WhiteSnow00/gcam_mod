import android.media.MediaFormat;
import android.media.MediaCodec$BufferInfo;
import android.util.Log;
import android.media.MediaCodec$CodecException;
import android.media.MediaCodec;
import android.media.MediaCodec$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class kpn extends MediaCodec$Callback
{
    final /* synthetic */ kpp a;
    
    public kpn(final kpp a) {
        this.a = a;
    }
    
    public final void onError(final MediaCodec mediaCodec, final MediaCodec$CodecException ex) {
        final String format = String.format("%s failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", "VideoEncoder", ex.getErrorCode(), ex.isTransient(), ex.isRecoverable(), ex.getMessage(), ex.getDiagnosticInfo());
        if (!ex.isTransient()) {
            this.a.t = true;
            this.a.h.o(null);
            final String value = String.valueOf(format);
            String concat;
            if (value.length() != 0) {
                concat = "Stopping recording due to: ".concat(value);
            }
            else {
                concat = new String("Stopping recording due to: ");
            }
            Log.e("VideoEncoder", concat, (Throwable)ex);
            this.a.e.a(kov.h);
            return;
        }
        Log.e("VideoEncoder", format);
    }
    
    public final void onInputBufferAvailable(final MediaCodec mediaCodec, final int n) {
        Log.e("VideoEncoder", "InputBuffer handling is not implemented (yet) since it's not needed forsurfaces.");
    }
    
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final kpp a = this.a;
        if (a.l) {
            synchronized (a.b) {
                final kpp a2 = this.a;
                if (!a2.v) {
                    a2.u.add(n);
                    this.a.d(true);
                    return;
                }
            }
        }
        this.a.f(n, mediaCodec$BufferInfo);
    }
    
    public final void onOutputFormatChanged(final MediaCodec mediaCodec, final MediaFormat w) {
        final kpp a = this.a;
        if (a.l) {
            synchronized (a.b) {
                final kpp a2 = this.a;
                if (!a2.v) {
                    a2.w = w;
                    return;
                }
            }
        }
        this.a.c(w);
    }
}
