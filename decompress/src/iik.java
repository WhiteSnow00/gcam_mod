import java.util.concurrent.TimeUnit;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;

// 
// Decompiled by Procyon v0.6.0
// 

class iik extends iij
{
    final /* synthetic */ iim a;
    
    public iik(final iim a) {
        this.a = a;
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public final void f() {
        final dgn c = this.a.c;
        boolean b = false;
        c.i(false);
        this.a.d.startAutoTimerCapturing();
        final iim a = this.a;
        a.j = a.b.r();
        this.a.b.l(false);
        this.a.b.v(false);
        this.a.e.K();
        this.a.f.d(false);
        this.a.g.j();
        jgu.c();
        final bvq a2 = this.a.a;
        if (a2.a.d == bwa.b) {
            b = true;
        }
        njo.r(b, "Cannot transition to CAPTURING from %s", a2.a.d);
        a2.d(bwa.c);
        final bwq c2 = a2.c;
        final AutoTimerIndicatorView c3 = c2.c;
        if (c3 != null) {
            final ViewPropertyAnimator f = c3.f;
            if (f != null) {
                nov.z(f);
                f.cancel();
                c3.f = null;
            }
            final ViewPropertyAnimator setListener = c3.animate().setDuration(AutoTimerIndicatorView.a.toMillis()).alpha(1.0f).setListener((Animator$AnimatorListener)new bwt(c3));
            setListener.start();
            c3.f = setListener;
            c3.b(c3.getLeft(), c3.getTop(), c3.getRight(), c3.getBottom());
            c3.addOnLayoutChangeListener(c3.c);
            c2.d = true;
        }
        final bvz b2 = a2.b;
        ++b2.f;
        b2.b.c();
        b2.b.d();
        b2.d.clear();
        b2.c.clear();
        a2.e.b(2131886106);
    }
    
    @Override
    public final void g() {
        final bvq a = this.a.a;
        njo.r(a.a.d == bwa.c, "Cannot transition to IDLE from %s", a.a.d);
        a.d(bwa.b);
        final bwq c = a.c;
        final AutoTimerIndicatorView c2 = c.c;
        if (c2 != null) {
            final ViewPropertyAnimator f = c2.f;
            if (f != null) {
                nov.z(f);
                f.cancel();
                c2.f = null;
            }
            final ViewPropertyAnimator setListener = c2.animate().setDuration(AutoTimerIndicatorView.a.toMillis()).alpha(0.0f).setListener((Animator$AnimatorListener)new bwu(c2));
            setListener.start();
            c2.f = setListener;
            c2.removeOnLayoutChangeListener(c2.c);
            c.d = false;
        }
        final njn b = a.b.b;
        if (b.a) {
            b.e();
        }
        if (a.b.f > 0) {
            final bvy d = a.d;
            final okt m = oau.h.m();
            final String string = d.b.a.toString();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oau oau = (oau)m.b;
            string.getClass();
            final int a2 = oau.a | 0x1;
            oau.a = a2;
            oau.b = string;
            final bvz b2 = d.b;
            final int f2 = b2.f;
            final int a3 = a2 | 0x2;
            oau.a = a3;
            oau.c = f2;
            oau.d = 0;
            oau.a = (a3 | 0x4);
            final long a4 = b2.b.a(TimeUnit.MILLISECONDS);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oau oau2 = (oau)m.b;
            oau2.a |= 0x8;
            oau2.e = a4;
            int size = d.b.d.size();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oau oau3 = (oau)m.b;
            oau3.a |= 0x10;
            if ((oau3.f = size) > 1) {
                --size;
                final long g = (d.b.d.get(size) - d.b.d.get(0)) / size;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final oau oau4 = (oau)m.b;
                oau4.a |= 0x20;
                oau4.g = g;
            }
            d.a.z((oau)m.h());
        }
        a.e.b(2131886107);
        this.a.d.stopAutoTimerCapturing();
        final iim a5 = this.a;
        a5.b.l(a5.j);
        final iim a6 = this.a;
        a6.b.v(a6.j);
        this.a.e.ab();
        this.a.f.d(true);
        this.a.g.i();
        jgu.d();
        if ((boolean)((kkz)this.a.h.a).d || !(boolean)((kkz)this.a.c.a()).d) {
            this.a.c.o(false, false);
        }
        if (this.a.i.E() || !this.a.i.D(jbm.b)) {
            this.a.i.h();
        }
        if (((kkz)this.a.h.a).d) {
            this.a.c.l(true);
        }
    }
}
