import android.media.MediaCodec;
import android.view.Surface;
import android.os.Handler;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

final class mbj implements mbk
{
    private final mbi a;
    private final oey b;
    
    public mbj(final MediaFormat mediaFormat, final mcf mcf, final mbv n, final Handler b, final boolean b2, final Surface surface) {
        final mbh mbh = new mbh(mediaFormat);
        mbh.b = b;
        if (b2) {
            mbh.c = true;
            mbh.d = fzt.t;
        }
        else if (surface != null) {
            mbh.c = false;
            mbh.d = new mbg(surface);
        }
        final MediaCodec encoderByType = MediaCodec.createEncoderByType(mbh.a.getString("mime"));
        lya.c();
        final mbf a = new mbf(encoderByType, mbh.a, mbh.d, mbh.c, mbh.b);
        this.a = a;
        final mbf mbf = a;
        if (mbf.i.get()) {
            throw new IllegalStateException("Not allowed to update the listener after start.");
        }
        mbf.n = n;
        final mcs m = new mcs(mcf);
        final mbf mbf2 = a;
        if (!mbf2.i.get()) {
            mbf2.m = m;
            this.b = m.b;
            return;
        }
        throw new IllegalStateException("Not allowed to update the frame processor after start.");
    }
    
    @Override
    public final Surface a() {
        return ((mbf)this.a).c;
    }
    
    @Override
    public final oey b() {
        return this.b;
    }
    
    @Override
    public final void c() {
        this.a.f();
    }
    
    @Override
    public final mbc d() {
        return this.a.g();
    }
    
    @Override
    public final void e() {
        final mbf mbf = (mbf)this.a;
        if (!mbf.g.getAndSet(true)) {
            switch (mbf.b.get()) {
                case 3:
                case 4: {
                    mbf.b();
                    break;
                }
                case 1: {
                    mbf.d();
                    break;
                }
            }
        }
        ofi.o(mbf.e);
    }
}
