import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.view.View;
import java.util.ArrayList;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import android.os.Handler;
import java.util.List;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iud implements ivj
{
    private static final nns g;
    public final ShutterButton a;
    public final Object b;
    public final List c;
    boolean d;
    boolean e;
    public final jbj f;
    private final Handler h;
    private final niz i;
    private final ivh j;
    private final jdj k;
    private final ShutterButtonProgressOverlay l;
    private final jjb m;
    private final boolean n;
    private iuk o;
    private final ivq p;
    
    static {
        g = nns.o(jbm.r, jbm.p, jbm.k);
    }
    
    public iud(final ShutterButton a, Handler handler, final niz i, final jdj k, final ShutterButtonProgressOverlay l, final boolean zoomLockViewEnabled, final boolean materialNextEnabled, final jbj f, final jjb m) {
        final iub iub = new iub(this);
        this.p = iub;
        this.a = a;
        this.h = handler;
        this.i = i;
        this.o = a.getMode();
        final ArrayList c = new ArrayList();
        this.c = c;
        handler = (Handler)new Object();
        this.b = handler;
        this.j = new ivh(a);
        this.k = k;
        this.l = l;
        final boolean b = true;
        this.n = true;
        this.f = f;
        this.m = m;
        a.setP20NewUIEnabled(true);
        a.setZoomLockViewEnabled(zoomLockViewEnabled);
        a.setMaterialNextEnabled(materialNextEnabled);
        a.setListener(iub);
        this.d(new iuc(this));
        synchronized (handler) {
            this.d = a.isEnabled();
            this.e = a.isClickEnabled();
            njo.p(c.size() == 1 && b, "Expect only the pressedStateAnimation listener at this stage.");
        }
    }
    
    private final void ao(final iuk o) {
        final iuk a = iuk.a;
        final jbm a2 = jbm.a;
        switch (o.ordinal()) {
            default: {
                return;
            }
            case 0:
            case 2:
            case 4:
            case 13:
            case 16:
            case 19: {
                this.o = o;
            }
        }
    }
    
    private final void ap(final iuk iuk) {
        this.ao(iuk);
        this.a.setMode(iuk, this.j, this.n);
        ((ivy)((njd)this.i).a).b(iuk);
    }
    
    @Override
    public final void A(final boolean b) {
        this.a.runPressedStateAnimation(b, this.j);
    }
    
    @Override
    public final void B(final boolean enableLongPressMotion) {
        this.a.setEnableLongPressMotion(enableLongPressMotion);
    }
    
    @Override
    public final void C(final iui longPressMotionListener) {
        this.a.setLongPressMotionListener(longPressMotionListener);
    }
    
    @Override
    public final void D(final int n) {
        this.l.b(n, -1L, false);
    }
    
    @Override
    public final void E(final int n, final long n2, final boolean b) {
        this.l.b(n, n2, b);
    }
    
    @Override
    public final void F(final boolean b) {
        this.G(b, true);
    }
    
    public final void G(final boolean e, final boolean b) {
        final Object b2 = this.b;
        monitorenter(b2);
        Label_0024: {
            if (!b) {
                break Label_0024;
            }
            try {
                this.e = e;
                break Label_0024;
            }
            finally {
                monitorexit(b2);
            Label_0099_Outer:
                while (true) {
                    final boolean clickEnabled;
                    iftrue(Label_0099:)(this.a.isClickEnabled() == clickEnabled);
                    this.a.setClickEnabled(clickEnabled);
                    while (true) {
                        monitorexit(b2);
                        return;
                        Label_0072: {
                            this.h.post((Runnable)new iua(this, clickEnabled, 1));
                        }
                        continue;
                    }
                    final boolean b3 = false;
                    clickEnabled = ((e && this.an()) || b3);
                    iftrue(Label_0072:)(!kjm.c());
                    continue Label_0099_Outer;
                }
            }
        }
    }
    
    @Override
    public final void H(final boolean b) {
        this.I(b, true);
    }
    
    public final void I(final boolean d, final boolean b) {
        final Object b2 = this.b;
        monitorenter(b2);
        Label_0024: {
            if (!b) {
                break Label_0024;
            }
            try {
                this.d = d;
                break Label_0024;
            }
            finally {
                monitorexit(b2);
                while (true) {
                Label_0095_Outer:
                    while (true) {
                        final boolean b3;
                        this.g(b3);
                        while (true) {
                            monitorexit(b2);
                            return;
                            Label_0069: {
                                this.h.post((Runnable)new iua(this, b3));
                            }
                            continue;
                        }
                        iftrue(Label_0095:)(this.a.isEnabled() == b3);
                        continue Label_0095_Outer;
                    }
                    final boolean b4 = false;
                    final boolean b3 = (d && this.an()) || b4;
                    iftrue(Label_0069:)(!kjm.c());
                    continue;
                }
            }
        }
    }
    
    @Override
    public final void J() {
        this.ap(iuk.w);
    }
    
    @Override
    public final void K() {
        this.ap(iuk.J);
    }
    
    @Override
    public final void L() {
        this.ap(iuk.g);
    }
    
    @Override
    public final void M() {
        this.ap(iuk.f);
    }
    
    @Override
    public final void N() {
        this.g(true);
        this.ap(iuk.m);
    }
    
    @Override
    public final void O() {
        this.ap(iuk.x);
    }
    
    @Override
    public final void P() {
        this.ap(iuk.w);
    }
    
    @Override
    public final void Q() {
        this.ap(iuk.v);
    }
    
    @Override
    public final void R() {
        this.k.a();
        this.ap(iuk.G);
    }
    
    @Override
    public final void S() {
        this.H(true);
        this.m.v(true);
        this.ap(iuk.H);
    }
    
    @Override
    public final void T() {
        this.ap(iuk.C);
    }
    
    @Override
    public final void U() {
        this.ap(iuk.i);
    }
    
    @Override
    public final void V() {
        this.ap(iuk.j);
    }
    
    @Override
    public final void W() {
        this.ap(iuk.p);
    }
    
    @Override
    public final void X() {
        this.ap(iuk.s);
    }
    
    @Override
    public final void Y() {
        this.ap(iuk.f);
    }
    
    @Override
    public final void Z() {
        this.ap(iuk.E);
        this.a.startTimelapseCircleAnimation();
    }
    
    @Override
    public final oey a(final lfu lfu) {
        this.F(false);
        return ofi.n(null);
    }
    
    @Override
    public final void aa() {
        this.ap(iuk.k);
    }
    
    @Override
    public final void ab() {
        this.ap(iuk.I);
    }
    
    @Override
    public final void ac() {
        this.ap(this.o);
    }
    
    @Override
    public final void ad() {
        this.ap(iuk.e);
    }
    
    @Override
    public final void ae() {
        this.ap(iuk.a);
    }
    
    @Override
    public final void af() {
        this.ap(iuk.a);
    }
    
    @Override
    public final void ag() {
        this.ap(iuk.e);
        this.e(1.0f);
    }
    
    @Override
    public final void ah() {
        this.ap(iuk.D);
        this.a.stopTimelapseCircleAnimation();
    }
    
    @Override
    public final void ai(final jbm applicationMode) {
        this.a.setApplicationMode(applicationMode);
        final iuk a = iuk.a;
        final jbm a2 = jbm.a;
        switch (applicationMode.ordinal()) {
            case 13: {
                this.ap(iuk.D);
                break;
            }
            case 12: {
                this.ap(iuk.t);
                break;
            }
            case 11: {
                this.ap(iuk.A);
                break;
            }
            case 7: {
                this.ap(iuk.a);
                break;
            }
            case 6: {
                this.ap(iuk.c);
                break;
            }
            case 4: {
                this.ap(iuk.K);
                break;
            }
            case 3: {
                this.ap(iuk.l);
                break;
            }
            case 2:
            case 5:
            case 8: {
                this.ap(iuk.e);
                break;
            }
            case 1: {
                iuk iuk;
                if (this.a.getCurrentSpec().x == hjg.d) {
                    iuk = iuk.I;
                }
                else {
                    iuk = iuk.a;
                }
                this.ap(iuk);
                ((ivy)((njd)this.i).a).c();
                break;
            }
            case 0:
            case 9:
            case 14:
            case 16:
            case 18: {
                final String value = String.valueOf(applicationMode);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
                sb.append("Unsupported mode ");
                sb.append(value);
                throw new IllegalStateException(sb.toString());
            }
        }
        int n;
        if (!iud.g.contains(applicationMode)) {
            n = 0;
        }
        else {
            n = 4;
        }
        if (n == this.a.getVisibility()) {
            return;
        }
        jdz.a(n, (View)this.a);
    }
    
    @Override
    public final void aj() {
        this.g(true);
        this.ap(iuk.j);
    }
    
    @Override
    public final void ak(final hjg hjg) {
        final iuk w = this.a.getCurrentSpec().w;
        this.ao(w);
        final iuk a = iuk.a;
        final jbm a2 = jbm.a;
        switch (w.ordinal()) {
            default: {
                return;
            }
            case 2:
            case 13:
            case 16:
            case 19:
            case 24: {
                this.a.setMode(w, hjg, this.j, this.n);
                return;
            }
            case 0:
            case 34: {
                if (hjg == hjg.d) {
                    this.a.setMode(iuk.I, hjg, this.j, this.n);
                    return;
                }
                this.a.setMode(iuk.a, hjg, this.j, this.n);
            }
        }
    }
    
    @Override
    public final void al() {
        this.ap(iuk.j);
    }
    
    @Override
    public final void am() {
        this.a.updateTimelapseProgressState();
    }
    
    final boolean an() {
        synchronized (this.b) {
            final int size = this.c.size();
            boolean b = true;
            if (size <= 1) {
                b = false;
            }
            return b;
        }
    }
    
    @Override
    public final krc b() {
        this.I(false, false);
        return new ity(this);
    }
    
    @Override
    public final krc d(final ivq ivq) {
        synchronized (this.b) {
            this.c.add(ivq);
            if (this.an()) {
                this.I(this.d, false);
                this.G(this.e, false);
            }
            monitorexit(this.b);
            return new itz(this, ivq);
        }
    }
    
    final void e(final float n) {
        this.a.animateToScale(n);
    }
    
    @Override
    public final void f() {
        this.ap(iuk.K);
    }
    
    final void g(final boolean enabled) {
        this.a.setEnabled(enabled);
    }
    
    @Override
    public final void h() {
        this.ap(iuk.y);
    }
    
    @Override
    public final void i() {
        this.ap(iuk.n);
    }
    
    @Override
    public final void j() {
        this.ap(iuk.q);
    }
    
    @Override
    public final void k() {
        this.ap(iuk.t);
    }
    
    @Override
    public final void l() {
        this.ap(iuk.l);
    }
    
    @Override
    public final void m() {
        this.ap(iuk.t);
    }
    
    @Override
    public final void n() {
        this.ap(iuk.A);
    }
    
    @Override
    public final void o() {
        this.ap(iuk.K);
    }
    
    @Override
    public final void p() {
        this.ap(iuk.n);
    }
    
    @Override
    public final void q() {
        this.ap(iuk.q);
    }
    
    @Override
    public final void r() {
        final ShutterButtonProgressOverlay l = this.l;
        final AnimatorSet i = l.i;
        if (i != null && i.isRunning()) {
            l.i.cancel();
        }
        final ValueAnimator j = l.j;
        if (j != null && j.isRunning()) {
            l.j.cancel();
        }
        l.a();
        l.b = 0;
        l.c = 0.0f;
        l.h = false;
        l.g = true;
        l.k = 1;
        l.invalidate();
    }
    
    @Override
    public final void s() {
        this.e(0.8f);
    }
    
    @Override
    public final void t() {
        this.e(0.8f);
        this.a.pauseTimelapseAnimationState();
    }
    
    @Override
    public final void u() {
        this.a.performClick();
    }
    
    @Override
    public final void v() {
        this.a.performShutterButtonDown();
    }
    
    @Override
    public final void w() {
        this.e(1.0f);
    }
    
    @Override
    public final void x() {
        this.e(1.0f);
        this.a.resumeTimelapseAnimationState();
    }
    
    @Override
    public final void y() {
        this.ap(iuk.a);
    }
    
    @Override
    public final void z() {
        this.ap(iuk.e);
    }
}
