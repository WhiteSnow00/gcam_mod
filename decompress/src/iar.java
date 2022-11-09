import android.media.MediaFormat;
import java.util.concurrent.TimeUnit;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCodec$CodecException;
import android.media.MediaCodec;
import android.media.MediaCodec$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class iar extends MediaCodec$Callback
{
    final /* synthetic */ cxl a;
    final /* synthetic */ ias b;
    
    public iar(final ias b, final cxl a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onError(final MediaCodec mediaCodec, final MediaCodec$CodecException ex) {
        if (!ex.isTransient()) {
            ias.a.b().h((Throwable)ex).E(2618).A("Stopping recording due to: CheetahFrSelector failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", ex.getErrorCode(), ex.isTransient(), ex.isRecoverable(), ex.getMessage(), ex.getDiagnosticInfo());
            return;
        }
        ias.a.b().E(2617).A("CheetahFrSelector failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", ex.getErrorCode(), ex.isTransient(), ex.isRecoverable(), ex.getMessage(), ex.getDiagnosticInfo());
    }
    
    public final void onInputBufferAvailable(final MediaCodec mediaCodec, final int n) {
    }
    
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        synchronized (this.b.s) {
            final ias b = this.b;
            final kmq b2 = b.B;
            b2.getClass();
            final idd v = b.v;
            v.getClass();
            final ida u = b.u;
            u.getClass();
            final kof a = b2.a;
            a.getClass();
            final cxl a2 = this.a;
            final cxm a3 = cyl.a;
            a2.b();
            a.n(n, mediaCodec$BufferInfo);
            if ((mediaCodec$BufferInfo.flags & 0x2) == 0x0 && mediaCodec$BufferInfo.size > 0) {
                this.b.e.set(TimeUnit.SECONDS.toMillis(this.b.f.incrementAndGet()) / this.b.y.f);
                this.b.p.set(TimeUnit.SECONDS.toMillis(this.b.m.incrementAndGet()) / this.b.y.f);
            }
            v.i(this.b.d());
            v.j(this.b.c());
            v.d(this.b.a());
            v.e(this.b.b());
            final ias b3 = this.b;
            u.e(TimeUnit.SECONDS.toMillis(b3.k.get()) / b3.e().f);
            u.g(this.b.p.get());
            this.b.m.get();
            u.h();
            final ias b4 = this.b;
            b4.k.get();
            b4.m.get();
            u.i();
            final ofn x = this.b.x;
            if (x != null && !x.isDone() && this.b.m.get() > 1L) {
                ias.a.c().E(2619).q("At least %d frames are encoded. ", this.b.m.get());
                final ias b5 = this.b;
                b5.x.o(b5.A);
            }
        }
    }
    
    public final void onOutputFormatChanged(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        synchronized (this.b.s) {
            final kmq b = this.b.B;
            b.getClass();
            final kof a = b.a;
            a.getClass();
            a.l(mediaCodec.getOutputFormat());
        }
    }
}
