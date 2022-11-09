import java.util.List;
import android.support.constraint.ConstraintLayout;
import android.graphics.drawable.InsetDrawable;
import android.content.res.Resources$Theme;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.GestureDetector$OnGestureListener;
import j$.lang.Iterable$_EL;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import j$.util.function.Function;
import j$.util.Collection$_EL;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.util.TypedValue;
import android.animation.Animator;
import j$.util.function.Consumer;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ValueAnimator;
import java.util.Collection;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.content.Context;
import android.view.GestureDetector;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htf implements hsw
{
    public final boolean a;
    public final hkc b;
    public GestureDetector c;
    public irz d;
    public jcb e;
    public Runnable f;
    public hqi g;
    private final boolean h;
    private final Context i;
    private final BottomBarController j;
    private final cxl k;
    private final RoundedThumbnailView l;
    private final hkd m;
    private final hti n;
    private AnimatorSet o;
    private ArrayList p;
    private FrameLayout q;
    private hsi r;
    private hsv s;
    private View t;
    private int u;
    
    public htf(final boolean h, final boolean a, final Context i, final BottomBarController j, final cxl k, final RoundedThumbnailView l, final hkc b, final hkd m, final hti n) {
        this.e = jcb.a;
        this.u = 1;
        this.h = h;
        this.a = a;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.b = b;
        this.m = m;
        this.n = n;
        this.p = new ArrayList();
    }
    
    private final void l(final nns nns) {
        final AnimatorSet o = this.o;
        if (o != null && o.isRunning()) {
            this.o.cancel();
        }
        (this.o = new AnimatorSet()).playTogether((Collection)nns);
        this.o.start();
    }
    
    @Override
    public final oey a() {
        final ofn f = ofn.f();
        final int u = this.u;
        if (u == 0) {
            throw null;
        }
        if (u == 2) {
            f.o(Boolean.FALSE);
            return f;
        }
        this.u = 2;
        final hsi r = this.r;
        r.a.resetTransition();
        r.setOnClickListener(r.b);
        r.setContentDescription((CharSequence)r.getContext().getString(2131951675));
        Animator animator;
        if (this.k.k(cxr.aE) && !(boolean)this.b.c(hjq.z) && !this.h) {
            final hsv s = this.s;
            final hsy hsy = new hsy(f);
            animator = s.d();
            final int c = s.c();
            final int a = s.a(2131166294);
            final ValueAnimator valueAnimator = (ValueAnimator)animator;
            valueAnimator.setIntValues(new int[] { 0, c + a });
            valueAnimator.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
            valueAnimator.addListener(jvh.e((Consumer)new hso(s, hsy)));
        }
        else {
            animator = this.s.d();
            animator.addListener(jvh.e((Consumer)new htb(f)));
        }
        animator.addListener(jvh.f((Consumer)new hsz(this, 2)));
        animator.start();
        return f;
    }
    
    @Override
    public final void b(final ArrayList p) {
        this.p = p;
        final hsv s = this.s;
        final ArrayList b = s.b;
        final int size = b.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final hsn hsn = (hsn)b.get(i);
            final hsk c = s.c;
            kjm.a();
            c.a.remove(hsn);
            s.removeView((View)hsn);
        }
        s.b.clear();
        for (int size2 = p.size(), j = n; j < size2; ++j) {
            final hsn hsn2 = new hsn(this.i, ((htl)p.get(j)).a, this.h);
            final TypedValue typedValue = new TypedValue();
            hsn2.getContext().getTheme().resolveAttribute(16843868, typedValue, true);
            hsn2.setBackgroundResource(typedValue.resourceId);
            if (hsn2.b) {
                final Drawable drawable = hsn2.getContext().getDrawable(2131231625);
                drawable.getClass();
                hsn2.setImageDrawable(drawable);
            }
            else {
                final auw b2 = auf.c(hsn2.getContext()).c().d(hsn2.d.loadIcon(hsn2.getContext().getPackageManager())).b(bho.a());
                final int dimensionPixelSize = hsn2.getContext().getResources().getDimensionPixelSize(2131166295);
                ((auw)b2.t(dimensionPixelSize, dimensionPixelSize)).j((ImageView)hsn2);
                if (hsn2.d.activityInfo.packageName.equals(hsn2.getContext().getPackageName())) {
                    hsn2.setContentDescription(hsn2.d.loadLabel(hsn2.e));
                }
                else {
                    hsn2.setContentDescription((CharSequence)hsn.a(hsn2.d, hsn2.e, hsn2.getContext().getResources()));
                }
            }
            hsn2.setVisibility(8);
            hsn2.setOnClickListener((View$OnClickListener)new hsl(hsn2, this.g));
            hsn2.setOnTouchListener((View$OnTouchListener)new hsx(this, 1));
            hsn2.setRotation((float)jvu.p(this.e));
            final hsv s2 = this.s;
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
            linearLayout$LayoutParams.gravity = 1;
            if (s2.b.isEmpty()) {
                s2.c.a(hsn2);
            }
            s2.b.add(hsn2);
            s2.addView((View)hsn2, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        }
    }
    
    @Override
    public final void c(final boolean b) {
        final int u = this.u;
        if (u == 0) {
            throw null;
        }
        if (u == 1) {
            return;
        }
        this.u = 1;
        this.j.setSocialShareState(false);
        if (b) {
            final nnn e = nns.e();
            final hsv s = this.s;
            final int height = s.getHeight();
            final int f = s.f;
            if (f != 0) {
                int b2;
                if (f == 2) {
                    b2 = s.b();
                }
                else {
                    b2 = 0;
                }
                final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { height, b2 });
                if (s.f == 1) {
                    ofInt.setDuration(jdz.a.toMillis());
                }
                else {
                    ofInt.setDuration(s.a.toMillis());
                }
                ofInt.addListener(jvh.f((Consumer)new hsu(s, 1)));
                ofInt.addListener(jvh.e((Consumer)new hsu(s)));
                ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hss(s, 1));
                e.g(ofInt);
                Collection$_EL.stream((Collection)this.s.b).map((Function)hsc.d).forEachOrdered((Consumer)new hta(e));
                if (u == 3) {
                    final hti n = this.n;
                    n.a.setVisibility(0);
                    final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)n.a, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.ALPHA, new float[] { n.a.getAlpha(), 1.0f }) });
                    ofPropertyValuesHolder.setDuration(n.b.toMillis());
                    e.g(ofPropertyValuesHolder);
                }
                this.l(e.f());
                return;
            }
            throw null;
        }
        else {
            final hsv s2 = this.s;
            s2.setVisibility(8);
            s2.f(false);
            final int f2 = s2.f;
            if (f2 != 0) {
                int b3;
                if (f2 == 2) {
                    b3 = s2.b();
                }
                else {
                    b3 = 0;
                }
                final ViewGroup$LayoutParams layoutParams = s2.getLayoutParams();
                layoutParams.height = b3;
                if (s2.f == 1) {
                    s2.setAlpha(0.0f);
                }
                s2.setLayoutParams(layoutParams);
                Iterable$_EL.forEach((Iterable)this.s.b, (Consumer)cbc.g);
                final hti n2 = this.n;
                n2.a.setAlpha(1.0f);
                n2.a.setVisibility(0);
                return;
            }
            throw null;
        }
    }
    
    @Override
    public final void d(final View t) {
        this.t = t;
        this.c = new GestureDetector(this.i, (GestureDetector$OnGestureListener)new hte(this));
        final htd r = new htd(this, this.i);
        this.r = r;
        r.a = new TransitionDrawable(new Drawable[] { r.a(2131231577), r.a(2131231572) });
        final TypedValue typedValue = new TypedValue();
        r.getContext().getTheme().resolveAttribute(16843868, typedValue, true);
        r.setBackgroundResource(typedValue.resourceId);
        r.setImageDrawable((Drawable)r.a);
        this.r.setOnTouchListener((View$OnTouchListener)new hsx(this));
        (this.d = new irz(this.i, (View)this.r, this.k.k(cxr.at))).c(0, 0, this.i.getResources().getDimensionPixelSize(2131166296));
        final hsv s = new hsv(this.i, this.h);
        this.s = s;
        final GradientDrawable d = new GradientDrawable();
        d.setShape(0);
        d.setColor(s.getContext().getResources().getColor(2131101452, (Resources$Theme)null));
        s.d = d;
        final int a = s.a(2131166301);
        final int a2 = s.a(2131166296);
        final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(a + (a2 + a2), -2);
        s.setOrientation(layoutParams.gravity = 1);
        s.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        s.setBackground((Drawable)new InsetDrawable((Drawable)s.d, s.a(2131166296), 0, s.a(2131166296), 0));
        s.setGravity(48);
        s.setVisibility(8);
        final hsv s2 = this.s;
        final hsi r2 = this.r;
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
        linearLayout$LayoutParams.gravity = 1;
        s2.e = r2;
        s2.c.a(r2);
        s2.addView((View)r2, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        (this.q = (FrameLayout)t.findViewById(2131427986)).addView((View)this.s);
        this.l.setOnTouchListener((View$OnTouchListener)new hsx(this, 2));
    }
    
    @Override
    public final void e() {
        this.n.b((ConstraintLayout)this.t.findViewById(2131427987));
    }
    
    @Override
    public final void f(final jcb jcb) {
        this.e = jcb;
        final hti n = this.n;
        n.c = jcb;
        if (n.a.getParent() == n.d) {
            n.a((View)n.a);
            jvu.s((View)n.a, jcb);
        }
        Collection$_EL.stream((Collection)this.s.b).forEachOrdered((Consumer)new hsp(jcb));
    }
    
    @Override
    public final void g() {
        Iterable$_EL.forEach((Iterable)this.s.b, (Consumer)cbc.h);
    }
    
    @Override
    public final void h() {
        final ArrayList list = new ArrayList();
        final ArrayList p = this.p;
        for (int size = p.size(), i = 0; i < size; ++i) {
            final htl htl = (htl)p.get(i);
            if (!htl.c) {
                list.add(htl.a.activityInfo.packageName);
            }
        }
        Iterable$_EL.forEach((Iterable)this.s.b, (Consumer)new htc(list));
    }
    
    @Override
    public final void i(final Runnable f) {
        this.f = f;
        final int u = this.u;
        if (u == 0) {
            throw null;
        }
        if (u == 3) {
            f.run();
            return;
        }
        this.u = 3;
        this.m.d(hjq.z, true);
        this.j.setSocialShareState(true);
        final hsi r = this.r;
        r.a.setCrossFadeEnabled(true);
        r.a.startTransition(0);
        r.setOnClickListener(r.c);
        r.setContentDescription((CharSequence)r.getContext().getString(2131951662));
        final hsv s = this.s;
        s.setAlpha(1.0f);
        s.h(2);
        final hsk c = s.c;
        kjm.a();
        final ArrayList a = c.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final hsj hsj = (hsj)a.get(i);
            if (hsj != null) {
                hsj.c();
            }
        }
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { s.getHeight(), s.a(2131166300) + s.a(2131166297) * s.b.size() + s.a(2131166292) + s.a(2131166293) });
        ofInt.setDuration(s.a.toMillis());
        ofInt.addListener(jvh.f((Consumer)new hsu(s, 2)));
        ofInt.addListener(jvh.e((Consumer)new hsu(s, 3)));
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new hss(s));
        ((Animator)ofInt).addListener(jvh.f((Consumer)new hsz(this, 1)));
        ((Animator)ofInt).addListener(jvh.e((Consumer)new hsz(this)));
        final nnn e = nns.e();
        e.g(ofInt);
        Collection$_EL.stream((Collection)this.s.b).map((Function)hsc.c).forEachOrdered((Consumer)new hta(e));
        final hti n = this.n;
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)n.a, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.ALPHA, new float[] { n.a.getAlpha(), 0.0f }) });
        ofPropertyValuesHolder.addListener(jvh.e((Consumer)new hth(n)));
        ofPropertyValuesHolder.setDuration(n.b.toMillis());
        e.g(ofPropertyValuesHolder);
        this.l(e.f());
    }
    
    @Override
    public final void j(final hqi hqi) {
        this.g = hqi;
        final hsi r = this.r;
        if (r != null) {
            r.d = hqi;
            r.b = (View$OnClickListener)new hsg(hqi, 1);
            r.c = (View$OnClickListener)new hsg(hqi);
            r.setOnClickListener(r.b);
        }
    }
    
    public final void k() {
        final cr layoutParams = (cr)this.q.getLayoutParams();
        final int f = this.s.f;
        if (f != 0) {
            if (f == 1) {
                layoutParams.bottomMargin = this.l.getHeight() / 2;
            }
            else {
                layoutParams.bottomMargin = this.l.getHeight() / 2 - this.i.getResources().getDimensionPixelSize(2131166220) / 2;
            }
            this.q.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            this.q.requestLayout();
            return;
        }
        throw null;
    }
}
