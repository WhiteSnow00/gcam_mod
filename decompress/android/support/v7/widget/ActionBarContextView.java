// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.view.View$MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.MotionEvent;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View;

public class ActionBarContextView extends nt
{
    public CharSequence g;
    public CharSequence h;
    public View i;
    public boolean j;
    private View k;
    private View l;
    private LinearLayout m;
    private TextView n;
    private TextView o;
    private int p;
    private int q;
    private int r;
    
    public ActionBarContextView(final Context context) {
        this(context, null);
    }
    
    public ActionBarContextView(final Context context, final AttributeSet set) {
        this(context, set, 2130968608);
    }
    
    public ActionBarContextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final to q = to.q(context, set, lo.d, n);
        ik.G((View)this, q.h(0));
        this.p = q.f(5, 0);
        this.q = q.f(4, 0);
        this.e = q.e(3, 0);
        this.r = q.f(2, 2131623941);
        q.n();
    }
    
    private final void o() {
        if (this.m == null) {
            LayoutInflater.from(this.getContext()).inflate(2131623936, (ViewGroup)this);
            final LinearLayout m = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.m = m;
            this.n = (TextView)m.findViewById(2131427388);
            this.o = (TextView)this.m.findViewById(2131427387);
            if (this.p != 0) {
                this.n.setTextAppearance(this.getContext(), this.p);
            }
            if (this.q != 0) {
                this.o.setTextAppearance(this.getContext(), this.q);
            }
        }
        this.n.setText(this.g);
        this.o.setText(this.h);
        final boolean empty = TextUtils.isEmpty(this.g);
        final boolean empty2 = TextUtils.isEmpty(this.h);
        final TextView o = this.o;
        final int n = 8;
        int visibility;
        if (!empty2) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        o.setVisibility(visibility);
        final LinearLayout i = this.m;
        int visibility2;
        if (!(empty ^ true)) {
            if (empty2 ^ true) {
                visibility2 = 0;
            }
            else {
                visibility2 = n;
            }
        }
        else {
            visibility2 = 0;
        }
        i.setVisibility(visibility2);
        if (this.m.getParent() == null) {
            this.addView((View)this.m);
        }
    }
    
    @Override
    public final void d(final int e) {
        this.e = e;
    }
    
    protected final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -2);
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(this.getContext(), set);
    }
    
    public final void h(final lu lu) {
        final View i = this.i;
        if (i == null) {
            this.addView(this.i = LayoutInflater.from(this.getContext()).inflate(this.r, (ViewGroup)this, false));
        }
        else if (i.getParent() == null) {
            this.addView(this.i);
        }
        (this.k = this.i.findViewById(2131427404)).setOnClickListener((View$OnClickListener)new nv(lu));
        final Menu a = lu.a();
        final og d = this.d;
        if (d != null) {
            d.n();
        }
        (this.d = new og(this.getContext())).p();
        final ViewGroup$LayoutParams viewGroup$LayoutParams = new ViewGroup$LayoutParams(-2, -1);
        ((mv)a).h(this.d, this.b);
        final og d2 = this.d;
        final nl f = d2.f;
        if (d2.f == null) {
            (d2.f = (nl)d2.d.inflate(2131623939, (ViewGroup)this, false)).a(d2.c);
            d2.i();
        }
        final nl f2 = d2.f;
        if (f != f2) {
            ((ActionMenuView)f2).k(d2);
        }
        ik.G((View)(this.c = (ActionMenuView)f2), null);
        this.addView((View)this.c, viewGroup$LayoutParams);
    }
    
    public final void i() {
        this.removeAllViews();
        this.l = null;
        this.c = null;
        this.d = null;
        final View k = this.k;
        if (k != null) {
            k.setOnClickListener((View$OnClickListener)null);
        }
    }
    
    public final void j(final View l) {
        final View i = this.l;
        if (i != null) {
            this.removeView(i);
        }
        if ((this.l = l) != null) {
            final LinearLayout m = this.m;
            if (m != null) {
                this.removeView((View)m);
                this.m = null;
            }
        }
        if (l != null) {
            this.addView(l);
        }
        this.requestLayout();
    }
    
    public final void k(final CharSequence h) {
        this.h = h;
        this.o();
    }
    
    public final void l(final CharSequence g) {
        this.g = g;
        this.o();
    }
    
    public final void m(final boolean j) {
        if (j != this.j) {
            this.requestLayout();
        }
        this.j = j;
    }
    
    public final void n() {
        final og d = this.d;
        if (d != null) {
            d.m();
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final og d = this.d;
        if (d != null) {
            d.k();
            this.d.q();
        }
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource((View)this);
            accessibilityEvent.setClassName((CharSequence)this.getClass().getName());
            accessibilityEvent.setPackageName((CharSequence)this.getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }
    
    protected final void onLayout(final boolean b, int paddingLeft, int n, final int n2, int n3) {
        final boolean b2 = ue.b((View)this);
        int paddingLeft2;
        if (b2) {
            paddingLeft2 = n2 - paddingLeft - this.getPaddingRight();
        }
        else {
            paddingLeft2 = this.getPaddingLeft();
        }
        final int paddingTop = this.getPaddingTop();
        final int n4 = n3 - n - this.getPaddingTop() - this.getPaddingBottom();
        final View i = this.i;
        n = paddingLeft2;
        if (i != null) {
            n = paddingLeft2;
            if (i.getVisibility() != 8) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.i.getLayoutParams();
                if (b2) {
                    n = viewGroup$MarginLayoutParams.rightMargin;
                }
                else {
                    n = viewGroup$MarginLayoutParams.leftMargin;
                }
                if (b2) {
                    n3 = viewGroup$MarginLayoutParams.leftMargin;
                }
                else {
                    n3 = viewGroup$MarginLayoutParams.rightMargin;
                }
                n = nt.a(paddingLeft2, n, b2);
                n = nt.a(n + nt.g(this.i, n, paddingTop, n4, b2), n3, b2);
            }
        }
        final LinearLayout m = this.m;
        n3 = n;
        if (m != null) {
            n3 = n;
            if (this.l == null) {
                n3 = n;
                if (m.getVisibility() != 8) {
                    n3 = n + nt.g((View)this.m, n, paddingTop, n4, b2);
                }
            }
        }
        final View l = this.l;
        if (l != null) {
            nt.g(l, n3, paddingTop, n4, b2);
        }
        if (b2) {
            paddingLeft = this.getPaddingLeft();
        }
        else {
            paddingLeft = n2 - paddingLeft - this.getPaddingRight();
        }
        final ActionMenuView c = this.c;
        if (c != null) {
            nt.g((View)c, paddingLeft, paddingTop, n4, b2 ^ true);
        }
    }
    
    protected final void onMeasure(int i, int n) {
        final int mode = View$MeasureSpec.getMode(i);
        final int n2 = 1073741824;
        if (mode != 1073741824) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        }
        if (View$MeasureSpec.getMode(n) == 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(this.getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
        final int size = View$MeasureSpec.getSize(i);
        i = this.e;
        int size2;
        if ((size2 = i) <= 0) {
            size2 = View$MeasureSpec.getSize(n);
        }
        final int n3 = this.getPaddingTop() + this.getPaddingBottom();
        i = size - this.getPaddingLeft() - this.getPaddingRight();
        final int n4 = size2 - n3;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(n4, Integer.MIN_VALUE);
        final View j = this.i;
        n = i;
        if (j != null) {
            i = nt.f(j, i, measureSpec);
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.i.getLayoutParams();
            n = i - (viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin);
        }
        final ActionMenuView c = this.c;
        i = n;
        if (c != null) {
            i = n;
            if (c.getParent() == this) {
                i = nt.f((View)this.c, n, measureSpec);
            }
        }
        final LinearLayout m = this.m;
        final int n5 = 0;
        n = i;
        if (m != null) {
            n = i;
            if (this.l == null) {
                if (this.j) {
                    n = View$MeasureSpec.makeMeasureSpec(0, 0);
                    this.m.measure(n, measureSpec);
                    final int measuredWidth = this.m.getMeasuredWidth();
                    if (measuredWidth <= i) {
                        n = i - measuredWidth;
                    }
                    else {
                        n = i;
                    }
                    final LinearLayout k = this.m;
                    if (measuredWidth > i) {
                        i = 8;
                    }
                    else {
                        i = 0;
                    }
                    k.setVisibility(i);
                }
                else {
                    n = nt.f((View)m, i, measureSpec);
                }
            }
        }
        final View l = this.l;
        if (l != null) {
            final ViewGroup$LayoutParams layoutParams = l.getLayoutParams();
            if (layoutParams.width != -2) {
                i = 1073741824;
            }
            else {
                i = Integer.MIN_VALUE;
            }
            int min = n;
            if (layoutParams.width >= 0) {
                min = Math.min(layoutParams.width, n);
            }
            if (layoutParams.height != -2) {
                n = n2;
            }
            else {
                n = Integer.MIN_VALUE;
            }
            int min2 = n4;
            if (layoutParams.height >= 0) {
                min2 = Math.min(layoutParams.height, n4);
            }
            this.l.measure(View$MeasureSpec.makeMeasureSpec(min, i), View$MeasureSpec.makeMeasureSpec(min2, n));
        }
        if (this.e <= 0) {
            final int childCount = this.getChildCount();
            int n6 = 0;
            int n7;
            for (i = n5; i < childCount; ++i, n6 = n) {
                n7 = this.getChildAt(i).getMeasuredHeight() + n3;
                if (n7 > (n = n6)) {
                    n = n7;
                }
            }
            this.setMeasuredDimension(size, n6);
            return;
        }
        this.setMeasuredDimension(size, size2);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
