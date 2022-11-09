import android.view.View;
import android.util.Size;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.PixelCopy;
import android.os.Looper;
import android.graphics.Bitmap$Config;
import android.view.SurfaceView;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixn
{
    public static final nsd a;
    public final Object b;
    public final kse c;
    public ixh d;
    public niz e;
    public niz f;
    private final krr g;
    private final FrameLayout h;
    private final gkw i;
    private final MainActivityLayout j;
    private final pii k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/viewfinder/Viewfinder");
    }
    
    public ixn(final krq krq, final gkw i, final ixx ixx, final kse c, final pii k) {
        this.e = nii.a;
        this.f = nii.a;
        this.h = ixx.d;
        this.j = ixx.c;
        this.i = i;
        this.c = c;
        final krr a = krq.a("Viewfinder");
        this.g = a;
        this.k = k;
        this.b = new Object();
        a.g("Viewfinder constructed.");
    }
    
    public static Bitmap a(final Bitmap bitmap, final int n, final boolean b) {
        final Matrix matrix = new Matrix();
        matrix.postRotate((float)(-n));
        if (b) {
            matrix.postScale(-1.0f, 1.0f);
        }
        if (matrix.isIdentity()) {
            return bitmap;
        }
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
    
    public static Bitmap b(final SurfaceView surfaceView, final int n, final int n2) {
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        PixelCopy.request(surfaceView, bitmap, (PixelCopy$OnPixelCopyFinishedListener)ixk.a, kpo.d(Looper.getMainLooper()));
        return bitmap;
    }
    
    public static niz e(final SurfaceView surfaceView, final kra kra, final boolean b, final int n) {
        if (!surfaceView.getHolder().getSurface().isValid()) {
            a.l(ixn.a.c(), "getScreenshotFrom(): the surface is not valid", '\u0ba5');
            return nii.a;
        }
        final int n2 = Math.min(surfaceView.getWidth(), surfaceView.getHeight()) / n;
        final int n3 = Math.max(surfaceView.getHeight(), surfaceView.getWidth()) / n;
        if (n2 > 0 && n3 > 0) {
            final Bitmap bitmap = Bitmap.createBitmap(n2, n3, Bitmap$Config.ARGB_8888);
            PixelCopy.request(surfaceView, bitmap, (PixelCopy$OnPixelCopyFinishedListener)ixk.c, kpo.d(Looper.getMainLooper()));
            return niz.i(ixt.b(a(bitmap, kra.a(), b), n));
        }
        a.l(ixn.a.c(), "getScreenshotFrom(): the surface size is invalid", '\u0ba4');
        return nii.a;
    }
    
    public final niz c() {
        return this.d(false, 2, this.i.f());
    }
    
    public final niz d(final boolean b, final int n, final kra kra) {
        Object o = this.b;
        synchronized (o) {
            final ixh d = this.d;
            if (d == null) {
                ixn.a.c().E(2977).o("getScreenshot(): the surfaceViewAdapter is null");
                return nii.a;
            }
            final SurfaceView b2 = d.b;
            monitorexit(o);
            final Size size = new Size(b2.getWidth(), b2.getHeight());
            try {
                this.c.f("getScreenshot");
                o = this.e;
                return (niz)((niz)o).b(new ixm(size, kra, b, n)).e(e(b2, kra, b, n));
            }
            finally {
                this.c.g();
            }
        }
    }
    
    public final oey f(final ixs ixs, niz e) {
        final krr g = this.g;
        final String value = String.valueOf(ixs);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 54);
        sb.append("swapAndStartSurfaceViewViewfinder with configuration: ");
        sb.append(value);
        g.g(sb.toString());
        this.e = e;
        this.c.f("swapAndStartSurfaceViewViewfinder");
        e = (niz)this.b;
        synchronized (e) {
            this.g();
            this.g.g("Starting the new viewfinder");
            final eln a = ((elg)this.k).a();
            pqf.j(a.d = new ixe(ixs, this.f), ixe.class);
            final emf a2 = a.a;
            final elr b = a.b;
            final elq c = a.c;
            final ixe d = a.d;
            this.d = (ixh)oum.b(new gtm(b.j, a2.M, c.g, b.u, a2.fE, oum.b(new ixf(d)), a2.j, a2.o, oum.b(new ixf(d, 1)), new ixj(a2.bY), 10, (short[][])null)).get();
            this.j.f((View)this.h);
            final ixh d2 = this.d;
            d2.getClass();
            kjm.a();
            final ofn g2 = d2.g;
            monitorexit(e);
            e = (niz)this.j;
            final kre a3 = ixs.a;
            ((MainActivityLayout)e).g(a3.a, a3.b);
            this.c.g();
            return g2;
        }
    }
    
    public final void g() {
        this.g.g("Stopping current viewfinder");
        final ixh d = this.d;
        if (d != null) {
            d.close();
            this.d = null;
        }
        this.j.e();
    }
}
