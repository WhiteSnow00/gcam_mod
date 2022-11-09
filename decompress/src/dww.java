import java.util.concurrent.ExecutionException;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceProgressCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.image.YuvUtils;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.YuvImage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dww
{
    static final jcy a;
    public final krr b;
    public final oui c;
    public final ohs d;
    public final dwf e;
    public final cxl f;
    public final niz g;
    public final gij h;
    public final niz i;
    public final kse j;
    public final dwk k;
    private final oui m;
    
    static {
        a = new jcy(40.0f);
    }
    
    public dww(final krr krr, final oui m, final oui c, final ohs d, final dwf e, final cxl f, final niz g, final gij h, final niz i, final kse j, final dwk k) {
        this.b = krr.a("PostprocOps");
        this.m = m;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static final dwu c(final dwu dwu) {
        final InterleavedImageU8 a = dwu.a;
        a.getClass();
        final int b = a.b();
        final int a2 = a.a();
        final boolean b2 = true;
        final YuvImage yuvImage = new YuvImage(b, a2, 1);
        final long a3 = a.c().a;
        final long e = YuvWriteView.e(yuvImage);
        njo.e(a3 != 0L, "src view is null");
        njo.e(e != 0L && b2, "dst view is null");
        YuvUtils.rgbToYuvImpl(a3, e);
        final dxs b3 = new dxs(yuvImage, dwu.g);
        a.e();
        final dwt c = dwu.c();
        c.b();
        c.b = b3;
        return c.a();
    }
    
    public final dwu a(final dwu dwu) {
        final InterleavedImageU8 a = dwu.a;
        a.getClass();
        final boolean b = this.e == dwf.c;
        final hbb hbb = (hbb)((niz)this.c.get()).c();
        final hbj c = hbb.c();
        final cxl f = this.f;
        final int a2 = cxh.a;
        f.e();
        final dwv dwv = new dwv(dwu, 1);
        a.getClass();
        hbb.k(a.d(), dwu.d, b, dwu.j.b.s(), c, dwu.j.b.k(), dwv);
        final dwt c2 = dwu.c();
        c2.g = c;
        return c2.a();
    }
    
    public final void b(dwu d) {
        final dxs b = ((dwu)d).b;
        b.getClass();
        final dja dja = (dja)this.m.get();
        try {
            final diy diy = dja.a(new diz(b, ((dwu)d).m.a, ((dwu)d).f)).get();
            diy.b(((dwu)d).j.b.k());
            if (diy.c()) {
                d = (ExecutionException)((dwu)d).d;
                ((ShotMetadata)d).k(String.valueOf(GcamModuleJNI.ShotMetadata_software_suffix_get(((ShotMetadata)d).a, (ShotMetadata)d)).concat("b"));
            }
            return;
        }
        catch (final ExecutionException d) {}
        catch (final InterruptedException ex) {}
        this.b.i("Can't apply post-processing", d);
    }
}
