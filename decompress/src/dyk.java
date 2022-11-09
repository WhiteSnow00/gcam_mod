import java.util.concurrent.Executor;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.InterleavedImageU8;
import java.util.List;
import com.google.googlex.gcam.ShotMetadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyk implements dws
{
    public final geo a;
    public final gen b;
    public final hhy c;
    public final jdc d;
    public long e;
    public boolean f;
    final /* synthetic */ dyl g;
    public final dtx h;
    public final okt i;
    private final dyp j;
    private ogm k;
    private ShotMetadata l;
    private List m;
    private ogm n;
    private ShotMetadata o;
    private List p;
    private boolean q;
    private final dyi r;
    
    public dyk(final dyl g, final gen b, final dtx h, final dyp j) {
        this.g = g;
        this.i = nyy.d.m();
        this.d = new jdc();
        this.e = -1L;
        this.f = false;
        this.q = false;
        this.b = b;
        this.h = h;
        this.c = b.b;
        final geo d = b.d;
        this.a = d;
        this.j = j;
        d.a(dyr.h, 0.0f);
        this.r = new dyi(this);
    }
    
    @Override
    public final void a(final lju lju, final oey oey) {
    }
    
    @Override
    public final void b(final ogm k, final ShotMetadata l, final List m) {
        if (k != null && l != null) {
            final nsd a = dyl.a;
            final nsx a2 = ntf.a;
            this.c.s();
            this.k = k;
            this.l = l;
            this.m = m;
            return;
        }
        final nsd a3 = dyl.a;
        final nsx a4 = ntf.a;
        this.c.s();
        this.k = new ogm();
        this.l = new ShotMetadata();
        this.m = nns.l();
    }
    
    @Override
    public final void c(final InterleavedImageU8 interleavedImageU8, final PortraitRequest portraitRequest, final ShotMetadata shotMetadata, final oey oey, final kjk kjk) {
        throw new UnsupportedOperationException("RGB image not requested.");
    }
    
    @Override
    public final void close() {
        if (this.k == null) {
            a.l(dyl.a.c().g(ntf.a, "FalconPostProcImgSaver"), "Attempting to close the session but no primary RAW image has been received.", '\u0402');
            return;
        }
        if (this.n == null) {
            a.l(dyl.a.c().g(ntf.a, "FalconPostProcImgSaver"), "Attempting to close the session but no RAW image has been received.", '\u0401');
            return;
        }
        final nsd a = dyl.a;
        final nsx a2 = ntf.a;
        this.a.a(dvj.a, 1.0f);
        this.g.g.remove(this.c.s());
        final long andIncrement = this.g.f.getAndIncrement();
        ofi.w(this.j.a(andIncrement, dyo.a(this.k, this.l, this.m), dyo.a(this.n, this.o, this.p), this.r), new dyj(this, andIncrement), odx.a);
    }
    
    @Override
    public final void d(final ogm n, final ShotMetadata o, final List p3) {
        if (n != null && o != null) {
            final nsd a = dyl.a;
            final nsx a2 = ntf.a;
            this.c.s();
            this.n = n;
            this.o = o;
            this.p = p3;
            return;
        }
        final nsd a3 = dyl.a;
        final nsx a4 = ntf.a;
        this.c.s();
        this.n = new ogm();
        this.o = new ShotMetadata();
        this.p = nns.l();
    }
    
    public final void e(final long n) {
        if (this.q && this.d.a() == 0) {
            this.a.a(dyr.h, 1.0f);
            if (this.f) {
                final nsd a = dyl.a;
                final nsx a2 = ntf.a;
                this.c.s();
                this.c.k().f((nyy)this.i.h());
                return;
            }
            final dgi dgi = new dgi("PostProcessingDeblurFusionImageSaverImpl did not save any output images.");
            dyl.a.b().g(ntf.a, "FalconPostProcImgSaver").h(dgi).E(1027).w("Error processing the image, cancelling the session %s for %d", this.c.s(), n);
            this.c.w(dgi);
        }
    }
}
