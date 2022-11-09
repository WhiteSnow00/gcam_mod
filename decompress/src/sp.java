import android.util.Log;
import android.view.animation.Interpolator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public class sp
{
    private final sn a;
    public int b;
    public RecyclerView c;
    public se d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    protected int l;
    protected int m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;
    
    public sp() {
        this.b = -1;
        this.a = new sn();
    }
    
    public sp(final Context context) {
        this.b = -1;
        this.a = new sn();
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.o = false;
        this.l = 0;
        this.m = 0;
        this.n = context.getResources().getDisplayMetrics();
    }
    
    public static int h(int n, final int n2, final int n3, final int n4, final int n5) {
        switch (n5) {
            default: {
                return n4 - n2;
            }
            case 0: {
                n = n3 - n;
                if (n > 0) {
                    return n;
                }
                n = n4 - n2;
                if (n < 0) {
                    return n;
                }
                return 0;
            }
            case -1: {
                return n3 - n;
            }
        }
    }
    
    public static final int i(final View view) {
        final st f = RecyclerView.f(view);
        if (f != null) {
            return f.b();
        }
        return -1;
    }
    
    private static int j(final int n, int n2) {
        n2 = n - n2;
        if (n * n2 <= 0) {
            return 0;
        }
        return n2;
    }
    
    protected float a(final DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }
    
    protected int b(final int n) {
        final float n2 = (float)Math.abs(n);
        if (!this.o) {
            this.p = this.a(this.n);
            this.o = true;
        }
        return (int)Math.ceil(n2 * this.p);
    }
    
    protected void c(final View view, final sn sn) {
        final PointF k = this.k;
        final int n = 1;
        final int n2 = 0;
        int n3;
        if (k != null) {
            if (k.x == 0.0f) {
                n3 = 0;
            }
            else if (this.k.x > 0.0f) {
                n3 = 1;
            }
            else {
                n3 = -1;
            }
        }
        else {
            n3 = 0;
        }
        final se d = this.d;
        int h;
        if (d != null) {
            if (!d.T()) {
                h = 0;
            }
            else {
                final sf sf = (sf)view.getLayoutParams();
                h = h(se.bn(view) - sf.leftMargin, se.bo(view) + sf.rightMargin, d.ao(), d.C - d.ap(), n3);
            }
        }
        else {
            h = 0;
        }
        final PointF i = this.k;
        int n4;
        if (i != null) {
            if (i.y == 0.0f) {
                n4 = 0;
            }
            else if (this.k.y > 0.0f) {
                n4 = n;
            }
            else {
                n4 = -1;
            }
        }
        else {
            n4 = 0;
        }
        final se d2 = this.d;
        int h2;
        if (d2 != null) {
            if (!d2.U()) {
                h2 = n2;
            }
            else {
                final sf sf2 = (sf)view.getLayoutParams();
                h2 = h(se.bp(view) - sf2.topMargin, se.bm(view) + sf2.bottomMargin, d2.aq(), d2.D - d2.an(), n4);
            }
        }
        else {
            h2 = n2;
        }
        final int g = this.g((int)Math.sqrt(h * h + h2 * h2));
        if (g > 0) {
            sn.b(-h, -h2, g, (Interpolator)this.j);
        }
    }
    
    public final PointF d(final int n) {
        final se d = this.d;
        if (d instanceof so) {
            return ((so)d).H(n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
        sb.append(so.class.getCanonicalName());
        Log.w("RecyclerView", sb.toString());
        return null;
    }
    
    final void e(int m, final int n) {
        final RecyclerView c = this.c;
        if (this.b == -1 || c == null) {
            this.f();
        }
        if (this.e && this.g == null && this.d != null) {
            final PointF d = this.d(this.b);
            if (d != null && (d.x != 0.0f || d.y != 0.0f)) {
                c.N((int)Math.signum(d.x), (int)Math.signum(d.y), null);
            }
        }
        this.e = false;
        final View g = this.g;
        if (g != null) {
            if (i(g) == this.b) {
                final View g2 = this.g;
                final sq i = c.I;
                this.c(g2, this.a);
                this.a.a(c);
                this.f();
            }
            else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            final sq j = c.I;
            final sn a = this.a;
            if (this.c.l.ah() == 0) {
                this.f();
            }
            else {
                this.l = j(this.l, m);
                m = j(this.m, n);
                this.m = m;
                if (this.l == 0 && m == 0) {
                    final PointF d2 = this.d(this.b);
                    if (d2 != null && (d2.x != 0.0f || d2.y != 0.0f)) {
                        final float n2 = (float)Math.sqrt(d2.x * d2.x + d2.y * d2.y);
                        d2.x /= n2;
                        d2.y /= n2;
                        this.k = d2;
                        this.l = (int)(d2.x * 10000.0f);
                        this.m = (int)(d2.y * 10000.0f);
                        m = this.b(10000);
                        a.b((int)(this.l * 1.2f), (int)(this.m * 1.2f), (int)(m * 1.2f), (Interpolator)this.i);
                    }
                    else {
                        a.a = this.b;
                        this.f();
                    }
                }
            }
            final sn a2 = this.a;
            m = a2.a;
            a2.a(c);
            if (m >= 0 && this.f) {
                this.e = true;
                c.F.a();
            }
        }
    }
    
    public final void f() {
        if (!this.f) {
            return;
        }
        this.f = false;
        this.m = 0;
        this.l = 0;
        this.k = null;
        this.c.I.a = -1;
        this.g = null;
        this.b = -1;
        this.e = false;
        final se d = this.d;
        if (d.t == this) {
            d.t = null;
        }
        this.d = null;
        this.c = null;
    }
    
    protected final int g(final int n) {
        final double n2 = this.b(n);
        Double.isNaN(n2);
        return (int)Math.ceil(n2 / 0.3356);
    }
}
