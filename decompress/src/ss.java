import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ss implements Runnable
{
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public final /* synthetic */ RecyclerView e;
    private boolean f;
    private boolean g;
    
    public ss(final RecyclerView e) {
        this.e = e;
        this.d = RecyclerView.a;
        this.f = false;
        this.g = false;
        this.c = new OverScroller(e.getContext(), RecyclerView.a);
    }
    
    private final void d() {
        this.e.removeCallbacks((Runnable)this);
        ik.A((View)this.e, this);
    }
    
    public final void a() {
        if (this.f) {
            this.g = true;
            return;
        }
        this.d();
    }
    
    public final void b(final int n, final int n2, int n3, final Interpolator interpolator) {
        if (n3 == Integer.MIN_VALUE) {
            final int abs = Math.abs(n);
            final int abs2 = Math.abs(n2);
            if (abs > abs2) {
                n3 = this.e.getWidth();
            }
            else {
                n3 = this.e.getHeight();
            }
            int n4 = abs;
            if (abs <= abs2) {
                n4 = abs2;
            }
            n3 = Math.min((int)((n4 / (float)n3 + 1.0f) * 300.0f), 2000);
        }
        Interpolator a;
        if ((a = interpolator) == null) {
            a = RecyclerView.a;
        }
        if (this.d != a) {
            this.d = a;
            this.c = new OverScroller(this.e.getContext(), a);
        }
        this.b = 0;
        this.a = 0;
        this.e.R(2);
        this.c.startScroll(0, 0, n, n2, n3);
        this.a();
    }
    
    public final void c() {
        this.e.removeCallbacks((Runnable)this);
        this.c.abortAnimation();
    }
    
    @Override
    public final void run() {
        final RecyclerView e = this.e;
        if (e.l == null) {
            this.c();
            return;
        }
        this.g = false;
        this.f = true;
        e.r();
        final OverScroller c = this.c;
        Label_0879: {
            if (c.computeScrollOffset()) {
                final int currX = c.getCurrX();
                final int currY = c.getCurrY();
                int n = currX - this.a;
                int n2 = currY - this.b;
                this.a = currX;
                this.b = currY;
                final RecyclerView e2 = this.e;
                final int[] n3 = e2.N;
                n3[1] = (n3[0] = 0);
                if (e2.Z(n, n2, n3, null, 1)) {
                    final int[] n4 = this.e.N;
                    n -= n4[0];
                    n2 -= n4[1];
                }
                if (this.e.getOverScrollMode() != 2) {
                    this.e.q(n, n2);
                }
                final RecyclerView e3 = this.e;
                int n7;
                int n9;
                int n10;
                if (e3.k != null) {
                    final int[] n5 = e3.N;
                    n5[1] = (n5[0] = 0);
                    e3.N(n, n2, n5);
                    final RecyclerView e4 = this.e;
                    final int[] n6 = e4.N;
                    n7 = n6[0];
                    final int n8 = n6[1];
                    n -= n7;
                    n9 = n2 - n8;
                    final sp t = e4.l.t;
                    if (t != null && !t.e && t.f) {
                        final int a = e4.I.a();
                        if (a == 0) {
                            t.f();
                            n10 = n8;
                        }
                        else if (t.b >= a) {
                            t.b = a - 1;
                            t.e(n7, n8);
                            n10 = n8;
                        }
                        else {
                            t.e(n7, n8);
                            n10 = n8;
                        }
                    }
                    else {
                        n10 = n8;
                    }
                }
                else {
                    final int n11 = 0;
                    n7 = 0;
                    n9 = n2;
                    n10 = n11;
                }
                if (!this.e.n.isEmpty()) {
                    this.e.invalidate();
                }
                final RecyclerView e5 = this.e;
                final int[] n12 = e5.N;
                n12[1] = (n12[0] = 0);
                e5.v(n7, n10, n, n9, null, 1, n12);
                final RecyclerView e6 = this.e;
                final int[] n13 = e6.N;
                int n14 = n - n13[0];
                int n15 = n9 - n13[1];
                int n16 = 0;
                Label_0495: {
                    if (n7 == 0) {
                        if (n10 == 0) {
                            n16 = 0;
                            n7 = 0;
                            break Label_0495;
                        }
                        n7 = 0;
                    }
                    e6.w(n7, n10);
                    n16 = n10;
                }
                if (!RecyclerView.Y(this.e)) {
                    this.e.invalidate();
                }
                final int currX2 = c.getCurrX();
                final int finalX = c.getFinalX();
                final int currY2 = c.getCurrY();
                final int finalY = c.getFinalY();
                boolean b = false;
                Label_0595: {
                    if (!c.isFinished()) {
                        if (currX2 != finalX && n14 == 0) {
                            b = false;
                            n14 = 0;
                            break Label_0595;
                        }
                        if (currY2 != finalY) {
                            if (n15 != 0) {
                                b = true;
                                break Label_0595;
                            }
                            b = false;
                            n15 = 0;
                            break Label_0595;
                        }
                    }
                    b = true;
                }
                final RecyclerView e7 = this.e;
                final sp t2 = e7.l.t;
                if (t2 == null || !t2.e) {
                    if (b) {
                        if (e7.getOverScrollMode() != 2) {
                            int n17 = (int)c.getCurrVelocity();
                            int n18;
                            if (n14 < 0) {
                                n18 = -n17;
                            }
                            else if (n14 > 0) {
                                n18 = n17;
                            }
                            else {
                                n18 = 0;
                            }
                            if (n15 < 0) {
                                n17 = -n17;
                            }
                            else if (n15 <= 0) {
                                n17 = 0;
                            }
                            final RecyclerView e8 = this.e;
                            if (n18 < 0) {
                                e8.y();
                                if (e8.x.isFinished()) {
                                    e8.x.onAbsorb(-n18);
                                }
                            }
                            else if (n18 > 0) {
                                e8.z();
                                if (e8.z.isFinished()) {
                                    e8.z.onAbsorb(n18);
                                }
                            }
                            if (n17 < 0) {
                                e8.A();
                                if (e8.y.isFinished()) {
                                    e8.y.onAbsorb(-n17);
                                }
                            }
                            else if (n17 > 0) {
                                e8.x();
                                if (e8.A.isFinished()) {
                                    e8.A.onAbsorb(n17);
                                }
                            }
                            if (n18 != 0 || n17 != 0) {
                                ik.z((View)e8);
                            }
                        }
                        this.e.H.b();
                        break Label_0879;
                    }
                }
                this.a();
                final RecyclerView e9 = this.e;
                final qv g = e9.G;
                if (g != null) {
                    g.a(e9, n7, n16);
                }
            }
        }
        final sp t3 = this.e.l.t;
        if (t3 != null && t3.e) {
            t3.e(0, 0);
        }
        this.f = false;
        if (this.g) {
            this.d();
            return;
        }
        this.e.R(0);
        this.e.W(1);
    }
}
