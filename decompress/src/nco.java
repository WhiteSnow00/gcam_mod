import android.view.ViewConfiguration;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.widget.OverScroller;

// 
// Decompiled by Procyon v0.6.0
// 

public class nco extends ncr
{
    private Runnable a;
    OverScroller b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;
    
    public nco() {
        this.d = -1;
        this.f = -1;
    }
    
    public nco(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = -1;
        this.f = -1;
    }
    
    public void A(final View view) {
        throw null;
    }
    
    public void B() {
        throw null;
    }
    
    @Override
    public final boolean c(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.c) {
            final int d = this.d;
            if (d == -1) {
                return false;
            }
            final int pointerIndex = motionEvent.findPointerIndex(d);
            if (pointerIndex == -1) {
                return false;
            }
            final int e = (int)motionEvent.getY(pointerIndex);
            if (Math.abs(e - this.e) > this.f) {
                this.e = e;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.d = -1;
            final int n = (int)motionEvent.getX();
            final int e2 = (int)motionEvent.getY();
            final boolean c = this.x(view) && coordinatorLayout.l(view, n, e2);
            this.c = c;
            if (c) {
                this.e = e2;
                this.d = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                final OverScroller b = this.b;
                if (b != null) {
                    if (!b.isFinished()) {
                        this.b.abortAnimation();
                        return true;
                    }
                }
            }
        }
        final VelocityTracker g = this.g;
        if (g != null) {
            g.addMovement(motionEvent);
        }
        return false;
    }
    
    @Override
    public final boolean e(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        int n = 0;
        Label_0369: {
            int n3 = 0;
            switch (motionEvent.getActionMasked()) {
                default: {
                    n = 0;
                    break Label_0369;
                }
                case 6: {
                    int n2;
                    if (motionEvent.getActionIndex() == 0) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    this.d = motionEvent.getPointerId(n2);
                    this.e = (int)(motionEvent.getY(n2) + 0.5f);
                    n = 0;
                    break Label_0369;
                }
                case 3: {
                    n3 = 0;
                    break;
                }
                case 2: {
                    final int pointerIndex = motionEvent.findPointerIndex(this.d);
                    if (pointerIndex == -1) {
                        return false;
                    }
                    final int e = (int)motionEvent.getY(pointerIndex);
                    final int e2 = this.e;
                    this.e = e;
                    this.A(view);
                    this.B();
                    this.z(coordinatorLayout, view, -(e2 - e), 0);
                    n = 0;
                    break Label_0369;
                }
                case 1: {
                    final VelocityTracker g = this.g;
                    if (g == null) {
                        n3 = 0;
                        break;
                    }
                    g.addMovement(motionEvent);
                    this.g.computeCurrentVelocity(1000);
                    final float yVelocity = this.g.getYVelocity(this.d);
                    final int n4 = -this.w(view);
                    final Runnable a = this.a;
                    if (a != null) {
                        view.removeCallbacks(a);
                        this.a = null;
                    }
                    if (this.b == null) {
                        this.b = new OverScroller(view.getContext());
                    }
                    this.b.fling(0, 0, 0, Math.round(yVelocity), 0, 0, n4, 0);
                    if (this.b.computeScrollOffset()) {
                        ik.A(view, this.a = new ncn(this, coordinatorLayout, view));
                        n3 = 1;
                        break;
                    }
                    this.y(view);
                    n3 = 1;
                    break;
                }
            }
            this.c = false;
            this.d = -1;
            final VelocityTracker g2 = this.g;
            n = n3;
            if (g2 != null) {
                g2.recycle();
                this.g = null;
                n = n3;
            }
        }
        final VelocityTracker g3 = this.g;
        if (g3 != null) {
            g3.addMovement(motionEvent);
        }
        return this.c || n != 0;
    }
    
    public int w(final View view) {
        throw null;
    }
    
    public boolean x(final View view) {
        throw null;
    }
    
    public void y(final View view) {
        throw null;
    }
    
    public void z(final CoordinatorLayout coordinatorLayout, final View view, final int n, final int n2) {
        throw null;
    }
}
