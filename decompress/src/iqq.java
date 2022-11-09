import android.view.View;
import android.util.AndroidRuntimeException;
import android.view.MotionEvent;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$SimpleOnGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqq extends GestureDetector$SimpleOnGestureListener implements View$OnTouchListener
{
    public jbm a;
    public long b;
    public final /* synthetic */ ModeSwitcher c;
    private ack d;
    
    public iqq(final ModeSwitcher c) {
        this.c = c;
        this.a = jbm.a;
        this.d = new ack(new acm(0.0f));
    }
    
    public final void a(final boolean b) {
        final nsd a = ModeSwitcher.a;
        final iqr b2 = this.c.b;
        if (b2 != null) {
            final iqw iqw = (iqw)b2;
            if (iqw.d.k == jbm.p) {
                iqw.e.setEnabled(b ^ true);
                return;
            }
            iqw.f.H(b ^ true);
        }
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        this.a = this.c.k;
        this.b = motionEvent.getEventTime();
        this.a(true);
        return false;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, float n, float a) {
        final nsd a2 = ModeSwitcher.a;
        final ack d = this.d;
        if (!d.c().a()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (d.m) {
            d.h();
        }
        final float n2 = (float)this.c.getScrollX();
        a = -n;
        final long eventTime = motionEvent2.getEventTime();
        this.c.j.c();
        this.c.j.b();
        this.c.j.a();
        int n3;
        if (Math.abs(a) > 15000.0f) {
            n3 = 4;
            n = 0.1f;
        }
        else {
            njo.i(true, "absMaxVelocity %s must be non-negative", 1300.0f);
            a = ModeSwitcher.a(a, -1300.0f, 1300.0f);
            n3 = 5;
            n = 15.0f;
        }
        if (eventTime - this.b >= 500L) {
            n3 = 6;
        }
        final float n4 = (float)this.c.c.getWidth();
        final float n5 = (float)this.c.getWidth();
        float n6 = n4 - n5;
        if (n6 < 0.0f) {
            ModeSwitcher.a.c().E(2858).G(n4, n5);
            n6 = 0.0f;
        }
        final ack d2 = new ack(new acm(ModeSwitcher.a(n2, 0.0f, n6)));
        d2.o = 0.0f;
        d2.n = n6;
        d2.q.a = n * -4.2f;
        d2.h = a;
        final iqp iqp = new iqp(this);
        if (!d2.m) {
            if (!d2.p.contains(iqp)) {
                d2.p.add(iqp);
            }
            d2.g(new iqo(this, n3));
            (this.d = d2).e();
            return true;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        final nsd a = ModeSwitcher.a;
        final jbm b = this.c.b();
        final ModeSwitcher c = this.c;
        if (c.k != b) {
            c.k = b;
            jdj.e((View)c);
            c.c.d(b);
        }
        return false;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final nsd a = ModeSwitcher.a;
        final ModeSwitcher c = this.c;
        if (!c.f) {
            return true;
        }
        if (c.d.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        final jbm b = this.c.b();
        this.c.getScrollX();
        this.c.getScrollY();
        if (this.c.h != null && this.a != jbm.a) {
            this.c.h.W(6, this.a.toString(), b.toString());
        }
        this.c.h(b);
        this.a = jbm.a;
        this.b = 0L;
        this.a(false);
        return true;
    }
}
