import java.util.Map;
import android.content.res.Resources$Theme;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.Iterator;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator$AnimatorListener;
import java.util.Set;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.animation.ValueAnimator;
import android.widget.SeekBar;
import com.google.android.apps.camera.zoomui.ZoomKnob;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.animation.AnimatorSet;

// 
// Decompiled by Procyon v0.6.0
// 

public class jkf extends jjs
{
    private final AnimatorSet A;
    private final ViewGroup B;
    private final jin C;
    private final boolean D;
    private int E;
    private int F;
    private final AnimatorListenerAdapter a;
    private final AnimatorListenerAdapter b;
    private final AnimatorListenerAdapter c;
    private final ValueAnimator$AnimatorUpdateListener d;
    private final Runnable e;
    private final Runnable f;
    private final cse g;
    public final klv h;
    public final ZoomKnob i;
    public final SeekBar j;
    public final ValueAnimator k;
    public final ValueAnimator l;
    public final ValueAnimator m;
    public final ValueAnimator n;
    public final klj o;
    public final ZoomUi p;
    public final jdj q;
    public boolean r;
    public float s;
    public float t;
    public final klj u;
    public final cxl v;
    public boolean w;
    public boolean x;
    private final Set y;
    private final eyt z;
    
    public jkf(final ZoomUi p10, final Set y, final klv h, final eyt z, final cse g, final klj u, final cxl v, final klj o, final jin c, final jdj q) {
        final jjv a = new jjv(this);
        this.a = a;
        final jjw b = new jjw(this);
        this.b = b;
        final jjx c2 = new jjx(this);
        this.c = c2;
        final jjt d = new jjt(this);
        this.d = (ValueAnimator$AnimatorUpdateListener)d;
        this.e = new jju(this, 2);
        this.f = new jju(this, 1);
        this.t = 1.0f;
        this.E = 0;
        this.F = 3;
        this.x = false;
        kjm.a();
        this.y = y;
        this.h = h;
        this.g = g;
        this.z = z;
        this.u = u;
        this.v = v;
        this.o = o;
        this.p = p10;
        this.C = c;
        this.q = q;
        this.D = v.k(cxr.U);
        final ViewGroup b2 = (ViewGroup)p10.findViewById(2131428222);
        this.B = b2;
        this.i = p10.n();
        this.j = p10.g();
        final ValueAnimator m = new ValueAnimator();
        (this.m = m).addUpdateListener((ValueAnimator$AnimatorUpdateListener)d);
        m.addListener((Animator$AnimatorListener)a);
        m.setDuration(500L);
        m.setInterpolator((TimeInterpolator)new adh());
        final ValueAnimator l = new ValueAnimator();
        (this.l = l).addUpdateListener((ValueAnimator$AnimatorUpdateListener)d);
        l.setInterpolator((TimeInterpolator)new LinearInterpolator());
        final ValueAnimator k = new ValueAnimator();
        (this.k = k).addUpdateListener((ValueAnimator$AnimatorUpdateListener)d);
        k.setDuration(500L);
        k.setInterpolator((TimeInterpolator)new adh());
        k.addListener((Animator$AnimatorListener)b);
        final ValueAnimator n = new ValueAnimator();
        (this.n = n).addUpdateListener((ValueAnimator$AnimatorUpdateListener)d);
        n.setDuration(500L);
        n.setInterpolator((TimeInterpolator)new adh());
        n.addListener((Animator$AnimatorListener)c2);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)b2, View.ALPHA, new float[] { 0.0f, 1.0f });
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator((TimeInterpolator)new adh());
        ofFloat.addListener((Animator$AnimatorListener)new jjy((View)b2));
        final AnimatorSet a2 = new AnimatorSet();
        a2.playSequentially(new Animator[] { (Animator)ValueAnimator.ofInt(new int[] { 0, 1 }).setDuration(100L), (Animator)ofFloat });
        this.A = a2;
        this.w = v.k(cxr.T);
    }
    
    public static int y(final int n) {
        int n2 = n;
        if (n != 9) {
            if (n == 6) {
                n2 = n;
            }
            else {
                n2 = 1;
            }
        }
        return n2;
    }
    
    public final void A(final int e) {
        if (this.E == e) {
            return;
        }
        this.E = e;
        final Iterator iterator = this.y.iterator();
        while (iterator.hasNext()) {
            ((jiz)iterator.next()).o(e);
        }
    }
    
    public final void B(int l) {
        if (!this.x && this.B.getVisibility() == 8) {
            this.A.start();
        }
        final ZoomUi p = this.p;
        Object o = ZoomUi.a;
        monitorenter(o);
        try {
            int f = 0;
            if (p.l == l) {
                monitorexit(o);
                f = l;
            }
            else {
                p.l = l;
                final SeekBar g = p.g();
                final jio a = jio.a;
                final jcb a2 = jcb.a;
                if (l == 0) {
                    throw null;
                }
                int width = 0;
                switch (l - 1) {
                    default: {
                        width = p.getResources().getDimensionPixelSize(2131166465);
                        break;
                    }
                    case 3: {
                        width = p.getResources().getDimensionPixelSize(2131166458);
                        break;
                    }
                    case 2: {
                        width = p.getResources().getDimensionPixelSize(2131166467);
                        break;
                    }
                }
                final int dimensionPixelSize = p.getResources().getDimensionPixelSize(2131166465);
                final int dimensionPixelSize2 = p.getResources().getDimensionPixelSize(2131166468);
                final int dimensionPixelSize3 = p.getResources().getDimensionPixelSize(2131166443);
                final int dimensionPixelSize4 = p.getResources().getDimensionPixelSize(2131166459);
                final int dimensionPixelSize5 = p.getResources().getDimensionPixelSize(2131166457);
                final int n = (dimensionPixelSize2 - width) / 2;
                final int n2 = (dimensionPixelSize3 - dimensionPixelSize4) / 2;
                Label_0366: {
                    if (l == 2) {
                        p.t(false, 2);
                        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)p.b().getLayoutParams();
                        layoutParams.width = dimensionPixelSize;
                        p.b().setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                        f = l;
                        if (g.getMax() != 1) {
                            g.setMax(1);
                            f = l;
                        }
                    }
                    else {
                        p.t(true, l);
                        final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)p.b().getLayoutParams();
                        layoutParams2.width = width;
                        p.b().setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        if ((f = l) == 3) {
                            if (g.getMax() != 2) {
                                g.setMax(2);
                                f = 3;
                                break Label_0366;
                            }
                            f = 3;
                        }
                        g.setMax(3);
                    }
                }
                final FrameLayout$LayoutParams layoutParams3 = (FrameLayout$LayoutParams)g.getLayoutParams();
                layoutParams3.width = dimensionPixelSize5 + width;
                layoutParams3.height = dimensionPixelSize3;
                g.setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
                if (g.getProgressDrawable() == null) {
                    g.setPaddingRelative(n, n2, n, n2);
                }
                l = p.e().getHeight();
                if (l != 0 && l != dimensionPixelSize4) {
                    final ObjectAnimator a3 = ZoomUi.a((View)p.b(), true);
                    final ObjectAnimator a4 = ZoomUi.a((View)p.f(), true);
                    a3.addListener((Animator$AnimatorListener)new jit(p));
                    final AnimatorSet s = p.s(f, true);
                    ((Animator)s).setInterpolator((TimeInterpolator)new abn(3));
                    ((Animator)s).addListener((Animator$AnimatorListener)new jiu(p));
                    p.j = new AnimatorSet();
                    p.j.play((Animator)a3).after((Animator)s);
                    p.j.play((Animator)a4).with((Animator)a3);
                    final AnimatorSet i = p.i;
                    if (i != null && i.isRunning()) {
                        p.i.cancel();
                    }
                    p.j.start();
                    p.e().setBackground(p.getResources().getDrawable(2131231090, (Resources$Theme)null));
                }
                else {
                    final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { p.e().getWidth(), width });
                    ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new jir(p, 2));
                    ofInt.addListener((Animator$AnimatorListener)new jiv(p));
                    ofInt.setDuration(200L);
                    if (p.e().getVisibility() == 8) {
                        ofInt.end();
                    }
                    else {
                        final AnimatorSet j = p.i;
                        if (j != null && j.isRunning()) {
                            p.i.cancel();
                        }
                        ofInt.start();
                    }
                    final ZoomKnob n3 = p.n();
                    n3.setVisibility(4);
                    n3.b(false);
                    if (p.e().getVisibility() != 8) {
                        p.b().setVisibility(0);
                        p.f().setVisibility(0);
                    }
                }
                p.invalidate();
                monitorexit(o);
            }
            o = this.p;
            final float floatValue = (float)this.h.aQ();
            l = jio.b.ordinal();
            final float c = this.C.c(floatValue, this.t);
            if (f == 2) {
                final jin c2 = this.C;
                if (c >= c2.c(c2.a(1), this.t)) {
                    l = 1;
                }
                else {
                    l = 0;
                }
            }
            else if (f == 3) {
                if (c >= this.C.a(jio.c.ordinal())) {
                    l = jio.c.ordinal();
                }
                else if (c < this.C.a(jio.b.ordinal())) {
                    l = jio.a.ordinal();
                }
            }
            else if (f == 4) {
                if (c >= Math.min(this.C.b(), this.C.a(jio.d.ordinal()))) {
                    l = jio.d.ordinal();
                }
                else if (c < this.C.a(jio.d.ordinal()) && c >= this.C.a(jio.c.ordinal())) {
                    l = jio.c.ordinal();
                }
                else if (c < this.C.a(jio.b.ordinal())) {
                    l = jio.a.ordinal();
                }
            }
            ((ZoomUi)o).q(l, null);
            o = this.C;
            ((jin)o).h(this.p, ((jin)o).d((float)this.h.aQ()));
            Label_1851: {
                if (this.C.i((float)this.h.aQ())) {
                    if (this.F == f) {
                        break Label_1851;
                    }
                }
                o = this.C;
                final ZoomUi p2 = this.p;
                final float floatValue2 = (float)this.h.aQ();
                final Map g2 = ((jin)o).g((jbm)((jin)o).a.aQ());
                if (((jin)o).i(floatValue2)) {
                    ((jin)o).h(p2, ((jin)o).d(floatValue2));
                }
                else {
                    final boolean b = p2.getResources().getConfiguration().getLayoutDirection() == 1;
                    final float c3 = ((jin)o).c(floatValue2, (float)((kkz)((jin)o).c).d);
                    for (final Map.Entry<jio, V> entry : ((nnx)g2).s()) {
                        final jbm a5 = jbm.a;
                        final jiq a6 = jiq.a;
                        switch (entry.getKey().ordinal()) {
                            default: {
                                continue;
                            }
                            case 3: {
                                if (c3 >= ((jin)o).c(4.0f, (float)((kkz)((jin)o).c).d) || c3 == ((jin)o).c((float)((kkz)((jin)o).d).d, (float)((kkz)((jin)o).c).d)) {
                                    ((jin)o).h(p2, entry.getKey());
                                    p2.k().setText((CharSequence)((jin)o).f(b, floatValue2, true));
                                    continue;
                                }
                                continue;
                            }
                            case 2: {
                                if (c3 >= ((jin)o).c(((jin)o).e(jio.c, (jbm)((jin)o).a.aQ()), (float)((kkz)((jin)o).c).d) && ((jin)o).j(floatValue2) && c3 <= ((jin)o).c((float)((kkz)((jin)o).d).d, (float)((kkz)((jin)o).c).d)) {
                                    ((jin)o).h(p2, entry.getKey());
                                    p2.j().setText((CharSequence)((jin)o).f(b, floatValue2, true));
                                    continue;
                                }
                                continue;
                            }
                            case 1: {
                                if (c3 >= ((jin)o).c(((jin)o).e(jio.b, (jbm)((jin)o).a.aQ()), (float)((kkz)((jin)o).c).d) && c3 < ((jin)o).c(((jin)o).e(jio.c, (jbm)((jin)o).a.aQ()), (float)((kkz)((jin)o).c).d) && c3 < ((jin)o).c((float)((kkz)((jin)o).d).d, (float)((kkz)((jin)o).c).d)) {
                                    ((jin)o).h(p2, entry.getKey());
                                    p2.m().setText((CharSequence)((jin)o).f(b, floatValue2, true));
                                    continue;
                                }
                                continue;
                            }
                            case 0: {
                                if (c3 < ((jin)o).c(((jin)o).e(jio.b, (jbm)((jin)o).a.aQ()), (float)((kkz)((jin)o).c).d)) {
                                    ((jin)o).h(p2, entry.getKey());
                                    p2.l().setText((CharSequence)((jin)o).f(b, floatValue2, true));
                                    continue;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            this.F = f;
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    final void r() {
        final ViewGroup b = this.B;
        if (b != null) {
            if (this.w) {
                b.removeCallbacks(this.e);
                return;
            }
            b.removeCallbacks(this.f);
        }
    }
    
    public final void s(final boolean b) {
        if (this.w && !this.x) {
            return;
        }
        if (b) {
            this.A.reverse();
            return;
        }
        this.B.setVisibility(8);
    }
    
    public final void t() {
        this.B(this.F);
    }
    
    public final void u() {
        if (this.w && !this.x) {
            final ZoomUi p = this.p;
            synchronized (ZoomUi.a) {
                final int l = p.l;
                p.l = 1;
                final SeekBar g = p.g();
                final int dimensionPixelSize = p.getResources().getDimensionPixelSize(2131166437);
                int dimensionPixelSize2;
                if (p.k) {
                    dimensionPixelSize2 = p.getResources().getDimensionPixelSize(2131166450);
                }
                else {
                    dimensionPixelSize2 = 0;
                }
                final int n = (int)(p.getResources().getDimensionPixelSize(2131166469) * p.e);
                final int dimensionPixelSize3 = p.getResources().getDimensionPixelSize(2131166444);
                final int dimensionPixelSize4 = p.getResources().getDimensionPixelSize(2131166443);
                final int n2 = (dimensionPixelSize4 - dimensionPixelSize) / 2;
                final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)g.getLayoutParams();
                layoutParams.width = (int)(dimensionPixelSize3 * p.e);
                layoutParams.height = dimensionPixelSize4;
                g.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                g.setMax(100000);
                g.setPaddingRelative(n, dimensionPixelSize2 + n2, n, n2 - dimensionPixelSize2);
                if (p.e().getHeight() != dimensionPixelSize || p.e().getBackground() == null) {
                    final AnimatorSet s = p.s(l, false);
                    ((Animator)s).addListener((Animator$AnimatorListener)new jiw(p));
                    final ObjectAnimator a = ZoomUi.a((View)p.b(), false);
                    final ObjectAnimator a2 = ZoomUi.a((View)p.f(), false);
                    a2.addListener((Animator$AnimatorListener)new jix(p));
                    final ObjectAnimator a3 = ZoomUi.a((View)p.n(), true);
                    a3.addListener((Animator$AnimatorListener)new jiy(p));
                    p.i = new AnimatorSet();
                    p.i.play((Animator)a).with((Animator)a2);
                    p.i.play((Animator)s).after((Animator)a);
                    p.i.play((Animator)a3).after((Animator)s);
                    final AnimatorSet j = p.j;
                    if (j != null && j.isRunning()) {
                        p.j.cancel();
                    }
                    p.i.start();
                }
                monitorexit(ZoomUi.a);
                this.r();
                this.w();
            }
        }
    }
    
    public final void v() {
        if (!this.x) {
            this.u();
            this.A.start();
        }
    }
    
    public final void w() {
        final ViewGroup b = this.B;
        if (b == null) {
            return;
        }
        int n;
        if (this.w && !this.D) {
            n = b.getResources().getInteger(2131492990);
        }
        else {
            n = b.getResources().getInteger(2131492989);
        }
        int n2 = n;
        if (this.v.k(cxr.aI)) {
            n2 = n * 10;
        }
        if (this.w) {
            this.B.postDelayed(this.e, (long)n2);
            return;
        }
        this.B.postDelayed(this.f, (long)n2);
    }
    
    public final void x() {
        if (this.i.getAccessibilityLiveRegion() != 0) {
            this.i.postDelayed((Runnable)new jju(this), (long)this.B.getResources().getInteger(2131492986));
        }
    }
    
    public final void z(final int n, final float n2, final float n3) {
        this.z.I(n, n2, n3, this.g.e());
    }
}
