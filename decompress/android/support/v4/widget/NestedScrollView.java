// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.widget;

import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import android.graphics.Rect;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;

public class NestedScrollView extends FrameLayout implements ic, hz
{
    private static final jq c;
    private static final int[] d;
    private float A;
    public EdgeEffect a;
    public EdgeEffect b;
    private long e;
    private final Rect f;
    private OverScroller g;
    private int h;
    private boolean i;
    private boolean j;
    private View k;
    private boolean l;
    private VelocityTracker m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final int[] t;
    private final int[] u;
    private int v;
    private int w;
    private jr x;
    private final id y;
    private final ia z;
    
    static {
        c = new jq();
        d = new int[] { 16843130 };
    }
    
    public NestedScrollView(final Context context) {
        this(context, null);
    }
    
    public NestedScrollView(final Context context, final AttributeSet set) {
        this(context, set, 2130969484);
    }
    
    public NestedScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = new Rect();
        this.i = true;
        this.j = false;
        this.k = null;
        this.l = false;
        this.o = true;
        this.s = -1;
        this.t = new int[2];
        this.u = new int[2];
        this.a = aag.g(context, set);
        this.b = aag.g(context, set);
        this.g = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(262144);
        this.setWillNotDraw(false);
        final ViewConfiguration value = ViewConfiguration.get(this.getContext());
        this.p = value.getScaledTouchSlop();
        this.q = value.getScaledMinimumFlingVelocity();
        this.r = value.getScaledMaximumFlingVelocity();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, NestedScrollView.d, n, 0);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(0, false);
        if (boolean1 != this.n) {
            this.n = boolean1;
            this.requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.y = new id();
        this.z = new ia((View)this);
        this.setNestedScrollingEnabled(true);
        ik.F((View)this, NestedScrollView.c);
    }
    
    private final void A(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.s) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.h = (int)motionEvent.getY(n);
            this.s = motionEvent.getPointerId(n);
            final VelocityTracker m = this.m;
            if (m != null) {
                m.clear();
            }
        }
    }
    
    private final void B() {
        final VelocityTracker m = this.m;
        if (m != null) {
            m.recycle();
            this.m = null;
        }
    }
    
    private final void C(final boolean b) {
        if (b) {
            this.p(2, 1);
        }
        else {
            this.j(1);
        }
        this.w = this.getScrollY();
        ik.z((View)this);
    }
    
    private final void D(final View view) {
        view.getDrawingRect(this.f);
        this.offsetDescendantRectToMyCoords(view, this.f);
        final int g = this.g(this.f);
        if (g != 0) {
            this.scrollBy(0, g);
        }
    }
    
    private final boolean E(final View view) {
        return !this.G(view, 0, this.getHeight());
    }
    
    private static boolean F(final View view, final View view2) {
        if (view == view2) {
            return true;
        }
        final ViewParent parent = view.getParent();
        return parent instanceof ViewGroup && F((View)parent, view2);
    }
    
    private final boolean G(final View view, final int n, final int n2) {
        view.getDrawingRect(this.f);
        this.offsetDescendantRectToMyCoords(view, this.f);
        return this.f.bottom + n >= this.getScrollY() && this.f.top - n <= this.getScrollY() + n2;
    }
    
    private final boolean H(final int n, int n2, final int n3) {
        final int height = this.getHeight();
        final int scrollY = this.getScrollY();
        final int n4 = height + scrollY;
        final ArrayList focusables = this.getFocusables(2);
        final int size = focusables.size();
        View view = null;
        int i = 0;
        int n5 = 0;
        while (i < size) {
            final View view2 = (View)focusables.get(i);
            final int top = view2.getTop();
            final int bottom = view2.getBottom();
            View view3 = null;
            int n6 = 0;
            Label_0256: {
                if (n2 < bottom && top < n3) {
                    final boolean b = n2 < top && bottom < n3;
                    if (view == null) {
                        view3 = view2;
                        n6 = (b ? 1 : 0);
                    }
                    else {
                        boolean b2;
                        if (n == 33) {
                            b2 = (top < view.getTop());
                        }
                        else {
                            b2 = (bottom > view.getBottom());
                        }
                        if (n5 != 0) {
                            view3 = view;
                            n6 = n5;
                            if (!b) {
                                break Label_0256;
                            }
                            view3 = view;
                            n6 = n5;
                            if (!b2) {
                                break Label_0256;
                            }
                        }
                        else {
                            if (b) {
                                view3 = view2;
                                n6 = 1;
                                break Label_0256;
                            }
                            view3 = view;
                            n6 = n5;
                            if (!b2) {
                                break Label_0256;
                            }
                        }
                        view3 = view2;
                        n6 = n5;
                    }
                }
                else {
                    n6 = n5;
                    view3 = view;
                }
            }
            ++i;
            view = view3;
            n5 = n6;
        }
        Object o;
        if ((o = view) == null) {
            o = this;
        }
        boolean b3;
        if (n2 >= scrollY && n3 <= n4) {
            b3 = false;
        }
        else {
            if (n == 33) {
                n2 -= scrollY;
            }
            else {
                n2 = n3 - n4;
            }
            this.w(n2);
            b3 = true;
        }
        if (o != this.findFocus()) {
            ((View)o).requestFocus(n);
        }
        return b3;
    }
    
    private final boolean I(final MotionEvent motionEvent) {
        boolean b;
        if (aag.e(this.a) != 0.0f) {
            aag.f(this.a, 0.0f, motionEvent.getY() / this.getHeight());
            b = true;
        }
        else {
            b = false;
        }
        if (aag.e(this.b) != 0.0f) {
            aag.f(this.b, 0.0f, 1.0f - motionEvent.getY() / this.getHeight());
            return true;
        }
        return b;
    }
    
    private final void J(int scrollY, int max, final boolean b) {
        if (this.getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.e > 250L) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int height = child.getHeight();
            final int topMargin = frameLayout$LayoutParams.topMargin;
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            final int height2 = this.getHeight();
            final int paddingTop = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            scrollY = this.getScrollY();
            max = Math.max(0, Math.min(max + scrollY, Math.max(0, height + topMargin + bottomMargin - (height2 - paddingTop - paddingBottom))));
            this.g.startScroll(this.getScrollX(), scrollY, 0, max - scrollY, 250);
            this.C(b);
        }
        else {
            if (!this.g.isFinished()) {
                this.v();
            }
            this.scrollBy(scrollY, max);
        }
        this.e = AnimationUtils.currentAnimationTimeMillis();
    }
    
    private static int u(final int n, final int n2, final int n3) {
        if (n2 >= n3 || n < 0) {
            return 0;
        }
        if (n2 + n > n3) {
            return n3 - n2;
        }
        return n;
    }
    
    private final void v() {
        this.g.abortAnimation();
        this.j(1);
    }
    
    private final void w(final int n) {
        if (n != 0) {
            if (this.o) {
                this.s(n);
                return;
            }
            this.scrollBy(0, n);
        }
    }
    
    private final void x() {
        this.l = false;
        this.B();
        this.j(0);
        this.a.onRelease();
        this.b.onRelease();
    }
    
    private final void y() {
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
    }
    
    private final void z(final int n, final int n2, final int[] array) {
        final int scrollY = this.getScrollY();
        this.scrollBy(0, n);
        final int n3 = this.getScrollY() - scrollY;
        if (array != null) {
            array[1] += n3;
        }
        this.z.g(0, n3, 0, n - n3, null, n2, array);
    }
    
    public final void a(final View view, final int n, final int n2, final int[] array, final int n3) {
        this.l(n, n2, array, null, n3);
    }
    
    public final void addView(final View view) {
        if (this.getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void addView(final View view, final int n) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public final void b(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.z(n4, n5, null);
    }
    
    public final void c(final View view, final View view2, final int n, final int n2) {
        this.y.b(n, n2);
        this.p(2, n2);
    }
    
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }
    
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }
    
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }
    
    public final void computeScroll() {
        if (this.g.isFinished()) {
            return;
        }
        this.g.computeScrollOffset();
        final int currY = this.g.getCurrY();
        final int n = currY - this.w;
        this.w = currY;
        final int[] u = this.u;
        this.l(u[1] = 0, n, u, null, 1);
        final int n2 = n - this.u[1];
        final int h = this.h();
        int n3;
        if ((n3 = n2) != 0) {
            final int scrollY = this.getScrollY();
            this.r(n2, this.getScrollX(), scrollY, h);
            final int n4 = this.getScrollY() - scrollY;
            final int n5 = n2 - n4;
            final int[] u2 = this.u;
            u2[1] = 0;
            this.q(n4, n5, this.t, 1, u2);
            n3 = n5 - this.u[1];
        }
        if (n3 != 0) {
            final int overScrollMode = this.getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && h > 0)) {
                if (n3 < 0) {
                    if (this.a.isFinished()) {
                        this.a.onAbsorb((int)this.g.getCurrVelocity());
                    }
                }
                else if (this.b.isFinished()) {
                    this.b.onAbsorb((int)this.g.getCurrVelocity());
                }
            }
            this.v();
        }
        if (!this.g.isFinished()) {
            ik.z((View)this);
            return;
        }
        this.j(1);
    }
    
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }
    
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }
    
    public final int computeVerticalScrollRange() {
        final int childCount = this.getChildCount();
        final int n = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if (childCount == 0) {
            return n;
        }
        final View child = this.getChildAt(0);
        int n2 = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin;
        final int scrollY = this.getScrollY();
        final int max = Math.max(0, n2 - n);
        if (scrollY < 0) {
            n2 -= scrollY;
        }
        else if (scrollY > max) {
            return n2 + (scrollY - max);
        }
        return n2;
    }
    
    public final void d(final View view, final int n) {
        this.y.c(n);
        this.j(n);
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.m(keyEvent);
    }
    
    public final boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.z.c(n, n2, b);
    }
    
    public final boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.z.d(n, n2);
    }
    
    public final boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.l(n, n2, array, array2, 0);
    }
    
    public final boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.z.f(n, n2, n3, n4, array);
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final int scrollY = this.getScrollY();
        final boolean finished = this.a.isFinished();
        final int n = 0;
        if (!finished) {
            final int save = canvas.save();
            int width = this.getWidth();
            final int height = this.getHeight();
            final int min = Math.min(0, scrollY);
            int paddingLeft;
            if (this.getClipToPadding()) {
                width -= this.getPaddingLeft() + this.getPaddingRight();
                paddingLeft = this.getPaddingLeft();
            }
            else {
                paddingLeft = 0;
            }
            int n2 = height;
            int n3 = min;
            if (this.getClipToPadding()) {
                n2 = height - (this.getPaddingTop() + this.getPaddingBottom());
                n3 = min + this.getPaddingTop();
            }
            canvas.translate((float)paddingLeft, (float)n3);
            this.a.setSize(width, n2);
            if (this.a.draw(canvas)) {
                ik.z((View)this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.b.isFinished()) {
            final int save2 = canvas.save();
            int width2 = this.getWidth();
            final int height2 = this.getHeight();
            final int n4 = Math.max(this.h(), scrollY) + height2;
            int paddingLeft2;
            if (this.getClipToPadding()) {
                width2 -= this.getPaddingLeft() + this.getPaddingRight();
                paddingLeft2 = this.getPaddingLeft();
            }
            else {
                paddingLeft2 = n;
            }
            int n5 = n4;
            int n6 = height2;
            if (this.getClipToPadding()) {
                n6 = height2 - (this.getPaddingTop() + this.getPaddingBottom());
                n5 = n4 - this.getPaddingBottom();
            }
            canvas.translate((float)(paddingLeft2 - width2), (float)n5);
            canvas.rotate(180.0f, (float)width2, 0.0f);
            this.b.setSize(width2, n6);
            if (this.b.draw(canvas)) {
                ik.z((View)this);
            }
            canvas.restoreToCount(save2);
        }
    }
    
    public final boolean e(final View view, final View view2, final int n, final int n2) {
        return (n & 0x2) != 0x0;
    }
    
    public final void f(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.z(n4, n5, array);
    }
    
    protected final int g(final Rect rect) {
        final int childCount = this.getChildCount();
        final int n = 0;
        if (childCount == 0) {
            return 0;
        }
        final int height = this.getHeight();
        final int scrollY = this.getScrollY();
        final int n2 = scrollY + height;
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        int n3 = scrollY;
        if (rect.top > 0) {
            n3 = scrollY + verticalFadingEdgeLength;
        }
        final View child = this.getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        int n4;
        if (rect.bottom < child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin) {
            n4 = n2 - verticalFadingEdgeLength;
        }
        else {
            n4 = n2;
        }
        int n6;
        if (rect.bottom > n4 && rect.top > n3) {
            int n5;
            if (rect.height() > height) {
                n5 = rect.top - n3;
            }
            else {
                n5 = rect.bottom - n4;
            }
            n6 = Math.min(n5, child.getBottom() + frameLayout$LayoutParams.bottomMargin - n2);
        }
        else if (rect.top < n3 && rect.bottom < n4) {
            int n7;
            if (rect.height() > height) {
                n7 = -(n4 - rect.bottom);
            }
            else {
                n7 = -(n3 - rect.top);
            }
            n6 = Math.max(n7, -this.getScrollY());
        }
        else {
            n6 = n;
        }
        return n6;
    }
    
    protected final float getBottomFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        final View child = this.getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        final int n = child.getBottom() + frameLayout$LayoutParams.bottomMargin - this.getScrollY() - (this.getHeight() - this.getPaddingBottom());
        if (n < verticalFadingEdgeLength) {
            return n / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public final int getNestedScrollAxes() {
        return this.y.a();
    }
    
    protected final float getTopFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        final int scrollY = this.getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public final int h() {
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            return Math.max(0, child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
        }
        return 0;
    }
    
    public final boolean hasNestedScrollingParent() {
        return this.o(0);
    }
    
    public final void i(final int n) {
        if (this.getChildCount() > 0) {
            this.g.fling(this.getScrollX(), this.getScrollY(), 0, n, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.C(true);
        }
    }
    
    public final boolean isNestedScrollingEnabled() {
        return this.z.a;
    }
    
    public final void j(final int n) {
        this.z.b(n);
    }
    
    public final boolean k(int descendantFocusability) {
        View focus;
        if ((focus = this.findFocus()) == this) {
            focus = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, descendantFocusability);
        int n = (int)(this.getHeight() * 0.5f);
        if (nextFocus != null && this.G(nextFocus, n, this.getHeight())) {
            nextFocus.getDrawingRect(this.f);
            this.offsetDescendantRectToMyCoords(nextFocus, this.f);
            this.w(this.g(this.f));
            nextFocus.requestFocus(descendantFocusability);
        }
        else {
            if (descendantFocusability == 33 && this.getScrollY() < n) {
                n = this.getScrollY();
            }
            else if (descendantFocusability == 130 && this.getChildCount() > 0) {
                final View child = this.getChildAt(0);
                n = Math.min(child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin - (this.getScrollY() + this.getHeight() - this.getPaddingBottom()), n);
            }
            if (n == 0) {
                return false;
            }
            if (descendantFocusability != 130) {
                n = -n;
            }
            this.w(n);
        }
        if (focus != null && focus.isFocused() && this.E(focus)) {
            descendantFocusability = this.getDescendantFocusability();
            this.setDescendantFocusability(131072);
            this.requestFocus();
            this.setDescendantFocusability(descendantFocusability);
        }
        return true;
    }
    
    public final boolean l(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        return this.z.e(n, n2, array, array2, n3);
    }
    
    public final boolean m(final KeyEvent keyEvent) {
        this.f.setEmpty();
        final int childCount = this.getChildCount();
        boolean b = false;
        if (childCount > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            if (child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    final int keyCode = keyEvent.getKeyCode();
                    int n = 33;
                    switch (keyCode) {
                        case 62: {
                            if (!keyEvent.isShiftPressed()) {
                                n = 130;
                            }
                            final int height = this.getHeight();
                            if (n == 130) {
                                this.f.top = this.getScrollY() + height;
                                final int childCount2 = this.getChildCount();
                                if (childCount2 > 0) {
                                    final View child2 = this.getChildAt(childCount2 - 1);
                                    final int n2 = child2.getBottom() + ((FrameLayout$LayoutParams)child2.getLayoutParams()).bottomMargin + this.getPaddingBottom();
                                    if (this.f.top + height > n2) {
                                        this.f.top = n2 - height;
                                    }
                                }
                            }
                            else {
                                this.f.top = this.getScrollY() - height;
                                if (this.f.top < 0) {
                                    this.f.top = 0;
                                }
                            }
                            final Rect f = this.f;
                            f.bottom = f.top + height;
                            this.H(n, this.f.top, this.f.bottom);
                            return false;
                        }
                        case 20: {
                            if (!keyEvent.isAltPressed()) {
                                b = this.k(130);
                                break;
                            }
                            b = this.n(130);
                            break;
                        }
                        case 19: {
                            if (!keyEvent.isAltPressed()) {
                                b = this.k(33);
                                break;
                            }
                            b = this.n(33);
                            break;
                        }
                    }
                }
                return b;
            }
        }
        if (this.isFocused() && keyEvent.getKeyCode() != 4) {
            View focus;
            if ((focus = this.findFocus()) == this) {
                focus = null;
            }
            final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, 130);
            if (nextFocus != null && nextFocus != this && nextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }
    
    protected final void measureChild(final View view, final int n, final int n2) {
        view.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight(), view.getLayoutParams().width), View$MeasureSpec.makeMeasureSpec(0, 0));
    }
    
    protected final void measureChildWithMargins(final View view, final int n, final int n2, final int n3, final int n4) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        view.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + n2, viewGroup$MarginLayoutParams.width), View$MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, 0));
    }
    
    public final boolean n(final int n) {
        final int height = this.getHeight();
        this.f.top = 0;
        this.f.bottom = height;
        if (n == 130) {
            final int childCount = this.getChildCount();
            if (childCount > 0) {
                final View child = this.getChildAt(childCount - 1);
                this.f.bottom = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin + this.getPaddingBottom();
                final Rect f = this.f;
                f.top = f.bottom - height;
            }
        }
        return this.H(n, this.f.top, this.f.bottom);
    }
    
    public final boolean o(final int n) {
        return this.z.h(n);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = false;
    }
    
    public final boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 0x2) != 0x0) {
            switch (motionEvent.getAction()) {
                case 8: {
                    if (this.l) {
                        break;
                    }
                    final float axisValue = motionEvent.getAxisValue(9);
                    if (axisValue == 0.0f) {
                        break;
                    }
                    float a;
                    if ((a = this.A) == 0.0f) {
                        final TypedValue typedValue = new TypedValue();
                        final Context context = this.getContext();
                        if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                        }
                        a = typedValue.getDimension(context.getResources().getDisplayMetrics());
                        this.A = a;
                    }
                    final int h = this.h();
                    final int scrollY = this.getScrollY();
                    int n = scrollY - (int)(axisValue * a);
                    if (n < 0) {
                        n = 0;
                    }
                    else if (n > h) {
                        n = h;
                    }
                    if (n != scrollY) {
                        super.scrollTo(this.getScrollX(), n);
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final boolean b = true;
        boolean l = true;
        int n = action;
        if (action == 2) {
            if (this.l) {
                return true;
            }
            n = 2;
        }
        switch (n & 0xFF) {
            case 6: {
                this.A(motionEvent);
                break;
            }
            case 2: {
                final int s = this.s;
                if (s == -1) {
                    break;
                }
                final int pointerIndex = motionEvent.findPointerIndex(s);
                if (pointerIndex == -1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(s);
                    sb.append(" in onInterceptTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                    break;
                }
                final int h = (int)motionEvent.getY(pointerIndex);
                if (Math.abs(h - this.h) <= this.p || (0x2 & this.getNestedScrollAxes()) != 0x0) {
                    break;
                }
                this.l = true;
                this.h = h;
                this.y();
                this.m.addMovement(motionEvent);
                this.v = 0;
                final ViewParent parent = this.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            }
            case 1:
            case 3: {
                this.l = false;
                this.s = -1;
                this.B();
                if (this.g.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.h())) {
                    ik.z((View)this);
                }
                this.j(0);
                break;
            }
            case 0: {
                final int h2 = (int)motionEvent.getY();
                final int n2 = (int)motionEvent.getX();
                if (this.getChildCount() > 0) {
                    final int scrollY = this.getScrollY();
                    final View child = this.getChildAt(0);
                    if (h2 >= child.getTop() - scrollY && h2 < child.getBottom() - scrollY && n2 >= child.getLeft() && n2 < child.getRight()) {
                        this.h = h2;
                        this.s = motionEvent.getPointerId(0);
                        final VelocityTracker m = this.m;
                        if (m == null) {
                            this.m = VelocityTracker.obtain();
                        }
                        else {
                            m.clear();
                        }
                        this.m.addMovement(motionEvent);
                        this.g.computeScrollOffset();
                        if (!this.I(motionEvent)) {
                            if (this.g.isFinished()) {
                                l = false;
                            }
                        }
                        this.l = l;
                        this.p(2, 0);
                        break;
                    }
                }
                boolean i;
                if (!this.I(motionEvent)) {
                    i = (!this.g.isFinished() && b);
                }
                else {
                    i = b;
                }
                this.l = i;
                this.B();
                break;
            }
        }
        return this.l;
    }
    
    protected final void onLayout(final boolean b, int u, final int n, int scrollY, final int n2) {
        super.onLayout(b, u, n, scrollY, n2);
        u = 0;
        this.i = false;
        final View k = this.k;
        if (k != null && F(k, (View)this)) {
            this.D(this.k);
        }
        this.k = null;
        if (!this.j) {
            if (this.x != null) {
                this.scrollTo(this.getScrollX(), this.x.a);
                this.x = null;
            }
            if (this.getChildCount() > 0) {
                final View child = this.getChildAt(0);
                final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
                u = child.getMeasuredHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin;
            }
            final int paddingTop = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            scrollY = this.getScrollY();
            u = u(scrollY, n2 - n - paddingTop - paddingBottom, u);
            if (u != scrollY) {
                this.scrollTo(this.getScrollX(), u);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.j = true;
    }
    
    protected final void onMeasure(final int n, int n2) {
        super.onMeasure(n, n2);
        if (!this.n) {
            return;
        }
        if (View$MeasureSpec.getMode(n2) == 0) {
            return;
        }
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int measuredHeight = child.getMeasuredHeight();
            n2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - frameLayout$LayoutParams.topMargin - frameLayout$LayoutParams.bottomMargin;
            if (measuredHeight < n2) {
                child.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + frameLayout$LayoutParams.leftMargin + frameLayout$LayoutParams.rightMargin, frameLayout$LayoutParams.width), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
            }
        }
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (!b) {
            this.dispatchNestedFling(0.0f, n2, true);
            this.i((int)n2);
            return true;
        }
        return false;
    }
    
    public final boolean onNestedPreFling(final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public final void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        this.a(view, n, n2, array, 0);
    }
    
    public final void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.z(n4, 0, null);
    }
    
    public final void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.c(view, view2, n, 0);
    }
    
    protected final void onOverScrolled(final int n, final int n2, final boolean b, final boolean b2) {
        super.scrollTo(n, n2);
    }
    
    protected final boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int n2;
        if (n == 2) {
            n2 = 130;
        }
        else if ((n2 = n) == 1) {
            n2 = 33;
        }
        View view;
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, (View)null, n2);
        }
        else {
            view = FocusFinder.getInstance().findNextFocusFromRect((ViewGroup)this, rect, n2);
        }
        return view != null && !this.E(view) && view.requestFocus(n2, rect);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof jr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final jr x = (jr)parcelable;
        super.onRestoreInstanceState(x.getSuperState());
        this.x = x;
        this.requestLayout();
    }
    
    protected final Parcelable onSaveInstanceState() {
        final jr jr = new jr(super.onSaveInstanceState());
        jr.a = this.getScrollY();
        return (Parcelable)jr;
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final View focus = this.findFocus();
        if (focus != null && this != focus) {
            if (this.G(focus, 0, n4)) {
                focus.getDrawingRect(this.f);
                this.offsetDescendantRectToMyCoords(focus, this.f);
                this.w(this.g(this.f));
            }
        }
    }
    
    public final boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.e(view, view2, n, 0);
    }
    
    public final void onStopNestedScroll(final View view) {
        this.d(view, 0);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        this.y();
        int actionMasked;
        if ((actionMasked = motionEvent.getActionMasked()) == 0) {
            this.v = 0;
            actionMasked = 0;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        final float n = (float)this.v;
        float f = 0.0f;
        obtain.offsetLocation(0.0f, n);
        switch (actionMasked) {
            case 6: {
                this.A(motionEvent);
                this.h = (int)motionEvent.getY(motionEvent.findPointerIndex(this.s));
                break;
            }
            case 5: {
                final int actionIndex = motionEvent.getActionIndex();
                this.h = (int)motionEvent.getY(actionIndex);
                this.s = motionEvent.getPointerId(actionIndex);
                break;
            }
            case 3: {
                if (this.l && this.getChildCount() > 0 && this.g.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.h())) {
                    ik.z((View)this);
                }
                this.s = -1;
                this.x();
                break;
            }
            case 2: {
                final int pointerIndex = motionEvent.findPointerIndex(this.s);
                if (pointerIndex == -1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.s);
                    sb.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                    break;
                }
                final int n2 = (int)motionEvent.getY(pointerIndex);
                final int n3 = this.h - n2;
                final float n4 = motionEvent.getX(pointerIndex) / this.getWidth();
                final float n5 = n3 / (float)this.getHeight();
                if (aag.e(this.a) != 0.0f) {
                    f = -aag.f(this.a, -n5, n4);
                    if (aag.e(this.a) == 0.0f) {
                        this.a.onRelease();
                        f = f;
                    }
                }
                else if (aag.e(this.b) != 0.0f) {
                    final float n6 = f = aag.f(this.b, n5, 1.0f - n4);
                    if (aag.e(this.b) == 0.0f) {
                        this.b.onRelease();
                        f = n6;
                    }
                }
                final int round = Math.round(f * this.getHeight());
                if (round != 0) {
                    this.invalidate();
                }
                int n8;
                final int n7 = n8 = n3 - round;
                if (!this.l) {
                    n8 = n7;
                    if (Math.abs(n7) > this.p) {
                        final ViewParent parent = this.getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.l = true;
                        if (n7 > 0) {
                            n8 = n7 - this.p;
                        }
                        else {
                            n8 = n7 + this.p;
                        }
                    }
                }
                if (!this.l) {
                    break;
                }
                int n9 = n8;
                if (this.l(0, n8, this.u, this.t, 0)) {
                    n9 = n8 - this.u[1];
                    this.v += this.t[1];
                }
                this.h = n2 - this.t[1];
                final int scrollY = this.getScrollY();
                final int h = this.h();
                final int overScrollMode = this.getOverScrollMode();
                final boolean b = overScrollMode == 0 || (overScrollMode == 1 && h > 0);
                final boolean b2 = this.r(n9, 0, this.getScrollY(), h) && !this.o(0);
                final int n10 = this.getScrollY() - scrollY;
                final int[] u = this.u;
                u[1] = 0;
                this.q(n10, n9 - n10, this.t, 0, u);
                final int h2 = this.h;
                final int n11 = this.t[1];
                this.h = h2 - n11;
                this.v += n11;
                if (b) {
                    final int n12 = n9 - this.u[1];
                    final int n13 = scrollY + n12;
                    if (n13 < 0) {
                        aag.f(this.a, -n12 / (float)this.getHeight(), motionEvent.getX(pointerIndex) / this.getWidth());
                        if (!this.b.isFinished()) {
                            this.b.onRelease();
                        }
                    }
                    else if (n13 > h) {
                        aag.f(this.b, n12 / (float)this.getHeight(), 1.0f - motionEvent.getX(pointerIndex) / this.getWidth());
                        if (!this.a.isFinished()) {
                            this.a.onRelease();
                        }
                    }
                    if (!this.a.isFinished() || !this.b.isFinished()) {
                        ik.z((View)this);
                        break;
                    }
                }
                if (b2) {
                    this.m.clear();
                    break;
                }
                break;
            }
            case 1: {
                final VelocityTracker m = this.m;
                m.computeCurrentVelocity(1000, (float)this.r);
                final int n14 = (int)m.getYVelocity(this.s);
                if (Math.abs(n14) >= this.q) {
                    if (!this.a.isFinished()) {
                        this.a.onAbsorb(n14);
                    }
                    else if (!this.b.isFinished()) {
                        this.b.onAbsorb(-n14);
                    }
                    else {
                        final int n15 = -n14;
                        final float n16 = (float)n15;
                        if (!this.dispatchNestedPreFling(0.0f, n16)) {
                            this.dispatchNestedFling(0.0f, n16, true);
                            this.i(n15);
                        }
                    }
                }
                else if (this.g.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.h())) {
                    ik.z((View)this);
                }
                this.s = -1;
                this.x();
                break;
            }
            case 0: {
                if (this.getChildCount() == 0) {
                    return false;
                }
                if (this.l) {
                    final ViewParent parent2 = this.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                }
                if (!this.g.isFinished()) {
                    this.v();
                }
                this.h = (int)motionEvent.getY();
                this.s = motionEvent.getPointerId(0);
                this.p(2, 0);
                break;
            }
        }
        final VelocityTracker i = this.m;
        if (i != null) {
            i.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }
    
    public final boolean p(final int n, final int n2) {
        return this.z.i(n, n2);
    }
    
    public final void q(final int n, final int n2, final int[] array, final int n3, final int[] array2) {
        this.z.g(0, n, 0, n2, array, n3, array2);
    }
    
    final boolean r(int n, int n2, int n3, int n4) {
        this.getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        this.computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        n3 += n;
        if (n2 > 0) {
            n = 1;
        }
        else if (n2 < 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n3 > n4) {
            n2 = 1;
        }
        else if (n3 < 0) {
            n2 = 1;
            n4 = 0;
        }
        else {
            n4 = n3;
            n2 = 0;
        }
        if (n2 != 0 && !this.o(1)) {
            this.g.springBack(0, n4, 0, 0, 0, this.h());
        }
        super.scrollTo(0, n4);
        return n != 0 || n2 != 0;
    }
    
    public final void requestChildFocus(final View view, final View k) {
        if (!this.i) {
            this.D(k);
        }
        else {
            this.k = k;
        }
        super.requestChildFocus(view, k);
    }
    
    public final boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        final int g = this.g(rect);
        final boolean b2 = g != 0;
        if (b2) {
            if (b) {
                this.scrollBy(0, g);
            }
            else {
                this.s(g);
            }
        }
        return b2;
    }
    
    public final void requestDisallowInterceptTouchEvent(final boolean b) {
        if (b) {
            this.B();
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public final void requestLayout() {
        this.i = true;
        super.requestLayout();
    }
    
    public final void s(final int n) {
        this.J(0, n, false);
    }
    
    public final void scrollTo(int u, int u2) {
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            u = u(u, this.getWidth() - this.getPaddingLeft() - this.getPaddingRight(), child.getWidth() + frameLayout$LayoutParams.leftMargin + frameLayout$LayoutParams.rightMargin);
            u2 = u(u2, this.getHeight() - this.getPaddingTop() - this.getPaddingBottom(), child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin);
            if (u != this.getScrollX() || u2 != this.getScrollY()) {
                super.scrollTo(u, u2);
            }
        }
    }
    
    public final void setNestedScrollingEnabled(final boolean b) {
        this.z.a(b);
    }
    
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
    
    public final boolean startNestedScroll(final int n) {
        return this.p(n, 0);
    }
    
    public final void stopNestedScroll() {
        this.j(0);
    }
    
    public final void t(final int n) {
        this.J(-this.getScrollX(), n - this.getScrollY(), true);
    }
}
