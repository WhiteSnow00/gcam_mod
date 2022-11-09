import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffe implements lum
{
    public static final nsd a;
    public final oey b;
    public final ofn c;
    public final oey d;
    public final oey e;
    public final oey f;
    public final boolean g;
    public final boolean h;
    private final lum i;
    private final MediaFormat j;
    private final List k;
    private final Executor l;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/encoder/AddMetaTrackMuxer");
    }
    
    public ffe(final lum i, final boolean h, final oey b, final ofn c, final oey d, final oey e, final oey f, final boolean g, final Executor l) {
        this.i = i;
        this.e = e;
        this.f = f;
        this.k = new ArrayList();
        this.l = l;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
        final MediaFormat j = new MediaFormat();
        this.j = j;
        String s;
        if (!h) {
            s = "application/microvideo-image-meta";
        }
        else {
            s = "application/motionphoto-image-meta";
        }
        j.setString("mime", s);
    }
    
    @Override
    public final lup a() {
        synchronized (this) {
            final lup a = this.i.a();
            final ofn f = ofn.f();
            this.k.add(f);
            return new ffd(a, f);
        }
    }
    
    @Override
    public final oey b() {
        return this.i.b();
    }
    
    @Override
    public final void c() {
        this.i.c();
    }
    
    @Override
    public final void d() {
        final lup a = this.i.a();
        a.a(ofi.n(this.j));
        a.b(ByteBuffer.allocateDirect(0), new MediaCodec$BufferInfo());
        synchronized (this) {
            final oey j = ofi.j(this.k);
            monitorexit(this);
            synchronized (this) {
                final oey k = ofi.k(j, this.d, this.e, this.b, this.f);
                monitorexit(this);
                k.d(new ffc(this, j, a), this.l);
                this.i.d();
            }
        }
    }
}
