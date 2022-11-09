import java.io.IOException;
import android.media.MediaCodec$CodecException;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import android.media.MediaCodec$BufferInfo;
import android.os.Handler;
import android.media.MediaFormat;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftu implements ftk
{
    public final AtomicInteger a;
    public final AtomicInteger b;
    public final lfg c;
    public final MediaFormat d;
    public final gxi e;
    public final krr f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final lyp j;
    public final hdz k;
    private final Handler l;
    
    public ftu(final MediaFormat d, final Handler l, final gxi e, final lfg c, final lyp j, final cxl cxl, final krr krr, final hdz k) {
        boolean b = false;
        this.a = new AtomicInteger(0);
        this.b = new AtomicInteger(0);
        this.d = d;
        this.l = l;
        this.e = e;
        this.g = cxl.k(cxx.u);
        this.h = cxl.k(cxx.v);
        cxl.e();
        final int integer = d.getInteger("width");
        final int integer2 = d.getInteger("height");
        final StringBuilder sb = new StringBuilder(23);
        sb.append(integer);
        sb.append("x");
        sb.append(integer2);
        this.f = krv.j(sb.toString(), krr.a("MomentsTrackEncoder"));
        final int integer3 = d.getInteger("color-format");
        if (integer3 != 21) {
            if (integer3 == 2141391872) {
                b = true;
            }
        }
        else {
            b = true;
        }
        njo.d(b);
        this.i = dqe.a(d);
        this.j = j;
        this.c = c;
        this.k = k;
    }
    
    public static void c(final mcf mcf, final MediaCodec$BufferInfo mediaCodec$BufferInfo, final ByteBuffer byteBuffer) {
        final MediaCodec$BufferInfo mediaCodec$BufferInfo2 = new MediaCodec$BufferInfo();
        mediaCodec$BufferInfo2.set(0, mediaCodec$BufferInfo.size, mediaCodec$BufferInfo.presentationTimeUs, mediaCodec$BufferInfo.flags);
        byteBuffer.position(mediaCodec$BufferInfo.offset);
        byteBuffer.limit(mediaCodec$BufferInfo.offset + mediaCodec$BufferInfo.size);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaCodec$BufferInfo.size);
        allocateDirect.put(byteBuffer);
        allocateDirect.rewind();
        mcf.b(allocateDirect, mediaCodec$BufferInfo2);
    }
    
    @Override
    public final frl a(final lup lup, final kra kra) {
        if (this.b.get() > 0) {
            this.f.h("Reached maximum number of active codecs running. Dropping moments track...");
            lup.close();
            return new fub(1);
        }
        try {
            final MediaCodec encoderByType = MediaCodec.createEncoderByType("video/avc");
            this.b.incrementAndGet();
            final krr f = this.f;
            final int value = this.b.get();
            final StringBuilder sb = new StringBuilder(54);
            sb.append("Created codec successfully; current count: ");
            sb.append(value);
            f.b(sb.toString());
            final ftt ftt = new ftt(this, encoderByType, this.l, kra);
            try {
                return ftt.a(lup);
            }
            catch (final MediaCodec$CodecException ex) {
                this.f.i("Exception trying to launch encoder...", (Throwable)ex);
                encoderByType.release();
                lup.close();
                this.b.decrementAndGet();
                return new fub(1);
            }
        }
        catch (final IOException ex2) {
            lup.close();
            throw new RuntimeException(ex2);
        }
    }
    
    @Override
    public final void b() {
    }
    
    @Override
    public final void close() {
        this.j.close();
    }
}
