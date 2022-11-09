import android.media.MediaCodec$BufferInfo;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import android.os.Bundle;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

final class fqz implements frc
{
    private static final nsd b;
    public final lyo a;
    private final MediaCodec c;
    private final lyp d;
    private final mao e;
    private boolean f;
    
    static {
        b = nsd.g("com/google/android/apps/camera/moments/GLImageEncoder");
    }
    
    public fqz(final MediaCodec c, final MediaFormat mediaFormat, final lyp d, final mao e) {
        this.f = false;
        if (liz.a().a) {
            a.l(fqz.b.c(), "Using GL-based image encoder on emulator can cause individual frames to fail to encode. Consider using a retryingEncoder wrapper.", '\u06f4');
        }
        final MediaFormat mediaFormat2 = new MediaFormat(mediaFormat);
        mediaFormat2.setInteger("latency", 1);
        c.configure(mediaFormat2, (Surface)null, (MediaCrypto)null, 1);
        final lyo c2 = lyo.c(d, new mav(c.createInputSurface()), lvl.d(mediaFormat.getInteger("width"), mediaFormat.getInteger("height")));
        c.start();
        this.d = d;
        this.c = c;
        this.a = c2;
        this.e = e;
    }
    
    @Override
    public final fra a(lju lju, frb frb) {
        monitorenter(this);
        try {
            final Bundle parameters = new Bundle();
            parameters.putInt("request-sync", 0);
            this.c.setParameters(parameters);
            final float[] a = frb.a;
            final long a2 = ((frj)lju).a;
            lju = (lju)lju.f();
            Label_0080: {
                if (lju != null) {
                    break Label_0080;
                }
                try {
                    fqz.b.c().E(1782).o("Incoming image missing HardwareBuffer.");
                    Label_0161: {
                        break Label_0161;
                        frb = (frb)new EGLImage((HardwareBuffer)lju);
                        try {
                            final lzn b = lzn.b(this.d, (EGLImage)frb);
                            try {
                                this.d.execute(new fqy(this, a2));
                                this.e.d(b, this.a, a);
                                lza.c(this.d);
                                b.close();
                                ((EGLImage)frb).close();
                                ((HardwareBuffer)lju).close();
                                this.f = true;
                                frb = (frb)new MediaCodec$BufferInfo();
                                while (true) {
                                    final int dequeueOutputBuffer = this.c.dequeueOutputBuffer((MediaCodec$BufferInfo)frb, 5000000L);
                                    if (dequeueOutputBuffer >= 0) {
                                        if ((((MediaCodec$BufferInfo)frb).flags & 0x2) != 0x0) {
                                            this.c.releaseOutputBuffer(dequeueOutputBuffer, false);
                                        }
                                        else {
                                            lju = (lju)this.c;
                                            final frg frg = new frg((MediaCodec$BufferInfo)frb, (MediaCodec)lju, dequeueOutputBuffer);
                                            if ((0x1 & frg.a.flags) != 0x0) {
                                                monitorexit(this);
                                                return frg;
                                            }
                                            frg.close();
                                            lju = (lju)new IllegalStateException("Requested key-frame from codec, but codec did not provide it!");
                                            throw lju;
                                        }
                                    }
                                    else {
                                        if (dequeueOutputBuffer == -1) {
                                            lju = (lju)new IllegalStateException("Timed out waiting for encoder output!");
                                            throw lju;
                                        }
                                        if (dequeueOutputBuffer != -2) {
                                            continue;
                                        }
                                        final int integer = this.c.getOutputFormat().getInteger("latency", -42);
                                        if (integer > 0) {
                                            if (integer == 1) {
                                                continue;
                                            }
                                            frb = new(java.lang.IllegalStateException.class)();
                                            lju = (lju)new StringBuilder(174);
                                            ((StringBuilder)lju).append("Media codec does not support low latency mode, and hence cannot be used for frame-by-frame encoding. Codec returned a latency of ");
                                            ((StringBuilder)lju).append(integer);
                                            ((StringBuilder)lju).append(". Please choose a different codec!");
                                            new IllegalStateException(((StringBuilder)lju).toString());
                                            throw frb;
                                        }
                                        else {
                                            if (integer != -42) {
                                                continue;
                                            }
                                            a.l(fqz.b.c(), "Media codec does not specify latency, and may ignore latency key. This could cause ad-hoc encoding to fail.", '\u06f5');
                                        }
                                    }
                                }
                            }
                            finally {
                                try {
                                    b.close();
                                }
                                finally {
                                    final Throwable t;
                                    final Throwable t2;
                                    t.addSuppressed(t2);
                                }
                            }
                        }
                        finally {
                            try {
                                ((EGLImage)frb).close();
                            }
                            finally {
                                final Throwable t3;
                                final Throwable t4;
                                t3.addSuppressed(t4);
                            }
                        }
                    }
                }
                finally {
                    if (lju != null) {
                        try {
                            ((HardwareBuffer)lju).close();
                        }
                        finally {
                            final Throwable t5;
                            ((Throwable)frb).addSuppressed(t5);
                        }
                    }
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (this.f) {
                this.c.signalEndOfInputStream();
                final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
                while (true) {
                    final int dequeueOutputBuffer = this.c.dequeueOutputBuffer(mediaCodec$BufferInfo, 5000000L);
                    if ((mediaCodec$BufferInfo.flags & 0x4) != 0x0) {
                        this.f = false;
                        break;
                    }
                    if (dequeueOutputBuffer != -1) {
                        continue;
                    }
                    throw new IllegalStateException("Timed out waiting for encoder to close!");
                }
            }
            this.c.release();
            this.a.close();
            this.e.close();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
