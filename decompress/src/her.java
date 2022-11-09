import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.animation.Animator;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.graphics.drawable.GradientDrawable;
import com.google.android.apps.camera.ui.views.GradientBar;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class her implements heu
{
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final jbq m;
    private final jbq n;
    private final jbq o;
    private final jbq p;
    private final View q;
    private final GradientBar r;
    private final GradientDrawable s;
    
    public her(final BottomBarController bottomBarController, final irc irc, final GradientBar r, final ixw ixw, final cxl cxl) {
        kjm.a();
        final View q = (View)ixw.c.c(2131427411);
        this.q = q;
        final Resources resources = q.getResources();
        if (cxl.k(cxr.ad)) {
            final int intValue = (int)cxl.a(cxr.g).c();
            this.c = intValue;
            this.a = gv.c(intValue, 255);
        }
        else {
            this.a = gv.c((int)cxl.a(cxr.f).c(), 255);
            this.c = gv.c((int)cxl.a(cxr.f).c(), 204);
        }
        this.b = resources.getColor(2131100903, (Resources$Theme)null);
        final int color = resources.getColor(2131101430, (Resources$Theme)null);
        this.e = color;
        this.d = gv.c(color, 204);
        if (cxl.k(cxr.at)) {
            this.f = neu.c(q, 2130968900);
            this.h = neu.c(q, 2130968865);
            this.j = neu.c(q, 2130968871);
        }
        else {
            this.f = resources.getColor(2131100946, (Resources$Theme)null);
            this.h = resources.getColor(2131100951, (Resources$Theme)null);
            this.j = resources.getColor(2131100953, (Resources$Theme)null);
        }
        this.g = resources.getColor(2131100949, (Resources$Theme)null);
        this.i = resources.getColor(2131100954, (Resources$Theme)null);
        this.k = resources.getColor(2131100955, (Resources$Theme)null);
        this.s = (GradientDrawable)r.getBackground();
        this.m = new iyt(r);
        this.n = irc.a();
        this.o = irc.b();
        this.p = irc.c();
        this.r = r;
        this.l = bottomBarController.getBottomBarAreaPixels();
    }
    
    private final int f(final boolean b) {
        int n;
        if (b) {
            n = this.e;
        }
        else {
            n = this.a;
        }
        return n;
    }
    
    private final int g(final boolean b) {
        int n;
        if (b) {
            n = this.d;
        }
        else {
            n = this.c;
        }
        return n;
    }
    
    @Override
    public final int a() {
        return this.l;
    }
    
    @Override
    public final Animator b(final boolean b) {
        final int f = this.f(b);
        final jbp b2 = jbp.b(333, (Interpolator)new adh());
        b2.d(this.q, "backgroundColor", f, this.b);
        b2.d(this.n, "color", this.g, this.f);
        b2.d(this.o, "color", this.i, this.h);
        b2.d(this.p, "color", this.k, this.j);
        return (Animator)b2.a();
    }
    
    @Override
    public final Animator c(final boolean b) {
        final int g = this.g(b);
        final int f = this.f(b);
        final jbp b2 = jbp.b(1000, (Interpolator)new adh());
        b2.d(this.q, "backgroundColor", this.b, f);
        b2.d(this.n, "color", this.f, this.g);
        b2.d(this.o, "color", this.h, this.i);
        b2.d(this.p, "color", this.j, this.k);
        b2.d(this.m, "color", 0, g);
        return (Animator)b2.a();
    }
    
    @Override
    public final void d() {
        this.n.setColor(this.f);
        this.o.setColor(this.h);
        this.p.setColor(this.j);
        this.q.setBackgroundColor(this.b);
        final int a = inq.a;
        if (a != 0 && a == 5) {
            this.m.setColor(0);
            return;
        }
        this.r.setBackground((Drawable)this.s);
    }
    
    @Override
    public final void e(final boolean b) {
        final int g = this.g(b);
        final int f = this.f(b);
        this.n.setColor(this.g);
        this.o.setColor(this.i);
        this.p.setColor(this.k);
        this.q.setBackgroundColor(f);
        this.m.setColor(g);
    }
}
