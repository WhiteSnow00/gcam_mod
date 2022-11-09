// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.widget.Scroller;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import android.widget.EdgeEffect;
import android.view.animation.Interpolator;
import android.view.ViewGroup;

public class ViewPager extends ViewGroup
{
    public static final int[] a;
    private static final Interpolator f;
    private boolean A;
    private int B;
    private final Runnable C;
    private int D;
    public EdgeEffect b;
    public EdgeEffect c;
    public List d;
    public List e;
    private final ArrayList g;
    private final agg h;
    private final Rect i;
    private Scroller j;
    private float k;
    private float l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private float t;
    private float u;
    private float v;
    private float w;
    private int x;
    private VelocityTracker y;
    private boolean z;
    
    static {
        a = new int[] { 16842931 };
        f = (Interpolator)new abn(2);
    }
    
    public ViewPager(final Context context) {
        super(context);
        this.g = new ArrayList();
        this.h = new agg();
        this.i = new Rect();
        this.k = -3.4028235E38f;
        this.l = Float.MAX_VALUE;
        this.s = true;
        this.x = -1;
        this.z = true;
        this.C = new agd(this);
        this.D = 0;
        this.e(context);
    }
    
    public ViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = new ArrayList();
        this.h = new agg();
        this.i = new Rect();
        this.k = -3.4028235E38f;
        this.l = Float.MAX_VALUE;
        this.s = true;
        this.x = -1;
        this.z = true;
        this.C = new agd(this);
        this.D = 0;
        this.e(context);
    }
    
    private final int i() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }
    
    private final Rect j(final Rect rect, final View view) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewGroup viewGroup;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof ViewGroup && viewParent != this; viewParent = viewGroup.getParent()) {
            viewGroup = (ViewGroup)viewParent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
        }
        return rect2;
    }
    
    private final boolean k(final int n) {
        if (this.g.size() == 0) {
            if (this.z) {
                return false;
            }
            this.A = false;
            this.h(0, 0.0f);
            if (this.A) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        else {
            final int i = this.i();
            float n2;
            if (i > 0) {
                n2 = this.getScrollX() / (float)i;
            }
            else {
                n2 = 0.0f;
            }
            float n3;
            if (i > 0) {
                n3 = 0.0f / i;
            }
            else {
                n3 = 0.0f;
            }
            agg agg = null;
            int j = 0;
            int n4 = 1;
            int b = -1;
            float e = 0.0f;
            while (j < this.g.size()) {
                final agg agg2 = this.g.get(j);
                if (n4 == 0) {
                    ++b;
                    if (agg2.b != b) {
                        final agg h = this.h;
                        h.e = e + 0.0f + n3;
                        h.b = b;
                        throw null;
                    }
                }
                e = agg2.e;
                final float d = agg2.d;
                if (n4 == 0 && n2 < e) {
                    break;
                }
                if (n2 < e + 0.0f + n3 || j == this.g.size() - 1) {
                    agg = agg2;
                    break;
                }
                b = agg2.b;
                final float d2 = agg2.d;
                ++j;
                agg = agg2;
                n4 = 0;
            }
            final float n5 = (float)this.i();
            final int b2 = agg.b;
            final float e2 = agg.e;
            final float d3 = agg.d;
            this.A = false;
            this.h(b2, (n / n5 - e2) / (0.0f / n5 + 0.0f));
            if (this.A) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }
    
    private final void l() {
        for (int i = 0; i < this.g.size(); ++i) {
            final boolean c = this.g.get(i).c;
        }
    }
    
    public final void a(final int d) {
        if (this.D == d) {
            return;
        }
        this.D = d;
        final List d2 = this.d;
        if (d2 != null) {
            for (int size = d2.size(), i = 0; i < size; ++i) {
                final agj agj = this.d.get(i);
                if (agj != null) {
                    agj.a(d);
                }
            }
        }
    }
    
    public final void addFocusables(final ArrayList list, int i, final int n) {
        final int size = list.size();
        final int descendantFocusability = this.getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (i = 0; i < this.getChildCount(); ++i) {
                if (this.getChildAt(i).getVisibility() == 0) {
                    this.f();
                }
            }
            if (descendantFocusability == 262144 && size != list.size()) {
                return;
            }
        }
        if (!this.isFocusable()) {
            return;
        }
        if ((n & 0x1) == 0x1 && this.isInTouchMode() && !this.isFocusableInTouchMode()) {
            return;
        }
        if (list != null) {
            list.add(this);
        }
    }
    
    public final void addTouchables(final ArrayList list) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            if (this.getChildAt(i).getVisibility() == 0) {
                this.f();
            }
        }
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        ViewGroup$LayoutParams generateDefaultLayoutParams = viewGroup$LayoutParams;
        if (!this.checkLayoutParams(viewGroup$LayoutParams)) {
            generateDefaultLayoutParams = this.generateDefaultLayoutParams();
        }
        final agh agh = (agh)generateDefaultLayoutParams;
        agh.a |= (view.getClass().getAnnotation(agf.class) != null);
        super.addView(view, n, generateDefaultLayoutParams);
    }
    
    public final void b(final boolean m) {
        if (this.m != m) {
            this.m = m;
        }
    }
    
    public final boolean c(final int n) {
        final View focus = this.findFocus();
        View view = null;
        Label_0161: {
            if (focus == this) {
                view = null;
            }
            else if (focus != null) {
                for (ViewParent viewParent = focus.getParent(); viewParent instanceof ViewGroup; viewParent = viewParent.getParent()) {
                    if (viewParent == this) {
                        view = focus;
                        break Label_0161;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(focus.getClass().getSimpleName());
                for (ViewParent viewParent2 = focus.getParent(); viewParent2 instanceof ViewGroup; viewParent2 = viewParent2.getParent()) {
                    sb.append(" => ");
                    sb.append(viewParent2.getClass().getSimpleName());
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                sb2.append(sb.toString());
                Log.e("ViewPager", sb2.toString());
                view = null;
            }
            else {
                view = focus;
            }
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, n);
        boolean b = false;
        if (nextFocus != null && nextFocus != view) {
            if (n == 17) {
                final int left = this.j(this.i, nextFocus).left;
                final int left2 = this.j(this.i, view).left;
                if (view == null || left < left2) {
                    b = nextFocus.requestFocus();
                }
            }
            else if (n == 66) {
                final int left3 = this.j(this.i, nextFocus).left;
                final int left4 = this.j(this.i, view).left;
                if (view == null || left3 > left4) {
                    b = nextFocus.requestFocus();
                }
            }
        }
        else if (n != 17) {
            if (n != 1) {
                if (n == 66 || n == 2) {}
            }
        }
        if (b) {
            this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(n));
        }
        return b;
    }
    
    public final boolean canScrollHorizontally(final int n) {
        return false;
    }
    
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof agh && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void computeScroll() {
        if (!this.j.isFinished() && this.j.computeScrollOffset()) {
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.j.getCurrX();
            final int currY = this.j.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
                if (!this.k(currX)) {
                    this.j.abortAnimation();
                    this.scrollTo(0, currY);
                }
            }
            ik.z((View)this);
            return;
        }
        this.l();
    }
    
    protected final boolean d(final View view, final boolean b, final int n, final int n2, final int n3) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                final int n4 = n2 + scrollX;
                if (n4 >= child.getLeft() && n4 < child.getRight()) {
                    final int n5 = n3 + scrollY;
                    if (n5 >= child.getTop() && n5 < child.getBottom()) {
                        if (this.d(child, true, n, n4 - child.getLeft(), n5 - child.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        return b && view.canScrollHorizontally(-n);
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            boolean c = false;
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    default: {
                        c = false;
                        break;
                    }
                    case 61: {
                        if (keyEvent.hasNoModifiers()) {
                            c = this.c(2);
                            break;
                        }
                        c = (keyEvent.hasModifiers(1) && this.c(1));
                        break;
                    }
                    case 22: {
                        c = (!keyEvent.hasModifiers(2) && this.c(66));
                        break;
                    }
                    case 21: {
                        c = (!keyEvent.hasModifiers(2) && this.c(17));
                        break;
                    }
                }
            }
            else {
                c = false;
            }
            if (!c) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            if (this.getChildAt(i).getVisibility() == 0) {
                this.f();
            }
        }
        return false;
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.getOverScrollMode() == 0) {
            boolean draw;
            if (!this.b.isFinished()) {
                final int save = canvas.save();
                final int n = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                final int width = this.getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float)(-n + this.getPaddingTop()), this.k * width);
                this.b.setSize(n, width);
                draw = this.b.draw(canvas);
                canvas.restoreToCount(save);
            }
            else {
                draw = false;
            }
            if (!this.c.isFinished()) {
                final int save2 = canvas.save();
                final int width2 = this.getWidth();
                final int height = this.getHeight();
                final int paddingTop = this.getPaddingTop();
                final int paddingBottom = this.getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float)(-this.getPaddingTop()), -(this.l + 1.0f) * width2);
                this.c.setSize(height - paddingTop - paddingBottom, width2);
                draw |= this.c.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (draw) {
                ik.z((View)this);
            }
            return;
        }
        this.b.finish();
        this.c.finish();
    }
    
    final void e(final Context context) {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        this.j = new Scroller(context, ViewPager.f);
        final ViewConfiguration value = ViewConfiguration.get(context);
        final float density = context.getResources().getDisplayMetrics().density;
        this.r = value.getScaledPagingTouchSlop();
        value.getScaledMaximumFlingVelocity();
        this.b = new EdgeEffect(context);
        this.c = new EdgeEffect(context);
        this.p = (int)(density * 16.0f);
        ik.F((View)this, new agi());
        if (ik.d((View)this) == 0) {
            ik.K((View)this, 1);
        }
        ik.L((View)this, new age(this));
    }
    
    final void f() {
        if (this.g.size() <= 0) {
            return;
        }
        final Object a = this.g.get(0).a;
        throw null;
    }
    
    final agg g() {
        for (int i = 0; i < this.g.size(); ++i) {
            final agg agg = this.g.get(i);
            if (agg.b == 0) {
                return agg;
            }
        }
        return null;
    }
    
    protected final ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new agh();
    }
    
    public final ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new agh(this.getContext(), set);
    }
    
    protected final ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return this.generateDefaultLayoutParams();
    }
    
    protected final int getChildDrawingOrder(final int n, final int n2) {
        throw null;
    }
    
    protected final void h(final int n, final float n2) {
        final int b = this.B;
        final int n3 = 0;
        if (b > 0) {
            final int scrollX = this.getScrollX();
            int paddingLeft = this.getPaddingLeft();
            int paddingRight = this.getPaddingRight();
            final int width = this.getWidth();
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                final agh agh = (agh)child.getLayoutParams();
                if (agh.a) {
                    int max = 0;
                    switch (agh.b & 0x7) {
                        default: {
                            final int n4 = paddingLeft;
                            max = paddingLeft;
                            paddingLeft = n4;
                            break;
                        }
                        case 5: {
                            final int measuredWidth = child.getMeasuredWidth();
                            final int n5 = paddingRight + child.getMeasuredWidth();
                            max = width - paddingRight - measuredWidth;
                            paddingRight = n5;
                            break;
                        }
                        case 3: {
                            final int n6 = child.getWidth() + paddingLeft;
                            max = paddingLeft;
                            paddingLeft = n6;
                            break;
                        }
                        case 1: {
                            max = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        }
                    }
                    final int n7 = max + scrollX - child.getLeft();
                    if (n7 != 0) {
                        child.offsetLeftAndRight(n7);
                    }
                }
            }
        }
        final List d = this.d;
        if (d != null) {
            for (int size = d.size(), j = n3; j < size; ++j) {
                final agj agj = this.d.get(j);
                if (agj != null) {
                    agj.b(n, n2);
                }
            }
        }
        this.A = true;
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z = true;
    }
    
    protected final void onDetachedFromWindow() {
        this.removeCallbacks(this.C);
        final Scroller j = this.j;
        if (j != null && !j.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int n = motionEvent.getAction() & 0xFF;
        int n2 = 0;
        if (n != 3 && n != 1) {
            if (n != 0) {
                if (this.n) {
                    return true;
                }
                if (this.o) {
                    return false;
                }
                switch (n) {
                    case 6: {
                        final int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) != this.x) {
                            break;
                        }
                        if (actionIndex == 0) {
                            n2 = 1;
                        }
                        this.t = motionEvent.getX(n2);
                        this.x = motionEvent.getPointerId(n2);
                        final VelocityTracker y = this.y;
                        if (y != null) {
                            y.clear();
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final int x = this.x;
                        if (x == -1) {
                            break;
                        }
                        final int pointerIndex = motionEvent.findPointerIndex(x);
                        final float x2 = motionEvent.getX(pointerIndex);
                        final float n3 = x2 - this.t;
                        final float abs = Math.abs(n3);
                        final float y2 = motionEvent.getY(pointerIndex);
                        final float abs2 = Math.abs(y2 - this.w);
                        Label_0309: {
                            if (n3 != 0.0f) {
                                final float t = this.t;
                                if (!this.s) {
                                    if (t < this.q && n3 > 0.0f) {
                                        break Label_0309;
                                    }
                                    if (t > this.getWidth() - this.q && n3 < 0.0f) {
                                        break Label_0309;
                                    }
                                }
                                if (this.d((View)this, false, (int)n3, (int)x2, (int)y2)) {
                                    this.t = x2;
                                    this.u = y2;
                                    this.o = true;
                                    return false;
                                }
                            }
                        }
                        final float n4 = (float)this.r;
                        if (abs > n4 && abs * 0.5f > abs2) {
                            this.n = true;
                            final ViewParent parent = this.getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            this.a(1);
                            float t2;
                            if (n3 > 0.0f) {
                                t2 = this.v + this.r;
                            }
                            else {
                                t2 = this.v - this.r;
                            }
                            this.t = t2;
                            this.u = y2;
                            this.b(true);
                        }
                        else if (abs2 > n4) {
                            this.o = true;
                        }
                        if (!this.n) {
                            break;
                        }
                        final float n5 = this.t - x2;
                        this.t = x2;
                        final float n6 = y2 / this.getHeight();
                        final float n7 = n5 / this.getWidth();
                        float f;
                        if (aag.e(this.b) != 0.0f) {
                            f = -aag.f(this.b, -n7, 1.0f - n6);
                        }
                        else if (aag.e(this.c) != 0.0f) {
                            f = aag.f(this.c, n7, n6);
                        }
                        else {
                            f = 0.0f;
                        }
                        final float n8 = f * this.getWidth();
                        if (Math.abs(n5 - n8) >= 1.0E-4f) {
                            this.getScrollX();
                            this.i();
                            final agg agg = this.g.get(0);
                            final ArrayList g = this.g;
                            final agg agg2 = g.get(g.size() - 1);
                            if (agg.b != 0) {
                                final float e = agg.e;
                            }
                            final int b = agg2.b;
                            throw null;
                        }
                        if (n8 != 0.0f) {
                            ik.z((View)this);
                            break;
                        }
                        break;
                    }
                }
            }
            else {
                final float x3 = motionEvent.getX();
                this.v = x3;
                this.t = x3;
                final float y3 = motionEvent.getY();
                this.w = y3;
                this.u = y3;
                this.x = motionEvent.getPointerId(0);
                this.o = false;
                this.j.computeScrollOffset();
                if (aag.e(this.b) == 0.0f && aag.e(this.c) == 0.0f) {
                    this.l();
                    this.n = false;
                }
                else {
                    this.n = true;
                    this.a(1);
                    if (aag.e(this.b) != 0.0f) {
                        aag.f(this.b, 0.0f, 1.0f - this.u / this.getHeight());
                    }
                    if (aag.e(this.c) != 0.0f) {
                        aag.f(this.c, 0.0f, this.u / this.getHeight());
                    }
                }
            }
            if (this.y == null) {
                this.y = VelocityTracker.obtain();
            }
            this.y.addMovement(motionEvent);
            return this.n;
        }
        this.x = -1;
        this.n = false;
        this.o = false;
        final VelocityTracker y4 = this.y;
        if (y4 != null) {
            y4.recycle();
            this.y = null;
        }
        this.b.onRelease();
        this.c.onRelease();
        if (this.b.isFinished()) {
            this.c.isFinished();
        }
        return false;
    }
    
    protected final void onLayout(final boolean b, int i, int paddingLeft, int paddingBottom, int paddingRight) {
        final int childCount = this.getChildCount();
        final int n = paddingBottom - i;
        final int n2 = paddingRight - paddingLeft;
        paddingLeft = this.getPaddingLeft();
        i = this.getPaddingTop();
        paddingRight = this.getPaddingRight();
        paddingBottom = this.getPaddingBottom();
        final int scrollX = this.getScrollX();
        int j = 0;
        int b2 = 0;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            if (child.getVisibility() != 8) {
                final agh agh = (agh)child.getLayoutParams();
                if (agh.a) {
                    final int b3 = agh.b;
                    int max = 0;
                    switch (b3 & 0x7) {
                        default: {
                            final int n3 = paddingLeft;
                            max = paddingLeft;
                            paddingLeft = n3;
                            break;
                        }
                        case 5: {
                            final int measuredWidth = child.getMeasuredWidth();
                            final int n4 = paddingRight + child.getMeasuredWidth();
                            max = n - paddingRight - measuredWidth;
                            paddingRight = n4;
                            break;
                        }
                        case 3: {
                            final int n5 = child.getMeasuredWidth() + paddingLeft;
                            max = paddingLeft;
                            paddingLeft = n5;
                            break;
                        }
                        case 1: {
                            max = Math.max((n - child.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        }
                    }
                    int max2 = 0;
                    switch (b3 & 0x70) {
                        default: {
                            final int n6 = i;
                            max2 = i;
                            i = n6;
                            break;
                        }
                        case 80: {
                            final int measuredHeight = child.getMeasuredHeight();
                            final int n7 = paddingBottom + child.getMeasuredHeight();
                            max2 = n2 - paddingBottom - measuredHeight;
                            paddingBottom = n7;
                            break;
                        }
                        case 48: {
                            final int n8 = child.getMeasuredHeight() + i;
                            max2 = i;
                            i = n8;
                            break;
                        }
                        case 16: {
                            max2 = Math.max((n2 - child.getMeasuredHeight()) / 2, i);
                            break;
                        }
                    }
                    final int n9 = max + scrollX;
                    child.layout(n9, max2, child.getMeasuredWidth() + n9, max2 + child.getMeasuredHeight());
                    ++b2;
                }
            }
            ++j;
        }
        View child2;
        for (i = 0; i < childCount; ++i) {
            child2 = this.getChildAt(i);
            if (child2.getVisibility() != 8 && !((agh)child2.getLayoutParams()).a) {
                this.f();
            }
        }
        this.B = b2;
        if (this.z) {
            final agg g = this.g();
            if (g != null) {
                i = (int)(this.i() * Math.max(this.k, Math.min(g.e, this.l)));
            }
            else {
                i = 0;
            }
            this.l();
            this.scrollTo(i, 0);
            this.k(i);
        }
        this.z = false;
    }
    
    protected final void onMeasure(int measuredWidth, int i) {
        this.setMeasuredDimension(getDefaultSize(0, measuredWidth), getDefaultSize(0, i));
        measuredWidth = this.getMeasuredWidth();
        this.q = Math.min(measuredWidth / 10, this.p);
        measuredWidth = measuredWidth - this.getPaddingLeft() - this.getPaddingRight();
        i = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        final int childCount = this.getChildCount();
        int n = 0;
        while (true) {
            int n2 = 1073741824;
            if (n >= childCount) {
                break;
            }
            final View child = this.getChildAt(n);
            if (child.getVisibility() != 8) {
                final agh agh = (agh)child.getLayoutParams();
                if (agh != null && agh.a) {
                    final int b = agh.b;
                    final int n3 = b & 0x7;
                    final int n4 = b & 0x70;
                    boolean b2 = true;
                    final boolean b3 = n4 == 48 || n4 == 80;
                    if (n3 != 3) {
                        if (n3 != 5) {
                            b2 = false;
                        }
                    }
                    int n5 = Integer.MIN_VALUE;
                    int n6;
                    if (b3) {
                        n5 = 1073741824;
                        n6 = Integer.MIN_VALUE;
                    }
                    else if (b2) {
                        n6 = 1073741824;
                    }
                    else {
                        n6 = Integer.MIN_VALUE;
                    }
                    int width;
                    if (agh.width != -2) {
                        if (agh.width != -1) {
                            width = agh.width;
                            n5 = 1073741824;
                        }
                        else {
                            width = measuredWidth;
                            n5 = 1073741824;
                        }
                    }
                    else {
                        width = measuredWidth;
                    }
                    int height;
                    if (agh.height != -2) {
                        if (agh.height != -1) {
                            height = agh.height;
                        }
                        else {
                            height = i;
                        }
                    }
                    else {
                        final int n7 = i;
                        n2 = n6;
                        height = n7;
                    }
                    child.measure(View$MeasureSpec.makeMeasureSpec(width, n5), View$MeasureSpec.makeMeasureSpec(height, n2));
                    if (b3) {
                        i -= child.getMeasuredHeight();
                    }
                    else if (b2) {
                        measuredWidth -= child.getMeasuredWidth();
                    }
                }
            }
            ++n;
        }
        View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(i, 1073741824);
        int childCount2;
        View child2;
        agh agh2;
        float c;
        for (childCount2 = this.getChildCount(), i = 0; i < childCount2; ++i) {
            child2 = this.getChildAt(i);
            if (child2.getVisibility() != 8) {
                agh2 = (agh)child2.getLayoutParams();
                if (agh2 == null || !agh2.a) {
                    c = agh2.c;
                    child2.measure(View$MeasureSpec.makeMeasureSpec((int)(measuredWidth * 0.0f), 1073741824), measureSpec);
                }
            }
        }
    }
    
    protected final boolean onRequestFocusInDescendants(int i, final Rect rect) {
        final int childCount = this.getChildCount();
        int n = -1;
        int n2;
        if ((i & 0x2) != 0x0) {
            n = childCount;
            n2 = 1;
            i = 0;
        }
        else {
            i = childCount - 1;
            n2 = -1;
        }
        while (i != n) {
            if (this.getChildAt(i).getVisibility() == 0) {
                this.f();
            }
            i += n2;
        }
        return false;
    }
    
    public final void onRestoreInstanceState(Parcelable b) {
        if (!(b instanceof agk)) {
            super.onRestoreInstanceState(b);
            return;
        }
        final agk agk = (agk)b;
        super.onRestoreInstanceState(agk.d);
        final int a = agk.a;
        b = agk.b;
        final ClassLoader e = agk.e;
    }
    
    public final Parcelable onSaveInstanceState() {
        final agk agk = new agk(super.onSaveInstanceState());
        agk.a = 0;
        return (Parcelable)agk;
    }
    
    protected final void onSizeChanged(int n, int paddingRight, final int n2, int paddingRight2) {
        super.onSizeChanged(n, paddingRight, n2, paddingRight2);
        if (n != n2) {
            if (n2 > 0 && !this.g.isEmpty()) {
                if (!this.j.isFinished()) {
                    final Scroller j = this.j;
                    this.i();
                    j.setFinalX(0);
                    return;
                }
                final int paddingLeft = this.getPaddingLeft();
                paddingRight2 = this.getPaddingRight();
                final int paddingLeft2 = this.getPaddingLeft();
                paddingRight = this.getPaddingRight();
                this.scrollTo((int)(this.getScrollX() / (float)(n2 - paddingLeft2 - paddingRight) * (n - paddingLeft - paddingRight2)), this.getScrollY());
            }
            else {
                final agg g = this.g();
                float min;
                if (g != null) {
                    min = Math.min(g.e, this.l);
                }
                else {
                    min = 0.0f;
                }
                n = (int)(min * (n - this.getPaddingLeft() - this.getPaddingRight()));
                if (n != this.getScrollX()) {
                    this.l();
                    this.scrollTo(n, this.getScrollY());
                }
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }
}
