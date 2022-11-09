// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager2.widget;

import android.os.Bundle;
import android.view.Gravity;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.WindowInsets;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Parcelable;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;

public final class ViewPager2 extends ViewGroup
{
    static boolean a;
    private static final ix m;
    public ago b;
    public int c;
    public LinearLayoutManager d;
    public RecyclerView e;
    public rr f;
    public ags g;
    public ago h;
    public boolean i;
    public int j;
    public afo k;
    public aah l;
    private final Rect n;
    private final Rect o;
    private int p;
    private Parcelable q;
    private agp r;
    private agq s;
    
    static {
        ViewPager2.a = true;
        m = hh.e(new iq((byte[])null));
    }
    
    public ViewPager2(final Context context) {
        super(context);
        this.n = new Rect();
        this.o = new Rect();
        this.b = new ago();
        this.l = new aah();
        this.p = -1;
        this.i = true;
        this.j = -1;
        this.g(context, null);
    }
    
    public ViewPager2(final Context context, final AttributeSet set) {
        super(context, set);
        this.n = new Rect();
        this.o = new Rect();
        this.b = new ago();
        this.l = new aah();
        this.p = -1;
        this.i = true;
        this.j = -1;
        this.g(context, set);
    }
    
    public ViewPager2(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.n = new Rect();
        this.o = new Rect();
        this.b = new ago();
        this.l = new aah();
        this.p = -1;
        this.i = true;
        this.j = -1;
        this.g(context, set);
    }
    
    public ViewPager2(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.n = new Rect();
        this.o = new Rect();
        this.b = new ago();
        this.l = new aah();
        this.p = -1;
        this.i = true;
        this.j = -1;
        this.g(context, set);
    }
    
    private final void g(final Context context, final AttributeSet set) {
        afo k;
        if (ViewPager2.a) {
            k = new agy(this);
        }
        else {
            k = new agv(this);
        }
        this.k = k;
        (this.e = new aha(this, context)).setId(ik.c());
        this.e.setDescendantFocusability(131072);
        final agw d = new agw(this);
        this.d = d;
        this.e.Q(d);
        final RecyclerView e = this.e;
        e.C = ViewConfiguration.get(e.getContext()).getScaledPagingTouchSlop();
        Object a = context.obtainStyledAttributes(set, agl.a);
        ik.E((View)this, context, agl.a, set, (TypedArray)a, 0, 0);
        try {
            this.d.R(((TypedArray)a).getInt(0, 0));
            this.k.m();
            ((TypedArray)a).recycle();
            this.e.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
            final RecyclerView e2 = this.e;
            final acw acw = new acw();
            if (e2.v == null) {
                e2.v = new ArrayList();
            }
            e2.v.add(acw);
            this.g = new ags(this);
            this.r = new agp(this.g);
            final agz agz = new agz(this);
            this.f = agz;
            a = this.e;
            final RecyclerView a2 = agz.a;
            if (a2 != a) {
                if (a2 != null) {
                    a2.ak(agz.b);
                    agz.a.D = null;
                }
                agz.a = (RecyclerView)a;
                final RecyclerView a3 = agz.a;
                if (a3 != null) {
                    if (a3.D != null) {
                        throw new IllegalStateException("An instance of OnFlingListener already set.");
                    }
                    a3.aj(agz.b);
                    final RecyclerView a4 = agz.a;
                    a4.D = agz;
                    final Scroller scroller = new Scroller(a4.getContext(), (Interpolator)new DecelerateInterpolator());
                    agz.f();
                }
            }
            this.e.aj(this.g);
            final ago ago = new ago();
            this.h = ago;
            this.g.e = ago;
            final agt agt = new agt(this);
            final agu agu = new agu(this);
            this.h.g(agt);
            this.h.g(agu);
            this.k.r(this.e);
            this.h.g(this.b);
            final agq s = new agq();
            this.s = s;
            this.h.g(s);
            final RecyclerView e3 = this.e;
            this.attachViewToParent((View)e3, 0, e3.getLayoutParams());
        }
        finally {
            ((TypedArray)a).recycle();
        }
    }
    
    public final int a() {
        return this.d.i;
    }
    
    public final rw b() {
        return this.e.k;
    }
    
    public final void c() {
        if (this.p == -1) {
            return;
        }
        final rw b = this.b();
        if (b == null) {
            return;
        }
        if (this.q != null) {
            if (b instanceof agm) {
                ((agm)b).b();
            }
            this.q = null;
        }
        final int max = Math.max(0, Math.min(this.p, b.a() - 1));
        this.c = max;
        this.p = -1;
        this.e.O(max);
        this.k.i();
    }
    
    public final boolean canScrollHorizontally(final int n) {
        return this.e.canScrollHorizontally(n);
    }
    
    public final boolean canScrollVertically(final int n) {
        return this.e.canScrollVertically(n);
    }
    
    public final boolean d() {
        return this.d.ak() == 1;
    }
    
    protected final void dispatchRestoreInstanceState(final SparseArray sparseArray) {
        final Parcelable parcelable = (Parcelable)sparseArray.get(this.getId());
        if (parcelable instanceof ahb) {
            final int a = ((ahb)parcelable).a;
            sparseArray.put(this.e.getId(), (Object)sparseArray.get(a));
            sparseArray.remove(a);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        this.c();
    }
    
    public final void e() {
        final ags a = this.r.a;
    }
    
    public final void f(int n) {
        final rw b = this.b();
        if (b == null) {
            if (this.p != -1) {
                this.p = Math.max(n, 0);
            }
            return;
        }
        if (b.a() <= 0) {
            return;
        }
        final int min = Math.min(Math.max(n, 0), b.a() - 1);
        if (min == this.c && this.g.h()) {
            return;
        }
        n = this.c;
        if (min != n) {
            double n2 = n;
            this.c = min;
            this.k.l();
            if (!this.g.h()) {
                final ags g = this.g;
                g.g();
                final agr c = g.c;
                final double n3 = c.a;
                final double n4 = c.b;
                Double.isNaN(n3);
                Double.isNaN(n4);
                n2 = n3 + n4;
            }
            final ags g2 = this.g;
            g2.a = 2;
            n = g2.d;
            g2.d = min;
            g2.f(2);
            if (n != min) {
                g2.e(min);
            }
            final double n5 = min;
            Double.isNaN(n5);
            if (Math.abs(n5 - n2) > 3.0) {
                final RecyclerView e = this.e;
                if (n5 > n2) {
                    n = min - 3;
                }
                else {
                    n = min + 3;
                }
                e.O(n);
                final RecyclerView e2 = this.e;
                e2.post((Runnable)new ahc(min, e2));
                return;
            }
            this.e.T(min);
        }
    }
    
    public final CharSequence getAccessibilityClassName() {
        if (this.k.n()) {
            return this.k.c();
        }
        return super.getAccessibilityClassName();
    }
    
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        final WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets.isConsumed()) {
            return onApplyWindowInsets;
        }
        for (int childCount = this.e.getChildCount(), i = 0; i < childCount; ++i) {
            this.e.getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(onApplyWindowInsets));
        }
        final ix m = ViewPager2.m;
        if (m.n() != null) {
            windowInsets = m.n();
        }
        else {
            windowInsets = windowInsets.consumeSystemWindowInsets().consumeStableInsets();
        }
        return windowInsets;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.k.f(accessibilityNodeInfo);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int measuredWidth = this.e.getMeasuredWidth();
        final int measuredHeight = this.e.getMeasuredHeight();
        this.n.left = this.getPaddingLeft();
        this.n.right = n3 - n - this.getPaddingRight();
        this.n.top = this.getPaddingTop();
        this.n.bottom = n4 - n2 - this.getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.n, this.o);
        this.e.layout(this.o.left, this.o.top, this.o.right, this.o.bottom);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.measureChild((View)this.e, n, n2);
        final int measuredWidth = this.e.getMeasuredWidth();
        final int measuredHeight = this.e.getMeasuredHeight();
        final int measuredState = this.e.getMeasuredState();
        this.setMeasuredDimension(resolveSizeAndState(Math.max(measuredWidth + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, measuredState), resolveSizeAndState(Math.max(measuredHeight + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, measuredState << 16));
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof ahb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final ahb ahb = (ahb)parcelable;
        super.onRestoreInstanceState(ahb.getSuperState());
        this.p = ahb.b;
        this.q = ahb.c;
    }
    
    protected final Parcelable onSaveInstanceState() {
        final ahb ahb = new ahb(super.onSaveInstanceState());
        ahb.a = this.e.getId();
        int b;
        if ((b = this.p) == -1) {
            b = this.c;
        }
        ahb.b = b;
        final Parcelable q = this.q;
        if (q != null) {
            ahb.c = q;
        }
        else {
            final rw k = this.e.k;
            if (k instanceof agm) {
                ahb.c = ((agm)k).a();
            }
        }
        return (Parcelable)ahb;
    }
    
    public final void onViewAdded(final View view) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }
    
    public final boolean performAccessibilityAction(final int n, final Bundle bundle) {
        if (this.k.q(n)) {
            this.k.t(n);
            return true;
        }
        return super.performAccessibilityAction(n, bundle);
    }
    
    public final void setLayoutDirection(final int layoutDirection) {
        super.setLayoutDirection(layoutDirection);
        this.k.k();
    }
}
