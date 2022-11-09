import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;
import android.os.Parcelable;
import android.content.Intent;
import android.os.Trace;
import java.util.concurrent.Executor;
import android.content.res.Configuration;
import android.net.Uri;
import java.io.File;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eqa extends bqw implements imc
{
    public static final nsd b;
    private final Context A;
    private final Resources B;
    private final epk C;
    private final ikb D;
    private final huz E;
    private final eya F;
    private final bmt G;
    private final hhz H;
    private final hwz I;
    public final ivq c;
    public final jjb d;
    public final klv e;
    public final htm f;
    public final kjm g;
    public final gkw h;
    public final ilr i;
    public final bjx j;
    public final fxc k;
    public final crg l;
    public final fxr m;
    public flu n;
    public final iit o;
    public final irr p;
    public ofn q;
    public final epg r;
    public kjk s;
    public final efm t;
    public final fmz u;
    public flv v;
    private final BottomBarListener w;
    private final ivj x;
    private final eiq y;
    private final eip z;
    
    static {
        b = nsd.g("com/google/android/apps/camera/legacy/app/module/pckimageintent/PckImageIntentModule");
    }
    
    public eqa(final kjm g, final gkw h, final crg l, final fxc k, final fxr m, final Resources b, final BottomBarController bottomBarController, final ivj x, final eiq y, final jjb d, final htm f, final klv e, final epk c, final iit o, final ilr i, final ikb d2, final hxa hxa, final huz e2, final hhu hhu, final pii pii, final bjx j, final bmq bmq, final Context a, final epg r, final irr p28, final efm t, final fmz u, final bmt g2) {
        final epq w = new epq(this);
        this.w = w;
        this.c = new epr(this);
        this.z = new eps(this);
        final epz h2 = new epz(this);
        this.H = h2;
        this.g = g;
        this.h = h;
        this.e = e;
        this.D = d2;
        this.f = f;
        this.A = a;
        this.B = b;
        this.l = l;
        this.k = k;
        this.m = m;
        this.x = x;
        this.y = y;
        this.d = d;
        this.C = c;
        this.o = o;
        this.i = i;
        this.E = e2;
        this.r = r;
        this.j = j;
        this.p = p28;
        this.t = t;
        this.u = u;
        this.G = g2;
        if (bmq.a().getBooleanExtra("include_location_in_exif", false)) {
            this.F = (eya)pii.get();
        }
        else {
            this.F = new eyf();
        }
        (this.q = ofn.f()).a(new IllegalStateException("No image has been captured"));
        final String value = String.valueOf(a.getExternalCacheDir());
        final String separator = File.separator;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 11 + String.valueOf(separator).length());
        sb.append(value);
        sb.append(separator);
        sb.append("ImageIntent");
        this.I = hxa.a(new hwy(new File(sb.toString())));
        bottomBarController.addListener(w);
        hhu.a(h2);
    }
    
    @Override
    public final void C(final int n) {
        if (n == 1) {
            this.f.c(2131886102);
            return;
        }
        if (n != 2 && n != 3) {
            return;
        }
        this.f.c(2131886103);
    }
    
    @Override
    public final niz be() {
        return niz.h(this.v);
    }
    
    @Override
    protected final void bs() {
        this.w();
    }
    
    @Override
    protected final void bt() {
        final niz d = this.C.d;
        if (d.g() && !bmx.h(this.A, (Uri)d.c())) {
            final bmt g = this.G;
            g.b.b(new bms(g));
            return;
        }
        this.u.a();
    }
    
    @Override
    public final void bu(final asx asx) {
    }
    
    @Override
    public final String c() {
        return this.B.getString(2131952397);
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final void e(final Configuration configuration) {
    }
    
    @Override
    protected final void m() {
        this.s = new kjk();
        this.r.a(false);
        this.y.a(this.z);
        this.s.c(this.x.d(this.c));
        final kjk s = this.s;
        final klv e = this.e;
        final ivj x = this.x;
        x.getClass();
        s.c(e.a(new epo(x), this.g));
        this.s.c(this.l.a(new epn(this), odx.a));
        this.n.getClass();
    }
    
    @Override
    protected final void o() {
        final flu n = this.n;
        if (n != null) {
            n.cancel(true);
            this.n = null;
        }
        this.p.a();
        this.s.close();
    }
    
    @Override
    public final boolean q() {
        if (this.r.g) {
            this.w.onRetakeButtonPressed();
            return true;
        }
        return this.w();
    }
    
    @Override
    public final boolean r() {
        return true;
    }
    
    public final void u() {
        monitorenter(this);
        try {
            try {
                final byte[] array = (byte[])this.q.get();
                array.getClass();
                final byte[] array2 = array;
                final epk c = this.C;
                if (c.d.g()) {
                    final Uri uri = (Uri)c.d.c();
                    ofi.w(ofi.p(new epi(c, uri, array2), c.f), new epj(c, uri), c.c);
                    monitorexit(this);
                    return;
                }
                Trace.beginSection("ImageIntent:CompressingImageIntoIntentExtra");
                final Bitmap a = jct.a(array2);
                a.getClass();
                Trace.endSection();
                c.c.execute(new eph(c, new Intent("inline-data").putExtra("data", (Parcelable)a)));
                monitorexit(this);
                return;
            }
            finally {}
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        final InterruptedException ex;
        throw new IllegalStateException("Couldn't get image data from Future", ex);
        monitorexit(this);
    }
    
    public final void v() {
        synchronized (this) {
            a.l(eqa.b.c(), "takePictureInvoked", '\u054f');
            final flv v = this.v;
            v.getClass();
            final long currentTimeMillis = System.currentTimeMillis();
            final String a = this.I.a(currentTimeMillis);
            this.q = ofn.f();
            final hfz hfz = new hfz(a, currentTimeMillis, this.F.c(), this.E, this.q);
            final kre c = v.b.c;
            final fxu c2 = v.c;
            ofi.w(v.f(new fvn(this.h.c().a(), new ept(this), -1, c2.l(), c2.K(), new kkz(false), false, false), hfz), new epu(this), this.g);
        }
    }
    
    public final boolean w() {
        if (this.r.c()) {
            final epg r = this.r;
            kjm.a();
            r.c.a();
            this.D.b();
            return true;
        }
        return false;
    }
    
    @Override
    public final void y() {
        this.D.b();
        this.v();
    }
    
    @Override
    public final void z() {
        this.f.c(2131886104);
        this.D.a();
    }
}
