import android.view.View;
import java.util.ArrayList;
import android.os.Handler;
import java.util.List;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivp implements ivj
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
    private final jjb l;
    private iuk m;
    private final ivq n;
    
    static {
        g = nns.o(jbm.r, jbm.p, jbm.k);
    }
    
    public ivp(final ShutterButton a, Handler handler, final niz i, final jdj k, final boolean zoomLockViewEnabled, final boolean materialNextEnabled, final jbj f, final jjb l) {
        final ivn ivn = new ivn(this);
        this.n = ivn;
        this.a = a;
        this.h = handler;
        this.i = i;
        this.m = a.getMode();
        final ArrayList c = new ArrayList();
        this.c = c;
        handler = (Handler)new Object();
        this.b = handler;
        this.j = new ivh(a);
        this.k = k;
        this.f = f;
        this.l = l;
        final boolean b = false;
        a.setP20NewUIEnabled(false);
        a.setZoomLockViewEnabled(zoomLockViewEnabled);
        a.setMaterialNextEnabled(materialNextEnabled);
        a.setListener(ivn);
        this.d(new ivo(this));
        synchronized (handler) {
            this.d = a.isEnabled();
            this.e = a.isClickEnabled();
            njo.p(c.size() == 1 || b, "Expect only the pressedStateAnimation listener at this stage.");
        }
    }
    
    private final void ao(final iuk m) {
        final iuk a = iuk.a;
        final jbm a2 = jbm.a;
        switch (m.ordinal()) {
            default: {
                return;
            }
            case 0:
            case 2:
            case 4:
            case 19: {
                this.m = m;
            }
        }
    }
    
    private final void ap(final iuk iuk) {
        this.ao(iuk);
        this.a.setMode(iuk, this.j, false);
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
                while (true) {
                    final boolean clickEnabled;
                    this.a.setClickEnabled(clickEnabled);
                    Block_6: {
                        Label_0099: {
                            break Label_0099;
                            Label_0072: {
                                this.h.post((Runnable)new ivm(this, clickEnabled, 1));
                            }
                            break Label_0099;
                            final boolean b3 = false;
                            clickEnabled = ((e && this.an()) || b3);
                            iftrue(Label_0072:)(!kjm.c());
                            break Block_6;
                        }
                        monitorexit(b2);
                        return;
                    }
                    iftrue(Label_0099:)(this.a.isClickEnabled() == clickEnabled);
                    continue;
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
                Label_0069: {
                    final boolean b3;
                    this.h.post((Runnable)new ivm(this, b3));
                }
                while (true) {
                    monitorexit(b2);
                    return;
                    final boolean b4 = false;
                    final boolean b3 = (d && this.an()) || b4;
                    iftrue(Label_0069:)(!kjm.c());
                    iftrue(Label_0095:)(this.a.isEnabled() == b3);
                    this.g(b3);
                    continue;
                }
            }
        }
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
        this.ap(iuk.k);
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
    }
    
    @Override
    public final void R() {
        this.k.a();
        this.ap(iuk.G);
    }
    
    @Override
    public final void S() {
        this.H(true);
        final jjb l = this.l;
        if (l != null) {
            l.v(true);
        }
        this.ap(iuk.H);
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
    public final void Y() {
        this.ap(iuk.k);
    }
    
    @Override
    public final void Z() {
        this.ap(iuk.F);
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
        this.ap(this.m);
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
            case 7:
            case 11: {
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
        if (!ivp.g.contains(applicationMode)) {
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
            case 19: {
                this.a.setMode(w, hjg, this.j, false);
                return;
            }
            case 0:
            case 34: {
                if (hjg == hjg.d) {
                    this.a.setMode(iuk.I, hjg, this.j, false);
                    return;
                }
                this.a.setMode(iuk.a, hjg, this.j, false);
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
        return new ivk(this);
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
            return new ivl(this, ivq);
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
    public final void l() {
        this.ap(iuk.l);
    }
    
    @Override
    public final void m() {
        this.ap(iuk.t);
    }
    
    @Override
    public final void o() {
        this.ap(iuk.K);
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
