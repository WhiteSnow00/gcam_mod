import android.widget.TextView;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.Map;
import android.content.Context;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqw implements irc, ird, iqr
{
    public static final nsd a;
    public final EnumMap b;
    public final EnumMap c;
    ModeSwitcher d;
    MoreModesGrid e;
    public final ivj f;
    public boolean g;
    public final kse h;
    public final cxl i;
    private niz j;
    private boolean k;
    private final Context l;
    private final oui m;
    private final kjm n;
    private final oui o;
    private final pii p;
    private final iqx q;
    private final kjk r;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/modeswitcher/ModeSwitcherControllerImpl");
    }
    
    public iqw(final Context l, final kjk r, final Map map, final ModeSwitcher d, final MoreModesGrid e, final ivj f, final cxl i, final oui o, final oui m, final pii p12, final kjm n, final kse h) {
        final EnumMap b = new EnumMap((Class<K>)jbm.class);
        this.b = b;
        this.c = new EnumMap((Class<K>)jbm.class);
        this.j = nii.a;
        this.k = false;
        this.g = false;
        final iqu iqu = new iqu();
        this.q = iqu;
        this.l = l;
        this.r = r;
        this.d = d;
        this.e = e;
        this.f = f;
        this.i = i;
        this.o = o;
        this.p = p12;
        this.m = m;
        this.n = n;
        this.h = h;
        final boolean k = i.k(cxr.at);
        final iql c = d.c;
        if (!(c.g = k)) {
            c.i = c.getResources().getColor(2131100951);
            c.j = c.getResources().getColor(2131100953);
            c.k = c.getResources().getColor(2131100946);
            c.a().setColor(c.k);
        }
        e.g = i.k(cxr.at);
        d.j = iqu;
        d.b = this;
        b.putAll(map);
        final Iterator iterator = b.keySet().iterator();
        while (iterator.hasNext()) {
            this.h((jbm)iterator.next());
        }
    }
    
    private final boolean y(final jbm jbm) {
        return this.c.get(jbm) == this.d;
    }
    
    @Override
    public final jbq a() {
        return this.d.c.a();
    }
    
    @Override
    public final jbq b() {
        return new iqj(this.d.c);
    }
    
    @Override
    public final jbq c() {
        return new iqj(this.d.c, 2);
    }
    
    @Override
    public final krc d() {
        this.o(false);
        return new iqs(this, 1);
    }
    
    @Override
    public final krc e() {
        this.p(4);
        return new iqs(this);
    }
    
    @Override
    public final void f(final jbm jbm) {
        this.k = false;
        if (this.j.g()) {
            ((ird)this.j.c()).f(jbm);
        }
    }
    
    @Override
    public final void g(final jbm jbm) {
        this.k = true;
        if (this.j.g()) {
            ((ird)this.j.c()).g(jbm);
        }
    }
    
    public final void h(final jbm jbm) {
        final klj klj = this.b.get(jbm);
        if (klj != null) {
            this.r.c(klj.a(new iqt(this, jbm), odx.a));
        }
    }
    
    @Override
    public final void i(final jbm jbm) {
        njo.i(this.v(jbm) ^ true, "Mode %s already configured in More Modes", jbm);
        this.c.put(jbm, this.d);
        this.d.c(jbm);
        this.r(jbm);
    }
    
    public final void j(final jbm jbm) {
        njo.i(this.y(jbm) ^ true, "Mode %s already configured in mode list", jbm);
        final MoreModesGrid e = this.e;
        e.getClass();
        this.c.put(jbm, e);
        final MoreModesGrid e2 = this.e;
        kjm.a();
        final jbm a = jbm.a;
        final boolean b = false;
        njo.e(jbm != a, "UNINITIALIZED is not a valid mode");
        njo.e(jbm != jbm.p || b, "Cannot append MORE_MODES mode");
        e2.b.add(new irb(jbm));
        if (!e2.f) {
            e2.f = true;
            e2.requestLayout();
        }
        this.r(jbm);
    }
    
    @Override
    public final void k(final jbm k) {
        njo.d(this.y(jbm.p) ^ true);
        this.d.c(jbm.p);
        this.c.put(jbm.p, this.d);
        final ModeSwitcher d = this.d;
        k.getClass();
        d.k = k;
        final boolean e = d.e;
        final jbm i = d.k;
        final iql c = d.c;
        c.l = i;
        c.p = 2;
        c.c.isEmpty();
        d.setEnabled(d.e = true);
    }
    
    @Override
    public final void l() {
        final ModeSwitcher d = this.d;
        if (d != null) {
            jdz.a(4, (View)d);
        }
    }
    
    @Override
    public final void m(final boolean b) {
        final MoreModesGrid e = this.e;
        if (e != null) {
            if (b) {
                final boolean k = this.k;
                njo.e(true, "use hideImmediately to transition without animation");
                e.h.cancel();
                e.l = true;
                final AnimatorSet h = new AnimatorSet();
                if (k ^ true) {
                    ObjectAnimator objectAnimator;
                    if (e.d == jcb.b) {
                        objectAnimator = ObjectAnimator.ofFloat((Object)e, View.TRANSLATION_Y, new float[] { e.getTranslationY(), -e.k });
                    }
                    else if (e.d == jcb.c) {
                        objectAnimator = ObjectAnimator.ofFloat((Object)e, View.TRANSLATION_Y, new float[] { e.getTranslationY(), e.k });
                    }
                    else {
                        objectAnimator = ObjectAnimator.ofFloat((Object)e, View.TRANSLATION_X, new float[] { e.getTranslationX(), e.k });
                    }
                    ((Animator)objectAnimator).setInterpolator((TimeInterpolator)new DecelerateInterpolator());
                    h.playTogether(new Animator[] { (Animator)objectAnimator, e.a() });
                }
                else {
                    h.play(e.a());
                }
                h.setDuration((long)e.j);
                h.addListener((Animator$AnimatorListener)new ira(e));
                h.start();
                e.h = (Animator)h;
                return;
            }
            e.h.cancel();
            e.setAlpha(0.0f);
            Label_0297: {
                float i;
                if (e.d == jcb.b) {
                    i = -e.k;
                }
                else {
                    if (e.d != jcb.c) {
                        e.setTranslationX(e.k);
                        break Label_0297;
                    }
                    i = e.k;
                }
                e.setTranslationY(i);
            }
            e.setVisibility(8);
            e.l = false;
        }
    }
    
    @Override
    public final void n(final jbm jbm, final boolean b) {
        if (this.y(jbm)) {
            this.d.g(jbm, b);
            return;
        }
        if (this.i.k(cwv.H)) {
            if (jbm.equals(jbm.n) || jbm.equals(jbm.f)) {
                this.d.g(jbm.c, b);
                return;
            }
        }
        if (this.g && !this.v(jbm) && jbm != jbm.r) {
            final String value = String.valueOf(jbm);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 24);
            sb.append("Mode ");
            sb.append(value);
            sb.append(" is not configured.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
    
    @Override
    public final void o(final boolean b) {
        final ModeSwitcher d = this.d;
        if (d != null) {
            d.setEnabled(b);
            this.e.setEnabled(b);
        }
    }
    
    public final void p(final int importantForAccessibility) {
        this.d.setImportantForAccessibility(importantForAccessibility);
    }
    
    @Override
    public final void q(final ird ird) {
        this.j = niz.i(ird);
        this.d.i = this;
        this.e.m = niz.i(this);
    }
    
    public final void r(final jbm jbm) {
        final klj klj = this.b.get(jbm);
        final iqy iqy = this.c.get(jbm);
        if (klj != null && iqy != null) {
            final klj klj2 = this.b.get(jbm);
            boolean b = false;
            if (klj2 != null && !(boolean)klj2.aQ()) {
                b = true;
            }
            iqy.i(jbm, b);
        }
    }
    
    @Override
    public final void s(final eyt eyt) {
        this.d.h = eyt;
        this.e.e = eyt;
    }
    
    @Override
    public final void t() {
        final ModeSwitcher d = this.d;
        if (d != null) {
            d.e(true, false);
            jdz.a(0, (View)this.d);
        }
    }
    
    @Override
    public final void u() {
        final MoreModesGrid e = this.e;
        if (e != null) {
            e.b();
            if (!this.g) {
                ((iyh)this.p).a();
                final boolean a = ((isa)this.o.get()).a(this.l);
                final isa isa = (isa)this.o.get();
                final Context l = this.l;
                final boolean k = isa.a.k(cxr.an);
                boolean b = false;
                if (k) {
                    final orl orl = new orl(l.getPackageManager());
                    if (orl.c(orl.b(), "com.google.vr.apps.ornament.measure.MeasureMainActivity")) {
                        b = isa.b(orl);
                    }
                }
                final isa isa2 = (isa)this.o.get();
                final boolean c = isa.c(this.l);
                final cxl i = this.i;
                final cxo a2 = cxy.a;
                i.e();
                ofi.w(((iov)this.m.get()).a(), new iqv(this, a, c, b), this.n);
            }
        }
    }
    
    public final boolean v(final jbm jbm) {
        return this.c.get(jbm) == this.e;
    }
    
    @Override
    public final void w(final float n, int n2) {
        final ModeSwitcher d = this.d;
        try {
            final iql c = d.c;
            final int n3 = 0;
            njo.d(n <= 1.0f);
            final TextView h = c.h;
            h.getClass();
            final int indexOfChild = c.indexOfChild((View)h);
            if (indexOfChild < 0) {
                n2 = n3;
            }
            else {
                if (n2 != 1) {
                    n2 = 1;
                }
                else {
                    n2 = -1;
                }
                final TextView textView = (TextView)c.getChildAt(indexOfChild + n2);
                n2 = (h.getLeft() + h.getRight()) / 2;
                if (textView != null) {
                    n2 += Math.round(((textView.getLeft() + textView.getRight()) / 2 - n2) * n);
                }
            }
            d.f(n2, true);
        }
        finally {
            final Throwable t;
            a.k(ModeSwitcher.a.b(), "Working around b/110351942: %s", t, '\u0b3a');
        }
    }
    
    @Override
    public final void x(final boolean b) {
        this.d.e(b, true);
    }
}
