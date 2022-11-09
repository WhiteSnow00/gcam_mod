import java.util.Arrays;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abq
{
    private static final Interpolator e;
    public int a;
    public int b;
    public int c;
    public View d;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int m;
    private VelocityTracker n;
    private final float o;
    private float p;
    private int q;
    private final OverScroller r;
    private final abp s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable v;
    
    static {
        e = (Interpolator)new abn();
    }
    
    private abq(final Context context, final ViewGroup u, final abp s) {
        this.c = -1;
        this.v = new abo(this);
        if (s != null) {
            this.u = u;
            this.s = s;
            final ViewConfiguration value = ViewConfiguration.get(context);
            this.q = (int)(context.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
            this.b = value.getScaledTouchSlop();
            this.o = (float)value.getScaledMaximumFlingVelocity();
            this.p = (float)value.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, abq.e);
            return;
        }
        throw new NullPointerException("Callback may not be null");
    }
    
    public static abq b(final ViewGroup viewGroup, final abp abp) {
        return new abq(viewGroup.getContext(), viewGroup, abp);
    }
    
    private final int m(int n, int abs, final int n2) {
        if (n == 0) {
            return 0;
        }
        final int width = this.u.getWidth();
        final float n3 = (float)(width / 2);
        final float n4 = (float)Math.sin((Math.min(1.0f, Math.abs(n) / (float)width) - 0.5f) * 0.47123894f);
        abs = Math.abs(abs);
        if (abs > 0) {
            n = Math.round(Math.abs((n3 + n4 * n3) / abs) * 1000.0f) * 4;
        }
        else {
            n = (int)((Math.abs(n) / (float)n2 + 1.0f) * 256.0f);
        }
        return Math.min(n, 600);
    }
    
    private final void n(final int n) {
        if (this.f != null && this.h(n)) {
            this.f[n] = 0.0f;
            this.g[n] = 0.0f;
            this.h[n] = 0.0f;
            this.i[n] = 0.0f;
            this.j[n] = 0;
            this.k[n] = 0;
            this.l[n] = 0;
            this.m &= ~(1 << n);
        }
    }
    
    private final void o(final float n, final float n2) {
        this.t = true;
        this.s.d(this.d, n, n2);
        this.t = false;
        if (this.a == 1) {
            this.f(0);
        }
    }
    
    private final void p() {
        this.n.computeCurrentVelocity(1000, this.o);
        this.o(v(this.n.getXVelocity(this.c), this.p, this.o), v(this.n.getYVelocity(this.c), this.p, this.o));
    }
    
    private final void q(final float n, final float n2, final int n3) {
        this.x(n, n2, n3);
        this.x(n2, n, n3);
        this.x(n, n2, n3);
        this.x(n2, n, n3);
    }
    
    private final void r(final float n, final float n2, final int n3) {
        final float[] f = this.f;
        boolean b = false;
        if (f == null || f.length <= n3) {
            final int n4 = n3 + 1;
            final float[] f2 = new float[n4];
            final float[] g = new float[n4];
            final float[] h = new float[n4];
            final float[] i = new float[n4];
            final int[] j = new int[n4];
            final int[] k = new int[n4];
            final int[] l = new int[n4];
            if (f != null) {
                System.arraycopy(f, 0, f2, 0, f.length);
                final float[] g2 = this.g;
                System.arraycopy(g2, 0, g, 0, g2.length);
                final float[] h2 = this.h;
                System.arraycopy(h2, 0, h, 0, h2.length);
                final float[] m = this.i;
                System.arraycopy(m, 0, i, 0, m.length);
                final int[] j2 = this.j;
                System.arraycopy(j2, 0, j, 0, j2.length);
                final int[] k2 = this.k;
                System.arraycopy(k2, 0, k, 0, k2.length);
                final int[] l2 = this.l;
                System.arraycopy(l2, 0, l, 0, l2.length);
            }
            this.f = f2;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
        }
        this.f[n3] = (this.h[n3] = n);
        this.g[n3] = (this.i[n3] = n2);
        final int[] j3 = this.j;
        final int n5 = (int)n;
        final int n6 = (int)n2;
        if (n5 < this.u.getLeft() + this.q) {
            b = true;
        }
        int n7 = b ? 1 : 0;
        if (n6 < this.u.getTop() + this.q) {
            n7 = ((b ? 1 : 0) | 0x4);
        }
        int n8 = n7;
        if (n5 > this.u.getRight() - this.q) {
            n8 = (n7 | 0x2);
        }
        int n9 = n8;
        if (n6 > this.u.getBottom() - this.q) {
            n9 = (n8 | 0x8);
        }
        j3[n3] = n9;
        this.m |= 1 << n3;
    }
    
    private final void s(final MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
            final int pointerId = motionEvent.getPointerId(i);
            if (this.u(pointerId)) {
                final float x = motionEvent.getX(i);
                final float y = motionEvent.getY(i);
                this.h[pointerId] = x;
                this.i[pointerId] = y;
            }
        }
    }
    
    private final boolean t(final View view, final float n, final float n2) {
        if (view == null) {
            return false;
        }
        final int a = this.s.a(view);
        final int h = this.s.h();
        if (a > 0 && h > 0) {
            final int b = this.b;
            return n * n + n2 * n2 > b * b;
        }
        if (a > 0) {
            return Math.abs(n) > this.b;
        }
        return h > 0 && Math.abs(n2) > this.b;
    }
    
    private final boolean u(final int n) {
        return this.h(n);
    }
    
    private static final float v(final float n, float n2, final float n3) {
        final float abs = Math.abs(n);
        if (abs < n2) {
            return 0.0f;
        }
        n2 = n;
        if (abs > n3) {
            if (n > 0.0f) {
                return n3;
            }
            n2 = -n3;
        }
        return n2;
    }
    
    private static final int w(final int n, int n2, final int n3) {
        final int abs = Math.abs(n);
        if (abs < n2) {
            return 0;
        }
        n2 = n;
        if (abs > n3) {
            if (n > 0) {
                return n3;
            }
            n2 = -n3;
        }
        return n2;
    }
    
    private final void x(final float n, final float n2, int n3) {
        Math.abs(n);
        Math.abs(n2);
        n3 = this.j[n3];
    }
    
    public final View a(final int n, final int n2) {
        for (int i = this.u.getChildCount() - 1; i >= 0; --i) {
            final View child = this.u.getChildAt(i);
            if (n >= child.getLeft() && n < child.getRight() && n2 >= child.getTop() && n2 < child.getBottom()) {
                return child;
            }
        }
        return null;
    }
    
    public final void c() {
        this.c = -1;
        final float[] f = this.f;
        if (f != null) {
            Arrays.fill(f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            Arrays.fill(this.l, 0);
            this.m = 0;
        }
        final VelocityTracker n = this.n;
        if (n != null) {
            n.recycle();
            this.n = null;
        }
    }
    
    public final void d(final View d, final int c) {
        if (d.getParent() == this.u) {
            this.d = d;
            this.c = c;
            this.s.b(d, c);
            this.f(1);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.u);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void e(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        final int n = 0;
        final int n2 = 0;
        int n3 = actionMasked;
        if (actionMasked == 0) {
            this.c();
            n3 = 0;
        }
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
        this.n.addMovement(motionEvent);
        switch (n3) {
            case 6: {
                final int pointerId = motionEvent.getPointerId(actionIndex);
                Label_0231: {
                    if (this.a == 1 && pointerId == this.c) {
                        for (int pointerCount = motionEvent.getPointerCount(), i = n2; i < pointerCount; ++i) {
                            final int pointerId2 = motionEvent.getPointerId(i);
                            if (pointerId2 != this.c) {
                                final View a = this.a((int)motionEvent.getX(i), (int)motionEvent.getY(i));
                                final View d = this.d;
                                if (a == d && this.k(d, pointerId2)) {
                                    if (this.c == -1) {
                                        break;
                                    }
                                    break Label_0231;
                                }
                            }
                        }
                        this.p();
                    }
                }
                this.n(pointerId);
                return;
            }
            case 5: {
                final int pointerId3 = motionEvent.getPointerId(actionIndex);
                final float x = motionEvent.getX(actionIndex);
                final float y = motionEvent.getY(actionIndex);
                this.r(x, y, pointerId3);
                if (this.a == 0) {
                    this.k(this.a((int)x, (int)y), pointerId3);
                    final int n4 = this.j[pointerId3];
                    return;
                }
                final int n5 = (int)x;
                final int n6 = (int)y;
                final View d2 = this.d;
                if (d2 == null) {
                    break;
                }
                if (n5 >= d2.getLeft() && n5 < d2.getRight() && n6 >= d2.getTop() && n6 < d2.getBottom()) {
                    this.k(this.d, pointerId3);
                    return;
                }
                break;
            }
            case 3: {
                if (this.a == 1) {
                    this.o(0.0f, 0.0f);
                }
                this.c();
                return;
            }
            case 2: {
                if (this.a == 1) {
                    if (!this.u(this.c)) {
                        break;
                    }
                    final int pointerIndex = motionEvent.findPointerIndex(this.c);
                    if (pointerIndex == -1) {
                        break;
                    }
                    final float x2 = motionEvent.getX(pointerIndex);
                    final float y2 = motionEvent.getY(pointerIndex);
                    final float[] h = this.h;
                    final int c = this.c;
                    final int n7 = (int)(x2 - h[c]);
                    final int n8 = (int)(y2 - this.i[c]);
                    final int n9 = this.d.getLeft() + n7;
                    final int n10 = this.d.getTop() + n8;
                    final int left = this.d.getLeft();
                    final int top = this.d.getTop();
                    int f = n9;
                    if (n7 != 0) {
                        f = this.s.f(this.d, n9);
                        ik.x(this.d, f - left);
                    }
                    int g = n10;
                    if (n8 != 0) {
                        g = this.s.g(this.d, n10);
                        ik.y(this.d, g - top);
                    }
                    if (n7 != 0 || n8 != 0) {
                        this.s.i(this.d, f, g);
                    }
                }
                else {
                    for (int pointerCount2 = motionEvent.getPointerCount(), j = n; j < pointerCount2; ++j) {
                        final int pointerId4 = motionEvent.getPointerId(j);
                        if (this.u(pointerId4)) {
                            final float x3 = motionEvent.getX(j);
                            final float y3 = motionEvent.getY(j);
                            final float n11 = x3 - this.f[pointerId4];
                            final float n12 = y3 - this.g[pointerId4];
                            this.q(n11, n12, pointerId4);
                            if (this.a == 1) {
                                break;
                            }
                            final View a2 = this.a((int)x3, (int)y3);
                            if (this.t(a2, n11, n12) && this.k(a2, pointerId4)) {
                                break;
                            }
                        }
                    }
                }
                this.s(motionEvent);
                return;
            }
            case 1: {
                if (this.a == 1) {
                    this.p();
                }
                this.c();
                return;
            }
            case 0: {
                final float x4 = motionEvent.getX();
                final float y4 = motionEvent.getY();
                final int pointerId5 = motionEvent.getPointerId(0);
                final View a3 = this.a((int)x4, (int)y4);
                this.r(x4, y4, pointerId5);
                this.k(a3, pointerId5);
                final int n13 = this.j[pointerId5];
            }
        }
    }
    
    final void f(final int a) {
        this.u.removeCallbacks(this.v);
        if (this.a != a) {
            this.a = a;
            this.s.c(a);
            if (this.a == 0) {
                this.d = null;
            }
        }
    }
    
    public final boolean g(int n, int n2, int n3, int n4) {
        final int left = this.d.getLeft();
        final int top = this.d.getTop();
        n -= left;
        n2 -= top;
        if (n == 0) {
            if (n2 == 0) {
                this.r.abortAnimation();
                this.f(0);
                return false;
            }
            n = 0;
        }
        final View d = this.d;
        final int w = w(n3, (int)this.p, (int)this.o);
        n3 = w(n4, (int)this.p, (int)this.o);
        n4 = Math.abs(n);
        final int abs = Math.abs(n2);
        final int abs2 = Math.abs(w);
        final int abs3 = Math.abs(n3);
        final int n5 = abs2 + abs3;
        final int n6 = n4 + abs;
        float n7;
        if (w != 0) {
            n7 = abs2 / (float)n5;
        }
        else {
            n7 = n4 / (float)n6;
        }
        float n8;
        if (n3 != 0) {
            n8 = abs3 / (float)n5;
        }
        else {
            n8 = abs / (float)n6;
        }
        n4 = this.m(n, w, this.s.a(d));
        n3 = this.m(n2, n3, this.s.h());
        this.r.startScroll(left, top, n, n2, (int)(n4 * n7 + n3 * n8));
        this.f(2);
        return true;
    }
    
    public final boolean h(final int n) {
        return (1 << n & this.m) != 0x0;
    }
    
    public final boolean i(final int n, final int n2) {
        if (this.t) {
            return this.g(n, n2, (int)this.n.getXVelocity(this.c), (int)this.n.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    
    public final boolean j(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        int n = actionMasked;
        if (actionMasked == 0) {
            this.c();
            n = 0;
        }
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
        this.n.addMovement(motionEvent);
        switch (n) {
            case 6: {
                this.n(motionEvent.getPointerId(actionIndex));
                break;
            }
            case 5: {
                final int pointerId = motionEvent.getPointerId(actionIndex);
                final float x = motionEvent.getX(actionIndex);
                final float y = motionEvent.getY(actionIndex);
                this.r(x, y, pointerId);
                final int a = this.a;
                if (a == 0) {
                    final int n2 = this.j[pointerId];
                    break;
                }
                if (a != 2) {
                    break;
                }
                final View a2 = this.a((int)x, (int)y);
                if (a2 == this.d) {
                    this.k(a2, pointerId);
                    break;
                }
                break;
            }
            case 2: {
                if (this.f != null && this.g != null) {
                    for (int pointerCount = motionEvent.getPointerCount(), i = 0; i < pointerCount; ++i) {
                        final int pointerId2 = motionEvent.getPointerId(i);
                        if (this.u(pointerId2)) {
                            final float x2 = motionEvent.getX(i);
                            final float y2 = motionEvent.getY(i);
                            final float n3 = x2 - this.f[pointerId2];
                            final float n4 = y2 - this.g[pointerId2];
                            final View a3 = this.a((int)x2, (int)y2);
                            final boolean t = this.t(a3, n3, n4);
                            if (t) {
                                final int left = a3.getLeft();
                                final int f = this.s.f(a3, (int)n3 + left);
                                final int top = a3.getTop();
                                final int g = this.s.g(a3, (int)n4 + top);
                                final int a4 = this.s.a(a3);
                                final int h = this.s.h();
                                if ((a4 == 0 || (a4 > 0 && f == left)) && (h == 0 || (h > 0 && g == top))) {
                                    break;
                                }
                            }
                            this.q(n3, n4, pointerId2);
                            if (this.a == 1) {
                                break;
                            }
                            if (t && this.k(a3, pointerId2)) {
                                break;
                            }
                        }
                    }
                    this.s(motionEvent);
                    break;
                }
                break;
            }
            case 1:
            case 3: {
                this.c();
                break;
            }
            case 0: {
                final float x3 = motionEvent.getX();
                final float y3 = motionEvent.getY();
                final int pointerId3 = motionEvent.getPointerId(0);
                this.r(x3, y3, pointerId3);
                final View a5 = this.a((int)x3, (int)y3);
                if (a5 == this.d && this.a == 2) {
                    this.k(a5, pointerId3);
                }
                final int n5 = this.j[pointerId3];
                break;
            }
        }
        return this.a == 1;
    }
    
    final boolean k(final View view, final int c) {
        if (view == this.d && this.c == c) {
            return true;
        }
        if (view != null && this.s.e(view, c)) {
            this.d(view, this.c = c);
            return true;
        }
        return false;
    }
    
    public final boolean l() {
        if (this.a == 2) {
            final boolean computeScrollOffset = this.r.computeScrollOffset();
            final int currX = this.r.getCurrX();
            final int currY = this.r.getCurrY();
            final int n = currX - this.d.getLeft();
            final int n2 = currY - this.d.getTop();
            if (n != 0) {
                ik.x(this.d, n);
            }
            if (n2 != 0) {
                ik.y(this.d, n2);
            }
            if (n != 0 || n2 != 0) {
                this.s.i(this.d, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX != this.r.getFinalX() || currY != this.r.getFinalY()) {
                    return this.a == 2;
                }
                this.r.abortAnimation();
            }
            this.u.post(this.v);
        }
        return this.a == 2;
    }
}
