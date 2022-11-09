import android.view.View$MeasureSpec;
import android.util.Size;
import java.util.Iterator;
import android.graphics.Canvas;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TypeEvaluator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.view.View;
import android.content.Context;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iql extends LinearLayout
{
    public static final nsd a;
    private static final jbx q;
    public final nlf b;
    public final HashMap c;
    public final EnumSet d;
    public final EnumMap e;
    public boolean f;
    public boolean g;
    public TextView h;
    public int i;
    public int j;
    public int k;
    public jbm l;
    public final Drawable m;
    public Animator n;
    public niz o;
    public int p;
    private Animator r;
    private final int s;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/modeswitcher/ModeList");
        q = new jbx();
    }
    
    public iql(final Context context) {
        super(context);
        this.b = new nmi(jbm.class);
        this.c = new HashMap();
        this.d = EnumSet.noneOf(jbm.class);
        this.e = new EnumMap((Class<K>)jbm.class);
        this.p = 1;
        this.o = nii.a;
        kjm.a();
        final Resources resources = context.getResources();
        this.setVisibility(4);
        this.setAlpha(0.0f);
        this.i = neu.c((View)this, 2130968865);
        this.j = neu.c((View)this, 2130968871);
        this.k = neu.c((View)this, 2130968900);
        this.s = resources.getInteger(2131492962);
        (this.m = this.getContext().getResources().getDrawable(2131231371, (Resources$Theme)null)).setVisible(true, true);
        this.a().setColor(this.k);
    }
    
    private static Rect e(final TextView textView) {
        return new Rect(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
    }
    
    private final void f(final TextView h) {
        final TextView h2 = this.h;
        if (h2 != null) {
            h2.setSelected(false);
            this.g(this.h, false);
        }
        (this.h = h).setSelected(true);
        this.g(this.h, true);
    }
    
    private final void g(final TextView textView, final boolean b) {
        if (textView != null) {
            String contentDescription;
            if (b) {
                contentDescription = textView.getText().toString();
            }
            else {
                final jbm jbm = ((nkc)this.b).b.get(textView);
                jbm.getClass();
                contentDescription = jbk.b(jbm).c(this.getContext().getResources());
            }
            textView.setContentDescription((CharSequence)contentDescription);
        }
    }
    
    final jbq a() {
        return new iqj(this, 1);
    }
    
    public final void b(final jbm jbm, final boolean b) {
        kjm.a();
        if (this.b.isEmpty()) {
            return;
        }
        final TextView textView = this.b.get(jbm);
        final boolean b2 = textView != null;
        final String value = String.valueOf(jbm);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 40);
        sb.append("attempted to activate non-existent mode ");
        sb.append(value);
        njo.e(b2, sb.toString());
        if (textView.getWidth() == 0) {
            return;
        }
        if (this.h != textView) {
            if (b) {
                this.d(jbm);
            }
            else {
                final Animator n = this.n;
                if (n != null) {
                    n.end();
                }
                final TextView h = this.h;
                if (h != null) {
                    h.setTextColor(this.j);
                }
                textView.setTextColor(this.i);
                this.m.setBounds(e(textView));
                this.f(textView);
                this.invalidate();
            }
        }
        textView.getText();
        textView.getLeft();
        textView.getRight();
        if (this.o.g()) {
            ((iqm)this.o.c()).a.f((textView.getLeft() + textView.getRight()) / 2, b);
        }
    }
    
    public final void c(final boolean b, final boolean b2) {
        if (b2) {
            final Animator r = this.r;
            if (r != null) {
                r.end();
            }
            ObjectAnimator r2;
            if (b) {
                r2 = ObjectAnimator.ofFloat((Object)this, "alpha", new float[] { 0.0f, 1.0f });
            }
            else {
                r2 = ObjectAnimator.ofFloat((Object)this, "alpha", new float[] { 1.0f, 0.0f });
            }
            r2.setDuration(217L);
            r2.setStartDelay(217L);
            r2.start();
            this.r = (Animator)r2;
            return;
        }
        float alpha;
        if (!b) {
            alpha = 0.0f;
        }
        else {
            alpha = 1.0f;
        }
        this.setAlpha(alpha);
    }
    
    public final void d(final jbm jbm) {
        final Animator n = this.n;
        if (n != null) {
            n.end();
        }
        final AnimatorSet n2 = new AnimatorSet();
        n2.setDuration((long)this.s);
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)this.m, "bounds", (TypeEvaluator)iql.q, new Object[] { this.m.getBounds(), e(this.b.get(jbm)) });
        ofObject.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new iqi(this));
        ofObject.setInterpolator((TimeInterpolator)new LinearInterpolator());
        final ObjectAnimator ofArgb = ObjectAnimator.ofArgb((Object)this.h, "textColor", new int[] { this.i, this.j });
        ofArgb.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        this.f(this.b.get(jbm));
        final ObjectAnimator ofArgb2 = ObjectAnimator.ofArgb((Object)this.h, "textColor", new int[] { this.j, this.i });
        ofArgb2.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        n2.play((Animator)ofObject).with((Animator)ofArgb2).with((Animator)ofArgb);
        this.invalidate();
        n2.start();
        this.n = (Animator)n2;
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (this.m.isVisible()) {
            this.m.draw(canvas);
            return;
        }
        a.l(iql.a.c(), "highlight chip is not visible", '\u0b24');
    }
    
    protected final void onLayout(final boolean b, int p5, final int n, final int n2, final int n3) {
        super.onLayout(b, p5, n, n2, n3);
        p5 = this.p;
        Label_0186: {
            if (p5 != 2 && p5 != 3) {
                break Label_0186;
            }
            kjm.a();
            monitorenter(this);
            try {
                EnumSet<Enum> copy;
                if (this.f) {
                    copy = EnumSet.copyOf((EnumSet<Enum>)this.d);
                    this.f = false;
                }
                else {
                    copy = null;
                }
                monitorexit(this);
                if (copy != null) {
                    for (final jbm jbm : this.b.keySet()) {
                        final boolean b2 = this.b.get(jbm).getForeground() != null;
                        final boolean contains = copy.contains(jbm);
                        if (b2 != contains) {
                            final irz irz = this.e.get(jbm);
                            if (irz == null) {
                                continue;
                            }
                            if (contains) {
                                irz.b();
                            }
                            else {
                                irz.a(true);
                            }
                        }
                    }
                }
                if (this.p == 2) {
                    njo.o(true);
                    final boolean b3 = ik.f((View)this) == 1;
                    final jbm l = this.l;
                    l.getClass();
                    this.b(l, b3);
                    if (this.isEnabled()) {
                        this.setVisibility(0);
                        this.c(true, false);
                    }
                    this.p = 3;
                }
                final TextView h = this.h;
                if (h != null) {
                    this.m.setBounds(e(h));
                }
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        kjm.a();
        final Size size = new Size(n, n2);
        iqk iqk;
        if ((iqk = this.c.get(size)) == null) {
            final iqk iqk2 = new iqk();
            final int n3 = 0;
            final int n4 = 0;
            int i = 0;
            int a = 0;
            int max = 0;
            while (i < this.getChildCount()) {
                a += this.getChildAt(i).getMeasuredWidth();
                max = Math.max(max, this.getChildAt(i).getMeasuredHeight());
                ++i;
            }
            iqk2.a = a;
            iqk2.b = max;
            final boolean b = a > 0 && max > 0;
            final int size2 = View$MeasureSpec.getSize(n);
            final int f = ik.f((View)this);
            int n5 = 0;
            Label_0302: {
                int c;
                int d;
                if (this.getChildCount() > 0) {
                    View view;
                    if (f == 1) {
                        view = this.getChildAt(this.getChildCount() - 1);
                    }
                    else {
                        view = this.getChildAt(0);
                    }
                    View view2;
                    if (f == 1) {
                        view2 = this.getChildAt(0);
                    }
                    else {
                        view2 = this.getChildAt(this.getChildCount() - 1);
                    }
                    if (view == null || view2 == null || view.getMeasuredWidth() <= 0 || view2.getMeasuredWidth() <= 0) {
                        n5 = n3;
                        break Label_0302;
                    }
                    c = (size2 - view.getMeasuredWidth()) / 2;
                    d = (size2 - view2.getMeasuredWidth()) / 2;
                }
                else {
                    d = 0;
                    c = n4;
                }
                iqk2.c = c;
                iqk2.d = d;
                n5 = 1;
            }
            if (b && n5 != 0) {
                this.c.put(size, iqk2);
                iqk = iqk2;
            }
            else {
                iqk = iqk2;
            }
        }
        this.setPadding(iqk.c, this.getPaddingTop(), iqk.d, this.getPaddingBottom());
        this.setMeasuredDimension(resolveSize(iqk.a + iqk.c + iqk.d, n), resolveSize(iqk.b, n2));
    }
}
