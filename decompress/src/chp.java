import java.util.concurrent.Executor;
import java.util.Iterator;
import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CaptureRequest;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chp
{
    private final liy a;
    private final cfm b;
    private final cid c;
    private final cxl d;
    
    public chp(final liy a, final cfm b, final cid c, final cxl d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final void c(final kwd kwd, final cfg cfg, final cfo cfo) {
        int n;
        if (((kkz)cfg.f).d == cfd.e) {
            if (cfo.p) {
                n = 3;
            }
            else {
                n = 1;
            }
        }
        else {
            n = 4;
        }
        final kvq a = kwd.a();
        ((kxn)a).d = n;
        kwd.m(a.a());
    }
    
    public final Set a(final cfo cfo) {
        final HashSet set = new HashSet();
        int n;
        if (!cfo.r) {
            n = 1;
        }
        else {
            n = 2;
        }
        set.add(kxc.p(CaptureRequest.CONTROL_MODE, n));
        set.add(kxc.p(CaptureRequest.CONTROL_SCENE_MODE, (int)(cfo.r ? 1 : 0)));
        set.add(kxc.p(CaptureRequest.STATISTICS_FACE_DETECT_MODE, (int)(cfo.r ? 1 : 0)));
        set.add(kxc.p(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, (int)(cfo.s ? 1 : 0)));
        if (jll.g != null) {
            set.add(kxc.p(jll.g, true));
        }
        set.add(kxc.p(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, (int)(cfo.t ? 1 : 0)));
        if (jlk.d != null && this.b.a().i.aQ() == clp.e) {
            set.add(kxc.p(jlk.p, 3));
        }
        final Iterator iterator = cfo.c.a.y().iterator();
        while (iterator.hasNext()) {
            if (((CaptureRequest$Key)iterator.next()).getName().equals(fxw.a.getName())) {
                set.add(kxc.p(fxw.a, 1));
                break;
            }
        }
        return set;
    }
    
    public final void b(final kwd kwd, final cfo cfo) {
        final cfg a = this.b.a();
        final kjk a2 = this.c.a(cic.b);
        a2.c(a.a.a(new cho(kwd, 5), odx.a));
        a2.c(a.k.a(new cho(kwd, 6), odx.a));
        a2.c(a.e.a(new cho(kwd, 4), odx.a));
        if (this.a.g && this.d.k(cxr.R)) {
            a2.c(a.b.a(new chm(kwd, a), odx.a));
        }
        else {
            a2.c(a.r.a(new cho(kwd, 2), odx.a));
        }
        a2.c(a.l.a(new chl(cfo, kwd), odx.a));
        a2.c(a.f.a(new chn(a, kwd, cfo, 1), odx.a));
        a2.c(a.g.a(new chn(kwd, a, cfo), odx.a));
        if (jlk.d != null) {
            a2.c(a.i.a(new cho(kwd), odx.a));
        }
        if (jlk.l != null && this.d.k(cwv.N) && cfo.A) {
            a2.c(a.f.a(new cho(kwd, 1), odx.a));
        }
        if (a.j.g()) {
            a2.c(((klv)a.j.c()).a(new cho(kwd, 3), odx.a));
        }
    }
}
