import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jgs extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ jgu a;
    
    public jgs(final jgu a) {
        this.a = a;
    }
    
    public final boolean onDoubleTap(final MotionEvent motionEvent) {
        this.a.f.b();
        final jgu a = this.a;
        final jgk jgk = ((nqk)a.g).d.get(((kkz)a.h).d);
        if (jgk != null) {
            if (!this.a.j.k(cxr.bh)) {
                final cxl j = this.a.j;
                final cxm a2 = cxx.a;
                j.b();
            }
            else {
                if (jgk == jgk.b && !jgu.b) {
                    return true;
                }
                final jax u = this.a.u;
                if (jgk == jgk.a) {
                    final jjq jjq = (jjq)u.a;
                    if (jjq.T.g()) {
                        ((hpj)jjq.T.c()).b();
                    }
                    else {
                        if (!jjq.c.k(cxr.T)) {
                            jjq.h();
                        }
                        jjq.z.d();
                    }
                }
                else if (jgk == jgk.b) {
                    u.b.switchCamera();
                }
                else if (jgk != jgk.c) {
                    final String value = String.valueOf(jgk);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 33);
                    sb.append("Invalid double tap action option ");
                    sb.append(value);
                    throw new IllegalStateException(sb.toString());
                }
                return false;
            }
        }
        return false;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        final jau t = this.a.t;
        if (Math.abs(n) > Math.abs(n2)) {
            t.a.c(n);
        }
        else {
            t.a.c(n2);
        }
        return false;
    }
    
    public final void onLongPress(final MotionEvent motionEvent) {
        final jgu a = this.a;
        a.l = true;
        a.f.b();
        final jgu a2 = this.a;
        a2.e.c(a2.a(motionEvent));
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, float m, final float n) {
        this.a.e.g();
        final jgu a = this.a;
        final int q = a.q;
        if (q == 0) {
            throw null;
        }
        switch (q - 1) {
            default: {
                throw new IllegalStateException("Unknown scrolling state");
            }
            case 2: {
                a.s.a(n);
                return true;
            }
            case 1: {
                a.r.a(m);
                return true;
            }
            case 0: {
                if (a.o > 0) {
                    return false;
                }
                m += a.m;
                a.m = m;
                a.n += n;
                if (jgu.e(m)) {
                    final jgu a2 = this.a;
                    a2.r.a(a2.m);
                    this.a.q = 2;
                    return true;
                }
                if (jgu.e(this.a.n)) {
                    final jgu a3 = this.a;
                    a3.s.a(a3.n);
                    this.a.q = 3;
                    return true;
                }
                return false;
            }
        }
    }
    
    public final boolean onSingleTapConfirmed(final MotionEvent motionEvent) {
        final jgu a = this.a;
        a.f.a(a.a(motionEvent));
        return false;
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        final jgu a = this.a;
        a.f.e(a.a(motionEvent));
        return false;
    }
}
