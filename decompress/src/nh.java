import android.graphics.Rect;
import android.view.Gravity;
import android.view.Display;
import android.graphics.Point;
import android.view.WindowManager;
import android.content.Context;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class nh
{
    public View a;
    public int b;
    public PopupWindow$OnDismissListener c;
    private final Context d;
    private final mv e;
    private final boolean f;
    private final int g;
    private boolean h;
    private ni i;
    private nf j;
    private final PopupWindow$OnDismissListener k;
    
    public nh(final Context context, final mv mv, final View view, final boolean b) {
        this(context, mv, view, b, 2130968612);
    }
    
    public nh(final Context d, final mv e, final View a, final boolean f, final int g) {
        this.b = 8388611;
        this.k = (PopupWindow$OnDismissListener)new ng(this);
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.g = g;
    }
    
    public final nf a() {
        if (this.j == null) {
            final Display defaultDisplay = ((WindowManager)this.d.getSystemService("window")).getDefaultDisplay();
            final Point point = new Point();
            defaultDisplay.getRealSize(point);
            nj j;
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(2131165220)) {
                j = new mp(this.d, this.a, this.g, this.f);
            }
            else {
                j = new nq(this.d, this.e, this.a, this.g, this.f);
            }
            ((nf)j).j(this.e);
            ((nf)j).p(this.k);
            ((nf)j).l(this.a);
            j.d(this.i);
            ((nf)j).m(this.h);
            ((nf)j).n(this.b);
            this.j = (nf)j;
        }
        return this.j;
    }
    
    public final void b() {
        if (this.g()) {
            this.j.k();
        }
    }
    
    protected void c() {
        this.j = null;
        final PopupWindow$OnDismissListener c = this.c;
        if (c != null) {
            c.onDismiss();
        }
    }
    
    public final void d(final boolean h) {
        this.h = h;
        final nf j = this.j;
        if (j != null) {
            j.m(h);
        }
    }
    
    public final void e(final ni i) {
        this.i = i;
        final nf j = this.j;
        if (j != null) {
            j.d(i);
        }
    }
    
    public final void f(int n, final int n2, final boolean b, final boolean b2) {
        final nf a = this.a();
        a.q(b2);
        if (b) {
            int n3 = n;
            if ((Gravity.getAbsoluteGravity(this.b, ik.f(this.a)) & 0x7) == 0x5) {
                n3 = n - this.a.getWidth();
            }
            a.o(n3);
            a.r(n2);
            n = (int)(this.d.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            a.g = new Rect(n3 - n, n2 - n, n3 + n, n2 + n);
        }
        a.s();
    }
    
    public final boolean g() {
        final nf j = this.j;
        return j != null && j.u();
    }
    
    public final boolean h() {
        if (this.g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        this.f(0, 0, false, false);
        return true;
    }
}
