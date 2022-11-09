import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;
import android.content.res.Resources;
import android.view.WindowManager$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.graphics.Typeface;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public class ijx extends ijk
{
    public final jjb a;
    public final iqg b;
    public final dul c;
    public final gjj d;
    public final fvt e;
    public final heq f;
    public final bpt g;
    public final pii h;
    public final crg i;
    public final efm j;
    public final iru k;
    public final cxl l;
    public final int m;
    public boolean n;
    public lfu o;
    public final itx p;
    private final klv q;
    private final Window r;
    private final BottomBarController s;
    private final ivj t;
    private final imk u;
    private final Handler v;
    private final pii w;
    
    public ijx(final klv q, final pii w, final Window r, final BottomBarController s, final ivj t, final jjb a, final iqg b, final imk u, final dul c, final gjj d, final itx p20, final fvt e, final heq f, final Handler v, final bpt g, final pii h, final crg i, final efm j, final iru k, final cxl l) {
        this.n = true;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.m = r.getAttributes().rotationAnimation;
        this.a = a;
        this.b = b;
        this.u = u;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.v = v;
        this.g = g;
        this.h = h;
        this.i = i;
        this.p = p20;
        this.j = j;
        this.k = k;
        this.w = w;
        this.l = l;
        final boolean m = l.k(cxr.at);
        final itw a2 = p20.a;
        if (!m) {
            a2.e.setTextColor(a2.getResources().getColor(2131101443));
            a2.e.setTypeface(Typeface.create("google-sans-medium_compat", 0));
            a2.f.setTextColor(a2.getResources().getColor(2131101441));
            a2.f.setTypeface(Typeface.create("google-sans-medium_compat", 0));
            final Drawable drawable = a2.getContext().getResources().getDrawable(2131231373, (Resources$Theme)null);
            drawable.setTint(a2.getResources().getColor(2131100946));
            final Drawable drawable2 = a2.getContext().getResources().getDrawable(2131231372, (Resources$Theme)null);
            drawable2.setTint(a2.getResources().getColor(2131100948));
            a2.e.setBackground(drawable);
            a2.f.setBackground(drawable2);
            a2.invalidate();
        }
    }
    
    public final void A(final int rotationAnimation) {
        final WindowManager$LayoutParams attributes = this.r.getAttributes();
        attributes.rotationAnimation = rotationAnimation;
        this.r.setAttributes(attributes);
    }
    
    public final void B(final jbm jbm) {
        this.q.aR(jbm);
        this.t.ai(jbm);
        this.s.switchToMode(jbm);
    }
    
    public final Resources q() {
        return this.s().getResources();
    }
    
    public final GridLinesUi r() {
        return (GridLinesUi)((ixw)this.w.get()).c.c(2131427633);
    }
    
    public final PreviewOverlay s() {
        return (PreviewOverlay)((ixw)this.w.get()).c.c(2131427861);
    }
    
    public final void t() {
        this.u.d(false);
        jgu.c();
    }
    
    public final void u() {
        this.r().setVisibility(4);
    }
    
    public final void v() {
        this.u.d(true);
        jgu.d();
    }
    
    public final void w() {
        this.v.postDelayed((Runnable)new ijl(this), 250L);
    }
    
    public final void x() {
        this.d.j();
    }
    
    public final void y() {
        this.v();
        this.b.m();
        this.s().d = true;
        this.w();
        this.a.v(true);
        final jjb a = this.a;
        if (((jjq)a).L) {
            a.h();
        }
    }
    
    public final void z() {
        this.f.c();
        this.s().d = false;
        this.a.v(false);
        this.a.g();
    }
}
