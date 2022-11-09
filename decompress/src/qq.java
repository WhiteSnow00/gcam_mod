import android.view.MotionEvent;
import android.graphics.Canvas;
import android.view.View;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qq extends aaj implements sh
{
    private static final int[] r;
    private static final int[] s;
    private int A;
    private final int[] B;
    private final int[] C;
    private final Runnable D;
    private final aak E;
    public final int a;
    final StateListDrawable b;
    final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public int j;
    public int k;
    public RecyclerView l;
    public boolean m;
    public boolean n;
    public int o;
    final ValueAnimator p;
    int q;
    private final int t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;
    
    static {
        r = new int[] { 16842919 };
        s = new int[0];
    }
    
    public qq(final RecyclerView l, final StateListDrawable b, final Drawable c, final StateListDrawable w, final Drawable x, final int n, final int a, final int t) {
        boolean willNotDraw = false;
        this.j = 0;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.o = 0;
        this.A = 0;
        this.B = new int[2];
        this.C = new int[2];
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        this.p = ofFloat;
        this.q = 0;
        this.D = new qm(this);
        final qn e = new qn(this);
        this.E = e;
        this.b = b;
        this.c = c;
        this.w = w;
        this.x = x;
        this.u = Math.max(n, b.getIntrinsicWidth());
        this.v = Math.max(n, c.getIntrinsicWidth());
        this.y = Math.max(n, w.getIntrinsicWidth());
        this.z = Math.max(n, x.getIntrinsicWidth());
        this.a = a;
        this.t = t;
        b.setAlpha(255);
        c.setAlpha(255);
        ofFloat.addListener((Animator$AnimatorListener)new qo(this));
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qp(this));
        final RecyclerView i = this.l;
        if (i != l) {
            if (i != null) {
                final se j = i.l;
                if (j != null) {
                    j.L("Cannot remove item decoration during a scroll  or layout");
                }
                i.n.remove(this);
                if (i.n.isEmpty()) {
                    if (i.getOverScrollMode() == 2) {
                        willNotDraw = true;
                    }
                    i.setWillNotDraw(willNotDraw);
                }
                i.F();
                i.requestLayout();
                final RecyclerView k = this.l;
                k.o.remove(this);
                if (k.p == this) {
                    k.p = null;
                }
                this.l.ak(e);
                this.p();
            }
            if ((this.l = l) != null) {
                l.ai(this);
                this.l.o.add(this);
                this.l.aj(e);
            }
        }
    }
    
    private final void p() {
        this.l.removeCallbacks(this.D);
    }
    
    private final void q(final int n) {
        this.p();
        this.l.postDelayed(this.D, (long)n);
    }
    
    private final boolean r() {
        return ik.f((View)this.l) == 1;
    }
    
    private static final int s(final float n, final float n2, final int[] array, int n3, int n4, int n5) {
        final int n6 = array[1] - array[0];
        if (n6 == 0) {
            return 0;
        }
        n3 -= n5;
        n5 = (int)((n2 - n) / n6 * n3);
        n4 += n5;
        if (n4 < n3 && n4 >= 0) {
            return n5;
        }
        return 0;
    }
    
    final void a() {
        this.l.invalidate();
    }
    
    final void b(final int o) {
        if (o == 2 && this.o != 2) {
            this.b.setState(qq.r);
            this.p();
        }
        if (o == 0) {
            this.a();
        }
        else {
            this.c();
        }
        if (this.o == 2 && o != 2) {
            this.b.setState(qq.s);
            this.q(1200);
        }
        else if (o == 1) {
            this.q(1500);
        }
        this.o = o;
    }
    
    public final void c() {
        switch (this.q) {
            default: {
                return;
            }
            case 3: {
                this.p.cancel();
            }
            case 0: {
                this.q = 1;
                final ValueAnimator p = this.p;
                p.setFloatValues(new float[] { (float)p.getAnimatedValue(), 1.0f });
                this.p.setDuration(500L);
                this.p.setStartDelay(0L);
                this.p.start();
            }
        }
    }
    
    final boolean d(final float n, final float n2) {
        if (n2 >= this.k - this.y) {
            final int h = this.h;
            final int n3 = this.g / 2;
            if (n >= h - n3 && n <= h + n3) {
                return true;
            }
        }
        return false;
    }
    
    final boolean e(final float n, final float n2) {
        if (this.r()) {
            if (n > this.u) {
                return false;
            }
        }
        else if (n < this.j - this.u) {
            return false;
        }
        final int e = this.e;
        final int n3 = this.d / 2;
        if (n2 >= e - n3 && n2 <= e + n3) {
            return true;
        }
        return false;
    }
    
    @Override
    public final void f(final Canvas canvas) {
        if (this.j == this.l.getWidth() && this.k == this.l.getHeight()) {
            if (this.q != 0) {
                if (this.m) {
                    final int j = this.j;
                    final int u = this.u;
                    final int n = j - u;
                    final int e = this.e;
                    final int d = this.d;
                    final int n2 = e - d / 2;
                    this.b.setBounds(0, 0, u, d);
                    this.c.setBounds(0, 0, this.v, this.k);
                    if (this.r()) {
                        this.c.draw(canvas);
                        canvas.translate((float)this.u, (float)n2);
                        canvas.scale(-1.0f, 1.0f);
                        this.b.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate((float)(-this.u), (float)(-n2));
                    }
                    else {
                        canvas.translate((float)n, 0.0f);
                        this.c.draw(canvas);
                        canvas.translate(0.0f, (float)n2);
                        this.b.draw(canvas);
                        canvas.translate((float)(-n), (float)(-n2));
                    }
                }
                if (this.n) {
                    final int k = this.k;
                    final int y = this.y;
                    final int n3 = k - y;
                    final int h = this.h;
                    final int g = this.g;
                    final int n4 = h - g / 2;
                    this.w.setBounds(0, 0, g, y);
                    this.x.setBounds(0, 0, this.j, this.z);
                    canvas.translate(0.0f, (float)n3);
                    this.x.draw(canvas);
                    canvas.translate((float)n4, 0.0f);
                    this.w.draw(canvas);
                    canvas.translate((float)(-n4), (float)(-n3));
                }
            }
            return;
        }
        this.j = this.l.getWidth();
        this.k = this.l.getHeight();
        this.b(0);
    }
    
    @Override
    public final boolean g(final MotionEvent motionEvent) {
        final int o = this.o;
        boolean b = false;
        if (o == 1) {
            final boolean e = this.e(motionEvent.getX(), motionEvent.getY());
            final boolean d = this.d(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                Label_0101: {
                    if (!e) {
                        if (!d) {
                            return b;
                        }
                    }
                    else if (!d) {
                        this.A = 2;
                        this.f = (float)(int)motionEvent.getY();
                        break Label_0101;
                    }
                    this.A = 1;
                    this.i = (float)(int)motionEvent.getX();
                }
                this.b(2);
                b = true;
            }
        }
        else if (o == 2) {
            return true;
        }
        return b;
    }
    
    @Override
    public final void h() {
    }
    
    @Override
    public final void i(final MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            final boolean e = this.e(motionEvent.getX(), motionEvent.getY());
            final boolean d = this.d(motionEvent.getX(), motionEvent.getY());
            Label_0089: {
                if (!e) {
                    if (!d) {
                        return;
                    }
                }
                else if (!d) {
                    this.A = 2;
                    this.f = (float)(int)motionEvent.getY();
                    break Label_0089;
                }
                this.A = 1;
                this.i = (float)(int)motionEvent.getX();
            }
            this.b(2);
            return;
        }
        if (motionEvent.getAction() == 1 && this.o == 2) {
            this.f = 0.0f;
            this.i = 0.0f;
            this.b(1);
            this.A = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.o == 2) {
            this.c();
            if (this.A == 1) {
                final float x = motionEvent.getX();
                final int[] c = this.C;
                final int t = this.t;
                c[0] = t;
                c[1] = this.j - t;
                final float max = Math.max((float)c[0], Math.min((float)c[1], x));
                if (Math.abs(this.h - max) >= 2.0f) {
                    final int s = s(this.i, max, c, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                    if (s != 0) {
                        this.l.scrollBy(s, 0);
                    }
                    this.i = max;
                }
            }
            if (this.A == 2) {
                final float y = motionEvent.getY();
                final int[] b = this.B;
                final int t2 = this.t;
                b[0] = t2;
                b[1] = this.k - t2;
                final float max2 = Math.max((float)b[0], Math.min((float)b[1], y));
                if (Math.abs(this.e - max2) >= 2.0f) {
                    final int s2 = s(this.f, max2, b, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                    if (s2 != 0) {
                        this.l.scrollBy(0, s2);
                    }
                    this.f = max2;
                }
            }
        }
    }
}
