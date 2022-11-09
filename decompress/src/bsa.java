import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import android.animation.AnimatorSet;
import android.view.View$AccessibilityDelegate;
import android.view.TextureView$SurfaceTextureListener;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import com.google.android.apps.camera.faceboxes.FaceView;
import android.view.View;
import android.os.Handler;
import android.view.View$OnClickListener;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import android.view.WindowManager;
import android.hardware.display.DisplayManager;
import android.graphics.SurfaceTexture;
import android.view.View$OnLayoutChangeListener;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import android.hardware.display.DisplayManager$DisplayListener;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import android.support.constraint.ConstraintLayout;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.bottombar.BottomBarController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsa implements bqo
{
    public static final nsd a;
    public final ofn A;
    private final boolean B;
    private final imk C;
    private final BottomBarController D;
    private final eiq E;
    private final CaptureAnimationOverlay F;
    private final gjj G;
    private final isu H;
    private final isu I;
    private final isu J;
    private final ijx K;
    private final pii L;
    private ofn M;
    private final bmz N;
    private int O;
    public final bql b;
    public final ConstraintLayout c;
    public final iqg d;
    public final ViewfinderCover e;
    public final MainActivityLayout f;
    public final FrameLayout g;
    public final ShutterButton h;
    public final ivj i;
    public final ddz j;
    public final djf k;
    public final DisplayManager$DisplayListener l;
    public int m;
    public final PreviewOverlay n;
    public isx o;
    public final View$OnLayoutChangeListener p;
    public final ihp q;
    public isu r;
    public final ixn s;
    public SurfaceTexture t;
    public int u;
    public int v;
    public final DisplayManager w;
    public final WindowManager x;
    public final eyt y;
    public final CameraActivityTiming z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/app/ui/CameraAppUiImpl");
    }
    
    public bsa(final bql b, final MainActivityLayout f, final ixx ixx, final ixw ixw, final ioe ioe, final ixn s, final bmz n, final DisplayManager w, final WindowManager x, final ihp q, final ijx k, final doc doc, final BottomBarController d, final ivj i, final eiq e, final eyt y, final CameraActivityTiming z, final pii l, final iqg d2, final imk c, final gjj g, final itx itx, final ofn a, final ddz j, final boolean b2) {
        this.p = (View$OnLayoutChangeListener)new brx();
        this.O = 1;
        this.M = ofn.f();
        this.b = b;
        this.f = f;
        this.B = b2;
        this.s = s;
        this.L = l;
        this.N = n;
        this.w = w;
        this.x = x;
        this.K = k;
        this.q = q;
        final ConstraintLayout a2 = ixw.a;
        this.c = a2;
        this.D = d;
        this.i = i;
        this.E = e;
        this.d = d2;
        this.C = c;
        this.G = g;
        this.j = j;
        this.e = (ViewfinderCover)ixw.c.c(2131428135);
        this.y = y;
        this.z = z;
        this.A = a;
        g.aQ = new bru(this);
        g.aR = new brt(b);
        itx.a.f.setOnClickListener((View$OnClickListener)new brs(this));
        n.i().c(q.a(new brv(doc)));
        this.m = gkn.a(x);
        w.registerDisplayListener(this.l = (DisplayManager$DisplayListener)new bry(this), (Handler)null);
        a2.getClass();
        this.h = (ShutterButton)ixx.k.c(2131427949);
        final jea a3 = jea.a((View)a2);
        this.g = (FrameLayout)a3.c(2131427776);
        this.n = (PreviewOverlay)a3.c(2131427861);
        this.F = (CaptureAnimationOverlay)a3.c(2131427483);
        this.k = new djf((FaceView)a3.c(2131427596));
        j.b((DebugCanvasView)a3.c(2131427535));
        final isv isv = new isv(new ita((ConstraintLayout)((View)f).findViewById(2131427411), ioe, x, (TextureView$SurfaceTextureListener)this));
        this.J = isv;
        this.r = isv;
        final isv isv2 = new isv(new itb(s));
        this.H = isv2;
        this.I = isv2;
        ixx.d.setImportantForAccessibility(1);
        ixx.d.setAccessibilityDelegate((View$AccessibilityDelegate)new brz());
    }
    
    private final void t(final boolean cameraSwitchEnabled) {
        this.D.setCameraSwitchEnabled(cameraSwitchEnabled);
        this.C.d(cameraSwitchEnabled);
    }
    
    private static final void u(final isu isu) {
        isu.h(null);
    }
    
    @Override
    public final niz a() {
        return this.r.c();
    }
    
    @Override
    public final void b() {
        this.r.f();
    }
    
    public final boolean bl() {
        if (this.G.A()) {
            this.G.f();
            return true;
        }
        return this.b.h().q();
    }
    
    @Override
    public final void c() {
        final CaptureAnimationOverlay f = this.F;
        final AnimatorSet b = f.b;
        if (b != null && b.isRunning()) {
            f.b.cancel();
        }
        f.c = 1;
        f.setVisibility(4);
    }
    
    @Override
    public final void d() {
        if (this.N.f()) {
            return;
        }
        if (this.B) {
            this.b.m();
            return;
        }
        this.d.b();
        this.K.a();
    }
    
    @Override
    public final void e() {
        this.D.setSideButtonsClickable(false);
    }
    
    @Override
    public final void f() {
        this.D.setSideButtonsClickable(true);
    }
    
    @Override
    public final void g() {
        this.D.setClickable(true);
        this.i.F(true);
        this.E.g(1);
    }
    
    @Override
    public final void h(final boolean b) {
        this.e.j();
        if (!b) {
            this.G.i();
        }
        final Object value = this.L.get();
        final hvy a = hvy.a;
        final hwh hwh = (hwh)value;
        if (!hwh.l(a)) {
            hwh.i(hvy.a);
            final hvz hvz = (hvz)value;
            hvz.a.a();
            hvz.a = ksh.b;
            this.M.o(Object.class);
            this.M = ofn.f();
        }
        if (!this.z.l(hvu.m)) {
            Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)new brr(this));
        }
    }
    
    @Override
    public final void i(final boolean b) {
        this.y.u(b);
    }
    
    @Override
    public final void j() {
        this.e.g(this.b.l());
    }
    
    @Override
    public final void k(final boolean b) {
        this.i.H(b);
    }
    
    @Override
    public final void l() {
        this.F.b();
    }
    
    @Override
    public final void m() {
        this.F.a(true);
        this.t(false);
    }
    
    @Override
    public final void n() {
        this.F.a(false);
        this.t(true);
    }
    
    @Override
    public final void o() {
        this.D.setCameraSwitchEnabled(true);
    }
    
    public final void onSurfaceTextureAvailable(final SurfaceTexture t, final int u, final int v) {
        this.t = t;
        this.u = u;
        this.v = v;
        final isx o = this.o;
        if (o != null) {
            o.onSurfaceTextureAvailable(t, u, v);
        }
    }
    
    public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        this.t = null;
        final isx o = this.o;
        if (o != null) {
            o.onSurfaceTextureDestroyed(surfaceTexture);
            return true;
        }
        return false;
    }
    
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture t, final int u, final int v) {
        this.t = t;
        this.u = u;
        this.v = v;
        final isx o = this.o;
        if (o != null) {
            o.onSurfaceTextureSizeChanged(t, u, v);
        }
    }
    
    public final void onSurfaceTextureUpdated(final SurfaceTexture t) {
        this.t = t;
    }
    
    @Override
    public final void p(final int o, isx o2) {
        this.H.getClass();
        this.I.getClass();
        this.J.getClass();
        njo.d(true);
        final int o3 = this.O;
        if (o == o3) {
            this.o = o2;
        }
        else {
            this.o = null;
            if (o3 != 1) {
                if (o3 == 3) {
                    u(this.r);
                }
                final isu r = this.r;
                if (r != null) {
                    r.e();
                }
            }
            this.o = o2;
            final isu h = this.H;
            h.getClass();
            final isu i = this.I;
            i.getClass();
            isu j = this.J;
            j.getClass();
            switch (o - 1) {
                default: {
                    j = h;
                    if (this.r == h) {
                        j = i;
                    }
                }
                case 2: {
                    this.r = j;
                    this.O = o;
                    j.getClass();
                    if (o == 3) {
                        j.h(this.p);
                    }
                    this.r.d();
                    break;
                }
            }
        }
        o2 = this.o;
        if (o2 != null) {
            final GestureDetector$OnGestureListener a = o2.a();
            if (a != null) {
                final PreviewOverlay n = this.n;
                n.a = new GestureDetector(n.getContext(), a);
            }
            final View$OnTouchListener b = this.o.b();
            if (b != null) {
                this.n.b = b;
            }
        }
    }
    
    public final void q(final jbm jbm) {
        this.b.p(jbm);
        if (this.d.s(jbm)) {
            this.d.l(true);
            return;
        }
        if (jbm == jbm.i) {
            this.d.l(false);
            return;
        }
        this.d.l(false);
    }
    
    public final void r() {
        if (this.O == 1) {
            return;
        }
        u(this.r);
        final oey e = this.r.e();
        e.getClass();
        try {
            e.get(2000L, TimeUnit.MILLISECONDS);
            this.O = 1;
            return;
        }
        catch (final TimeoutException ex) {
            throw new IllegalStateException("Surface Destruction Synchronization on Module Switch Timed out.");
        }
        catch (final ExecutionException ex2) {}
        catch (final InterruptedException ex3) {}
        throw new IllegalStateException("Synchronization close failed on preview switch.");
    }
}
