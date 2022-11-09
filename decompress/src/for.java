import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import android.graphics.Point;
import android.view.SurfaceHolder$Callback;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources$Theme;
import android.view.View;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class for extends bqw
{
    private final isr A;
    public final krr b;
    public final iqg c;
    public final kjm d;
    public final kri e;
    public kre f;
    public kwz g;
    public final AtomicBoolean h;
    public final bmq i;
    private final Context j;
    private final kse k;
    private final WindowManager l;
    private final isx m;
    private final bql n;
    private final iov o;
    private final crg p;
    private final gkw q;
    private final jjb r;
    private final cxl s;
    private kwd t;
    private SurfaceHolder u;
    private SurfaceView v;
    private View w;
    private kxb x;
    private kvw y;
    private final lae z;
    
    public for(final Context j, final lae z, final iqg c, final bqm n, final WindowManager l, final krr krr, final kse k, final iov o, final crg p16, final gkw q, final bmq i, final jjb r, final kjm d, final cxl s, final kri e, final ixx ixx) {
        this.h = new AtomicBoolean(false);
        this.j = j;
        this.z = z;
        this.c = c;
        this.l = l;
        this.k = k;
        this.m = new iss();
        this.n = n;
        this.b = krr.a("MoreModes");
        this.o = o;
        this.p = p16;
        this.q = q;
        this.i = i;
        this.r = r;
        this.d = d;
        this.s = s;
        this.e = e;
        this.A = new iyx(ixx.c, ixx.d);
    }
    
    @Override
    public final niz b() {
        final SurfaceView v = this.v;
        if (v == null) {
            return nii.a;
        }
        return ixn.e(v, this.q.f(), false, 2);
    }
    
    @Override
    public final void br() {
        this.k.f("MORE_MODES-init");
        final SurfaceView v = new SurfaceView(this.j);
        if (this.s.k(cxr.aQ)) {
            v.setBackground(this.j.getResources().getDrawable(2131231668, (Resources$Theme)null));
            v.setClipToOutline(true);
        }
        final SurfaceHolder holder = v.getHolder();
        this.v = v;
        this.u = holder;
        (this.w = new View(this.j)).setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
        this.w.setBackgroundColor(-16777216);
        this.w.setAlpha(0.7f);
        this.w.setZ(2.0f);
        holder.getClass();
        holder.addCallback((SurfaceHolder$Callback)new fon(this));
        this.k.g();
    }
    
    public final void bs() {
        this.b.f("Received onModulePause");
        this.o.d().onPause();
    }
    
    public final void bt() {
        this.b.f("Received onModuleResume");
        this.c.l(true);
        final kwd t = this.t;
        if (t != null) {
            t.e();
        }
        this.o.d().onResume();
    }
    
    @Override
    public final void close() {
        this.b.f("Received close");
    }
    
    public final void m() {
        this.b.f("Received onModuleStart");
        this.k.f("MORE_MODES-start");
        this.n.r(this.m, true);
        final isr a = this.A;
        final SurfaceView v = this.v;
        v.getClass();
        a.a((View)v);
        final View w = this.w;
        w.getClass();
        a.a(w);
        final lfj e = this.z.a.e(this.p.e());
        e.getClass();
        final lfg a2 = this.z.a.a(e);
        this.r.m();
        if (this.x == null) {
            final Point point = new Point();
            this.l.getDefaultDisplay().getSize(point);
            final kre f = Collections.max((Collection<? extends kre>)nov.w(a2.w(), new fom(kre.f(point).e())), (Comparator<? super kre>)aab.b);
            final krr b = this.b;
            final String value = String.valueOf(f);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
            sb.append("Viewfinder size: ");
            sb.append(value);
            b.f(sb.toString());
            this.f = f;
            final SurfaceHolder u = this.u;
            u.getClass();
            u.setFixedSize(f.a, f.b);
            this.x = kxc.m(e, f);
        }
        final kre f2 = this.f;
        final SurfaceHolder u2 = this.u;
        final kxb x = this.x;
        f2.getClass();
        u2.getClass();
        x.getClass();
        final kwf a3 = kwg.a();
        a3.f(e);
        a3.d(x);
        final kwd a4 = this.z.a(a3.a());
        a4.getClass();
        this.t = a4;
        final kwz a5 = a4.b().a(x);
        this.g = a5;
        this.y = a4.r(a4.s(a5), 1);
        a.c(f2.a, f2.b);
        this.h.set(false);
        final kvw y = this.y;
        y.getClass();
        y.k(new foq(this));
        this.k.g();
    }
    
    public final void o() {
        this.b.f("Received onModuleStop");
        final isr a = this.A;
        final SurfaceView v = this.v;
        v.getClass();
        a.b((View)v);
        final isr a2 = this.A;
        final View w = this.w;
        w.getClass();
        a2.b(w);
        final kwd t = this.t;
        t.getClass();
        t.close();
        this.t = null;
        this.x = null;
        this.g = null;
        try (final kvw y = this.y) {}
        this.y = null;
    }
    
    @Override
    public final boolean t() {
        return false;
    }
}
