import com.google.android.libraries.camera.exif.ExifInterface;
import com.integrity.annotations.PaiConfiguration;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.InterleavedImageU16;
import java.util.concurrent.Executor;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.GcamModuleJNI;
import java.io.File;
import java.util.List;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.InterleavedImageU8;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzw implements dws
{
    public final hhy a;
    public final jdc b;
    public long c;
    public boolean d;
    final /* synthetic */ dzx e;
    public final okt f;
    private final geo g;
    private final niz h;
    private final UUID i;
    private InterleavedImageU8 j;
    private ogm k;
    private ShotMetadata l;
    private ogm m;
    private ShotMetadata n;
    private PortraitRequest o;
    private ShotMetadata p;
    private oey q;
    private kjk r;
    private boolean s;
    private int t;
    private final dzt u;
    
    public dzw(final dzx e, final hhy a, final geo g, final niz h, final UUID i, final niz niz) {
        this.e = e;
        this.b = new jdc();
        this.f = oav.f.m();
        this.d = false;
        this.s = false;
        this.t = 1;
        this.g = g;
        this.a = a;
        this.h = h;
        this.i = i;
        g.a(dwr.a, 0.0f);
        this.u = new dzt(this, g, niz);
    }
    
    @Override
    public final void a(final lju lju, final oey oey) {
    }
    
    @Override
    public final void b(final ogm k, final ShotMetadata l, final List list) {
        this.a.s();
        if (k != null && l != null) {
            this.k = k;
            this.l = l;
            return;
        }
        this.k = new ogm();
        this.l = new ShotMetadata();
    }
    
    @Override
    public final void c(final InterleavedImageU8 j, final PortraitRequest o, final ShotMetadata p5, final oey q, final kjk r) {
        this.j = j;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
        final dzr d = this.e.d;
        final PortraitRequest o2 = this.o;
        final long d2 = this.a.d();
        final niz a = ((ejf)d.b).a();
        if (d.c.k(cyc.l) && a.g()) {
            final File file = new File((File)a.c(), "portrait");
            if (!file.exists() && !file.mkdirs()) {
                a.l(dzr.a.b(), "Could not create portrait mode debug data folder.", '\u0410');
            }
            GcamModuleJNI.PortraitRequest_portrait_raw_path_set(o2.a, o2, file.getAbsolutePath());
            GcamModuleJNI.PortraitRequest_shot_prefix_set(o2.a, o2, dub.d(d2));
        }
        this.a.s();
    }
    
    @PaiConfiguration(continueOnFailure = false, modeFallback = false)
    @Override
    public void close() {
        if (this.e.f.k(cyc.v) && this.k == null) {
            a.l(dzx.b.c(), "Attempting to close the session but no primary RAW image has been received.", '\u041f');
            return;
        }
        if (this.j == null) {
            a.l(dzx.b.c(), "Attempting to close the session but no RGB image has been received.", '\u041e');
            return;
        }
        final dzx e = this.e;
        if (e.g && this.m == null) {
            a.l(dzx.b.c(), "Attempting to close the session but no RAW image has been received.", '\u041d');
            return;
        }
        e.h.remove(this.a.s());
        final long andIncrement = this.e.e.getAndIncrement();
        final InterleavedImageU16 d = dzx.d(this.q);
        oey oey = null;
        Label_0344: {
            if (this.h.g()) {
                final PortraitRequest o = this.o;
                if (o != null) {
                    int d2;
                    if (o.a() == null) {
                        d2 = 0;
                    }
                    else {
                        final PixelRectVector a = this.o.a();
                        d2 = (int)GcamModuleJNI.PixelRectVector_size(a.a, a);
                    }
                    final okt f = this.f;
                    if (f.c) {
                        f.m();
                        f.c = false;
                    }
                    final oav oav = (oav)f.b;
                    final oav f2 = oav.f;
                    oav.a |= 0x4;
                    oav.d = d2;
                    oey = ((gvy)this.h.c()).f(andIncrement, this.j, d, this.e.c, this.o, this.k, this.l, this.m, this.n, this.u);
                    break Label_0344;
                }
            }
            final kuw kuw = new kuw("Portrait controller not available or null PortraitRequest, no effect applied.");
            a.m(dzx.b.b(), "No effect applied.", '\u041b', kuw);
            oey = ofi.m(kuw);
        }
        ofi.w(oey, new dzu(this, andIncrement), odx.a);
    }
    
    @Override
    public final void d(final ogm m, final ShotMetadata n, final List list) {
        this.a.s();
        if (m != null && n != null) {
            this.m = m;
            this.n = n;
            return;
        }
        this.m = new ogm();
        this.n = new ShotMetadata();
    }
    
    public final void f(final long n, final niz niz) {
        if (this.s && this.b.a() == 0) {
            this.g.a(dwr.a, 1.0f);
            this.r.close();
            if (this.d) {
                final nsd b = dzx.b;
                this.a.s();
                this.a.k().n((oav)this.f.h());
                if (niz.g()) {
                    this.a.k().o((ExifInterface)niz.c());
                }
                else {
                    this.a.k().o(dub.a(this.j.b(), this.j.a(), this.p, this.a.m()));
                }
                this.a.B();
                return;
            }
            final dgi dgi = new dgi("PostProcessingPortraitImageSaverImpl did not save any output images.");
            dzx.b.b().h(dgi).E(1056).w("Error processing the image, cancelling the session %s for %d", this.a.s(), n);
            this.a.w(dgi);
        }
    }
    
    public final void g(final long n, final jcw jcw, final gwa gwa, final int n2, final dxx dxx, final jdb jdb, final niz niz) {
        final PortraitRequest o = this.o;
        final int imageRotationToDegrees = GcamModuleJNI.ImageRotationToDegrees(GcamModuleJNI.PortraitRequest_image_rotation_get(o.a, o));
        final dxy i = this.e.i;
        final boolean c = this.o.c();
        final hhy a = this.a;
        final UUID j = this.i;
        final ShotMetadata p7 = this.p;
        final ofn f = ofn.f();
        ofi.w(i.d.a(new dxt(i, jcw, (360 - imageRotationToDegrees) % 360, c, p7, n2, a)), new dxv(i, n2, dxx, gwa, a, j, niz, f), odx.a);
        ofi.w(f, new dzv(this, jdb, dxx, n, jcw), odx.a);
    }
}
