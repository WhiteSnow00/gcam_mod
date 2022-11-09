import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.view.KeyEvent;
import android.view.Gravity;
import android.widget.ListView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View$OnAttachStateChangeListener;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnKeyListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.PopupWindow$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class nq extends nf implements PopupWindow$OnDismissListener, AdapterView$OnItemClickListener, View$OnKeyListener, nj
{
    final rm a;
    final ViewTreeObserver$OnGlobalLayoutListener b;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final mv f;
    private final ms h;
    private final boolean i;
    private final int j;
    private final int k;
    private final View$OnAttachStateChangeListener l;
    private PopupWindow$OnDismissListener m;
    private View n;
    private ni o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private boolean t;
    
    public nq(final Context e, final mv f, final View n, final int k, final boolean i) {
        this.b = (ViewTreeObserver$OnGlobalLayoutListener)new no(this);
        this.l = (View$OnAttachStateChangeListener)new np(this);
        this.s = 0;
        this.e = e;
        this.f = f;
        this.i = i;
        this.h = new ms(f, LayoutInflater.from(e), i, 2131623955);
        this.k = k;
        final Resources resources = e.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165221));
        this.n = n;
        this.a = new rm(e, k);
        f.h(this, e);
    }
    
    public final ListView aE() {
        return this.a.e;
    }
    
    public final void c(final mv mv, final boolean b) {
        if (mv != this.f) {
            return;
        }
        this.k();
        final ni o = this.o;
        if (o != null) {
            o.a(mv, b);
        }
    }
    
    public final void d(final ni o) {
        this.o = o;
    }
    
    public final boolean e() {
        return false;
    }
    
    public final boolean f(final nr nr) {
        if (nr.hasVisibleItems()) {
            final nh nh = new nh(this.e, nr, this.c, this.i, this.k);
            nh.e(this.o);
            nh.d(nf.w(nr));
            nh.c = this.m;
            this.m = null;
            this.f.i(false);
            final rm a = this.a;
            int g = a.g;
            final int b = a.b();
            if ((Gravity.getAbsoluteGravity(this.s, ik.f(this.n)) & 0x7) == 0x5) {
                g += this.n.getWidth();
            }
            if (!nh.g()) {
                if (nh.a == null) {
                    return false;
                }
                nh.f(g, b, true, true);
            }
            final ni o = this.o;
            if (o != null) {
                o.b(nr);
            }
            return true;
        }
        return false;
    }
    
    public final void i() {
        this.q = false;
        final ms h = this.h;
        if (h != null) {
            h.notifyDataSetChanged();
        }
    }
    
    @Override
    public final void j(final mv mv) {
    }
    
    public final void k() {
        if (this.u()) {
            this.a.k();
        }
    }
    
    @Override
    public final void l(final View n) {
        this.n = n;
    }
    
    @Override
    public final void m(final boolean b) {
        this.h.b = b;
    }
    
    @Override
    public final void n(final int s) {
        this.s = s;
    }
    
    @Override
    public final void o(final int g) {
        this.a.g = g;
    }
    
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        final ViewTreeObserver d = this.d;
        if (d != null) {
            if (!d.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        final PopupWindow$OnDismissListener m = this.m;
        if (m != null) {
            m.onDismiss();
        }
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.k();
            return true;
        }
        return false;
    }
    
    @Override
    public final void p(final PopupWindow$OnDismissListener m) {
        this.m = m;
    }
    
    @Override
    public final void q(final boolean t) {
        this.t = t;
    }
    
    @Override
    public final void r(final int n) {
        this.a.j(n);
    }
    
    public final void s() {
        if (this.u()) {
            return;
        }
        if (!this.p) {
            final View n = this.n;
            if (n != null) {
                this.c = n;
                this.a.v((PopupWindow$OnDismissListener)this);
                final rm a = this.a;
                a.m = (AdapterView$OnItemClickListener)this;
                a.y();
                final View c = this.c;
                final ViewTreeObserver d = this.d;
                final ViewTreeObserver viewTreeObserver = c.getViewTreeObserver();
                this.d = viewTreeObserver;
                if (d == null) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.b);
                }
                c.addOnAttachStateChangeListener(this.l);
                final rm a2 = this.a;
                a2.l = c;
                a2.j = this.s;
                if (!this.q) {
                    this.r = nf.x((ListAdapter)this.h, this.e, this.j);
                    this.q = true;
                }
                this.a.r(this.r);
                this.a.x();
                this.a.t(super.g);
                this.a.s();
                final ql e = this.a.e;
                e.setOnKeyListener((View$OnKeyListener)this);
                if (this.t && this.f.e != null) {
                    final FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.e).inflate(2131623954, (ViewGroup)e, false);
                    final TextView textView = (TextView)frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f.e);
                    }
                    frameLayout.setEnabled(false);
                    e.addHeaderView((View)frameLayout, (Object)null, false);
                }
                this.a.e((ListAdapter)this.h);
                this.a.s();
                return;
            }
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }
    
    public final boolean u() {
        return !this.p && this.a.u();
    }
}
