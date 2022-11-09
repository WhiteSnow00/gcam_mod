import android.view.ViewPropertyAnimator;
import android.util.Log;
import android.view.ViewGroup;
import android.view.View;
import android.support.wearable.view.SwipeDismissFrameLayout;
import android.animation.TimeInterpolator;
import android.view.MotionEvent;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class vd extends FrameLayout
{
    public vq a;
    public vp b;
    public vs c;
    private int d;
    private int e;
    private float f;
    private int g;
    private float h;
    private float i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private VelocityTracker o;
    private float p;
    private float q;
    private final float r;
    
    public vd(final Context context) {
        super(context);
        this.l = true;
        this.r = 0.33f;
        this.c(context);
    }
    
    public vd(final Context context, final AttributeSet set) {
        super(context, set);
        this.l = true;
        this.r = 0.33f;
        this.c(context);
    }
    
    public vd(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.l = true;
        this.r = 0.33f;
        this.c(context);
    }
    
    private final void c(final Context context) {
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.d = value.getScaledTouchSlop();
        this.e = value.getScaledMinimumFlingVelocity();
        this.f = Resources.getSystem().getDisplayMetrics().widthPixels * 0.1f;
        this.j = true;
    }
    
    private final void d() {
        final VelocityTracker o = this.o;
        if (o != null) {
            o.recycle();
        }
        this.o = null;
        this.p = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.k = false;
        this.m = false;
        this.n = false;
        this.l = true;
    }
    
    private final void e(final MotionEvent motionEvent) {
        if (!this.k) {
            final float n = motionEvent.getRawX() - this.h;
            final float n2 = motionEvent.getRawY() - this.i;
            final int d = this.d;
            if (n * n + n2 * n2 > d * d) {
                final boolean l = this.l;
                boolean b = false;
                if (l && Math.abs(n2) < Math.abs(n) && n > 0.0f) {
                    b = true;
                }
                this.k = b;
                this.l = b;
            }
        }
    }
    
    protected final void a() {
        final vs c = this.c;
        if (c != null) {
            final SwipeDismissFrameLayout a = c.a;
            a.i = false;
            a.animate().translationX(0.0f).alpha(1.0f).setDuration((long)c.a.e).setInterpolator((TimeInterpolator)c.a.f).withEndAction((Runnable)new vr(c));
        }
    }
    
    protected final boolean b(final View view, final boolean b, final float n, final float n2, final float n3) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                final float n4 = n2 + scrollX;
                if (n4 >= child.getLeft() && n4 < child.getRight()) {
                    final float n5 = n3 + scrollY;
                    if (n5 >= child.getTop() && n5 < child.getBottom()) {
                        if (this.b(child, true, n, n4 - child.getLeft(), n5 - child.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        return b && view.canScrollHorizontally((int)(-n));
    }
    
    public final boolean canScrollHorizontally(final int n) {
        return n < 0 && this.j && this.getVisibility() == 0;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (!this.j) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(this.p, 0.0f);
        switch (motionEvent.getActionMasked()) {
            case 6: {
                final int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == this.g) {
                    int n;
                    if (actionIndex == 0) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    this.g = motionEvent.getPointerId(n);
                    break;
                }
                break;
            }
            case 5: {
                this.g = motionEvent.getPointerId(motionEvent.getActionIndex());
                break;
            }
            case 2: {
                if (this.o == null || this.n) {
                    break;
                }
                final int pointerIndex = motionEvent.findPointerIndex(this.g);
                if (pointerIndex == -1) {
                    Log.e("SwipeDismissLayout", "Invalid pointer index: ignoring.");
                    this.n = true;
                    break;
                }
                final float n2 = motionEvent.getRawX() - this.h;
                final float x = motionEvent.getX(pointerIndex);
                final float y = motionEvent.getY(pointerIndex);
                if (n2 != 0.0f && this.h >= this.f && this.b((View)this, false, n2, x, y)) {
                    this.n = true;
                    break;
                }
                this.e(motionEvent);
                break;
            }
            case 1:
            case 3: {
                this.d();
                break;
            }
            case 0: {
                this.d();
                this.h = motionEvent.getRawX();
                this.i = motionEvent.getRawY();
                this.g = motionEvent.getPointerId(0);
                (this.o = VelocityTracker.obtain()).addMovement(motionEvent);
                break;
            }
        }
        final vq a = this.a;
        if (a != null) {
            a.a();
        }
        return !this.n && this.k;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.j) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.o == null) {
            return super.onTouchEvent(motionEvent);
        }
        final vq a = this.a;
        if (a != null) {
            a.a();
        }
        motionEvent.offsetLocation(this.p, 0.0f);
        switch (motionEvent.getActionMasked()) {
            case 3: {
                this.a();
                this.d();
                break;
            }
            case 2: {
                this.o.addMovement(motionEvent);
                this.q = motionEvent.getRawX();
                this.e(motionEvent);
                if (!this.k) {
                    break;
                }
                final float n = motionEvent.getRawX() - this.h;
                this.p = n;
                final vs c = this.c;
                if (c == null || n < 0.0f) {
                    break;
                }
                final int width = this.getWidth();
                c.a.setTranslationX(n);
                c.a.setAlpha(1.0f - n / width * 0.5f);
                final SwipeDismissFrameLayout a2 = c.a;
                if (a2.i) {
                    break;
                }
                final int n2 = a2.d.size() - 1;
                if (n2 < 0) {
                    c.a.i = true;
                    break;
                }
                final xn xn = c.a.d.get(n2);
                throw null;
            }
            case 1: {
                final float rawX = motionEvent.getRawX();
                final float h = this.h;
                this.o.addMovement(motionEvent);
                this.o.computeCurrentVelocity(1000);
                if (!this.m && ((rawX - h > this.getWidth() * this.r && motionEvent.getRawX() >= this.q) || this.o.getXVelocity() >= this.e)) {
                    this.m = true;
                }
                if (this.m && this.k && this.o.getXVelocity() < -this.e) {
                    this.m = false;
                }
                if (this.m) {
                    final vp b = this.b;
                    if (b != null) {
                        final ViewPropertyAnimator setDuration = b.a.animate().translationX((float)b.a.getWidth()).alpha(0.0f).setDuration((long)b.a.e);
                        final SwipeDismissFrameLayout a3 = b.a;
                        Object interpolator;
                        if (a3.i) {
                            interpolator = a3.h;
                        }
                        else {
                            interpolator = a3.g;
                        }
                        setDuration.setInterpolator((TimeInterpolator)interpolator).withEndAction((Runnable)new vo(b));
                    }
                }
                else if (this.k) {
                    this.a();
                }
                this.d();
                break;
            }
        }
        return true;
    }
}
