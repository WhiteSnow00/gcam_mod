// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.views;

import android.view.View$MeasureSpec;
import java.util.Iterator;
import android.view.MotionEvent;
import android.content.res.Configuration;
import android.view.WindowInsets;
import j$.util.Objects;
import android.graphics.Rect;
import android.util.Size;
import android.os.Trace;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;
import android.view.WindowManager;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.apps.camera.ui.mars.MarsSwitch;
import com.google.android.apps.camera.zoomui.ZoomUi;
import java.util.Set;
import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import com.google.android.apps.camera.ui.breadcrumbs.BreadcrumbsView;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.ui.layout.GcaLayout;

public class MainActivityLayout extends GcaLayout implements exn, exh
{
    private ModeSwitcher A;
    private BreadcrumbsView B;
    private CutoutBar C;
    private MoreModesGrid D;
    private BottomBar E;
    private OptionsMenuContainer F;
    private GradientBar G;
    private boolean H;
    private View I;
    public final Set e;
    public final Set f;
    public ZoomUi g;
    public MarsSwitch h;
    public niz i;
    public niz j;
    public niz k;
    public niz l;
    public niz m;
    public niz n;
    public niz o;
    public niz p;
    public AtomicReference q;
    public klv r;
    public hyt s;
    public cxl t;
    public cse u;
    public gkw v;
    public liz w;
    public lae x;
    public ewy y;
    private final WindowManager z;
    
    public MainActivityLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.e = new HashSet();
        this.f = new HashSet();
        this.i = nii.a;
        this.j = nii.a;
        this.k = nii.a;
        this.l = nii.a;
        this.m = nii.a;
        this.n = nii.a;
        this.o = nii.a;
        this.p = nii.a;
        this.I = null;
        ((iyw)((egq)context).b(iyw.class)).b(this);
        this.z = (WindowManager)context.getSystemService("window");
        this.y.c(this);
    }
    
    private final boolean s(final inv inv) {
        if (this.q.get() != null) {
            if (this.q.get().a.equals(inv)) {
                if (!this.H) {
                    return false;
                }
            }
        }
        this.H = false;
        final boolean a = inv.a();
        iod iod = null;
        if (!a) {
            ins ins;
            if (this.q.get() == null) {
                ins = ins.a;
            }
            else {
                ins = this.q.get().b;
            }
            this.q.set(inw.a(inv, ins, null));
            return false;
        }
        Trace.beginSection("updateLayoutBoxes");
        final boolean k = this.t.k(cwv.H);
        final cxl t = this.t;
        final cxm a2 = cya.a;
        t.c();
        final ins c = inq.c(inv, iwu.d(this.getContext()), this.getContext(), this.s, new iyu(this), k);
        if (c.o) {
            this.H = true;
            this.post((Runnable)new iyv(this));
        }
        if (this.I != null) {
            if (iwu.d(this.getContext())) {
                final Size c2 = inv.c;
                nov.z(c2);
                final kqp f = kqp.f(c2);
                final Size b = c.b;
                kqp kqp;
                if (f.j(kqp.a)) {
                    kqp = kqp.a;
                }
                else {
                    kqp = f;
                    if (f.j(kqp.b)) {
                        kqp = kqp.b;
                    }
                }
                final int e = this.v.f().e;
                final lfj e2 = this.x.a.e(this.u.e());
                e2.getClass();
                final kra b2 = kra.b(e + this.x.a.a(e2).f());
                kqp i = null;
                Label_0373: {
                    if (!b2.equals(kra.b)) {
                        i = kqp;
                        if (!b2.equals(kra.d)) {
                            break Label_0373;
                        }
                    }
                    i = kqp.i();
                }
                final float min = Math.min(b.getWidth() / (float)i.c, b.getHeight() / (float)i.d);
                iod = iod.a(new Size(Math.round(i.c * min), Math.round(min * i.d)), new Rect(), new Rect(), 17);
            }
            else {
                final Size b3 = c.b;
                final Rect e3 = c.e;
                iod = iod.a(new Size(-1, -1), new Rect(inq.a((float)e3.left), inq.a((float)e3.top), b3.getWidth() - inq.a((float)e3.right), b3.getHeight() - inq.a((float)e3.bottom)), new Rect(0, 0, 0, 0), 51);
            }
        }
        ins b4 = c;
        if (this.q.get() != null) {
            b4 = c;
            if (c.equals(this.q.get().b)) {
                b4 = this.q.get().b;
            }
        }
        iod c3 = iod;
        if (this.q.get() != null) {
            c3 = iod;
            if (Objects.equals((Object)iod, (Object)this.q.get().c)) {
                c3 = this.q.get().c;
            }
        }
        this.q.set(inw.a(inv, b4, c3));
        Trace.endSection();
        return true;
    }
    
    private final void t(final Size b) {
        final inv d = this.d();
        final Size b2 = d.b;
        jcb jcb;
        if (b2 != null) {
            jcb = jcb.c(this.z.getDefaultDisplay(), this.getContext(), b2.getWidth(), b2.getHeight());
        }
        else {
            jcb = d.f;
        }
        final inu b3 = d.b();
        b3.e(jcb);
        b3.b = b;
        b3.c();
        if (this.s(b3.a())) {
            this.requestLayout();
            this.invalidate();
        }
        if (this.j.g()) {
            final ViewfinderCover p = ((ekf)this.j.c()).a.P;
            if (!p.j) {
                p.j = true;
                p.requestLayout();
            }
        }
    }
    
    @Override
    public final void bi() {
        this.requestLayout();
    }
    
    public final inv d() {
        inv inv;
        if (this.q.get() == null) {
            inv = inv.a;
        }
        else {
            inv = this.q.get().a;
        }
        return inv;
    }
    
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets dispatchApplyWindowInsets) {
        try {
            Trace.beginSection("MAL.dispatchApplyWindowInsets");
            dispatchApplyWindowInsets = super.dispatchApplyWindowInsets(dispatchApplyWindowInsets);
            return dispatchApplyWindowInsets;
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final void dispatchConfigurationChanged(final Configuration configuration) {
        Trace.beginSection("MAL.dispatchConfigurationChanged");
        iwu.b(this.getContext());
        super.dispatchConfigurationChanged(configuration);
        iwu.c();
        Trace.endSection();
    }
    
    public final void e() {
        final View i = this.I;
        if (i != null) {
            i.setPadding(0, 0, 0, 0);
            this.I = null;
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public final void f(final View i) {
        this.I = i;
        if (this.q.get() != null) {
            this.q.set(inw.a(inv.a, this.q.get().b, null));
        }
        this.requestLayout();
        this.invalidate();
    }
    
    public final void g(final int n, final int n2) {
        this.t(new Size(n, n2));
    }
    
    public final void h() {
        this.t(this.d().b);
    }
    
    public final void i() {
        final inv d = this.d();
        if (this.l.g() && d.f != null) {
            ((bvb)this.l.c()).i(d.f);
        }
    }
    
    public final void j(final jcb jcb) {
        if (this.o.g() && jcb != null) {
            ((jib)this.o.c()).b();
        }
    }
    
    public final void k(final jcb jcb) {
        final MarsSwitch h = this.h;
        if (h != null && jcb != null) {
            h.a(jcb);
        }
    }
    
    public final void l(final jcb jcb) {
        if (this.m.g() && jcb != null) {
            ((cor)this.m.c()).e(jcb);
        }
    }
    
    public final void m(final jcb jcb) {
        if (this.p.g() && jcb != null) {
            ((ejj)this.p.c()).c();
        }
    }
    
    public final void n() {
        final inv d = this.d();
        if (this.i.g() && d.f != null) {
            ((hda)this.i.c()).y(d.f);
        }
    }
    
    public final void o() {
        final inv d = this.d();
        if (this.k.g() && d.f != null) {
            ((hrj)this.k.c()).g(d.f);
        }
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.G = (GradientBar)this.findViewById(2131427629);
        this.C = (CutoutBar)this.findViewById(2131427530);
        this.A = (ModeSwitcher)this.findViewById(2131427775);
        this.B = (BreadcrumbsView)this.findViewById(2131427464);
        this.D = (MoreModesGrid)this.findViewById(2131427777);
        this.E = (BottomBar)this.findViewById(2131427450);
        this.F = (OptionsMenuContainer)this.findViewById(2131427823);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final Iterator iterator = this.e.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final jwn jwn = (jwn)iterator.next();
            if (jwn.a(motionEvent) && jwn.b(new jdh(motionEvent, this.getRootView()))) {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                boolean b;
                if (this.q.get() == null) {
                    b = false;
                }
                else {
                    final Rect i = this.q.get().b.i;
                    b = (x > i.left && x < i.right && y > i.top && y < i.bottom);
                }
                n |= ((b ^ true) ? 1 : 0);
            }
        }
        return n || super.onInterceptTouchEvent(motionEvent);
    }
    
    @Override
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        iwu.c();
    }
    
    @Override
    public final void onMeasure(final int n, final int n2) {
        Trace.beginSection("MAL.onMeasurePrologue");
        final Context context = this.getContext();
        iwu.b(context);
        Size size = new Size(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
        final jcb b = jcb.b(iwu.a(context), iwu.d(context), size.getWidth(), size.getHeight());
        final inv d = this.d();
        final Size c = d.c;
        final inu b2 = d.b();
        b2.e(b);
        b2.a = size;
        b2.d((jbm)this.r.aQ());
        final boolean b3 = this.w.b;
        boolean b4 = false;
        if (!b3 && jvu.v((View)this)) {
            b4 = true;
        }
        b2.b(b4);
        if (c != null) {
            size = c;
        }
        b2.b = size;
        final inv a = b2.a();
        nov.A(a.a());
        if (this.s(a)) {
            this.E.setUiOrientation(a.f);
            final ModeSwitcher a2 = this.A;
            final jcb f = a.f;
            if (a2.g != f) {
                a2.g = f;
                a2.d();
            }
            final MoreModesGrid d2 = this.D;
            final jcb f2 = a.f;
            if (!d2.c.g()) {
                jcb jcb;
                if (f2 == jcb.a) {
                    jcb = jcb.b;
                }
                else {
                    jcb = jcb.a;
                }
                d2.c = niz.i(jcb);
            }
            d2.d = f2;
            final BreadcrumbsView b5 = this.B;
            final jcb f3 = a.f;
            if (b5.d != f3) {
                b5.d = f3;
                b5.d();
            }
            int n3;
            int n4;
            if (jcb.d(b)) {
                n3 = this.q.get().b.e.top;
                n4 = this.q.get().b.d.top;
            }
            else if (b == jcb.b) {
                n3 = this.q.get().b.e.left;
                n4 = this.q.get().b.d.left;
            }
            else {
                n3 = this.q.get().b.b.getWidth() - this.q.get().b.e.right;
                n4 = this.q.get().b.b.getWidth() - this.q.get().b.d.right;
            }
            this.F.p(a.f, n3 - n4);
            this.l(a.f);
            this.p(a.f);
            this.m(a.f);
            this.k(a.f);
            this.j(a.f);
            final GradientBar g = this.G;
            final jcb f4 = a.f;
            if (g.a != f4) {
                g.a = f4;
                g.a();
            }
            final CutoutBar c2 = this.C;
            final jcb f5 = a.f;
            if (c2.f != f5) {
                c2.f = f5;
                c2.a();
            }
            this.q();
            this.n();
            this.o();
            this.i();
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                ((jbv)iterator.next()).E();
            }
        }
        Trace.endSection();
        super.onMeasure(n, n2);
    }
    
    public final void p(final jcb jcb) {
        if (this.n.g() && jcb != null) {
            ((cpu)this.n.c()).j(jcb);
        }
    }
    
    public final void q() {
        final inv d = this.d();
        final ZoomUi g = this.g;
        if (g != null) {
            final jcb f = d.f;
            if (f != null) {
                g.o(f);
            }
        }
    }
    
    public final void r(final jwn jwn) {
        kjm.a();
        this.e.add(jwn);
    }
}
