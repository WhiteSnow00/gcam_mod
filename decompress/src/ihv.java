import android.graphics.Matrix;
import java.util.concurrent.Callable;
import j$.util.function.Supplier;
import java.util.Iterator;
import java.util.ArrayList;
import android.graphics.Bitmap;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView$Callback;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihv implements ihp
{
    public static final nsd a;
    public final List b;
    public final AtomicInteger c;
    public final AtomicInteger d;
    private final RoundedThumbnailView e;
    private final oui f;
    private final RoundedThumbnailView$Callback g;
    private boolean h;
    private boolean i;
    private final boolean j;
    private final hwx k;
    private final kjm l;
    private final Executor m;
    private final hkc n;
    private oey o;
    private Bitmap p;
    private final bmq q;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/captureindicator/CaptureIndicatorControllerImpl");
    }
    
    public ihv(final RoundedThumbnailView e, final boolean b, final bmq q, final hwx k, final oui f, final kjm l, final Executor m, final hkc n, final cxl cxl) {
        final ihq ihq = new ihq(this);
        this.g = ihq;
        this.b = new ArrayList();
        this.h = false;
        this.c = new AtomicInteger(0);
        this.d = new AtomicInteger(0);
        this.e = e;
        this.f = f;
        e.setCallback(ihq);
        e.setMaterialNextEnabled(cxl.k(cxr.at));
        this.j = b;
        this.q = q;
        this.k = k;
        this.l = l;
        this.i = b;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final krc a(final iho iho) {
        this.b.add(iho);
        return new ihs(this, iho);
    }
    
    @Override
    public final niz b() {
        final Bitmap p = this.p;
        if (p == null) {
            return nii.a;
        }
        return niz.i(p);
    }
    
    @Override
    public final oey c() {
        final oey o = this.o;
        if (o != null) {
            return o;
        }
        if (this.j) {
            this.g();
            return this.o = ofi.n(true);
        }
        if (bmx.u(this.q)) {
            return this.o = ofi.n(true);
        }
        final oey a = this.k.a();
        Executor executor;
        if (a.isDone()) {
            executor = odx.a;
        }
        else {
            executor = this.l;
        }
        return this.o = odg.h(a, new iht(this), executor);
    }
    
    @Override
    public final void d(final boolean b) {
        if (this.i) {
            if (b) {
                ((hdo)this.f.get()).f();
            }
            return;
        }
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((iho)iterator.next()).a();
        }
    }
    
    @Override
    public final void e(final boolean h) {
        this.h = h;
    }
    
    @Override
    public final void f(final jbz jbz) {
        this.e.setThumbnail(this.e.getDefaultThumbnail(jbz), 0);
        this.p = null;
        final hwx k = this.k;
        synchronized (k.f) {
            k.e = null;
            monitorexit(k.f);
            odg.h(k.b, new hwv(k), k.d);
        }
    }
    
    @Override
    public final void g() {
        jbz jbz;
        if (this.n.c(hjq.R)) {
            jbz = jbz.b;
        }
        else if (this.j) {
            jbz = jbz.f;
        }
        else {
            jbz = jbz.a;
        }
        this.f(jbz);
        final RoundedThumbnailView e = this.e;
        final boolean j = this.j;
        boolean enabled = true;
        if (!j) {
            if (!(boolean)this.n.c(hjq.R)) {
                enabled = false;
            }
        }
        e.setEnabled(enabled);
        this.i = this.j;
    }
    
    @Override
    public final void h(final String s) {
        if (!this.h && this.e.getVisibility() == 0) {
            this.e.startRevealThumbnailAnimation(s);
        }
    }
    
    @Override
    public final void i(final Supplier supplier) {
        this.c.incrementAndGet();
        knf.f(ofi.q(new ihu(this, supplier), this.m), new ihr(this), this.l);
    }
    
    @Override
    public final void j(final Bitmap bitmap, final int n) {
        this.e.setEnabled(true);
        this.e.setThumbnail(bitmap, n);
        Bitmap bitmap2;
        if (n != 0) {
            final Matrix matrix = new Matrix();
            matrix.postRotate((float)n);
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        }
        else {
            bitmap2 = bitmap;
        }
        this.p = bitmap2;
        this.i = false;
        final hwx k = this.k;
        oco.h(odg.i(k.b, new hww(k, new hwt(bitmap, kra.b(n))), k.d), Throwable.class, fzt.k, odx.a);
    }
}
