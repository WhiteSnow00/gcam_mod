import java.util.concurrent.Executor;
import android.content.Intent;
import java.util.List;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import android.content.Context;
import java.util.ArrayList;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipn implements iqg
{
    public static final nsd a;
    private final bmq A;
    public final BottomBarController b;
    public iqe c;
    public final ivj d;
    public final eiq e;
    public boolean f;
    public jbm g;
    public final irc h;
    public final gjj i;
    public final oui j;
    public final boolean k;
    public final ipo l;
    private final WindowManager m;
    private iqf n;
    private final ArrayList o;
    private int p;
    private final Context q;
    private final kse r;
    private final boolean s;
    private final eyt t;
    private final hwc u;
    private final cxl v;
    private boolean w;
    private boolean x;
    private ViewfinderCover y;
    private final bmz z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/modeswitch/ModeSwitchControllerImpl");
    }
    
    public ipn(final WindowManager m, final eyt t, final BottomBarController b, final bmz z, final ivj d, final eiq e, final irc h, final boolean s, final kse r, final Context q, final bmq a, final flr flr, final hwc u, final gjj i, final oui j, final boolean k, final cxl v) {
        this.x = true;
        this.m = m;
        this.b = b;
        this.z = z;
        this.d = d;
        this.e = e;
        this.h = h;
        this.q = q;
        this.r = r;
        this.A = a;
        this.s = s;
        this.t = t;
        this.u = u;
        this.i = i;
        this.j = j;
        this.k = k;
        this.v = v;
        this.l = new ipo(this, m, q);
        final ArrayList o = new ArrayList();
        (this.o = o).add(jbm.m);
        if (s) {
            o.add(jbm.g);
        }
        o.add(jbm.b);
        o.add(jbm.c);
        o.add(jbm.p);
        jbm g = bmx.d(a.a());
        switch (g.ordinal()) {
            default: {
                this.g = jbm.b;
                break;
            }
            case 5:
            case 13:
                Label_0285: {
                    if (v.k(cwv.H)) {
                        g = jbm.c;
                        break Label_0285;
                    }
                    g = jbm.b;
                    break Label_0285;
                }
            case 2:
            case 6:
            case 12:
            case 15: {
                this.g = g;
                break;
            }
        }
        final int index = o.indexOf(this.g);
        z(index);
        this.p = index;
        flr.a(this);
    }
    
    private final void y(final jbm g, final boolean b) {
        if (this.o.contains(g)) {
            this.b.setClickable(false);
            this.d.F(false);
            this.e.g(2);
            int n = 1;
            this.f = true;
            final iqd iqd = new iqd(this.t, this.u, this.g, g);
            final int index = this.o.indexOf(g);
            Label_0173: {
                if (index != -1) {
                    final int p2 = this.p;
                    if (index >= p2) {
                        if (index <= p2) {
                            break Label_0173;
                        }
                        n = 2;
                    }
                    final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 250, 0 });
                    ofInt.setDuration(250L);
                    if (b) {
                        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ipi(this, n));
                    }
                    ofInt.addListener((Animator$AnimatorListener)new ipm(this));
                    ofInt.start();
                }
            }
            final ipk ipk = new ipk(iqd);
            if (this.c != null) {
                if (this.z.f()) {
                    return;
                }
                if (this.g != g) {
                    this.g = g;
                    final int index2 = this.o.indexOf(g);
                    z(index2);
                    this.p = index2;
                    this.y.m(g, new ipj(this), ipk);
                    return;
                }
            }
            ipk.run();
        }
    }
    
    private static void z(final int n) {
        njo.o(n != -1);
    }
    
    @Override
    public final List a() {
        return this.o;
    }
    
    @Override
    public final void b() {
        final jbm b = jbm.b;
        this.h.n(b, false);
        this.y(b, false);
    }
    
    @Override
    public final void c() {
        this.h.l();
    }
    
    @Override
    public final void d(final boolean b) {
        this.h.m(b);
    }
    
    @Override
    public final void e(final ixx ixx) {
        this.y = ixx.e;
        this.g.getClass();
        this.r.f("ModeSwitchCtrl#init");
        this.h.q(this);
        this.h.s(this.t);
        this.h.i(jbm.m);
        if (this.s) {
            this.h.i(jbm.g);
        }
        this.h.i(jbm.b);
        this.h.i(jbm.c);
        this.h.k(this.g);
        this.r.g();
    }
    
    @Override
    public final void f(final jbm jbm) {
        if (this.g != jbm && this.w) {
            this.y(jbm, false);
            this.j(jbm, true);
        }
    }
    
    @Override
    public final void g(final jbm jbm) {
        final iqf n = this.n;
        if (n != null && this.w) {
            final ekw ekw = (ekw)n;
            oey oey;
            if (ekw.U.f()) {
                oey = ofi.n(true);
            }
            else if (jbm == jbm.j) {
                ekw.u = true;
                ((isc)ekw.M).a().a();
                final klv i = ekw.I;
                final Boolean value = true;
                i.aR(value);
                oey = ofi.n(value);
            }
            else if (jbm == jbm.q) {
                ekw.u = true;
                final isb a = ((isc)ekw.M).a();
                final Context c = ekw.c;
                final Intent intent = new Intent();
                intent.setClassName(new orl(c.getPackageManager()).b(), "com.google.vr.apps.ornament.measure.MeasureMainActivity");
                a.b(intent);
                final klv k = ekw.K;
                final Boolean value2 = true;
                k.aR(value2);
                oey = ofi.n(value2);
            }
            else if (jbm == jbm.s) {
                ekw.u = true;
                ((isc)ekw.M).a().c();
                final klv l = ekw.L;
                final Boolean value3 = true;
                l.aR(value3);
                oey = ofi.n(value3);
            }
            else if (jbm == jbm.k) {
                ekw.u = true;
                oey = odg.h(((iov)ekw.N.get()).b(), new ekj(ekw), mcn.n());
            }
            else {
                final bqo n2 = ekw.n;
                if (jbm == jbm.j || jbm == jbm.s || jbm == jbm.k || jbm == jbm.q) {
                    ((bsa)n2).y.S(jbk.f(jbm), 1);
                }
                final bsa bsa = (bsa)n2;
                bsa.i.H(false);
                if (jbm != jbm.e && jbm != jbm.r) {
                    bsa.e.m(jbm, new brw(bsa), aas.a);
                }
                else {
                    bsa.e.g(jbm);
                    bsa.e.l();
                    if (jbm == jbm.r) {
                        bsa.e.e();
                        bsa.e.f();
                    }
                    bsa.q(jbm);
                }
                oey = ofi.n(true);
            }
            ofi.w(oey, new ipl(this, jbm), odx.a);
        }
    }
    
    public final void h(final boolean x) {
        kjm.a();
        this.x = x;
        if (x) {
            if (this.w) {
                this.l.a = true;
                this.h.o(true);
            }
            return;
        }
        this.l.a = false;
        this.h.o(false);
    }
    
    @Override
    public final void i(final iqe c) {
        this.c = c;
    }
    
    @Override
    public final void j(final jbm g, final boolean b) {
        if (g != null && this.g != g && !this.f) {
            this.g = g;
            Label_0137: {
                if (this.s(g)) {
                    final int index = this.o.indexOf(g);
                    z(index);
                    this.p = index;
                }
                else {
                    if (this.v.k(cwv.H)) {
                        if (g.equals(jbm.n) || g.equals(jbm.f)) {
                            final int index2 = this.o.indexOf(jbm.c);
                            z(index2);
                            this.p = index2;
                            break Label_0137;
                        }
                    }
                    final int index3 = this.o.indexOf(jbm.p);
                    z(index3);
                    this.p = index3;
                }
            }
            this.h.n(this.g, b);
        }
    }
    
    @Override
    public final void k(final iqf n) {
        this.n = n;
    }
    
    @Override
    public final void l(final boolean w) {
        kjm.a();
        this.w = w;
        if (w) {
            if (this.x) {
                this.l.a = true;
                this.h.o(true);
            }
            return;
        }
        this.l.a = false;
        this.h.o(false);
    }
    
    @Override
    public final void m() {
        this.h.t();
    }
    
    @Override
    public final void n() {
        this.h.u();
    }
    
    @Override
    public final boolean o() {
        return this.p == 0;
    }
    
    @Override
    public final boolean p() {
        return this.p == this.o.size() - 1;
    }
    
    @Override
    public final boolean q() {
        return this.w;
    }
    
    @Override
    public final boolean r() {
        return this.l.a;
    }
    
    @Override
    public final boolean s(final jbm jbm) {
        return this.o.contains(jbm);
    }
    
    @Override
    public final boolean t(final jbm jbm) {
        njo.e(jbm != null, "requested mode is null");
        if (this.g == jbm) {
            a.l(ipn.a.c(), "requested mode is currently active", '\u0afe');
            return true;
        }
        if (this.f) {
            a.l(ipn.a.b(), "scroll is currently in progress; don't know what to do with this.", '\u0afd');
            return false;
        }
        if (!this.w) {
            a.l(ipn.a.c(), "mode switch requested when switcher is disabled. Ignoring.", '\u0afc');
            return false;
        }
        if (this.s(jbm)) {
            this.f(jbm);
        }
        else {
            this.g(jbm);
        }
        return true;
    }
    
    @Override
    public final void u(int size, final boolean b) {
        if ((size != 1 || !this.o()) && (size != 2 || !this.p())) {
            jbm jbm = null;
            if (b) {
                if (size == 2) {
                    if (this.p()) {
                        size = 0;
                    }
                    else {
                        size = this.p + 1;
                    }
                    while (this.o.get(size) == jbm.p && size != this.p) {
                        if (size >= this.o.size() - 1) {
                            size = 0;
                        }
                        else {
                            ++size;
                        }
                    }
                    if (size != this.p) {
                        jbm = this.o.get(size);
                    }
                }
                else {
                    if (this.o()) {
                        size = this.o.size() - 1;
                    }
                    else {
                        size = this.p - 1;
                    }
                    while (this.o.get(size) == jbm.p && size != this.p) {
                        if (size <= 0) {
                            size = this.o.size();
                        }
                        --size;
                    }
                    if (size != this.p) {
                        jbm = this.o.get(size);
                    }
                }
            }
            else if (size == 2 && !this.p()) {
                jbm = this.o.get(this.p + 1);
            }
            else if (size == 1 && !this.o()) {
                jbm = this.o.get(this.p - 1);
            }
            if (jbm != null) {
                this.t.W(2, this.g.toString(), jbm.toString());
                this.y(jbm, true);
            }
        }
    }
    
    @Override
    public final void v(final boolean b) {
        this.h.x(b);
    }
    
    @Override
    public final ipo w() {
        return this.l;
    }
    
    @Override
    public final void x(final jbm jbm) {
        this.y(jbm, false);
    }
}
