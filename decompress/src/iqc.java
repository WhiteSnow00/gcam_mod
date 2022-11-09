import android.graphics.Canvas;
import android.animation.TypeEvaluator;
import android.animation.RectEvaluator;
import android.os.Looper;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.Animator$AnimatorListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import android.view.View;
import android.graphics.Rect;
import android.os.Handler;
import android.graphics.Paint;
import android.animation.AnimatorSet;
import android.view.animation.BaseInterpolator;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqc
{
    private static final int G;
    private static final int H;
    public static final nsd a;
    static final int b;
    public niz A;
    public iqa B;
    public cse C;
    public lfu D;
    public final List E;
    public int F;
    private final ViewGroup I;
    private boolean J;
    private boolean K;
    public final ObjectAnimator c;
    public final ValueAnimator d;
    public final BaseInterpolator e;
    public AnimatorSet f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Handler j;
    public niz k;
    public Rect l;
    public ipz m;
    public int n;
    public niz o;
    public float p;
    public klj q;
    public int r;
    public klv s;
    public niz t;
    public jbm u;
    public int v;
    public View w;
    public View x;
    public boolean y;
    public int z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/modeswitch/animation/ViewfinderCoverAnimator");
        G = Math.round(102.0f);
        H = Math.round(178.5f);
        b = inp.a.e;
    }
    
    public iqc(final ViewGroup i) {
        this.k = nii.a;
        this.n = 0;
        this.o = nii.a;
        this.p = 1.0f;
        this.r = -1;
        this.s = klu.a(iqc.b);
        this.t = nii.a;
        this.F = 1;
        this.u = jbm.a;
        this.v = 0;
        this.y = true;
        this.z = 0;
        this.A = nii.a;
        this.B = ipv.a;
        this.J = false;
        this.C = ipu.a;
        this.D = lfu.b;
        this.E = new ArrayList();
        this.K = false;
        this.I = i;
        this.f = new AnimatorSet();
        this.e = (BaseInterpolator)new AccelerateDecelerateInterpolator();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)i, View.ALPHA, new float[] { 1.0f, 0.0f });
        (this.c = ofFloat).setDuration(250L);
        ofFloat.addListener((Animator$AnimatorListener)new ipw(this));
        ofFloat.setInterpolator((TimeInterpolator)new LinearInterpolator());
        final Paint g = new Paint();
        (this.g = g).setFilterBitmap(true);
        g.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
        (this.i = new Paint()).setColor(-16777216);
        final Paint h = new Paint();
        (this.h = h).setAlpha(0);
        h.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_OVER));
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 0, iqc.G });
        (this.d = ofInt).addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ipt(this, 1));
        ofInt.setDuration(250L);
        this.l = new Rect(0, 0, 1, 1);
        final ipy a = ipz.a();
        a.c(new Rect(0, 0, 1, 1));
        a.b(0);
        this.m = a.a();
        this.j = kpo.d(Looper.getMainLooper());
        i.setWillNotDraw(false);
    }
    
    public static float a(final Rect rect) {
        if (rect.height() == 0.0f) {
            return 0.0f;
        }
        return rect.width() / (float)rect.height();
    }
    
    public static ValueAnimator b(final Rect rect, final Rect rect2, final TimeInterpolator interpolator, final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        final ValueAnimator ofObject = ValueAnimator.ofObject((TypeEvaluator)new RectEvaluator(new Rect()), new Object[] { rect, rect2 });
        ofObject.setInterpolator(interpolator);
        ofObject.addUpdateListener(valueAnimator$AnimatorUpdateListener);
        return ofObject;
    }
    
    public static void c(final Canvas canvas, final Rect rect, final int n, final Paint paint) {
        if (n > 0) {
            final float n2 = (float)n;
            canvas.drawRoundRect((float)rect.left, (float)rect.top, (float)rect.right, (float)rect.bottom, n2, n2, paint);
            return;
        }
        canvas.drawRect(rect, paint);
    }
    
    private final int q() {
        return ++this.v;
    }
    
    public final void d() {
        final int r = this.r;
        if (r != -1) {
            this.s.aR(r);
            this.r = -1;
        }
        this.F = 5;
        this.c.start();
    }
    
    public final void e() {
        this.I.setVisibility(8);
        this.F = 1;
        this.q();
        this.k = nii.a;
        this.I.setLayerType(0, (Paint)null);
        if (this.K && this.A.g()) {
            ((gkw)this.A.c()).b(iqc.class);
            this.K = false;
        }
    }
    
    public final void f() {
        this.w.setVisibility(8);
    }
    
    public final void g() {
        this.x.setVisibility(8);
    }
    
    public final void h() {
        this.I.invalidate();
    }
    
    public final void i() {
        this.I.postInvalidateOnAnimation();
    }
    
    public final void j(final Rect rect) {
        this.l.set(rect);
        this.i();
    }
    
    final void k(final Runnable runnable) {
        this.t = niz.i(runnable);
    }
    
    public final void l() {
        if (this.I.getVisibility() != 0) {
            this.c.cancel();
            this.I.setVisibility(0);
        }
        this.I.setAlpha(1.0f);
    }
    
    public final void m() {
        this.w.setVisibility(0);
    }
    
    public final void n(final jbm u, final Runnable runnable, final iqb iqb, final ipx ipx, final boolean b) {
        final ipr ipr = new ipr(this, u, runnable, iqb, ipx, b);
        if (this.F == 5) {
            this.k(new ips(this.t, ipr));
            return;
        }
        final int q = this.q();
        this.k(runnable);
        if (this.A.g()) {
            ((gkw)this.A.c()).a(iqc.class);
            this.K = true;
        }
        this.I.setLayerType(2, (Paint)null);
        this.y = iqb.i();
        this.J = this.o();
        this.D = this.C.e();
        if (this.r == -1) {
            this.r = (int)this.s.aQ();
            this.s.aR(iqc.b);
        }
        final niz c = iqb.c();
        final niz b2 = iqb.b();
        final jbm u2 = this.u;
        this.d.removeAllListeners();
        this.u = u;
        this.p = (float)this.q.aQ();
        final int f = this.F;
        if (f == 5) {
            a.l(iqc.a.b(), "Somehow trying to go from FADING to WAITING_FOR_BITMAP: Illegal!", '\u0b19');
            throw new IllegalStateException("Going from FADING to WAITING_FOR_BITMAP");
        }
        if (f != 1) {
            if (!c.g()) {
                this.F = 1;
            }
            else {
                this.F = 2;
                this.h();
            }
        }
        else {
            this.c.cancel();
            this.f.cancel();
            this.d.cancel();
            this.k = c;
            if (!c.g()) {
                this.F = 1;
            }
            else {
                ((ixt)c.c()).a.prepareToDraw();
                this.l = ((ixt)c.c()).a();
                final niz b3 = b2.b(fzt.m);
                final ixt ixt = (ixt)c.c();
                final Rect rect = (Rect)b3.e(new Rect(0, 0, ixt.a.getWidth() * ixt.b, ixt.a.getHeight() * ixt.b));
                final niz c2 = ((ixt)c.c()).c;
                Rect rect2 = rect;
                if (c2.g()) {
                    rect2 = new Rect((Rect)c2.c());
                    rect2.offset(rect.left, rect.top);
                    if (!rect.contains(rect2)) {
                        iqc.a.c().E(2837).x("Source %s is not contained in preview box %s", rect2, rect);
                        rect2 = rect;
                    }
                }
                final ipy a = ipz.a();
                a.c(rect2);
                a.b((int)b2.b(fzt.l).e(0));
                final ipz a2 = a.a();
                this.m = a2;
                this.z = a2.b;
                final jbm p5 = jbm.p;
                int h;
                if (u2 == p5) {
                    h = iqc.H;
                }
                else {
                    h = 0;
                }
                int n;
                if (u == p5) {
                    n = iqc.H;
                }
                else {
                    n = iqc.G;
                }
                this.d.setIntValues(new int[] { h, n });
                this.n = h;
                this.F = 2;
                this.h();
            }
        }
        iqb.e();
        iqb.f();
        iqb.g(u);
        this.l();
        this.j.postDelayed((Runnable)new ipp(this, q), 4000L);
        final ipq ipq = new ipq(this, q, iqb, b, u, ipx);
        if (!c.g()) {
            ipq.run();
            return;
        }
        this.o = niz.i(ipq);
    }
    
    final boolean o() {
        final jbm a = jbm.a;
        switch (this.u.ordinal()) {
            default: {
                return false;
            }
            case 2: {
                return this.B.a();
            }
        }
    }
    
    public final boolean p() {
        return this.o() && !this.J;
    }
}
