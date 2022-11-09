// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Canvas;
import android.view.ViewParent;
import java.util.Iterator;
import java.util.List;
import android.widget.LinearLayout$LayoutParams;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.text.TextUtils;
import android.graphics.Rect;
import android.util.Log;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import android.widget.HorizontalScrollView;

@agf
public class TabLayout extends HorizontalScrollView
{
    private static final int x;
    private static final hp y;
    private ngh A;
    private final int B;
    private final int C;
    private final int D;
    private int E;
    private final ArrayList F;
    private ngc G;
    private ValueAnimator H;
    private ngi I;
    private boolean J;
    private final hp K;
    private nqb L;
    final ngg a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ColorStateList g;
    public ColorStateList h;
    public Drawable i;
    public int j;
    public float k;
    public float l;
    public final int m;
    public int n;
    public int o;
    int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    ViewPager v;
    public nov w;
    private final ArrayList z;
    
    static {
        x = 2132018210;
        y = new hr(16);
    }
    
    public TabLayout(final Context context) {
        this(context, null);
    }
    
    public TabLayout(final Context context, final AttributeSet set) {
        this(context, set, 2130969741);
    }
    
    public TabLayout(Context context, final AttributeSet set, int n) {
        final int x = TabLayout.x;
        super(ngv.a(context, set, n, x), set, n);
        this.z = new ArrayList();
        this.i = (Drawable)new GradientDrawable();
        this.j = 0;
        this.n = Integer.MAX_VALUE;
        this.F = new ArrayList();
        this.K = new hq(12);
        final Context context2 = this.getContext();
        this.setHorizontalScrollBarEnabled(false);
        final ngg a = new ngg(this, context2);
        super.addView((View)(this.a = a), 0, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1));
        final TypedArray a2 = nem.a(context2, set, nfz.a, n, x, 23);
        if (this.getBackground() instanceof ColorDrawable) {
            final ColorDrawable colorDrawable = (ColorDrawable)this.getBackground();
            final nfd nfd = new nfd(new nfi());
            nfd.g(ColorStateList.valueOf(colorDrawable.getColor()));
            nfd.e(context2);
            nfd.f(ik.a((View)this));
            ik.G((View)this, nfd);
        }
        final Drawable b = neu.b(context2, a2, 5);
        if (this.i != b) {
            Object i;
            if ((i = b) == null) {
                i = new GradientDrawable();
            }
            this.i = (Drawable)i;
        }
        this.j = a2.getColor(8, 0);
        n = a2.getDimensionPixelSize(11, -1);
        final Rect bounds = a.d.i.getBounds();
        a.d.i.setBounds(bounds.left, 0, bounds.right, n);
        a.requestLayout();
        n = a2.getInt(10, 0);
        if (this.q != n) {
            this.q = n;
            ik.z((View)a);
        }
        this.t = a2.getBoolean(9, true);
        ik.z((View)a);
        n = a2.getInt(7, 0);
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(52);
                sb.append(n);
                sb.append(" is not a valid TabIndicatorAnimationMode");
                throw new IllegalArgumentException(sb.toString());
            }
            case 1: {
                this.w = new nfy();
                break;
            }
            case 0: {
                this.w = new nov();
                break;
            }
        }
        n = a2.getDimensionPixelSize(16, 0);
        this.e = n;
        this.d = n;
        this.c = n;
        this.b = n;
        this.b = a2.getDimensionPixelSize(19, n);
        this.c = a2.getDimensionPixelSize(20, this.c);
        this.d = a2.getDimensionPixelSize(18, this.d);
        this.e = a2.getDimensionPixelSize(17, this.e);
        n = a2.getResourceId(23, 2132017742);
        this.f = n;
        context = (Context)context2.obtainStyledAttributes(n, lo.v);
        try {
            this.k = (float)((TypedArray)context).getDimensionPixelSize(0, 0);
            this.g = neu.a(context2, (TypedArray)context, 3);
            ((TypedArray)context).recycle();
            if (a2.hasValue(24)) {
                this.g = neu.a(context2, a2, 24);
            }
            if (a2.hasValue(22)) {
                final int color = a2.getColor(22, 0);
                n = this.g.getDefaultColor();
                this.g = new ColorStateList(new int[][] { TabLayout.SELECTED_STATE_SET, TabLayout.EMPTY_STATE_SET }, new int[] { color, n });
            }
            neu.a(context2, a2, 3);
            a2.getInt(4, -1);
            this.h = neu.a(context2, a2, 21);
            this.p = a2.getInt(6, 300);
            this.B = a2.getDimensionPixelSize(14, -1);
            this.C = a2.getDimensionPixelSize(13, -1);
            this.m = a2.getResourceId(0, 0);
            this.E = a2.getDimensionPixelSize(1, 0);
            this.r = a2.getInt(15, 1);
            this.o = a2.getInt(2, 0);
            this.s = a2.getBoolean(12, false);
            this.u = a2.getBoolean(25, false);
            a2.recycle();
            context = (Context)this.getResources();
            this.l = (float)((Resources)context).getDimensionPixelSize(2131165412);
            this.D = ((Resources)context).getDimensionPixelSize(2131165410);
            n = this.r;
            if (n != 0 && n != 2) {
                n = 0;
            }
            else {
                n = Math.max(0, this.E - this.b);
            }
            ik.M((View)a, n, 0, 0, 0);
            Label_0912: {
                switch (this.r) {
                    case 1:
                    case 2: {
                        if (this.o == 2) {
                            Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                        }
                        a.setGravity(1);
                        break;
                    }
                    case 0: {
                        switch (this.o) {
                            default: {
                                break Label_0912;
                            }
                            case 1: {
                                a.setGravity(1);
                                break Label_0912;
                            }
                            case 0: {
                                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                            }
                            case 2: {
                                a.setGravity(8388611);
                                break Label_0912;
                            }
                        }
                        break;
                    }
                }
            }
            this.k(true);
        }
        finally {
            ((TypedArray)context).recycle();
            while (true) {}
        }
    }
    
    private final int m(int width, final float n) {
        final int r = this.r;
        int width2 = 0;
        if (r != 0 && r != 2) {
            return 0;
        }
        final View child = this.a.getChildAt(width);
        View child2;
        if (++width < this.a.getChildCount()) {
            child2 = this.a.getChildAt(width);
        }
        else {
            child2 = null;
        }
        if (child != null) {
            width = child.getWidth();
        }
        else {
            width = 0;
        }
        if (child2 != null) {
            width2 = child2.getWidth();
        }
        final int n2 = child.getLeft() + width / 2 - this.getWidth() / 2;
        width = (int)((width + width2) * 0.5f * n);
        if (ik.f((View)this) == 0) {
            width += n2;
        }
        else {
            width = n2 - width;
        }
        return width;
    }
    
    private final int n() {
        final int b = this.B;
        if (b != -1) {
            return b;
        }
        final int r = this.r;
        if (r != 0 && r != 2) {
            return 0;
        }
        return this.D;
    }
    
    private final void o(final View view) {
        if (view instanceof nga) {
            final nga nga = (nga)view;
            final ngh d = this.d();
            final CharSequence a = nga.a;
            final Drawable b = nga.b;
            final int c = nga.c;
            if (!TextUtils.isEmpty(nga.getContentDescription())) {
                d.b = nga.getContentDescription();
                d.b();
            }
            this.f(d, this.z.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }
    
    private final void p(final int n) {
        if (n == -1) {
            return;
        }
        Label_0207: {
            if (this.getWindowToken() != null && ik.U((View)this)) {
                final ngg a = this.a;
                for (int childCount = a.getChildCount(), i = 0; i < childCount; ++i) {
                    if (a.getChildAt(i).getWidth() <= 0) {
                        break Label_0207;
                    }
                }
                final int scrollX = this.getScrollX();
                final int m = this.m(n, 0.0f);
                if (scrollX != m) {
                    if (this.H == null) {
                        (this.H = new ValueAnimator()).setInterpolator(ncj.a);
                        this.H.setDuration((long)this.p);
                        this.H.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ngb(this));
                    }
                    this.H.setIntValues(new int[] { scrollX, m });
                    this.H.start();
                }
                final ngg a2 = this.a;
                final int p = this.p;
                final ValueAnimator a3 = a2.a;
                if (a3 != null && a3.isRunning()) {
                    a2.a.cancel();
                }
                a2.b(true, n, p);
                return;
            }
        }
        this.l(n);
    }
    
    private final void q(final int n) {
        final int childCount = this.a.getChildCount();
        if (n < childCount) {
            for (int i = 0; i < childCount; ++i) {
                final View child = this.a.getChildAt(i);
                final boolean b = i == n;
                child.setSelected(b);
                child.setActivated(b);
            }
        }
    }
    
    private final void r(final LinearLayout$LayoutParams linearLayout$LayoutParams) {
        float weight;
        if (this.r == 1 && this.o == 0) {
            linearLayout$LayoutParams.width = 0;
            weight = 1.0f;
        }
        else {
            linearLayout$LayoutParams.width = -2;
            weight = 0.0f;
        }
        linearLayout$LayoutParams.weight = weight;
    }
    
    private final void s(final ViewPager v, final boolean j) {
        final ViewPager v2 = this.v;
        if (v2 != null) {
            final ngi i = this.I;
            if (i != null) {
                final List d = v2.d;
                if (d != null) {
                    d.remove(i);
                }
            }
            final nqb l = this.L;
            if (l != null) {
                final List e = this.v.e;
                if (e != null) {
                    e.remove(l);
                }
            }
        }
        final ngc g = this.G;
        if (g != null) {
            this.F.remove(g);
            this.G = null;
        }
        if (v != null) {
            this.v = v;
            if (this.I == null) {
                this.I = new ngi(this);
            }
            final ngi k = this.I;
            k.b = 0;
            k.a = 0;
            if (v.d == null) {
                v.d = new ArrayList();
            }
            v.d.add(k);
            this.e(this.G = new ngl(v));
            if (this.L == null) {
                this.L = new nqb();
            }
            final nqb m = this.L;
            if (v.e == null) {
                v.e = new ArrayList();
            }
            v.e.add(m);
            this.l(0);
        }
        else {
            this.v = null;
            this.g();
        }
        this.J = j;
    }
    
    public final int a() {
        final ngh a = this.A;
        if (a != null) {
            return a.c;
        }
        return -1;
    }
    
    public final void addView(final View view) {
        this.o(view);
    }
    
    public final void addView(final View view, final int n) {
        this.o(view);
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.o(view);
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.o(view);
    }
    
    public final int b() {
        return this.z.size();
    }
    
    public final ngh c(final int n) {
        if (n >= 0 && n < this.b()) {
            return this.z.get(n);
        }
        return null;
    }
    
    public final ngh d() {
        ngh ngh;
        if ((ngh = (ngh)TabLayout.y.a()) == null) {
            ngh = new ngh();
        }
        ngh.f = this;
        final hp k = this.K;
        ngk ngk;
        if (k != null) {
            ngk = (ngk)k.a();
        }
        else {
            ngk = null;
        }
        ngk g = ngk;
        if (ngk == null) {
            g = new ngk(this, this.getContext());
        }
        g.a(ngh);
        g.setFocusable(true);
        g.setMinimumWidth(this.n());
        if (TextUtils.isEmpty(ngh.b)) {
            g.setContentDescription(ngh.a);
        }
        else {
            g.setContentDescription(ngh.b);
        }
        ngh.g = g;
        if (ngh.h != -1) {
            ngh.g.setId(0);
        }
        return ngh;
    }
    
    @Deprecated
    public final void e(final ngc ngc) {
        if (!this.F.contains(ngc)) {
            this.F.add(ngc);
        }
    }
    
    public final void f(final ngh ngh, final boolean b) {
        int i = this.z.size();
        if (ngh.f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        ngh.c = i;
        this.z.add(i, ngh);
        final int size = this.z.size();
        ++i;
        while (i < size) {
            ((ngh)this.z.get(i)).c = i;
            ++i;
        }
        final ngk g = ngh.g;
        g.setSelected(false);
        g.setActivated(false);
        final ngg a = this.a;
        final int c = ngh.c;
        final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -1);
        this.r(linearLayout$LayoutParams);
        a.addView((View)g, c, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
        if (b) {
            ngh.a();
        }
    }
    
    public final void g() {
        for (int i = this.a.getChildCount() - 1; i >= 0; --i) {
            final ngk ngk = (ngk)this.a.getChildAt(i);
            this.a.removeViewAt(i);
            if (ngk != null) {
                ngk.a(null);
                ngk.setSelected(false);
                this.K.b(ngk);
            }
            this.requestLayout();
        }
        final Iterator iterator = this.z.iterator();
        while (iterator.hasNext()) {
            final ngh ngh = (ngh)iterator.next();
            iterator.remove();
            ngh.f = null;
            ngh.g = null;
            ngh.h = -1;
            ngh.a = null;
            ngh.b = null;
            ngh.c = -1;
            ngh.d = null;
            TabLayout.y.b(ngh);
        }
        this.A = null;
    }
    
    public final FrameLayout$LayoutParams generateLayoutParams(final AttributeSet set) {
        return this.generateDefaultLayoutParams();
    }
    
    public final void h(final ngh ngh) {
        this.i(ngh, true);
    }
    
    public final void i(final ngh a, final boolean b) {
        final ngh a2 = this.A;
        if (a2 == a) {
            if (a2 != null) {
                for (int i = this.F.size() - 1; i >= 0; --i) {
                    ((ngc)this.F.get(i)).b();
                }
                this.p(a.c);
            }
        }
        else {
            int c;
            if (a != null) {
                c = a.c;
            }
            else {
                c = -1;
            }
            if (b) {
                if ((a2 == null || a2.c == -1) && c != -1) {
                    this.l(c);
                }
                else {
                    this.p(c);
                }
                if (c != -1) {
                    this.q(c);
                }
            }
            this.A = a;
            if (a2 != null) {
                for (int j = this.F.size() - 1; j >= 0; --j) {
                    ((ngc)this.F.get(j)).c();
                }
            }
            if (a != null) {
                for (int k = this.F.size() - 1; k >= 0; --k) {
                    ((ngc)this.F.get(k)).a(a);
                }
            }
        }
    }
    
    public final void j(final int b, final float c, final boolean b2, final boolean b3) {
        final int round = Math.round(b + c);
        if (round >= 0 && round < this.a.getChildCount()) {
            if (b3) {
                final ngg a = this.a;
                final ValueAnimator a2 = a.a;
                if (a2 != null && a2.isRunning()) {
                    a.a.cancel();
                }
                a.b = b;
                a.c = c;
                a.a(a.getChildAt(b), a.getChildAt(a.b + 1), a.c);
            }
            final ValueAnimator h = this.H;
            if (h != null && h.isRunning()) {
                this.H.cancel();
            }
            this.scrollTo(this.m(b, c), 0);
            if (b2) {
                this.q(round);
            }
        }
    }
    
    public final void k(final boolean b) {
        for (int i = 0; i < this.a.getChildCount(); ++i) {
            final View child = this.a.getChildAt(i);
            child.setMinimumWidth(this.n());
            this.r((LinearLayout$LayoutParams)child.getLayoutParams());
            if (b) {
                child.requestLayout();
            }
        }
    }
    
    public final void l(final int n) {
        this.j(n, 0.0f, true, true);
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Drawable background = ((View)this).getBackground();
        if (background instanceof nfd) {
            nfa.b((View)this, (nfd)background);
        }
        if (this.v == null) {
            final ViewParent parent = this.getParent();
            if (parent instanceof ViewPager) {
                this.s((ViewPager)parent, true);
            }
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.J) {
            this.s(null, false);
            this.J = false;
        }
    }
    
    protected final void onDraw(final Canvas canvas) {
        for (int i = 0; i < this.a.getChildCount(); ++i) {
            final View child = this.a.getChildAt(i);
            if (child instanceof ngk) {
                final ngk ngk = (ngk)child;
                final Drawable c = ngk.c;
                if (c != null) {
                    c.setBounds(ngk.getLeft(), ngk.getTop(), ngk.getRight(), ngk.getBottom());
                    ngk.c.draw(canvas);
                }
            }
        }
        super.onDraw(canvas);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jc.a(accessibilityNodeInfo).f(ja.a(1, this.b(), 1));
    }
    
    protected final void onMeasure(int childMeasureSpec, int c) {
        final Context context = this.getContext();
        final int size = this.z.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            final ngh ngh = this.z.get(i);
        }
        final int round = Math.round(neq.a(context, 48));
        int measureSpec = 0;
        switch (View$MeasureSpec.getMode(c)) {
            default: {
                measureSpec = c;
                break;
            }
            case 0: {
                measureSpec = View$MeasureSpec.makeMeasureSpec(round + this.getPaddingTop() + this.getPaddingBottom(), 1073741824);
                break;
            }
            case Integer.MIN_VALUE: {
                measureSpec = c;
                if (this.getChildCount() != 1) {
                    break;
                }
                measureSpec = c;
                if (View$MeasureSpec.getSize(c) >= round) {
                    this.getChildAt(0).setMinimumHeight(round);
                    measureSpec = c;
                    break;
                }
                break;
            }
        }
        final int size2 = View$MeasureSpec.getSize(childMeasureSpec);
        if (View$MeasureSpec.getMode(childMeasureSpec) != 0) {
            c = this.C;
            if (c <= 0) {
                c = (int)(size2 - neq.a(this.getContext(), 56));
            }
            this.n = c;
        }
        super.onMeasure(childMeasureSpec, measureSpec);
        if (this.getChildCount() == 1) {
            final View child = this.getChildAt(0);
            switch (this.r) {
                default: {
                    return;
                }
                case 1: {
                    if (child.getMeasuredWidth() != this.getMeasuredWidth()) {
                        childMeasureSpec = 1;
                        break;
                    }
                    childMeasureSpec = n;
                    break;
                }
                case 0:
                case 2: {
                    childMeasureSpec = n;
                    if (child.getMeasuredWidth() < this.getMeasuredWidth()) {
                        childMeasureSpec = 1;
                        break;
                    }
                    break;
                }
            }
            if (childMeasureSpec != 0) {
                childMeasureSpec = getChildMeasureSpec(measureSpec, this.getPaddingTop() + this.getPaddingBottom(), child.getLayoutParams().height);
                child.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), childMeasureSpec);
            }
        }
    }
    
    public final void setElevation(final float elevation) {
        super.setElevation(elevation);
        final Drawable background = ((View)this).getBackground();
        if (background instanceof nfd) {
            ((nfd)background).f(elevation);
        }
    }
    
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, this.a.getWidth() - this.getWidth() - this.getPaddingLeft() - this.getPaddingRight()) > 0;
    }
}
