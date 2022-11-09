import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ngg extends LinearLayout
{
    public ValueAnimator a;
    public int b;
    public float c;
    public final /* synthetic */ TabLayout d;
    
    public ngg(final TabLayout d, final Context context) {
        this.d = d;
        super(context);
        this.b = -1;
        this.setWillNotDraw(false);
    }
    
    private final void c() {
        final View child = this.getChildAt(this.b);
        final TabLayout d = this.d;
        final Drawable i = d.i;
        final RectF j = nov.J(d, child);
        i.setBounds((int)j.left, i.getBounds().top, (int)j.right, i.getBounds().bottom);
    }
    
    public final void a(final View view, final View view2, final float n) {
        if (view != null && view.getWidth() > 0) {
            final TabLayout d = this.d;
            d.w.a(d, view, view2, n, d.i);
        }
        else {
            final Drawable i = this.d.i;
            i.setBounds(-1, i.getBounds().top, -1, this.d.i.getBounds().bottom);
        }
        ik.z((View)this);
    }
    
    public final void b(final boolean b, final int n, final int n2) {
        final View child = this.getChildAt(this.b);
        final View child2 = this.getChildAt(n);
        if (child2 == null) {
            this.c();
            return;
        }
        final nge nge = new nge(this, child, child2);
        if (b) {
            final ValueAnimator a = new ValueAnimator();
            (this.a = a).setInterpolator(ncj.a);
            a.setDuration((long)n2);
            a.setFloatValues(new float[] { 0.0f, 1.0f });
            a.addUpdateListener((ValueAnimator$AnimatorUpdateListener)nge);
            a.addListener((Animator$AnimatorListener)new ngf(this, n));
            a.start();
            return;
        }
        this.a.removeAllUpdateListeners();
        this.a.addUpdateListener((ValueAnimator$AnimatorUpdateListener)nge);
    }
    
    public final void draw(final Canvas canvas) {
        int n;
        if ((n = this.d.i.getBounds().height()) < 0) {
            n = this.d.i.getIntrinsicHeight();
        }
        final int q = this.d.q;
        int n2 = 0;
        switch (q) {
            default: {
                n = 0;
                break;
            }
            case 3: {
                n = this.getHeight();
                break;
            }
            case 2: {
                break;
            }
            case 1: {
                n2 = (this.getHeight() - n) / 2;
                n = (this.getHeight() + n) / 2;
                break;
            }
            case 0: {
                n2 = this.getHeight() - n;
                n = this.getHeight();
                break;
            }
        }
        if (this.d.i.getBounds().width() > 0) {
            final Rect bounds = this.d.i.getBounds();
            this.d.i.setBounds(bounds.left, n2, bounds.right, n);
            final TabLayout d = this.d;
            final Drawable i = d.i;
            final int j = d.j;
            if (j != 0) {
                i.setTint(j);
            }
            i.draw(canvas);
        }
        super.draw(canvas);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final ValueAnimator a = this.a;
        if (a != null && a.isRunning()) {
            this.b(false, this.b, -1);
            return;
        }
        this.c();
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (View$MeasureSpec.getMode(n) != 1073741824) {
            return;
        }
        final TabLayout d = this.d;
        if (d.o == 1 || d.r == 2) {
            final int childCount = this.getChildCount();
            final int n3 = 0;
            int i = 0;
            int width = 0;
            while (i < childCount) {
                final View child = this.getChildAt(i);
                int max = width;
                if (child.getVisibility() == 0) {
                    max = Math.max(width, child.getMeasuredWidth());
                }
                ++i;
                width = max;
            }
            if (width <= 0) {
                return;
            }
            final int n4 = (int)neq.a(this.getContext(), 16);
            if (width * childCount <= this.getMeasuredWidth() - (n4 + n4)) {
                boolean b = false;
                for (int j = n3; j < childCount; ++j) {
                    final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.getChildAt(j).getLayoutParams();
                    if (linearLayout$LayoutParams.width != width || linearLayout$LayoutParams.weight != 0.0f) {
                        linearLayout$LayoutParams.width = width;
                        linearLayout$LayoutParams.weight = 0.0f;
                        b = true;
                    }
                }
                if (!b) {
                    return;
                }
            }
            else {
                final TabLayout d2 = this.d;
                d2.o = 0;
                d2.k(false);
            }
            super.onMeasure(n, n2);
        }
    }
}
