import java.util.Iterator;
import android.app.Activity;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class dfp implements dfz
{
    private static final nsd a;
    private static final nns b;
    private final WeakReference c;
    private final eyt d;
    private final brk e;
    private final klv f;
    private final crw g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/error/FatalActivityErrorHandler");
        b = nns.p(jbm.b, jbm.c, jbm.i, jbm.h);
    }
    
    public dfp(final WeakReference c, final eyt d, final brk e, final klv f, final crw g) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void a() {
        final Exception ex = new Exception();
        a.m(dfp.a.b(), "Handling Camera Disabled Failure:", '\u02fd', ex);
        this.d.O(2, null, ex, -1, -1, 0, nns.l(), nns.l(), kst.m, false);
        this.g("Camera has been disabled because of security policies.", ex);
    }
    
    @Override
    public final void b(final Throwable t) {
        final Exception ex = new Exception();
        a.m(dfp.a.b(), "Camera Hardware failure:", '\u02fe', ex);
        final kst a = kst.a;
        final ArrayList list = new ArrayList();
        final dfx dfx = (dfx)t;
        final kst b = dfx.b;
        list.addAll(dfx.a);
        this.d.O(12, null, ex, -1, -1, 0, list, nns.l(), b, false);
        this.g("Camera Hardware failure: One or more cameras may not have been enumerated", ex);
    }
    
    @Override
    public final void c(final Throwable t) {
        final Exception ex = new Exception(t);
        final ArrayList list = new ArrayList();
        kst kst = kst.m;
        dfo dfo = dfo.a;
        final boolean b = t instanceof ksz;
        boolean c = false;
        boolean b2 = false;
        if (b) {
            final ksz ksz = (ksz)t;
            kst = ksz.a;
            c = ksz.c;
            if (ksz.b.c()) {
                list.add(ksz.b.a);
            }
            if (kst.d(kst) && dfp.b.contains(this.f.aQ()) && this.g.h()) {
                dfo = dfo.b;
            }
            else {
                dfo = dfo.c;
                b2 = true;
            }
        }
        else if (t instanceof dga) {
            final dga dga = (dga)t;
            kst = dga.a;
            if (dga.b.c()) {
                list.add(dga.b.a);
            }
            if (dga.c > 0L) {
                c = true;
            }
            dfo = dfo.d;
            b2 = true;
        }
        else {
            c = false;
            b2 = true;
        }
        this.d.O(3, dfo.e, t, -1, -1, 0, nns.l(), list, kst, c);
        if (b2) {
            a.m(dfp.a.b(), "Handling Camera Open Failure:", '\u02ff', ex);
            this.g(kst.b(), ex);
        }
    }
    
    @Override
    public final void d() {
        final Exception ex = new Exception();
        a.m(dfp.a.b(), "Handling Camera Reconnect Failure:", '\u0300', ex);
        this.d.O(4, null, ex, -1, -1, 0, nns.l(), nns.l(), kst.m, false);
        this.g("Camera Reconnect Failure", ex);
    }
    
    @Override
    public final void e() {
        final Exception ex = new Exception();
        a.m(dfp.a.b(), "Handling Camera Access Failure:", '\u0301', ex);
        this.d.O(1, null, ex, -1, -1, 0, nns.l(), nns.l(), kst.m, false);
        this.g("Camera Access Failure", ex);
    }
    
    @Override
    public final void f() {
        final Exception ex = new Exception();
        a.m(dfp.a.b(), "Handling MediaRecorder Failure:", '\u0302', ex);
        this.d.j();
        this.g("There was a problem with the media recorder.", ex);
    }
    
    protected final void g(String e, final Exception ex) {
        final Activity activity = (Activity)this.c.get();
        if (activity != null && !activity.isFinishing()) {
            a.n(dfp.a.b(), "Activity received a fatal error. Finishing activity: %s", e, '\u02fb', ex);
            activity.finish();
        }
        e = (String)this.e;
        monitorenter(e);
        try {
            final Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((brj)iterator.next()).a(ex);
            }
            monitorexit(e);
        }
        finally {
            monitorexit(e);
            while (true) {}
        }
    }
}
