// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View$MeasureSpec;
import android.content.res.Configuration;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.accessibility.AccessibilityEvent;
import android.view.MenuItem;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;

public class ActionMenuView extends LinearLayoutCompat implements mu, nl
{
    public mv a;
    public boolean b;
    public og c;
    public mt d;
    public tp e;
    private Context i;
    private int j;
    private ni k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    
    public ActionMenuView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuView(final Context i, final AttributeSet set) {
        super(i, set);
        this.s();
        final float density = i.getResources().getDisplayMetrics().density;
        this.n = (int)(56.0f * density);
        this.o = (int)(density * 4.0f);
        this.i = i;
        this.j = 0;
    }
    
    public static final oj m() {
        final oj oj = new oj();
        oj.gravity = 16;
        return oj;
    }
    
    public static final oj n(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams != null) {
            oj oj;
            if (viewGroup$LayoutParams instanceof oj) {
                oj = new oj((oj)viewGroup$LayoutParams);
            }
            else {
                oj = new oj(viewGroup$LayoutParams);
            }
            if (oj.gravity <= 0) {
                oj.gravity = 16;
            }
            return oj;
        }
        return m();
    }
    
    @Override
    public final void a(final mv a) {
        this.a = a;
    }
    
    @Override
    public final boolean b(final my my) {
        return this.a.z((MenuItem)my, 0);
    }
    
    public final oj c(final AttributeSet set) {
        return new oj(this.getContext(), set);
    }
    
    @Override
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof oj;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    public final Menu g() {
        if (this.a == null) {
            final Context context = this.getContext();
            (this.a = new mv(context)).p(new ok(this));
            (this.c = new og(context)).p();
            final og c = this.c;
            ni k;
            if ((k = this.k) == null) {
                k = new oi();
            }
            c.e = k;
            this.a.h(this.c, this.i);
            this.c.j(this);
        }
        return (Menu)this.a;
    }
    
    public final void h() {
        final og c = this.c;
        if (c != null) {
            c.n();
        }
    }
    
    public final void i(final ni k, final mt d) {
        this.k = k;
        this.d = d;
    }
    
    public final void j(final int j) {
        if (this.j != j) {
            if ((this.j = j) == 0) {
                this.i = this.getContext();
                return;
            }
            this.i = (Context)new ContextThemeWrapper(this.getContext(), j);
        }
    }
    
    public final void k(final og c) {
        (this.c = c).j(this);
    }
    
    protected final boolean l(final int n) {
        boolean c = false;
        if (n == 0) {
            return false;
        }
        final View child = this.getChildAt(n - 1);
        final View child2 = this.getChildAt(n);
        if (n < this.getChildCount() && child instanceof oh) {
            c = ((oh)child).c();
        }
        if (n > 0 && child2 instanceof oh) {
            return ((oh)child2).d() | c;
        }
        return c;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final og c = this.c;
        if (c != null) {
            c.i();
            if (this.c.l()) {
                this.c.k();
                this.c.m();
            }
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h();
    }
    
    @Override
    protected final void onLayout(final boolean b, int n, int i, int j, int n2) {
        if (!this.l) {
            super.onLayout(b, n, i, j, n2);
            return;
        }
        final int childCount = this.getChildCount();
        final int n3 = (n2 - i) / 2;
        final int h = super.h;
        final int n4 = j - n;
        n2 = n4 - this.getPaddingRight() - this.getPaddingLeft();
        final boolean b2 = ue.b((View)this);
        j = 0;
        boolean b3 = false;
        i = 0;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            if (child.getVisibility() == 8) {
                n = n2;
            }
            else {
                final oj oj = (oj)child.getLayoutParams();
                if (oj.a) {
                    final int n5 = n = child.getMeasuredWidth();
                    if (this.l(j)) {
                        n = n5 + h;
                    }
                    final int measuredHeight = child.getMeasuredHeight();
                    int n6;
                    int n7;
                    if (b2) {
                        n6 = this.getPaddingLeft() + oj.leftMargin;
                        n7 = n6 + n;
                    }
                    else {
                        n7 = this.getWidth() - this.getPaddingRight() - oj.rightMargin;
                        n6 = n7 - n;
                    }
                    final int n8 = n3 - measuredHeight / 2;
                    child.layout(n6, n8, n7, measuredHeight + n8);
                    n = n2 - n;
                    b3 = true;
                }
                else {
                    n = n2 - (child.getMeasuredWidth() + oj.leftMargin + oj.rightMargin);
                    this.l(j);
                    ++i;
                }
            }
            ++j;
            n2 = n;
        }
        if (childCount == 1) {
            if (!b3) {
                final View child2 = this.getChildAt(0);
                i = child2.getMeasuredWidth();
                n = child2.getMeasuredHeight();
                j = n4 / 2 - i / 2;
                n2 = n3 - n / 2;
                child2.layout(j, n2, i + j, n + n2);
                return;
            }
            n = 1;
        }
        else {
            n = childCount;
        }
        i -= ((b3 ^ true) ? 1 : 0);
        if (i > 0) {
            i = n2 / i;
        }
        else {
            i = 0;
        }
        final int max = Math.max(0, i);
        if (b2) {
            n2 = this.getWidth() - this.getPaddingRight();
            View child3;
            oj oj2;
            int n9;
            int n10;
            for (i = 0; i < n; ++i, n2 = j) {
                child3 = this.getChildAt(i);
                oj2 = (oj)child3.getLayoutParams();
                j = n2;
                if (child3.getVisibility() != 8) {
                    j = n2;
                    if (!oj2.a) {
                        n9 = n2 - oj2.rightMargin;
                        n2 = child3.getMeasuredWidth();
                        j = child3.getMeasuredHeight();
                        n10 = n3 - j / 2;
                        child3.layout(n9 - n2, n10, n9, j + n10);
                        j = n9 - (n2 + oj2.leftMargin + max);
                    }
                }
            }
        }
        else {
            n2 = this.getPaddingLeft();
            View child4;
            oj oj3;
            int measuredWidth;
            int n11;
            for (i = 0; i < n; ++i, n2 = j) {
                child4 = this.getChildAt(i);
                oj3 = (oj)child4.getLayoutParams();
                j = n2;
                if (child4.getVisibility() != 8) {
                    j = n2;
                    if (!oj3.a) {
                        j = n2 + oj3.leftMargin;
                        measuredWidth = child4.getMeasuredWidth();
                        n2 = child4.getMeasuredHeight();
                        n11 = n3 - n2 / 2;
                        child4.layout(j, n11, j + measuredWidth, n2 + n11);
                        j += measuredWidth + oj3.rightMargin + max;
                    }
                }
            }
        }
    }
    
    @Override
    protected final void onMeasure(int i, int n) {
        final boolean l = this.l;
        int j;
        if (View$MeasureSpec.getMode(i) == 1073741824) {
            j = 1;
        }
        else {
            j = 0;
        }
        this.l = (j != 0);
        if ((l ? 1 : 0) != j) {
            this.m = 0;
        }
        final int size = View$MeasureSpec.getSize(i);
        if (this.l) {
            final mv a = this.a;
            if (a != null && size != this.m) {
                this.m = size;
                a.l(true);
            }
        }
        final int childCount = this.getChildCount();
        int n34;
        if (this.l) {
            if (childCount > 0) {
                final int mode = View$MeasureSpec.getMode(n);
                final int size2 = View$MeasureSpec.getSize(i);
                final int size3 = View$MeasureSpec.getSize(n);
                i = this.getPaddingLeft();
                final int paddingRight = this.getPaddingRight();
                final int n2 = this.getPaddingTop() + this.getPaddingBottom();
                final int childMeasureSpec = getChildMeasureSpec(n, n2, -2);
                final int n3 = size2 - (i + paddingRight);
                n = this.n;
                i = n3 / n;
                if (i == 0) {
                    this.setMeasuredDimension(n3, 0);
                    return;
                }
                final int n4 = n + n3 % n / i;
                final int childCount2 = this.getChildCount();
                int n5 = 0;
                int max = 0;
                int k = 0;
                boolean b = false;
                long n6 = 0L;
                int max2 = 0;
                int n7 = 0;
                n = size3;
                while (k < childCount2) {
                    final View child = this.getChildAt(k);
                    if (child.getVisibility() != 8) {
                        final boolean b2 = child instanceof ActionMenuItemView;
                        if (b2) {
                            final int o = this.o;
                            child.setPadding(o, 0, o, 0);
                        }
                        final oj oj = (oj)child.getLayoutParams();
                        oj.f = false;
                        oj.c = 0;
                        oj.b = 0;
                        oj.d = false;
                        oj.leftMargin = 0;
                        oj.rightMargin = 0;
                        oj.e = (b2 && ((ActionMenuItemView)child).b());
                        int n8;
                        if (!oj.a) {
                            n8 = i;
                        }
                        else {
                            n8 = 1;
                        }
                        final oj oj2 = (oj)child.getLayoutParams();
                        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(childMeasureSpec) - n2, View$MeasureSpec.getMode(childMeasureSpec));
                        ActionMenuItemView actionMenuItemView;
                        if (b2) {
                            actionMenuItemView = (ActionMenuItemView)child;
                        }
                        else {
                            actionMenuItemView = null;
                        }
                        final boolean b3 = actionMenuItemView != null && actionMenuItemView.b();
                        int b4;
                        if (n8 > 0 && (!b3 || n8 >= 2)) {
                            child.measure(View$MeasureSpec.makeMeasureSpec(n8 * n4, Integer.MIN_VALUE), measureSpec);
                            final int measuredWidth = child.getMeasuredWidth();
                            int n9 = measuredWidth / n4;
                            if (measuredWidth % n4 != 0) {
                                ++n9;
                            }
                            b4 = n9;
                            if (b3 && (b4 = n9) < 2) {
                                b4 = 2;
                            }
                        }
                        else {
                            b4 = 0;
                        }
                        oj2.d = (!oj2.a && b3);
                        oj2.b = b4;
                        child.measure(View$MeasureSpec.makeMeasureSpec(b4 * n4, 1073741824), measureSpec);
                        max2 = Math.max(max2, b4);
                        if (oj.d) {
                            ++n7;
                        }
                        b |= oj.a;
                        i -= b4;
                        max = Math.max(max, child.getMeasuredHeight());
                        long n10 = n6;
                        if (b4 == 1) {
                            n10 = (n6 | (long)(1 << k));
                        }
                        ++n5;
                        n6 = n10;
                    }
                    ++k;
                }
                boolean b5;
                if (b && n5 == 2) {
                    b5 = true;
                    n5 = 2;
                }
                else {
                    b5 = false;
                }
                final int n11 = 0;
                int n12 = i;
                i = n11;
                while (n7 > 0 && n12 > 0) {
                    int n13 = Integer.MAX_VALUE;
                    int n14 = 0;
                    int n15 = 0;
                    long n16 = 0L;
                    while (n14 < childCount2) {
                        final oj oj3 = (oj)this.getChildAt(n14).getLayoutParams();
                        int n17;
                        int n18;
                        long n19;
                        if (!oj3.d) {
                            n17 = n13;
                            n18 = n15;
                            n19 = n16;
                        }
                        else {
                            final int b6 = oj3.b;
                            if (b6 < n13) {
                                n19 = 1L << n14;
                                n17 = b6;
                                n18 = 1;
                            }
                            else {
                                n17 = n13;
                                n18 = n15;
                                n19 = n16;
                                if (b6 == n13) {
                                    n19 = (n16 | 1L << n14);
                                    n18 = n15 + 1;
                                    n17 = n13;
                                }
                            }
                        }
                        ++n14;
                        n13 = n17;
                        n15 = n18;
                        n16 = n19;
                    }
                    n6 |= n16;
                    if (n15 > n12) {
                        break;
                    }
                    i = 0;
                    final int n20 = max;
                    int n21 = n12;
                    while (i < childCount2) {
                        final View child2 = this.getChildAt(i);
                        final oj oj4 = (oj)child2.getLayoutParams();
                        final long n22 = 1 << i;
                        int n23;
                        long n24;
                        if ((n16 & n22) == 0x0L) {
                            n23 = n21;
                            n24 = n6;
                            if (oj4.b == n13 + 1) {
                                n24 = (n6 | n22);
                                n23 = n21;
                            }
                        }
                        else {
                            n23 = n21;
                            if (b5) {
                                n23 = n21;
                                if (oj4.e && (n23 = n21) == 1) {
                                    final int o2 = this.o;
                                    child2.setPadding(o2 + n4, 0, o2, 0);
                                    n23 = 1;
                                }
                            }
                            ++oj4.b;
                            oj4.f = true;
                            --n23;
                            n24 = n6;
                        }
                        ++i;
                        n21 = n23;
                        n6 = n24;
                    }
                    i = 1;
                    n12 = n21;
                    max = n20;
                }
                boolean b7;
                if (!b && n5 == 1) {
                    b7 = true;
                    n5 = 1;
                }
                else {
                    b7 = false;
                }
                if (n12 > 0 && n6 != 0L && (n12 < n5 - 1 || b7 || max2 > 1)) {
                    float n26;
                    final float n25 = n26 = (float)Long.bitCount(n6);
                    if (!b7) {
                        float n27 = n25;
                        if ((n6 & 0x1L) != 0x0L) {
                            n27 = n25;
                            if (!((oj)this.getChildAt(0).getLayoutParams()).e) {
                                n27 = n25 - 0.5f;
                            }
                        }
                        final int n28 = childCount2 - 1;
                        n26 = n27;
                        if ((n6 & (long)(1 << n28)) != 0x0L) {
                            n26 = n27;
                            if (!((oj)this.getChildAt(n28).getLayoutParams()).e) {
                                n26 = n27 - 0.5f;
                            }
                        }
                    }
                    int n29;
                    if (n26 > 0.0f) {
                        n29 = (int)(n12 * n4 / n26);
                    }
                    else {
                        n29 = 0;
                    }
                    final int n30 = 0;
                    int n31 = i;
                    int n32;
                    int n33;
                    View child3;
                    oj oj5;
                    for (i = n30; i < childCount2; i = n32 + 1, n31 = n33) {
                        if ((n6 & (long)(1 << i)) == 0x0L) {
                            n32 = i;
                            n33 = n31;
                        }
                        else {
                            child3 = this.getChildAt(i);
                            oj5 = (oj)child3.getLayoutParams();
                            if (child3 instanceof ActionMenuItemView) {
                                oj5.c = n29;
                                oj5.f = true;
                                if (i == 0) {
                                    if (!oj5.e) {
                                        oj5.leftMargin = -n29 / 2;
                                    }
                                    i = 0;
                                }
                                n33 = 1;
                                n32 = i;
                            }
                            else if (oj5.a) {
                                oj5.c = n29;
                                oj5.f = true;
                                oj5.rightMargin = -n29 / 2;
                                n33 = 1;
                                n32 = i;
                            }
                            else {
                                if (i != 0) {
                                    oj5.leftMargin = n29 / 2;
                                }
                                n32 = i;
                                n33 = n31;
                                if (i != childCount2 - 1) {
                                    oj5.rightMargin = n29 / 2;
                                    n33 = n31;
                                    n32 = i;
                                }
                            }
                        }
                    }
                    i = n31;
                }
                if (i != 0) {
                    View child4;
                    oj oj6;
                    for (i = 0; i < childCount2; ++i) {
                        child4 = this.getChildAt(i);
                        oj6 = (oj)child4.getLayoutParams();
                        if (oj6.f) {
                            child4.measure(View$MeasureSpec.makeMeasureSpec(oj6.b * n4 + oj6.c, 1073741824), childMeasureSpec);
                        }
                    }
                }
                if (mode != 1073741824) {
                    i = max;
                }
                else {
                    i = n;
                }
                this.setMeasuredDimension(n3, i);
                return;
            }
            else {
                n34 = 0;
            }
        }
        else {
            n34 = 0;
        }
        while (n34 < childCount) {
            final oj oj7 = (oj)this.getChildAt(n34).getLayoutParams();
            oj7.rightMargin = 0;
            oj7.leftMargin = 0;
            ++n34;
        }
        super.onMeasure(i, n);
    }
}
