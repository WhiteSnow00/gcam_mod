// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.text.TextUtils$TruncateAt;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.Menu;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.Gravity;
import java.util.List;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.content.Context;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import android.content.res.ColorStateList;
import android.view.ViewGroup;

public class Toolbar extends ViewGroup
{
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private ColorStateList F;
    private ColorStateList G;
    private boolean H;
    private boolean I;
    private final ArrayList J;
    private final int[] K;
    private ty L;
    private final Runnable M;
    private final tp N;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public sz n;
    public CharSequence o;
    public CharSequence p;
    public final ArrayList q;
    public og r;
    public ts s;
    public ni t;
    public mt u;
    public lb v;
    private ImageView w;
    private int x;
    private int y;
    private int z;
    
    public Toolbar(final Context context) {
        this(context, null);
    }
    
    public Toolbar(final Context context, final AttributeSet set) {
        this(context, set, 2130969850);
    }
    
    public Toolbar(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.E = 8388627;
        this.J = new ArrayList();
        this.q = new ArrayList();
        this.K = new int[2];
        this.N = new tp(this);
        this.M = new tq(this);
        final to q = to.q(this.getContext(), set, lo.w, n);
        ik.E((View)this, context, lo.w, set, q.b, n, 0);
        this.k = q.f(28, 0);
        this.l = q.f(19, 0);
        this.E = q.d(0, this.E);
        this.m = q.d(2, 48);
        final int n2 = n = q.a(22, 0);
        if (q.p(27)) {
            n = q.a(27, n2);
        }
        this.B = n;
        this.A = n;
        this.z = n;
        this.y = n;
        n = q.a(25, -1);
        if (n >= 0) {
            this.y = n;
        }
        n = q.a(24, -1);
        if (n >= 0) {
            this.z = n;
        }
        n = q.a(26, -1);
        if (n >= 0) {
            this.A = n;
        }
        n = q.a(23, -1);
        if (n >= 0) {
            this.B = n;
        }
        this.x = q.b(13, -1);
        n = q.a(9, Integer.MIN_VALUE);
        final int a = q.a(5, Integer.MIN_VALUE);
        final int b = q.b(7, 0);
        final int b2 = q.b(8, 0);
        this.j();
        final sz n3 = this.n;
        n3.h = false;
        if (b != Integer.MIN_VALUE) {
            n3.e = b;
            n3.a = b;
        }
        if (b2 != Integer.MIN_VALUE) {
            n3.f = b2;
            n3.b = b2;
        }
        if (n != Integer.MIN_VALUE || a != Integer.MIN_VALUE) {
            n3.a(n, a);
        }
        this.C = q.a(10, Integer.MIN_VALUE);
        this.D = q.a(6, Integer.MIN_VALUE);
        this.e = q.h(4);
        this.f = q.l(3);
        final CharSequence l = q.l(21);
        if (!TextUtils.isEmpty(l)) {
            this.r(l);
        }
        final CharSequence i = q.l(18);
        if (!TextUtils.isEmpty(i)) {
            this.q(i);
        }
        this.i = this.getContext();
        this.p(q.f(17, 0));
        final Drawable h = q.h(16);
        if (h != null) {
            this.o(h);
        }
        final CharSequence j = q.l(15);
        if (!TextUtils.isEmpty(j)) {
            this.n(j);
        }
        final Drawable h2 = q.h(11);
        if (h2 != null) {
            this.m(h2);
        }
        final CharSequence k = q.l(12);
        if (!TextUtils.isEmpty(k)) {
            if (!TextUtils.isEmpty(k)) {
                this.D();
            }
            final ImageView w = this.w;
            if (w != null) {
                w.setContentDescription(k);
            }
        }
        if (q.p(29)) {
            final ColorStateList g = q.g(29);
            this.F = g;
            final TextView b3 = this.b;
            if (b3 != null) {
                b3.setTextColor(g);
            }
        }
        if (q.p(20)) {
            final ColorStateList g2 = q.g(20);
            this.G = g2;
            final TextView c = this.c;
            if (c != null) {
                c.setTextColor(g2);
            }
        }
        if (q.p(14)) {
            n = q.f(14, 0);
            new mb(this.getContext()).inflate(n, this.g());
        }
        q.n();
    }
    
    private final int A(final View view, final int n, final int n2, final int n3, final int n4, final int[] array) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int n5 = viewGroup$MarginLayoutParams.leftMargin - array[0];
        final int n6 = viewGroup$MarginLayoutParams.rightMargin - array[1];
        final int n7 = Math.max(0, n5) + Math.max(0, n6);
        array[0] = Math.max(0, -n5);
        array[1] = Math.max(0, -n6);
        view.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + n7 + n2, viewGroup$MarginLayoutParams.width), getChildMeasureSpec(n3, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n4, viewGroup$MarginLayoutParams.height));
        return view.getMeasuredWidth() + n7;
    }
    
    private final void B(final List list, int i) {
        final int f = ik.f((View)this);
        final int childCount = this.getChildCount();
        final int absoluteGravity = Gravity.getAbsoluteGravity(i, ik.f((View)this));
        list.clear();
        if (f == 1) {
            View child;
            tt tt;
            for (i = childCount - 1; i >= 0; --i) {
                child = this.getChildAt(i);
                tt = (tt)child.getLayoutParams();
                if (tt.b == 0 && this.F(child) && this.w(tt.a) == absoluteGravity) {
                    list.add(child);
                }
            }
        }
        else {
            View child2;
            tt tt2;
            for (i = 0; i < childCount; ++i) {
                child2 = this.getChildAt(i);
                tt2 = (tt)child2.getLayoutParams();
                if (tt2.b == 0 && this.F(child2) && this.w(tt2.a) == absoluteGravity) {
                    list.add(child2);
                }
            }
        }
    }
    
    private final void C(final View view, final boolean b) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        tt layoutParams2;
        if (layoutParams == null) {
            layoutParams2 = u();
        }
        else if (!this.checkLayoutParams(layoutParams)) {
            layoutParams2 = v(layoutParams);
        }
        else {
            layoutParams2 = (tt)layoutParams;
        }
        layoutParams2.b = 1;
        if (b && this.h != null) {
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            this.q.add(view);
            return;
        }
        this.addView(view, (ViewGroup$LayoutParams)layoutParams2);
    }
    
    private final void D() {
        if (this.w == null) {
            this.w = new AppCompatImageView(this.getContext());
        }
    }
    
    private final boolean E(final View view) {
        return view.getParent() == this || this.q.contains(view);
    }
    
    private final boolean F(final View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }
    
    private static final int G(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return viewGroup$MarginLayoutParams.getMarginStart() + viewGroup$MarginLayoutParams.getMarginEnd();
    }
    
    private static final int H(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
    }
    
    private final void I(final View view, int measureSpec, int childMeasureSpec, int mode, int min) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int childMeasureSpec2 = getChildMeasureSpec(measureSpec, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + childMeasureSpec, viewGroup$MarginLayoutParams.width);
        childMeasureSpec = getChildMeasureSpec(mode, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, viewGroup$MarginLayoutParams.height);
        mode = View$MeasureSpec.getMode(childMeasureSpec);
        measureSpec = childMeasureSpec;
        if (mode != 1073741824) {
            measureSpec = childMeasureSpec;
            if (min >= 0) {
                if (mode != 0) {
                    min = Math.min(View$MeasureSpec.getSize(childMeasureSpec), min);
                }
                measureSpec = View$MeasureSpec.makeMeasureSpec(min, 1073741824);
            }
        }
        view.measure(childMeasureSpec2, measureSpec);
    }
    
    public static final tt u() {
        return new tt();
    }
    
    protected static final tt v(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof tt) {
            return new tt((tt)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof js) {
            return new tt((js)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new tt((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new tt(viewGroup$LayoutParams);
    }
    
    private final int w(int n) {
        final int f = ik.f((View)this);
        switch (n = (Gravity.getAbsoluteGravity(n, f) & 0x7)) {
            default: {
                if (f == 1) {
                    n = 5;
                    return n;
                }
                return 3;
            }
            case 1:
            case 3:
            case 5: {
                return n;
            }
        }
    }
    
    private final int x(final View view, int n) {
        final tt tt = (tt)view.getLayoutParams();
        final int measuredHeight = view.getMeasuredHeight();
        if (n > 0) {
            n = (measuredHeight - n) / 2;
        }
        else {
            n = 0;
        }
        int n2;
        switch (n2 = (tt.a & 0x70)) {
            default: {
                n2 = (this.E & 0x70);
            }
            case 16:
            case 48:
            case 80: {
                switch (n2) {
                    default: {
                        final int paddingTop = this.getPaddingTop();
                        final int paddingBottom = this.getPaddingBottom();
                        final int height = this.getHeight();
                        n = (height - paddingTop - paddingBottom - measuredHeight) / 2;
                        if (n < tt.topMargin) {
                            n = tt.topMargin;
                        }
                        else {
                            final int n3 = height - paddingBottom - measuredHeight - n - paddingTop;
                            if (n3 < tt.bottomMargin) {
                                n = Math.max(0, n - (tt.bottomMargin - n3));
                            }
                        }
                        return paddingTop + n;
                    }
                    case 80: {
                        return this.getHeight() - this.getPaddingBottom() - measuredHeight - tt.bottomMargin - n;
                    }
                    case 48: {
                        return this.getPaddingTop() - n;
                    }
                }
                break;
            }
        }
    }
    
    private final int y(final View view, int n, final int[] array, int measuredWidth) {
        final tt tt = (tt)view.getLayoutParams();
        final int n2 = tt.leftMargin - array[0];
        n += Math.max(0, n2);
        array[0] = Math.max(0, -n2);
        final int x = this.x(view, measuredWidth);
        measuredWidth = view.getMeasuredWidth();
        view.layout(n, x, n + measuredWidth, view.getMeasuredHeight() + x);
        return n + (measuredWidth + tt.rightMargin);
    }
    
    private final int z(final View view, int n, final int[] array, int x) {
        final tt tt = (tt)view.getLayoutParams();
        final int n2 = tt.rightMargin - array[1];
        n -= Math.max(0, n2);
        array[1] = Math.max(0, -n2);
        x = this.x(view, x);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n - measuredWidth, x, n, view.getMeasuredHeight() + x);
        return n - (measuredWidth + tt.leftMargin);
    }
    
    public final int a() {
        final sz n = this.n;
        if (n != null) {
            int n2;
            if (n.g) {
                n2 = n.a;
            }
            else {
                n2 = n.b;
            }
            return n2;
        }
        return 0;
    }
    
    public final int b() {
        final sz n = this.n;
        if (n != null) {
            int n2;
            if (n.g) {
                n2 = n.b;
            }
            else {
                n2 = n.a;
            }
            return n2;
        }
        return 0;
    }
    
    public final int c() {
        final ActionMenuView a = this.a;
        if (a != null) {
            final mv a2 = a.a;
            if (a2 != null && a2.hasVisibleItems()) {
                return Math.max(this.a(), Math.max(this.D, 0));
            }
        }
        return this.a();
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof tt;
    }
    
    public final int d() {
        int n;
        if (this.e() != null) {
            n = Math.max(this.b(), Math.max(this.C, 0));
        }
        else {
            n = this.b();
        }
        return n;
    }
    
    public final Drawable e() {
        final ImageButton d = this.d;
        if (d != null) {
            return d.getDrawable();
        }
        return null;
    }
    
    public final pz f() {
        if (this.L == null) {
            this.L = new ty(this, true);
        }
        return this.L;
    }
    
    public final Menu g() {
        this.k();
        final ActionMenuView a = this.a;
        if (a.a == null) {
            final Menu g = a.g();
            if (this.s == null) {
                this.s = new ts(this);
            }
            this.a.c.o();
            ((mv)g).h(this.s, this.i);
        }
        return this.a.g();
    }
    
    public final CharSequence h() {
        final ImageButton d = this.d;
        if (d != null) {
            return d.getContentDescription();
        }
        return null;
    }
    
    public final void i() {
        final ts s = this.s;
        my b;
        if (s == null) {
            b = null;
        }
        else {
            b = s.b;
        }
        if (b != null) {
            b.collapseActionView();
        }
    }
    
    public final void j() {
        if (this.n == null) {
            this.n = new sz();
        }
    }
    
    public final void k() {
        if (this.a == null) {
            (this.a = new ActionMenuView(this.getContext())).j(this.j);
            final ActionMenuView a = this.a;
            a.e = this.N;
            a.i(this.t, this.u);
            final tt u = u();
            u.a = ((this.m & 0x70) | 0x800005);
            this.a.setLayoutParams((ViewGroup$LayoutParams)u);
            this.C((View)this.a, false);
        }
    }
    
    public final void l() {
        if (this.d == null) {
            this.d = new ov(this.getContext(), null, 2130969849);
            final tt u = u();
            u.a = ((this.m & 0x70) | 0x800003);
            this.d.setLayoutParams((ViewGroup$LayoutParams)u);
        }
    }
    
    public final void m(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.D();
            if (!this.E((View)this.w)) {
                this.C((View)this.w, true);
            }
        }
        else {
            final ImageView w = this.w;
            if (w != null && this.E((View)w)) {
                this.removeView((View)this.w);
                this.q.remove(this.w);
            }
        }
        final ImageView w2 = this.w;
        if (w2 != null) {
            w2.setImageDrawable(imageDrawable);
        }
    }
    
    public final void n(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.l();
        }
        final ImageButton d = this.d;
        if (d != null) {
            d.setContentDescription(contentDescription);
        }
    }
    
    public final void o(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.l();
            if (!this.E((View)this.d)) {
                this.C((View)this.d, true);
            }
        }
        else {
            final ImageButton d = this.d;
            if (d != null && this.E((View)d)) {
                this.removeView((View)this.d);
                this.q.remove(this.d);
            }
        }
        final ImageButton d2 = this.d;
        if (d2 != null) {
            d2.setImageDrawable(imageDrawable);
        }
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.M);
    }
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int n = 9;
        int n2 = actionMasked;
        if (actionMasked == 9) {
            this.I = false;
            n2 = 9;
        }
        if (!this.I) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (n2 == 9) {
                n2 = n;
                if (!onHoverEvent) {
                    this.I = true;
                    n2 = n;
                }
            }
        }
        if (n2 == 10 || n2 == 3) {
            this.I = false;
        }
        return true;
    }
    
    protected final void onLayout(final boolean b, int n, int i, int j, int n2) {
        final int f = ik.f((View)this);
        final int width = this.getWidth();
        final int height = this.getHeight();
        j = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int n3 = width - paddingRight;
        final int[] k = this.K;
        k[k[1] = 0] = 0;
        n = ik.g((View)this);
        if (n >= 0) {
            n2 = Math.min(n, n2 - i);
        }
        else {
            n2 = 0;
        }
        Label_0152: {
            if (this.F((View)this.d)) {
                if (f == 1) {
                    i = this.z((View)this.d, n3, k, n2);
                    n = j;
                    break Label_0152;
                }
                n = this.y((View)this.d, j, k, n2);
            }
            else {
                n = j;
            }
            i = n3;
        }
        if (this.F((View)this.g)) {
            if (f == 1) {
                i = this.z((View)this.g, i, k, n2);
            }
            else {
                n = this.y((View)this.g, n, k, n2);
            }
        }
        if (this.F((View)this.a)) {
            if (f == 1) {
                n = this.y((View)this.a, n, k, n2);
            }
            else {
                i = this.z((View)this.a, i, k, n2);
            }
        }
        int n4;
        if (ik.f((View)this) == 1) {
            n4 = this.c();
        }
        else {
            n4 = this.d();
        }
        int n5;
        if (ik.f((View)this) == 1) {
            n5 = this.d();
        }
        else {
            n5 = this.c();
        }
        k[0] = Math.max(0, n4 - n);
        k[1] = Math.max(0, n5 - (n3 - i));
        n = Math.max(n, n4);
        int n7;
        final int n6 = n7 = Math.min(i, n3 - n5);
        i = n;
        if (this.F(this.h)) {
            if (f == 1) {
                n7 = this.z(this.h, n6, k, n2);
                i = n;
            }
            else {
                i = this.y(this.h, n, k, n2);
                n7 = n6;
            }
        }
        if (this.F((View)this.w)) {
            if (f == 1) {
                n7 = this.z((View)this.w, n7, k, n2);
            }
            else {
                i = this.y((View)this.w, i, k, n2);
            }
        }
        final boolean f2 = this.F((View)this.b);
        final boolean f3 = this.F((View)this.c);
        if (f2) {
            final tt tt = (tt)this.b.getLayoutParams();
            n = tt.topMargin;
            n = tt.bottomMargin + (n + this.b.getMeasuredHeight());
        }
        else {
            n = 0;
        }
        if (f3) {
            final tt tt2 = (tt)this.c.getLayoutParams();
            n += tt2.topMargin + this.c.getMeasuredHeight() + tt2.bottomMargin;
        }
        if (!f2 && !f3) {
            n = i;
        }
        else {
            TextView textView;
            if (f2) {
                textView = this.b;
            }
            else {
                textView = this.c;
            }
            TextView textView2;
            if (f3) {
                textView2 = this.c;
            }
            else {
                textView2 = this.b;
            }
            final tt tt3 = (tt)((View)textView).getLayoutParams();
            final tt tt4 = (tt)((View)textView2).getLayoutParams();
            final boolean b2 = (f2 && this.b.getMeasuredWidth() > 0) || (f3 && this.c.getMeasuredWidth() > 0);
            switch (this.E & 0x70) {
                default: {
                    final int n8 = (height - paddingTop - paddingBottom - n) / 2;
                    if (n8 < tt3.topMargin + this.A) {
                        n = tt3.topMargin + this.A;
                    }
                    else {
                        n = height - paddingBottom - n - n8 - paddingTop;
                        if (n < tt3.bottomMargin + this.B) {
                            n = Math.max(0, n8 - (tt4.bottomMargin + this.B - n));
                        }
                        else {
                            n = n8;
                        }
                    }
                    n += paddingTop;
                    break;
                }
                case 80: {
                    n = height - paddingBottom - tt4.bottomMargin - this.B - n;
                    break;
                }
                case 48: {
                    n = this.getPaddingTop() + tt3.topMargin + this.A;
                    break;
                }
            }
            final int n9 = i;
            if (f == 1) {
                if (b2) {
                    i = this.y;
                }
                else {
                    i = 0;
                }
                final int n10 = i - k[1];
                i = n7 - Math.max(0, n10);
                k[1] = Math.max(0, -n10);
                int n13;
                if (f2) {
                    final tt tt5 = (tt)this.b.getLayoutParams();
                    final int n11 = i - this.b.getMeasuredWidth();
                    final int n12 = this.b.getMeasuredHeight() + n;
                    this.b.layout(n11, n, i, n12);
                    n = n11 - this.z;
                    n13 = n12 + tt5.bottomMargin;
                }
                else {
                    final int n14 = i;
                    n13 = n;
                    n = n14;
                }
                int n16;
                if (f3) {
                    final tt tt6 = (tt)this.c.getLayoutParams();
                    final int n15 = n13 + tt6.topMargin;
                    this.c.layout(i - this.c.getMeasuredWidth(), n15, i, this.c.getMeasuredHeight() + n15);
                    n16 = i - this.z;
                    final int bottomMargin = tt6.bottomMargin;
                }
                else {
                    n16 = i;
                }
                if (b2) {
                    i = Math.min(n, n16);
                }
                n = n9;
                n7 = i;
            }
            else {
                if (b2) {
                    i = this.y;
                }
                else {
                    i = 0;
                }
                final int n17 = i - k[0];
                i = n9 + Math.max(0, n17);
                k[0] = Math.max(0, -n17);
                int n20;
                if (f2) {
                    final tt tt7 = (tt)this.b.getLayoutParams();
                    final int n18 = this.b.getMeasuredWidth() + i;
                    final int n19 = this.b.getMeasuredHeight() + n;
                    this.b.layout(i, n, n18, n19);
                    n = n18 + this.z;
                    n20 = n19 + tt7.bottomMargin;
                }
                else {
                    final int n21 = i;
                    n20 = n;
                    n = n21;
                }
                int n24;
                if (f3) {
                    final tt tt8 = (tt)this.c.getLayoutParams();
                    final int n22 = n20 + tt8.topMargin;
                    final int n23 = this.c.getMeasuredWidth() + i;
                    this.c.layout(i, n22, n23, this.c.getMeasuredHeight() + n22);
                    n24 = n23 + this.z;
                    final int bottomMargin2 = tt8.bottomMargin;
                }
                else {
                    n24 = i;
                }
                if (b2) {
                    n = Math.max(n, n24);
                }
                else {
                    n = i;
                }
            }
        }
        final int n25 = n2;
        final int n26 = j;
        this.B(this.J, 3);
        for (j = this.J.size(), i = 0; i < j; ++i) {
            n = this.y(this.J.get(i), n, k, n25);
        }
        this.B(this.J, 5);
        for (j = this.J.size(), i = 0; i < j; ++i) {
            n7 = this.z(this.J.get(i), n7, k, n25);
        }
        this.B(this.J, 1);
        final ArrayList l = this.J;
        int max = k[0];
        n2 = k[1];
        final int size = l.size();
        j = 0;
        i = 0;
        while (j < size) {
            final View view = (View)l.get(j);
            final tt tt9 = (tt)view.getLayoutParams();
            final int n27 = tt9.leftMargin - max;
            n2 = tt9.rightMargin - n2;
            final int max2 = Math.max(0, n27);
            final int max3 = Math.max(0, n2);
            max = Math.max(0, -n27);
            n2 = Math.max(0, -n2);
            i += max2 + view.getMeasuredWidth() + max3;
            ++j;
        }
        j = 0;
        n2 = n26 + (width - n26 - paddingRight) / 2 - i / 2;
        i += n2;
        if (n2 >= n) {
            if (i > n7) {
                n = n2 - (i - n7);
            }
            else {
                n = n2;
            }
        }
        for (n2 = this.J.size(), i = j; i < n2; ++i) {
            n = this.y(this.J.get(i), n, k, n25);
        }
        this.J.clear();
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final int[] k = this.K;
        final int b = ue.b((View)this) ? 1 : 0;
        final boolean f = this.F((View)this.d);
        final int n3 = 0;
        int n4;
        int n5;
        int n6;
        if (f) {
            this.I((View)this.d, n, 0, n2, this.x);
            n4 = this.d.getMeasuredWidth() + G((View)this.d);
            n5 = Math.max(0, this.d.getMeasuredHeight() + H((View)this.d));
            n6 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        }
        else {
            n4 = 0;
            n5 = 0;
            n6 = 0;
        }
        if (this.F((View)this.g)) {
            this.I((View)this.g, n, 0, n2, this.x);
            n4 = this.g.getMeasuredWidth() + G((View)this.g);
            n5 = Math.max(n5, this.g.getMeasuredHeight() + H((View)this.g));
            n6 = View.combineMeasuredStates(n6, this.g.getMeasuredState());
        }
        final int d = this.d();
        final int max = Math.max(d, n4);
        k[b] = Math.max(0, d - n4);
        int n7;
        if (this.F((View)this.a)) {
            this.I((View)this.a, n, max, n2, this.x);
            n7 = this.a.getMeasuredWidth() + G((View)this.a);
            n5 = Math.max(n5, this.a.getMeasuredHeight() + H((View)this.a));
            n6 = View.combineMeasuredStates(n6, this.a.getMeasuredState());
        }
        else {
            n7 = 0;
        }
        final int c = this.c();
        int n8 = max + Math.max(c, n7);
        k[b ^ 0x1] = Math.max(0, c - n7);
        int max2;
        if (this.F(this.h)) {
            n8 += this.A(this.h, n, n8, n2, 0, k);
            max2 = Math.max(n5, this.h.getMeasuredHeight() + H(this.h));
            n6 = View.combineMeasuredStates(n6, this.h.getMeasuredState());
        }
        else {
            max2 = n5;
        }
        int n9;
        int n10;
        if (this.F((View)this.w)) {
            n8 += this.A((View)this.w, n, n8, n2, 0, k);
            final int max3 = Math.max(max2, this.w.getMeasuredHeight() + H((View)this.w));
            n9 = View.combineMeasuredStates(n6, this.w.getMeasuredState());
            n10 = max3;
        }
        else {
            n9 = n6;
            n10 = max2;
        }
        final int childCount = this.getChildCount();
        int i = 0;
        int max4 = n10;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (((tt)child.getLayoutParams()).b == 0) {
                if (this.F(child)) {
                    n8 += this.A(child, n, n8, n2, 0, k);
                    max4 = Math.max(max4, child.getMeasuredHeight() + H(child));
                    n9 = View.combineMeasuredStates(n9, child.getMeasuredState());
                }
            }
            ++i;
        }
        final int n11 = this.A + this.B;
        final int n12 = this.y + this.z;
        int n14;
        int max5;
        int n16;
        if (this.F((View)this.b)) {
            this.A((View)this.b, n, n8 + n12, n2, n11, k);
            final int n13 = this.b.getMeasuredWidth() + G((View)this.b);
            final int measuredHeight = this.b.getMeasuredHeight();
            final int h = H((View)this.b);
            n14 = View.combineMeasuredStates(n9, this.b.getMeasuredState());
            final int n15 = measuredHeight + h;
            max5 = n13;
            n16 = n15;
        }
        else {
            n16 = 0;
            n14 = n9;
            max5 = n3;
        }
        if (this.F((View)this.c)) {
            max5 = Math.max(max5, this.A((View)this.c, n, n8 + n12, n2, n16 + n11, k));
            n16 += this.c.getMeasuredHeight() + H((View)this.c);
            n14 = View.combineMeasuredStates(n14, this.c.getMeasuredState());
        }
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(n8 + max5 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, 0xFF000000 & n14), View.resolveSizeAndState(Math.max(Math.max(max4, n16) + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, n14 << 16));
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof tv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final tv tv = (tv)parcelable;
        super.onRestoreInstanceState(tv.d);
        final ActionMenuView a = this.a;
        Object a2;
        if (a != null) {
            a2 = a.a;
        }
        else {
            a2 = null;
        }
        final int a3 = tv.a;
        if (a3 != 0 && this.s != null && a2 != null) {
            final MenuItem item = ((Menu)a2).findItem(a3);
            if (item != null) {
                item.expandActionView();
            }
        }
        if (tv.b) {
            this.removeCallbacks(this.M);
            this.post(this.M);
        }
    }
    
    public final void onRtlPropertiesChanged(int n) {
        super.onRtlPropertiesChanged(n);
        this.j();
        final sz n2 = this.n;
        boolean g = true;
        if (n != 1) {
            g = false;
        }
        if (g == n2.g) {
            return;
        }
        n2.g = g;
        if (!n2.h) {
            n2.a = n2.e;
            n2.b = n2.f;
            return;
        }
        if (g) {
            if ((n = n2.d) == Integer.MIN_VALUE) {
                n = n2.e;
            }
            n2.a = n;
            if ((n = n2.c) == Integer.MIN_VALUE) {
                n = n2.f;
            }
            n2.b = n;
            return;
        }
        if ((n = n2.c) == Integer.MIN_VALUE) {
            n = n2.e;
        }
        n2.a = n;
        if ((n = n2.d) == Integer.MIN_VALUE) {
            n = n2.f;
        }
        n2.b = n;
    }
    
    protected final Parcelable onSaveInstanceState() {
        final tv tv = new tv(super.onSaveInstanceState());
        final ts s = this.s;
        if (s != null) {
            final my b = s.b;
            if (b != null) {
                tv.a = b.a;
            }
        }
        tv.b = this.s();
        return (Parcelable)tv;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        int actionMasked;
        if ((actionMasked = motionEvent.getActionMasked()) == 0) {
            this.H = false;
            actionMasked = 0;
        }
        if (!this.H) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.H = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }
    
    public final void p(final int j) {
        if (this.j != j) {
            if ((this.j = j) == 0) {
                this.i = this.getContext();
                return;
            }
            this.i = (Context)new ContextThemeWrapper(this.getContext(), j);
        }
    }
    
    public final void q(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                final Context context = this.getContext();
                (this.c = new pt(context)).setSingleLine();
                this.c.setEllipsize(TextUtils$TruncateAt.END);
                final int l = this.l;
                if (l != 0) {
                    this.c.setTextAppearance(context, l);
                }
                final ColorStateList g = this.G;
                if (g != null) {
                    this.c.setTextColor(g);
                }
            }
            if (!this.E((View)this.c)) {
                this.C((View)this.c, true);
            }
        }
        else {
            final TextView c = this.c;
            if (c != null && this.E((View)c)) {
                this.removeView((View)this.c);
                this.q.remove(this.c);
            }
        }
        final TextView c2 = this.c;
        if (c2 != null) {
            c2.setText(charSequence);
        }
        this.p = charSequence;
    }
    
    public final void r(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                final Context context = this.getContext();
                (this.b = new pt(context)).setSingleLine();
                this.b.setEllipsize(TextUtils$TruncateAt.END);
                final int k = this.k;
                if (k != 0) {
                    this.b.setTextAppearance(context, k);
                }
                final ColorStateList f = this.F;
                if (f != null) {
                    this.b.setTextColor(f);
                }
            }
            if (!this.E((View)this.b)) {
                this.C((View)this.b, true);
            }
        }
        else {
            final TextView b = this.b;
            if (b != null && this.E((View)b)) {
                this.removeView((View)this.b);
                this.q.remove(this.b);
            }
        }
        final TextView b2 = this.b;
        if (b2 != null) {
            b2.setText(charSequence);
        }
        this.o = charSequence;
    }
    
    public final boolean s() {
        final ActionMenuView a = this.a;
        if (a != null) {
            final og c = a.c;
            if (c != null && c.l()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean t() {
        final ActionMenuView a = this.a;
        if (a != null) {
            final og c = a.c;
            if (c != null && c.m()) {
                return true;
            }
        }
        return false;
    }
}
