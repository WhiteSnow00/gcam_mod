import android.view.View$AccessibilityDelegate;
import android.widget.LinearLayout;
import android.support.constraint.ConstraintLayout;
import java.util.concurrent.Executor;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.text.format.DateUtils;
import j$.time.Duration;
import android.view.accessibility.AccessibilityManager;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.app.Activity;
import android.widget.TextView;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imy implements ims
{
    private static final imr g;
    public final cxl a;
    public ElapsedTimerView b;
    public TextView c;
    public TextView d;
    public long e;
    public long f;
    private final Activity h;
    private final kjm i;
    private final klv j;
    private imr k;
    private Resources l;
    private ViewGroup m;
    private View n;
    private int o;
    private krc p;
    
    static {
        g = imr.a().a();
    }
    
    public imy(final Activity h, final cxl a, final kjm i, final klv j) {
        this.k = imy.g;
        this.h = h;
        this.a = a;
        this.i = i;
        this.j = j;
    }
    
    private final void l(final ViewGroup viewGroup, final int n) {
        if (viewGroup != this.m) {
            viewGroup.removeView((View)this.b);
            this.m.addView((View)this.b);
        }
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.b.getLayoutParams();
        layoutParams.bottomMargin = this.o;
        layoutParams.topMargin = this.o;
        layoutParams.gravity = (n | 0x1);
        this.b.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private final void m() {
        this.c.setCompoundDrawablesWithIntrinsicBounds(2131231315, 0, 0, 0);
    }
    
    @Override
    public final void a(final boolean b) {
        try (final krc p = this.p) {}
        if (b) {
            this.b.animate().setDuration(200L).setStartDelay(0L).alpha(0.0f).withEndAction((Runnable)new imu(this, 1));
        }
        else {
            this.b.animate().cancel();
            this.b.setAlpha(0.0f);
            this.b.setVisibility(8);
            this.k();
        }
        this.k = imy.g;
        this.j.aR(false);
        if (((AccessibilityManager)this.h.getSystemService("accessibility")).isTouchExplorationEnabled()) {
            this.n.setFocusable(true);
            this.n.setImportantForAccessibility(1);
        }
    }
    
    @Override
    public final void b() {
        if (!this.a.k(cwv.H)) {
            this.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        this.c.setText((CharSequence)this.l.getString(2131952787, new Object[] { DateUtils.formatElapsedTime(Duration.ofMillis(this.e).getSeconds()) }));
    }
    
    @Override
    public final void c() {
        this.c.setText((CharSequence)DateUtils.formatElapsedTime(Duration.ofMillis(this.e).getSeconds()));
        if (!this.a.k(cwv.H)) {
            this.m();
        }
    }
    
    @Override
    public final void d(final imr k) {
        this.k = k;
    }
    
    @Override
    public final void e() {
        final int dimensionPixelSize = this.l.getDimensionPixelSize(2131166327);
        this.d.setTextSize(0, (float)this.l.getDimensionPixelSize(2131165437));
        int tint = this.l.getColor(2131099829, (Resources$Theme)null);
        if (!this.a.k(cxr.at)) {
            tint = this.l.getColor(2131099830, (Resources$Theme)null);
            gu.c(this.d.getContext(), 2131296290, new imx(this));
            this.d.setTextColor(tint);
        }
        final Drawable drawable = this.l.getDrawable(2131231549, (Resources$Theme)null);
        drawable.setTint(tint);
        final imr k = this.k;
        Drawable drawable2;
        if (k.b) {
            drawable2 = this.l.getDrawable(2131231493, (Resources$Theme)null);
        }
        else if (k.c.aQ()) {
            final cxl a = this.a;
            final cxo a2 = cwv.a;
            a.e();
            drawable2 = this.l.getDrawable(2131231580, (Resources$Theme)null);
        }
        else if (this.k.d.aQ()) {
            drawable2 = this.l.getDrawable(2131231165, (Resources$Theme)null);
        }
        else {
            drawable2 = null;
        }
        if (drawable2 != null) {
            drawable2.setTint(tint);
        }
        this.d.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.d.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable)null, drawable2, (Drawable)null);
        final TextView c = this.c;
        c.setPadding(c.getPaddingLeft(), 0, 0, 0);
        this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
        this.d.setVisibility(0);
    }
    
    @Override
    public final void f() {
        final imr k = this.k;
        this.p = klq.b(k.c, k.d).a(new imt(this), this.i);
        this.h(0L);
        if (this.m != null) {
            final jcb a = jcb.a(this.b.getDisplay(), this.b.getContext());
            final ViewGroup viewGroup = (ViewGroup)this.b.getParent();
            switch (a.ordinal()) {
                case 2: {
                    this.l(viewGroup, 48);
                    break;
                }
                case 1: {
                    this.l(viewGroup, 80);
                    break;
                }
                case 0:
                case 3: {
                    viewGroup.removeView((View)this.b);
                    final ViewGroup viewGroup2 = (ViewGroup)this.h.findViewById(2131427411);
                    viewGroup2.addView((View)this.b);
                    this.b.bringToFront();
                    final ct ct = new ct();
                    final ConstraintLayout constraintLayout = (ConstraintLayout)viewGroup2;
                    ct.d(constraintLayout);
                    final int[] array = new int[2];
                    this.n.getLocationInWindow(array);
                    ct.e(this.b.getId(), 3, 0, 3, array[1] + this.n.getHeight() / 2 - this.l.getDimensionPixelSize(2131166326) / 2);
                    ct.e(this.b.getId(), 6, 0, 6, 0);
                    ct.e(this.b.getId(), 7, 0, 7, 0);
                    ct.b(constraintLayout);
                    break;
                }
            }
        }
        this.j();
        if (this.a.k(cwv.H)) {
            this.g(0L);
        }
        else {
            this.m();
        }
        this.b.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction((Runnable)new imu(this));
        this.j.aR(true);
        if (((AccessibilityManager)this.h.getSystemService("accessibility")).isTouchExplorationEnabled()) {
            this.n.setFocusable(false);
            this.n.setImportantForAccessibility(2);
        }
    }
    
    @Override
    public final void g(final long f) {
        this.f = f;
        final String formatElapsedTime = DateUtils.formatElapsedTime(Duration.ofMillis(f).getSeconds());
        final TextView d = this.d;
        d.getClass();
        d.setText((CharSequence)formatElapsedTime);
    }
    
    @Override
    public final void h(final long e) {
        this.e = e;
        this.c.setText((CharSequence)DateUtils.formatElapsedTime(Duration.ofMillis(e).getSeconds()));
    }
    
    @Override
    public final void i(final LinearLayout linearLayout) {
        this.l = linearLayout.getResources();
        final ElapsedTimerView b = (ElapsedTimerView)linearLayout;
        this.b = b;
        (this.c = b.b()).setCompoundDrawablePadding(this.l.getDimensionPixelSize(2131165746));
        this.d = this.b.a();
        if (this.a.k(cwv.H)) {
            this.d.setCompoundDrawablePadding(this.l.getDimensionPixelSize(2131165746));
        }
        this.o = this.l.getDimensionPixelSize(2131166203);
        final ViewGroup viewGroup = (ViewGroup)linearLayout.getRootView();
        ViewGroup viewGroup2;
        if ((viewGroup2 = (ViewGroup)viewGroup.findViewById(2131427471)) == null) {
            viewGroup2 = viewGroup;
        }
        this.m = (ViewGroup)viewGroup2.findViewById(2131428112);
        this.n = viewGroup.findViewById(2131427775);
        linearLayout.setAccessibilityDelegate((View$AccessibilityDelegate)new imv(this));
    }
    
    public final void j() {
        if (!this.a.k(cwv.H)) {
            this.b.setBackground(this.l.getDrawable(2131231084, (Resources$Theme)null));
            this.c.setTextSize(0, (float)this.l.getDimensionPixelSize(2131165750));
            return;
        }
        final Drawable drawable = this.l.getDrawable(2131231072, (Resources$Theme)null);
        int n = this.l.getColor(2131099829, (Resources$Theme)null);
        if (!this.a.k(cxr.at)) {
            n = this.l.getColor(2131099830, (Resources$Theme)null);
            this.c.setTextColor(n);
            gu.c(this.c.getContext(), 2131296290, new imw(this));
            drawable.setTint(this.l.getColor(2131100838, (Resources$Theme)null));
        }
        this.b.setBackground(drawable);
        final int dimensionPixelSize = this.l.getDimensionPixelSize(2131166327);
        this.c.setTextSize(0, (float)this.l.getDimensionPixelSize(2131165437));
        this.c.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        final imr k = this.k;
        Drawable drawable2;
        if (k.b) {
            drawable2 = this.l.getDrawable(2131231493, (Resources$Theme)null);
        }
        else if (k.c.aQ()) {
            this.a.e();
            drawable2 = this.l.getDrawable(2131231580, (Resources$Theme)null);
        }
        else if (this.k.d.aQ()) {
            drawable2 = this.l.getDrawable(2131231165, (Resources$Theme)null);
        }
        else {
            drawable2 = null;
        }
        if (drawable2 != null) {
            drawable2.setTint(n);
        }
        if (this.k.a) {
            this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
            this.e();
            return;
        }
        this.c.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, drawable2, (Drawable)null);
        this.k();
    }
    
    public final void k() {
        this.d.setVisibility(8);
        this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
    }
}
