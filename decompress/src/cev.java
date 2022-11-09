import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cev extends kxc
{
    private static final nsd b;
    public final ConcurrentLinkedQueue a;
    private final cfg c;
    private final blc d;
    private final niz e;
    private final bmm f;
    private final boolean g;
    private final dbk h;
    private final fwk i;
    private kxc j;
    
    static {
        b = nsd.g("com/google/android/apps/camera/camcorder/camera2/CamcorderGlobalFrameListener");
    }
    
    public cev(final cfm cfm, final blc d, final fwk i, final bpt bpt, final bmm f, final boolean g, final dbk h, final cxl cxl) {
        this.a = new ConcurrentLinkedQueue();
        this.c = cfm.a();
        this.d = d;
        this.i = i;
        niz e;
        if (bpt.a.c()) {
            e = niz.i(bpt);
        }
        else {
            e = nii.a;
        }
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        final cxo a = cxr.a;
        cxl.b();
        cxl.b();
        cxl.b();
        cxl.b();
    }
    
    private final boolean j() {
        final cfd cfd = (cfd)((kkz)this.c.f).d;
        return cfd == cfd.c || cfd == cfd.e;
    }
    
    @Override
    public final void aL(final kwz kwz, final long n) {
        if (this.j()) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((kxc)iterator.next()).aL(kwz, n);
            }
        }
    }
    
    @Override
    public final void aO(final lem lem) {
        if (this.j()) {
            a.k(cev.b.b(), "onCaptureFailed %s", lem, '\u0198');
        }
    }
    
    @Override
    public final void b(final ljm ljm) {
        if (!this.j()) {
            return;
        }
        this.d.b(ljm);
        if (ljm.d(CaptureResult.CONTROL_AF_MODE) != null) {
            this.j.b(ljm);
        }
        if (this.e.g()) {
            ((bpt)this.e.c()).a(ljm);
        }
        final Rect rect = (Rect)ljm.d(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            this.c.c.aR(rect);
        }
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        final Long n2 = (Long)ljm.d(CaptureResult.SENSOR_FRAME_DURATION);
        if (n != null && n2 != null) {
            this.h.b(n, n2);
        }
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((kxc)iterator.next()).b(ljm);
        }
    }
    
    public final void d(final cfo cfo) {
        final fwv fwv = new fwv(new fwx(cfo.c.a.f()));
        if (cfo.q) {
            this.j = new bla(this.i, fwv, this.f, this.g);
            return;
        }
        this.j = new bld(this.i, fwv, this.f, this.g);
    }
    
    public final krc e(final kxc kxc) {
        this.a.add(kxc);
        return new ceu(this, kxc, null, null);
    }
}
