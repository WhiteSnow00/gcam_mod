import android.graphics.Rect;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import android.util.Range;
import android.hardware.camera2.CaptureRequest;
import java.util.Set;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igu
{
    public igu() {
    }
    
    public igu(final Activity activity) {
        activity.getWindow().getDecorView().getRootView();
    }
    
    public static float a(final float n) {
        return n * 0.0624f;
    }
    
    public static kmv b(final crg crg, final cxl cxl, final ckn ckn, final ckt ckt) {
        if (!cxl.k(cyl.c)) {
            return kmv.g;
        }
        if (!cxl.k(cyl.d)) {
            return kmv.h;
        }
        if (cxl.k(cya.b)) {
            return ckt.a(crg.e());
        }
        return ckn.a(crg.e());
    }
    
    public static kwf c(final lfg lfg, final kmt kmt, final Set set) {
        final kws p3 = kxc.p(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range((Comparable)kmt.i, (Comparable)kmt.i));
        final kwf a = kwg.a();
        a.g(kwr.a);
        a.d = new kwv(1, nns.m(p3));
        a.i(new kwv(3, nns.m(p3)));
        final HashSet set2 = new HashSet(set);
        set2.add(p3);
        grd.d(set2, a, lfg);
        return a;
    }
    
    public static kws d(final int n) {
        return kxc.p(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, n);
    }
    
    public static kws e(final int n) {
        return kxc.p(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, n);
    }
    
    public static Set f(final Rect rect, final float n) {
        final HashSet set = new HashSet();
        set.add(kxc.p(CaptureRequest.SCALER_CROP_REGION, rect));
        set.add(kxc.p(CaptureRequest.LENS_FOCAL_LENGTH, n));
        return set;
    }
}
