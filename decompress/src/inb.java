import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.text.format.DateUtils;
import j$.time.Duration;
import android.widget.LinearLayout;
import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import android.app.Activity;
import com.google.android.apps.camera.ui.elapsedtimeui.LongPressElapsedTimeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inb implements ims
{
    public LongPressElapsedTimeView a;
    private final Activity b;
    private final ims c;
    private final hkc d;
    private ElapsedTimerView e;
    private ViewGroup f;
    private Resources g;
    private final int[] h;
    private int i;
    private final boolean j;
    private final int k;
    
    public inb(final Activity b, final ims c, final hkc d, final cxl cxl) {
        this.h = new int[2];
        this.b = b;
        this.c = c;
        this.d = d;
        this.j = cxl.k(cxw.n);
        this.k = (int)cxl.a(cxw.a).c();
    }
    
    private final void k(final ViewGroup viewGroup, final int n) {
        if (viewGroup != this.f) {
            final LongPressElapsedTimeView a = this.a;
            if (a != null) {
                viewGroup.removeView((View)a);
                this.f.addView((View)this.a);
            }
        }
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.a.getLayoutParams();
        layoutParams.bottomMargin = this.i;
        layoutParams.topMargin = this.i;
        layoutParams.gravity = (n | 0x1);
        this.a.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private final void l(final ct ct, final View view) {
        this.b.findViewById(2131427450).getLocationInWindow(this.h);
        ct.e(view.getId(), 3, 0, 3, this.h[1] - this.g.getDimensionPixelSize(2131166326) - this.g.getDimensionPixelOffset(2131165752));
        ct.e(view.getId(), 6, 0, 6, 0);
        ct.e(view.getId(), 7, 0, 7, 0);
    }
    
    @Override
    public final void a(final boolean b) {
        if (!this.j) {
            this.c.a(b);
            return;
        }
        if (b) {
            final LongPressElapsedTimeView a = this.a;
            a.removeCallbacks(a.d);
            this.a.animate().setDuration(200L).setStartDelay(0L).alpha(0.0f).withEndAction((Runnable)new ina(this, 1));
            return;
        }
        this.a.animate().cancel();
        this.a.setAlpha(0.0f);
        this.a.setVisibility(8);
    }
    
    @Override
    public final void b() {
        this.c.b();
    }
    
    @Override
    public final void c() {
        this.c.c();
    }
    
    @Override
    public final void d(final imr imr) {
    }
    
    @Override
    public final void f() {
        jcb jcb;
        if (this.j) {
            jcb = jcb.a(this.a.getDisplay(), this.a.getContext());
        }
        else {
            jcb = jcb.a(this.e.getDisplay(), this.e.getContext());
        }
        if (jcb.d(jcb)) {
            LinearLayout linearLayout;
            if (this.j) {
                linearLayout = this.a;
            }
            else {
                linearLayout = this.e;
            }
            ((ViewGroup)linearLayout.getParent()).removeView((View)linearLayout);
            final ViewGroup viewGroup = (ViewGroup)this.b.findViewById(2131427411);
            viewGroup.addView((View)linearLayout);
            linearLayout.bringToFront();
            final ct ct = new ct();
            final ConstraintLayout constraintLayout = (ConstraintLayout)viewGroup;
            ct.d(constraintLayout);
            if (hbk.b((int)this.d.c(hjq.d)) == 1) {
                if (this.d.c(hjq.k)) {
                    this.l(ct, (View)linearLayout);
                }
                else {
                    final View viewById = this.b.findViewById(2131427949);
                    viewById.getLocationInWindow(this.h);
                    ct.e(((View)linearLayout).getId(), 3, 0, 3, this.h[1] + viewById.getHeight() / 2 - this.g.getDimensionPixelSize(2131166139) - this.g.getDimensionPixelSize(2131166326) - this.g.getDimensionPixelOffset(2131165752));
                    ct.e(((View)linearLayout).getId(), 6, 0, 6, 0);
                    ct.e(((View)linearLayout).getId(), 7, 0, 7, 0);
                }
            }
            else {
                this.l(ct, (View)linearLayout);
            }
            ct.b(constraintLayout);
            this.h(0L);
            this.j();
            linearLayout.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction((Runnable)new imz(linearLayout));
        }
        else if (this.j) {
            this.h(0L);
            if (this.f != null) {
                final jcb a = jcb.a(this.a.getDisplay(), this.a.getContext());
                final ViewGroup viewGroup2 = (ViewGroup)this.a.getParent();
                switch (a.ordinal()) {
                    case 2: {
                        this.k(viewGroup2, 48);
                        break;
                    }
                    case 1: {
                        this.k(viewGroup2, 80);
                        break;
                    }
                }
            }
            this.j();
            this.a.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction((Runnable)new ina(this));
        }
        else {
            this.c.f();
        }
        if (this.j) {
            final LongPressElapsedTimeView a2 = this.a;
            switch (this.k) {
                case 2: {
                    a2.d.run();
                    return;
                }
                case 1: {
                    a2.c.startAnimation(a2.b);
                    return;
                }
                case 0: {
                    a2.c.startAnimation(a2.a);
                }
            }
        }
    }
    
    @Override
    public final void g(final long n) {
    }
    
    @Override
    public final void h(final long n) {
        if (this.j) {
            this.a.b().setText((CharSequence)DateUtils.formatElapsedTime(Duration.ofMillis(n).getSeconds()));
            return;
        }
        this.c.h(n);
    }
    
    @Override
    public final void i(final LinearLayout linearLayout) {
        if (this.j) {
            this.a = (LongPressElapsedTimeView)linearLayout;
        }
        else {
            this.e = (ElapsedTimerView)linearLayout;
        }
        this.g = linearLayout.getResources();
        if (this.j) {
            ViewGroup viewGroup = (ViewGroup)this.a.getRootView();
            final ViewGroup viewGroup2 = (ViewGroup)viewGroup.findViewById(2131427471);
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            }
            this.f = (ViewGroup)viewGroup.findViewById(2131428112);
            this.i = this.g.getDimensionPixelSize(2131166203);
        }
    }
    
    public final void j() {
        if (this.j) {
            this.a.setBackground(this.g.getDrawable(2131231084, (Resources$Theme)null));
            final int dimensionPixelSize = this.g.getDimensionPixelSize(2131165757);
            final int dimensionPixelSize2 = this.g.getDimensionPixelSize(2131166327);
            this.a.b().setTextSize(0, (float)dimensionPixelSize);
            this.a.b().setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            this.a.b().setCompoundDrawablesWithIntrinsicBounds(2131231315, 0, 0, 0);
            this.a.a().setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
            this.a.a().setVisibility(8);
            return;
        }
        this.e.setBackground(this.g.getDrawable(2131231084, (Resources$Theme)null));
        final int dimensionPixelSize3 = this.g.getDimensionPixelSize(2131165750);
        final int dimensionPixelSize4 = this.g.getDimensionPixelSize(2131166327);
        this.e.b().setTextSize(0, (float)dimensionPixelSize3);
        this.e.b().setPadding(dimensionPixelSize4, 0, dimensionPixelSize4, 0);
        this.e.b().setCompoundDrawablesWithIntrinsicBounds(2131231315, 0, 0, 0);
        this.e.a().setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
        this.e.a().setVisibility(8);
    }
}
