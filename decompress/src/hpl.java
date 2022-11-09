import android.view.View$OnTouchListener;
import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpl implements hpw
{
    protected final kf a;
    protected final hyt b;
    protected final njp c;
    protected final cxl d;
    protected final int e;
    public final Rect f;
    public FrameLayout g;
    public ViewGroup h;
    public View i;
    private bqr j;
    private jcb k;
    
    public hpl(final kf a, final hyt b, final njp c, final cxl d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = a.getResources().getInteger(2131492979);
        this.f = new Rect();
    }
    
    private final niz h(final bqr bqr, final njp njp) {
        final kqp e = kqp.e(bqr.a().e());
        if (kqp.a.j(e) || kqp.a.k(e)) {
            return this.a(kqp.a, njp);
        }
        if (!kqp.b.j(e) && !kqp.b.k(e)) {
            return nii.a;
        }
        return this.a(kqp.b, njp);
    }
    
    private final void i() {
        final View i = this.i;
        i.getClass();
        i.setPadding(this.f.left, this.f.top, this.f.right, this.f.bottom);
    }
    
    private final void j(final niz niz) {
        if (!niz.g()) {
            this.f.setEmpty();
            return;
        }
        final Rect k = ((ins)niz.c()).k;
        final Rect e = ((ins)niz.c()).e;
        if (jcb.b.equals(this.k)) {
            this.f.set(e.left, 0, k.width() - e.width() - e.left, 0);
            return;
        }
        if (jcb.c.equals(this.k)) {
            final int n = k.right - e.right;
            this.f.set(k.width() - e.width() - n, 0, n, 0);
            return;
        }
        this.f.set(0, e.top, 0, k.height() - e.height() - e.top);
    }
    
    protected final niz a(final kqp kqp, final njp njp) {
        final boolean j = kqp.a.j(kqp);
        boolean b = true;
        if (!j) {
            if (!kqp.b.j(kqp)) {
                b = false;
            }
        }
        njo.o(b);
        final inw inw = (inw)this.c.a();
        final inv a = inw.a;
        final Size b2 = a.b;
        if (b2 == null) {
            return nii.a;
        }
        final Size c = a.c;
        kqp f;
        if (c == null) {
            f = null;
        }
        else {
            f = kqp.f(c);
        }
        if (f != null && f.j(kqp)) {
            return niz.i(inw.b);
        }
        final boolean k = this.d.k(cwv.H);
        Size b3;
        if (!jcb.b.equals(a.f) && !jcb.c.equals(a.f)) {
            b3 = new Size(b2.getWidth(), (int)kqp.a((float)b2.getWidth()));
        }
        else {
            b3 = new Size((int)(b2.getHeight() * (float)kqp.c / kqp.d), b2.getHeight());
        }
        final inu b4 = a.b();
        b4.b = b3;
        final inv a2 = b4.a();
        final boolean d = iwu.d((Context)this.a);
        final kf a3 = this.a;
        final hyt b5 = this.b;
        final cxl d2 = this.d;
        final cxm a4 = cya.a;
        d2.c();
        return niz.i(inq.c(a2, d, (Context)a3, b5, njp, k));
    }
    
    protected final void b() {
        final fi c = this.a.c();
        final ei d = c.d("VIDEO_PLAYER_TAG");
        if (d != null) {
            final fr i = c.i();
            i.j(d);
            i.b();
        }
    }
    
    @Override
    public final void c(final boolean b) {
        this.b();
        final FrameLayout g = this.g;
        g.getClass();
        final hqa hqa = new hqa(this, b);
        ((View)g).animate().cancel();
        if (((View)g).getAlpha() != 0.0f || ((View)g).getVisibility() != 8) {
            if (!b) {
                ((View)g).setVisibility(8);
                ((View)g).setAlpha(0.0f);
                hqa.run();
            }
            else {
                ((View)g).animate().alpha(0.0f).setDuration((long)(int)(this.e * ((View)g).getAlpha())).withEndAction((Runnable)new hpk((View)g, hqa)).start();
            }
        }
        this.j = null;
    }
    
    @Override
    public final void d(final View view) {
        final View viewById = view.findViewById(2131427984);
        final View viewById2 = view.findViewById(2131427979);
        viewById.setVisibility(8);
        viewById2.setVisibility(8);
        final FrameLayout g = (FrameLayout)((ViewGroup)view.getParent()).findViewById(2131427980);
        this.g = g;
        this.h = (ViewGroup)g.findViewById(2131427982);
    }
    
    @Override
    public final void e(final jcb k) {
        this.k = k;
        final bqr j = this.j;
        if (j != null) {
            final FrameLayout g = this.g;
            g.getClass();
            this.j(this.h(j, new hpy(g)));
            this.i();
            final ei d = this.a.c().d("VIDEO_PLAYER_TAG");
            if (d instanceof jef) {
                ((jef)d).a.d(this.f);
            }
        }
    }
    
    @Override
    public final void f(final View$OnTouchListener onTouchListener) {
        final FrameLayout g = this.g;
        g.getClass();
        g.setOnTouchListener(onTouchListener);
    }
    
    @Override
    public final void g(final bqr j) {
        final bqr i = this.j;
        njo.o(i == null || j.equals(i));
        if (j.equals(this.j) && j instanceof dae) {
            final dae dae = (dae)j;
            final View k = this.i;
            k.getClass();
            final czs l = czt.k(k);
            Object drawable;
            if (l == null) {
                drawable = null;
            }
            else {
                drawable = l.a.getDrawable();
            }
            dae.h = niz.h(drawable);
        }
        this.j = j;
        final FrameLayout g = this.g;
        g.getClass();
        final niz h = this.h(j, new hpy(g));
        if (h.g()) {
            final bqr m = this.j;
            m.getClass();
            final kre e = m.a().e();
            final kre g2 = kre.g(((ins)h.c()).e);
            kre kre;
            if (e.k()) {
                kre = g2.d();
            }
            else {
                kre = g2.e();
            }
            final bqr j2 = this.j;
            j2.getClass();
            j2.h(kre.a, kre.b);
        }
        final niz h2 = niz.h(this.i);
        final FrameLayout g3 = this.g;
        g3.getClass();
        (this.i = j.i(h2, (ViewGroup)g3)).setVisibility(0);
        this.j(h);
        this.i();
        if (this.i.getParent() == null) {
            this.g.addView(this.i);
        }
        final FrameLayout g4 = this.g;
        final hpz hpz = new hpz(this, j);
        ((View)g4).animate().cancel();
        if (((View)g4).getAlpha() == 1.0f && ((View)g4).getVisibility() == 0) {
            return;
        }
        ((View)g4).setAlpha(Math.max(((View)g4).getAlpha(), 1.0E-4f));
        ((View)g4).setVisibility(0);
        ((View)g4).animate().alpha(1.0f).setDuration((long)(int)(this.e * (1.0f - ((View)g4).getAlpha()))).withEndAction((Runnable)new hpk((View)g4, hpz, 1)).start();
    }
}
