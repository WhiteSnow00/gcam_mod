import java.util.ArrayList;
import android.view.View$OnTouchListener;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import java.util.Iterator;
import android.widget.FrameLayout$LayoutParams;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.MotionEvent;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import android.view.WindowManager;
import java.util.Set;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import com.google.android.apps.camera.zoomui.ZoomUi;
import android.widget.SeekBar;
import com.google.android.apps.camera.zoomui.ZoomKnob;
import android.content.res.Resources;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjq implements jjb, krc
{
    private static final nsd V;
    public lfu A;
    public ImageButton B;
    public ImageButton C;
    public niz D;
    public Resources E;
    public ZoomKnob F;
    public SeekBar G;
    public ZoomUi H;
    public jin I;
    public PointF J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public float O;
    public float P;
    public float Q;
    public int R;
    public int S;
    public final niz T;
    public final AnimatorListenerAdapter U;
    private final der W;
    private final Set X;
    private final WindowManager Y;
    private niz Z;
    public final AtomicInteger a;
    private List aa;
    private boolean ab;
    private final boolean ac;
    private final lfw ad;
    public final cse b;
    public final cxl c;
    public final kjk d;
    public final klv e;
    public final klv f;
    public final klv g;
    public final Set h;
    public final efm i;
    public final hkg j;
    public final eyt k;
    public final boolean l;
    public final liz m;
    public final klj n;
    public final klj o;
    public final AtomicBoolean p;
    public final Runnable q;
    public final Runnable r;
    public final klv s;
    public final klv t;
    public final jdj u;
    public final niz v;
    public final Executor w;
    public final AtomicBoolean x;
    public jkj y;
    public jkf z;
    
    static {
        V = nsd.g("com/google/android/apps/camera/zoomui/ZoomUiControllerImpl");
    }
    
    public jjq(final klv g, final Set set, final igw igw, final eyt k, final cxl c, final efm i, final hkg j, final lfw ad, final der w, final cse b, final liz m, final klv n, final klj o, final jdj u, final Executor w2, final WindowManager y, final niz t) {
        this.a = new AtomicInteger(0);
        final Float value = 1.0f;
        this.e = new kkz(value);
        this.f = new kkz(value);
        this.p = new AtomicBoolean(false);
        this.q = new jjd(this);
        this.r = new jjd(this, 2);
        this.s = new kkz(value);
        this.t = new kkz(value);
        this.x = new AtomicBoolean(false);
        this.A = lfu.b;
        this.Z = nii.a;
        this.D = nii.a;
        this.U = new jjl(this);
        this.d = new kjk();
        this.g = g;
        this.l = igw.a();
        this.k = k;
        this.c = c;
        (this.h = new HashSet(set)).add(new jjp(this));
        this.X = new HashSet();
        this.i = i;
        this.j = j;
        this.ad = ad;
        this.W = w;
        this.b = b;
        this.m = m;
        this.n = n;
        this.o = o;
        this.L = c.k(cxr.T);
        this.u = u;
        this.w = w2;
        this.v = c.a(cxr.a);
        this.ac = c.k(cxr.S);
        this.Y = y;
        this.T = t;
    }
    
    private final fxu V() {
        final lfw ad = this.ad;
        ad.getClass();
        final lfj b = der.b(ad, this.c, this.A);
        if (this.Z() && this.b.e().equals(lfu.a)) {
            final lfw ad2 = this.ad;
            b.getClass();
            return grd.h(ad2.f(b), this.ad);
        }
        final lfw ad3 = this.ad;
        b.getClass();
        return ad3.f(b);
    }
    
    private final void W(final int n) {
        this.C.setVisibility(n);
        this.B.setVisibility(n);
    }
    
    private final void X() {
        float n2;
        final float n = n2 = this.P;
        if (this.c.k(cwv.y)) {
            n2 = n;
            if (this.Z.g()) {
                final kmt a = kmt.a;
                switch (((kmt)this.Z.c()).ordinal()) {
                    default: {
                        throw new IllegalArgumentException("Unknown camcorder capture rate");
                    }
                    case 3:
                    case 4:
                    case 5: {
                        if (this.ab) {
                            n2 = Math.min(n, (float)this.c.g(cwv.z).c());
                            break;
                        }
                        n2 = Math.min(n, (float)this.c.g(cwv.A).c());
                        break;
                    }
                    case 1:
                    case 2: {
                        if (this.m.j) {
                            n2 = n;
                            if (this.ab) {
                                break;
                            }
                        }
                        n2 = Math.min(n, (float)this.c.g(cwv.z).c());
                        break;
                    }
                    case 0:
                    case 6:
                    case 7: {
                        n2 = Math.min(n, (float)this.c.g(cwv.A).c());
                        break;
                    }
                }
            }
        }
        float min = n2;
        if (lfu.a == this.A) {
            min = Math.min(n2, 4.0f);
        }
        final Float value = min;
        if ((float)this.g.aQ() > min) {
            this.g.aR(value);
            this.s.aR(value);
        }
        this.z.s = min;
        this.e.aR(value);
        this.R();
        this.N();
    }
    
    private final boolean Y(final fxu fxu) {
        return this.A == lfu.a && fxu.A();
    }
    
    private final boolean Z() {
        return this.ac && this.b.e().equals(lfu.a);
    }
    
    private final boolean aa() {
        final jbm jbm = (jbm)this.n.aQ();
        return jbm == jbm.c || jbm == jbm.n;
    }
    
    @Override
    public final void A() {
        this.z.m(this.U(false), 9);
    }
    
    @Override
    public final void B(final float n) {
        this.z.m(n, 1);
    }
    
    @Override
    public final boolean C() {
        return this.c.k(cxr.U);
    }
    
    @Override
    public final boolean D(final jbm jbm) {
        this.F.setAccessibilityLiveRegion(0);
        return this.d() == this.a(false, jbm);
    }
    
    @Override
    public final boolean E() {
        if (this.L) {
            final float d = this.d();
            return d != 1.0f && d != 2.0f && d != 0.615f && d != 1.5f;
        }
        return this.d() != this.a(false, (jbm)this.n.aQ());
    }
    
    @Override
    public final void F() {
        if (!this.c.k(cwv.H)) {
            return;
        }
        final ZoomUi h = this.H;
        if (h.c) {
            return;
        }
        final jio a = jio.a;
        final jcb a2 = jcb.a;
        switch (h.b.ordinal()) {
            default: {
                h.f.cancel();
                break;
            }
            case 2: {
                h.g.cancel();
                break;
            }
            case 1: {
                h.h.cancel();
                break;
            }
        }
        h.c = true;
        if (h.b == jcb.b) {
            h.h.start();
            return;
        }
        if (h.b == jcb.c) {
            h.g.start();
            return;
        }
        h.f.start();
    }
    
    @Override
    public final void G(final jbm jbm, final boolean b) {
        if (!b && (!this.m.c() || jbm.m != jbm)) {
            return;
        }
        if (!this.c.k(cxr.T)) {
            this.g();
        }
        this.p(false);
    }
    
    public final float H() {
        if (this.A == lfu.a && this.L) {
            return this.I.a(1);
        }
        return 1.0f;
    }
    
    final float I() {
        final fxu v = this.V();
        final float a = this.W.a(v);
        float n;
        if (this.A == lfu.b) {
            n = (float)this.c.g(cyc.g).c() * a;
        }
        else if (!v.A() && !this.L) {
            n = 1.2f * a;
        }
        else {
            if (this.Z()) {
                return this.c();
            }
            n = 1.0f;
        }
        return n;
    }
    
    public final float J(final MotionEvent motionEvent) {
        final ZoomUi h = this.H;
        jcb jcb;
        if (((View)h).getDisplay() == null) {
            jcb = jcb.a;
        }
        else {
            jcb = jcb.a(((View)h).getDisplay(), ((View)h).getContext());
        }
        if (this.J == null) {
            return 0.0f;
        }
        float n;
        float n2;
        if (jcb.d(jcb)) {
            n = this.J.x;
            n2 = motionEvent.getRawX();
        }
        else if (jcb.equals(jcb.c)) {
            n = this.J.y;
            n2 = motionEvent.getRawY();
        }
        else {
            n = motionEvent.getRawY();
            n2 = this.J.y;
        }
        return n2 - n;
    }
    
    public final int K(final float n) {
        final int round = Math.round((float)(Math.log(n / (float)((kkz)this.f).d) / Math.log((float)((kkz)this.e).d / (float)((kkz)this.f).d)) * 100000.0f);
        if (this.G.getProgress() != round && !this.H.r()) {
            this.G.setProgress(round);
        }
        return round;
    }
    
    final void L() {
        this.z.r();
    }
    
    public final void M() {
        if (this.p.get()) {
            return;
        }
        this.M = true;
        this.N = true;
        final int k = this.K((float)((kkz)this.s).d);
        this.F.c(k, (float)((kkz)this.s).d, (float)((kkz)this.f).d, this.H());
        final ZoomUi h = this.H;
        jcb jcb;
        if (((View)h.getParent()).getDisplay() == null) {
            jcb = jcb.a;
        }
        else {
            jcb = jcb.a(((View)h.getParent()).getDisplay(), h.getContext());
        }
        final PointF j = this.J;
        float q = 0.0f;
        if (j != null) {
            int n;
            int n2;
            if (this.Y != null) {
                final DisplayMetrics displayMetrics = new DisplayMetrics();
                this.Y.getDefaultDisplay().getRealMetrics(displayMetrics);
                n = displayMetrics.widthPixels;
                n2 = displayMetrics.heightPixels;
            }
            else {
                n = this.E.getDisplayMetrics().widthPixels;
                n2 = this.E.getDisplayMetrics().heightPixels;
            }
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)this.F.getLayoutParams();
            if (jcb.d(jcb)) {
                q = this.J.x - frameLayout$LayoutParams.leftMargin - n / 2;
            }
            else if (jcb.equals(jcb.c)) {
                if (this.J.y < 0.0f) {
                    q = this.J.x - frameLayout$LayoutParams.leftMargin - n2 / 2;
                }
                else {
                    q = this.J.y - frameLayout$LayoutParams.leftMargin - n2 / 2;
                }
            }
            else if (this.J.x < 0.0f) {
                q = n2 + this.J.x - frameLayout$LayoutParams.leftMargin - n2 / 2;
            }
            else {
                q = n2 - this.J.y - frameLayout$LayoutParams.leftMargin - n2 / 2;
            }
        }
        this.Q = q;
        this.z.p();
        this.G.setProgress(k);
    }
    
    public final void N() {
        final Iterator iterator = this.X.iterator();
        while (iterator.hasNext()) {
            ((jja)iterator.next()).a();
        }
    }
    
    public final void O(final ImageButton imageButton, final boolean b) {
        imageButton.setOnClickListener((View$OnClickListener)new jjc(this, b));
        imageButton.setOnLongClickListener((View$OnLongClickListener)new jjf(this, b));
        imageButton.setOnTouchListener((View$OnTouchListener)new jjg(this));
    }
    
    public final void P() {
        this.L();
        this.z.w();
    }
    
    public final void Q(final int s) {
        this.S = s;
        this.R = 0;
    }
    
    public final void R() {
        final ArrayList aa = new ArrayList();
        float floatValue = (float)((kkz)this.f).d;
        float a;
        if (this.Y(this.V())) {
            a = this.W.a(this.V());
        }
        else {
            a = 2.0f;
        }
        while (floatValue > 0.0f && a > 1.0f && floatValue < (float)((kkz)this.e).d) {
            aa.add(floatValue);
            float n = floatValue;
            if (floatValue < 1.0f) {
                aa.add(1.0f);
                n = 1.0f;
            }
            floatValue = n * a;
        }
        aa.add(((kkz)this.e).d);
        this.aa = aa;
    }
    
    public final boolean S() {
        final float c = this.I.c(this.c(), this.c());
        if (this.m.j) {
            return c >= 1.0f || this.c() >= 1.0f || ((jbm)this.n.aQ()).equals(jbm.g) || ((jbm)this.n.aQ()).equals(jbm.f) || (((jbm)this.n.aQ()).equals(jbm.c) && this.ab && (this.Z.c() == kmt.d || this.Z.c() == kmt.e || this.Z.c() == kmt.f)) || this.b.e().equals(lfu.a);
        }
        return c >= 1.0f || this.c() >= 1.0f || ((jbm)this.n.aQ()).equals(jbm.g) || this.b.e().equals(lfu.a);
    }
    
    public final boolean T() {
        return this.K && lfu.a == this.A;
    }
    
    public final float U(final boolean b) {
        float n2;
        if (b) {
            final Float n = (Float)nov.c(nov.w(this.aa, new jjk(this)), ((kkz)this.e).d);
            n.getClass();
            n2 = n;
        }
        else {
            final Float n3 = (Float)nov.e(nov.w(this.aa, new jjk(this, 1)), ((kkz)this.f).d);
            n3.getClass();
            n2 = n3;
        }
        this.g.aQ();
        return n2;
    }
    
    @Override
    public final float a(final boolean b, final jbm jbm) {
        if (jbm == jbm.g && this.A == lfu.a) {
            final cxl c = this.c;
            final cxo a = cyc.a;
            c.b();
        }
        final fxu v = this.V();
        float n = (float)this.o.aQ();
        if (this.Y(v) && !b) {
            n = this.W.a(v);
        }
        else if (this.Z()) {
            if (this.A == lfu.a && this.L) {
                if (this.aa()) {
                    n = this.I.a(jio.a.ordinal());
                }
                else {
                    n = this.I.a(jio.b.ordinal());
                }
            }
            else if (jbm == jbm.g) {
                return this.I();
            }
        }
        else if (jbm == jbm.g) {
            if (this.A == lfu.a && this.L) {
                n = this.I.a(jio.b.ordinal());
            }
            else {
                n = this.I();
            }
        }
        return n;
    }
    
    @Override
    public final float b() {
        return (float)((kkz)this.e).d;
    }
    
    @Override
    public final float c() {
        return (float)((kkz)this.f).d;
    }
    
    @Override
    public final void close() {
        this.d.close();
    }
    
    @Override
    public final float d() {
        return (float)this.g.aQ();
    }
    
    @Override
    public final void e(final jja jja) {
        this.X.add(jja);
    }
    
    @Override
    public final void f(final boolean b) {
        if (!this.c.k(cwv.H)) {
            return;
        }
        final ZoomUi h = this.H;
        if (!h.c) {
            return;
        }
        final jio a = jio.a;
        final jcb a2 = jcb.a;
        switch (h.b.ordinal()) {
            default: {
                h.f.cancel();
                break;
            }
            case 2: {
                h.g.cancel();
                break;
            }
            case 1: {
                h.h.cancel();
                break;
            }
        }
        if (!b) {
            if (h.b == jcb.b) {
                h.h.reverse();
                h.h.end();
            }
            else if (h.b == jcb.c) {
                h.g.reverse();
                h.g.end();
            }
            else {
                h.f.reverse();
                h.f.end();
            }
            h.c = false;
            return;
        }
        h.c = false;
        if (h.b == jcb.b) {
            h.h.reverse();
            return;
        }
        if (h.b == jcb.c) {
            h.g.reverse();
            return;
        }
        h.f.reverse();
    }
    
    @Override
    public final void g() {
        if (!this.l) {
            this.z.a();
            this.L();
        }
    }
    
    @Override
    public final void h() {
        njo.o(kjm.c());
        this.G.isEnabled();
        if (this.L && !this.l) {
            final float c = this.c();
            final int n = 4;
            int n2;
            if (c < 1.0f && this.n.aQ() != jbm.f && this.n.aQ() != jbm.g && !this.S()) {
                final jbm jbm = (jbm)this.n.aQ();
                final float c2 = this.c();
                boolean b = false;
                if (c2 < 1.0f && this.b.e().equals(lfu.b) && this.m.j) {
                    b = true;
                }
                if (!jbm.equals(jbm.b) && !jbm.equals(jbm.m)) {
                    if ((jbm.equals(jbm.c) || jbm.equals(jbm.n)) && b && this.ab && (this.Z.c() == kmt.c || this.Z.c() == kmt.b)) {
                        n2 = n;
                    }
                    else {
                        n2 = 3;
                    }
                }
                else if (b) {
                    n2 = n;
                }
                else {
                    n2 = 3;
                }
            }
            else if (!this.S()) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            this.z.j(n2);
            return;
        }
        this.z.i();
        if (!this.l && !this.E()) {
            this.P();
            return;
        }
        this.L();
    }
    
    @Override
    public final void i(final boolean x) {
        this.z.x = x;
    }
    
    @Override
    public final void j() {
        if (this.L && (this.m.d() || this.m.j)) {
            if (!this.b.e().equals(lfu.a)) {
                this.q();
            }
            else if (this.Z() && this.aa()) {
                this.q();
            }
            else {
                this.w(jiq.c);
            }
            this.h();
        }
    }
    
    @Override
    public final void k(final float n) {
        this.z.q(n);
    }
    
    @Override
    public final void l() {
        this.O = (float)this.g.aQ();
        this.z.bD();
    }
    
    @Override
    public final void m() {
        this.n();
        if (this.Z()) {
            this.o();
        }
    }
    
    @Override
    public final void n() {
        final fxu v = this.V();
        this.P = v.b();
        this.X();
        if (this.Y(v)) {
            final float a = this.W.a(v);
            if (a > 1.0f) {
                this.s(a * a);
                return;
            }
            a.k(jjq.V.b(), "unable to set zoom max with zoomValue <= 1: %g", a, '\u0be0');
        }
    }
    
    @Override
    public final void o() {
        this.t(this.V().c());
    }
    
    @Override
    public final void p(final boolean b) {
        this.F.setAccessibilityLiveRegion(0);
        final float a = this.a(b, (jbm)this.n.aQ());
        final klv g = this.g;
        final Float value = a;
        g.aR(value);
        if (this.c.k(cxr.T)) {
            this.s.aR(value);
        }
        if (this.x.get()) {
            this.n();
            this.x.set(false);
        }
    }
    
    @Override
    public final void q() {
        this.F.e.set(jiq.b);
        this.I.f.set(jiq.b);
    }
    
    @Override
    public final void r(final float n) {
        final klv g = this.g;
        final Float value = n;
        g.aR(value);
        this.s.aR(value);
    }
    
    @Override
    public final void s(final float p) {
        this.P = p;
        this.X();
    }
    
    @Override
    public final void t(final float t) {
        this.z.t = t;
        this.f.aR(t);
        this.R();
        this.N();
    }
    
    @Override
    public final void u() {
        final float i = this.I();
        this.t(i);
        if ((float)this.g.aQ() < i) {
            this.r(i);
        }
    }
    
    @Override
    public final void v(final boolean b) {
        if (b) {
            this.y.a();
            if (this.l) {
                if (!this.c.k(cxr.T)) {
                    this.W(0);
                }
                this.h();
                return;
            }
            this.W(8);
            if (!this.c.k(cxr.T)) {
                if ((float)this.g.aQ() == (float)((kkz)this.f).d) {
                    this.g();
                    return;
                }
                this.h();
            }
        }
        else {
            final jkj y = this.y;
            if (y != null) {
                y.b();
            }
        }
    }
    
    @Override
    public final void w(final jiq jiq) {
        this.F.e.set(jiq);
        this.I.f.set(jiq);
    }
    
    @Override
    public final void x() {
        if (this.L) {
            this.L();
            if (this.H.r()) {
                this.z.a();
            }
        }
        if (this.H.r()) {
            this.z.i();
        }
    }
    
    @Override
    public final void y(final niz z, final boolean b) {
        this.Z = z;
        this.ab = b;
        final jin i = this.I;
        i.g = b;
        if (z.g()) {
            i.h = (kmt)z.c();
        }
        if (z.g()) {
            this.X();
        }
    }
    
    @Override
    public final void z() {
        this.z.m(this.U(true), 9);
    }
}
