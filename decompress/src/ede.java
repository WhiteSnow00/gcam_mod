import android.view.Surface;
import android.hardware.camera2.CaptureRequest$Key;
import java.util.Set;
import java.util.Collection;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.hardware.camera2.CaptureRequest;
import java.util.HashSet;
import java.util.concurrent.Executor;
import android.view.View;
import android.opengl.GLSurfaceView$Renderer;
import android.content.res.Resources$Theme;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.imax.cyclops.processing.NativePoseEstimatorImpl;
import java.io.File;
import android.hardware.SensorEventListener;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.SurfaceView;
import android.view.PixelCopy;
import android.os.Looper;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ede extends bqw implements ebb
{
    private eeu b;
    private final eaq c;
    private final Activity d;
    private final ixx e;
    private final Runnable f;
    private isr g;
    private final ell h;
    
    public ede() {
    }
    
    public ede(final eaq c, final ell h, final Activity d, final ixx e) {
        this.c = c;
        this.h = h;
        this.d = d;
        this.e = e;
        this.f = new dqi(d, 2);
    }
    
    @Override
    public final void a() {
        synchronized (this) {
            final eeu b = this.b;
            nov.z(b);
            b.b().D = false;
        }
    }
    
    @Override
    public final niz b() {
        synchronized (this) {
            final eeu b = this.b;
            if (b == null) {
                return nii.a;
            }
            final ebc ebc = (ebc)((elm)b).d.get();
            niz niz;
            if (!((SurfaceView)ebc).getHolder().getSurface().isValid()) {
                a.l(ixn.a.c(), "getScreenshotFrom(): the surface is not valid", '\u0ba3');
                niz = nii.a;
            }
            else {
                final int n = ((SurfaceView)ebc).getWidth() / 2;
                final int n2 = ((SurfaceView)ebc).getHeight() / 2;
                if (n > 0 && n2 > 0) {
                    final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
                    PixelCopy.request((SurfaceView)ebc, bitmap, (PixelCopy$OnPixelCopyFinishedListener)ixk.d, kpo.d(Looper.getMainLooper()));
                    niz = niz.i(ixt.b(bitmap, 2));
                }
                else {
                    a.l(ixn.a.c(), "getScreenshotFrom(): the surface size is invalid", '\u0ba2');
                    niz = nii.a;
                }
            }
            return niz;
        }
    }
    
    @Override
    public final void br() {
        final ixx e = this.e;
        this.g = new iyx(e.c, e.d);
    }
    
    public final void bs() {
        synchronized (this) {
            this.e.e.i.E.remove(this.f);
            final eeu b = this.b;
            if (b == null) {
                return;
            }
            nov.z(b);
            final edy c = b.c();
            c.a.unregisterListener((SensorEventListener)c);
            final eeu b2 = this.b;
            nov.z(b2);
            final eby b3 = b2.b();
            nvb.g(new ebs(b3.s));
            if (b3.s.compareAndSet(1, 0)) {
                b3.o.a(false);
                b3.g();
            }
            else {
                b3.r.set(true);
                b3.t.block();
                b3.h(false, 2);
            }
            final igu l = b3.l;
            b3.c();
            b3.e.b();
            if (this.d.getRequestedOrientation() == 4) {
                this.d.setRequestedOrientation(2);
            }
        }
    }
    
    public final void bt() {
        synchronized (this) {
            final eeu b = this.b;
            if (b == null) {
                return;
            }
            nov.z(b);
            final edy c = b.c();
            c.a.registerListener((SensorEventListener)c, c.c, 1);
            c.a.registerListener((SensorEventListener)c, c.b, 1);
            final eeu b2 = this.b;
            nov.z(b2);
            final eby b3 = b2.b();
            final File file = new File(b3.a.getCacheDir(), "datasets");
            final cxl d = b3.d;
            final cxm a = cxt.a;
            d.b();
            b3.u.a(file.toString());
            final int intValue = (int)b3.B.c(hjq.M);
            if (intValue < 2 && !b3.f.k()) {
                b3.d(b3.a.getString(2131952129));
                b3.C.d(hjq.M, intValue + 1);
            }
            b3.r.set(false);
            final igu l = b3.l;
            monitorexit(this);
            synchronized (this) {
                final eeu b4 = this.b;
                nov.z(b4);
                final eba a2 = b4.a();
                a2.b.f("Panorama frameserver received onModuleResume");
                final kwd h = a2.h;
                if (h != null) {
                    h.e();
                }
                monitorexit(this);
                this.e.e.i.E.add(this.f);
            }
        }
    }
    
    @Override
    public final void close() {
    }
    
    public final void m() {
        monitorenter(this);
        try {
            if (this.b != null) {
                monitorexit(this);
                return;
            }
            final ell h = this.h;
            this.b = new elm(h.a, h.b, h.c);
            final eaq c = this.c;
            final int a = edg.a;
            final eeu b = this.b;
            nov.z(b);
            final float b2 = (float)((edf)((elm)b).e.get()).a();
            if (!c.a.getAndSet(true)) {
                edg.a = a;
                edg.b = b2;
                eea.b(edi.class, new edg());
                eea.b(edl.class, new NativePoseEstimatorImpl());
                eea.b(edk.class, new eef());
                eea.b(eeb.class, new eec());
            }
            final eeu b3 = this.b;
            nov.z(b3);
            final ebi ebi = new ebi((ebc)((elm)b3).d.get(), (ecv)((elm)b3).h.get(), (kjk)((elm)b3).i.get(), (ivj)((elm)b3).c.m.get(), (eby)((elm)b3).j.get(), (BottomBarController)((elm)b3).c.i.get(), (eiq)((elm)b3).b.Q.get(), (eba)((elm)b3).g.get(), (kri)((elm)b3).b.aE.get(), (cxl)((elm)b3).a.j.get());
            final isr g = this.g;
            nov.z(g);
            if (ebi.g.k(cxr.aQ)) {
                final ebc a2 = ebi.a;
                a2.setBackground(a2.getResources().getDrawable(2131231668, (Resources$Theme)null));
                ebi.a.setClipToOutline(true);
            }
            ebi.a.setEGLContextClientVersion(3);
            ebi.a.setRenderer((GLSurfaceView$Renderer)ebi.b);
            final ebc a3 = ebi.a;
            a3.a = this;
            a3.onResume();
            g.a((View)ebi.a);
            g.c(1080, 1920);
            final eba f = ebi.f;
            final kri h2 = ebi.h;
            final ecv b4 = ebi.b;
            f.a.f("ImaxFrameServer-start");
            final lfj e = f.o.a.e(lfu.b);
            e.getClass();
            final edq b5 = f.d.b;
            final kre kre = new kre(b5.a, b5.b);
            final krr b6 = f.b;
            final String value = String.valueOf(kre);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
            sb.append("Viewfinder size: ");
            sb.append(value);
            b6.f(sb.toString());
            final kxb l = kxc.l(e, kre);
            f.m = new eau(f, h2);
            ofi.w(b4.g, new eay(f, l), odx.a);
            f.n.set(false);
            final kwf a4 = kwg.a();
            a4.f(e);
            a4.d(l);
            final edf d = f.d;
            final HashSet set = new HashSet();
            final CaptureRequest$Key flash_MODE = CaptureRequest.FLASH_MODE;
            final Integer value2 = 0;
            set.add(kxc.p(flash_MODE, value2));
            final CaptureRequest$Key control_AE_MODE = CaptureRequest.CONTROL_AE_MODE;
            final Integer value3 = 1;
            set.add(kxc.p(control_AE_MODE, value3));
            final CaptureRequest$Key control_AE_LOCK = CaptureRequest.CONTROL_AE_LOCK;
            final Boolean value4 = false;
            set.add(kxc.p(control_AE_LOCK, value4));
            set.add(kxc.p(CaptureRequest.CONTROL_AWB_MODE, value3));
            set.add(kxc.p(CaptureRequest.CONTROL_AWB_LOCK, value4));
            set.add(kxc.p(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, value2));
            final CaptureRequest$Key control_AE_TARGET_FPS_RANGE = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            final Range[] array = (Range[])d.a.m(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            final int length = array.length;
            Range range = array[length - 1];
            Range range3;
            for (int i = 0; i < length; ++i, range = range3) {
                final Range range2 = array[i];
                range3 = range;
                if ((int)range2.getLower() * (int)range.getUpper() >= (int)range.getLower() * (int)range2.getUpper()) {
                    range3 = range;
                    if (Math.abs((int)range2.getUpper() - 30) < Math.abs((int)range.getUpper() - 30)) {
                        range3 = range2;
                    }
                }
            }
            set.add(kxc.p(control_AE_TARGET_FPS_RANGE, range));
            set.add(kxc.p(CaptureRequest.CONTROL_AF_MODE, 4));
            set.add(kxc.p(CaptureRequest.LENS_FOCUS_DISTANCE, d.a.m(CameraCharacteristics.LENS_INFO_HYPERFOCAL_DISTANCE)));
            final CaptureRequest$Key noise_REDUCTION_MODE = CaptureRequest.NOISE_REDUCTION_MODE;
            final Integer value5 = 2;
            set.add(kxc.p(noise_REDUCTION_MODE, value5));
            final int[] array2 = (int[])((lff)d.a).n(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES, lff.d);
            for (int length2 = array2.length, j = 0; j < length2; ++j) {
                if (array2[j] == 2) {
                    set.add(kxc.p(CaptureRequest.EDGE_MODE, value5));
                    break;
                }
            }
            final CaptureRequest$Key lens_OPTICAL_STABILIZATION_MODE = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
            final cxl c2 = d.c;
            final cxm a5 = cxt.a;
            c2.d();
            set.add(kxc.p(lens_OPTICAL_STABILIZATION_MODE, 0));
            set.addAll(grd.c(jbm.d, d.a));
            grd.d(set, a4, f.o.a.a(e));
            final kwd a6 = f.o.a(a4.a());
            a6.getClass();
            (f.h = a6).h(set);
            f.a.g();
            ebi.l.c(new ebe(ebi, g));
            ebi.l.c(ebi.c.d(ebi.j));
            ebi.d.addListener(ebi.i);
            ebi.e.a(ebi.k);
            ebi.l.c(new ebd(ebi, 1));
            ebi.l.c(new ebd(ebi));
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void o() {
        synchronized (this) {
            final eeu b = this.b;
            if (b == null) {
                return;
            }
            nov.z(b);
            final eby b2 = b.b();
            nvb.g(new ebs(b2.s));
            b2.K.b(new ebt(b2));
            b2.n.onPause();
            b2.A.c();
            final eeu b3 = this.b;
            nov.z(b3);
            final eba a = b3.a();
            a.b.f("Received onModuleStop");
            a.f.aR(false);
            final kvw k = a.k;
            if (k != null) {
                k.l(a.m);
            }
            final kwz j = a.j;
            if (j != null) {
                j.d(null);
            }
            final Surface i = a.i;
            if (i != null) {
                i.release();
                a.i = null;
            }
            a.j = null;
            try (final kvw l = a.k) {}
            a.k = null;
            a.b.b("Panorama frameserver closing");
            final kwd h = a.h;
            h.getClass();
            h.close();
            a.h = null;
            a.c.g();
            final eeu b4 = this.b;
            nov.z(b4);
            ((edc)((elm)b4).f.get()).g();
            final eeu b5 = this.b;
            nov.z(b5);
            ((kjk)((elm)b5).i.get()).close();
            this.b = null;
        }
    }
    
    @Override
    public final boolean q() {
        synchronized (this) {
            final eeu b = this.b;
            if (b == null) {
                return false;
            }
            final eby b2 = b.b();
            final int value = b2.s.get();
            if (value == 3) {
                b2.c();
                b2.h(false, 2);
            }
            else if (value == 0) {
                return false;
            }
            return true;
        }
    }
    
    @Override
    public final boolean t() {
        return false;
    }
}
