import java.util.concurrent.Executor;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ict extends BottomBarListener
{
    final /* synthetic */ icy a;
    
    public ict(final icy a) {
        this.a = a;
    }
    
    @Override
    public final void onCameraSwitchButtonClicked() {
        final iep l = this.a.L;
        l.getClass();
        final ibu b = ((ibq)l).b;
        b.j.aR(iah.c);
        b.g.i(new ibi(b, 3));
    }
    
    @Override
    public final void onPauseButtonClicked() {
        final iep l = this.a.L;
        l.getClass();
        final ibu b = ((ibq)l).b;
        if (((iah)b.j.d).equals(iah.h)) {
            b.h.b(2131886105);
            b.v.f();
            final kjm q = b.q;
            final icm b2 = b.B;
            b2.getClass();
            q.b(new ibk(b2, 1));
            final ibf a = b.A;
            Label_0263: {
                if (a.d.k(cyl.d)) {
                    final ias v = a.v;
                    Label_0218: {
                        if (v.m.get() > 1L) {
                            v.c.set(true);
                            v.n.set(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis()));
                            final oey oey = ofi.n(null);
                            break Label_0218;
                        }
                        synchronized (v.s) {
                            (v.x = ofn.f()).d(new iaq(v), mcn.n());
                            final oey oey = v.x;
                            monitorexit(v.s);
                            oey.d(new iay(a, 1), odx.a);
                            break Label_0263;
                        }
                    }
                }
                a.l.c.set(false);
                a.ab.a();
            }
            b.z.c.set(false);
        }
        this.a.c(false);
    }
    
    @Override
    public final void onResumeButtonClicked() {
        final iep l = this.a.L;
        l.getClass();
        final ibu b = ((ibq)l).b;
        Label_0256: {
            if (!((iah)b.j.d).equals(iah.g)) {
                break Label_0256;
            }
            b.h.b(2131886106);
            b.v.e();
            final kjm q = b.q;
            final icm b2 = b.B;
            b2.getClass();
            q.b(new ibk(b2));
            final ibf a = b.A;
            final kmq ab = a.ab;
            Object o = ab.d;
            synchronized (o) {
                njo.s(ab.e == kmp.c, "%s is expected but we get %s", kmp.c, ab.e);
                ab.e = kmp.b;
                ofi.w(ab.a.h(), new kmm(ab), ab.b);
                monitorexit(o);
                if (a.d.k(cyl.d)) {
                    o = a.v;
                    ((ias)o).c.set(false);
                    ((ias)o).f();
                    ((ias)o).n.set(0L);
                }
                else {
                    a.l.c.set(true);
                }
                b.z.c.set(true);
                this.a.e();
            }
        }
    }
    
    @Override
    public final void onSnapshotButtonClicked() {
        this.a.e();
        final icy a = this.a;
        a.c.setSnapshotButtonClickEnabled(false);
        a.y.g().l();
        final iep l = this.a.L;
        l.getClass();
        final ibu b = ((ibq)l).b;
        ofi.w(b.y.a(), new ibt(b), b.q);
    }
}
