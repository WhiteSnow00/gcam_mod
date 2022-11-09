// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.content.res.Configuration;
import android.view.WindowInsets;
import android.view.Window$Callback;
import android.view.Menu;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.OverScroller;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.ViewGroup;

public class ActionBarOverlayLayout extends ViewGroup implements py, ib, ic
{
    static final int[] a;
    private final Runnable A;
    private final id B;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public ny h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int k;
    private ContentFrameLayout l;
    private pz m;
    private Drawable n;
    private boolean o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private ix u;
    private ix v;
    private ix w;
    private ix x;
    private OverScroller y;
    private final Runnable z;
    
    static {
        a = new int[] { 2130968582, 16842841 };
    }
    
    public ActionBarOverlayLayout(final Context context) {
        this(context, null);
    }
    
    public ActionBarOverlayLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.u = ix.a;
        this.v = ix.a;
        this.w = ix.a;
        this.x = ix.a;
        this.j = new nw(this);
        this.z = new nx(this, 1);
        this.A = new nx(this);
        this.v(context);
        this.B = new id();
    }
    
    private final void v(final Context context) {
        final TypedArray obtainStyledAttributes = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.a);
        final boolean b = false;
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.n = drawable;
        this.setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.o = (context.getApplicationInfo().targetSdkVersion < 19 || b);
        this.y = new OverScroller(context);
    }
    
    private static final boolean w(final View view, final Rect rect, final boolean b) {
        final nz nz = (nz)view.getLayoutParams();
        boolean b2;
        if (nz.leftMargin != rect.left) {
            nz.leftMargin = rect.left;
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (nz.topMargin != rect.top) {
            nz.topMargin = rect.top;
            b2 = true;
        }
        if (nz.rightMargin != rect.right) {
            nz.rightMargin = rect.right;
            b2 = true;
        }
        if (b && nz.bottomMargin != rect.bottom) {
            nz.bottomMargin = rect.bottom;
            return true;
        }
        return b2;
    }
    
    public final void a(final View view, final int n, final int n2, final int[] array, final int n3) {
    }
    
    public final void b(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            this.onNestedScroll(view, n, n2, n3, n4);
        }
    }
    
    public final void c(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof nz;
    }
    
    public final void d(final View view, final int n) {
        if (n == 0) {
            this.onStopNestedScroll(view);
        }
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.n != null && !this.o) {
            int n;
            if (this.c.getVisibility() == 0) {
                n = (int)(this.c.getBottom() + this.c.getTranslationY() + 0.5f);
            }
            else {
                n = 0;
            }
            this.n.setBounds(0, n, this.getWidth(), this.n.getIntrinsicHeight() + n);
            this.n.draw(canvas);
        }
    }
    
    public final boolean e(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
    
    public final void f(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.b(view, n, n2, n3, n4, n5);
    }
    
    public final void g() {
        this.j();
        this.m.f();
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new nz(viewGroup$LayoutParams);
    }
    
    public final int getNestedScrollAxes() {
        return this.B.a();
    }
    
    public final void h() {
        this.removeCallbacks(this.z);
        this.removeCallbacks(this.A);
        final ViewPropertyAnimator i = this.i;
        if (i != null) {
            i.cancel();
        }
    }
    
    public final void i(final int n) {
        this.j();
        switch (n) {
            default: {
                return;
            }
            case 109: {
                boolean o = true;
                this.d = true;
                if (this.getContext().getApplicationInfo().targetSdkVersion >= 19) {
                    o = false;
                }
                this.o = o;
                return;
            }
            case 5: {
                this.m.g();
                return;
            }
            case 2: {
                this.m.h();
            }
        }
    }
    
    final void j() {
        if (this.l == null) {
            this.l = (ContentFrameLayout)this.findViewById(2131427383);
            this.c = (ActionBarContainer)this.findViewById(2131427384);
            final View viewById = this.findViewById(2131427382);
            pz f;
            if (viewById instanceof pz) {
                f = (pz)viewById;
            }
            else {
                if (!(viewById instanceof Toolbar)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't make a decor toolbar out of ");
                    sb.append(((Toolbar)viewById).getClass().getSimpleName());
                    throw new IllegalStateException(sb.toString());
                }
                f = ((Toolbar)viewById).f();
            }
            this.m = f;
        }
    }
    
    public final void k(int max) {
        this.h();
        max = Math.max(0, Math.min(max, this.c.getHeight()));
        this.c.setTranslationY((float)(-max));
    }
    
    public final void l(final boolean p) {
        if (p != this.p && !(this.p = p)) {
            this.h();
            this.k(0);
        }
    }
    
    public final void m(final Menu menu, final ni ni) {
        this.j();
        this.m.k(menu, ni);
    }
    
    public final void n() {
        this.j();
        this.m.l();
    }
    
    public final void o(final Window$Callback window$Callback) {
        this.j();
        this.m.o(window$Callback);
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        this.j();
        final ix m = ix.m(windowInsets, (View)this);
        boolean w = w((View)this.c, new Rect(m.b(), m.d(), m.c(), m.a()), false);
        ik.Z((View)this, m, this.r);
        final ix j = m.j(this.r.left, this.r.top, this.r.right, this.r.bottom);
        this.u = j;
        if (!this.v.equals(j)) {
            this.v = this.u;
            w = true;
        }
        if (!this.s.equals((Object)this.r)) {
            this.s.set(this.r);
        }
        else if (!w) {
            return m.g().i().h().n();
        }
        this.requestLayout();
        return m.g().i().h().n();
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v(this.getContext());
        ik.D((View)this);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h();
    }
    
    protected final void onLayout(final boolean b, int i, int paddingTop, int paddingLeft, int childCount) {
        childCount = this.getChildCount();
        paddingLeft = this.getPaddingLeft();
        paddingTop = this.getPaddingTop();
        View child;
        nz nz;
        int measuredWidth;
        int measuredHeight;
        int n;
        int n2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                nz = (nz)child.getLayoutParams();
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n = nz.leftMargin + paddingLeft;
                n2 = nz.topMargin + paddingTop;
                child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.j();
        this.measureChildWithMargins((View)this.c, n, 0, n2, 0);
        final nz nz = (nz)this.c.getLayoutParams();
        final int max = Math.max(0, this.c.getMeasuredWidth() + nz.leftMargin + nz.rightMargin);
        final int max2 = Math.max(0, this.c.getMeasuredHeight() + nz.topMargin + nz.bottomMargin);
        final int combineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        final int n3 = ik.k((View)this) & 0x100;
        int n4;
        if (n3 != 0) {
            n4 = this.k;
        }
        else if (this.c.getVisibility() != 8) {
            n4 = this.c.getMeasuredHeight();
        }
        else {
            n4 = 0;
        }
        this.t.set(this.r);
        final ix u = this.u;
        this.w = u;
        if (!this.d && n3 == 0) {
            final Rect t = this.t;
            t.top += n4;
            final Rect t2 = this.t;
            t2.bottom = t2.bottom;
            this.w = this.w.j(0, n4, 0, 0);
        }
        else {
            final gw c = gw.c(u.b(), this.w.d() + n4, this.w.c(), this.w.a());
            final iq iq = new iq(this.w);
            hh.f(c, iq);
            this.w = hh.e(iq);
        }
        w((View)this.l, this.t, true);
        if (!this.x.equals(this.w)) {
            final ix w = this.w;
            this.x = w;
            ik.q((View)this.l, w);
        }
        this.measureChildWithMargins((View)this.l, n, 0, n2, 0);
        final nz nz2 = (nz)this.l.getLayoutParams();
        final int max3 = Math.max(max, this.l.getMeasuredWidth() + nz2.leftMargin + nz2.rightMargin);
        final int max4 = Math.max(max2, this.l.getMeasuredHeight() + nz2.topMargin + nz2.bottomMargin);
        final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.l.getMeasuredState());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, combineMeasuredStates2 << 16));
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (this.p && b) {
            this.y.fling(0, 0, 0, (int)n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.y.getFinalY() > this.c.getHeight()) {
                this.h();
                this.A.run();
            }
            else {
                this.h();
                this.z.run();
            }
            return this.f = true;
        }
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public final void onNestedScroll(final View view, int q, final int n, final int n2, final int n3) {
        q = this.q + n;
        this.k(this.q = q);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, int q) {
        final id b = this.B;
        final int n = 0;
        b.b(q, 0);
        final ActionBarContainer c = this.c;
        if (c != null) {
            q = -(int)c.getTranslationY();
        }
        else {
            q = n;
        }
        this.q = q;
        this.h();
        final ny h = this.h;
        if (h != null) {
            final ln ln = (ln)h;
            final md m = ln.m;
            if (m != null) {
                m.a();
                ln.m = null;
            }
        }
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0 && this.c.getVisibility() == 0 && this.p;
    }
    
    public final void onStopNestedScroll(final View view) {
        if (this.p && !this.f) {
            if (this.q <= this.c.getHeight()) {
                this.h();
                this.postDelayed(this.z, 600L);
                return;
            }
            this.h();
            this.postDelayed(this.A, 600L);
        }
    }
    
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(final int g) {
        super.onWindowSystemUiVisibilityChanged(g);
        this.j();
        final int g2 = this.g;
        this.g = g;
        final int n = g & 0x100;
        final ny h = this.h;
        if (h != null) {
            final boolean k = n == 0;
            final ln ln = (ln)h;
            ln.k = k;
            if ((g & 0x4) != 0x0 && n != 0) {
                if (!ln.l) {
                    ln.x(ln.l = true);
                }
            }
            else if (ln.l) {
                ln.l = false;
                ln.x(true);
            }
        }
        if (((g2 ^ g) & 0x100) != 0x0 && this.h != null) {
            ik.D((View)this);
        }
    }
    
    protected final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        this.b = n;
        final ny h = this.h;
        if (h != null) {
            ((ln)h).j = n;
        }
    }
    
    public final void p(final CharSequence charSequence) {
        this.j();
        this.m.p(charSequence);
    }
    
    public final boolean q() {
        this.j();
        return this.m.q();
    }
    
    public final boolean r() {
        this.j();
        return this.m.s();
    }
    
    public final boolean s() {
        this.j();
        return this.m.t();
    }
    
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public final boolean t() {
        this.j();
        return this.m.u();
    }
    
    public final boolean u() {
        this.j();
        return this.m.v();
    }
}
